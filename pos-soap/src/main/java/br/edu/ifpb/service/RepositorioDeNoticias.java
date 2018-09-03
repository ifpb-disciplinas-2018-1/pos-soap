package br.edu.ifpb.service;

import br.edu.ifpb.domain.Noticias;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 03/09/2018, 10:05:50
 */
@Stateless
public class RepositorioDeNoticias {

    @PersistenceContext
    private EntityManager em;

    public void salvar(Noticias noticia) {
        em.persist(noticia);
    }
    
    public List<Noticias> todasAsNoticias(){
        return  em.createQuery("FROM Noticias n", Noticias.class)
                .getResultList();
    }

}
