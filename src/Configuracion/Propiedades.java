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
import java.util.GregorianCalendar;
import java.util.Iterator;
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
    
    
    public static void CargarPropiedades() throws ParseException{
        File archivo = new File ("Configuracion\\bbsGestion.properties");
         if(archivo.exists()){
            try {
                Process p=Runtime.getRuntime().exec("c:/xampp/xampp_start.exe");
                sleep(2000);
            } catch (IOException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
            }
         FileReader fr = null;
            try {
                fr = new FileReader (archivo);
                BufferedReader br = new BufferedReader(fr);
                // Lectura del fichero
                String linea;
                int renglon=0;
                //Transaccionable tra=new Conecciones();
                while((linea=br.readLine())!=null){
                    
                    
                    renglon++;
                    switch (renglon){
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            CREADA=linea.substring(7);
                            break;
                        case 7:
                            ARCHIVOBK=linea.substring(10);
                            break;
                        case 9:
                            NOMBRECOMERCIO=linea.substring(15);
                            break;
                        case 10:
                            LOGO=linea.substring(5);
                            break;
                        case 11:
                            IMAGEN=linea.substring(7);
                            break;
                        case 12:
                            VERIF=linea.substring(6);
                            break;
                        case 13:
                            CORREOCIERREDECAJA=linea.substring(5);
                            break;
                        case 14:
                            VALOR=linea.substring(6);
                            break;
                        case 15:
                            ID=linea.substring(3);
                            break;
                        case 16:
                            CORREOCC=linea.substring(7);
                            break;
                        case 17:
                            CORREOCCC=linea.substring(8);
                            break;
                        case 18:
                            DIRECCION=linea.substring(10);
                            break;
                        case 19:
                            TELEFONO=linea.substring(9);
                            break;
                        case 20:
                            BK=linea.substring(3);
                            break;
                        default:
                            System.out.println(linea);
                            break;
                            
                    }
                    
                    System.out.println(renglon+" // "+linea);
                    // if(tra.guardarRegistro(linea));
      }
                Transaccionable tra=new ConeccionInstalacion();
                String sql="select * from clientes where id='"+ID+"'";
             String sentencia = null;
             ResultSet rs=tra.leerConjuntoDeRegistros(sql);
                try {
                    while(rs.next()){
                        VERIF=rs.getString("verificacion");
                        sentencia="aa";
                    }
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                    if(sentencia !=null){
                        
                    }else{
                        JOptionPane.showMessageDialog(null,"NO SE HA PODIDO ESTABLECER CONEXION CON INTERNET, POR FAVOR VERIFIQUE DICHA CONEXION");
                    }
                }
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
        if(CREADA.equals("0")){
                        
                        //Transaccionable tra=new ConeccionInstalacion();
                        
                        
                    }
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fr.close();
                    //JOptionPane.showMessageDialog(null,"INICIANDO CONFIGURACION Y CREACION DE LA BASE DE DATOS");
                } catch (IOException ex) {
                    Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
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
                    sentencia="#CONFIGURACION BD";
                    lst.add(sentencia);
                    sentencia="SERVER=localhost" ;
                    lst.add(sentencia);
                    sentencia="BD=bbgestion";
                    lst.add(sentencia);
                    sentencia="USUARIO=root";
                    lst.add(sentencia);
                    sentencia="CLAVE=";
                    lst.add(sentencia);
                    sentencia="CREADA=1";
                    lst.add(sentencia);
                    sentencia="ARCHIVOBK="+rs.getString("archivoBk");
                    lst.add(sentencia);
                    sentencia="#DATOS DEL USUARIO - PERSONALIZADOS";
                    lst.add(sentencia);
                    sentencia="NOMBRECOMERCIO="+rs.getString("nombre");
                    lst.add(sentencia);
                    sentencia="LOGO=null";
                    lst.add(sentencia);
                    sentencia="IMAGEN=null";
                    lst.add(sentencia);
                    sentencia="VERIF="+rs.getString("verificacion");
                    lst.add(sentencia);
                    sentencia="MAIL="+rs.getString("mail");
                    lst.add(sentencia);
                    sentencia="VALOR="+rs.getInt("valor");
                    lst.add(sentencia);
                    sentencia="ID="+rs.getInt("id");
                    lst.add(sentencia);
                    sentencia="MAILCC=";
                    lst.add(sentencia);
                    sentencia="MAILCCO=";
                    lst.add(sentencia);
                    sentencia="DIRECCION="+rs.getString("direccion");
                    lst.add(sentencia);
                    sentencia="TELEFONO="+rs.getString("telefono");
                    lst.add(sentencia);
                    sentencia="BK="+rs.getString("bk");
                    lst.add(sentencia);
                    
                }
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
            }
             FileWriter fichero=null;
            PrintWriter pw=null;
            try {
                if(sentencia!=null){
                fichero = new FileWriter("Configuracion\\bbsGestion.properties",true);
                pw=new PrintWriter(fichero);
                Iterator itL=lst.listIterator();
                while(itL.hasNext()){
                    
                    sentencia=(String) itL.next();
                    pw.println(sentencia);
                }
                String usuario=JOptionPane.showInputDialog(null,"Ingrese el nombre de usuario que desea instalar en el sistema");
                String claveU=JOptionPane.showInputDialog(null,"Ingrese la clave para el usuario generado por favor.\n Gracias");
                sql="update usuarios set nombreusuario='"+usuario+"', clave='"+claveU+"' where numero=1";
                Transaccionable tt=new Conecciones();
                tt.guardarRegistro(sql);
                }else{
                    JOptionPane.showMessageDialog(null,"VERIFIQUE LA CONEXION A INTERNET, NO SE HA PODIDO ACTUALIZAR EL SISTEMA");
                    System.exit(1);
                }
            } catch (IOException ex1) {
                Logger.getLogger(Conecciones.class.getName()).log(Level.SEVERE, null, ex1);
            }finally{
              try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
             
             //System.exit(1);
         }
         }
        //BD="siglox";
        
        
        
    }
    private void CrearBase(){
        Boolean veridi=false;
        Transaccionable tra=new ConeccionInstalacion();
        tra.guardarRegistro("create database "+BD);
        
        //return veridi;
    }
}
