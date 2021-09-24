package Templates.SymptomResources;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Severity {

    public static void CreateSeverity (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,4);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"code\": \"49727002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"display\": \"Severe\",");
                break;
            case 2:
                writer.write("\"code\": \"6736007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"display\": \"Moderate\",");
                break;
            case 3:
                writer.write("\"code\": \"255604002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"display\": \"Mild\",");
                break;
        }
    }
}
