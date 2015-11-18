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
		usuario.setLogin(columns[0]);
		usuario.setSenha(columns[1]);
	}
	
	
	public void save(Usuario u) {
		if(u.getLogin()!=null&&u.getSenha()!=null){
			
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
	
	public Usuario load (String login) {
		File arquivo = new File("usuarios/" + login + ".csv");
		if ( ! arquivo.exists()) { 
			return null;
		}
		
		try {
			Scanner scan = new Scanner(arquivo);
			while(scan.hasNextLine()) {
				String row = scan.nextLine();
				String[] columns = row.split(";");
				usuario.setLogin(columns[0]);
				usuario.setSenha(columns[1]);
			}
			scan.close();

			
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return usuario;
	
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
				f.setLogin(colunas[0]);
				f.setSenha(colunas[1]);
				scan.close(); 
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				return lista;
			}
		
	}

