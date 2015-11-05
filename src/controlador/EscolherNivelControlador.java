package controlador;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class EscolherNivelControlador implements TemplateViewRoute{

	@Override
	public ModelAndView handle(Request req, Response resp) {
		
		int ano = Integer.parseInt(req.params("ano"));
		String nivel = req.params("nivel");
		int numero=1;
		req.session().attribute("numero", numero);
	
		req.session().attribute("ano", ano);
		req.session().attribute("nivel", nivel);
		
		resp.redirect("/pergunta/1");
		
		return null;
	}

}
