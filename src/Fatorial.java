import java.util.Scanner;

public class Fatorial {
    int valorDigitado;
    int resultado;

    public Fatorial() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, este programa faz o cálculo de fatorial");

        setResultado(1);

        System.out.println("Digite um valor para receber seu fatorial ");
        setValorDigitado(sc.nextInt());

        for (int i = getValorDigitado(); i >= 1 ; i--) {
            setResultado(getResultado() * i);
        }
        sc.close();
        System.out.println(getValorDigitado() + "!" + " = " + getResultado());
    }

    public int getValorDigitado() {
        return this.valorDigitado;
    }

    public void setValorDigitado(int valorDigitado) {
        this.valorDigitado = valorDigitado;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
