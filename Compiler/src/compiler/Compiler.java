package compiler;

/**
 *
 * @author Lucas
 */
public class Compiler {

    String in;
    String out;

    Compiler() {
        this("src/input/test.txt", "src/json/test.txt");
    }

    Compiler(String in, String out) {
        try {
            if (in.isEmpty() || out.isEmpty()) {
                throw new IllegalArgumentException("Parameters in and/or out cannot be an empty String");
            }

            this.in = in;
            this.out = out;
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Compiler compiler;

        if (args.length == 2) {
            compiler = new Compiler(args[0], args[1]);
        } else {
            compiler = new Compiler();
        }

        compiler.start();
    }

    private void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
