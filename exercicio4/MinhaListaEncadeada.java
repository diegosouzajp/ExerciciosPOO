package exercicio4;

public class MinhaListaEncadeada implements ListaEncadeada {
    
    private Nodo cabeca;
    private Nodo cauda;
    private int tamanho;

    @Override
    public void add(Object objeto) {
        if(cabeca == null)
            cabeca = new Nodo(objeto);
        else if(cauda == null) {
            cauda = new Nodo(objeto);
            cabeca.setProximo(cauda);
        } else {
            cauda.setProximo(new Nodo(objeto));
            cauda = cauda.getProximo();
        } 
        tamanho++;
    }

    public Nodo getCabeca() {
        return cabeca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public Iterador getIterador() {
        return new MinhaListaEncadeadaIterador(this);
    }    
    
}
