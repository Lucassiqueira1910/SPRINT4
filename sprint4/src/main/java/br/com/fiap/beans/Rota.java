package br.com.fiap.beans;

public class    Rota {

    private int id;
    private Estacao estacaoOrigem;
    private Estacao estacaoDestino;
    private double distancia;
    private double velMedia;

    public Rota() {
        super();
    }

    public Rota(int id, double distancia, double velMedia) {
        this.id = id;
        this.distancia = distancia;
        this.velMedia = velMedia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estacao getEstacaoOrigem() {
        return estacaoOrigem;
    }

    public void setEstacaoOrigem(Estacao estacaoOrigem) {
        this.estacaoOrigem = estacaoOrigem;
    }

    public Estacao getEstacaoDestino() {
        return estacaoDestino;
    }

    public void setEstacaoDestino(Estacao estacaoDestino) {
        this.estacaoDestino = estacaoDestino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getVelMedia() {
        return velMedia;
    }

    public void setVelMedia(double velMedia) {
        this.velMedia = velMedia;
    }

    @Override
    public String toString() {
        return "\n\nRota{" +
                "\nid =" + id +
                "\nestacaoOrigem =" + estacaoOrigem +
                "\nestacaoDestino =" + estacaoDestino +
                "\ndistancia =" + distancia +
                "\nvel_media =" + velMedia +
                '}';
    }

    // Calcula o tempo de viagem estimado da rota
    public double calcularTempoViagem() {
        return distancia / velMedia;
    }

}
