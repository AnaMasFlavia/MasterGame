package controlador;

import java.io.IOException;

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
<<<<<<< HEAD
		usuario.setNumero(req.queryMap("numero").integerValue());
=======
		usuario.setMatricula(req.queryMap("numero").integerValue());
>>>>>>> c6988d69c8892e77244d3d60f20c565f3884491f
		usuario.setLogin(req.queryMap("login").value());
		usuario.setEmail(req.queryMap("email").value());
		usuario.setSenha(req.queryMap("senha").value());
		try {
			dao.save(usuario);
		} catch (IOException e) {
			e.printStackTrace();
		}
		resp.redirect("/concluido");
<<<<<<< HEAD
		return new ModelAndView(null,"teste.html");
=======
<<<<<<< HEAD
		return new ModelAndView(null,"salvando.html");
=======
<<<<<<< HEAD
		return new ModelAndView(null,"teste.html");
=======
		return new ModelAndView(null,"salvando.html");
>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
>>>>>>> c6988d69c8892e77244d3d60f20c565f3884491f
>>>>>>> 8f1b020371f8a1c6b3c38ea955e59a4407eb1775
	}
}
