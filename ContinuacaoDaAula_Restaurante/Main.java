package ContinuacaoDaAula_Restaurante;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

    String nome = JOptionPane.showInputDialog(null,"Bem vindo(a) ao nosso resturante ! Digite seu nome");
    Cliente cliente = new Cliente(1,nome);
    cliente.adicionarPedidos();

    JOptionPane.showMessageDialog(null,"A sua conta ficou em:" + cliente.obterconta() + "R$");
    }
}