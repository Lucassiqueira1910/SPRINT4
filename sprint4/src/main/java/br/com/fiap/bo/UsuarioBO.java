package br.com.fiap.bo;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioBO {

    UsuarioDAO usuarioDAO;

    // Selecionar
    public ArrayList<Usuario> selecionarBo() throws ClassNotFoundException, SQLException {
        usuarioDAO = new UsuarioDAO();
        // Regra de negocios

        return (ArrayList<Usuario>) usuarioDAO.selecionar();
    }

    // Inserir
    public void inserirBo(Usuario usuario) throws ClassNotFoundException, SQLException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        // Regra de negocios
        usuarioDAO.inserir(usuario);
    }

    // Atualizar
    public void atualizarBo (Usuario usuario) throws ClassNotFoundException, SQLException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        // Regra de negocios
        usuarioDAO.atualizar(usuario);
    }

    // Deletar
    public void deletarBo (int id) throws ClassNotFoundException, SQLException {
        UsuarioDAO alunoDao = new UsuarioDAO();
        // Regra de negocios
        alunoDao.deletar(id);
    }


}

