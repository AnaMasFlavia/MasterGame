package controlador;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class Concluido implements TemplateViewRoute{

	@Override
	public ModelAndView handle(Request req, Response resp) {
		
		return new ModelAndView(null,"concluido.html");
	}

	//M�todo que confirma, se n�o existe um usuario com o msm login, ele vai poder entrar, caso contrario n�o entrar�
	

}
