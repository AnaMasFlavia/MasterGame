package persistencia;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Usuario;

public class UsuarioDAO implements DAO<Usuario> {
	ArrayList<Usuario> filme = new ArrayList();
	
	public void save(Usuario object) {
		try {
			File u = new File("usuarios.csv");
			FileWriter arq = new FileWriter(u, true);

			arq.append(object.toCSV() + "\n");
			arq.flush();
			arq.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		public void delete(Usuario object) {
			try{
				File arq = new File ("usuarios/"+object.getNumero()+".csv");
				//se o arquivo não existe não continua.
				if (! arq.exists()) return;
				//exclui o arquivo.
				arq.delete();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		
		public ArrayList<Usuario> findAll() {
			ArrayList<Usuario> lista= new ArrayList();
			try{
				File dir = new File("Usuarios");
				File[] arqs = dir.listFiles();
				for (File arq: arqs){
					Scanner scan = new Scanner(arq);
					String linha = scan.nextLine();
					String [] colunas = linha.split(",");
					Usuario f = new Usuario();
					f.setNumero(Integer.parseInt(colunas[0]));
					f.setLogin(colunas[1]);
					f.setEmail(colunas[2]);
					f.setSenha(colunas[3]);
				}
			} catch (Exception e){
				e.printStackTrace();
			}
			return lista;
		}

}
