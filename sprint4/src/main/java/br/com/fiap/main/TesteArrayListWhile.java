package br.com.fiap.main;

import br.com.fiap.beans.ItemPerdido;

import javax.swing.*;
import java.util.ArrayList;

public class TesteArrayListWhile {

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

        ArrayList<ItemPerdido> listaItemPerdido = new ArrayList<>();

        ItemPerdido objitemp = null;

        int condicao = 0;


        while (condicao == 0){

            objitemp = new ItemPerdido();
            objitemp.setId(inteiro(" Insira o id "));
            objitemp.setNome_descricao(texto(" Insira o nome e a descrição do item perdido "));
            objitemp.setDataRegistro(texto(" Insira a data de registro do item perdido "));

            listaItemPerdido.add(objitemp);

            condicao = JOptionPane.showConfirmDialog(null,
                    "Cadastrar mais itens perdidos?",
                    "CADASTRO DE ITEM PERDIDO",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);


        for (ItemPerdido a : listaItemPerdido){
            System.out.println(
                    "\n\nID:"+ a.getId() +
                            "\nNOME E DESCRIÇÃO:" + a.getNome_descricao() +
                            "\nDATA DE REGISTRO:" + a.getDataRegistro()
            );
        }

        }
    }
}
