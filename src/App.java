import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int number;

       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite um valor: ");
       number = scanner.nextInt();

       for(int i = 1; i <= number; i++){
        for (int j = 0; j < i; j++){
            System.out.print(i);
        }
        System.out.println();
       }
    }
}
