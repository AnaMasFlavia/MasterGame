package controlador;

import java.util.HashMap;

import modelo.Pergunta;
import persistencia.PerguntaDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class RespostasControlador implements TemplateViewRoute {

	public ModelAndView handle(Request req, Response resp) {
		int ct=0;
		int ano = req.session().attribute("ano");
		String nivel = req.session().attribute("nivel");
		int numero =req.session().attribute("numero");
		
		PerguntaDAO dao = new PerguntaDAO();
		Pergunta pergunta = dao.busca(ano, nivel, numero);
		
		String respostaCerta = pergunta.getRespostaCerta();
		String respostaUsuario = req.queryParams("resposta");
		

		if (respostaCerta.equals(respostaUsuario)){
			ct++;
			numero++;
			req.session().attribute("numero", numero);
			req.session().attribute("acertos", ct);
			resp.redirect("/pergunta/"+numero);
		}else{
			HashMap mapa = new HashMap();
			mapa.put("respostaCerta", respostaCerta);
			return new ModelAndView(mapa,"respostaCerta.html");
			
		}

		return null;
	}

}
