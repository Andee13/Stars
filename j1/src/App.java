import com.github.lalyos.jfiglet.FigletFont;
import java.io.*;

public class App {
  public static void main(String[] args)throws IOException {
			String asciiArt3 = FigletFont.convertOneLine(new File("res/3x5.flf"), "V A V");     
		System.out.println(asciiArt3); 
		}
}