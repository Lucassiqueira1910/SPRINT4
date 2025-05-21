package br.com.fiap.beans;



public class Aviso {


    private int id;
    private String titulo;
    private String descricao;
    private String data_hora;
    private int gravidade;
    private Estacao estacao;

    public Aviso() {
        super();
    }

    public Aviso(int id, String titulo, String descricao, String data_hora, int gravidade) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data_hora = data_hora;
        this.gravidade = gravidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public int getGravidade() {
        return gravidade;
    }

    public void setGravidade(int gravidade) {
        this.gravidade = gravidade;
    }

    public Estacao getEstacao() {
        return estacao;
    }

    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }

    @Override
    public String toString() {
        return "\n\nAviso{" +
                "\nid do aviso =" + id +
                "\ntitulo do aviso ='" + titulo + '\'' +
                "\ndescrição do aviso ='" + descricao + '\'' +
                "\ndata e hora do aviso ='" + data_hora + '\'' +
                "\ngravidade do aviso =" + gravidade +
                "\nestacao do aviso =" + estacao +
                '}';
    }

    // Exibe o aviso de maneira mais legível para o usuário
        public String exibirAviso() {
            return titulo + " (" + estacao.getNome() + ")" + "\n" + descricao;
        }



}
