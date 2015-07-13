package gamecore.task;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Test {
	public static void main(String[] args) {
		
		try {
			System.out.println(URLDecoder.decode("%E6%B7%B1%E5%85%A5%E6%B5%85%E5%87%BA%EF%BC%88%E4%B9%A6%E7%B1%8D%EF%BC%89","utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
