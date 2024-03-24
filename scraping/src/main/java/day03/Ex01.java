package day03;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex01 {

	public static void main(String[] args) {
		try {
//			java.net.URL url=new URL("https://www.busan.go.kr/nbnews/1567932?curPage=&srchBeginDt=2022-06-09&srchEndDt=2023-06-09&searchKey=&searchText=");
			java.net.URL url=new URL("https://getbootstrap.com/docs/3.4/css/#tables");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println(url.getRef());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
