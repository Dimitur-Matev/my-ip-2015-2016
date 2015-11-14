package ip_availability;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private final int port;
	private boolean running = true;

	public Server(int port) {
		this.port = port;
	}

	public void startServer() throws IOException {

		final ServerSocket serverSocket = new ServerSocket(port);
		while (running) {
			final Socket socket = serverSocket.accept();
			final ClientHandler client = new ClientHandler(this ,socket);
			client.run();
		}
		serverSocket.close();

	}
	
	public void stopServer(){
		running = false;
	}
}