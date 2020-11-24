import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Main {
    public static void main(String[] args) throws TesseractException {
        File image = new File("src/main/resources/img/pdf-1.JPG");
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("src/main/resources/tessdata/");
        tesseract.setLanguage("hun");
        tesseract.setPageSegMode(1);
        tesseract.setOcrEngineMode(1);
        String result = tesseract.doOCR(image);
        System.out.println(result);
    }
}
