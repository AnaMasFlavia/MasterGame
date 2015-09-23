package controlador;

import persistencia.UsuarioDAO;

import modelo.Usuario;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class ControladorCadastro implements TemplateViewRoute {

	@Override
	public ModelAndView handle(Request req, Response resp) {
	
		return new ModelAndView(null, "usuario_login.html");
	}

}
