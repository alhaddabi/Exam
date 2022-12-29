package examPdf;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;

public class main {

	public static void main(String[] args) {
		
		try 
		{
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\exam\\test.pdf"));
			document.open();
			document.add(new Paragraph("1971: The Omani flag is hoisted at the United Nations for the first time. Oman was one of just three Arab states not to break ties with Egypt when President Sadat of Egypt made peace with Israel following the Camp David Accords."));
			document.close();
		}catch(Exception o)
		{
			System.out.println(o);
		}
		System.out.println("your pdf file have been crerated ");
	}
	
}
