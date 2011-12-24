package exercicio3;

public abstract class Decorator implements Produto {
    
    protected Produto produto;
    protected String descricao;
    protected float custo;

    public Decorator() {
    }
        
    public Decorator(Produto produto) {
        this.produto = produto;
    }

    @Override
    public float calcularPreco() {
        return custo + produto.calcularPreco();
    }
    
    @Override
    public void setPreco(float custo) {
        this.custo = custo;
    }    
    
}
