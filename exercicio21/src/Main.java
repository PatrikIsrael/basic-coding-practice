import java.util.Scanner;

/*
Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = sc.nextLine().charAt(0);
        if(letra == 'f' || letra == 'F'){
            System.out.println("Sexo Feminino");
        } else if (letra == 'm' || letra == 'M') {
            System.out.println("Sexo Masculino");
        }else {
            System.out.println("Sexo inválido");
        }

    }
}