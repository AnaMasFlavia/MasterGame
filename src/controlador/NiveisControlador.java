package controlador;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class NiveisControlador implements TemplateViewRoute{

	public ModelAndView handle(Request req, Response resp) {
		return new ModelAndView(null, "niveis.html");
	}

}
