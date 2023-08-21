
import java.util.Scanner;

public class Scan2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome completo:");
        String nomecompleto  = scanner.nextLine();

        System.out.println("Nome completo: "+nomecompleto);

        scanner.close();
    }
}
