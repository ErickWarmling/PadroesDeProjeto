package controller;

import model.Pedido;
import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class PedidoController {

    private List<Observador> observadores = new ArrayList<>();

    public void addObservador (Observador obs) {
        this.observadores.add(obs);
    }

    private int idxProduto;
    private List<Produto> tabelaProdutos = new ArrayList<>();
    private List<Pedido> tabelaPedidos = new ArrayList<>();

    public void iniciar() {
        for (Observador obs : observadores) {
            obs.iniciarCompra();
        }
    }

    public void anterior() {
        idxProduto = (idxProduto - 1);
        if (idxProduto == -1)
            idxProduto = tabelaProdutos.size() - 1;

        for (Observador obs : observadores) {
            obs.navegarProdutoAnterior();
        }
    }

    public void posterior () {
        idxProduto = (idxProduto + 1) % tabelaProdutos.size();

        for (Observador obs : observadores) {
            obs.navegarProdutoPosterior();
        }
    }

    public void addProdutoNoProduto() {
        Produto prod = tabelaProdutos.get(idxProduto);
        Pedido alvo = null;
        for (Pedido ped : tabelaPedidos) {
            if (ped.getProduto() == prod) {
                alvo = ped;
                break;
            }
        }
        if (alvo == null) {
            alvo = new Pedido(prod);
            tabelaPedidos.add(alvo);
        } else
            alvo.addQtdade();

        for (Observador obs : observadores) {
            obs.addProdutoPedido();
        }
    }

    public void concluir() {
        tabelaPedidos.clear();
        idxProduto = 0;

        for (Observador obs : observadores) {
            obs.concluirPedido();
        }
    }

    public List<Produto> getTabelaProdutos() {
        return tabelaProdutos;
    }

    public List<Pedido> getTabelaPedidos() {
        return tabelaPedidos;
    }

    public int sizeProduto() {
        return tabelaProdutos.size();
    }

    public int sizePedido() {
        return tabelaPedidos.size();
    }

    public double getPrecoTotal() {
        double total = 0;
        for (Pedido ped : tabelaPedidos) {
            total += ped.getPcoTotal();
        }
        return total;
    }
}

