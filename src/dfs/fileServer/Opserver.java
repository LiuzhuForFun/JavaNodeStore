package dfs.fileServer;

import java.net.ServerSocket;
import java.net.Socket;

import dfs.interfac.FileStrategy;

 

public class Opserver {

	public Opserver(int port,FileStrategy fileStrategy)
		{
		 
		 	try{
			ServerSocket serverSocket=new ServerSocket(port);
			while(true)
			{
				//等待条件
				Socket socket=serverSocket.accept();
				fileStrategy.service(socket);
			}
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
