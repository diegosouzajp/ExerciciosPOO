package exercicio3;

public class Refrigerante extends Decorator {
    
    public Refrigerante() {
        
    }

    public Refrigerante(Produto produto) {
        super(produto);
    }

    @Override
    public String getDescricao() {
        return produto.getDescricao() + ", refrigerante";
    }
    
    
    
}
