package filehandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import infrastructure.exceptions.JsonExportException;

/**
 *
 * @author Lucas
 */
public class JsonWriter {

    private String out;
    private String data;

    public JsonWriter(String data) {
        reset(data);
    }
    
    public JsonWriter(String out, String data) {
        reset(out, data);
    }
    
    public final JsonWriter reset(String data) {
        return reset(new Date().toString(), data);
    }
    
    public final JsonWriter reset(String out, String data)
    {
        this.out  = out;
        this.data = data;

        return this;
    }

    public JsonWriter export() throws JsonExportException {
        try {
            File file = new File(out);
            
            file.getParentFile().mkdir();
            file.createNewFile();
            
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(data);
            output.close();
            
        } catch (IOException e) {
            throw new JsonExportException(e.getMessage(), e);
        }
        
        return this;
    }
}
