package controlador;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.TemplateViewRoute;

public class Concluido implements TemplateViewRoute{

	@Override
	public ModelAndView handle(Request req, Response resp) {
		
		
		return new ModelAndView(null,"concluido.html");
	}

	

}
