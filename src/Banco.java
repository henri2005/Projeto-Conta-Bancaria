public class Banco extends ContaCorrente{
    private final double tarifaContaCorrente = 0.3; // definindo a tarefa com um valor constante

    @Override
    public void imprimirExtrato() {}

    @Override
    public void sacar() {}

    @Override
    public void transferir() {}

    @Override
    public void solicitarExtrato() {}

    public double getTarifaContaCorrente() {
        return tarifaContaCorrente;
    }
    
    // para depositar no banco, ele já desconta uma tarifa automática.
    public void depositar(double valor) {
        saldo += valor;
        descontarTarifa();
    }

    private void descontarTarifa(){
        saldo -= (saldo * getTarifaContaCorrente());
    }
}
