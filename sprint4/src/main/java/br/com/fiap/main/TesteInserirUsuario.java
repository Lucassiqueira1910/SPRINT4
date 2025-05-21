package br.com.fiap.main;


import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.beans.Usuario;

import javax.swing.*;
import java.sql.SQLException;

public class TesteInserirUsuario {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Usuario objUsuario = new Usuario();

        UsuarioDAO dao = new UsuarioDAO();

        objUsuario.setId(inteiro("ID"));
        objUsuario.setNome(texto("Nome"));
        objUsuario.setSenha(texto("Senha"));
        objUsuario.setDataCriacao(texto("Data de criação do usuario"));


        System.out.println(dao.inserir(objUsuario));
    }
}
