package ContinuacaoDaAula_Biblioteca;

public class Livro {
    private int id;
    private String titulo;
    private Boolean estaEmprestado;

    public Livro(){
    }
    public Livro(int id, String titulo, boolean estaEmprestado){
        this.id = id;
        this.titulo = titulo;
        this.estaEmprestado = estaEmprestado;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
    this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getEstaEmprestado() {
        return estaEmprestado;
    }

    public void setEstaEmprestado(Boolean estaEmprestado) {
        this.estaEmprestado = estaEmprestado;
    }
}
