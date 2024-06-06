/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import controlador.ControladorJuegoDosJugadores;
import controlador.ControladorJuegoSolitario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelado.Bomba;

/**
 *
 * @author Juan Manuel
 */
public class JuegoDosJugadores extends javax.swing.JFrame implements ActionListener {

    ControladorJuegoDosJugadores control;
    JButton[][] botones1;
    JButton[][] botones2;
    int contadorBombasJugadorUno = 0;
    int contadorBombasJugadorDos = 0;
    int contadorBombasRestantes;
    boolean jugador;
    int fila;
    int columna;
    int bombas;

    public JuegoDosJugadores(int bombas, int fila, int columna) {
        initComponents();
        txtTurno.setText("Jugador Uno");
        jugador = true;
        this.control = new ControladorJuegoDosJugadores(fila, columna, bombas);
        botones1 = new JButton[fila][columna];
        cargarBotonesV2();
        this.contadorBombasRestantes = control.getNumMinas();
        txtBombasRestantes.setText(String.valueOf(contadorBombasRestantes));
        txtBombasExplotadasJugadorUno.setText(String.valueOf(contadorBombasJugadorUno));
        txtBombasExplotadaJugadorDos.setText(String.valueOf(contadorBombasJugadorDos));
        this.columna = columna;
        this.fila = fila;
        this.bombas = bombas;
        validarPosiciones();
    }

    private void cargarBotonesV2() {
        int ancho = 25;
        int alto = 25;
        // Espacio vertical entre botones
        for (int i = 0; i < botones1.length; i++) {
            for (int j = 0; j < botones1[i].length; j++) {
                botones1[i][j] = new JButton();
// la Y es la separacion que hay arriba 
                int extraSeparacionY = 5;
                // la X es la separacion que hay en la derecha   
                int extraSeparacionX = 5;
                // Calcular las coordenadas X e Y para el botón actual
                int posX = j * (ancho + extraSeparacionX);
                int posY = i * (alto + extraSeparacionY);
                // Establecer la posición y el tamaño del botón
                botones1[i][j].setBounds(posX, posY, ancho, alto);
                // Establecer el texto y agregar el ActionListener

                botones1[i][j].addActionListener(this);
// Agregar el botón al panel
                panel2.add(botones1[i][j]);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBombasJugadorDos2 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBombasExplotadasJugadorUno = new javax.swing.JLabel();
        txtBombasExplotadaJugadorDos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBombasRestantes = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTurno = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("JUGADOR 1:");

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("JUGADOR 2:");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Bombas Explotadas:");

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Bombas Explotadas:");

        txtBombasExplotadasJugadorUno.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txtBombasExplotadasJugadorUno.setForeground(new java.awt.Color(255, 0, 0));

        txtBombasExplotadaJugadorDos.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txtBombasExplotadaJugadorDos.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Bombas Restantes:");

        txtBombasRestantes.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txtBombasRestantes.setForeground(new java.awt.Color(255, 0, 0));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("TURNO DE :");

        txtTurno.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txtTurno.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bombacool.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/explosion-nuclear.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/explosion-nuclear.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-player-48.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBombasRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(txtBombasExplotadasJugadorUno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(txtBombasExplotadaJugadorDos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtBombasExplotadasJugadorUno, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8)
                        .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtBombasExplotadaJugadorDos, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtBombasRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(12, 12, 12)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel txtBombasExplotadaJugadorDos;
    private javax.swing.JLabel txtBombasExplotadasJugadorUno;
    private javax.swing.JLabel txtBombasJugadorDos2;
    private javax.swing.JLabel txtBombasRestantes;
    private javax.swing.JLabel txtTurno;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < botones1.length; i++) {
            for (int j = 0; j < botones1[i].length; j++) {
                if (e.getSource().equals(botones1[i][j])) {
                    Bomba bomba1 = control.obtenerBomba(i, j);
                    if (jugador && bomba1.getEstado().equals(Bomba.SINABRIR)) {
                        if (bomba1.isMinas()) {
                            bomba1.setEstado(Bomba.ABIERTA);
                            contadorBombasJugadorUno++;
                            txtBombasExplotadasJugadorUno.setText(String.valueOf(contadorBombasJugadorUno));
                            contadorBombasRestantes--;
                            txtBombasRestantes.setText(String.valueOf(contadorBombasRestantes));
                            txtTurno.setText("Jugador Dos ");
                            jugador = false;
                            botones1[i][j].setBackground(Color.red);

                        } else {
                            bomba1.setEstado(Bomba.ABIERTA);
                            botones1[i][j].setBackground(Color.GREEN);
                            jugador = false;
                            txtTurno.setText("Jugador Dos ");
                        }
                    } else if (bomba1.getEstado().equals(Bomba.SINABRIR)) {

                        if (bomba1.isMinas()) {
                            bomba1.setEstado(Bomba.ABIERTA);
                            botones1[i][j].setBackground(Color.red);
                            contadorBombasJugadorDos++;
                            txtBombasExplotadaJugadorDos.setText(String.valueOf(contadorBombasJugadorDos));
                            contadorBombasRestantes--;
                            txtBombasRestantes.setText(String.valueOf(contadorBombasRestantes));
                            txtTurno.setText("Jugador Uno ");
                            jugador = true;
                        } else {
                            bomba1.setEstado(Bomba.ABIERTA);
                            botones1[i][j].setBackground(Color.GREEN);
                            txtTurno.setText("Jugador Uno ");
                            jugador = true;
                        }
                    }
                }

            }
        }
        // Llama al método validar() y almacena el resultado
        String texto = control.validarGanador(contadorBombasJugadorUno, contadorBombasJugadorDos, contadorBombasRestantes);
        if (!texto.isEmpty()) {
            JOptionPane.showMessageDialog(null, texto);
            FinJuego fin = new FinJuego(bombas, fila, columna, 2);
            fin.setVisible(true);
            fin.setLocationRelativeTo(this);
            this.dispose();
        }
    }

    public void validarPosiciones() {
        for (int i = 0; i < botones1.length; i++) {
            for (int j = 0; j < botones1[i].length; j++) {
                Bomba bomba = control.obtenerBomba(i, j);
                if (bomba.getEstado().equals(Bomba.SINABRIR)) {
                    botones1[i][j].setBackground(Color.white);
                } else if (bomba.getEstado().equals(Bomba.ABIERTA)) {
                    if (bomba.isMinas()) {
                        botones1[i][j].setBackground(Color.RED);
                    } else {
                        botones1[i][j].setBackground(Color.GREEN);
                    }
                }

            }
        }
    }
}
