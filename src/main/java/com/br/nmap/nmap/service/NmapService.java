package com.br.nmap.nmap.service;

import java.net.Socket;

import org.springframework.stereotype.Service;

@Service
public class NmapService {

	private String output = "";
	private volatile boolean stop = false;

	public void PortScanner(String ip) {
		if (ip == null) {
			ip = "127.0.0.1";
		}
		int timeout = 200;
		int startPort = 1;
		int endPort = 65535;
		if(stop) {
			stop = false;
		}
		for (int port = startPort; port <= endPort; port++) {
			try {
				Socket socket = new Socket();
				if (stop) {
					socket.close();
					break;
				}
				socket.connect(new java.net.InetSocketAddress(ip, port), timeout);
				socket.close();
				output += "Porta " + port + " aberta: \n";
				System.out.println("Porta " + port + " aberta: \n");
			} catch (Exception ex) {

			}
		}
	}

	public void stopScan() {
		output = "";
		stop = true;
	}

	public String getOutput() {
		return output;
	}
}
