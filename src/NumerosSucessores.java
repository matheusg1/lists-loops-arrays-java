import java.util.Random;

public class NumerosSucessores {
    public NumerosSucessores() {

        System.out.println("Olá, este programa recebe 20 números aleatórios e mostra seus sucessores.");

        int[] valores = new int[20];

        adicionaValoresInt(valores);

        System.out.print("Números selecionados:");

        for (int valor : valores) {
            System.out.print(" " + valor);
        }
        
        System.out.print("\nSucessores: ");
        for(int valor : valores){
            System.out.print(" " + (valor +1));
        }
    }

    public int[] adicionaValoresInt(int[] array){
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }
        return array;
    }
}
