package controlador;

import java.util.HashMap;

import modelo.Pergunta;
import persistencia.PerguntaDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;


public class PerguntasControlador implements TemplateViewRoute {

	PerguntaDAO dao = new PerguntaDAO();
	Pergunta pergunta= new Pergunta();
	
	@Override
	public ModelAndView handle(Request req, Response resp) {
		
		int ano = req.session().attribute("ano");
		String nivel = req.session().attribute("nivel");
		int numero = req.session().attribute("numero");
		pergunta = dao.busca(ano, nivel, numero);
		
		HashMap mapa = new HashMap();
		
		mapa.put("pergunta", pergunta);
		System.out.println(numero);
		
		return new ModelAndView(mapa, "pergunta.html");
	}

}
