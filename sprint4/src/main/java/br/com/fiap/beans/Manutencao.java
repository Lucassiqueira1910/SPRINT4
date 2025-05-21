package br.com.fiap.beans;



public class Manutencao {
    private int id;
    private String descricao;
    private String data_hora_inicio;
    private String data_hora_final;
    private String vagoes;

    public Manutencao() {
        super();
    }

    public Manutencao(int id, String descricao, String data_hora_inicio, String data_hora_final, String vagoes) {
        this.id = id;
        this.descricao = descricao;
        this.data_hora_inicio = data_hora_inicio;
        this.data_hora_final = data_hora_final;
        this.vagoes = vagoes;
    }

    @Override
    public String toString() {
        return "\n\nManutencao{" +
                "\nid da manutenção =" + id +
                "\ndescricao da manutenção ='" + descricao + '\'' +
                "\n data e hora do início da manutenção ='" + data_hora_inicio + '\'' +
                "\n data e hora do final da manutenção ='" + data_hora_final + '\'' +
                "\n vagoes ='" + vagoes + '\'' +
                '}';
    }
}
