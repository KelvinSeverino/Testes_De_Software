package Aplicacao;

import java.lang.reflect.Field;

import Modelo.Calculadora;
import Modelo.CalculadoraInterface;
import Modelo.CalculadoraInterfaceStub;

public class CalculadoraStub {
	public static void main(String [] args)
	{
		//Instancidando classe
		CalculadoraInterface calcdao = new CalculadoraInterfaceStub();
		Calculadora cal = new Calculadora();	
		
				
		System.out.println("Resultado de Soma: "+calcdao.soma(2,2));
		
		//Função SPY
		try
		{
			//Chamando o spy
			Field f = CalculadoraInterfaceStub.class.getDeclaredField("contSoma");
			System.out.println("Spy: "+f.get(calcdao));
		}
		catch(Exception e)
		{
			System.out.println("Erro de acesso a campo");
		}				
	}
}
