package contabancaria.menu;

import contabancaria.model.ContaCorrente;
import contabancaria.model.ContaPoupanca;
import contabancaria.util.Cores;

import java.util.Scanner;

public class Menu {

    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        while (true) {
            System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "******************************************************");
            System.out.println("                                                      ");
            System.out.println("                BANCO DO BRAZIL Z                     ");
            System.out.println("                                                      ");
            System.out.println("******************************************************");
            System.out.println("                                                      ");
            System.out.println("              1- CRIAR CONTA                          ");
            System.out.println("              2- VER SALDO                            ");
            System.out.println("              3- DADOS DA CONTA                       ");
            System.out.println("              4- SACAR                                ");
            System.out.println("              5- DEPOSITAR                            ");
            System.out.println("              6- TRANSFERIR                           ");
            System.out.println("              7- SAIR                                 ");
            System.out.println("******************************************************");
            System.out.println("              ENTRE COM A OPÇÃO DESEJADA              ");
            System.out.println("                                                      ");
            opcao = leia.nextInt();

            if (opcao == 7) {
                System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui");
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n Criar Conta");
                    break;
                case 2:
                    System.out.println("\n Ver Saldo");
                    break;
                case 3:
                    System.out.println("\n Dados da Conta");
                    break;
                case 4:
                    System.out.println("\n Sacar");
                    break;
                case 5:
                    System.out.println("\n Depositar");
                    ContaCorrente cont = new ContaCorrente(421, 21, 2, "Davi", 2000.0f, 1000.0f);

                    cont.visualizar();
                    cont.sacar(5000.0f);
                    cont.depositar(10000.0f);

                    cont.visualizar();

                    ContaPoupanca cp = new ContaPoupanca(2, 123, 2, "Davi", 500.0f, 20);
                    cp.visualizar();

                    break;
                case 6:
                    System.out.println("\n Transferir");
                    break;
                default:
                    System.out.println("\nOpção Inválida");

            }
        }
    }
}
