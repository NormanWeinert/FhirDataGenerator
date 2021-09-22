package Templates.PatientenAufenthaltResources;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class ServiceType {

    public static void CreateServiceType (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,1);
        writer.write("\"serviceType\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"system\": \"https://www.medizininformatik-initiative.de/fhir/core/modul-fall/CodeSystem/Fachabteilungsschluessel\",");
        writer.newLine();
        ServiceTypeCases(writer);
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"userSelected\": false");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinue(writer);
    }

    private static void ServiceTypeCases (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,4);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 39 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"code\": \"0100\",");
                break;
            case 2:
                writer.write("\"code\": \"0200\",");
                break;
            case 3:
                writer.write("\"code\": \"0300\",");
                break;
            case 4:
                writer.write("\"code\": \"0400\",");
                break;
            case 5:
                writer.write("\"code\": \"0500\",");
                break;
            case 6:
                writer.write("\"code\": \"0600\",");
                break;
            case 7:
                writer.write("\"code\": \"0700\",");
                break;
            case 8:
                writer.write("\"code\": \"0800\",");
                break;
            case 9:
                writer.write("\"code\": \"0900\",");
                break;
            case 10:
                writer.write("\"code\": \"1000\",");
                break;
            case 11:
                writer.write("\"code\": \"1100\",");
                break;
            case 12:
                writer.write("\"code\": \"1200\",");
                break;
            case 13:
                writer.write("\"code\": \"1300\",");
                break;
            case 14:
                writer.write("\"code\": \"1400\",");
                break;
            case 15:
                writer.write("\"code\": \"1500\",");
                break;
            case 16:
                writer.write("\"code\": \"1600\",");
                break;
            case 17:
                writer.write("\"code\": \"1700\",");
                break;
            case 18:
                writer.write("\"code\": \"1800\",");
                break;
            case 19:
                writer.write("\"code\": \"1900\",");
                break;
            case 20:
                writer.write("\"code\": \"2000\",");
                break;
            case 21:
                writer.write("\"code\": \"2100\",");
                break;
            case 22:
                writer.write("\"code\": \"2200\",");
                break;
            case 23:
                writer.write("\"code\": \"2300\",");
                break;
            case 24:
                writer.write("\"code\": \"2400\",");
                break;
            case 25:
                writer.write("\"code\": \"2500\",");
                break;
            case 26:
                writer.write("\"code\": \"2600\",");
                break;
            case 27:
                writer.write("\"code\": \"2700\",");
                break;
            case 28:
                writer.write("\"code\": \"2800\",");
                break;
            case 29:
                writer.write("\"code\": \"2900\",");
                break;
            case 30:
                writer.write("\"code\": \"3000\",");
                break;
            case 31:
                writer.write("\"code\": \"3100\",");
                break;
            case 32:
                writer.write("\"code\": \"3200\",");
                break;
            case 33:
                writer.write("\"code\": \"3300\",");
                break;
            case 34:
                writer.write("\"code\": \"3400\",");
                break;
            case 35:
                writer.write("\"code\": \"3500\",");
                break;
            case 36:
                writer.write("\"code\": \"3600\",");
                break;
            case 37:
                writer.write("\"code\": \"2316\",");
                break;
            case 38:
                writer.write("\"code\": \"2425\",");
                break;
            case 39:
                writer.write("\"code\": \"3700\",");
                break;
        }
    }

}
