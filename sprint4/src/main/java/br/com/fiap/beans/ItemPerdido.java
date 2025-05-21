package br.com.fiap.beans;



public class ItemPerdido {
    private int id;
    private String nome_descricao;
    private String dataRegistro;



    public ItemPerdido() {
    }

    public ItemPerdido(int id, String nome_descricao, String dataRegistro) {
        this.id = id;
        this.nome_descricao = nome_descricao;
        this.dataRegistro = dataRegistro;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_descricao() {
        return nome_descricao;
    }

    public void setNome_descricao(String nome_descricao) {
        this.nome_descricao = nome_descricao;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }


    @Override
    public String toString() {
        return "\n\nItemPerdido{" +
                "\nid do item perdido =" + id +
                "\nnome e descrição do item perdido ='" + nome_descricao + '\'' +
                "\ndata de registro da solicitação do item perdido ='" + dataRegistro + '\'' +
                '}';
    }
}
