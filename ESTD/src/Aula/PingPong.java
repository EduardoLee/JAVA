package Aula;

public class PingPong extends Thread {
	private String palavra;
	public PingPong(String palavra) {
		this.palavra = palavra;
	}
	
	public void run() {//implementa o metodo run
		for (int i=0; i<10; i++){
			System.out.print(palavra + " "); 
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main (String [] args){
		Thread t1 = new PingPong("ping"); 
		Thread t2 = new PingPong("pong");
		t1.start(); 
		t2.start();
		System.out.println("Finalizando main...");
	}
}
