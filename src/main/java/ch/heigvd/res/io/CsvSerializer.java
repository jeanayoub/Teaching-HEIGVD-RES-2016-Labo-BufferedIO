package ch.heigvd.res.io;

import java.io.PrintStream;

/**
 * Class that offers a serialization into a stream for as .csv file model.
 *
 * @author jeanayoub
 */
public class CsvSerializer implements ISerializer{
    
    public void serialize (IData data, PrintStream ps) {
        String csv = "";
        
        csv = data.getOperation()       + ";" 
            + data.getStrategy()        + ";" 
            + data.getBlockSize()       + ";" 
            + data.getFileSizeInBytes() + ";" 
            + data.getDuration();
        
        ps.println(csv);
    }
}
