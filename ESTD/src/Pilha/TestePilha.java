package Pilha;

public class TestePilha {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PilhaEstatica p = new PilhaEstatica(10);
		p.push("eduardo");
		p.push("luan");
		p.push("mateus");
		p.push("allan");
		
		String ultimo = (String) p.pop();
	}

}
