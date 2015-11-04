package controlador;

import modelo.Usuario;
import persistencia.UsuarioDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class SalvaControlador implements TemplateViewRoute{
	private UsuarioDAO dao = new UsuarioDAO();

	public ModelAndView handle(Request req, Response resp) {
		Usuario usuario = new Usuario();
		usuario.setMatricula(req.queryMap("numero").integerValue());
		usuario.setLogin(req.queryMap("login").value());
		usuario.setEmail(req.queryMap("email").value());
		usuario.setSenha(req.queryMap("senha").value());
		dao.save(usuario);
		resp.redirect("/concluido");
<<<<<<< HEAD
		return new ModelAndView(null,"teste.html");
=======
		return new ModelAndView(null,"salvando.html");
>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
	}
}
