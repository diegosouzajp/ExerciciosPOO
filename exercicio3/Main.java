package exercicio3;

public class Main {
    
    public static void main(String[] args) {
        Produto sanduiche = new CheeseTudo();
        sanduiche.setPreco(5.00f);
        
        Produto batata = new BatataFrita(sanduiche);
        batata.setPreco(1.50f);
        
        Produto refrigerante = new Refrigerante(batata);
        refrigerante.setPreco(2.00f);
        
        Produto bacon = new Bacon(refrigerante);
        bacon.setPreco(0.80f);
        
        bacon = new Bacon(bacon);
        bacon.setPreco(0.80f);
        
        System.out.println(((Produto)bacon).getDescricao());
        System.out.printf("R$ %.2f\n\n", ((Produto)bacon).calcularPreco());
        
        Produto sanduiche2 = new Hamburguer();
        sanduiche2.setPreco(2.50f);
        
        Produto batata2 = new BatataFrita(sanduiche2);
        batata2.setPreco(1.50f);
        
        Produto refrigerante2 = new Refrigerante(batata2);
        refrigerante2.setPreco(2.00f);
        
        Produto bacon2 = new Bacon(refrigerante2);
        bacon2.setPreco(0.80f);
        
        System.out.println(((Produto)bacon2).getDescricao());
        System.out.printf("R$ %.2f\n\n", ((Produto)bacon2).calcularPreco());
        
    }
    
}
