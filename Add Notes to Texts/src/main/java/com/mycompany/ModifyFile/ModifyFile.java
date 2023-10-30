import java.io.*;

public class ModifyFile {
    public static void main(String[] args) {

        // You most enter the path of the file you want to modify
        String originalFile = "TestDoc.txt";

        // You have to enter some path where a temporary file will be created
        String temporaryFile= "Temporary.txt";

        // Enter what you want to add to the beginning of the line
        String elementBefore= "";

        // Enter what you want to add to the end of the line
        String elementBefore= "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(originalFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temporaryFile));

            String line;
            while ((line = br.readLine()) != null) {
                // Add elements before and after each line
                bw.write(elementBefore + line + elementBefore);
                bw.newLine(); // Add a line break after each line
            }

            br.close();
            bw.close();

            // Replace original file with temporary file
            File OriginalFile = new File(originalFile);
            File TemporalFile = new File(originalFile);
            OriginalFile.delete();
            TemporalFile.renameTo(OriginalFile);

            System.out.println("File modified successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
