import java.io.*;


public class Main {

    public static void usingPrintWriter() throws IOException
    {
            File file = new File("MyFile.txt"); //creates the file
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file); //PrintWriter operates on the file (takes the created file as an arg
            pw.print("You created this text file!");
            pw.close();                             //you HAVE to close the file after you finish writing to it
            System.out.println("It worked");


    }
    public static void usingBufferedReader() throws IOException {
            File file = new File("/Users/roajonny/IdeaProjects/WriteToFile/MyFile.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String text = br.readLine();

            System.out.print("String contained in the file: ");
            System.out.println(text);
    }
    public static void main(String[] args) {
        try {
        usingPrintWriter();
        usingBufferedReader();
        }
        catch(IOException e) {
            e.getStackTrace();
        }
    }
}
