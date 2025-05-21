package br.com.fiap;

import br.com.fiap.beans.Usuario;
import br.com.fiap.bo.UsuarioBO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.Provider;

import java.sql.SQLException;
import java.util.ArrayList;

@Provider
@Path("/usuario")
public class UsuarioResource {

    private UsuarioBO usuarioBO = new UsuarioBO();

    // Selecionar
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Usuario> selecionarRs() throws ClassNotFoundException, SQLException, SQLException {
        return  (ArrayList<Usuario>)  usuarioBO.selecionarBo();
    }

    // Inserir
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirRS (Usuario usuario, @Context UriInfo uriInfo) throws SQLException, ClassNotFoundException {

        usuarioBO.inserirBo(usuario);

        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(Integer.toString(usuario.getId()));;

        return Response.created(builder.build()).build();
    }

    // Atuallizar
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarRS(Usuario usuario, @PathParam("id") int id) throws SQLException, ClassNotFoundException {

        usuarioBO.atualizarBo(usuario);

        return Response.ok().build();
    }

    //deletar
    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)

    public Response deletarRS(@PathParam("id") int id) throws SQLException, ClassNotFoundException {
        usuarioBO.deletarBo(id);

        return Response.ok().build();
    }

}

