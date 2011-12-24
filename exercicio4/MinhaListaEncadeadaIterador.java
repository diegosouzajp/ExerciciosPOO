package exercicio4;

public class MinhaListaEncadeadaIterador implements Iterador {
    
    private MinhaListaEncadeada lista;
    private Nodo noAtual;
    private int posicao;

    public MinhaListaEncadeadaIterador(MinhaListaEncadeada lista) {
        this.lista = lista;
        noAtual = lista.getCabeca();
    }    

    @Override
    public boolean temProximo() {
        return posicao < lista.getTamanho() && noAtual != null;
    }

    @Override
    public Object proximo() {
        Nodo noAux = noAtual;
        noAtual = noAtual.getProximo();
        posicao++;
        return noAux.getConteudo();
    }
    
}
