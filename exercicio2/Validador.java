package exercicio2;

public abstract class Validador implements Formulario {
    
    private Formulario formulario;
    private Campo campo;
    
    public Validador(Campo campo, Formulario formulario) {
        this.campo = campo;
        this.formulario = formulario;
    }
    
    @Override
    public void validarFormulario(Usuario usuario) {
        validarCampo(usuario);
        getFormulario().validarCampo(usuario);
        
    }    

    public Campo getCampo() {
        return campo;
    }

    public Formulario getFormulario() {
        return formulario;
    }
    
}
