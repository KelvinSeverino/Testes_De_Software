package controller;

import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/httpservlet")
public class HttpServletBasico extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req,
                       HttpServletResponse res){
        String nome = req.getParameter("nome"); 
        String resNome = "Seu nome é: " + nome;
        try{
            res.setContentType("text/html");
            PrintWriter pw = res.getWriter();            
            pw.write(resNome); pw.close();
        } 
        catch (Exception e){}
    }  
}