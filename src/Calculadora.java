import java.util.Scanner;

public class Calculadora {
    public Calculadora() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, este programa mostra tabuadas de soma/multiplicação e faz a subtração/divisão entre dois números");

        int valorDigitado, valorDigitado2, operacao;

        System.out.println("Digite um valor ");
        valorDigitado = sc.nextInt();

        System.out.println("Soma[1]\nMultiplicação[2]\nSubtração[3]\nDivisão[4]");
        operacao = sc.nextInt();
        
        switch(operacao){
            case 1:
                soma(valorDigitado);
                break;
            case 2:
                multiplica(valorDigitado);
                break;
            case 3:
                System.out.println("Digite o segundo valor");
                valorDigitado2 = sc.nextInt();
                subtrai(valorDigitado, valorDigitado2);
                break;
            case 4:
                System.out.println("Digite o segundo valor");
                valorDigitado2 = sc.nextInt();
                divide(valorDigitado, valorDigitado2);
                break;
            default:
                System.out.println("ERRO");
        }
        sc.close();
    }

    public void soma(int valor){
        for (int i = 0; i <= 10; i++) {
            int resultado = valor + i;
            System.out.println(i +  " + " + valor + " = " + resultado);

        }
    }

    public void multiplica(int valor){
        for (int i = 0; i <= 10; i++) {
            int resultado = valor * i;
            System.out.println(i +  " x " + valor + " = " + resultado);
        }
    }

    public void divide(double primeiroValor, double segundoValor){
        double resultado = primeiroValor / segundoValor;
        System.out.println(primeiroValor +  " / " + segundoValor + " = " + resultado);
    }

    public void subtrai(int primeiroValor, int segundoValor){
        int resultado = primeiroValor - segundoValor;
        System.out.println(primeiroValor +  " - " + segundoValor + " = " + resultado);
    }

}

