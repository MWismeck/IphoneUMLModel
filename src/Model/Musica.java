package ReprodutorDeMusica;



import Model.Pagina;public class Musica {
    // Construtor privado para evitar instanciação externa
    private Musica() {
    }
private static Pagina.Musica musica = new Pagina.Musica();

    // Método estático para obter a instância única da classe
    public static Pagina.Musica getmusica() {

        return musica;
    }

    // Método para exibir a mensagem "Musica"
    public void exibirMensagem () {
        System.out.println("Musica");
    }
}
