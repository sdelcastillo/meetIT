import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Main 
{
    public static void main(String[] args) throws IOException
    {
        PDDocument document = PDDocument.load(new File("AGR-Resume.pdf"));
        PDFTextStripper reader = new PDFTextStripper();
        String pdfText = reader.getText(document);
        String onlyText = pdfText.replaceAll("[^A-Za-z0-9@.#+ ]", "");
        String[] resumeTokens = onlyText.split("[ ]+");
        boolean bool = false;
        String userString = "";
        String email = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a criteria to search for.");
        userString = scan.next();
        
        for (int i = 0; i < resumeTokens.length; i++)
        {
            if(resumeTokens[i].contains("@"))
            {
                email = resumeTokens[i];
            }
            
            if(resumeTokens[i].contains(userString))
            {
                bool = true;
            }
        }
        
        System.out.println("Email is: " + email);
        if(bool != false)
        {
            System.out.println(userString);
        }
    }
}
