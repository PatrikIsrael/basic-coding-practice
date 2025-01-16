

/*
Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

        System.out.printf("Digite um número: ");
        int num = sc.nextInt();
        if (num > 0){
            System.out.printf("O número é positivo");
        }else {
            System.out.printf("O número é negativo");
        }
    }
}