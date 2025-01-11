public interface IConta {
    
    public int agencia = 1;
    public int numeroConta = 0001;
    public double saldo = 1300; // todo cliente que iniciar uma conta, já tem um salário mínimo à disposição
    public double taxaManutencao = 0.15;
    
    public static int getAgencia() {
        return agencia;
    }

    public static int getNumero() {
        return numeroConta;
    }

    public static double getSaldo() {
        return saldo;
    }

    void sacar();

    void depositar();

    void transferir();

    void imprimirExtrato();
}
