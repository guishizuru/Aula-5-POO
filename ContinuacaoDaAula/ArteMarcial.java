package ContinuacaoDaAula;

import com.sun.source.tree.UsesTree;

public class ArteMarcial {
   private int id;
   private String nome;

   private String ArteMarciais;
    public ArteMarcial(){}

    public  ArteMarcial(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
