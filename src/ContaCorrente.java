public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
    }

    // aplicando a taxa da conta corrente no depósito
    public void depositar(double valor, double taxa){
        saldo = saldo + valor;
        saldo = saldo - (saldo * taxa);
    }

    @Override
    public void sacar() {
    }

    @Override
    public void transferir() {}

    @Override
    public void solicitarExtrato() {}

}
