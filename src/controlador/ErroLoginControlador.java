package controlador;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class ErroLoginControlador implements TemplateViewRoute{

	@Override
	public ModelAndView handle(Request req, Response resp) {
		return new ModelAndView(null,"erro_login.html");
	}

}
