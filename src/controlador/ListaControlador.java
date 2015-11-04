package controlador;

import java.util.ArrayList;
import java.util.HashMap;

<<<<<<< HEAD
=======
import modelo.Usuario;
>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
import persistencia.UsuarioDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;
<<<<<<< HEAD
import modelo.Usuario;

public class ListaControlador implements TemplateViewRoute {
	
	private UsuarioDAO dao = new UsuarioDAO();

	@Override
=======

public class ListaControlador implements TemplateViewRoute {

	private UsuarioDAO dao = new UsuarioDAO();

>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
	public ModelAndView handle(Request req, Response resp) {
		ArrayList<Usuario> usuario = dao.findAll(); //varíavel html.
		HashMap dados = new HashMap();
		dados.put("usuario", usuario);
		return new ModelAndView(dados, "usuario_lista.html");
<<<<<<< HEAD
		}
	}
=======
	}

}
>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
