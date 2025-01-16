import java.util.Scanner;

/*
Faça um Programa que leia três números e mostre o maior deles.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        if ((num1 > num2) && (num1 > num3)){
            System.out.println("O primeiro número é maior: " + num1);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("O segundo número é maior: "+ num2);
        } else {
            System.out.println("O terceiro número é maior: "+ num3);
        }
    }
}