import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Scanner;
//import org.jsoup;

import java.io.IOException;

public class BookScrapper2{
	public static void main(String args[])
	{
		String url="https://www.amazon.in/ref=nav_logo";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the url of the site:");
		url = sc.nextLine();
		try{
			Document doc = Jsoup.connect(url).get();

			System.out.println("=========================");
//			System.out.println(doc);
			String pageContents;
			pageContents = doc.title()+"\n";
			pageContents += doc.text();
			pageContents=pageContents.trim();

			System.out.println(pageContents);
			
			//for(Element bk:books)
			//{
				//String title = bk.select("h3>a").text(); 
			//	String title = bk.select("div>a").text();
			//	String price=bk.select("Nx9bqj _4b5DiR").text();
				
			//	System.out.println(title+" - "+price);
			//}
			//System.out.println("\n"+doc.getElementsByTag("span"));


			System.out.println("======================");
			//Elements links = doc.select("a[href]");
			//System.out.println(links);

			System.out.println("======================");

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
