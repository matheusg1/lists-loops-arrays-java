import java.util.Scanner;

public class Menu {
    public static void main(String[] args){        
        System.out.println("Olá, selecione um dos programas para continuar.");

        Scanner sc = new Scanner(System.in);
        
        System.out.println("[1]Calculadora\n[2]Fatorial\n[3]Contador de pares e ímpares\n[4]Contador de vogais\n[5]Contador de consoantes\n[6]Matriz com números aleatórios\n[7]Números e seus sucessores");
        int opcaoEscolhida = sc.nextInt();
        
        switch(opcaoEscolhida){
            case 1:
                new Calculadora();
                break;
            case 2:
                new Fatorial();
                break;
            case 3:
                new ContadorParesImpares();
                break;
            case 4:
                new ContadorVogais();
                break;
            case 5:
                new ContadorConsoantes();
                break;
            case 6:
                new Matriz();
                break;
            case 7:
                new NumerosSucessores();
                break;
            default:
                System.out.println("Opção inválida");
        }
        sc.close();
    }

}
