package Pilha;

public class PilhaEstatica {
	
	private int topo;
	Object pilha[];
	
	public PilhaEstatica(int capacidade){
		pilha=new Object[capacidade];
		topo=0;
	}
	public void push(Object o) throws Exception {
	    if (this.isFull()) {
	      throw new Exception("Pilha cheia");
	    }
	    System.out.println("Adicionando " + o);
	    pilha[topo++] = o;
	  }
	public Object pop() throws Exception {
		if (this.isEmpty()) {
		      throw new Exception("Pilha vazia");
		}
		Object o = pilha[--topo]; //remove elemento
		pilha[topo] = null;
		System.out.println("Removendo " + o);
		return o; 
	}

	public boolean isFull(){
		return topo == pilha.length;
	}
	public boolean isEmpty(){
		return topo == 0;
	}
	public void clear() {
		while (!this.isEmpty()) {
			try {
				this.pop();
			}
			catch (Exception e) { e.printStackTrace(); 
			}
		}
	}
}
