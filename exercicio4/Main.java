package exercicio4;

public class Main {
    
    public static void main(String[] args) {
        ListaEncadeada lista = new MinhaListaEncadeada();
        
        String[] nomes = {"Daniel", "Diego", "Danieli", "Raquel", "Guilherme"};
        
        for(String s: nomes) 
            lista.add(s);
                
        Iterador iterador = lista.getIterador();
        while(iterador.temProximo())
            System.out.println(iterador.proximo());
        
    }
}
