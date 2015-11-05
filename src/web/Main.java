package web;

import modelo.Usuario;
import controlador.CadastroControlador;
import controlador.Concluido;
<<<<<<< HEAD
import controlador.EscolherNivelControlador;
import controlador.ListaControlador;
import controlador.NiveisControlador;
=======
import controlador.ControladorCadastro;
<<<<<<< HEAD
import controlador.ListaControlador;
import controlador.LoginControlador;
=======
>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
>>>>>>> c6988d69c8892e77244d3d60f20c565f3884491f
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
		 
<<<<<<< HEAD
		SalvaControlador salvaControlador = new SalvaControlador();
	    Concluido concluido = new Concluido();
	    ListaControlador listaControlador = new ListaControlador();
	    
	    CadastroControlador cadastroControlador = new CadastroControlador();

	    PaginaInicialControlador paginaInicial = new PaginaInicialControlador();
=======
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
>>>>>>> c6988d69c8892e77244d3d60f20c565f3884491f
	
		Spark.get("/home", paginaInicial, engine);
		 
		Spark.post("/salvo",salvaControlador,engine); //submissão do form.
		Spark.get("/concluido", concluido,engine);
		Spark.post("/cadastra", cadastroControlador,engine);
<<<<<<< HEAD
		Spark.get("/lista", listaControlador, engine);
		
		NiveisControlador niveisControlador = new NiveisControlador();
		
		Spark.get("/niveis", niveisControlador, engine);
		
		EscolherNivelControlador escolherNivelControlador = new EscolherNivelControlador();
		
		Spark.get("/escolhe/:ano/:nivel", escolherNivelControlador,engine);
		
		PerguntasControlador perguntasControlador = new PerguntasControlador();
		
		Spark.get("/pergunta/:numero", perguntasControlador, engine);
		
		RespostasControlador respostasControlador = new RespostasControlador();
		
		Spark.post("/enviarRespostas", respostasControlador, engine);
		
=======
>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
>>>>>>> c6988d69c8892e77244d3d60f20c565f3884491f
		

	}
		
		
<<<<<<< HEAD
}
=======
}
>>>>>>> c6988d69c8892e77244d3d60f20c565f3884491f
