package models;

public class Elemento {
    public String id;
    String descricao;
    String dataHora;
    public String nomeCliente;
    String motivo;

    public Elemento(String id, String descricao, String dataHora, String nomeCliente, String motivo) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.nomeCliente = nomeCliente;
        this.motivo = motivo;
    }
}
