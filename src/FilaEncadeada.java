
public class FilaEncadeada {

	Nó início;
	Nó fim;
	int tamanho = 0;

	public boolean estaVazia() {
		return (tamanho == 0);
	}

	public void inserir(String nome) {

		Nó novo = new Nó();
		novo.nome = nome;

		if (estaVazia()) {
			início = fim = novo;

		} else {
			fim.proximo = novo;
			fim = novo;
		}
		tamanho++;
		System.out.println(" -- Nome inserido na fila! -- ");

	}

	public void remover() {

		if (estaVazia()) {
			System.out.println("A fila já está vazia!");
			return;

		}

		String valor = início.nome;

		if (tamanho == 1) {
			início = fim = null;
			tamanho = 0;
		} else {
			início = início.proximo;
			tamanho--;
		}
		System.out.println("A pessoa " + valor + " saiu da fila!");

	}
	
	public void exibir() {
		
		Nó auxiliar = início;
		
		if (estaVazia()) {
			System.out.println(" -- A fila está vazia -- ");
			return;
		}
		
		System.out.println("\n -- Início da fila -- ");
		
		for (int i = 0; i < tamanho; i++) {
			System.out.println(auxiliar.nome);
			auxiliar = auxiliar.proximo;
		}
		
		System.out.println(" -- Fim da fila -- \n");
	}
	
	public void esvaziar() {
		tamanho = 0;
		início = null;
		fim = null;
		
	}
}
