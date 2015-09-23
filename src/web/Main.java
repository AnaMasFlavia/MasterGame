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
		 //onde ficam os css, js, imgs, contéudo fixo.
		 Spark.staticFileLocation("/publico");
		 
		 //precisa de um package apresentação (views).
		 //onde ficam os HTML's.
		 MustacheTemplateEngine engine = new MustacheTemplateEngine("apresentacao"); //responsável pelo HTML. 
		 
		ControladorCadastro ControladorCadastro = new ControladorCadastro();
		 SalvaControlador salvaControlador = new SalvaControlador();
		 Concluido concluido = new Concluido();
		 
		  //get ou post (get quando vai ler informações; post para submeter informações). -rotas
		  Spark.get("/cadastro",ControladorCadastro,engine); //abrir o form.
		  Spark.post("/salvo",salvaControlador,engine); //submissão do form.
		  Spark.get("/concluido", concluido,engine);

	}
}
