package runner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Uses all test cases and yields output in "reports/sintaticos".
 * 
 * This is NOT the main class of the project. When typing java -jar LaParser.jar,
 * you will be executing runner.Runner.
 * 
 * @author Lucas
 */
public class MultipleAnalysisRunner {

    public static void main(String[] args) throws Exception {

        // Folder where the input files are located
        File folder = new File("D:/Repositories/Compilers-2-assignment-1/src/testcases/1.arquivos_com_erros_sintaticos/entrada");
        File[] listOfFiles = folder.listFiles();

        // For each file, analyse it and output in the "reports/sintaticos" folder
        for (File file : listOfFiles) {
            if (file.isFile()) {
                new Runner()
                        .start(
                                file.getAbsolutePath(),
                                "D:/Repositories/Compilers-2-assignment-1/src/reports/sintaticos/" + file.getName() + ".txt"
                        );
            }
        }
    }
}
