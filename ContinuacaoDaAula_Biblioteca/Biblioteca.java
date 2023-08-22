package ContinuacaoDaAula_Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Usuario>usuarios;
    private ArrayList<Livro> acervo;
    public Biblioteca(){
        this.usuarios = new ArrayList<>();
        this.acervo = new ArrayList<>();
        adicionarLivrosNoAcervo();
    }
    public Biblioteca(ArrayList<Usuario> usuarios, ArrayList<Livro> acervo){
        this.usuarios = new ArrayList<>();
        this.acervo = new ArrayList<>();
        adicionarLivrosNoAcervo();
    }

    private void adicionarLivrosNoAcervo(){
        this.acervo.add(new Livro(1, "Harry Potter", false));
        this.acervo.add(new Livro(2, "Harry Potter e Harry",false));
        this.acervo.add(new Livro(3, "Harry Potter e Potter",true));
    }
    public void emprestarLivro(Usuario usuario, int idLivro){
        boolean livroExiste = false;
        Livro livro = null;
        for (int i = 0; i < acervo.size(); i++) {
            if (idLivro == acervo.get(i).getId()){
                livroExiste = true;
                livro = acervo.get(i);
            }
        }
        if(!livroExiste){
            System.out.println("O livro não existe no acervo");
            return;
        }
        if(livro.getEstaEmprestado()){
            System.out.println("O livro inserido ja foi emprestado..");
            return;
        }
        livro.setEstaEmprestado(true);
        usuario.adicionarLivroEmprestados(livro);
        System.out.println("O livro foi emprestado para o usuario" + usuario.getNome());
    }

    public ArrayList<Livro> getAcervo() {
        return acervo;
    }

    public void adicionarLivro(Livro livro){
        acervo.add(livro);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

}
