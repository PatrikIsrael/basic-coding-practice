import java.util.Scanner;

/*
Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite uma letra: ");
        char letra = sc.nextLine().toLowerCase().charAt(0);
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("È vogal");
        }else {
            System.out.println("Não é volgal");
        }
    }
}