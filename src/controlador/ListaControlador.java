package controlador;

import java.util.ArrayList;
import java.util.HashMap;

import persistencia.UsuarioDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;
import modelo.Usuario;

public class ListaControlador implements TemplateViewRoute {
	
	private UsuarioDAO dao = new UsuarioDAO();

	@Override
	public ModelAndView handle(Request req, Response resp) {
		ArrayList<Usuario> usuario = dao.findAll(); //varíavel html.
		HashMap dados = new HashMap();
		dados.put("usuario", usuario);
		return new ModelAndView(dados, "usuario_lista.html");
		}
	}
