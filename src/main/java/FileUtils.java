import java.io.*;

public class FileUtils {
    public static void readFile() throws IOException {
        File failas = new File("src/main/java/stock.txt");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(failas));
            String eilute;
            System.out.println("Produktu sarasas:");
            while ((eilute = br.readLine()) != null) {
                System.out.println(eilute);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }
}
