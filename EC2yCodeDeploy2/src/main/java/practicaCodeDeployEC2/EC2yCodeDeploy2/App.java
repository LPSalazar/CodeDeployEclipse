package practicaCodeDeployEC2.EC2yCodeDeploy2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	String ruta = "/home/ec2-user/CodeDeployEjemploEC2/resultado/archivo2.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("El ados, pero se hizo con el 	CodeDeploy y pipeline514545454!!!!.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acaedio del asdasdasd , pero ahora se actualizo con pipeline asdasdasdasdasdass !!!!!.");
        }
        bw.close();
    }
}
