package web;

import modelo.Usuario;
import controlador.CadastroControlador;
import controlador.Concluido;
import controlador.ControladorCadastro;
<<<<<<< HEAD
import controlador.ListaControlador;
import controlador.LoginControlador;
=======
>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
import controlador.PaginaInicialControlador;
import controlador.SalvaControlador;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

public class Main {
	public static void main(String[] args) {
		//precisa de um package static.
		 //onde ficam os css, js, imgs, contéudo fixo.
<<<<<<< HEAD
		Spark.staticFileLocation("/publico");
		 
		 //precisa de um package apresentação (views).
		 //onde ficam os HTML's.
		MustacheTemplateEngine engine = new MustacheTemplateEngine("apresentacao"); //responsável pelo HTML. 
=======
		 Spark.staticFileLocation("/publico");
		 
		 //precisa de um package apresentação (views).
		 //onde ficam os HTML's.
		 MustacheTemplateEngine engine = new MustacheTemplateEngine("apresentacao"); //responsável pelo HTML. 
>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
		 
		ControladorCadastro ControladorCadastro = new ControladorCadastro();
		SalvaControlador salvaControlador = new SalvaControlador();
	    Concluido concluido = new Concluido();
<<<<<<< HEAD
	    CadastroControlador cadastroControlador = new CadastroControlador();
	    PaginaInicialControlador paginaInicial = new PaginaInicialControlador();
	    LoginControlador loginControlador = new LoginControlador();
	    ListaControlador listaControlador = new ListaControlador();
	
		Spark.get("/home", paginaInicial, engine);
		Spark.post("/cadastra", cadastroControlador,engine);
		Spark.get("/concluido", concluido,engine);
		
		Spark.post("/login",loginControlador,engine);
		
		
		Spark.post("/salvo",salvaControlador,engine); //submissão do form.
		
		
=======
	    
	    CadastroControlador cadastroControlador = new CadastroControlador();

	     PaginaInicialControlador paginaInicial = new PaginaInicialControlador();
	
		Spark.get("/home", paginaInicial, engine);
		 
		Spark.post("/salvo",salvaControlador,engine); //submissão do form.
		Spark.get("/concluido", concluido,engine);
		Spark.post("/cadastra", cadastroControlador,engine);
>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
		

	}
		
		
}
