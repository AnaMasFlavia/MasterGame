package controlador;

import modelo.Usuario;
import persistencia.UsuarioDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.TemplateViewRoute;

public class Concluido implements TemplateViewRoute{

	@Override
	public ModelAndView handle(Request req, Response resp) {
		UsuarioDAO dao = new UsuarioDAO();
		String login = req.session().attribute("login");
		boolean usuario = dao.findByLogin(login);
		System.out.println(usuario);
		System.out.println(login);
		if (usuario == false){
			return new ModelAndView(null,"concluido.html");
		}
		return null;
		
	}

	//Método que confirma, se não existe um usuario com o msm login, ele vai poder entrar, caso contrario não entrará
	

}
