package controlador;

import java.io.IOException;

import persistencia.UsuarioDAO;
import modelo.Usuario;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class CadastroControlador implements TemplateViewRoute {
	private UsuarioDAO dao = new UsuarioDAO();

	@Override
	public ModelAndView handle(Request req, Response resp) {
		Usuario usuario = new Usuario();
		usuario.setMatricula(req.queryMap("matricula").integerValue());
		usuario.setLogin(req.queryMap("login").value());
		usuario.setEmail(req.queryMap("email").value());
		usuario.setSenha(req.queryMap("senha").value());
		req.session().attribute("login", req.queryMap("login").value());
		
		
			UsuarioDAO dao = new UsuarioDAO();
			//String login = req.session().attribute("login");
			boolean usuarioExiste = dao.existeLogin(usuario.getLogin());
			System.out.println(usuarioExiste);
			if (usuarioExiste == true){
				return  new ModelAndView(null,"erro_login.html");	
			} else{
				dao.save(usuario);
				return new ModelAndView(null,"concluido.html");
			}
			
		

	}

}
