package br.edu.ifpb;

import br.edu.ifpb.soap.Calc;
import br.edu.ifpb.soap.CalculadoraSOAP;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 27/08/2018, 10:54:15
 */
public class Main {
    public static void main(String[] args) {
        //http://localhost:8080/Calc/CalculadoraSOAP?WSDL
// wsimport -Xnocompile -keep -verbose http://localhost:8080/Calc/CalculadoraSOAP?WSDL

        Calc calc = new Calc();        
        CalculadoraSOAP calculadora = calc.getCalculadoraSOAPPort();
//        int resposta = calculadora.somarSimples(1, 3);
        int resposta = calculadora.somar(1, 3);
        System.out.println("resposta = " + resposta);
        
    }
}
