/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import Conversores.Numeros;
import ObjetosBackUp.BackUp;
import ObjetosBackUp.Backapear;
import interfaceGraficas.Inicio;
import interfaces.Transaccionable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import objetos.ConeccionInstalacion;
import objetos.ConeccionLocal;
import objetos.Conecciones;

/**
 *
 * @author mauro
 */
public class Propiedades {
    static String SERVER="localhost";
    static String BD="bbgestion";
    static String USUARIO="bambusoft";
    static String CLAVE="Bghjiit889210}>";
    static String CREADA;
    static String ARCHIVOBK;
    static String NOMBRECOMERCIO;
    static String LOGO;
    static String IMAGEN;
    static String CORREOCIERREDECAJA;
    static String CORREOCC;
    static String CORREOCCC;
    static String VERIF;
    static String VALOR;
    static String ID;
    static String DIRECCION;
    static String TELEFONO;
    static String BK;

    public static String getBK() {
        return BK;
    }

    public static void setBK(String BK) {
        Propiedades.BK = BK;
    }
    

    public static String getDIRECCION() {
        return DIRECCION;
    }

    public static void setDIRECCION(String DIRECCION) {
        Propiedades.DIRECCION = DIRECCION;
    }

    public static String getTELEFONO() {
        return TELEFONO;
    }

    public static void setTELEFONO(String TELEFONO) {
        Propiedades.TELEFONO = TELEFONO;
    }

    public static String getVERIF() {
        return VERIF;
    }

    public static String getVALOR() {
        return VALOR;
    }

    public static String getID() {
        return ID;
    }
    
    

    public static String getCORREOCIERREDECAJA() {
        return CORREOCIERREDECAJA;
    }

    public static String getCORREOCC() {
        return CORREOCC;
    }

    public static String getCORREOCCC() {
        return CORREOCCC;
    }
    

    public static String getSERVER() {
        return SERVER;
    }

    public static String getBD() {
        return BD;
    }

    public static String getUSUARIO() {
        return USUARIO;
    }

    public static String getCLAVE() {
        return CLAVE;
    }

    public static String getCREADA() {
        return CREADA;
    }

    public static String getARCHIVOBK() {
        return ARCHIVOBK;
    }

    public static String getNOMBRECOMERCIO() {
        return NOMBRECOMERCIO;
    }

    public static String getLOGO() {
        return LOGO;
    }

