package controlador;

import java.util.ArrayList;
import java.util.HashMap;

import modelo.Usuario;
import persistencia.UsuarioDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class ListaControlador implements TemplateViewRoute {

	private UsuarioDAO dao = new UsuarioDAO();

	public ModelAndView handle(Request req, Response resp) {
		ArrayList<Usuario> usuario = dao.findAll(); //varíavel html.
		HashMap dados = new HashMap();
		dados.put("usuario", usuario);
		return new ModelAndView(dados, "usuario_lista.html");
	}

}
