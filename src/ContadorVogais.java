import java.util.Scanner;

public class ContadorVogais{
    public ContadorVogais(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Olá, este programa lê 5 valores e mostra a quantidade de vogais e quais foram.");

        int quantidadeVogais = 0;
        String[] quaisVogais = new String[5];
        String[] caractere = new String[5];

        for (int i = 0; i < caractere.length; i++) {
            System.out.println("Digite um caractere");
            String valorDigitado = sc.nextLine();

            caractere[i] = valorDigitado;
            
            switch(valorDigitado){
                case "a", "A":
                case "e", "E":
                case "i", "I":
                case "o", "O":
                case "u", "U":
                    quantidadeVogais++;
                    quaisVogais[i] = caractere[i];
                    break;
            }
        }

        sc.close();

        System.out.print("A quantidade de vogais é " + quantidadeVogais);

        if (quaisVogais != null & quantidadeVogais != 0){
            if (quantidadeVogais > 1)
                System.out.print(" e elas são:");
            else
                System.out.print(" e ela é:");
                
            for (String valor : quaisVogais) {
                if (valor != null){
                    System.out.print(" " + valor);
                }
            }
        }
    }
}