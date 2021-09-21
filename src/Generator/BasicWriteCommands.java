package Generator;

import java.io.BufferedWriter;
import java.io.IOException;

public class BasicWriteCommands {

    public static void Open (BufferedWriter writer) throws IOException {
        writer.write("{");
        writer.newLine();
    }

    public static void CloseAndContinue (BufferedWriter writer) throws IOException {
        writer.write("},");
        writer.newLine();
    }

    public static void Close (BufferedWriter writer) throws IOException {
        writer.write("}");
        writer.newLine();
    }

    public static void CloseAndContinueField (BufferedWriter writer) throws IOException {
        writer.write("],");
        writer.newLine();
    }

    public static void CloseField (BufferedWriter writer) throws IOException {
        writer.write("]");
        writer.newLine();
    }

    public static void Indents(BufferedWriter writer, int amount) throws IOException {
        for (int i = 1; i <= amount; i++){
            writer.write("    ");
        }
    }
}
