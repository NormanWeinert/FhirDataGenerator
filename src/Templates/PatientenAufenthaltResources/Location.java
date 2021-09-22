package Templates.PatientenAufenthaltResources;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Location {

    public static void CreateLocation (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,1);
        writer.write("\"location\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"location\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"reference\": \"http://external/Location/123\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"status\": \"active\",");
        writer.newLine();
        PhysicalTypeCases(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"period\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"start\": \"2021-02-13T03:04:00+01:00\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"end\": \"2021-03-01T20:42:00+01:00\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinueField(writer);
    }

    private static void PhysicalTypeCases (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,3);
        writer.write("\"physicalType\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"system\": \"https://www.hl7.org/fhir/valueset-location-physical-type.html\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"code\": \"bd\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"userSelected\": false");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.CloseAndContinueField(writer);
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"text\": \"Bett\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
        int randomNum = ThreadLocalRandom.current().nextInt(1, 14 + 1);

        switch (randomNum) {

            case 1:
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"code\": \"si\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"userSelected\": false");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                BasicWriteCommands.Close(writer);
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinueField(writer);
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"text\": \"Site\"");
                writer.newLine();
                BasicWriteCommands.Indents(writer,3);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
            case 2:
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"code\": \"bu\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"userSelected\": false");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                BasicWriteCommands.Close(writer);
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinueField(writer);
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"text\": \"Building\"");
                writer.newLine();
                BasicWriteCommands.Indents(writer,3);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
            case 3:
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"code\": \"wi\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"userSelected\": false");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                BasicWriteCommands.Close(writer);
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinueField(writer);
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"text\": \"Wing\"");
                writer.newLine();
                BasicWriteCommands.Indents(writer,3);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
            case 4:
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"code\": \"wa\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"userSelected\": false");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                BasicWriteCommands.Close(writer);
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinueField(writer);
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"text\": \"Ward\"");
                writer.newLine();
                BasicWriteCommands.Indents(writer,3);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
            case 5:
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"code\": \"lvl\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"userSelected\": false");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                BasicWriteCommands.Close(writer);
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinueField(writer);
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"text\": \"Level\"");
                writer.newLine();
                BasicWriteCommands.Indents(writer,3);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
            case 6:
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"code\": \"co\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"userSelected\": false");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                BasicWriteCommands.Close(writer);
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinueField(writer);
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"text\": \"Corridor\"");
                writer.newLine();
                BasicWriteCommands.Indents(writer,3);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
            case 7:
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"code\": \"ro\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"userSelected\": false");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                BasicWriteCommands.Close(writer);
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinueField(writer);
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"text\": \"Room\"");
                writer.newLine();
                BasicWriteCommands.Indents(writer,3);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
            case 8:
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"code\": \"bd\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"userSelected\": false");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                BasicWriteCommands.Close(writer);
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinueField(writer);
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"text\": \"Bed\"");
                writer.newLine();
                BasicWriteCommands.Indents(writer,3);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
            case 9:
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"code\": \"ve\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"userSelected\": false");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                BasicWriteCommands.Close(writer);
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinueField(writer);
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"text\": \"Vehicle\"");
                writer.newLine();
                BasicWriteCommands.Indents(writer,3);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
            case 10:
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"code\": \"ho\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"userSelected\": false");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                BasicWriteCommands.Close(writer);
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinueField(writer);
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"text\": \"House\"");
                writer.newLine();
                BasicWriteCommands.Indents(writer,3);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
            case 11:
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"code\": \"ca\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"userSelected\": false");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                BasicWriteCommands.Close(writer);
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinueField(writer);
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"text\": \"Cabinet\"");
                writer.newLine();
                BasicWriteCommands.Indents(writer,3);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
            case 12:
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"code\": \"rd\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"userSelected\": false");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                BasicWriteCommands.Close(writer);
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinueField(writer);
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"text\": \"Road\"");
                writer.newLine();
                BasicWriteCommands.Indents(writer,3);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
            case 13:
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"code\": \"area\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"userSelected\": false");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                BasicWriteCommands.Close(writer);
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinueField(writer);
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"text\": \"Area\"");
                writer.newLine();
                BasicWriteCommands.Indents(writer,3);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
            case 14:
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"code\": \"jdn\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,6);
                writer.write("\"userSelected\": false");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                BasicWriteCommands.Close(writer);
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinueField(writer);
                BasicWriteCommands.Indents(writer,4);
                writer.write("\"text\": \"Jurisdiction\"");
                writer.newLine();
                BasicWriteCommands.Indents(writer,3);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
        }
        */
    }

}
