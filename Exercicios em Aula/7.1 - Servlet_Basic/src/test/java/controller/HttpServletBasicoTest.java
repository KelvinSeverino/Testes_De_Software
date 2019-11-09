package controller;

import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HttpServletBasicoTest {
 
    @Test
    public void doPostTest(){
        HttpServletRequest req = Mockito.mock(HttpServletRequest.class);
        Mockito.when(req.getParameter("nome")).thenReturn("Fabricio");
        HttpServletResponse res = Mockito.mock(HttpServletResponse.class);  
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try{ 
            Mockito.when(res.getWriter()).thenReturn(printWriter);
        } catch (Exception e ) {}
        HttpServletBasico httpSB = new HttpServletBasico();
        httpSB.doGet(req, res);
        String response = null;
        try{
           response =  res.getOutputStream().toString();
        } catch(Exception e){
            
        }
        assertEquals("Seu nome é: Fabricio", stringWriter.toString());        
    }
}
