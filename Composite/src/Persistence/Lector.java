package Persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JList;

public class Lector {
    
    private static Lector instance;
    
    private Lector(){}
    
    public static Lector getInstance(){
        if(instance == null){
            instance = new Lector();
        }
        return instance;
    }

    public ArrayList leerAdiciones() {
        ArrayList<String> retorno = new ArrayList<>();
        try {
            File myObj = new File("src/Persistence/Adiciones.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String registro = myReader.nextLine();
                retorno.add(registro);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return retorno;
    }

    public ArrayList leerCombos() {
        ArrayList<String> retorno = new ArrayList<>();
        try {
            File myObj = new File("src/Persistence/Combos.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String registro = myReader.nextLine();
                retorno.add(registro);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return retorno;
    }

    public Object[] getData() {
        ArrayList<String> retornoCombos = leerCombos();
        ArrayList<String> nombresCombos = new ArrayList<>();
        
        retornoCombos.forEach((a) -> {
            String[] parte = a.split("-");
            nombresCombos.add(parte[0]);
        });
        
        return nombresCombos.toArray();
    }
    
}
