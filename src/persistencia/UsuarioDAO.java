package persistencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Usuario;

public class UsuarioDAO implements DAO<Usuario> {
	ArrayList<Usuario> filme = new ArrayList();
	
	Usuario usuario = new Usuario();

	public void fromCSV(String row) {
		String[] columns = row.split(";");
		usuario.setMatricula(Integer.parseInt(columns[0]));
		usuario.setLogin(columns[1]);
		usuario.setEmail(columns[2]);
		usuario.setSenha(columns[3]);
	}
	
	
	public void save(Usuario u) {
		if(u.getLogin()!=null&&u.getEmail()!=null&&u.getMatricula()!=0&&u.getSenha()!=null){
			
			File arq = new File("usuarios");
			
			if(!arq.exists()){
				arq.mkdir();
			}
			
			u.toCSV();
			try{
			File file = new File("usuarios/" + u.getLogin() + ".csv");
			if(file.exists())return;	
			FileWriter writer = new FileWriter(file);
			writer.write(u.toCSV().toString());
			writer.flush();
			writer.close();
			}catch(Exception e ){
				e.printStackTrace();
			}
			
		}
		
	}
	
	public boolean existeLogin(String login){
		File arq = new File("usuarios/" + login + ".csv");
		if (  arq.exists()) { 
			return true;
		}
		return false;
		/*
		try {
			Scanner scan = new Scanner(arq);
			while(scan.hasNextLine()) {
				String verifica = scan.nextLine();
				fromCSV(verifica);
			}
			scan.close();

			if(login.equals(usuario.getLogin())) {
				return true;
			} else {
				return false;
			}
		
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return true;
		*/
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
				return lista;
			}
		
	}

