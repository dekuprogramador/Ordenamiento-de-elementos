import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Ordenador {
    public void ordenartxt(){
        try{
            ArrayList<Integer> numordenados = new ArrayList<>();
            File datosimport = new File("datosresultados.txt");
            Scanner lector = new Scanner(datosimport);

            while (lector.hasNextLine()){
                String datos = lector.nextLine();
                numordenados.add(Integer.parseInt(datos));
            }
            lector.close();

            for (int i=0; i<numordenados.size() -1; i++){
                for(int j=0; j<numordenados.size() -1 -i; j++){
                    if(numordenados.get(j) > numordenados.get(j+1)){
                        int temp= numordenados.get(j);
                        numordenados.set(j, numordenados.get(j+1));
                        numordenados.set(j+1, temp);
                    }
                }
                System.out.println("" +numordenados);
            }

            FileWriter escritor = new FileWriter("resultadosordenados.txt");
            for(int i = 0; i <500000; i++){
                escritor.write(numordenados.get(i)+ "\n");
            }
            escritor.close();
        }

        catch (FileNotFoundException e){
            System.out.println("ERROR");
            e.printStackTrace();
        }

        catch (NumberFormatException e) {
            System.out.println("ERROR: el archivo contiene un valor que no es un número entero");
            e.printStackTrace();
        }

        catch (IOException e){
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}
