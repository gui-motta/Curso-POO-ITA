package TarefaAvaliativa01;

public class Paciente {
	double peso;
	double altura;
	double imc;
	
	Paciente(double peso, double altura){
		this.peso = peso;
		this.altura = altura;
	}
	
	public double imc() {
		imc = (peso/(altura*altura));
		return imc;
	}
	
	public void diagnostico() {
		
		if(imc<16)
			System.out.println("Baixo Peso muito grave");
		if(imc>=16 && imc<=16.99)
			System.out.println("Baixo Peso Grave");
		if(imc>=17 && imc<=18.49)
			System.out.println("Baixo Peso");
		if(imc>=18.50 && imc<=24.99)
			System.out.println("Peso Normal");
		if(imc>=25 && imc<=29.99)
			System.out.println("Sobrepeso");
		if(imc>=30 && imc<=34.99)
			System.out.println("Obesidade Grau I");
		if(imc>=35 && imc<=39.99)
			System.out.println("Obesidade Grau II");
		if(imc>=40)
			System.out.println("Obesidade Grau III (Obesidade Mórbida");
		}
		
	}
