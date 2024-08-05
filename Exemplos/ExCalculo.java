import java.util.Scanner;

public class ExCalculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor do produto: ");
        double valor = teclado.nextDouble();
        
        double prestacao = valor / 5;

        System.out.println("Prestações: " + prestacao);
    }
    
}
