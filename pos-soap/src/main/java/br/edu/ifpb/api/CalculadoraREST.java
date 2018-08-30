package br.edu.ifpb.api;

import br.edu.ifpb.Calculadora;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 27/08/2018, 10:20:03
 */
@Stateless
@Path("/calc")
public class CalculadoraREST {

    @Inject
    private Calculadora service;

    @GET
//    @Path("{a}-{b}")
    public Response somar(
            @PathParam("a") int a, @PathParam("b") int b) {
        return Response
                .ok()
                .entity(service.somar(a, b))
                .build();
    }
}
