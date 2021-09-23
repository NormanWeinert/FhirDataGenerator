package Templates.SharedResources;

import java.io.BufferedWriter;
import java.io.IOException;

public class SharedStatus {

    public static void StatusCases (BufferedWriter writer, int StatusCode) throws IOException {

        switch (StatusCode) {
            case 1:
                writer.write("\"status\": \"finished\",");
                break;
            case 2:
                writer.write("\"status\": \"in-progress\",");
                break;
            case 3:
                writer.write("\"status\": \"unknown\",");
                break;
            case 4:
                writer.write("\"status\": \"planned\",");
                break;
            case 5:
                writer.write("\"status\": \"onleave\",");
                break;
            case 6:
                writer.write("\"status\": \"cancelled\",");
                break;
            case 7:
                writer.write("\"status\": \"entered-in-error\",");
                break;
        }
    }
}
