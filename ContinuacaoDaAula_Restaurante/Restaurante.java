package ContinuacaoDaAula_Restaurante;

import java.util.ArrayList;

public class Restaurante {
    private static ArrayList<Prato> cardapio;

    public Restaurante() {
        inicializaCardapio();
    }

    private static void inicializaCardapio() {
        cardapio = new ArrayList<>();
        cardapio.add(new Prato(1, "feijada", 45.00));
        cardapio.add(new Prato(2, "Baião de dois", 32.00));
        cardapio.add(new Prato(3, "Strogonoff", 42.00));

    }


  public static String retornarPratosNoCardapio(){
        inicializaCardapio();
        StringBuilder pratos = new StringBuilder();
        for (int i = 0; i < cardapio.size() ; i++) {
            pratos.append(i+1)
                    .append(".  ")
                    .append(cardapio.get(i).getNome())
                    .append(" - ")
                    .append(cardapio.get(i).getPreco())
                    .append("R$\n");
        }
        return  pratos.toString();
    }

    public static ArrayList<Prato> getCardapio() {
        return cardapio;
    }

    public void adicionarNoCardapio(Prato prato){
        this.cardapio.add(prato);

    }
}
