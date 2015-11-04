package controlador;

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
		dao.save(usuario);
	
<<<<<<< HEAD
		resp.redirect("/concluido");
		
		return new ModelAndView(null,"concluido.html");
=======
		resp.redirect("/cadastra");
		
		return new ModelAndView(null,"teste.html");
>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
	}

}
