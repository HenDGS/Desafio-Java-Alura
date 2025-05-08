package Desafio;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        int saldo = 0;
        String nomeCliente = "Cliente";

        while(true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver saldo");
            System.out.println("4. Sair");
            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Digite o valor a depositar:");
                    int deposito = scanner.nextInt();
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o valor a sacar:");
                    int saque = scanner.nextInt();
                    if(saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;
                case 3:
                    System.out.println("Seu saldo é: " + saldo);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
