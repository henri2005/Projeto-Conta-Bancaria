public class ContaPoupanca extends Conta{
    protected double juros;

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    @Override
    public void imprimirExtrato() {}

    @Override
    public void transferir() {}

    // rendendo juros a cada operação de depósito na conta poupança
    public void depositar(double valor, double juros) {
        saldo = saldo + valor;
        renderJuros(juros);
    }

    @Override
    public void depositar() {
    }

    @Override
    public void sacar() {
    }

    @Override
    public void solicitarExtrato() {}

    public void renderJuros(double juro){
        saldo = saldo + (saldo * juro);
        System.out.println(saldo);
    }
}
