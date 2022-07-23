import java.util.Scanner;

public class Fatorial {
    public Fatorial() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, este programa faz o cálculo de fatorial");

        int valorDigitado, resultado;
        resultado = 1;

        System.out.println("Digite um valor para receber seu fatorial ");
        valorDigitado = sc.nextInt();

        for (int i = valorDigitado; i >= 1 ; i--) {
            resultado *= i;
        }
        sc.close();
        System.out.println(valorDigitado + "!" + " = " + resultado);
    }
}
