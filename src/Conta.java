public abstract class Conta implements IConta, Cliente{

    // definindo constantes de agência e números de conta
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    // chamando os atributos das interfaces
    public String nome;
    public String cpf;
    public String telefone;
    public int agencia;
    public int numeroConta;
    public double saldo;
    public double taxaManutencao;

    // método construtor com os atributos agencia e numeroConta
    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }

    // métodos getters para pegar os valores definidos nas interfaces
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    // métodos da classe
    public void sacar(double valor){
        if (valor > saldo) { // exibindo uma mensagem de erro caso o valor de saque seja maior que o saldo
            System.out.println("SAQUE INVALIDO! RETIRE UM VALOR MENOR DO QUE O SALDO!");
            System.out.println(" ");
        } else{ // caso não seja, a operação ocorre normalmente
            saldo -= valor;
        }
    };

    @Override
    public void depositar(){};

    // para transferir, o usuário saca de sua conta e deposita na conta direcionada, instanciada na classe Main
    public void transferir(double valor, Conta contaUsuario, double taxa){
        this.sacar(valor);
        contaUsuario.depositar();
    };

    // para solicitar o extrato, são informadas os atributos do Cliente
    protected void solicitarExtrato(Cliente cliente){
        System.out.println("--- EXTRATO SOLICITADO ---");
        System.out.println("Nome: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);
        System.out.println("Telefone: " + cliente.telefone);
        System.out.println(" ");
    };

    // para imprimir o extrato, se deve primeiro fazer a solicitação, e então imprimir o extrato
    protected void imprimirExtrato(Conta informacoesConta, Cliente contaCliente){
        solicitarExtrato(contaCliente);
        System.out.println("--- EXTRATO IMPRIMIDO ---");
        System.out.println(String.format("Agência: %d", informacoesConta.agencia)); // %d para formatar números decimais
        System.out.println(String.format("Número: %d", informacoesConta.numeroConta));
        System.out.println(String.format("Saldo: %.2f", informacoesConta.saldo)); // %.2f para deixar duas casas depois da vírgula
        System.out.println(" ");
    };
}
