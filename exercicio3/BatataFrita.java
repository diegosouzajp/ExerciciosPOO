package exercicio3;

public class BatataFrita extends Decorator {

    public BatataFrita(Produto produto) {
        super(produto);
    }

    @Override
    public String getDescricao() {
        return produto.getDescricao() + ", batata frita";
    }
    
    

}
