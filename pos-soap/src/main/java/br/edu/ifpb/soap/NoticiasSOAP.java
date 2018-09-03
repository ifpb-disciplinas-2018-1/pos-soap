package br.edu.ifpb.soap;

import br.edu.ifpb.domain.Noticias;
import br.edu.ifpb.service.RepositorioDeNoticias;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.Oneway;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 03/09/2018, 10:08:02
 */
@Stateless
@WebService
public class NoticiasSOAP {

    @Inject
    private RepositorioDeNoticias repositorio;

    @Oneway
    public void salvar(Noticias noticia) {
        this.repositorio.salvar(noticia);
    }

    @WebResult(name = "noticia")
    public Noticias[] todos() {
        return this.repositorio
                .todasAsNoticias()
                .toArray(
                        new Noticias[]{}
                );
    }
}
