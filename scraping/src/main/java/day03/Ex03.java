package day03;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Ex03 {
    public static void main(String[] args) {
        try {
            // 웹 페이지로부터 HTML을 가져옵니다.
            Document doc = Jsoup.connect("https://jsoup.org/").get();
            
            // 원하는 요소를 선택합니다.
            Elements newsHeadlines = doc.select("h2");
            
            // 추출된 데이터를 출력합니다.
            for (Element headline : newsHeadlines) {
                System.out.println(headline.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}