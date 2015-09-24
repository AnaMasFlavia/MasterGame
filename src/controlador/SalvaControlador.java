 package controlador;
 
 import modelo.Usuario;
 import persistencia.UsuarioDAO;
 import spark.ModelAndView;
 import spark.Request;
 import spark.Response;
 import spark.TemplateViewRoute;
 
public class SalvaControlador implements TemplateViewRoute{
	private UsuarioDAO dao = new UsuarioDAO();

	public ModelAndView handle(Request req, Response resp) {
		Usuario usuario = new Usuario();
		usuario.setNumero(req.queryMap("numero").integerValue());
 		usuario.setLogin(req.queryMap("login").value());
 		usuario.setEmail(req.queryMap("email").value());
 		usuario.setSenha(req.queryMap("senha").value());
 		dao.save(usuario);
 		resp.redirect("/lista");
 		return null;
 	}
 }