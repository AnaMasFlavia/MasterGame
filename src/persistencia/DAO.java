package persistencia;
import java.io.IOException;
import java.util.ArrayList;

public interface DAO <T> {
	
	//metódo para salvar:
	public void save (T object);
	
}
