public class Conta {
    double saldo;
    String titular;

    public Conta(double saldo, String titular) {
        this.saldo = 0.0;
        this.titular = titular;
    }

    public void adicionarReceita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Receita de R$ " + valor + " adicionada com sucesso");
        } else {
            System.out.println("O valor deve ser maior que zero");
        }
    }

    public void registrarGasto(double valor, String descricao) {
        // O saldo pode ficar negativo: indicativo de que a pessoa gastou mais do que deveria
        if (valor > 0) {
            this.saldo -= valor;
            System.out.println("Gasto de R$ " + valor + " - " + descricao + " adicionada com sucesso");
        } else {
            System.out.println("O valor deve ser maior que zero");
        }
    }
}
