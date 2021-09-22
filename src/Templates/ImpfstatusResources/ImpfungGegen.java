package Templates.ImpfstatusResources;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class ImpfungGegen {

    public static void ImpfungGegenCases (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,7);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 36 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"code\": \"840539006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Disease caused by Severe acute respiratory syndrome coronavirus 2 (disorder)\",");
                break;
            case 2:
                writer.write("\"code\": \"40733004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Infectious disease (disorder)\",");
                break;
            case 3:
                writer.write("\"code\": \"16901001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Central European encephalitis (disorder)\",");
                break;
            case 4:
                writer.write("\"code\": \"64572001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Disease (disorder)\",");
                break;
            case 5:
                writer.write("\"code\": \"307333004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Rhesus isoimmunization due to anti-D (disorder)\",");
                break;
            case 6:
                writer.write("\"code\": \"39111003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Louse-borne typhus (disorder)\",");
                break;
            case 7:
                writer.write("\"code\": \"28944009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Cytomegalovirus infection (disorder)\",");
                break;
            case 8:
                writer.write("\"code\": \"55735004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Respiratory syncytial virus infection (disorder)\",");
                break;
            case 9:
                writer.write("\"code\": \"186431008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Clostridioides difficile infection (disorder)\",");
                break;
            case 10:
                writer.write("\"code\": \"67924001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Smallpox\",");
                break;
            case 11:
                writer.write("\"code\": \"240532009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"human papilomavirus infection\",");
                break;
            case 12:
                writer.write("\"code\": \"16541001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Yellow fever\",");
                break;
            case 13:
                writer.write("\"code\": \"4740000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Herpes Zoster\",");
                break;
            case 14:
                writer.write("\"code\": \"38907003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Varicella\",");
                break;
            case 15:
                writer.write("\"code\": \"36653000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Rubella\",");
                break;
            case 16:
                writer.write("\"code\": \"14168008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Rabies\",");
                break;
            case 17:
                writer.write("\"code\": \"398102009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Acute Poliomyelitis\",");
                break;
            case 18:
                writer.write("\"code\": \"36989005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Mumps\",");
                break;
            case 19:
                writer.write("\"code\": \"14189004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Measles\",");
                break;
            case 20:
                writer.write("\"code\": \"40468003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Viral hepatitis, type A\",");
                break;
            case 21:
                writer.write("\"code\": \"66071002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Viral hepatitis, type B\",");
                break;
            case 22:
                writer.write("\"code\": \"6142004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Influenza\",");
                break;
            case 23:
                writer.write("\"code\": \"52947006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Japanese encephalitis virus disease\",");
                break;
            case 24:
                writer.write("\"code\": \"18624000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Disease caused by Rotavirus\",");
                break;
            case 25:
                writer.write("\"code\": \"4834000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Thyphoid fever\",");
                break;
            case 26:
                writer.write("\"code\": \"56717001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Tuberculosis\",");
                break;
            case 27:
                writer.write("\"code\": \"76902006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Tetanus\",");
                break;
            case 28:
                writer.write("\"code\": \"16814004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Pneumococcal infectious disease\",");
                break;
            case 29:
                writer.write("\"code\": \"58750007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Plague\",");
                break;
            case 30:
                writer.write("\"code\": \"27836007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Pertussis\",");
                break;
            case 31:
                writer.write("\"code\": \"23511006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Meningococcal infectious disease\",");
                break;
            case 32:
                writer.write("\"code\": \"709410003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Haemophilus influenzae type b infection\",");
                break;
            case 33:
                writer.write("\"code\": \"397430003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Diphtheria caused by Corynebacterium diphtheriae\",");
                break;
            case 34:
                writer.write("\"code\": \"63650001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Cholera\",");
                break;
            case 35:
                writer.write("\"code\": \"75702008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Brucellosis\",");
                break;
            case 36:
                writer.write("\"code\": \"409498004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 7);
                writer.write("\"display\": \"Anthrax\",");
                break;

        }
    }
}
