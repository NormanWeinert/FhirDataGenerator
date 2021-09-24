package Templates.ImpfstatusResources;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Impfstoff {

    public static void ImpfstoffCases (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,4);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 42 + 1);

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
            case 11:
                writer.write("\"code\": \"787859002:{127489000=428126001}{127489000=396424005}{127489000=412375000}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Diphtheria vaccine (substance) } { Has active ingredient (attribute) = Hepatitis B virus vaccine (substance) } { Has active ingredient (attribute) = Tetanus vaccine (substance) }\",");
                break;
            case 12:
                writer.write("\"code\": \"414004005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + tetanus + pertussis + poliomyelitis + haemophilus influenzae b vaccine (product)\",");
                break;
            case 13:
                writer.write("\"code\": \"4426081003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + tetanus + pertussis + recombinant hepatitis B virus vaccine (product)\",");
                break;
            case 14:
                writer.write("\"code\": \"787859002:{127489000=412374001}{127489000=396436004}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Haemophilus influenzae type b vaccine (substance) } { Has active ingredient (attribute) = Live Poliovirus vaccine (substance) }\",");
                break;
            case 15:
                writer.write("\"code\": \"787859002:{127489000=428126001}{127489000=396438003}{127489000=412375000}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Diphtheria vaccine (substance) } { Has active ingredient (attribute) = Rubella vaccine (substance) } { Has active ingredient (attribute) = Tetanus vaccine (substance) }\",");
                break;
            case 16:
                writer.write("\"code\": \"414005006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + tetanus + pertussis + poliomyelitis vaccine (product)\",");
                break;
            case 17:
                writer.write("\"code\": \"414006007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + tetanus + poliomyelitis vaccine (product)\",");
                break;
            case 18:
                writer.write("\"code\": \"419550004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Measles + mumps + rubella + varicella vaccine (product)\",");
                break;
            case 19:
                writer.write("\"code\": \"787859002:{127489000=396427003}{127489000=396438003}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Measles vaccine (substance) } { Has active ingredient (attribute) = Rubella vaccine (substance) }\",");
                break;
            case 20:
                writer.write("\"code\": \"61153008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Measles, mumps and rubella vaccine (product)\",");
                break;
            case 21:
                writer.write("\"code\": \"785865001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Measles and mumps vaccine (product)\",");
                break;
            case 22:
                writer.write("\"code\": \"333702001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Hepatitis A+B vaccine (product)\",");
                break;
            case 23:
                writer.write("\"code\": \"350327004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + tetanus vaccine (product)\",");
                break;
            case 24:
                writer.write("\"code\": \"78785900:{127489000=398730001}{127489000=412374001}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Pneumococcal vaccine (substance) } { Has active ingredient (attribute) = Haemophilus influenzae type b vaccine (substance) }\",");
                break;
            case 25:
                writer.write("\"code\": \"423912009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Haemophilus influenzae type b + Meningococcal group C vaccine (product)\",");
                break;
            case 26:
                writer.write("\"code\": \"787859002:{127489000=412374001}{127489000=396433007}{127489000=396411005}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Haemophilus influenzae type b vaccine (substance) } { Has active ingredient (attribute) = Pertussis vaccine (substance) } { Has active ingredient (attribute) = Toxoid (substance) }\",");
                break;
            case 27:
                writer.write("\"code\": \"787859002:{127489000=396422009}{127489000=396441007}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Cholera vaccine (substance) } { Has active ingredient (attribute) = Typhoid vaccine (substance) }\",");
                break;
            case 28:
                writer.write("\"code\": \"333697005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Japanese B encephalitis vaccine\",");
                break;
            case 29:
                writer.write("\"code\": \"333699008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Tick-borne encephalitis vaccine\",");
                break;
            case 30:
                writer.write("\"code\": \"90043005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Mumps live virus vaccine\",");
                break;
            case 31:
                writer.write("\"code\": \"111164008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Poliovirus vaccine\",");
                break;
            case 32:
                writer.write("\"code\": \"116077000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Rotavirus vaccine\",");
                break;
            case 33:
                writer.write("\"code\": \"333606008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Rabies vaccine\",");
                break;
            case 34:
                writer.write("\"code\": \"407737004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Varicella-zoster vaccine\",");
                break;
            case 35:
                writer.write("\"code\": \"33234009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Smallpox vaccine\",");
                break;
            case 36:
                writer.write("\"code\": \"424519000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Human papillomavirus vaccine\",");
                break;
            case 37:
                writer.write("\"code\": \"56844000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Yellow fever vaccine\",");
                break;
            case 38:
                writer.write("\"code\": \"386013003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Rubella vaccine\",");
                break;
            case 39:
                writer.write("\"code\": \"386012008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Measles vaccine\",");
                break;
            case 40:
                writer.write("\"code\": \"14745005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Hepatitis A virus vaccine\",");
                break;
            case 41:
                writer.write("\"code\": \"34689006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Hepatitis B virus vaccine\",");
                break;
            case 42:
                writer.write("\"code\": \"46233009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Influenza virus vaccine\",");
                break;
        }

    }
}
