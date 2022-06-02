
public class Principal {

	public static void main(String[] args) {
		
		FilaEncadeada filaenc = new FilaEncadeada();
		
		filaenc.inserir("Ana");
		filaenc.inserir("Bruno");
		filaenc.inserir("Carla");
		filaenc.inserir("Daniel");
		filaenc.inserir("Eduardo");
		
		filaenc.exibir();
		
		filaenc.remover();
		filaenc.remover();
		filaenc.remover();
		
		filaenc.exibir();
		
		filaenc.inserir("Fábio");
		filaenc.inserir("Gustavo");
		filaenc.exibir();
		
		//filaenc.esvaziar();
		filaenc.exibir();
		
	}	
	
}
