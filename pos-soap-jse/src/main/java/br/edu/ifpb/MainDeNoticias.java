package br.edu.ifpb;

import br.edu.ifpb.soap.noticia.NoticiasSOAP;
import br.edu.ifpb.soap.noticia.NoticiasSOAPService;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 03/09/2018, 10:21:32
 */
public class MainDeNoticias {

    public static void main(String[] args) {
        NoticiasSOAPService noticiasSOAPService = new NoticiasSOAPService();
        NoticiasSOAP noticias = noticiasSOAPService.getNoticiasSOAPPort();

        noticias.todos()
                .forEach(
                        n -> System.out.println(n.getTexto())
                );
//        Noticias noticia = new Noticias();
//        noticia.setAutor("Kiko");
//        noticia.setCorpo("Houve um incendio");
//        noticia.setTexto("Noticia 2");
//
//        noticias.salvar(noticia);

//        noticias.todos()
//                .forEach(
//                        n -> System.out.println(n.getTexto())
//                );
    }
}
