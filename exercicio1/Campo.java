package exercicio1;

public abstract class Campo {
    
    private String conteudo;
    private Validador validador;
            
    public Campo(Validador validador) {
        this.validador = validador;
    }
    
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }    

    public String getConteudo() {
        return conteudo;
    }
    
    public void validar(Usuario usuario)  {
        validador.validar(this, usuario);
    }
    
}
