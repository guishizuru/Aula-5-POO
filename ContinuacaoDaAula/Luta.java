package ContinuacaoDaAula;

public class Luta {
    private Lutador lutador1;
    private Lutador lutador2;

    public Luta(Lutador lutador1, Lutador lutador2){
        this.lutador1 = lutador1;
        this.lutador2 = lutador2;
    }
    public Lutador getLutador1(){
        return lutador1;
    }public void setLutador1(Lutador lutador1){
        this.lutador1 = lutador1;
    }public Lutador getLutador2(){
        return  lutador2;
    }public  void setLutador2(Lutador lutador2){
        this.lutador2 = lutador2;
    }
}
