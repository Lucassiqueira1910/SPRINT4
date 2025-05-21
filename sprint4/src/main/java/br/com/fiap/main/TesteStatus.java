package br.com.fiap.main;

import br.com.fiap.model.StatusLinha;
import br.com.fiap.services.StatusLinhaService;

import java.io.IOException;
import java.util.List;

public class TesteStatus {


    public static void main(String[] args) throws IOException {
        StatusLinhaService objService = new StatusLinhaService();
        List<StatusLinha> situacao = objService.getStatusLinha();

        for (StatusLinha p : situacao) {
            StatusLinha status = new StatusLinha();
            status.setCodigo(p.getCodigo());
            status.setSituacao(p.getSituacao());
            System.out.println(status.getCodigo());
            System.out.println(status.getSituacao());
        }
    }
}
