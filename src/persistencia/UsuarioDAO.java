package persistencia;

import java.io.File;
<<<<<<< HEAD
import java.io.FileNotFoundException;
=======
>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Usuario;

public class UsuarioDAO implements DAO<Usuario> {
	ArrayList<Usuario> filme = new ArrayList();
	
<<<<<<< HEAD
	Usuario usuario = new Usuario();

	public void fromCSV(String row) {
		String[] columns = row.split(";");
		usuario.setMatricula(Integer.parseInt(columns[0]));
		usuario.setLogin(columns[1]);
		usuario.setEmail(columns[2]);
		usuario.setSenha(columns[3]);
	}
	
	public void save(Usuario object) {
		try {
			File u = new File("src/usuarios.csv");
=======
	public void save(Usuario object) {
		try {
			File u = new File("src/apresentacao/usuarios.csv");
>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
			FileWriter arq = new FileWriter(u, true);

			arq.append(object.toCSV() + "\n");
			arq.flush();
			arq.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
<<<<<<< HEAD
	
	public boolean findByLogin(Usuario us){
		File arquivo = new File("src/" + us + ".csv");
		if ( ! arquivo.exists()) { 
			
			return false;
		}
		try {
			Scanner scan = new Scanner(arquivo);
			while(scan.hasNextLine()) {
				String row = scan.nextLine();
				fromCSV(row);
			}
			scan.close();

			if(us.getLogin() == usuario.getLogin()) {
				return true;
			}
			return false;
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return true;
	}
		//Método que avalia se existe um login existente, caso exista retorna usuario
	
	public ArrayList<Usuario> findAll() {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
			try {
				File dir = new File("");
				File[] arqs = dir.listFiles();
			for (File arq : arqs) {
				Scanner scan = new Scanner(arq);
				String linha = scan.nextLine();
				String[] colunas = linha.split(";");
				Usuario f = new Usuario();
				f.setMatricula(Integer.parseInt(colunas[0]));
				f.setLogin(colunas[1]);
				f.setEmail(colunas[2]);
				f.setSenha(colunas[3]);
				scan.close(); 
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				return lista; // tá salvando em um arquivo só
			}
		
	}

=======
		

}
>>>>>>> cc4365e07a7a231b8c1b0d94a570dc2986ff2d18
