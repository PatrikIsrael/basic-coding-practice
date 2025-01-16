/*
Faça um Programa que peça dois números e imprima o maior deles.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.printf("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("O primeiro número é maior");
        }else if(num2 > num1){
            System.out.println("O segundo número é maior");
        }else{
            System.out.println("Os números são iguais");
        }



    }
}