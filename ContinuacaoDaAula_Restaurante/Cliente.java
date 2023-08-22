package ContinuacaoDaAula_Restaurante;

import javax.swing.*;
import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nome;
    private Pedido pedido;

    public Cliente(){
    }
    public Cliente(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.pedido = new Pedido();
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

    public Pedido getPedido() {
        return pedido;
    }
    public double obterconta(){
        return pedido.getPreco();
    }
        public void adicionarPedidos() {
        String cardapio = Restaurante.retornarPratosNoCardapio();
        Boolean desejaAdicionarMaisPratos = true;
        while (desejaAdicionarMaisPratos) {
            String resposta = JOptionPane.showInputDialog("Digite o prato que deseja pedir : \n\n" + cardapio);
            int pratosEscolhidos = Integer.parseInt(resposta) - 1;
            this.pedido.adicionarPrato(Restaurante.getCardapio().get(pratosEscolhidos));

            String repetir = JOptionPane.showInputDialog("deseja adicionar mais prato no pedido ? [1] sim [2] nao");
            int escolhaRepeticao = Integer.parseInt(repetir);
            if(escolhaRepeticao == 2 ){
                desejaAdicionarMaisPratos = false;
            }
        }
    }
}
