import java.util.Random;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Generador {
    public void generartxt(){
        try {
            ArrayList<Integer> numeros = new ArrayList<>();
            Random random = new Random();
            FileWriter escritor = new FileWriter("datosresultados.txt");
            for(int i = 0; i <500000; i++){
                numeros.add(random.nextInt(500000));
                escritor.write(numeros.get(i)+ "\n");
            }
            escritor.close();
        }
        catch (IOException e){
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}
