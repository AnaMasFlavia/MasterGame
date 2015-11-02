package web;

import modelo.Usuario;
import controlador.CadastroControlador;
import controlador.Concluido;
import controlador.ControladorCadastro;
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
		 
		ControladorCadastro ControladorCadastro = new ControladorCadastro();
		SalvaControlador salvaControlador = new SalvaControlador();
	    Concluido concluido = new Concluido();
	    
	    CadastroControlador cadastroControlador = new CadastroControlador();

	     PaginaInicialControlador paginaInicial = new PaginaInicialControlador();
	
		Spark.get("/home", paginaInicial, engine);
		 
		Spark.post("/salvo",salvaControlador,engine); //submissão do form.
		Spark.get("/concluido", concluido,engine);
		Spark.post("/cadastra", cadastroControlador,engine);
		

	}
		
		
}
