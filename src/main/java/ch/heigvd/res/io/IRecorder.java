package ch.heigvd.res.io;

/**
 * Interface that specifies the functions for a recorder
 * It must record the data and close the open stream when the file 
 * operations are done
 *
 * @author jeanayoub
 */
public interface IRecorder {
    void record (IData data);
    void closeStream ();
}
