package persistencia;
import java.util.ArrayList;

public interface DAO <T> {
	
	//met�do para salvar:
	public void save (T object);

	//encontra todos:
	public ArrayList<T> findAll(); //ctr+shift+o importa rapidamente. 

}
