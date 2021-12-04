package zadanie4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileMenager {
    public static void main(String[] args) throws IOException {
    try{
        File file =new File("plik.txt");
        write(file);
        run(file); //plik stworzono wczesniej wiec nie pojawia sie blad
        
        File file2 =new File("plik2.txt");
        run(file2);
        
    } catch (FileNotExistsException e){
        System.out.println(e.getMessage());
        e.printStackTrace();
        }
    }
    
    private static void write(File file) throws IOException{
        
        FileWriter writer = new FileWriter(file);
        writer.write("Ala ma kota \n Dorota ma smoka");
        writer.close();
    }
    
    private static void run(File file) throws FileNotExistsException, IOException {
        //File file =new File("plik.txt");
        
        if(file.exists()){
            Scanner sc = null;
            try{
                sc = new Scanner(file);
                
            } catch (FileNotExistsException e){
                throw new FileNotExistsException("Plik " + file + " nie istnieje");
            }
            System.out.println(sc.nextLine());
        } else {
            throw new FileNotExistsException("Plik " + file + " nie istnieje");
        }
    }
}
