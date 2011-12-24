package exercicio3;

public abstract class Sanduiche implements Produto {
    
    private String descricao;
    private float custo;

    @Override
    public float calcularPreco() {
        return custo;
    }
    
    @Override
    public void setPreco(float custo) {
        this.custo = custo;
    }
    
    public float getCusto() {
        return custo;
    }        
}
