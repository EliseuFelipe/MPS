package Entidades;

public class Produto {
    
    private String nome;
    private Float valor;
    private String descricao;
    private String imagem;

    public Produto(String nome, Float valor, String descricao, String imagem) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }  

}