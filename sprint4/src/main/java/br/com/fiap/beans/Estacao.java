package br.com.fiap.beans;



public class Estacao {
    private int id;
    private String nome;
    private int capacidade;
    private Linha linha;
    private ItemPerdido itensPerdidos;

    public Estacao() {
        super();
    }

    public Estacao(int id, String nome, int capacidade) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Linha getLinha() {
        return linha;
    }

    public void setLinha(Linha linha) {
        this.linha = linha;
    }

    public ItemPerdido getItensPerdidos() {
        return itensPerdidos;
    }

    public void setItensPerdidos(ItemPerdido itensPerdidos) {
        this.itensPerdidos = itensPerdidos;
    }

    @Override
    public String toString() {
        return "\n\nEstacão{" +
                "\nid da estação =" + id +
                "\nnome da estação ='" + nome + '\'' +
                "\ncapacidade de pessoas na  estação =" + capacidade +
                "\nlinha da estação =" + linha +
                "\nitensPerdidos da estação =" + itensPerdidos +
                '}';


    }

    // Retorna as principais informações sobre a estação
    public String exibirInformacoes() {
        return "Estação: " + nome +
                "\nLinha: " + linha.getNome();
    }
}

