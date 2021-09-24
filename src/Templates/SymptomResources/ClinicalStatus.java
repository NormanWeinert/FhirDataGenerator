package Templates.SymptomResources;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class ClinicalStatus {

    public static void CreateClinicalStatusCode (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,4);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"code\": \"active\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"display\": \"Active\",");
                break;
            case 2:
                writer.write("\"code\": \"recurrence\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"display\": \"Recurrence\",");
                break;
            case 3:
                writer.write("\"code\": \"relapse\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"display\": \"Relapse\",");
                break;
            case 4:
                writer.write("\"code\": \"inactive\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"display\": \"Inactive\",");
                break;
            case 5:
                writer.write("\"code\": \"remission\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"display\": \"Remission\",");
                break;
            case 6:
                writer.write("\"code\": \"resolved\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"display\": \"Resolved\",");
                break;
        }
    }
}
