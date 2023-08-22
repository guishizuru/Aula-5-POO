package ContinuacaoDaAula_Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Usuario  usuario = new Usuario(1, "Monica");
        biblioteca.emprestarLivro(usuario, 2);
            
    }
}
