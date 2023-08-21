import java.util.Scanner;

public class exerc1 {
    public static void main(String[]args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Bem-vindo a Jampa Style");
        System.out.println("Opção 1: Comprar item\n"
                            +"Opção 2: Solicitar valor do produto\n"
                            +"Opçãp 3: Falar com um atendente");
        int op1 = SC.nextInt();


        switch(op1){
            case 1:
            System.out.println("Opção 1: Camisa Nike");
            break;
            case 2:
            System.out.println("Opção 2: Valor da camisa escolhida é R$500,00");
            break;
            case 3:
            System.out.println("Opção 3: Olá, como posso lhe ajudar, meu nome é João Pedro");
            break;
            default:
            System.out.println("Opção inválida");
        }


    }
}
