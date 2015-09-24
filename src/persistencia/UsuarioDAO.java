package persistencia;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Usuario;

public class UsuarioDAO implements DAO<Usuario> {
	ArrayList<Usuario> lista = new ArrayList<Usuario>();

	public void save(Usuario u) {
		try {
			File file = new File(u.getNumero() + ".csv");
			FileWriter arq = new FileWriter(file, true);
			arq.append(u.toCSV() + "\n");
			arq.flush();
			arq.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Usuario load(int numero) {
		try {
			File arq = new File("usuarios/" + numero + ".csv");

			if (!arq.exists())
				return null;

			Scanner scan = new Scanner(arq);
			String linha = scan.nextLine();
			String[] colunas = linha.split(";");

			Usuario f = new Usuario();
			f.setNumero(numero);
			f.setLogin(colunas[1]);
			f.setEmail(colunas[2]);
			f.setSenha(colunas[3]);
			return f;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

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
				f.setNumero(Integer.parseInt(colunas[0]));
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
