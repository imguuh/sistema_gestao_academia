import java.util.ArrayList;
import java.util.List;

public class Treino {
    
    public class ItemTreino {
        private Exercicio exercicio;
        private int series;
        private int repeticoes;

        public ItemTreino(Exercicio exercicio, int series, int repeticoes) {
            this.exercicio = exercicio;
            this.series = series;
            this.repeticoes = repeticoes;
        }
        
        // Getters para sumir com os avisos
        public Exercicio getExercicio() { return exercicio; }
        public int getSeries() { return series; }
        public int getRepeticoes() { return repeticoes; }
    }

    private List<ItemTreino> itensTreino = new ArrayList<>();

    public void adicionarExercicio(Exercicio exercicio, int series, int repeticoes) {
        for (ItemTreino item : itensTreino) {
            if (item.getExercicio().getNome().equalsIgnoreCase(exercicio.getNome())) {
                throw new IllegalArgumentException("O exercício " + exercicio.getNome() + " já está nesta ficha de treino.");
            }
        }
        itensTreino.add(new ItemTreino(exercicio, series, repeticoes));
    }

    public boolean isTreinoValido() {
        return !itensTreino.isEmpty();
    }
    
    // Getter para a lista
    public List<ItemTreino> getItensTreino() { return itensTreino; }
}