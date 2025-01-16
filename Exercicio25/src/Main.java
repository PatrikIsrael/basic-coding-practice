import java.util.Scanner;

/*
Faça um Programa que leia três números e mostre o maior e o menor deles.
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

       int menor = num1;
       int maior = num1;

       if(num2 > maior){
           maior = num2;
       }
       if (num2 < menor){
           menor = num2;
       }
       if (num3 > maior){
           maior = num3;
       }
       if(num3 < menor){
           menor = num3;
       }
        System.out.println("O maior é " + maior);
        System.out.println("O menor é " + menor);

    }
}