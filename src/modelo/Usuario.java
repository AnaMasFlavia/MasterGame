package modelo;

import java.io.File;
import java.io.FileWriter;

public class Usuario {
	public String login;
	public String senha;
	public Usuario(String l, String s ){
		login = l;
		senha = s;
	}
	
	public Usuario(){
		login = null;
		senha=null;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha +  "]";
	}
	public String toCSV() {
		StringBuilder builder = new StringBuilder();
		builder.append(login);
		builder.append(";");
		builder.append(senha);
		return builder.toString();
	}


	public void fromCSV(String row) {
		String[] columns = row.split(";");
		this.setLogin(columns[0]);
		this.setSenha(columns[1]);

	}

}