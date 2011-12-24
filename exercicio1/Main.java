package exercicio1;

import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Facade facade = new Facade(); 
        Scanner scanner = new Scanner(System.in);
        String opcao;
        
        while(true) {
            System.out.println("\n---- Sistema de cadastro ----");
            System.out.println("  [1] Cadastrar");
            System.out.println("  [2] Listar itens cadastrados");
            System.out.println("  [0] Sair");
            
            opcao = scanner.next();
           
            if("0".equals(opcao)) {
                System.out.println("Até logo!");
                break;
            }
            else if("1".equals(opcao)) {
                while(true) {    
                    System.out.println("\n---- Cadastro de Usuario ----");
                    facade.novoUsuario();
                    scanner.nextLine();

                    while(true) {
                        System.out.print("Nome: ");
                        try {
                            facade.preencherNome(scanner.nextLine());
                        } catch(ValidacaoException exception) {
                            System.out.println(exception.getMessage());
                            continue;
                        }
                        System.out.println("OK");
                        break;
                    }
                    while(true) {
                        System.out.print("Email: ");
                        try {
                            facade.preencherEmail(scanner.nextLine());
                        } catch(ValidacaoException exception) {
                            System.out.println(exception.getMessage());
                            continue;
                        }
                        System.out.println("OK");
                        break;
                    }
                    while(true) {
                        System.out.print("Idade: ");
                        try {
                            facade.preencherIdade(scanner.nextLine());
                        } catch(ValidacaoException exception) {
                            System.out.println(exception.getMessage());
                            continue;
                        }
                        System.out.println("OK");
                        break;
                    }
                    
                    facade.salvarUsuario();
                    System.out.println("Cadastro finalizado");
                    
                    while(true) {
                        System.out.print("[C]ontinua ou [F]inaliza? ");
                        opcao = scanner.next();
                        if("C".equals(opcao) || "c".equals(opcao))
                            break;
                        else if("F".equals(opcao) || "f".equals(opcao)) {
                            System.out.println("Fim de cadastro");
                            opcao = "0";
                            break;
                        } else {
                            System.out.println("Opção inválida");
                            continue;
                        }
                    }
                    if("0".equals(opcao))
                        break;                    
                }                
            }
            else if("2".equals(opcao)) {
                List<Usuario> usuarios = facade.getUsuarios();
                if(usuarios.isEmpty())
                    System.out.println("Não há usuários cadastrados");
                else {
                    System.out.println("\n---- Listar cadastros ----");                
                    for(Usuario u: usuarios) {
                        System.out.println("Nome: " + u.getNome());
                        System.out.println("E-mail: " + u.getEmail());
                        System.out.println("Idade: " + u.getIdade());
                        System.out.println("-");
                    }
                    System.out.println("FIM");
                }
            }                
            else
                System.out.println("Opção inválida");
        }
    }    
}