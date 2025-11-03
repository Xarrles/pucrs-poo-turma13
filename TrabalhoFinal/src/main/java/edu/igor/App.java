package edu.igor;

public class App {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Igor");
        aluno1.CadastroPlaca("ABC-1234");
        aluno1.CadastroPlaca("DEF-5678");
        aluno1.CadastroPlaca("GHI-9012"); // Deve exibir mensagem de limite atingido

        System.out.println(aluno1.toString());
    }
}
