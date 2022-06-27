package Models.Entidades;

public class Pagamento {
    
    private Float valor;
    private String data;
    private int metodoPagamento;
    private int parcelas;
    public Pagamento(Float valor, String data, int metodoPagamento, int parcelas) {
        this.valor = valor;
        this.data = data;
        this.metodoPagamento = metodoPagamento;
        this.parcelas = parcelas;
    }

    public Float getValor() {
        return valor;
    }
    public void setValor(Float valor) {
        this.valor = valor;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public int getMetodoPagamento() {
        return metodoPagamento;
    }
    public void setMetodoPagamento(int metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    public int getParcelas() {
        return parcelas;
    }
    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}