/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGraficas;

import Clientes.Pantallas.AbmClientes;
import Actualizaciones.Actualiza;
import Actualizaciones.Actualiza1;
import Actualizaciones.BkDeConeccion;
import Compras.Proveedores;
import Depositos.Depositos;
import Excel.InformeMensual;
import Excel.LeerExcel;
import Excel.LeerIva;
import Excel.pdfsJavaGenerador;
import ObjetosBackUp.BackUp;
import ObjetosBackUp.Backapear;
import Sucursales.Cajas;
import Sucursales.ListasDePrecios;
import Sucursales.Sucursales;
import Sucursales.Usuarios;
import Clientes.Objetos.Clientes;
import Configuracion.Propiedades;
import FacturaE.AbmFacturaElectronica;
import facturacion.pantallas.IngresoDePedidos;
import facturacion.pantallas.IngresoNtaCred;
import interfacesPrograma.Cajeables;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import objetos.Articulos;
import objetos.BkUpRemoto;
import objetos.GastosF;

/**
 *
 * @author mauro
 */
public class Inicio extends javax.swing.JFrame {
    public static Integer niv;
    public static Usuarios usuario;
    public static Sucursales sucursal;
    public static Depositos deposito;
    public static Cajas caja;
    public static String fechaDia;
    public static Date fechaVal;
    public static Integer numeroCajaAdministradora=0;
    private BufferedImage img;
    public static Boolean coneccionRemota=true;
    public static Integer actualizable=0;
    public static int actualizacionesClientes=0;

    public void setNiv(Integer nive) {
        niv = nive;
        permisos(niv);
    }
    
    
    /**
     * Creates new form Inicio
     */
    public Inicio(Integer nivel) {
        //Articulos.CargarMap();
        //if(coneccionRemota){
        //Articulos.CargarMap();
        
        
        Inicio.coneccionRemota=false;
        if(Inicio.coneccionRemota){
            Proveedores.cargarListadoProv1();
        }else{
            Proveedores.cargarListadoProv();
        }
        Clientes.cargarMap();
        actualizacionesClientes=2;
        ListasDePrecios.cargarMap();
        //Cajas.BackapearCajas();
        Cajas.LeerCajaAdministradora();
        DecimalFormat fr=new DecimalFormat("00");
        Calendar c1=Calendar.getInstance();
	Calendar c2=new GregorianCalendar();
	String dia=Integer.toString(c2.get(Calendar.DAY_OF_MONTH));
	String mes=Integer.toString(c2.get(Calendar.MONTH));
	String ano=Integer.toString(c2.get(Calendar.YEAR));
	
        int da=Integer.parseInt(dia);
        int me=Integer.parseInt(mes);
        me++;
        dia=fr.format(da);
        mes=fr.format(me);
        fechaDia=ano+"-"+mes+"-"+dia;
	//System.err.println(fechaDia);
        //fecha="23/12/2011";
        String fh=ano+"-"+mes+"-"+dia;
        SimpleDateFormat ff=new SimpleDateFormat("yyyy-mm-dd");
        fechaVal = null;    
        try {
            fechaVal = ff.parse(fh);
        } catch (ParseException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        //permisos(niv);
        //}else{
        
        
        //Actualiza actu=new Actualiza();
        //actu.start();
        
        new Thread(new Actualiza()).start();
        Actualiza1 actu1=new Actualiza1();
        actu1.execute();
        
        //}
        initComponents();
        Image icon=new ImageIcon(getClass().getResource("/imagen/icono.png")).getImage();
        this.setIconImage(icon);
        System.out.println(Propiedades.getELECTRONICA());
        if(Propiedades.getELECTRONICA().equals("1")){
            this.jMenu10.setEnabled(true);
        }else{
            this.jMenu10.setEnabled(false);
        }
 
        //permisos(nivel);
    }

    public Inicio() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        try {
            img = ImageIO.read(new URL("http://www.bambusoft.com.ar/ArchivosGestion/imagenes/logoBambu.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            @Override
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);
                grphcs.drawImage(img, 0, 0, null);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(800,600);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISITEMA DE GESTION BAMBU SOFTWARE");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jDesktopPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jDesktopPane1ComponentShown(evt);
            }
        });

