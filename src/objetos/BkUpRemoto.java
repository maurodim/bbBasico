
package objetos;
//import org.apache.commons

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


//mport java.net.InetAddress;


/**
 *
 * @author mauro
 */
public class BkUpRemoto {
 
    public void subir(String ftpServer, String user, String password, String fileName, File source ) throws MalformedURLException, IOException {
      if (ftpServer != null && fileName != null && source != null) {
         StringBuffer sb = new StringBuffer( "ftp://" );
         if (user != null && password != null) {
            sb.append( user );
            sb.append( ':' );
            sb.append( password );
            sb.append( '@' );
         }
         sb.append( ftpServer );
         sb.append( '/' );
         sb.append( fileName );
         sb.append( ";type=i" );
 
         BufferedInputStream bis = null;
         BufferedOutputStream bos = null;
         try {
            URL url = new URL( sb.toString() );
            URLConnection urlc = url.openConnection();
 
            bos = new BufferedOutputStream( urlc.getOutputStream() );
            bis = new BufferedInputStream( new FileInputStream( source ) );
 
            int i;
            while ((i = bis.read()) != -1) {
               bos.write( i );
            }
         }
         finally {
            if (bis != null)
               try {
                  bis.close();
               }
               catch (IOException ioe) {
                  ioe.printStackTrace();
               }
            if (bos != null)
               try {
                  bos.close();
               } catch (IOException ioe) {
                  ioe.printStackTrace();
                 }
         }
      } else {
         System.out.println( "Input not available." );
      	}
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
