/*
Faça um programa que peça o tamanho de um arquivo para download (em MB)
e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo
 (em minutos).
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.printf("Digite o tamanho do arquivo (MB): ");
        double tamanhoArquivoMB = sc.nextDouble();
        System.out.print("Digite a velocidade do link da Internet (em Mbps): ");
        double velocidadeInternetMbps = sc.nextDouble();

        double tamanhoArquivoMb = tamanhoArquivoMB * 8;

        double tempoDownloadMinutos = tamanhoArquivoMb / velocidadeInternetMbps / 60;

        System.out.printf("O tempo aproximado de download é: %.2f minutos.%n", tempoDownloadMinutos);


    }
}