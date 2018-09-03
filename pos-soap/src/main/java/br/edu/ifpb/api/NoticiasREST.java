package br.edu.ifpb.api;

import br.edu.ifpb.domain.Noticias;
import br.edu.ifpb.service.RepositorioDeNoticias;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 03/09/2018, 10:43:05
 */
@Stateless
@Path("news")
public class NoticiasREST {

    @Inject
    private RepositorioDeNoticias repositorio;

    @GET
    public Response todas() {
        List<Noticias> todasAsNoticias = repositorio.todasAsNoticias();
        GenericEntity<List<Noticias>> entity = new GenericEntity<List<Noticias>>(todasAsNoticias) {
        };
        return Response
                .ok()
                .entity(entity)
                .build();
    }
}
