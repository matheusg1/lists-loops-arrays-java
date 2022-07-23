import java.util.Scanner;

public class ContadorConsoantes{
    public ContadorConsoantes(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Olá, este programa lê 5 valores e mostra a quantidade de consoantes e quais foram.");

        int quantidadeConsoantes = 0;
        String[] quaisConsoantes = new String[5];
        String[] caractere = new String[5];

        int count = 0;

        do{
            System.out.println("Digite o " + (count +1) + "º caractere");
            String valorDigitado = sc.nextLine();

            if(valorDigitado.equalsIgnoreCase("a")
            | valorDigitado.equalsIgnoreCase("e")
            | valorDigitado.equalsIgnoreCase("i")
            | valorDigitado.equalsIgnoreCase("o")
            | valorDigitado.equalsIgnoreCase("u")
            ){}
            else{
                quantidadeConsoantes++;
                quaisConsoantes[count] = valorDigitado;
            }
            count++;
        }
        while(count < caractere.length);

        sc.close();

        System.out.print("A quantidade de consoantes é " + quantidadeConsoantes);

        if (quaisConsoantes != null & quantidadeConsoantes != 0){
            if (quantidadeConsoantes > 1)
                System.out.print(" e elas são:");
            else
                System.out.print(" e ela é:");
                
            for (String valor : quaisConsoantes) {
                if (valor != null){
                    System.out.print(" " + valor);
                }
            }
        }
    }
}