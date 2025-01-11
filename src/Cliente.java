import java.util.Scanner;

public interface Cliente {
    Scanner sc = new Scanner(System.in);

    public String nome = "Henrique";
    public String cpf = "42131029128";
    public String telefone = "11994211187";

    public static String getNome() {
        return nome;
    }

    public static String getCpf() {
        return cpf;
    }

    public static String getTelefone() {
        return telefone;
    }

    void solicitarExtrato();
}
