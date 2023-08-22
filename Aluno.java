import java.util.ArrayList;

public class Aluno {
    private  int id;
    private String nome;
    private String atributoBizarro;
    private ArrayList<Double> notas;


    public int getId(){
        return this.id;
    }
    public void setid(int id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void  setNome(String nome){
        if (nome.equalsIgnoreCase("dom bosco")){
            this.nome = "dom bosco ñ, muda o nome, esse é feio.";
        }else{
            this.nome = nome;
        }

    }

    public void setAtributoBizarro(){

    }

}
