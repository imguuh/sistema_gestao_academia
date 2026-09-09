public class Main {
    public static void main(String[] args) {
        try {
            // 1. Testando cadastro de aluno (Regra: Nome e CPF obrigatórios)
            Aluno aluno1 = new Aluno("João", "123.456.789-00");
            
            // 2. Professor responsável por vários alunos
            Professor prof = new Professor("Carlos");
            prof.adicionarAluno(aluno1);

            // 3. Criando Exercícios
            Exercicio supino = new Exercicio("Supino Reto", "Peito");
            Exercicio agachamento = new Exercicio("Agachamento Livre", "Pernas");

            // 4. Montando Treino
            Treino treinoA = new Treino();
            
            // Regra: Séries e repetições informadas
            treinoA.adicionarExercicio(supino, 4, 10); 
            treinoA.adicionarExercicio(agachamento, 3, 12);
            
            // Regra: Validar duplicidade (Isso deve gerar um erro se descomentado)
            // treinoA.adicionarExercicio(supino, 3, 15); 
            
            // Regra: Validar se tem pelo menos um exercício
            if(treinoA.isTreinoValido()) {
                System.out.println("Treino válido criado com sucesso!");
            }

            // Regra: Aluno com apenas uma ficha ativa
            aluno1.setTreinoAtivo(treinoA);

        } catch (IllegalArgumentException e) {
            System.err.println("Erro de validação: " + e.getMessage());
        }
    }
}