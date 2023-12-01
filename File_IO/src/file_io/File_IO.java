
package file_io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class File_IO {

    
    public static void main(String[] args) {
        
        char[] in = new char[50];//creating an array
        
        try {
            boolean newFile = false;
            File file =new File("NewFile.txt");//creating file object with a file name, no file yet
            System.out.println(file.exists());//check is there any files created
            newFile = file.createNewFile();//creating new file
            System.out.println(file.exists());//checking again
            System.out.println(newFile);// I/O is one of those inherently risky things.
            
            FileWriter  fw = new FileWriter(file);//creating filewriter object
            fw.write("howdy folks?\n");//writing on the file
            fw.flush();//flush before closing
            fw.close();//close file
            
            FileReader fr = new FileReader(file);
            int size=fr.read(in);//reading file while inserting content into array
            
            
            System.out.println(size);
            for(char c: in){
                System.out.print(c);
            }
            fr.close();//always close
        } catch (IOException ex) {
            Logger.getLogger(File_IO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
