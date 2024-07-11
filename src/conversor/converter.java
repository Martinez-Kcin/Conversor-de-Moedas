package conversor;

public class converter { //valores aproximados 
    private double taxaDolarParaReal = 5.45;
    private double taxaEuroParaReal = 5.90;
    private double taxaRealParaDolar = 0.18;
    private double taxaRealParaEuro = 0.17;
    private double taxaDolarParaEuro = 0.90;
    private double taxaEuroParaDolar = 1.10;

    public double convert(String moedaOrigem, String moedaDestino, double valor ){
       double valorConvertido = 0;

       if (moedaOrigem.equals("BRL") && moedaDestino.equals("USD")) {
        valorConvertido = valor * taxaRealParaDolar; 
       } else if (moedaOrigem.equals("BRL") && moedaDestino.equals("EUR")){
        valorConvertido = valor * taxaRealParaEuro;
       }else if (moedaOrigem.equals("USD") && moedaDestino.equals("BRL")) {
        valorConvertido = valor *taxaDolarParaReal;
       } else if (moedaOrigem.equals("EUR") && moedaDestino.equals("BRL")){
        valorConvertido = valor * taxaEuroParaReal;   
       }else if (moedaOrigem.equals("USD") && moedaDestino.equals("EUR")) {
        valorConvertido = valor * taxaDolarParaEuro;
       } else if (moedaOrigem.equals("EUR") && moedaDestino.equals("USD")) {
        valorConvertido = valor * taxaEuroParaDolar;    
       } else{
        System.out.println("Conversão inválida.");
       }
       return valorConvertido; 

    }

}
