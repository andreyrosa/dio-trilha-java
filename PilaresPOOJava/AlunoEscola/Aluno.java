package PilaresPOOJava.AlunoEscola;

public class Aluno {
    String nome;
    int idade;

    private String sexo;

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String newNome){
        nome = newNome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int newIdade){
        this.idade = newIdade;
    }
}
