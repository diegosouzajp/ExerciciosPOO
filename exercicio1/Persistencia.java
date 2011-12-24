package exercicio1;

import java.util.List;
import java.util.LinkedList;

public class Persistencia {
    
    private static Persistencia persistencia;    
    private List<Usuario> usuarios;
    
    private Persistencia() {
        usuarios = new LinkedList<Usuario>();
    }
    
    public static Persistencia inicializar() {
        if(persistencia == null)
            persistencia = new Persistencia();
        return persistencia;
    }
    
    public void salvarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }    
    
}
