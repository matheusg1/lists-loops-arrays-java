import java.util.Random;

public class Matriz {
    public Matriz() {

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            Random random = new Random();
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(99);
            }
        }

        for(int[] linha: matriz ){
            System.out.println();
            for (int coluna: linha){
                System.out.print(coluna + " ");
            }
        }
    }   
}
