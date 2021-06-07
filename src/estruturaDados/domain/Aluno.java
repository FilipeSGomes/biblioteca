package estruturaDados.domain;

public class Aluno {

    private int ra;
    private String nome;
    private String curso;
    private String email;
    
    @Override
    public String toString() {
        return "Aluno [ra=" + ra + ", nome=" + nome + ", curso=" + curso + ", email=" + email + "]";
    }

    public Aluno(int ra, String nome, String curso, String email) {
        super();
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.email = email;
    }

    public Aluno() {
        super();
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}