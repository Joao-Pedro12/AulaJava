

import java.util.Scanner;

public class Scan3 {
    public static void main(String[]args){
        int r;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Caso escolha 1: Comprar camisa nike, Caso escolha 2: Calça JOHN JOHN, Caso escolha 3: Tênis VANS");
            int x = sc.nextInt();
            switch(x){
                case 1:
                    System.out.println("Ótima escolha");
                    break;
                case 2:
                    System.out.println("O valor da calça é R$300.00");
                    break;
                case 3:
                    System.out.print("O valor do tênis é 299,00");
                    break;
            }
            System.out.println("Para ver novamente, digite 0");
            r = sc.nextInt();
        }while(r==0);
    }
}
