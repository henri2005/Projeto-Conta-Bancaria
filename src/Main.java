public class Main extends Banco{

    public static void main(String[] args) throws Exception{
            // instanciando novos objetos da ContaCorrente e ContaPoupança, que herdam características da classe Conta
            ContaCorrente corrente = new ContaCorrente();
            ContaPoupanca poupanca = new ContaPoupanca();

            corrente.depositar(1400, 0.012);
            corrente.imprimirExtrato(corrente, corrente); // imprimindo as informações de extrato
            
            corrente.transferir(300, poupanca, 0.5);
            poupanca.sacar(100); // Computando, a conta corrente ainda não recebeu o valor da transferência. Portanto, o saque não poderá ser feito, e uma mensagem de erro será exibida.

            poupanca.imprimirExtrato(poupanca, poupanca);
            corrente.imprimirExtrato(corrente, corrente);

            poupanca.depositar(3000, 0.03);
            poupanca.imprimirExtrato(poupanca, poupanca);
    }
}
