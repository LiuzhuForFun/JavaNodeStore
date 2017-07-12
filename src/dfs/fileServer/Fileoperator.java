package dfs.fileServer;

import dfs.interfac.FileOperation;
//实现类
public class Fileoperator implements FileOperation {
    /*
     * 实现向Client节点发送文件信息，
     * FileClient要上传文件至云端，首先发送文件信息，
     * 文件名称，文件大小等信息，然后服务器将信息封装成记录，放
     * 到Map集合或者List集合中。管理这些文件，然
     * 后回传主备份服务器信息，UUID等信息给客户端，
     * 由客户端完成操作
     */
	@Override
	public void fileupload(String ip, int port) {
		// TODO Auto-generated method stub
        
	}
   /*
    * 返回文件所在主存储节点和副存储节点ip，port由客户端完成操作
    * 
    * */
	@Override
	public void filedownload(String uuid, String ip, int port) {
		// TODO Auto-generated method stub

	}
	/*
	 * 返回文件所在主存储节点和副存储节点ip，port，由客户端完成操作
	 * */

	@Override
	public void removefile(String uuid, String ip, int port) {
		// TODO Auto-generated method stub

	}

}
