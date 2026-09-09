import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Aluno> alunos;

    public Professor(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.setProfessorResponsavel(this);
    }

    // Adicionando os Getters para sumir o aviso amarelo
    public String getNome() { return nome; }
    public List<Aluno> getAlunos() { return alunos; }
}