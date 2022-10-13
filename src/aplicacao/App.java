/* Fazer um programa para ler os valores da largura e altura 
de um retângulo. Em seguida, mostrar na tela o valor de 
sua área, perímetro e diagonal. Usar uma classe como 
mostrado no projeto ao lado.  */

package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Retangulo;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo react = new Retangulo();

        System.out.print("digite o valor da Altura: ");
        react.altura = sc.nextDouble();
        System.out.print("digite o valor da Largura: ");
        react.largura = sc.nextDouble();

        System.out.printf("Area = %.2f%n ", react.Area());
        System.out.printf("Perimetro = %.2f%n ", react.Perimetro());
        System.out.printf("Diagonal = %.2f%n ", react.Diagonal());

        sc.close();
    }
}
