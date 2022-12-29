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
import com.itextpdf.text.pdf.PdfWriter;
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
			document.add(new Paragraph("1971: The Omani flag is hoisted at the United Nations for the first time. Oman was one of just three Arab states not to break ties with Egypt when President Sadat of Egypt made peace with Israel following the Camp David Accords."));
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
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\exam\\test"+enter+".pdf"));
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
		
		

	
		
		else if (Select == 0)
		{
			repeat = false ;
		}
		
		}
		sr.close();
		System.out.println("thanks!!!!!!");

		
	}
}
 
        
    
    
