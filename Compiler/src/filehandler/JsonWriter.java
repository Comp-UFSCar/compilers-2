package filehandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Lucas
 */
public class JsonWriter {

    private String out;
    private String data;

    public JsonWriter(String data) {
        this(new Date().toString(), data);
    }
    
    public JsonWriter(String out, String data) {
        this.out = out;
        this.data = data;
    }

    public JsonWriter export() throws IOException {
        File file = new File(out);
        BufferedWriter output = new BufferedWriter(new FileWriter(file));
        output.write(data);
        output.close();
        return this;
    }
}
