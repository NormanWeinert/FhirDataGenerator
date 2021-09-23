package Templates.SymptomResources;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Code {

    public static void CreateCode (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,4);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"code\": \"21522001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Abdominal pain (finding)\",");
                break;
            case 2:
                writer.write("\"code\": \"84387000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Asymptomatic (finding)\",");
                break;
            case 3:
                writer.write("\"code\": \"131148009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Bleeding (finding)\",");
                break;
            case 4:
                writer.write("\"code\": \"29857009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Chest pain (finding)\",");
                break;
            case 5:
                writer.write("\"code\": \"43724002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Chill (finding)\",");
                break;
            case 6:
                writer.write("\"code\": \"9826008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Conjunctivitis (disorder)\",");
                break;
            case 7:
                writer.write("\"code\": \"49727002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Cough (finding)\",");
                break;
            case 8:
                writer.write("\"code\": \"62315008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diarrhea (finding)\",");
                break;
            case 9:
                writer.write("\"code\": \"3006004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Disturbance of consciousness (finding)\",");
                break;
            case 10:
                writer.write("\"code\": \"267036007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Dyspnea (finding)\",");
                break;
            case 11:
                writer.write("\"code\": \"271807003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Eruption of skin (disorder)\",");
                break;
            case 12:
                writer.write("\"code\": \"84229001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Fatigue (finding)\",");
                break;
            case 13:
                writer.write("\"code\": \"103001002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Feeling feverish (finding)\",");
                break;
            case 14:
                writer.write("\"code\": \"386661006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Fever (finding)\",");
                break;
            case 15:
                writer.write("\"code\": \"25064002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Headache (finding)\",");
                break;
            case 16:
                writer.write("\"code\": \"66857006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Hemoptysis (finding)\",");
                break;
            case 17:
                writer.write("\"code\": \"248567008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Indrawing of ribs during respiration (finding)\",");
                break;
            case 18:
                writer.write("\"code\": \"57676002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Joint pain (finding)\",");
                break;
            case 19:
                writer.write("\"code\": \"79890006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Loss of appetite (finding)\",");
                break;
            case 20:
                writer.write("\"code\": \"44169009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Loss of sense of smell (finding)\",");
                break;
        }
    }
}
