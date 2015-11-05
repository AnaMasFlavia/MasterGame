package web;

import modelo.Usuario;
import controlador.CadastroControlador;
import controlador.Concluido;
import controlador.EscolherNivelControlador;
import controlador.ListaControlador;
import controlador.NiveisControlador;
import controlador.PaginaInicialControlador;
import controlador.PerguntasControlador;
import controlador.RespostasControlador;
import controlador.SalvaControlador;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

public class Main {
	public static void main(String[] args) {
		//precisa de um package static.
		 //onde ficam os css, js, imgs, contéudo fixo.
		 Spark.staticFileLocation("/publico");
		 
		 //precisa de um package apresentação (views).
		 //onde ficam os HTML's.
		 MustacheTemplateEngine engine = new MustacheTemplateEngine("apresentacao"); //responsável pelo HTML. 
		 
		SalvaControlador salvaControlador = new SalvaControlador();
	    Concluido concluido = new Concluido();
	    ListaControlador listaControlador = new ListaControlador();
	    
	    CadastroControlador cadastroControlador = new CadastroControlador();

	    PaginaInicialControlador paginaInicial = new PaginaInicialControlador();
	
		Spark.get("/home", paginaInicial, engine);
		 
		Spark.post("/salvo",salvaControlador,engine); //submissão do form.
		Spark.get("/concluido", concluido,engine);
		Spark.post("/cadastra", cadastroControlador,engine);
		Spark.get("/lista", listaControlador, engine);
		
		NiveisControlador niveisControlador = new NiveisControlador();
		
		Spark.get("/niveis", niveisControlador, engine);
		
		EscolherNivelControlador escolherNivelControlador = new EscolherNivelControlador();
		
		Spark.get("/escolhe/:ano/:nivel", escolherNivelControlador,engine);
		
		PerguntasControlador perguntasControlador = new PerguntasControlador();
		
		Spark.get("/pergunta/:numero", perguntasControlador, engine);
		
		RespostasControlador respostasControlador = new RespostasControlador();
		
		Spark.post("/enviarRespostas", respostasControlador, engine);
		
		

	}
		
		
}