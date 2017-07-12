package dfs.client;

public class FileClient {

	public static void main(String[]args)
	{
		ClientFileOperator clientFileOperator=new ClientFileOperator();//构建操作类
		//读取FileServer.properties信息，进行通信
		if(args[0].equals("upload"))
		{
			//上传
			//args[1]=filename
		}
		else if(args[0].equals("download"))
		{
			//args[1]=uuid
		}
		else if(args[0].equals("remove"))
		{
			//args[1]=uuid
		}
	}
}
