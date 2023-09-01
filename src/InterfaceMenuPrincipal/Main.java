package Interface;
import java.util.Scanner;

public class Main {
    public Main() {}

    //escolhas do iphone
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("O que deseja fazer?");
        System.out.println("1 - Abrir o navegador?");
        System.out.println("2 - Abrir o Reprodutor de musica?");
        System.out.println("3 - Abrir o Telefone?");
        System.out.println("4 - Sair");
        System.out.println("Digite o número da opção desejada: ");
        scanner.nextInt();


        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Abrir o navegador?");

                break;
            case 2:
                System.out.println("Abrir o Reprodutor de musica?");
                break;
            case 3:
                System.out.println("Abrir o Telefone?");
                break;
            case 4:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção inválida");
                break;


        }
    }

}