package Models.Entidades;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    
    private List<Produto> listaDeProdutos = new ArrayList<>();
    private Float valorTotal;
    private String localDeColeta;
    private String localDeEntrega;
    private String notaFiscal;
    private String status;

    public ListaDeCompras(List<Produto> listaDeProdutos, Float valorTotal, String localDeColeta, String localDeEntrega,
            String notaFiscal, String status) {
        this.listaDeProdutos = listaDeProdutos;
        this.valorTotal = valorTotal;
        this.localDeColeta = localDeColeta;
        this.localDeEntrega = localDeEntrega;
        this.notaFiscal = notaFiscal;
        this.status = status;
    }

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }
    public void setListaDeProdutos(List<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }
    public Float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public String getLocalDeColeta() {
        return localDeColeta;
    }
    public void setLocalDeColeta(String localDeColeta) {
        this.localDeColeta = localDeColeta;
    }
    public String getLocalDeEntrega() {
        return localDeEntrega;
    }
    public void setLocalDeEntrega(String localDeEntrega) {
        this.localDeEntrega = localDeEntrega;
    }
    public String getNotaFiscal() {
        return notaFiscal;
    }
    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}