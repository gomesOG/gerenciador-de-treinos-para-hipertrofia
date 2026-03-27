import java.util.ArrayList;
import java.util.List;

public class Treino {
    private String tipo; //Ex: "Upper", "Lower", etc
    private List<Exercicio> exercicios;

    //Contrutor
    public Treino(String tipo){
        this.tipo = tipo;
        this.exercicios = new ArrayList<>(); //Inicializa a lista vazia
    }

    //Método para adicionar um exercício na lista do treino
    public void adicionarExercicio(Exercicio ex){
        exercicios.add(ex);
    }

    //Método para imprimir a ficha completa do treino
    public void mostrarFicha(){
        System.out.println("=== Ficha de Treino: " + tipo + " ===");
        for (Exercicio ex : exercicios){
            ex.exibirDetalhes();
        }
        System.out.println("===========================\n");
    }

}
