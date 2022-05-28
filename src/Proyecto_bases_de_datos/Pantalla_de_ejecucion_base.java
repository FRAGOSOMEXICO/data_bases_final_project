/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_bases_de_datos;

//import heap_sort.pantalla.*;

import Queries_graficas.segunda_conexion;
import java.util.Timer;
import java.applet.AudioClip;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.io.*;
import sun.audio.*;
import java.util.concurrent.ScheduledExecutorService;
import java.lang.Thread;
import java.io.*;
import javax.swing.JOptionPane;


/**
 *
 * @author biosh
 */
public class Pantalla_de_ejecucion_base extends javax.swing.JFrame {
     public static Pantalla_de_ejecucion_base menu_principal =new Pantalla_de_ejecucion_base();
     public Timer timer =new Timer();
  //   public  HACE_PROGRAMA application =new HACE_PROGRAMA();
     /*   AUDIO CLICK */    
     public AudioClip sonido_click ;
   //  explo_5=java.applet.Applet.newAudioClip(getClass().getResource("/heap_sort/Click de mouse-efecto de sonido (HD) (online-audio-converter.com).wav"));
           
     private int ensenia_instructivo;
    private static int esconde_pantalla1;
    
    
    /**
     * Creates new form Pantalla_de_ejecucion
     */
    public Pantalla_de_ejecucion_base() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Bodoni MT Condensed", 3, 28)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.setText("PROYECTO BASES DE DATOS");
        jButton1.setActionCommand("");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 360, 50));

        jButton3.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jButton3.setText("IR AL PROGRAMA");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        jButton2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton2.setText("SALIR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heap_sort/imagenes/bases_1_portada.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      /*BOTON PARA SALIR*/
        System.exit(0);
        
    }//GEN-LAST:event_jButton2ActionPerformed
 public void close()
      {
          WindowEvent winClosingEvent =new WindowEvent(this,WindowEvent.WINDOW_CLOSING);    
          Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
      }
          
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         dispose();
        Realiza_programa aparece =new Realiza_programa();
        segunda_conexion genera_conexion = new segunda_conexion();
        genera_conexion.getConnection();
            aparece.setVisible(true);
        
            
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        sonido_click=java.applet.Applet.newAudioClip(getClass().getResource("/heap_sort/Click de mouse-efecto de sonido (HD) (online-audio-converter.com).wav"));
        sonido_click.play(); 
         setEnsenia_instructivo(1);
               

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
         sonido_click=java.applet.Applet.newAudioClip(getClass().getResource("/heap_sort/Click de mouse-efecto de sonido (HD) (online-audio-converter.com).wav"));
         sonido_click.play();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked
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
            java.util.logging.Logger.getLogger(Pantalla_de_ejecucion_base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_de_ejecucion_base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_de_ejecucion_base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_de_ejecucion_base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                menu_principal.setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the ensenia_instructivo
     */
    public int getEnsenia_instructivo() {
        return ensenia_instructivo;
    }

    /**
     * @param ensenia_instructivo the ensenia_instructivo to set
     */
    public void setEnsenia_instructivo(int ensenia_instructivo) {
        this.ensenia_instructivo = ensenia_instructivo;
    }

    /**
     * @return the esconde_pantalla1
     */
    public static int getEsconde_pantalla1() {
        return esconde_pantalla1;
        
    }

    /**
     * @param aEsconde_pantalla1 the esconde_pantalla1 to set
     */
    public static void setEsconde_pantalla1(int aEsconde_pantalla1) {
        esconde_pantalla1 = aEsconde_pantalla1;
    }

}
