package examPdf;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import com.itextpdf.text.Paragraph;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sr = new Scanner(System.in);
		
		boolean repeat  = true ;
		
		while (repeat) {
		System.out.println("=========================Select number from the given numbers=====================================");
		System.out.println("select number 1 to crreat 100 pdf file ");
		System.out.println("Select number 2 to search for a word ");
		System.out.println("Select number 0 to stop the program");

        int Select = sr.nextInt();
		if (Select == 1) {
		try 
		{
			int count = 1;
			for (count = 0 ; count <=100 ; count++) {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\exam\\test"+count+".pdf"));
			document.open();
			document.add(new Paragraph("Qaboos bin Said Al Said (Arabic: قابوس بن سعيد آل سعيد, IPA: [qaː.buːs bin sa.ʕiːd ʔaːl sa.ʕiːd]; 18 November 1940 – 10 January 2020) was Sultan of Oman from 23 July 1970 until his death in 2020. A fifteenth-generation descendant of the founder of the House of Al Said, [3] he was the longest-serving leader in the Middle East and Arab world at the time of his death,[4] having ruled for almost half a century.\r\n"
					+ "\r\n"
					+ "The only son of Said bin Taimur, Sultan of Muscat and Oman, Qaboos was educated in Suffolk, England. After graduating from the Royal Military Academy Sandhurst, he served briefly in the British Army. He returned to Oman in 1966 and was the subject of considerable restrictions from his father. In 1970, Qaboos ascended to the Omani throne after overthrowing his father in a coup d'état, with British support. The country was subsequently renamed the Sultanate of Oman.\r\n"
					+ "\r\n"
					+ "As sultan, Qaboos implemented a policy of modernization and ended Oman's international isolation.[5][6] His reign saw a rise in living standards and development in the country, the abolition of slavery, the end of the Dhofar Rebellion, and the promulgation of Oman's constitution. Suffering from poor health in later life, Qaboos died in 2020. He had no children, so he entailed the royal court to reach consensus on a successor upon his death. As a precaution he hid a letter which named his successor in case an agreement was not achieved. After his death the royal court decided to view Qaboos's letter and named his intended successor, his cousin Haitham bin Tariq, as sultan.[7]"));
			document.close();
			}
		}catch(Exception o)
		{
			System.out.println(o);
		}
		System.out.println("your pdf file have been crerated ");
		System.out.println("please cheack this path to find the files C:\\Users\\\\Lenovo\\\\Desktop\\\\exam\\\\test.pdf ");
		}
		
		
		

		else if(Select == 2) {
		System.out.println("select the file numebr from ( 1 - 100 ) you want to search");
		try {
		int enter = sr.nextInt();
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\exam\\test1"+enter+".pdf"));
		System.out.println("Enter the word you want to find it ");
		String find = sr.next();
		find.split(" ");
		String s;
		int count = 0 ;
		while ((s = reader.readLine())!=null)
		{
			if(s.equals(find))
			{
				count++;
			}
				
		}
		if (count !=0)
		{
			System.out.println("the Enterd word is have been find "+count+" time");
		}
		else 
		{
			System.out.println("Not found please try another words");
		}
			reader.close();
		}catch (IOException o) {
			o.printStackTrace();
		
		    }
		
		}
//		else if (Select == 3)
//		{
//			int numPage = 0;
//			String search = "\"C:\\Users\\Lenovo\\Desktop\\exam\"";
//			System.out.print("what world you want to find ??? ");
//			File f = new File(search);
//			String world=sr.next();
//			File[] pdfFiles = f.listFiles((d, name) -> name.endsWith(".pdf"));
//			
//			for (File pdf : pdfFiles)
//			{
//				try
//				{
//					PdfReader reader = new PdfReader(pdf.getAbsolutePath());
//					int numPages = reader.getNumberOfPages();
//					boolean found = false;
//					for (int i = 1 ; i <= numPages; i++)
//					{
//						String pageText = PdfTextExtractor.getTextFromPage(reader, i);
//							if (pageText.toLowerCase().contains(world.toLowerCase()))
//							{
//								found = true ;
//								break ;
//							}
//				}
//				
//			         if (found)
//			         {
//			        	 System.out.print("found" + world + "in" + pdf.getName());
//			         }
//			    }
//			
//			
//			catch (Exception e) {
//			e.printStackTrace();
//		}
//			
			
			
		
		else if (Select == 0)
		{
			repeat = false ;
		}
		
		}
		sr.close();
		System.out.println("thanks!!!!!!");
	
	}

		
	}

 
        
    
    
