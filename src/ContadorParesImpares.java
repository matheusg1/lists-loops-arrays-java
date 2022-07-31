import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContadorParesImpares {
    int valorDigitado;
    List<Integer> pares = new ArrayList<Integer>();
    List<Integer> impares = new ArrayList<Integer>();

    public ContadorParesImpares() { 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Olá, este programa lê N números, mostra quais e quantos foram par/ímpar.");

        while(true){
            System.out.println("Adicione um valor  // [0] para sair");
            setValorDigitado(sc.nextInt());
    

            if (getValorDigitado() == 0){
                break;
            }
            else if (getValorDigitado() % 2 == 0){
                addPar(getValorDigitado());
            }
            else {
                addImpar(getValorDigitado());
            }
        }

        sc.close();
        
        System.out.println("A quantidade de pares foi " + getPares().size() + ", sendo " + getPares() + ".");
        System.out.println("A quantidade de ímpares foi " + getImpares().size() + ", sendo " + getImpares() + ".");
    }

    public void addPar(int valor){
        this.pares.add(valor);

    }

    public void addImpar(int valor){
        this.impares.add(valor);

    }

    public int getValorDigitado() {
        return this.valorDigitado;
    }

    public void setValorDigitado(int valorDigitado) {
        this.valorDigitado = valorDigitado;
    }

    public List<Integer> getPares() {
        return this.pares;
    }

    public List<Integer> getImpares() {
        return this.impares;
    }

}
