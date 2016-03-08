package ch.heigvd.res.io;
import java.io.PrintStream;

/**
 * Interface that precise the serialization function form. 
 *
 * @author jeanayoub
 */
public interface ISerializer {
   void serialize(IData data, PrintStream ps);
}
