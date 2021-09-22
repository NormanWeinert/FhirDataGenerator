package Templates.ImpfstatusResources;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Impfstoff {

    public static void ImpfstoffCases (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,4);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"code\": \"421245007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + pertussis + tetanus vaccine (product)\",");
                break;
            case 2:
                writer.write("\"code\": \"37146000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Typhus vaccine (product)\",");
                break;
            case 3:
                writer.write("\"code\": \"407746005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Varicella-zoster live attenuated vaccine (product)\",");
                break;
            case 4:
                writer.write("\"code\": \"787859002:127489000=412300006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): Has active ingredient (attribute) = Rubella and mumps vaccine (substance)\",");
                break;
            case 5:
                writer.write("\"code\": \"787859002:{127489000=428126001}{127489000=412374001}{127489000=396433007}{127489000=412375000}{127489000=396424005}{127489000=768365004}{127489000=768366003}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Diphtheria vaccine (substance) } { Has active ingredient (attribute) = Haemophilus influenzae type b vaccine (substance) } { Has active ingredient (attribute) = Pertussis vaccine (substance) } { Has active ingredient (attribute) = Tetanus vaccine (substance) } { Has active ingredient (attribute) = Hepatitis B virus vaccine (substance) } { Has active ingredient (attribute) = Meningococcus group A vaccine (substance) } { Has active ingredient (attribute) = Meningococcus group C vaccine (substance) }\",");
                break;
            case 6:
                writer.write("\"code\": \"427542001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + tetanus + pertussis + poliomyelitis + recombinant hepatitis B virus vaccine (product)\",");
                break;
            case 7:
                writer.write("\"code\": \"787859002:{127489000=428126001}{127489000=412374001}{127489000=396433007}{127489000=412375000}{127489000=396424005}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Diphtheria vaccine (substance) } { Has active ingredient (attribute) = Haemophilus influenzae type b vaccine (substance) } { Has active ingredient (attribute) = Pertussis vaccine (substance) } { Has active ingredient (attribute) = Tetanus vaccine (substance) } { Has active ingredient (attribute) = Hepatitis B virus vaccine (substance) }\",");
                break;
            case 8:
                writer.write("\"code\": \"333707007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Hepatitis A+typhoid vaccine (product)\",");
                break;
            case 9:
                writer.write("\"code\": \"426842004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + tetanus + pertussis + poliomyelitis + recombinant hepatitis B virus + recombinant haemophilus influenzae type B vaccine (product)\",");
                break;
            case 10:
                writer.write("\"code\": \"426971004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Haemophilus influenzae Type b + recombinant hepatitis B virus vaccine (product)\",");
                break;
        }

    }
}
