//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        InformacoesPets pet1 = new InformacoesPets("bingo", 2, "poodle", "pequeno", "ração");
        InformacoesPets pet2 = new InformacoesPets("liminha", 3, "siamês", "pequeno", "ração");

        System.out.println("\nDados do primeiro animal:");
        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade() + " anos");
        System.out.println("Raça: " + pet1.getRaca());
        System.out.println("Porte: " +pet1.getPorte());
        System.out.println("Alimentação: " + pet1.getAlimentacao());

        System.out.println("\nDados do segundo animal:");
        System.out.println("Nome: " + pet2.getNome());
        System.out.println("Idade: " + pet2.getIdade() + " anos");
        System.out.println("Raça: " + pet2.getRaca());
        System.out.println("Porte: " +pet2.getPorte());
        System.out.println("Alimentação: " + pet2.getAlimentacao());
    }
}