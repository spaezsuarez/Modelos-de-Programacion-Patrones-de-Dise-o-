package Persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lector {

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

}
