
package dao;

import java.util.List;
import modelo.Caneta;

public interface CanetaDAO {

    public int inserir(Caneta caneta);
    public int editar(Caneta caneta);
    public int apagar(int id);
    public List<Caneta> listar();
    public Caneta listar(int id);
}
