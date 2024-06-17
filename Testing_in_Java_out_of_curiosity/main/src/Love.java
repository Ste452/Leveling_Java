package Testing_in_Java_out_of_curiosity.main.src;


public class Love {
    // Atributos para caracterizar o amor
    private String sentimento;
    private String intensidade;
    private String duracao;

    // Construtor
    public Love(String sentimento, String intensidade, String duracao) {
        this.sentimento = sentimento;
        this.intensidade = intensidade;
        this.duracao = duracao;
    }

    // Métodos para obter informações sobre o amor
    public String getSentimento() {
        return sentimento;
    }

    public String getIntensidade() {
        return intensidade;
    }

    public String getDuracao() {
        return duracao;
    }

    // Método para descrever o amor
    public void descrever() {
        System.out.println("Amor é " + sentimento + ", com uma intensidade de " + intensidade + " e uma duração de " + duracao + ".");
    }

    // Método para intensificar o amor
    public void intensificar(String novaIntensidade) {
        this.intensidade = novaIntensidade;
        System.out.println("A intensidade do amor agora é " + novaIntensidade + ".");
    }

	public static void main(String[] args) {
		 
		// Criando uma instância da classe Amor
        Love meuAmor = new Love("incondicional", "alta", "para sempre");

        // Descrevendo o amor
        meuAmor.descrever();

        // Intensificando o amor
        meuAmor.intensificar("muito alta");

        // Descrevendo o amor novamente
        meuAmor.descrever();

	}

}
