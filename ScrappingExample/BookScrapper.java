import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
//import org.jsoup;

import java.io.IOException;

public class BookScrapper{
	public static void main(String args[])
	{
		String url="https://books.toscrape.com/";
		try{
			Document document = Jsoup.connect(url).get();
			Elements books = document.select(".product_pod");
			System.out.println("=========================");
			System.out.println("Books - Web Scrapper");
			for(Element bk:books)
			{
				//String title = bk.select("h3>a").text(); 
				String title = bk.select("h3>a").text();
				String price=bk.select(".price_color").text();
				
				System.out.println(title+" - "+price);
			}

			System.out.println("======================");

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
