package persistencia;
import java.io.IOException;
import java.util.ArrayList;

public interface DAO <T> {
	
	//met�do para salvar:
	public void save (T object);
	
	//met�do para excluir:
	public void delete (T object); 

	//encontra todos:
	public ArrayList<T> findAll(); //ctr+shift+o importa rapidamente. 

}
