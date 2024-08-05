package operadoreslogicos.src.main.java.com.example;

/**
 * Hello world!
 *
 */
public class app {
    public static void main( String[] args ) {
        // Declaração de variáveis
        boolean temSol = true;
        boolean folga = false;
        
        // Só irá passear se as duas condições forem verdadeiras.
        if (temSol && folga) {
            System.out.println("Irei passear hoje!");
        } else {
            System.out.println("Não irei passear.");
        }
    }
}
