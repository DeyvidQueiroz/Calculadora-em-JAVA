import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) throws Exception {

        int op;

        do {
         op = Integer.parseInt(JOptionPane.showInputDialog(
            "CALCULADORA\n"+
            "1-Soma\n"+
            "2-Multiplicação\n"+
            "3-Subitração\n"+
            "4-divisão\n"+
            "0-SAIR"

         ));

         if(op==0)
           break;
         else if(op==1)
           soma();
         else if(op==2)
           multiplicação();
         else if(op==3)
           subtraçao();
         else if(op==4)
           divisao();
         else
           JOptionPane.showMessageDialog(null, "Opção Errada, Tente novamente");


        } while (op!=0);
    }

    private static void divisao() {
    Scanner input = new Scanner(System.in);
    System.out.println("INFORME OS VALORES");
    double a = input.nextDouble();
    System.out.println("/");
    double b = input.nextDouble();

    double r = a / b;
    System.out.println(r);

    }




    private static void subtraçao() {
      Scanner input = new Scanner(System.in);
    System.out.println("INFORME OS VALORES");
    double a = input.nextDouble();
    System.out.println("-");
    double b = input.nextDouble();

    double r = a - b;
    System.out.println(r);
    }

    private static void multiplicação() {
      Scanner input = new Scanner(System.in);
    System.out.println("INFORME OS VALORES");
    double a = input.nextDouble();
    System.out.println("*");
    double b = input.nextDouble();

    double r = a * b;
    System.out.println(r);
    }

    private static void soma() {
      Scanner input = new Scanner(System.in);
    System.out.println("INFORME OS VALORES");
    double a = input.nextDouble();
    System.out.println("+");
    double b = input.nextDouble();

    double r = a + b;
    System.out.println(r);
    }
}
