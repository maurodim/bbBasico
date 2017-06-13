/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import Conversores.Numeros;
import FacturaE.DetalleFacturas;
import FacturaE.FacturaElectronica;
import FacturaE.Facturas;
import FacturaE.Instalable;
import ObjetosBackUp.BackUp;
import ObjetosBackUp.Backapear;
import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;
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
import objetos.ConeccionInstalacionLocal;
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
    static String ELECTRONICA;
    static String FISCAL;
    static String ACCESOS;
    static String KEY;
    static String CUIT;
    static String INGBRUTOS;
    static String INICIOACT;
    static String PTO;
    

    public static String getPTO() {
        return PTO;
    }

    public static void setPTO(String PTO) {
        Propiedades.PTO = PTO;
    }
    

    public static String getCUIT() {
        return CUIT;
    }

    public static void setCUIT(String CUIT) {
        Propiedades.CUIT = CUIT;
    }

    public static String getINGBRUTOS() {
        return INGBRUTOS;
    }

    public static void setINGBRUTOS(String INGBRUTOS) {
        Propiedades.INGBRUTOS = INGBRUTOS;
    }

    public static String getINICIOACT() {
        return INICIOACT;
    }

    public static void setINICIOACT(String INICIOACT) {
        Propiedades.INICIOACT = INICIOACT;
    }
    
    

    public static String getELECTRONICA() {
        return ELECTRONICA;
    }

    public static void setELECTRONICA(String ELECTRONICA) {
        Propiedades.ELECTRONICA = ELECTRONICA;
    }

    public static String getFISCAL() {
        return FISCAL;
    }

    public static void setFISCAL(String FISCAL) {
        Propiedades.FISCAL = FISCAL;
    }

    public static String getACCESOS() {
        return ACCESOS;
    }

    public static void setACCESOS(String ACCESOS) {
        Propiedades.ACCESOS = ACCESOS;
    }


    public static String getKEY() {
        return KEY;
    }

    public static void setKEY(String KEY) {
        Propiedades.KEY = KEY;
    }
    
    

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
                //Process px=Runtime.getRuntime().exec("c:/xampp/xampp_start.exe");
                sleep(2000);
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
                            FISCAL=p.getProperty("FISCAL");
                            ELECTRONICA=p.getProperty("ELECTRONICA");
                            KEY=p.getProperty("KEY");
                            
                            CUIT=p.getProperty("CUIT");
                            INGBRUTOS=p.getProperty("INGBRUTOS");
                            INICIOACT=p.getProperty("INICIOACT");
                            PTO=p.getProperty("PTO");
                            
                        
                    
                    //System.out.println(renglon+" // "+linea);
                    // if(tra.guardarRegistro(linea));
                   
                
                    int veer=ActualizarValores1();
                    if(CREADA.equals("0")){
                    int bass=CrearBaseInicial();
                        if(bass==1){
                            p.setProperty("CREADA", "1");
                            p.store(new FileWriter("Configuracion\\bbsGestion.properties"),"");
                        }
                    }
                    
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
                int correcto=0;
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
                    p.setProperty("CREADA", "0");
                    p.setProperty("FISCAL", String.valueOf(rs.getInt("fiscal")));
                    p.setProperty("ELECTRONICA",String.valueOf(rs.getInt("electronica")));
                    p.setProperty("KEY",rs.getString("key"));
                    p.setProperty("CUIT",rs.getString("cuit"));
                    p.setProperty("INGBRUTOS",rs.getString("brutos"));
                    p.setProperty("INICIOACT", rs.getString("act"));
                    p.setProperty("PTO",String.valueOf(rs.getInt("pto")));
                    correcto=1;
                }
                rs.close();
                
                if(correcto==1){
                //p.store(new FileWriter("Configuracion\\bbsGestion.properties"),"");
                
                System.out.println("COMENZANDO LA INSTALACION......");
                Runtime rf = Runtime.getRuntime(); 
                    String directorio="Extras\\mysql-essential-5.1.73-win32.msi";
                    String mysql="";
                    try {
                        int pf = rf.exec("msiexec /i \""+ directorio + "\" /qn").waitFor();
                        int bass=CrearBaseInicial();
                        if(bass==1){
                            p.setProperty("CREADA", "1");
                            //p.setProperty("INSTALADA","1");
                            p.store(new FileWriter("Configuracion\\bbsGestion.properties"),"");
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
                            FISCAL=p.getProperty("FISCAL");
                            ELECTRONICA=p.getProperty("ELECTRONICA");
                            KEY=p.getProperty("KEY");
                            CUIT=p.getProperty("CUIT");
                            INGBRUTOS=p.getProperty("INGBRUTOS");
                            INICIOACT=p.getProperty("INICIOACT");
                            PTO=p.getProperty("PTO");
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                }else{
                    JOptionPane.showMessageDialog(null,"CLAVE INCORRECTA, POR FAVOR VERIFIQUELA. GRACIAS");
                    System.exit(1);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                
            
               
            
         }
        //BD="siglox";
        
        
        
    }
    private static int CrearBaseInicial(){
        int respuesta=0;
        try {
                    
                    //directorio="C:\\Program Files (x86)\\MySQL\\MySQL Server 5.1\\bin\\mysqld-nt.exe";
                    //pf=rf.exec(directorio).waitFor();
                    //directorio="start mysql";
                    //pf=rf.exec(directorio).waitFor();
                    //mysql="C:\\Program Files (x86)\\MySQL\\MySQL Server 5.1\\bin\\mysql -e insert into mysql.user(host,user,password) values ('localhost','bambusoft',PASSWORD('Bghjiit889210}>')) -u root";
                    Transaccionable trL=new ConeccionInstalacionLocal();
                    trL.guardarRegistro("create database bbgestion CHARACTER SET 'utf8' COLLATE utf8_spanish_ci");
                    File fichero=new File("Extras\\bbgestion.sql");
                    trL.guardarRegistro("use bbgestion");
                    System.out.println("source "+fichero.getAbsolutePath());
                    //CREAR ARTICULOS
                    trL.guardarRegistro("CREATE TABLE `articulos` (`ID` int(11) NOT NULL,`BARRAS` varchar(30) DEFAULT NULL,`NOMBRE` varchar(49) DEFAULT NULL,`SERVICIO` double DEFAULT NULL,`COSTO` double DEFAULT NULL,`PRECIO` double DEFAULT NULL,`MINIMO` int(11) DEFAULT NULL,`STOCK` int(11) DEFAULT NULL,`PROVEEDOR` int(11) DEFAULT NULL,`RUBRON` varchar(12) DEFAULT NULL,`ALTA` varchar(19) DEFAULT NULL,`INHABILITADO` int(11) NOT NULL DEFAULT '0',`idRubro` int(11) NOT NULL DEFAULT '1',`equivalencia` double NOT NULL DEFAULT '1',`modificaPrecio` int(11) NOT NULL DEFAULT '0',`modificaServicio` int(11) NOT NULL DEFAULT '0',`recargo` double NOT NULL DEFAULT '0',`servicio1` double DEFAULT '0',`idcombo` int(11) DEFAULT '0',`actualizacion` int(11) NOT NULL DEFAULT '0',`fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,`dolar` double NOT NULL DEFAULT '1')ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    // crear billetes
                    trL.guardarRegistro("CREATE TABLE `billetes`(`id` int(11) NOT NULL DEFAULT '0',`descripcion` varchar(30) NOT NULL DEFAULT '',`valor` double NOT NULL DEFAULT '0') ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //crear caja
                    trL.guardarRegistro("CREATE TABLE `caja` (`numero` bigint(11) NOT NULL DEFAULT '0',`numeroSucursal` int(11) NOT NULL DEFAULT '0',`numeroUsuario` int(11) NOT NULL DEFAULT '0',`tipoMovimiento` int(11) NOT NULL DEFAULT '0',`saldoinicial` double NOT NULL DEFAULT '0',`estado` int(11) NOT NULL DEFAULT '0',`tipo` int(11) NOT NULL DEFAULT '0',`saldofinal` double DEFAULT NULL,`fechacierre` varchar(30) DEFAULT NULL,`diferencia` double DEFAULT NULL,`fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP) ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //crear coeficientelistas
                    trL.guardarRegistro("CREATE TABLE `coeficienteslistas` (`id` int(11) NOT NULL DEFAULT '0',`coeficiente` double NOT NULL DEFAULT '0',`descripcion` varchar(30) NOT NULL DEFAULT '') ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //insertar en coeficientes
                    trL.guardarRegistro("INSERT INTO `coeficienteslistas` (`id`, `coeficiente`,`descripcion`) VALUES(1, 1, 'base')");
                    //crear combo
                    trL.guardarRegistro("CREATE TABLE `combo` (`id` int(11) NOT NULL DEFAULT '0',`fecha` date DEFAULT NULL,`idarticulo` int(11) NOT NULL DEFAULT '0',`cantidad` double DEFAULT NULL,`articulopadre` int(11) NOT NULL DEFAULT '0') ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //crear comprobantes
                    trL.guardarRegistro("CREATE TABLE `comprobantes` (`numero` int(11) NOT NULL DEFAULT '0',`descripcion` varchar(4) NOT NULL DEFAULT '',`destinatarioCondicion` int(11) NOT NULL DEFAULT '0',`descargaStock` int(11) NOT NULL DEFAULT '0') ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //crear depositos
                    trL.guardarRegistro("CREATE TABLE `depositos` (`numero` int(11) NOT NULL DEFAULT '0',`descripcion` varchar(100) NOT NULL DEFAULT '',`direccion` varchar(200) NOT NULL DEFAULT '',`telefono` varchar(200) NOT NULL DEFAULT '') ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //insertar en deposito
                    trL.guardarRegistro("INSERT INTO `depositos` (`numero`, `descripcion`, `direccion`,`telefono`) VALUES(1, 'casa central', 'lamadradid 2552', '4555555')");
                    //crear fallas
                    trL.guardarRegistro("CREATE TABLE `fallas` (`st` text NOT NULL,`estado` int(11) NOT NULL DEFAULT '0') ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //crear fiscal
                    trL.guardarRegistro("CREATE TABLE `fiscal` (`fecha` varchar(8) NOT NULL DEFAULT '',`tipo` varchar(3) NOT NULL DEFAULT '011',`pto` varchar(5) NOT NULL DEFAULT '00002',`numero` varchar(20) NOT NULL DEFAULT '',`gravado` double NOT NULL DEFAULT '0',`alicuota` varchar(4) NOT NULL DEFAULT '0005',`impuesto` double NOT NULL DEFAULT '0',`id` int(11) NOT NULL,`total` double NOT NULL DEFAULT '0',`fechaRegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,`estado` int(11) NOT NULL DEFAULT '0',`idcliente` int(11) NOT NULL DEFAULT '1',`tipoClienteId` int(11) NOT NULL DEFAULT '99',`razon` varchar(30) NOT NULL DEFAULT '',`cuit` varchar(20) NOT NULL DEFAULT '') ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //crear iva ventas
                    trL.guardarRegistro("CREATE TABLE `ivaventas` (`id` int(11) NOT NULL,`comprobante` varchar(4) NOT NULL,`fecha` varchar(10) NOT NULL,`numero` varchar(14) NOT NULL,`idcliente` int(11) NOT NULL,`cliente` varchar(35) NOT NULL,`condicion` varchar(4) NOT NULL,`cuit` varchar(11) NOT NULL,`neto` varchar(15) NOT NULL,`iva` varchar(15) NOT NULL,`total` varchar(15) NOT NULL,`periodo` varchar(15) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=latin1");
                    //crear listcli
                    trL.guardarRegistro("CREATE TABLE `listcli` (`COD_CLIENT` varchar(6) DEFAULT NULL,`RAZON_SOCI` varchar(60) DEFAULT NULL,`DOMICILIO` varchar(30) DEFAULT NULL,`COND_VTA` int(11) NOT NULL DEFAULT '0',`TELEFONO_1` varchar(30) DEFAULT NULL,`LISTADEPRECIO` int(11) NOT NULL DEFAULT '0',`NUMERODECUIT` varchar(30) DEFAULT NULL,`CUPODECREDITO` double DEFAULT NULL,`empresa` varchar(3) DEFAULT NULL,`codmmd` int(11) NOT NULL DEFAULT '0',`saldo` double DEFAULT '0',`saldoactual` double DEFAULT '0',`TIPO_IVA` int(11) NOT NULL DEFAULT '0',`COEFICIENTE` int(11) NOT NULL DEFAULT '1',`id` int(11) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //cargar listcli
                    trL.guardarRegistro("INSERT INTO `listcli` (`COD_CLIENT`, `RAZON_SOCI`, `DOMICILIO`,`COND_VTA`, `TELEFONO_1`, `LISTADEPRECIO`, `NUMERODECUIT`, `CUPODECREDITO`, `empresa`, `codmmd`, `saldo`, `saldoactual`, `TIPO_IVA`, `COEFICIENTE`, `id`) VALUES('999999', 'CONSUMIDOR FINAL', 'NN', 1, '11', 1, '1', 0, 'sd', 1, 0, 0, 1, 1, 1)");
                    //crear movimientosarticulos
                    trL.guardarRegistro("CREATE TABLE `movimientosarticulos` (`tipoMovimiento` int(11) NOT NULL DEFAULT '0',`idArticulo` int(11) NOT NULL DEFAULT '0',`cantidad` double NOT NULL DEFAULT '0',`numeroDeposito` int(11) NOT NULL DEFAULT '0',`tipoComprobante` int(11) NOT NULL DEFAULT '0',`numeroComprobante` int(11) NOT NULL DEFAULT '0',`numeroCliente` int(11) NOT NULL DEFAULT '0',`fechaComprobante` varchar(30) NOT NULL DEFAULT '',`numeroUsuario` int(11) NOT NULL DEFAULT '0',`precioDeCosto` double NOT NULL DEFAULT '0',`precioDeVenta` double NOT NULL DEFAULT '0',`precioServicio` double NOT NULL DEFAULT '0',`estado` int(11) DEFAULT NULL,`fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,`idcaja` bigint(11) DEFAULT NULL,`id` bigint(20) NOT NULL,`idcomprobante` int(11) DEFAULT '0',`observaciones` varchar(200) DEFAULT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //crear movimientoscaja
                    trL.guardarRegistro("CREATE TABLE `movimientoscaja` (`numeroUsuario` int(11) NOT NULL DEFAULT '0',`idCliente` int(11) DEFAULT NULL,`numeroSucursal` int(11) NOT NULL DEFAULT '0',`numeroComprobante` int(11) NOT NULL DEFAULT '0',`tipoComprobante` int(11) NOT NULL DEFAULT '0',`monto` double DEFAULT NULL,`tipoMovimiento` int(11) NOT NULL DEFAULT '0',`idCaja` int(11) NOT NULL DEFAULT '0',`cantidad` double DEFAULT NULL,`pagado` int(11) NOT NULL DEFAULT '0',`observaciones` varchar(100) DEFAULT NULL,`estado` int(11) DEFAULT NULL,`tipoCliente` int(11) DEFAULT NULL,`id` bigint(11) NOT NULL,`fiscal` int(11) NOT NULL DEFAULT '0',`fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP) ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //crear movimeintosclientes
                    trL.guardarRegistro("CREATE TABLE `movimientosclientes` (`numeroProveedor` int(11) NOT NULL DEFAULT '0',`monto` double NOT NULL DEFAULT '0',`pagado` int(11) DEFAULT NULL,`numeroComprobante` int(11) DEFAULT NULL,`idRemito` int(11) DEFAULT NULL,`idUsuario` int(11) NOT NULL DEFAULT '0',`idCaja` int(11) NOT NULL DEFAULT '0',`fechaPago` varchar(20) DEFAULT NULL,`tipoComprobante` int(11) DEFAULT NULL,`idSucursal` int(11) NOT NULL DEFAULT '0',`estado` int(11) DEFAULT NULL,`id` bigint(20) NOT NULL,`idcomprobante` int(11) DEFAULT '0',`fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP) ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //crear movimeintosdesucursales
                    trL.guardarRegistro("CREATE TABLE `movimientosdesucursales` (`depOrigen` int(11) DEFAULT NULL,`depDestino` int(11) DEFAULT NULL,`idArticulo` int(11) NOT NULL DEFAULT '0',`cantidad` double NOT NULL DEFAULT '0',`confirmado` int(11) DEFAULT NULL,`numeroRemito` int(11) DEFAULT NULL,`idUsuario` int(11) DEFAULT NULL,`diferencia` double DEFAULT NULL,`idUsuarioRecep` int(11) NOT NULL DEFAULT '0') ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //crear movimientosdeproveedores
                    trL.guardarRegistro("CREATE TABLE `movimientosproveedores` (`numeroProveedor` int(11) NOT NULL DEFAULT '0',`monto` double NOT NULL DEFAULT '0',`pagado` int(11) DEFAULT NULL,`numeroComprobante` varchar(30) DEFAULT NULL,`idRemito` int(11) DEFAULT NULL,`idUsuario` int(11) NOT NULL DEFAULT '0',`idCaja` int(11) NOT NULL DEFAULT '0',`fechaPago` varchar(20) DEFAULT NULL,`tipoComprobante` int(11) DEFAULT NULL,`idSucursal` int(11) NOT NULL DEFAULT '0',`estado` int(11) DEFAULT NULL,`id` int(11) NOT NULL,`fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP) ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //crear movimientousuarios
                    trL.guardarRegistro("CREATE TABLE `movimientosusuarios` (`numeroUsuario` int(11) NOT NULL DEFAULT '0',`tipoAcceso` int(11) DEFAULT NULL,`entrada` varchar(30) NOT NULL DEFAULT '',`estado` int(11) NOT NULL DEFAULT '0') ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //crear proveedores
                    trL.guardarRegistro("CREATE TABLE `proveedores` (`ID` int(11) DEFAULT NULL,`nombre` varchar(19) DEFAULT NULL,`DOMICILIO` varchar(100) DEFAULT NULL,`LOCALIDAD` varchar(8) DEFAULT NULL,`TELEFONO` varchar(10) DEFAULT NULL,`INHABILITADO` int(11) DEFAULT NULL,`numero` int(11) NOT NULL,`mail` varchar(200) NOT NULL DEFAULT '',`saldo` double DEFAULT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //crear rubros
                    trL.guardarRegistro("CREATE TABLE `rubros` (`id` int(11) NOT NULL,`descripcion` varchar(70) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=latin1");
                    //insertar rubros
                    trL.guardarRegistro("INSERT INTO `rubros` (`id`, `descripcion`) VALUES(1, 'ARTICULOS GENERALES')");
                    //crear sucursales
                    trL.guardarRegistro("CREATE TABLE `sucursal` (`numero` int(11) NOT NULL DEFAULT '0',`descripcion` varchar(100) NOT NULL DEFAULT '',`direccion` varchar(100) NOT NULL DEFAULT '',`telefono` varchar(100) NOT NULL DEFAULT '',`deposito` int(11) NOT NULL DEFAULT '0') ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //insertar sucursal
                    trL.guardarRegistro("INSERT INTO `sucursal` (`numero`, `descripcion`, `direccion`,`telefono`, `deposito`) VALUES(1, 'POCO PRECIO 1', '1', '', 1)");
                    //crear tipoacceso
                    trL.guardarRegistro("CREATE TABLE `tipoacceso` (`numero` int(11) NOT NULL DEFAULT '0',`descripcion` varchar(20) NOT NULL DEFAULT '',`nivel` int(11) NOT NULL DEFAULT '0',`menu1` int(11) NOT NULL DEFAULT '0',`menu2` int(11) NOT NULL DEFAULT '0',`menu3` int(11) NOT NULL DEFAULT '0',`menu4` int(11) NOT NULL DEFAULT '0',`menu5` int(11) NOT NULL DEFAULT '0',`menu6` int(11) NOT NULL DEFAULT '0',`menu7` int(11) NOT NULL DEFAULT '0') ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //insertar tipo acceso
                    trL.guardarRegistro("INSERT INTO `tipoacceso` (`numero`, `descripcion`, `nivel`,`menu1`, `menu2`, `menu3`, `menu4`, `menu5`, `menu6`, `menu7`) VALUES(1, 'administrador', 1, 1, 1, 1, 1, 1, 1, 1),(2, 'cajero', 2, 0, 0, 1, 1, 0, 1, 0),(3, 'prueba', 3, 0, 0, 1, 1, 0, 0, 0)");
                    //crear tipocomprobantes
                    trL.guardarRegistro("CREATE TABLE `tipocomprobantes` (`numero` int(11) NOT NULL DEFAULT '0',`descripcion` varchar(50) NOT NULL DEFAULT '',`numeroActivo` int(11) NOT NULL DEFAULT '0',`numeroSucursal` int(11) NOT NULL DEFAULT '0') ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //insertar tipo comprobantes
                    trL.guardarRegistro("INSERT INTO `tipocomprobantes` (`numero`, `descripcion`,`numeroActivo`, `numeroSucursal`) VALUES(1, 'ticket', 5, 1),(2, 'FCA A', 0, 1),(3, 'remito proveedor', 0, 1),(4, 'remito interno', 0, 1),(5, 'factura proveedor A', 0, 1),(6, 'factura proveedor', 0, 1),(7, 'ticket', 0, 2),(8, 'FCA A', 0, 2),(9, 'ticket', 0, 3),(10, 'FCA A', 0, 3),(11, 'recibo de pago', 0, 1),(12, 'mov caja', 36, 0),(13, 'gasto fijo', 0, 1),(14, 'ticket', 0, 4),(15, 'FCA A', 0, 4),(16, 'ticket', 0, 5),(17, 'FCA A', 0, 5),(18, 'remito de ajuste de stock', 0, 1),(19, 'TICKET', 0, 7),(20, 'FACTURA PROVEEDOR', 0, 7),(21, 'FCA A', 0, 7),(22, 'ticket', 0, 6),(23, 'FCA A', 0, 6),(81, 'TFA', 0, 1),(82, 'TFB', 0, 1),(112, 'NCA', 0, 1),(113, 'NCB', 0, 1)");
                    //crear tipomovimientos
                    trL.guardarRegistro("CREATE TABLE `tipomovimientos` (`ID` int(11) NOT NULL DEFAULT '0',`DESCRIPCION` varchar(30) NOT NULL DEFAULT '',`DESTINOOPERACION` int(11) NOT NULL DEFAULT '0',`MULTIPLOOP` int(11) NOT NULL DEFAULT '0') ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //insertar tipo de movimientos
                    trL.guardarRegistro("INSERT INTO `tipomovimientos` (`ID`, `DESCRIPCION`,`DESTINOOPERACION`, `MULTIPLOOP`) VALUES(1, 'Ventas', 1, 1),(2, 'Compras', 1, 1),(3, 'Devolucion de Ventas', 1, 1),(4, 'Retiro Efectivo', 2, -1),(5, 'Recepcion de mercaderias', 1, 1),(6, 'Traslado de mercaderias', 1, 1),(7, 'Ingreso de Caja', 2, 1),(8, 'Devolucion de compras', 1, 1),(9, 'saldo inicial', 2, 1),(10, 'Cerrar Caja', 2, -1),(11, 'Pago a Proveedores', 2, -1),(12, 'Gastos de Caja', 2, -1),(13, 'Cobro de Cuenta Corriente Clie', 2, 1),(14, 'ajuste de stock', 1, 1),(15, 'ajuste de saldo', 1, 1)");
                    //crear usuarios
                    trL.guardarRegistro("CREATE TABLE `usuarios` (`numero` int(11) NOT NULL DEFAULT '0',`nombre` varchar(70) NOT NULL DEFAULT '',`direccion` varchar(200) NOT NULL DEFAULT '',`localidad` varchar(70) NOT NULL DEFAULT '',`telefono` varchar(100) NOT NULL DEFAULT '',`mail` varchar(100) NOT NULL DEFAULT '',`nombreUsuario` varchar(100) NOT NULL DEFAULT '',`clave` varchar(100) NOT NULL DEFAULT '',`autorizacion` int(11) NOT NULL DEFAULT '0',`numeroTipoAcceso` int(11) NOT NULL DEFAULT '0',`sucursal` int(11) NOT NULL DEFAULT '0') ENGINE=InnoDB DEFAULT CHARSET=utf8");
                    //insertar usuarios
                    trL.guardarRegistro("INSERT INTO `usuarios` (`numero`, `nombre`, `direccion`,`localidad`, `telefono`, `mail`, `nombreUsuario`, `clave`, `autorizacion`, `numeroTipoAcceso`, `sucursal`) VALUES(1, 'administrador', '', '', '', '', '', 'null', 1, 1, 1),(2, 'ELIEL', '', '', '', '', 'ELIEL', 'ELIEL', 2, 2, 7)");
                    //INDICES DE TABLAS
                    trL.guardarRegistro("ALTER TABLE `articulos` ADD PRIMARY KEY (`ID`)");
                    trL.guardarRegistro("ALTER TABLE `billetes` ADD PRIMARY KEY (`id`)");
                    trL.guardarRegistro("ALTER TABLE `caja` ADD PRIMARY KEY (`numero`)");
                    trL.guardarRegistro("ALTER TABLE `coeficienteslistas` ADD PRIMARY KEY (`id`)");
                    trL.guardarRegistro("ALTER TABLE `combo` ADD PRIMARY KEY (`id`)");
                    trL.guardarRegistro("ALTER TABLE `comprobantes` ADD PRIMARY KEY (`numero`)");
                    trL.guardarRegistro("ALTER TABLE `depositos` ADD PRIMARY KEY (`numero`)");
                    trL.guardarRegistro("ALTER TABLE `fiscal` ADD PRIMARY KEY (`id`), ADD KEY `numero_2` (`numero`)");
                    trL.guardarRegistro("ALTER TABLE `ivaventas` ADD PRIMARY KEY (`id`)");
                    trL.guardarRegistro("ALTER TABLE `listcli` ADD PRIMARY KEY (`id`), ADD KEY `id` (`id`), ADD KEY `codmmd` (`codmmd`)");
                    trL.guardarRegistro("ALTER TABLE `movimientosarticulos` ADD PRIMARY KEY (`id`)");
                    trL.guardarRegistro("ALTER TABLE `movimientoscaja` ADD PRIMARY KEY (`id`), ADD KEY `fecha` (`fecha`)");
                    trL.guardarRegistro("ALTER TABLE `movimientosclientes` ADD PRIMARY KEY (`id`)");
                    trL.guardarRegistro("ALTER TABLE `movimientosproveedores` ADD PRIMARY KEY (`id`), ADD KEY `fecha` (`fecha`)");
                    trL.guardarRegistro("ALTER TABLE `proveedores` ADD PRIMARY KEY (`numero`)");
                    trL.guardarRegistro("ALTER TABLE `rubros` ADD PRIMARY KEY (`id`)");
                    trL.guardarRegistro("ALTER TABLE `sucursal` ADD PRIMARY KEY (`numero`)");
                    trL.guardarRegistro("ALTER TABLE `tipoacceso` ADD PRIMARY KEY (`numero`)");
                    trL.guardarRegistro("ALTER TABLE `tipocomprobantes` ADD PRIMARY KEY (`numero`)");
                    trL.guardarRegistro("ALTER TABLE `tipomovimientos` ADD PRIMARY KEY (`ID`)");
                    trL.guardarRegistro("ALTER TABLE `usuarios` ADD PRIMARY KEY (`numero`)");
                    trL.guardarRegistro("ALTER TABLE `articulos` MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT");
                    trL.guardarRegistro("ALTER TABLE `fiscal` MODIFY `id` int(11) NOT NULL AUTO_INCREMENT");
                    trL.guardarRegistro("ALTER TABLE `ivaventas` MODIFY `id` int(11) NOT NULL AUTO_INCREMENT");
                    trL.guardarRegistro("ALTER TABLE `listcli` MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4");
                    trL.guardarRegistro("ALTER TABLE `movimientosarticulos` MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT");
                    trL.guardarRegistro("ALTER TABLE `movimientoscaja` MODIFY `id` bigint(11) NOT NULL AUTO_INCREMENT");
                    trL.guardarRegistro("ALTER TABLE `movimientosclientes` MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT");
                    trL.guardarRegistro("ALTER TABLE `movimientosproveedores` MODIFY `id` int(11) NOT NULL AUTO_INCREMENT");
                    trL.guardarRegistro("ALTER TABLE `proveedores` MODIFY `numero` int(11) NOT NULL AUTO_INCREMENT");
                    trL.guardarRegistro("ALTER TABLE `rubros` MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9");
                    
                    //trL.guardarRegistro("source "+fichero.getAbsolutePath());
                    trL.guardarRegistro("grant all privileges on bbgestion.* to 'bambusoft'@'localhost' identified by 'Bghjiit889210}>'");
                    
                    
                    /*
                    rf.exec(mysql);
                    
                    mysql="C:\\Program Files (x86)\\MySQL\\MySQL Server 5.1\\bin\\mysql -u root -h localhost -e create database bbgestion CHARACTER SET 'utf8' COLLATE utf8_spanish_ci";
                    rf.exec(mysql);
                    
                    mysql="C:\\Program Files (x86)\\MySQL\\MySQL Server 5.1\\bin\\mysql -e grant all privileges on bbgestion.* to bbgestion -u root";
                    rf.exec(mysql);
                    mysql="C:\\Program Files (x86)\\MySQL\\MySQL Server 5.1\\bin\\mysql -e grant all privileges on bbgestion.* to bbgestion -u root";
                    rf.exec(mysql);
                    mysql="C:\\Program Files (x86)\\MySQL\\MySQL Server 5.1\\bin\\mysql -u root -h localhost -e use bbgestion; source bbgestion.sql;";
                    rf.exec(mysql);
                    */
                    
                 String sql;   
                String usuario=JOptionPane.showInputDialog(null,"Ingrese el nombre de usuario que desea instalar en el sistema");
                String claveU=JOptionPane.showInputDialog(null,"Ingrese la clave para el usuario generado por favor.\n Gracias");
                sql="update usuarios set nombreusuario='"+usuario+"', clave='"+claveU+"' where numero=1";
                Transaccionable tt=new Conecciones();
                tt.guardarRegistro(sql);
                    respuesta=1;
                    } catch(Exception e) { 
                        JOptionPane.showMessageDialog(null,"Hubo un error al ejecutar el archivo msi: "+e.getMessage());
                    }
        return respuesta;
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
                    p.setProperty("FISCAL", String.valueOf(rs.getInt("fiscal")));
                    p.setProperty("ELECTRONICA",String.valueOf(rs.getInt("electronica")));
                    if(rs.getInt("electronica")==1){
                        
                        p.setProperty("KEY",rs.getString("key"));
                        p.setProperty("CUIT",rs.getString("cuit"));
                        p.setProperty("INGBRUTOS",rs.getString("brutos"));
                        p.setProperty("INICIOACT", rs.getString("act"));
                        p.setProperty("PTO",String.valueOf(rs.getInt("pto")));
                        Instalable insta=new Facturas();
                        insta.InstalarTablas();
                        Instalable isEle=new FacturaElectronica();
                        isEle.InstalarTablas();
                        Instalable insDet=new DetalleFacturas();
                        insDet.InstalarTablas();
                        
                    }
                    
                }
                rs.close();
                sql="update clientes set accesos=accesos +1 where id='"+ID+"'";
                tra.guardarRegistro(sql);
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
