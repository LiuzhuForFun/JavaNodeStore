package dfs.utils;

import java.util.UUID;

public final class UUIDutils {
	public static String getUUID(){ 
		String uuid = UUID.randomUUID().toString(); 
		//去掉“-”符号 
		return uuid.replaceAll("-", "");
		}
}
