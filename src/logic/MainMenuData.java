/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ohjun
 */
public class MainMenuData
{
	public static final int MAX_CASES = 8;
        public static EthicsCase[] cases = new EthicsCase[MAX_CASES];

        
        public static void loadCasesFromFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            int index = 0;

            while (scanner.hasNextLine() && index < cases.length) {
                String category = scanner.nextLine().trim();
                
                if (!scanner.hasNextLine()) break;
                String title = scanner.nextLine().trim();
                
                if (!scanner.hasNextLine()) break;
                String description = scanner.nextLine().trim();
                
                if (!scanner.hasNextLine()) break;
                String type = scanner.nextLine().trim();

                switch (category) {
                    case "PrivacyCase":
                        cases[index] = new PrivacyCase(title, description, type);
                        break;
                    case "MisinformationCase":
                        cases[index] = new MisinformationCase(title, description, type);
                        break;
                    case "AlgorithmCase":
                        cases[index] = new AlgorithmCase(title, description, type);
                        break;
                    case "IntellectualPropertyCase":
                        cases[index] = new IntellectualPropertyCase(title, description, type);
                        break;
                    default:
                        cases[index] = new EthicsCase(title, description, type);
                        break;
                }
                index++;
            }
            scanner.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
      public static void saveVerdictsToFile() {
            try {
            PrintWriter writer = new PrintWriter(new FileWriter(""));
            
            for (int i = 0; i < cases.length; i++) {
                if (cases[i] != null && cases[i].getVerdict() != null) {
                    writer.println(cases[i].getTitle());
                    writer.println(cases[i].getVerdict().toString());
                 }
               }
                writer.close();
             } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

        
}
