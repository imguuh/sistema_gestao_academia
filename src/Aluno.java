public class Aluno {
    private String nome;
    private String cpf;
    private Treino treinoAtivo;
    private Professor professorResponsavel;

    public Aluno(String nome, String cpf) {
        if (nome == null || nome.trim().isEmpty() || cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome e CPF são obrigatórios para o cadastro do aluno.");
        }
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setTreinoAtivo(Treino treino) {
        this.treinoAtivo = treino;
    }

    public void setProfessorResponsavel(Professor professor) {
        this.professorResponsavel = professor;
    }

    // Adicionando os Getters para sumir o aviso amarelo
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public Treino getTreinoAtivo() { return treinoAtivo; }
    public Professor getProfessorResponsavel() { return professorResponsavel; }
}