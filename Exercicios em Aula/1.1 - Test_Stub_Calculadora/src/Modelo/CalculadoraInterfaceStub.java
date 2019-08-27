package Modelo;

public class CalculadoraInterfaceStub implements CalculadoraInterface{
	
	public int contSoma;
	
	//Construtor
	public CalculadoraInterfaceStub()
	{
		//Funcionalidade Spy do Stub
		this.contSoma = 0;
	}
	
	//Metodo que realiza a operação matematica
	@Override
	public double soma(int n1, int n2) {
		// TODO Auto-generated method stub
		++this.contSoma;
		
		if(n1 == 1 && n2 == 1)
            return 2;
        
        if(n1 == 2 && n2 == 2)
            return 4;
        
        return 0;
	}

	@Override
	public double subtracao(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double multiplicacao(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double divisao(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
