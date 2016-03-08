package ch.heigvd.res.io;

import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Class responsible of creating a file where the data will be saved after 
 * being serialized.
 * 
 * @author jeanayoub
 */
public class FileRecorder implements IRecorder {
    
    /**
     * The only constructor of the class.
     * 
     * @param fileName
     * @param serializer
     * @param first_line 
     */
    public FileRecorder (String fileName, ISerializer serializer, String first_line) {
        this.fileName   = fileName;
        this.serializer = serializer;
        
        try {
            ps = new PrintStream (new FileOutputStream(fileName + ".csv"));
            ps.println(first_line);
        
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    /**
     * Records the data into the file created before by the constructor using
     * the serialization of the FileRecorder.
     * 
     * @param data 
     */
    public void record (IData data) {
        serializer.serialize(data, ps);
    }
    
    /**
     * Closes the file stream.
     */
    public void closeStream () {
        ps.close();
    }
     
    /**
     * Private attributes.
     */
    private PrintStream ps;
    private String      fileName;
    private ISerializer serializer;
}
