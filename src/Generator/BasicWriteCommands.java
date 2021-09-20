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

    public static void indent (BufferedWriter writer) throws IOException {
        writer.write("    ");
    }

    public static void twoindents (BufferedWriter writer) throws IOException {
        writer.write("        ");
    }

    public static void threeindents (BufferedWriter writer) throws IOException {
        writer.write("            ");
    }
}
