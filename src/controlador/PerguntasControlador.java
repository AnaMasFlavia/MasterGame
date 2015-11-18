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
		int numero = Integer.parseInt(req.params("numero"));
		int ct = 0;
		if(req.session(true).attribute("acertos") == null){
			req.session().attribute("acertos", 0);
		} else {
			ct = req.session().attribute("acertos");
		}
		pergunta = dao.busca(ano, nivel, numero);
		
		HashMap mapa = new HashMap();
		
		mapa.put("pergunta", pergunta);
		mapa.put("numero",numero);		
		if (numero>5){
			if (ct>=3){
				return new ModelAndView(mapa,"ganhador.html");
			}else{
				return new ModelAndView(mapa,"perdedor.html");
			}
		}
		return new ModelAndView(mapa, "pergunta.html");
	}

}
