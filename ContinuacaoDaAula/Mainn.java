package ContinuacaoDaAula;

import java.util.ArrayList;

public class Mainn {
    public static void main(String[] args) {
        Lutador lutador1 = new Lutador(1,"Ryu",new ArrayList<>());
        Lutador lutador2 = new Lutador(2,"Sagat",new ArrayList<>());
    //    lutador1. getArteMarciais

        Luta luta = new Luta(new Lutador(), new Lutador());

  //      System.out.println(luta.getLutador1().get().get(0));
    }
}
