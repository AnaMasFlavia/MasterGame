package controlador;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class VitoriaControlador implements TemplateViewRoute{

	@Override
	public ModelAndView handle(Request arg0, Response arg1) {
		return new ModelAndView(null, "ganhador.html");
	}
	

}
