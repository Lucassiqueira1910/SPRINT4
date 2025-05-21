package br.com.fiap.main;

import br.com.fiap.beans.Usuario;
import br.com.fiap.dao.UsuarioDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TesteSelecionar {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UsuarioDAO objAlunoDao = new UsuarioDAO();

        List<Usuario> listaAlunos = (ArrayList<Usuario>) objAlunoDao.selecionar();

        if(listaAlunos != null){
            // foreach
            for(Usuario aluno : listaAlunos) {
                System.out.println(
                        aluno.getId() + " " +
                                aluno.getNome() + " " +
                                aluno.getSenha() + " " +
                                aluno.getDataCriacao()  + " "
                );
            }
        }
    }
}
