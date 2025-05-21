package br.com.fiap.dao;

import br.com.fiap.beans.Usuario;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public Connection minhaConexao;

    public UsuarioDAO() throws SQLException, ClassNotFoundException {
        super();

        this.minhaConexao = new ConexaoFactory().conexao();
    }

    public String inserir(Usuario usuario) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("INSERT INTO T_FIAP_USUARIO VALUES ( ?, ?, ?, ? )");

        stmt.setInt(1, usuario.getId());
        stmt.setString(2, usuario.getNome());
        stmt.setString(3, usuario.getSenha());
        stmt.setString(4, usuario.getDataCriacao());

        stmt.execute();
        stmt.close();

        return"Usuário Cadastrado com Sucesso!";
    }

    // Delete
    public String deletar(int id) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Delete from T_FIAP_USUARIO where ID = ?");
        stmt.setInt(1, id);

        stmt.execute();
        stmt.close();

        return  "Usuario deletado com sucesso!";
    }

    // UpDate
    public String atualizar(Usuario usuario) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Update T_FIAP_USUARIO set NOME = ?, SENHA = ?, DATA_CRIACAO = ? where ID = ?");
        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getSenha());
        stmt.setString(3, usuario.getDataCriacao());
        stmt.setInt(4, usuario.getId());

        stmt.executeUpdate();
        stmt.close();

        return "Usuario atualizado com sucesso!";
    }

    // Select
    public List<Usuario> selecionar() throws SQLException {
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("select * from T_FIAP_USUARIO");
        ResultSet rs = stmt.executeQuery();

        while(rs.next()){
            Usuario usuario = new Usuario();
            usuario.setId(rs.getInt(1));
            usuario.setNome(rs.getString(2));
            usuario.setSenha(rs.getString(3));
            usuario.setDataCriacao(rs.getString(4));
            listaUsuarios.add(usuario);
        }
        return listaUsuarios;
    }

}
