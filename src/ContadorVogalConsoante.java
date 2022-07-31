import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContadorVogalConsoante{
    private List<Character> listaDeVogais = new ArrayList<Character>();
    private List<Character> listaDeConsoantes = new ArrayList<Character>();

    private char letraDigitada;

    public ContadorVogalConsoante(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Olá, este programa lê N valores e mostra a quantidade de vogais e quais foram.");

        do{
            System.out.println("Digite um caractere // [0] para sair");
            setLetraDigitada(sc.nextLine().toLowerCase().charAt(0));

            switch(getLetraDigitada()){
                case 'a', 'e', 'i', 'o', 'u':
                    addVogal(getLetraDigitada());
                    break;
                case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z':
                    addConsoante(getLetraDigitada());
                    break;
                default:
                    break;
            }
        }while(checaAlfabetico(getLetraDigitada()));


        sc.close();

        System.out.print("A quantidade de vogais é " + getListaDeVogais().size() + ", sendo elas " + getListaDeVogais());
        System.out.println("\nA quantidade de consoantes é " + getListaDeConsoantes().size() + ", sendo elas " + getListaDeConsoantes());

    }

    public boolean checaAlfabetico(char valor){
        if((valor >='a' && valor <= 'z') || valor >= 'A' && valor <= 'Z'){
            return true;
        }
        else{
            return false;
        }
    }

    public void addVogal(char letra){
        this.listaDeVogais.add(letra);
    }

    public void addConsoante(char letra){
        this.listaDeConsoantes.add(letra);
    }

    public List<Character> getListaDeVogais() {
        return this.listaDeVogais;
    }

    public List<Character> getListaDeConsoantes() {
        return this.listaDeConsoantes;
    }

    public char getLetraDigitada() {
        return this.letraDigitada;
    }

    public void setLetraDigitada(char letra){
        this.letraDigitada = letra;
    }
}