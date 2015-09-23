package web;

import modelo.Usuario;
import controlador.Concluido;
import controlador.ControladorCadastro;
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
		 
		ControladorCadastro ControladorCadastro = new ControladorCadastro();
		 SalvaControlador salvaControlador = new SalvaControlador();
		 Concluido concluido = new Concluido();
		 
		  //get ou post (get quando vai ler informa��es; post para submeter informa��es). -rotas
		  Spark.get("/cadastro",ControladorCadastro,engine); //abrir o form.
		  Spark.post("/salvo",salvaControlador,engine); //submiss�o do form.
		  Spark.get("/concluido", concluido,engine);

	}
}
