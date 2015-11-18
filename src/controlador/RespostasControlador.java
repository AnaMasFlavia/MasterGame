package controlador;

import java.util.HashMap;

import javax.swing.JOptionPane;

import modelo.Pergunta;
import persistencia.PerguntaDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class RespostasControlador implements TemplateViewRoute {

	public ModelAndView handle(Request req, Response resp) {
		int ct=0;
		if(req.session(true).attribute("acertos") == null){
			req.session().attribute("acertos", 0);
		} else {
			ct = (int) req.session().attribute("acertos");
		}
		int ano = req.session().attribute("ano");
		String nivel = req.session().attribute("nivel");
		int numero = Integer.parseInt(req.queryParams("numero"));
		PerguntaDAO dao = new PerguntaDAO();
		Pergunta pergunta = dao.busca(ano, nivel, numero);
		
		String respostaCerta = pergunta.getRespostaCerta();
		String respostaUsuario = req.queryParams("resposta");
		
		numero++;
		if (respostaCerta.equals(respostaUsuario)){

		req.session().attribute("numero", numero);
		ct++;
		req.session().attribute("acertos", ct);
		
		resp.redirect("/pergunta/"+numero);
		System.out.println(ct);
		}else{
			HashMap mapa = new HashMap();
			mapa.put("respostaCerta", respostaCerta);
			mapa.put("numero", numero);
			ct--;
			req.session().attribute("acertos", ct);
			return new ModelAndView(mapa,"respostaCerta.html");

		}
		return null;
	}

}
