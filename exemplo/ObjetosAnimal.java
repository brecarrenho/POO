import java.util.Scanner;

public class ObjetosAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        System.out.println("Qual o nome do animal?: ");
        animal1.setNome(scanner.nextLine());

        System.out.println("Qual a raça do animal?: ");
        animal1.setRaca(scanner.nextLine());

        System.out.println("Nome: " + animal1.getNome());
        System.out.println("Raça: " + animal1.getRaca());

        scanner.close();
    }
}