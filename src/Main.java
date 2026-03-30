import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Gerenciador de Treinos ===");
        System.out.print("Qual é a divisão de treino de hoje?: ");
        String nomeTreino = scanner.nextLine();

        //Criando a ficha com o nome digitado pelo usuário
        Treino treinoDeHoje = new Treino(nomeTreino);

        String continuar = "S"; //Variável de controle do loop

        //O loop irá continuar rodando enquanto o usuário digitar "S" ou "s"
        while (continuar.equalsIgnoreCase("S")){
            System.out.println("\n--- Adicionando novo exercício ---");

            System.out.print("Nome do exercício: ");
            String nomeExercicio = scanner.nextLine();

            System.out.print("Número de séries: ");
            int series = scanner.nextInt();

            System.out.print("Número de repetções: ");
            int repeticoes = scanner.nextInt();

            System.out.print("Carga atual (kg): ");
            double carga = scanner.nextDouble();

            scanner.nextLine();

            Exercicio novoExercicio = new Exercicio(nomeExercicio, series, repeticoes, carga);
            treinoDeHoje.adicionarExercicio(novoExercicio);

            System.out.print("\nDeseja adicionar outro exercício nesta ficha? (S/N): ");
            continuar = scanner.nextLine();

        }

        System.out.println("\n Pronto! Aqui está o resumo do seu treino cadastrado: ");
        treinoDeHoje.mostrarFicha();

        scanner.close();
    }
}