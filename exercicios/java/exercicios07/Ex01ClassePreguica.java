package exercicios07.java10092021Polimorfismoeheran�a;

public class Ex01ClassePreguica extends Ex01ClasseAnimal {
	public void sobeArvore() {
		System.out.println("O bixo pregui�a est� subindo uma arvore!");
	}

	@Override
	public void emitirSom() {
		System.out.println("A pregui�a est� emitindo som!");
	}

}
