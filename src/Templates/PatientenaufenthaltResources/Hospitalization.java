package Templates.PatientenaufenthaltResources;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Hospitalization {

    public static void CreateHospitalization (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,1);
        writer.write("\"hospitalization\": {");
        writer.newLine();

        /**
         * AdmitSource
         */
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"admitSource\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"system\": \"https://www.medizininformatik-initiative.de/fhir/core/modul-fall/CodeSystem/Aufnahmeanlass\",");
        writer.newLine();
        AdmitSourceCases(writer);
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
         * DischargeDisposition
         */
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"dischargeDisposition\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"system\": \"https://www.medizininformatik-initiative.de/fhir/core/modul-fall/CodeSystem/Entlassungsgrund\",");
        writer.newLine();
        DischargeDispositionCases(writer);
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Close(writer);

        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinue(writer);
    }

    private static void AdmitSourceCases (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,5);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 8 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"code\": \"E\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Einweisung durch einen Arzt\"");
                break;
            case 2:
                writer.write("\"code\": \"Z\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Einweisung durch einen Zahnarzt\"");
                break;
            case 3:
                writer.write("\"code\": \"N\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Notfall\"");
                break;
            case 4:
                writer.write("\"code\": \"R\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Aufnahme nach vorausgehender Behandlung in einer Rehabilitationseinrichtung\"");
                break;
            case 5:
                writer.write("\"code\": \"V\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Verlegung mit Behandlungsdauer im verlegenden Krankenhaus länger als 24 Stunden\"");
                break;
            case 6:
                writer.write("\"code\": \"A\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Verlegung mit Behandlungsdauer im verlegenden Krankenhaus bis zu 24 Stunden\"");
                break;
            case 7:
                writer.write("\"code\": \"G\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Geburt\"");
                break;
            case 8:
                writer.write("\"code\": \"B\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Begleitperson oder mitaufgenommene Pflegekraft\"");
                break;
        }
    }

    private static void DischargeDispositionCases (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,5);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 29 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"code\": \"01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Behandlung regulär beendet\"");
                break;
            case 2:
                writer.write("\"code\": \"02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Behandlung regulär beendet, nachstationäre Behandlung vorgesehen\"");
                break;
            case 3:
                writer.write("\"code\": \"03\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Behandlung aus sonstigen Gründen beendet\"");
                break;
            case 4:
                writer.write("\"code\": \"04\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Behandlung gegen ärztlichen Rat beendet\"");
                break;
            case 5:
                writer.write("\"code\": \"05\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Zuständigkeitswechsel des Kostenträgers\"");
                break;
            case 6:
                writer.write("\"code\": \"06\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Verlegung in ein anderes Krankenhaus\"");
                break;
            case 7:
                writer.write("\"code\": \"07\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Tod\"");
                break;
            case 8:
                writer.write("\"code\": \"08\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Verlegung in ein anderes Krankenhaus im Rahmen einer Zusammenarbeit (§ 14 Abs. 5 Satz 2 BPflV in der am 31.12.2003 geltenden Fassung)\"");
                break;
            case 9:
                writer.write("\"code\": \"09\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Entlassung in eine Rehabilitationseinrichtung\"");
                break;
            case 10:
                writer.write("\"code\": \"10\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Entlassung in eine Pflegeeinrichtung\"");
                break;
            case 11:
                writer.write("\"code\": \"11\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Entlassung in ein Hospiz\"");
                break;
            case 12:
                writer.write("\"code\": \"12\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"interne Verlegung\"");
                break;
            case 13:
                writer.write("\"code\": \"13\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"externe Verlegung zur psychiatrischen Behandlung\"");
                break;
            case 14:
                writer.write("\"code\": \"14\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Behandlung aus sonstigen Gründen beendet, nachstationäre Behandlung vorgesehen\"");
                break;
            case 15:
                writer.write("\"code\": \"15\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Behandlung gegen ärztlichen Rat beendet, nachstationäre Behandlung vorgesehen\"");
                break;
            case 16:
                writer.write("\"code\": \"16\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"externe Verlegung mit Rückverlegung oder Wechsel zwischen den Entgeltbereichen der DRG-Fallpau- schalen, nach der BPflV oder für besondere Einrichtungen nach § 17b Abs. 1 Satz 15 KHG mit Rückverlegung\"");
                break;
            case 17:
                writer.write("\"code\": \"17\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"interne Verlegung mit Wechsel zwischen den Entgeltbereichen der DRG-Fallpauschalen, nach der BPflV oder für besondere Einrichtungen nach § 17b Abs. 1 Satz 15 KHG\"");
                break;
            case 18:
                writer.write("\"code\": \"18\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Rückverlegung\"");
                break;
            case 19:
                writer.write("\"code\": \"19\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Entlassung vor Wiederaufnahme mit Neueinstufung\"");
                break;
            case 20:
                writer.write("\"code\": \"20\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Entlassung vor Wiederaufnahme mit Neueinstufung wegen Komplikation\"");
                break;
            case 21:
                writer.write("\"code\": \"21\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Entlassung oder Verlegung mit nachfolgender Wiederaufnahme\"");
                break;
            case 22:
                writer.write("\"code\": \"22\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Fallabschluss (interne Verlegung) bei Wechsel zwischen voll-, teilstationärer und stationsäquivalenter Behandlung\"");
                break;
            case 23:
                writer.write("\"code\": \"23\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Beginn eines externen Aufenthalts mit Abwesenheit über Mitternacht (BPflV-Bereich – für verlegende Fachabteilung)\"");
                break;
            case 24:
                writer.write("\"code\": \"24\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Beendigung eines externen Aufenthalts mit Abwesenheit über Mitternacht (BPflV-Bereich – für Pseudo-Fachabteilung 0003)\"");
                break;
            case 25:
                writer.write("\"code\": \"25\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Entlassung zum Jahresende bei Aufnahme im Vorjahr (für Zwecke der Abrechnung - § 4 PEPPV)\"");
                break;
            case 26:
                writer.write("\"code\": \"26\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Beginn eines Zeitraumes ohne direkten Patientenkontakt (stationsäquivalente Behandlung)\"");
                break;
            case 27:
                writer.write("\"code\": \"27\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Beendigung eines Zeitraumes ohne direkten Patientenkontakt (stationsäquivalente Behandlung – für Pseudo-Fachabteilung 0004)\"");
                break;
            case 28:
                writer.write("\"code\": \"28\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Behandlung regulär beendet, beatmet entlassen\"");
                break;
            case 29:
                writer.write("\"code\": \"29\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Behandlung regulär beendet, beatmet verlegt\"");
                break;
        }
    }

}
