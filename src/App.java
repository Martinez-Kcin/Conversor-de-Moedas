import java.util.Scanner;

public class App {
    
    

    public static void main(String[] args) {
       try (Scanner ent = new Scanner(System.in)) {
        conversor.converter conv = new conversor.converter();
        boolean continuar = true; 
        String moedaOrigem = "";
        String moedaDestino = "";
    

    while (continuar) {
        System.out.println("***** Bem vindo ao conversor de moedas! *****");
        System.out.println("*** Escolha a moeda de origem: ***" );
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");
        int opcOrigem = ent.nextInt();

        System.out.println("*** Escolha a moeda de destino: ***" );
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");
        int opcDestino = ent.nextInt();

        System.out.println("Digite o valor a ser convertido:");
        double valor = ent.nextDouble();

        switch (opcOrigem) {
            case 1: moedaOrigem = "BRL";
                break;
             case 2: moedaOrigem = "USD";
                break;
            case 3: moedaOrigem = "EUR";
                break; 
        
            default: System.out.println("Opção inválida."); 
            System.exit(0);
        }

        switch (opcDestino) {
            case 1: moedaDestino = "BRL";
                break;
            case 2: moedaDestino = "USD";
                break;
            case 3: moedaDestino = "EUR";
                break;
        
            default:System.out.println("Opção inválida.");
            System.exit(0);
        }

        double valorConvertido = conv.convert(moedaOrigem, moedaDestino, valor);
        System.out.println("Valor convertido: " +valorConvertido);
        
        System.out.println("Deseja fazer outra conversão? (S para sim/ N para Não)");
        char resposta = ent.next().charAt(0); 
        if (resposta != 'S' && resposta != 's') {
            continuar = false;
        }
    }
    }

  }


}