    public static String getIMAGEN() {
        return IMAGEN;
    }
    
    
    public static void CargarPropiedades() throws ParseException, IOException{
        File archivo = new File ("Configuracion\\bbsGestion.properties");
        Properties p=new Properties();
         if(archivo.exists()){
            try {
                Process px=Runtime.getRuntime().exec("c:/xampp/xampp_start.exe");
                sleep(2000);
            } catch (IOException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        int verificado=0;
        
            p.load(new FileReader(archivo));
            Enumeration<Object> keys = p.keys();

            while (keys.hasMoreElements()){
               Object key = keys.nextElement();
               System.out.println(key + " = "+ p.get(key));
            }   
         
            
         //FileReader fr = null;
            
                //fr = new FileReader (archivo);
                //BufferedReader br = new BufferedReader(fr);
                // Lectura del fichero
                String linea;
                int renglon=0;
                //Transaccionable tra=new Conecciones();
                //while((linea=br.readLine())!=null){
                    
                    
                    
                            CREADA=p.getProperty("CREADA");
                        
                            ARCHIVOBK=p.getProperty("ARCHIVOBK");
                        
                            NOMBRECOMERCIO=p.getProperty("NOMBRECOMERCIO");
                        
                            LOGO=p.getProperty("LOGO");
                        
                            IMAGEN=p.getProperty("IMAGEN");
                        
                            VERIF=p.getProperty("VERIF");
                       
                            CORREOCIERREDECAJA=p.getProperty("MAIL");
                        
                            VALOR=p.getProperty("VALOR");
                        
                            ID=p.getProperty("ID");
                        
                            CORREOCC=p.getProperty("MAILCC");
                            
                            CORREOCCC=p.getProperty("MAILCCO");
                            
                            DIRECCION=p.getProperty("DIRECCION");
                            
                            TELEFONO=p.getProperty("TELEFONO");
                        
                            BK=p.getProperty("BK");
                        
                    
                    //System.out.println(renglon+" // "+linea);
                    // if(tra.guardarRegistro(linea));
                   
                
                    int veer=ActualizarValores1();
                    
                    //JOptionPane.showMessageDialog(null,"NO SE HA PODIDO ESTABLECER CONEXION CON INTERNET, POR FAVOR VERIFIQUE DICHA CONEXION");
                            
                            Date fecha=Numeros.ConvertirStringEnDate(VERIF);
                            DecimalFormat fr1=new DecimalFormat("00");
                            Calendar c1=Calendar.getInstance();
                            Calendar c2=new GregorianCalendar();
                            String dia=Integer.toString(c2.get(Calendar.DAY_OF_MONTH));
                            String mes=Integer.toString(c2.get(Calendar.MONTH));
                            String ano=Integer.toString(c2.get(Calendar.YEAR));

                            int da=Integer.parseInt(dia);
                            int me=Integer.parseInt(mes);
                            me++;
                            dia=fr1.format(da);
                            mes=fr1.format(me);
                            String fechaDia=ano+"-"+mes+"-"+dia;
                            //System.err.println(fechaDia);
                            //fecha="23/12/2011";
                            String fh=ano+"-"+mes+"-"+dia;
                            SimpleDateFormat ff=new SimpleDateFormat("yyyy-MM-dd");
                            Date fechaVal = null;    

                                fechaVal = Numeros.ConvertirStringEnDate(fh);
                                //fechaVal = ff.parse(fh);


                            if(fechaVal.after(fecha)){
                                System.exit(0);
                            }else{
                                //System.exit(0);
                            }
                            //if(CREADA.equals("0")){

                                            //Transaccionable tra=new ConeccionInstalacion();


                              //          }
            
            
            
            
        }else{
             String clave=JOptionPane.showInputDialog(null,"Ingrese la clave enviada en el mail para terminar con la isntalacion del producto por favor. Gracias");
             System.out.println("CLAVE INGRESADA: "+clave);
             Transaccionable tra=new ConeccionInstalacion();
             String sql="select * from clientes where clave='"+clave+"'";
             String sentencia = null;
             ResultSet rs=tra.leerConjuntoDeRegistros(sql);
             ArrayList lst=new ArrayList();
            try {
                while(rs.next()){
                    p.setProperty("ARCHIVOBK", rs.getString("archivoBk"));
                    p.setProperty("NOMBRECOMERCIO", rs.getString("nombre"));
                    p.setProperty("LOGO", "");
                    p.setProperty("IMAGEN", "");
                    p.setProperty("VERIF", rs.getString("verificacion"));
                    p.setProperty("MAIL", rs.getString("mail"));
                    p.setProperty("VALOR", String.valueOf(rs.getInt("valor")));
                    p.setProperty("ID", String.valueOf(rs.getInt("id")));
                    p.setProperty("MAILCC","");
                    p.setProperty("MAILCCO","");
                    p.setProperty("DIRECCION", rs.getString("direccion"));
                    p.setProperty("TELEFONO", rs.getString("telefono"));
                    p.setProperty("BK", rs.getString("bk"));
                    
                }
                rs.close();
                p.store(new FileWriter("Configuracion\\bbsGestion.properties"),"");
                
            } catch (SQLException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                
            
                String usuario=JOptionPane.showInputDialog(null,"Ingrese el nombre de usuario que desea instalar en el sistema");
                String claveU=JOptionPane.showInputDialog(null,"Ingrese la clave para el usuario generado por favor.\n Gracias");
                sql="update usuarios set nombreusuario='"+usuario+"', clave='"+claveU+"' where numero=1";
                Transaccionable tt=new Conecciones();
                tt.guardarRegistro(sql);
                CREADA=p.getProperty("CREADA");
                        
                            ARCHIVOBK=p.getProperty("ARCHIVOBK");
                        
                            NOMBRECOMERCIO=p.getProperty("NOMBRECOMERCIO");
                        
                            LOGO=p.getProperty("LOGO");
                        
                            IMAGEN=p.getProperty("IMAGEN");
                        
                            VERIF=p.getProperty("VERIF");
                       
                            CORREOCIERREDECAJA=p.getProperty("MAIL");
                        
                            VALOR=p.getProperty("VALOR");
                        
                            ID=p.getProperty("ID");
                        
                            CORREOCC=p.getProperty("MAILCC");
                            
                            CORREOCCC=p.getProperty("MAILCCO");
                            
                            DIRECCION=p.getProperty("DIRECCION");
                            
                            TELEFONO=p.getProperty("TELEFONO");
                        
                            BK=p.getProperty("BK");
            
         }
        //BD="siglox";
        
        
        
    }
    private void CrearBase(){
        Boolean veridi=false;
        Transaccionable tra=new ConeccionInstalacion();
        tra.guardarRegistro("create database "+BD);
        
        //return veridi;
    }
    /*
    private static int ActualizarValores(){
        int verificado=0;
        String sentencia = null;
        ArrayList lst=new ArrayList();
        
                        Transaccionable tra=new ConeccionInstalacion();
                        
                        String sql="select * from clientes where id='"+ID+"'";
        try {             
                     ResultSet rs=tra.leerConjuntoDeRegistros(sql);
                     
            
                while(rs.next()){
                    
                    
                }
                rs.close();
                verificado=1;
                FileWriter fichero=null;
                PrintWriter pw=null;
            
                if(sentencia!=null){
                            try {
                                fichero = new FileWriter("Configuracion\\bbsGestion.properties",true);
                            } catch (IOException ex) {
                                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                            }
                pw=new PrintWriter(fichero);
                Iterator itL=lst.listIterator();
                while(itL.hasNext()){
                    
                    sentencia=(String) itL.next();
                    pw.println(sentencia);
                }
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                
            }finally{
             
                
        
                return verificado;
            }
    }
    */
    private static int ActualizarValores1(){
        Properties p=new Properties();
        int verificado=0;
        try {
            p.load(new FileReader("Configuracion\\bbsGestion.properties"));
            Enumeration<Object> keys = p.keys();

            while (keys.hasMoreElements()){
               Object key = keys.nextElement();
               System.out.println(key + " = "+ p.get(key));
            }
             Transaccionable tra=new ConeccionInstalacion();
                        
                        String sql="select * from clientes where id='"+ID+"'";
        //try {             
                     ResultSet rs=tra.leerConjuntoDeRegistros(sql);
                     
            
                while(rs.next()){
                    p.setProperty("VERIF",rs.getString("verificacion"));
                    p.setProperty("BK",String.valueOf(rs.getInt("bk")));
                    
                }
                rs.close();
                p.store(new FileWriter("Configuracion\\bbsGestion.properties"),"");
                verificado=1;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return verificado;
        }
        
    }
}
