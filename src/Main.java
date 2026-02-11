public class Main {
    public static void main(String[] args) {
        Conta novaConta = new Conta(0, "Nazario");
        novaConta.adicionarReceita(2800);
        novaConta.registrarGasto(1400, "Fatura Inter");
        System.out.println(novaConta.saldo);
    }
}
