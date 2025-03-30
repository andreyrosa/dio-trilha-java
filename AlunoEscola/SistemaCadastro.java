package AlunoEscola;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("123","Marcos");

        marcos.setEndereco("Rua das Julias");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
