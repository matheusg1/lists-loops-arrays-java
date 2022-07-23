import java.util.Scanner;

public class ContadorParesImpares {
    public ContadorParesImpares() { // ContadorParesImpares
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Olá, este programa lê N números e mostra a a quantidade de ímpares e pares.");

        int quantidadePares = 0, quantidadeImpares = 0;

        System.out.println("Quantos valores você irá adicionar? ");
        int quantidadeValores = sc.nextInt();

        for (int i = 0; i < quantidadeValores; i++) {
            System.out.println("Digite o "+ (i+1) +"º valor ");
            int valorDigitado = sc.nextInt();

            if (valorDigitado % 2 == 0) quantidadePares++;
            else quantidadeImpares++;
        }

        /*
        // outra forma
        int count = 0;
        do{
            System.out.println("Digite o " + (count + 1) + "º valor ");
            int valorDigitado = sc.nextInt();

            if (valorDigitado % 2 == 0){
                quantidadePares++;
            }
            else{
                quantidadeImpares++;
            }

            count++;
        }while(count < quantidadeValores);
        */
        sc.close();
        
        System.out.println("A quantidade de pares foi " + quantidadePares + " e a quantidade de ímpares foi " + quantidadeImpares + ".");

    }
}
