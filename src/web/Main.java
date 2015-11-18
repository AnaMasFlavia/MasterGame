package web;

import modelo.Usuario;
import controlador.CadastroControlador;
import controlador.ErroEntrarControlador;
import controlador.ErroLoginControlador;
import controlador.ListaControlador;
import controlador.EscolherNivelControlador;
import controlador.NiveisControlador;
import controlador.LoginControlador;
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

	    PaginaInicialControlador paginaInicial = new PaginaInicialControlador();
		SalvaControlador salvaControlador = new SalvaControlador();
	    CadastroControlador cadastroControlador = new CadastroControlador();
	    LoginControlador loginControlador = new LoginControlador();
	    ErroEntrarControlador erroEntrarControlador = new ErroEntrarControlador();
	    ErroLoginControlador erroLoginControlador = new ErroLoginControlador();
	
		Spark.get("/home", paginaInicial, engine);
		Spark.post("/cadastra", cadastroControlador,engine);
		
		Spark.get("/erroEntrar", erroEntrarControlador,engine);
		
		Spark.post("/login",loginControlador,engine);
		
		Spark.get("erroLogin", erroLoginControlador,engine);
		
		Spark.post("/salvo",salvaControlador,engine); //submissão do form.
		
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

