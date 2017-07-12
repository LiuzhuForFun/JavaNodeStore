package dfs.fileServer;

import java.net.Socket;

import dfs.interfac.FileStrategy;
 

public class FileopThread extends Thread {
	private Socket socket=null;
	private FileStrategy fileStrategy=null;
	public FileopThread(FileStrategy fileStrategy) {
		// TODO Auto-generated constructor stub
		this.fileStrategy=fileStrategy;
	} 
	public boolean isidle()
	{
		return socket==null;
	}
	public synchronized void setSocket(Socket socket)
	{
		this.socket=socket;
		notify();
	}
	public synchronized void run()
	{
		while(true)
		{
			try {
				wait();
				fileStrategy.service(socket);
				socket=null;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
