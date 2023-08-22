package ContinuacaoDaAula;

import java.util.ArrayList;

public class Lutador {
    private int id;
    private String nome;
    private ArrayList<ArteMarcial> arteMarciais;

    public Lutador(){

    }
    public Lutador(int id, String nome, ArrayList<ArteMarcial> arteMarciais){
        this.id = id;
        this.nome = nome;
        this.arteMarciais = arteMarciais;
    }
    public void adicionarArteMarcial(ArteMarcial arteMarcial){
        this.arteMarciais.add(arteMarcial);
    }
    public Lutador(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    public int getId(){
        return  id;
    }
    public void setId(int id){
        this.id = id;
    }public String getNome(){
        return nome;
    }public void setNome(String nome) {
        this.nome = nome;
    }
}
