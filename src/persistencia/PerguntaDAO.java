package persistencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import modelo.Pergunta;

public class PerguntaDAO {
	Pergunta p = new Pergunta();

	public Pergunta busca(int ano, String nivel, int numero) {
		File arquivo = new File("Perguntas/" + ano + "/" + nivel + "/" + numero + ".csv");
		  if ( ! arquivo.exists()) { 
		   return null;
		  }
		  
		  try {
			   Scanner scan = new Scanner(arquivo);
			   while(scan.hasNextLine()) {
			    String row = scan.nextLine();
			    p = fromCSV(row);
			   }
			   scan.close();
			    
			  } catch (FileNotFoundException e) {
			   e.printStackTrace();
			  }
			  return p;
			 }
			
			 public Pergunta fromCSV(String row) {
			  String[] columns = row.split(";");
			  
			  p.setPergunta(columns[0]);
			  p.setResposta1(columns[1]);
			  p.setResposta2(columns[2]);
			  p.setResposta3(columns[3]);
			  p.setResposta4(columns[4]);
			  
			 switch (Integer.parseInt(columns[5])){
			 
			 case 1:
				 p.setRespostaCerta(columns[1]);
				 break;
			 case 2:
				 p.setRespostaCerta(columns[2]);
				 break;
			 case 3:
				 p.setRespostaCerta(columns[3]);
				 break;
			 case 4:
				 p.setRespostaCerta(columns[4]);
				 break;
				
			 }
			  return p;
			 }

}
