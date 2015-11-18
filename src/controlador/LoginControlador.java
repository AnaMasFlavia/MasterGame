package controlador;


import java.io.File;

import modelo.Usuario;
import persistencia.UsuarioDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class LoginControlador implements TemplateViewRoute {

	@Override
	public ModelAndView handle(Request req, Response resp) {
		Usuario usuario = new Usuario();
		UsuarioDAO dao = new UsuarioDAO();	
		usuario.setLogin(req.queryMap("login").value().trim());
		usuario.setSenha(req.queryMap("senha").value().trim());
		
		File file = new File("usuarios/" + usuario.getLogin() + ".csv");
			if(! file.exists()){
				resp.redirect("/erroEntrar");
				return null;
			}
			Usuario usuario2 = new Usuario();
			usuario2 = dao.load(usuario.getLogin()); 
			if (usuario.getSenha().equals(usuario2.getSenha())){
				req.session().attribute("/niveis", usuario);
				resp.redirect("/niveis");
				}

			
		
		resp.redirect("/erroEntrar");
		return null;
	


	}

}
