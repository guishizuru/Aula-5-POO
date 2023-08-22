import java.util.ArrayList;

public class Disciplina {
    private ArrayList<Aluno> alunos;
    public Disciplina(){
    this.alunos = new ArrayList<>();
    }
    public ArrayList<Aluno> getAlunos(){
        return this.alunos;
    }
    public void cadastrarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.setNome("Matheus");
    }
    public  void trocarValor(int valor){
        valor = valor + 1;
    }

}

