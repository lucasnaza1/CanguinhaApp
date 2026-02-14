import br.com.nazadev.CanguinhaApp.models.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Conta novaConta = new Conta(1000, "Lucas");

        novaConta.mostraDados();

        BigDecimal taxaCaixinhaSimples = new BigDecimal("0.00055");
        Investimentos calculador = new Investimentos(taxaCaixinhaSimples);

        BigDecimal saldoAtual = BigDecimal.valueOf(novaConta.saldo);

        BigDecimal rendimentoUmDia = calculador.calcularRendimentoLiquido(saldoAtual, 365);

        System.out.println("\n---Projeção Canguinha---");
        System.out.println("Seu saldo renderia hoje: " + rendimentoUmDia);
        System.out.println("Saldo total projetado: " + saldoAtual.add(rendimentoUmDia));
    }
}
