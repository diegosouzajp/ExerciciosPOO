package exercicio2;

public abstract class Campo {
    
    private String conteudo;

    public Campo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
}
