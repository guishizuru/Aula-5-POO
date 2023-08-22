package ContinuacaoDaAula_Biblioteca;

import java.util.ArrayList;

public class Usuario {
    private int id;
    private String nome;
    private ArrayList<Livro>livrosEmpresados;

    public Usuario(){

    }
    public Usuario(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.livrosEmpresados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Livro> getLivrosEmpresados() {
        return livrosEmpresados;
    }
    public void adicionarLivroEmprestados(Livro livro){
        this.livrosEmpresados.add(livro);
    }

}
