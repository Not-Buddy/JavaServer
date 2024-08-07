import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;

public class Demo
{
	public static void main(String args[])
	{
		String html = "<html><head><title>First parse</title></head>" + "<body><p>Parsed HTML into a doc.</p></body></html>";

		Document doc = Jsoup.parse(html);
		System.out.println("\nBelow this is just the doc");
		System.out.println(doc);
		System.out.println("\nBelow this is the getElementsbyTag title");
		System.out.println(doc.getElementsByTag("title"));


	}
}
