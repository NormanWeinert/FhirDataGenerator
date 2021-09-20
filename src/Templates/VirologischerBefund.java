package Templates;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class VirologischerBefund {

    public void CreateVirologischerBefundRescource (int number) throws IOException {

        FileWriter NewTemplate = new FileWriter("VirologischerBefund_Nr"+number+".json");

        BufferedWriter writer = new BufferedWriter(NewTemplate);


        CreateBundleHeader(writer);
        CreateObservation(writer);

        writer.close();
    }

    private void CreateBundleHeader (BufferedWriter writer) throws IOException {
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.indent(writer);
        writer.write("\"resourceType\": \"Bundle\",");
        writer.newLine();
        BasicWriteCommands.indent(writer);
        writer.write("\"id\": \"bundle-transaction-vb\",");
        writer.newLine();
        BasicWriteCommands.indent(writer);
        writer.write("\"meta\": {");
        writer.newLine();
        BasicWriteCommands.twoindents(writer);
        writer.write("\"lastUpdated\": \"2021-05-28T05:33:00Z\"");
        writer.newLine();
        BasicWriteCommands.indent(writer);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.indent(writer);
        writer.write("\"type\": \"transaction\",");
        writer.newLine();
        BasicWriteCommands.indent(writer);
        writer.write("\"entry\": [");
        writer.newLine();
    }

    private void CreateObservation (BufferedWriter writer) throws IOException {
        BasicWriteCommands.twoindents(writer);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.threeindents(writer);
        writer.write("\"fullUrl\": \"urn:uuid:61ebe359-bfdc-4613-8bf2-c5e300945f0a\",");
        writer.newLine();
        BasicWriteCommands.threeindents(writer);
    }

}
