package ContinuacaoDaAula_Restaurante;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private int idCliente;
    private ArrayList<Prato> pratos;
    private double preco;
    public Pedido(){
        this.pratos = new ArrayList<>();
    }
    public Pedido( int id, int idCliente){
        this.id = id;
        this.idCliente = idCliente;
        this.pratos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<Prato> getPratos() {
        return pratos;
    }

    public void adicionarPrato(Prato prato){
        this.pratos.add(prato);
        this.preco = this.preco + prato.getPreco();
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
}
