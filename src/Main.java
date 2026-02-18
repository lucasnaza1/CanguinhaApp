import br.com.nazadev.CanguinhaApp.models.*;

public class Main {
    public static void main(String[] args) {
        Conta novaConta = new Conta(2000, "Lucas");
        novaConta.registrarGasto(15.43, "almoço");
        novaConta.registrarGasto(17.50, "servidor");
        novaConta.registrarGasto(398.45, "fatura nubank");
        novaConta.registrarGasto(438.95, "fatura picpay");
        novaConta.registrarGasto(86.05, "DAS");
        novaConta.mostraDados();
    }
}
