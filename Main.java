public class Main {
    public static void main(String[] args) {
   Aluno aluno = new Aluno();
   aluno.setNome("joão");

   Aluno aluno2 = new Aluno();


   Disciplina disciplina = new Disciplina();
   disciplina.cadastrarAluno(aluno);

        System.out.println(aluno.getNome());

        int valorExterno= 10;
        disciplina.trocarValor(valorExterno);
        System.out.println(valorExterno);
    }
}
