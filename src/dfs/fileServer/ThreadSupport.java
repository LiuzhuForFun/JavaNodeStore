package dfs.fileServer;

import java.net.Socket;
import java.util.ArrayList;

import dfs.interfac.FileStrategy;
 

public class ThreadSupport implements FileStrategy {
	
	private ArrayList<FileopThread> threads=new ArrayList<>();
	private final int INIT_THREAD=50;
	private final int MAX_THREAD=100;
	private FileStrategy fileStrategy=null;
    public ThreadSupport (FileStrategy fileStrategy)
    {
    	this.fileStrategy=fileStrategy;
    	for(int i=0;i<INIT_THREAD;i++)
    	{
    		FileopThread fileopThread=new FileopThread(fileStrategy);
    		fileopThread.start();
    		threads.add(fileopThread);
    	}
    	try {
			Thread.sleep(300);
		} catch (Exception e) {
			// TODO: handle exception
			
		}
    }
  

	@Override
	public void service(Socket socket) {
		// TODO Auto-generated method stub
		FileopThread t=null;
		boolean found=false;
		for(int i=0;i<threads.size();i++)
		{
			t=threads.get(i);
			if(t.isidle())
			{
				found=true;
				break;
			}
		}
		if(!found)
		{
			t =new FileopThread(fileStrategy);
			t.start();
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
			threads.add(t);
		}
		t.setSocket(socket);
		
	}
}
