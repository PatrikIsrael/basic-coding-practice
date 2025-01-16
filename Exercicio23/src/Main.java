
/*
Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar: A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete; A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2;
        while (true) {
            System.out.print("Digite a primeira nota do aluno (0 a 10): ");
             nota1 = sc.nextInt();

            System.out.print("Digite a segunda nota do aluno (0 a 10): ");
             nota2 = sc.nextInt();

            if (isNotaValida(nota1) || isNotaValida(nota2)) {
                break;
            } else {
                System.out.println("Notas inválidas! Certifique-se de inserir valores entra 0 e 10");
            }
        }

        int media = calcularMedia(nota1, nota2);
        System.out.println("A média do aluno é: "+ media);

        avaliarAluno(media);

        sc.close();
    }

    public static boolean isNotaValida(int nota) {
        return nota >= 0 && nota <= 10;
    }

    public static int calcularMedia(int nota1, int nota2){
        return (nota1 + nota2) / 2;

    }
    public static void avaliarAluno(int media){
        if (media == 10){
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
    }
}