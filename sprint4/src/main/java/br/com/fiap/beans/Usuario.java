package br.com.fiap.beans;

public class Usuario {
    private int id;
    private String nome;
    private String senha;
    private String dataCriacao;
    private ItemPerdido itensPerdidos;

    public Usuario() {
        super();
    }

    public Usuario(int id, String nome, String senha, String dataCriacao) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.dataCriacao = dataCriacao;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public ItemPerdido getItensPerdidos() {
        return itensPerdidos;
    }

    public void setItensPerdidos(ItemPerdido itensPerdidos) {
        this.itensPerdidos = itensPerdidos;
    }

    @Override
    public String toString() {
        return "\n\nUsuario{" +
                "\nid do usuario=" + id +
                "\nnome do usuario ='" + nome + '\'' +
                "\nsenha do usuario ='" + senha + '\'' +
                "\ndata de criação do usuario='" + dataCriacao + '\'' +
                "\nitensPerdidos=" + itensPerdidos +
                '}';
    }
}
