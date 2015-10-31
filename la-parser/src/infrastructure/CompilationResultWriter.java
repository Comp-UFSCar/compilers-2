package infrastructure;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author daniel
 */
public class CompilationResultWriter {
    
    PrintWriter out;

    public CompilationResultWriter(String file) throws IOException {
        out = new PrintWriter(new FileWriter(file));
    }
    
    public CompilationResultWriter put(String text) {
        out.println(text);
        return this;
    }

    public CompilationResultWriter close() {
        out.flush();
        out.close();
        return this;
    }
}