        jMenu1.setText("Administracion");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Administrar Rubros");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Listas de Precios");
        jMenuItem9.setEnabled(false);
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Sucursales");
        jMenuItem10.setEnabled(false);
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Depositos");
        jMenuItem11.setEnabled(false);
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem14.setText("Cajas");
        jMenuItem14.setEnabled(false);
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuItem21.setText("Administrar Informes");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem21);

        jMenuItem24.setText("Blanquear Base");
        jMenuItem24.setEnabled(false);
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem24);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Stock");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Ingreso de Mercaderia");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Articulos");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Consultas");
        jMenuItem13.setEnabled(false);
        jMenu2.add(jMenuItem13);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem18.setText("Generar Remito Interno");
        jMenuItem18.setEnabled(false);
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem18);

        jMenuItem19.setText("Administracion Stock Por Deposito");
        jMenuItem19.setEnabled(false);
        jMenu2.add(jMenuItem19);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Caja");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Abrir Caja");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Facturacion");
        jMenuItem2.setEnabled(false);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Arqueo de Caja");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Cierre de Caja");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem17.setText("Recibir Remito Interno");
        jMenuItem17.setEnabled(false);
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem17);

        jMenuItem25.setText("Nota de Credito");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem25);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Usuarios");
        jMenu4.setEnabled(false);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Cambiar de Usuario");
        jMenuItem1.setEnabled(false);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Parametros");
        jMenu5.setEnabled(false);

        jMenuItem15.setText("Tipos de Accesos");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Usuarios");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem16.setText("Recargos");
        jMenu5.add(jMenuItem16);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Clientes");
        jMenu6.setEnabled(false);

        jMenuItem20.setText("Modificacion de clientes");
        jMenuItem20.setEnabled(false);
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem20);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Gastos Fijos");
        jMenu7.setEnabled(false);

        jMenuItem22.setText("Administracion de Gastos Fijos");
        jMenuItem22.setEnabled(false);
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem22);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Bases de Datos");
        jMenu8.setEnabled(false);

        jMenuItem23.setText("Ejecutar sincronizacion");
        jMenuItem23.setEnabled(false);
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem23);

        jMenuBar1.add(jMenu8);

        jMenu10.setText("CAE Pendientes");

        jMenuItem26.setText("Listar");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem26);

        jMenuBar1.add(jMenu10);

        jMenu9.setText("Acerca de..");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDesktopPane1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDesktopPane1ComponentShown
        Loguin log=new Loguin();
        //this.jDesktopPane1.add(log);
        log.setVisible(true);
        //log.toFront();
        log.pack();
        
    }//GEN-LAST:event_jDesktopPane1ComponentShown

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Loguin ini=new Loguin();
        jDesktopPane1.add(ini);
        ini.setVisible(true);
        ini.toFront();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        IngresoDePedidos ingPed=new IngresoDePedidos();
        jDesktopPane1.add(ingPed);
        ingPed.setVisible(true);
        ingPed.toFront();
        try {
            ingPed.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       this.jMenuItem2.setEnabled(true);
       Cajeables caj=new Cajas();
       if(caj.VerificarCaja(usuario.getNumero(),sucursal.getNumero(),fechaDia)){
           Inicio.caja=(Cajas)caj.CargarCaja(usuario.getNumero(),sucursal.getNumero(),fechaDia);
       }else{
       Inicio.caja=new Cajas(1);
       Double saldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese Saldo Inicial","0.00"));
       //System.out.println("SALDO INGRESADO "+saldo);
       Inicio.caja.setSaldoInicial(saldo);
       
       Inicio.caja=(Cajas) caj.AbrirCaja(caja);
       }
       Inicio.sucursal.setCaja(caja);
       this.jMenuItem5.setEnabled(false);
       //System.out.println("CAJA Nº "+caja.getNumero());
       
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //Cajeables caj=new Cajas();
        //Cajas cajas=(Cajas)caj.ArquearCaja(caja);
        //System.out.println("SALDO DE CAJA "+cajas.getSaldoFinal());
        CajaAbm arq=new CajaAbm();
        jDesktopPane1.add(arq);
        arq.setVisible(true);
        arq.toFront();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        IngresoDeMercaderia ing=new IngresoDeMercaderia();
        jDesktopPane1.add(ing);
        ing.setVisible(true);
        ing.toFront();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       
       jMenu1.setEnabled(Inicio.usuario.getMenu().getMenu1());
       jMenu2.setEnabled(Inicio.usuario.getMenu().getMenu2());
       jMenu3.setEnabled(Inicio.usuario.getMenu().getMenu3());
       jMenu4.setEnabled(Inicio.usuario.getMenu().getMenu4());
       jMenu5.setEnabled(Inicio.usuario.getMenu().getMenu5());
       jMenu6.setEnabled(Inicio.usuario.getMenu().getMenu6());
       jMenu7.setEnabled(Inicio.usuario.getMenu().getMenu7());
              this.jMenuItem2.setEnabled(true);
       Cajeables caj=new Cajas();
       if(caj.VerificarCaja(usuario.getNumero(),sucursal.getNumero(),fechaDia)){
           this.caja=(Cajas)caj.CargarCaja(usuario.getNumero(),sucursal.getNumero(),fechaDia);
       }else{
       this.caja=new Cajas(1);
       Double saldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese Saldo Inicial","0.00"));
       //System.out.println("SALDO INGRESADO "+saldo);
       this.caja.setSaldoInicial(saldo);
       
       this.caja=(Cajas) caj.AbrirCaja(caja);
       }
       this.sucursal.setCaja(caja);
       this.jMenuItem5.setEnabled(false);

    }//GEN-LAST:event_formComponentShown

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        CajaAbm cajA=new CajaAbm();
        jDesktopPane1.add(cajA);
        cajA.setVisible(true);
        cajA.toFront();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        UsuariosAbm abmU=new UsuariosAbm();
        jDesktopPane1.add(abmU);
        abmU.setVisible(true);
        abmU.toFront();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        RubrosAbm rubross=new RubrosAbm();
        jDesktopPane1.add(rubross);
        rubross.setVisible(true);
        rubross.toFront();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        ListasDePreciosAbm ldpA=new ListasDePreciosAbm();
        jDesktopPane1.add(ldpA);
        ldpA.setVisible(true);
        ldpA.toFront();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        SucursalesAbm sucA=new SucursalesAbm();
        jDesktopPane1.add(sucA);
        sucA.setVisible(true);
        sucA.toFront();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        DepositosAbm depA=new DepositosAbm();
        jDesktopPane1.add(depA);
        depA.setVisible(true);
        depA.toFront();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        ArticulosAbm artt=new ArticulosAbm();
        jDesktopPane1.add(artt);
        artt.setVisible(true);
        artt.toFront();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        NuevoRemitoInterno nRem=new NuevoRemitoInterno();
        jDesktopPane1.add(nRem);
        nRem.setVisible(true);
        nRem.toFront();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ArqueoDeCaja cajaA=new ArqueoDeCaja();
        jDesktopPane1.add(cajaA);
        cajaA.setTitle("CIERRE DE CAJA");
        cajaA.setVisible(true);
        cajaA.toFront();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        RecepcionDeRemitoInterno nuevoRemito=new RecepcionDeRemitoInterno();
        jDesktopPane1.add(nuevoRemito);
        nuevoRemito.setVisible(true);
        nuevoRemito.toFront();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        AbmClientes clie=new AbmClientes();
        jDesktopPane1.add(clie);
        clie.setVisible(true);
        clie.toFront();
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        EmisorDeInformes emisor=new EmisorDeInformes();
        jDesktopPane1.add(emisor);
        emisor.setVisible(true);
        emisor.toFront();
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        GastosFijos gastos=new GastosFijos();
        jDesktopPane1.add(gastos);
        gastos.setVisible(true);
        gastos.toFront();
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        TipoAccesoAbm tipo=new TipoAccesoAbm();
        jDesktopPane1.add(tipo);
        tipo.setVisible(true);
        tipo.toFront();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        
                try {
                    //aplicacion.exec("java -jar C:/Gestor/ActualizadorPocoPrecio.jar");
                    Process aplicacion=Runtime.getRuntime().exec("java -jar C:/Gestor/ActualizadorPocoPrecio.jar");
                    InputStreamReader entrada = new InputStreamReader(aplicacion.getInputStream());
            BufferedReader stdInput = new BufferedReader(entrada);
                    String salida;

            //Si el comando tiene una salida la mostramos
            if((salida=stdInput.readLine()) != null){
            	System.out.println("Comando ejecutado Correctamente");
            	while ((salida=stdInput.readLine()) != null){
                	System.out.println(salida);
                }
            }else{
            	System.out.println("No se a producido ninguna salida");
            }
                } catch (IOException ex) {
                    Logger.getLogger(Actualiza1.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,"error al ejecutar actualizacion "+ex);
                }finally{
                    this.dispose();
                }
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
//        BkDeConeccion bkC=new BkDeConeccion();
        //bkC.limpiarBasesLocal();
        AbmIva libro=new AbmIva();
        jDesktopPane1.add(libro);
        libro.setVisible(true);
        libro.pack();
        libro.toFront();
        
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        IngresoNtaCred nta=new IngresoNtaCred();
        jDesktopPane1.add(nta);
        nta.setVisible(true);
        nta.pack();
        nta.toFront();
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        if(Propiedades.getBK().equals("1")){
            Backapear bb=new BackUp();
            System.out.println(bb.GenerarArchivos());
        }
        
        //System.out.println(bb.GenerarArchivos());
    }//GEN-LAST:event_formWindowClosing

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed
        
    }//GEN-LAST:event_jMenu9ActionPerformed

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        Presentacion prese=new Presentacion();
        jDesktopPane1.add(prese);
        //prese.setExtendedState(JFrame.MAXIMIZED_BOTH);
        prese.setVisible(true);
        prese.toFront();
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
         AbmFacturaElectronica fe=new AbmFacturaElectronica();
        Inicio.jDesktopPane1.add(fe);
        fe.setVisible(true);
        fe.toFront();
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    public void permisos(Integer nivel){
        jMenu1.setEnabled(Inicio.usuario.getMenu().getMenu1());
       jMenu2.setEnabled(Inicio.usuario.getMenu().getMenu2());
       jMenu3.setEnabled(Inicio.usuario.getMenu().getMenu3());
       jMenu4.setEnabled(Inicio.usuario.getMenu().getMenu4()); 
       jMenu5.setEnabled(Inicio.usuario.getMenu().getMenu5());
       this.jMenuItem2.setEnabled(true);
       Cajeables caj=new Cajas();
       if(caj.VerificarCaja(usuario.getNumero(),sucursal.getNumero(),fechaDia)){
           this.caja=(Cajas)caj.CargarCaja(usuario.getNumero(),sucursal.getNumero(),fechaDia);
       }else{
       this.caja=new Cajas(1);
       Double saldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese Saldo Inicial","0.00"));
       //System.out.println("SALDO INGRESADO "+saldo);
       this.caja.setSaldoInicial(saldo);
       
       this.caja=(Cajas) caj.AbrirCaja(caja);
       }
       this.sucursal.setCaja(caja);
       this.jMenuItem5.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
    public static javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    public static javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    public static javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
