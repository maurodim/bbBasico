
package objetos;
//import org.apache.commons

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;




//mport java.net.InetAddress;


/**
 *
 * @author mauro
 */
public class BkUpRemoto {
 
    public void subir(String fileName, String source ) throws MalformedURLException, IOException {
      
        /*
        FTPClient ftpClient = new FTPClient();
            ftpClient.connect(InetAddress.getByName("ftp.bambusoft.com.ar"));
            ftpClient.login("sistemas@bambusoft.com.ar","g_)M7]%AO}[9");
            
            //Verificar conexión con el servidor.
            
            int reply = ftpClient.getReplyCode();
            
            System.out.println("Respuesta recibida de conexión FTP:" + reply);
            
            if(FTPReply.isPositiveCompletion(reply))
            {
                System.out.println("Conectado Satisfactoriamente");    
            }
            else
                {
                    System.out.println("Imposible conectarse al servidor");
                }
           
            //Verificar si se cambia de direcotirio de trabajo
            
            ftpClient.changeWorkingDirectory("/");//Cambiar directorio de trabajo
            System.out.println("Se cambió satisfactoriamente el directorio");
            
            //Activar que se envie cualquier tipo de archivo
            
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            
            BufferedInputStream buffIn = null;
            buffIn = new BufferedInputStream(new FileInputStream(fileName));//Ruta del archivo para enviar
            ftpClient.enterLocalPassiveMode();
            ftpClient.storeFile(source, buffIn);//Ruta completa de alojamiento en el FTP
            
            buffIn.close(); //Cerrar envio de arcivos al FTP
            ftpClient.logout(); //Cerrar sesión
            ftpClient.disconnect();//Desconectarse del servidor
            
            
            */
   }
 
   // public Boolean subirArchivo(){
        /*   
        FTPClient ftpClient = new FTPClient();
            ftpClient.connect(InetAddress.getByName("yourserver.com"));
            ftpClient.login("user","pass");
            
            //Verificar conexión con el servidor.
            
            int reply = ftpClient.getReplyCode();
            
            System.out.println("Respuesta recibida de conexión FTP:" + reply);
            
            if(FTPReply.isPositiveCompletion(reply))
            {
                System.out.println("Conectado Satisfactoriamente");    
            }
            else
                {
                    System.out.println("Imposible conectarse al servidor");
                }
           
            //Verificar si se cambia de direcotirio de trabajo
            
            ftpClient.changeWorkingDirectory("/");//Cambiar directorio de trabajo
            System.out.println("Se cambió satisfactoriamente el directorio");
            
            //Activar que se envie cualquier tipo de archivo
            
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            
            BufferedInputStream buffIn = null;
            buffIn = new BufferedInputStream(new FileInputStream(""));//Ruta del archivo para enviar
            ftpClient.enterLocalPassiveMode();
            ftpClient.storeFile("", buffIn);//Ruta completa de alojamiento en el FTP
            
            buffIn.close(); //Cerrar envio de arcivos al FTP
            ftpClient.logout(); //Cerrar sesión
            ftpClient.disconnect();//Desconectarse del servidor
                */
//}

}
