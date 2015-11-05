package modelo;

import java.io.File;
import java.io.FileWriter;

public class Usuario {
	public String login;
	public String senha;
	public String email;
	public int matricula;
	public Usuario(int n,String l, String s , String e){
		login = l;
		senha = s;
		email = e;
		matricula=n;
	}
	
	public Usuario(){
		login = null;
		senha=null;
		email=null;
		matricula=0;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (matricula != other.matricula)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + ", email="
				+ email + ", matricula=" + matricula + "]";
	}
	public String toCSV() {
		StringBuilder builder = new StringBuilder();
		builder.append(matricula);
		builder.append(";");
		builder.append(login);
		builder.append(";");
		builder.append(email);
		builder.append(";");
		builder.append(senha);
		return builder.toString();
	}


	public void fromCSV(String row) {
		String[] columns = row.split(";");
		this.setMatricula(Integer.parseInt(columns[0]));
		this.setLogin(columns[1]);
		this.setEmail(columns[2]);
		this.setSenha(columns[3]);

	}

}