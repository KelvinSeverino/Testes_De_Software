public class Calculadora {
   public Float dividir(Float x, Float y)
   {
       Float returnedVal;
       try 
       {
           returnedVal = x/y;
           if(y.equals(0.0f))
           {
               throw new ArithmeticException();
           }
       } 
       catch (ArithmeticException ae) 
       {
           //TODO: handle exception
           returnedVal = 0f;
       }
       return returnedVal;
   }
}
