package br.com.fiap.main;

import br.com.fiap.beans.*;

import javax.swing.*;

public class TesteSistema {

        static String texto(String j){
            return JOptionPane.showInputDialog(j);
        }

        static int inteiro(String j){
            return Integer.parseInt(JOptionPane.showInputDialog(j));
        }

        static double real(String j){
            return Double.parseDouble(JOptionPane.showInputDialog(j));
        }


    public static void main(String[] args) {


        Linha objLinha = new Linha(
                inteiro("Inisira o ID da Linha "),
                texto("Insira o nome da Linha ")
        );

        Estacao objEstacaoOrigem = new Estacao(
                inteiro("Insira o ID da Estação de Origem "),
                texto("Insira o nome da Estação de Origem "),
                inteiro("Insira a Capacidade da Estação ")
        );

        objEstacaoOrigem.setLinha(objLinha);

        Estacao objEstacaoDestino = new Estacao(
                inteiro("Insira o ID da Estação de Destino "),
                texto("Insira o nome da Estação de Destino "),
                inteiro("Insira a Capacidade da Estação")
        );

        objEstacaoDestino.setLinha(objLinha);

        Aviso objAviso = new Aviso(
                inteiro("Insira o ID do Alerta "),
                texto("Insira o Título do Alerta "),
                texto("Insira o Descrição do Alerta "),
                texto("Insira a Data do Início e Fim do Aleta "),
                inteiro("Insira a Gravidade do Alerta ")
        );


        objAviso.setEstacao(objEstacaoOrigem);

        Trem objTrem = new Trem(
                inteiro("Insira o ID do trem "),
                texto("Insira o Código de Identificação do trem "),
                texto("Insira o Status do trem ")
        );

        objTrem.setLinha(objLinha);
        objTrem.setUltimaEstacao(objEstacaoOrigem);

        Rota objRota = new Rota(
                inteiro("Insira o ID da Rota "),
                real("Insira a Distância da Rota "),
                real("Insira a Velocidade Média da Rota ")
        );

        objRota.setEstacaoOrigem(objEstacaoOrigem);
        objRota.setEstacaoDestino(objEstacaoDestino);



        Localizacao objLocalizacao = new Localizacao(
                inteiro("Insira o ID da Localização "),
                real("Insira a Latitude da Localização "),
                real("Insira a Longitude da Localização ")
        );


        Manutencao objManutencao = new Manutencao(
                inteiro("Insira o Id da Manutenção "),
                texto("Insira o Título da Manutenção "),
                texto("Insira a Data do Início da Manutenção "),
                texto("Insira a Data do Final da Manutenção "),
                texto("Insira Quantos Vagões Foram Afetados e sua Causa ")

        );
        //int id, String nome, String senha, ItemPerdido itensPerdidos
        Usuario objUsuario = new Usuario(
                inteiro("Insira o ID do Usuário "),
                texto("Insira o Nome do Usuário "),
                texto("Insira a Senha do Usuário "),
                texto("Insira a Data de Criação do Usuário ")

        );



        //int id, String tipo, String mensagem, Usuario usuario
        ForumularioComunicacao objForm = new ForumularioComunicacao(
                inteiro("Insira o ID do Formulario de Comunicação "),
                texto("Insira o tipo de mensagem "),
                texto("Insira a Mensagem que Gostaria de Enviar ")
        );

        objForm.setUsuario(objUsuario);

        //int id, String nome_descricao, String dataRegistro, String encontrado
        ItemPerdido objItemP = new ItemPerdido(
                inteiro("Insira o Id do Item Perdido "),
                texto("Insira o Nome e a Descrição do seu Item Perdido "),
                texto("Insira a Data que Você Está Solicitando o seu Item Perdido  ")

        );

        objEstacaoOrigem.setItensPerdidos(objItemP);
        objUsuario.setItensPerdidos(objItemP);
        objEstacaoDestino.setItensPerdidos(objItemP);






        System.out.println(objLinha);
        System.out.println(objEstacaoOrigem);
        System.out.println(objEstacaoDestino);
        System.out.println(objAviso);
        System.out.println(objTrem);
        System.out.println(objRota);
        System.out.println(objManutencao);
        System.out.println(objForm);
        System.out.println(objItemP);
        System.out.println(objUsuario);


        //quatro métodos de relevância

        System.out.println("Exibição do Alerta:\n" + objAviso.exibirAviso());

        System.out.println("Tempo de Viagem da Rota: " + objRota.calcularTempoViagem() + "hrs");

        System.out.println("Exibição de Informações da Estação:\n" + objEstacaoOrigem.exibirInformacoes());

        System.out.println("Quem foi o Usuario que enviou essa mensagem?:\n" + objForm.exibirUsuario());



    }











}


