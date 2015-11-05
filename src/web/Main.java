package web;

import modelo.Usuario;
import controlador.CadastroControlador;
import controlador.Concluido;
import controlador.ListaControlador;
import controlador.LoginControlador;
import controlador.PaginaInicialControlador;
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
	    CadastroControlador cadastroControlador = new CadastroControlador();
	    PaginaInicialControlador paginaInicial = new PaginaInicialControlador();
	    LoginControlador loginControlador = new LoginControlador();
	    ListaControlador listaControlador = new ListaControlador();
	
		Spark.get("/home", paginaInicial, engine);
		Spark.post("/cadastra", cadastroControlador,engine);
		Spark.get("/concluido", concluido,engine);
		
		Spark.post("/login",loginControlador,engine);
		
		
		Spark.post("/salvo",salvaControlador,engine); //submissão do form.
		
		
		

	}
		
		
}
