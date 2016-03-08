package ch.heigvd.res.io;

/**
 * Class that defines the type of Data for the experiment and implements IDATA
 * to make sure that data's attributes are gettable. 
 * 
 * @author jeanayoub
 */
public class MyExperimentData implements IData{
    
    /**
     * The only constructor for data.
     * 
     * @param operation
     * @param strategy
     * @param fileSizeInBytes
     * @param blockSize
     * @param duration 
     */
    public MyExperimentData (String operation, String strategy, long fileSizeInBytes, int blockSize, long duration) {
        
        this.operation       = operation;
        this.strategy        = strategy;
        this.blockSize       = blockSize;
        this.duration        = duration;
        this.fileSizeInBytes = fileSizeInBytes;
    }
    
    
    /**
     * Getter
     * 
     * @return the name of the operation.
     */
    public String getOperation () {
        return operation;
    }
    
    /**
     * Getter
     * 
     * @return the name of the strategy
     */
    public String getStrategy () {
        return strategy;
    }
    
    /**
     * Getter
     * 
     * @return the file size in bytes
     */
    public long getFileSizeInBytes () {
        return fileSizeInBytes;
    }
    
    /**
     * Getter
     * 
     * @return the size of the block
     */
    public int getBlockSize () {
        return blockSize;
    }
    
    /**
     * Getter
     * 
     * @return the duration of the operation
     */
    public long getDuration () {
        return duration;
    }
  
    
    /**
     * Private attributes
     */
    private String operation;
    private String strategy;
    private long   fileSizeInBytes;
    private int    blockSize;
    private long   duration;
}
