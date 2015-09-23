package persistencia;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Usuario;

public class UsuarioDAO implements DAO<Usuario> {
	
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
}
