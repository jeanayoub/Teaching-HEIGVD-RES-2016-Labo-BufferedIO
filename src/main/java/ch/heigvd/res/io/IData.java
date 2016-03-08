package ch.heigvd.res.io;

/**
 * Interface that specifies the functions for a data
 * 
 * @author jeanayoub
 */
public interface IData {
    String getOperation();
    String getStrategy();
    long   getFileSizeInBytes();
    int    getBlockSize();
    long   getDuration();
}
