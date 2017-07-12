package dfs.fileServer;

import java.net.Socket;

import dfs.interfac.FileStrategy;

public class FileopProtocol implements FileStrategy {

	@Override
	public void service(Socket socket) {
		// TODO Auto-generated method stub
		Fileoperator fileoperator=new Fileoperator();
		try {
			//对客户端发来的请求进行操作,123分别进行不同的操作
			switch () {
			case :
				
				break;

			default:
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
