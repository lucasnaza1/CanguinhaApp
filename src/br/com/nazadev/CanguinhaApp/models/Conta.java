package br.com.nazadev.CanguinhaApp.models;

public class Conta {
    public double saldo;
    public String titular;

    public Conta(double saldo, String titular) {
        this.saldo = saldo;
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

    @Override
    public String toString() {
        return "Seja bem-vindo(a) " + titular + "!" + "\n"
        + "Saldo atual " + "R$ " + String.format("%.2f", saldo) + "\n";
    }
    public void mostraDados(){
        System.out.println(this);
    }
}
