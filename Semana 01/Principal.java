package TarefaAvaliativa01;

public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente(70, 1.80);
		Paciente p2 = new Paciente(100, 1.60);
		Paciente p3 = new Paciente(50, 1.85);
		
		System.out.println("IMC = "+ p1.imc() + " Kg/m2");
		p1.diagnostico();
		
		System.out.println("IMC = "+ p2.imc() + " Kg/m2");
		p2.diagnostico();
		
		System.out.println("IMC = " + p3.imc() + " Kg/m2");
		p3.diagnostico();		
	}

}
