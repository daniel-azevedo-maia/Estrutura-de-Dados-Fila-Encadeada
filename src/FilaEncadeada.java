
public class FilaEncadeada {

	N� in�cio;
	N� fim;
	int tamanho = 0;

	public boolean estaVazia() {
		return (tamanho == 0);
	}

	public void inserir(String nome) {

		N� novo = new N�();
		novo.nome = nome;

		if (estaVazia()) {
			in�cio = fim = novo;

		} else {
			fim.proximo = novo;
			fim = novo;
		}
		tamanho++;
		System.out.println(" -- Nome inserido na fila! -- ");

	}

	public void remover() {

		if (estaVazia()) {
			System.out.println("A fila j� est� vazia!");
			return;

		}

		String valor = in�cio.nome;

		if (tamanho == 1) {
			in�cio = fim = null;
			tamanho = 0;
		} else {
			in�cio = in�cio.proximo;
			tamanho--;
		}
		System.out.println("A pessoa " + valor + " saiu da fila!");

	}
	
	public void exibir() {
		
		N� auxiliar = in�cio;
		
		if (estaVazia()) {
			System.out.println(" -- A fila est� vazia -- ");
			return;
		}
		
		System.out.println("\n -- In�cio da fila -- ");
		
		for (int i = 0; i < tamanho; i++) {
			System.out.println(auxiliar.nome);
			auxiliar = auxiliar.proximo;
		}
		
		System.out.println(" -- Fim da fila -- \n");
	}
	
	public void esvaziar() {
		tamanho = 0;
		in�cio = null;
		fim = null;
		
	}
}
