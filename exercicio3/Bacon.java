package exercicio3;

public class Bacon extends Decorator {

    public Bacon(Produto produto) {
        super(produto);
    }

    @Override
    public String getDescricao() {
        return produto.getDescricao() + ", bacon";
    }
    
}
