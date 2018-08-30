package br.edu.ifpb;

import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 27/08/2018, 10:19:15
 */
@Stateless
public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }
}
