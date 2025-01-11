import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Variaveis calc = new Variaveis();

        System.out.print("Qual o seu peso? ");
        calc.setPeso(input.nextDouble());

        System.out.print("Qual a sua altura? ");
        calc.setAltura(input.nextDouble());

        System.out.println("Peso: " + calc.getPeso());

        System.out.println("Altura: " + calc.getAltura());

        System.out.println("Seu imc é: " + calc.calcularImc());
    }
}
