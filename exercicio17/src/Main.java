
/*
Faça um Programa para uma loja de tintas.

O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.

Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros,

que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.

Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:

comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o preço seja o menor.
    Acrescente 10% de folga e sempre arredonde os valores para cima,
    isto é, considere latas cheias.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a area a ser pintada em metros quadrados: ");
        double area = sc.nextDouble();

        CalculadoraTintas calculadora = new CalculadoraTintas();

        double litros = calculadora.calcularLitrosNecessarios(area);
        System.out.println("Litros necessarios com 10% de folga " + litros);

        String apenasLatas = calculadora.calcularApenasLatas(litros);
        String apenasGaloes = calculadora.calcularApenasGaloes(litros);
        String mistura = calculadora.calcularMistura(litros);

        System.out.println("Opção 1: Apenas latas: " + apenasLatas);
        System.out.println("Opção 2: Apenas galões: " + apenasGaloes);
        System.out.println("Opção 3: Mistura: " + mistura);

        sc.close();
    }
}