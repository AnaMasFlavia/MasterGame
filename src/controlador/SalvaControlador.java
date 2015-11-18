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

		usuario.setLogin(req.queryMap("login").value());
		usuario.setSenha(req.queryMap("senha").value());
		try {
			dao.save(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.redirect("/concluido");
		return new ModelAndView(null,"concluido.html");



	}
}
