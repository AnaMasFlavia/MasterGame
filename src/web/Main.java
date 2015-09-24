package web;

import modelo.Usuario;
import controlador.Concluido;
import controlador.ControladorCadastro;
import controlador.ListaControlador;
import controlador.PaginaInicialControlador;
import controlador.SalvaControlador;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

public class Main {
	public static void main(String[] args) {
		//precisa de um package static.
		 //onde ficam os css, js, imgs, cont�udo fixo.
		 Spark.staticFileLocation("/publico");
		 
		 //precisa de um package apresenta��o (views).
		 //onde ficam os HTML's.
		 MustacheTemplateEngine engine = new MustacheTemplateEngine("apresentacao"); //respons�vel pelo HTML. 
		 
		 PaginaInicialControlador home = new PaginaInicialControlador();
		 ControladorCadastro ControladorCadastro = new ControladorCadastro();
		 SalvaControlador salvaControlador = new SalvaControlador();
		 ListaControlador listaControlador = new ListaControlador();
		 Concluido concluido = new Concluido();
		 
		  //get ou post (get quando vai ler informa��es; post para submeter informa��es). -rotas
		 Spark.get("/",home,engine); 
		 Spark.get("/",ControladorCadastro,engine); //abrir o form.
		 Spark.post("/salva",salvaControlador,engine); //submiss�o do form.
		 Spark.get("/concluido", concluido,engine);
		 Spark.get("/lista", listaControlador, engine);
		  

	}
}
