package projeto;

public class Professor {
    private String nome;
    private String email;
    private String formação;
    public Professor(String nome, String email, String formação) {
        this.nome = nome;
        this.email = email;
        this.formação = formação;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFormação() {
        return formação;
    }
    public void setFormação(String formação) {
        this.formação = formação;
    }
    
}
