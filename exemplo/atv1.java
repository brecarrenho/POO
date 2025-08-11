import java.util.*;

public class atv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a, b, c;
        Scanner leia = new Scanner(System.in);
        a = 10;
        System.out.println("Digite um número: ");
        b = leia.nextInt();

        try {
            c = a / b;
            System.out.println("Valor de C: " + c);
        } catch (Exception erro) {
            System.out.println("Não existe divisão por zero");
        }
    }}