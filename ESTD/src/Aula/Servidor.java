package Aula;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main (String args[]) throws IOException{
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");
		
		Socket socket = servidor.accept();
		System.out.println("Conexão recebida!");
	}
}
