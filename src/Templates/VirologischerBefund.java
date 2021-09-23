package Templates;

import Generator.BasicWriteCommands;
import Templates.SharedResources.SharedID;
import Templates.VirologischerBefundResources.VirologischerBefundDiagnosticReport;
import Templates.VirologischerBefundResources.VirologischerBefundObservation;
import Templates.VirologischerBefundResources.VirologischerBefundSpecimen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class VirologischerBefund {

    public void CreateVirologischerBefundRescource (int number) throws IOException {

        FileWriter NewTemplate = new FileWriter("VirologischerBefund_Nr"+number+".json");

        BufferedWriter writer = new BufferedWriter(NewTemplate);

        BasicWriteCommands.Open(writer);

        CreateBundleHeader(writer);

        VirologischerBefundObservation.CreateObservation(writer);
        VirologischerBefundDiagnosticReport.CreateDiagnosticReport(writer);
        VirologischerBefundSpecimen.CreateSpecimen(writer);

        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseField(writer);

        BasicWriteCommands.Close(writer);

        writer.close();


    }

    private void CreateBundleHeader (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,1);
        writer.write("\"resourceType\": \"Bundle\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,1);
        SharedID.WriteID(writer);
        writer.newLine();
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"meta\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"lastUpdated\": \"2021-05-28T05:33:00Z\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"type\": \"transaction\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"entry\": [");
        writer.newLine();
    }



}
