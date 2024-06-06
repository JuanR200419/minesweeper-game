/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import controlador.ControladorInicial;
import java.awt.Color;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelado.Jaula;

/**
 *
 * @author Juan Manuel
 */
public class VentanaInicial extends javax.swing.JFrame implements ActionListener {

    private ControladorInicial control;
    JButton[][] botones;

    public VentanaInicial() {
        initComponents();
        botones = new JButton[4][4];
        control = new ControladorInicial();
        this.setLocationRelativeTo(this);
        cargarBotones();
        validarPosiciones();
    }



    private void cargarBotones() {
        int ancho = 80;
        int alto = 40;
        // Espacio vertical entre botones
        int texto = 101;
        int separacionY=5;
        int separacionX=5;
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j] = new JButton();
                // la Y es la separacion que hay arriba 
                int extraSeparacionY = (i == botones.length-1 ) || (i == 1) ? 15 :0;
                // la X es la separacion que hay en la derecha   
                int extraSeparacionX = j > 0 ? 20 : 0;
                separacionY = i==2?15:5;
                // Calcular las coordenadas X e Y para el botón actual
                int posX = j * (ancho + separacionX+extraSeparacionX);
                int posY = i * (alto +separacionY+ extraSeparacionY);
                // Establecer la posición y el tamaño del botón
                botones[i][j].setBounds(posX, posY, ancho, alto);
                // Establecer el texto y agregar el ActionListener
                String textoFinal= "J" + i + "-" + texto;
                botones[i][j].setText(textoFinal);
                botones[i][j].addActionListener(this);
                // Agregar el botón al panel
                jPanel1.add(botones[i][j]);
                // Incrementar el contador de texto
                texto++;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/video-game-play-pad-boy-gameboy-nintendo_108539.png"))); // NOI18N
        jButton1.setText("JUGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       LobbyJuego lob = new LobbyJuego();
       lob.setVisible(true);
       lob.setLocationRelativeTo(this);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
       public void validarPosiciones() {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                Jaula jaula = control.obtenerLocal(i, j);
                
                if (jaula.getEstado().equals(Jaula.VACIA)) {
                    botones[i][j].setBackground(Color.white);
                    botones[i][j].setText(String.valueOf(botones[i][j].getText()));
                } else if(jaula.getEstado().equals(Jaula.LLENA)) {
                    botones[i][j].setBackground(Color.BLUE);
                    botones[i][j].setText(String.valueOf(botones[i][j].getText()));
                }else if(jaula.getEstado().equals(Jaula.UNPUESTO)){
                    botones[i][j].setBackground(Color.YELLOW);
                    botones[i][j].setText(String.valueOf(botones[i][j].getText()));
                }
            }
        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                if (ae.getSource().equals(botones[i][j])) {
                    Jaula jaula = control.obtenerLocal(i, j);
                    if (jaula.getEstado().equals(Jaula.VACIA)) {
                        GestionMascota ventana = new GestionMascota(jaula,botones[i][j].getText());
                        ventana.setVisible(true);
                        ventana.setLocationRelativeTo(this);
                        this.dispose();
                    } else if (jaula.getEstado().equals(Jaula.LLENA)) {
                       GestionMascota ventana = new GestionMascota(jaula,botones[i][j].getText());
                        ventana.setVisible(true);
                        ventana.setLocationRelativeTo(this);
                        this.dispose();
                    } else if (jaula.getEstado().equals(Jaula.UNPUESTO)) {
                         GestionMascota ventana = new GestionMascota(jaula,botones[i][j].getText());
                        ventana.setVisible(true);
                        ventana.setLocationRelativeTo(this);
                        this.dispose();
                    }
                }

            }
        }
    }
}


