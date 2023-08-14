public class q4 {
    public static void main(String[]args){
        System.out.println("Hello World");
        double salario = 4000;

        if(salario == 900){
            System.out.println("Isento de IR");
        }else if(salario ==901 || salario <=1500){
            salario = salario - (salario * 5)/100;
            System.out.println(salario);
        }else if(salario == 1501 || salario <=2500){
            salario = salario - (salario * 10)/100;
            System.out.println(salario);
        }else{
            salario = salario - (salario * 20)/100;
            System.out.print(salario);
        }

    }

}
