package controlador;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
<<<<<<< HEAD
=======
import spark.Route;
>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
import spark.TemplateViewRoute;

public class Concluido implements TemplateViewRoute{

	@Override
	public ModelAndView handle(Request req, Response resp) {
		
<<<<<<< HEAD
		return new ModelAndView(null,"concluido.html");
	}

	//M�todo que confirma, se n�o existe um usuario com o msm login, ele vai poder entrar, caso contrario n�o entrar�
=======
		
		return new ModelAndView(null,"concluido.html");
	}

>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
	

}
