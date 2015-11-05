package persistencia;
import java.io.IOException;
import java.util.ArrayList;

public interface DAO <T> {
	
	//met�do para salvar:
	public void save (T object)throws IOException ;
	

	public ArrayList<T> findAll();
	

}
