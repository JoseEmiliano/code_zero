package ar.com.unpaz.archivos.principal;

public class Inicio {

    import java.io.FileNotFoundException;
    import java.io.File;
    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;
    import java.util.ArrayList;
    import java.util.List;

import ar.com.unpaz.archivos.model.Vial;



    public main(String[] args) throws NumberFormatException, IOException {

        try {
            File $File = new File("");
            FileReader sFileReader;

            sFileReader = new FileReader($File);
            BufferedReader bufferedReader = new BufferedReader(sFileReader);
            String linea = "";

            List<Vial> sList = new ArrayList<Vial>();
            while((linea = bufferedReader.readLine()) != null){
                String [] array = linea.split(",");

                Vial sVial = new Vial(Integer.parseInt(array[0],array[1],Integer.parseInt(array[2])));

                sList.add(sVial);

            }

            for (Vial vial : sList) {
                System.out.println(vial.getDescripcion());
            }
        }

        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }

    }



//PACKAGE NUEVO SERVICIOS Y  DAO   DOS INTERFACES
}
