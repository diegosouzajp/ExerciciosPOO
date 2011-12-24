package exercicio1;

public class Formulario {
    
    private Campo campo;
    private Usuario usuario;
    
    public void novoUsuario() {
        usuario = new Usuario();
    }
    
    public Campo getCampo() {
        return campo;
    }

    public void setCampo(Campo campo) {
        this.campo = campo;
    }

    public Usuario getUsuario() {
        return usuario;
    }    

}