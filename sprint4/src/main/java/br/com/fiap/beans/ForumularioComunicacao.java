package br.com.fiap.beans;



public class ForumularioComunicacao {
    private int id;
    private String tipo;
    private String mensagem;
    private Usuario usuario;


    public ForumularioComunicacao() {
        super();
    }

    public ForumularioComunicacao(int id, String tipo, String mensagem) {
        this.id = id;
        this.tipo = tipo;
        this.mensagem = mensagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "\n\nForumularioComunicacao{" +
                "\nid do formulario =" + id +
                "\ntipo do formulario ='" + tipo + '\'' +
                "\nmensagem do formulario ='" + mensagem + '\'' +
                "\nusuario =" + usuario +
                '}';
    }

    public String exibirUsuario() {
        return "O usuario que enviou esse formulario foi o = " + usuario.getNome();
    }


}

