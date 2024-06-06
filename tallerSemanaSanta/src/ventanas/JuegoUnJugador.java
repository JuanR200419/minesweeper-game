package ventanas;

import controlador.ControladorJuegoSolitario;
import execepciones.numeroInvalidoException;
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
public class JuegoUnJugador extends javax.swing.JFrame implements ActionListener {

    ControladorJuegoSolitario control;
    JButton[][] botones;
    int puntajeActual;
    int record;
    int fila;
    int columna;
    int bombas;

    public JuegoUnJugador(int bombas, int fila, int columna)  {
        initComponents();
        this.control = new ControladorJuegoSolitario(fila, columna, bombas);
        botones = new JButton[fila][columna];
        this.record = control.getRecord();
        txtPuntaje.setText(String.valueOf(record));
        txtBombasTotales.setText(String.valueOf(control.getNumMinas()));
        puntajeActual = 0;
        cargarBotonesV2();
        this.columna = columna;
        this.fila = fila;
        this.bombas = bombas;
        validarPosiciones();
    }

    private void cargarBotonesV2() {
        int ancho = 25;
        int alto = 25;
        // Espacio vertical entre botones
        int texto = 101;
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j] = new JButton();
                // la Y es la separacion que hay arriba 
                int extraSeparacionY = 5;
                // la X es la separacion que hay en la derecha   
                int extraSeparacionX = 5;
                // Calcular las coordenadas X e Y para el botón actual
                int posX = j * (ancho + extraSeparacionX);
                int posY = i * (alto + extraSeparacionY);
                // Establecer la posición y el tamaño del botón
                botones[i][j].setBounds(posX, posY, ancho, alto);
                botones[i][j].addActionListener(this);
                jPanel1.add(botones[i][j]);
                // Incrementar el contador de texto
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPuntaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPuntajeActual = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBombasTotales = new javax.swing.JLabel();
        txtEmoji = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setText("PUNTAJE RECORD:");

        txtPuntaje.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txtPuntaje.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setText("PUNTAJE ACTUAL:");

        txtPuntajeActual.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txtPuntajeActual.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setText("BOMBAS TOTALES:");

        txtBombasTotales.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txtBombasTotales.setForeground(new java.awt.Color(255, 0, 0));

        txtEmoji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emo_emoji_smile_smiley_happy_emoticon_face_icon_152131.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtEmoji))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtBombasTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPuntajeActual, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addGap(0, 0, 0)
                        .addComponent(txtPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEmoji)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtBombasTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtPuntajeActual, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtBombasTotales;
    private javax.swing.JLabel txtEmoji;
    private javax.swing.JLabel txtPuntaje;
    private javax.swing.JLabel txtPuntajeActual;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                if (ae.getSource().equals(botones[i][j])) {
                    Bomba bombita = control.obtenerBomba(i, j);
                    if (bombita.isMinas()) {
                        bombita.setEstado(Bomba.ABIERTA);
                        botones[i][j].setBackground(Color.red);
                        validarPosiciones();
                        control.puntajeRecord(puntajeActual);
                        JOptionPane.showMessageDialog(null, "Juego teminado");
                        FinJuego fin = new FinJuego(bombas, fila, columna,1);
                        fin.setVisible(true);
                        fin.setLocationRelativeTo(this);
                        this.dispose();
                    } else {
                        bombita.setEstado(Bomba.ABIERTA);
                        botones[i][j].setBackground(Color.GREEN);
                        puntajeActual++;
                        int text = puntajeActual >= record ? puntajeActual : record;
                        txtPuntajeActual.setText(String.valueOf(puntajeActual));
                        txtPuntaje.setText(String.valueOf(text));
                    }
                }

            }
        }

    }

    public void validarPosiciones() {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                Bomba bomba = control.obtenerBomba(i, j);
                if (bomba.getEstado().equals(Bomba.SINABRIR)) {
                    botones[i][j].setBackground(Color.white);
                } else if (bomba.getEstado().equals(Bomba.ABIERTA)) {
                    if (bomba.isMinas()) {
                        botones[i][j].setBackground(Color.RED);
                    } else {
                        botones[i][j].setBackground(Color.GREEN);
                    }
                }
            }
        }
    }
}
