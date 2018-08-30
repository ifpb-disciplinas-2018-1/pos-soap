package br.edu.ifpb.soap;

import br.edu.ifpb.Calculadora;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 27/08/2018, 10:25:26
 */
@Stateless
@WebService(serviceName = "Calc")
public class CalculadoraSOAP {

    @Inject
    private Calculadora calculadora;

//    @WebMethod(operationName = "somarSimples")
    @WebResult(name = "resposta")
    public int somar(
            @WebParam(name = "c") int c,
            @WebParam(name = "d") int d) {
        return calculadora.somar(c, d);
    }
}
