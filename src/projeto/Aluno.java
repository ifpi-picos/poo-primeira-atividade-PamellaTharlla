package projeto;

public class Aluno{
   private String nome;
   private int matricula;
   private String email;
   private String data_de_nascimento;


    public Aluno(String nome, int matricula, String email) {
    this.nome = nome;
    this.matricula = matricula;
    this.email = email;
}
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getData_de_nascimento() {
        return data_de_nascimento;
    }
    public void setData_de_nascimento(String data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }
    
}