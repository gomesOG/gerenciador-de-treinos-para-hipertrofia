public class Exercicio {
    private String nome;
    private int series;
    private int repeticoes;
    private double carga; // Peso em kg

    // Construtor: usado para criar um novo exercício
    public Exercicio(String nome, int series, int repeticoes, double carga){
        this.nome = nome;
        this.series = series;
        this.repeticoes = repeticoes;
        this.carga = carga;
    }

    // Método para exibir os dados do exercício
    public void  exibirDetalhes(){
        System.out.println("- " + nome + " | " + series + "x" + repeticoes + " | Carga: " + carga + "kg");
    }
}
