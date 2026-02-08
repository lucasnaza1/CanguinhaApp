import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Lucas Nazário";
        String tipoAcesso = "Despesas";
        double saldo = 2000;
        int opcao = 0;
        String menuOpcoes = """
                ---Digite sua Opção---
                
                1 - Consultar Saldo
                2 - Incluir Receita
                3 - Registrar Gasto
                4 - Sair
                 
                """;

/*
        System.out.println("***********************");
        System.out.println("\nUsuário: " + nome);
        System.out.println("\nAcesso a " + tipoAcesso);
        System.out.println("\nSaldo atual: " + saldo);
        System.out.println("***********************");
*/

        while (opcao != 4){
            System.out.println(menuOpcoes);
            opcao = leitura.nextInt();

            if  (opcao == 1){
                System.out.println("Seu saldo atual é " + saldo);
            } else if  (opcao == 2){
                System.out.println("Quanto você ganhou: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atual: " + saldo);
            } else if  (opcao == 3){
                System.out.println("Quanto você gastou: ");
                double valor = leitura.nextDouble();
                saldo -= valor;
                System.out.println("Saldo atual: " + saldo);
            } else if  (opcao != 4){
                System.out.println("Opção inválida");
            }
        }
    }
}
