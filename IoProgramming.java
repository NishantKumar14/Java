import java.io.*;

 class IoPragramming {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\nk534\\IdeaProjects\\Java_Code\\src\\file.txt");
        int i ;
        while((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
    }
}