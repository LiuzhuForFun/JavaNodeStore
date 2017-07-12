package dfs.interfac;

public interface FileOperation {
    /*
     * 这是文件接口的函数：
     * 对于客户节点要提供 fileupload功能：
     * 1.注册，获取uuid和主节点，备份节点的信息
     * 文件加密，文件压缩，可能用到Huffman
     * 2.删除（向FileSever）申请
     * 3.下载
     * ------------------------------
     * 对于存储节点
     * 向备份节点提出文件删除，文件上传等操作
     * 
     *对于服务节点，返回文件信息。
     * */
	public void fileupload(String ip,int port);
	public void filedownload(String uuid,String ip,int port);
	public void removefile(String uuid,String ip,int port);
}
