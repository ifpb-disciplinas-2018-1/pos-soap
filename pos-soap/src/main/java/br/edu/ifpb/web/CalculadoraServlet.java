/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.web;

import br.edu.ifpb.soap.CalculadoraSOAP;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Ricardo Job
 */
@WebServlet(name = "CalculadoraServlet", urlPatterns = {"/calc"})
public class CalculadoraServlet extends HttpServlet {

    @WebServiceRef(
            wsdlLocation = "http://localhost:8080/Calc/CalculadoraSOAP?WSDL"
    )
    private CalculadoraSOAP service;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcuServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Soma: " + this.service.somar(2, 3) + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
