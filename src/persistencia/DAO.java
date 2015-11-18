package persistencia;
import java.util.ArrayList;

public interface DAO <T> {
	
	//metódo para salvar:
	public void save (T object);

	//encontra todos:
	public ArrayList<T> findAll(); //ctr+shift+o importa rapidamente. 

}
