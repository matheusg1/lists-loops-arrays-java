import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora{
    private List<Double> valoresDigitados = new ArrayList<Double>();
    private int operacao;
    private Double resultado;
    private String resposta = "";

    public Calculadora(){
        var sc = new Scanner(System.in);

        System.out.println("Olá, este programa faz cálculos com as principais operações entre N números, sendo limitado a uma única operação por cálculo");

        do{
            System.out.println("Digite um valor para adicionar ao cálculo // [S] para sair");
            setResposta(sc.nextLine());

            if(checaValorNumerico(getResposta())){
                //getValoresDigitados().add(Double.parseDouble(getResposta()));
                addValor(Double.parseDouble(getResposta()));
                //valoresDigitados.add(Double.parseDouble(getResposta()));
            }
        }
        while(checaValorNumerico(getResposta()));

        System.out.println("Digite a operação a ser feita\n[1]Soma\n[2]Subtração\n[3]Multiplicação\n[4]Divisão");
        //int operacao = sc.nextInt();
        setOperacao(sc.nextInt());

        switch(getOperacao()){
            case 1:
                System.out.println("O resultado foi " + soma(getValoresDigitados()));
                break;

            case 2:
                System.out.println("O resultado foi " + subtrai(getValoresDigitados()));
                break;

            case 3:
                System.out.println("O resultado foi " + multiplica(getValoresDigitados()));
                break;

            case 4:
                System.out.println("O resultado foi " + divide(getValoresDigitados()));
                break;

            default:
                System.out.println("Erro");
                break;
        }

        System.out.println((getValoresDigitados()));
    
        sc.close();
    }

    public static boolean checaValorNumerico(String valor){

        boolean checaNumero = true;

        for (int i = 0; i < valor.length(); i++) {
            if(!Character.isDigit(valor.charAt(i))){
                checaNumero = false;
            }
        }
        return checaNumero;
    }

    public static Double soma(List<Double> valores){
        Double resultado = 0d;

        for (Double valor : valores){
            resultado += valor;
        }

        return resultado;
    }

    public static Double subtrai(List<Double> valores){
        Double resultado = 0d;
        Double soma = 0d;

        for (int i = 1; i < valores.size(); i++) {
            soma += valores.get(i);
        }
        resultado = valores.get(0) - soma;

        return resultado;
    }
    
    public static Double multiplica(List<Double> valores){
        Double resultado = 1d;

        for(Double valor: valores){
            resultado *= valor;
        }

        return resultado;
    }
    
    public static Double divide(List<Double> valores){
        Double resultado = valores.get(0) / valores.get(1);

        for (int i = 2; i < valores.size(); i++) {
            resultado /= valores.get(i);
        }
        return resultado;
    }
    
    public void addValor(Double valor){
        this.valoresDigitados.add(valor);
    }

    public List<Double> getValoresDigitados() {
        return this.valoresDigitados;
    }

    public int getOperacao() {
        return this.operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public String getResposta() {
        return this.resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

}
