package OCA.src.Q006;

import java.io.IOException;
class X {
    public void printFileContent() throws IOException {
        /*code goes here */
        throw new IOException();
    }
}
public class Test {
    public static void main(String[] args) throws IOException {
        X xobj = new X();
        xobj.printFileContent();

    }
}

    /* Which two modifications should you make so that
        the code compiles successfully? (Choose two.)
        A. try {
               xobj.printFileContent();
            }
            catch(Exception e)  { }
            catch(IOException e) { }
        B. Replace line 7 with throw IOException(Exception raised);
        C. Replace line 11 with public static void main(String[] args) throws IOException {
        D. At line 14, insert throw new IOException();
        E. Replace line 5 with public void printFileContent() throws IOException {








Answer C E
 */
