/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fis.poo.cartelera;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author usuario
 */
public class SeleccionAsientos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SeleccionAsientos.class.getName());

    
    private Funcion funcion;
    private Cine cine;
    
    
    private boolean[][] seleccionados = new boolean[5][10];
    private JButton[][] botones = new JButton[5][10];
  
    private int cantidadSeleccionados = 0;
        
    public SeleccionAsientos(){initComponents();} 
    
    public SeleccionAsientos(Funcion funcion, Cine cine){
        initComponents();
        this.funcion = funcion;
        this.cine =cine;
        this.setLocationRelativeTo(null);
        btnPagar.setContentAreaFilled(false);
        btnPagar.setFocusPainted(false);
        
        botones[0][0] = btnA1;
        botones[0][1] = btnA2;
        botones[0][2] = btnA3;
        botones[0][3] = btnA4;
        botones[0][4] = btnA5;
        botones[0][5] = btnA6;
        botones[0][6] = btnA7;
        botones[0][7] = btnA8;
        botones[0][8] = btnA9;
        botones[0][9] = btnA10;
        botones[1][0] = btnB1;
        botones[1][1] = btnB2;
        botones[1][2] = btnB3;
        botones[1][3] = btnB4;
        botones[1][4] = btnB5;
        botones[1][5] = btnB6;
        botones[1][6] = btnB7;
        botones[1][7] = btnB8;
        botones[1][8] = btnB9;
        botones[1][9] = btnB10;
        botones[2][0] = btnC1;
        botones[2][1] = btnC2;
        botones[2][2] = btnC3;
        botones[2][3] = btnC4;
        botones[2][4] = btnC5;
        botones[2][5] = btnC6;
        botones[2][6] = btnC7;
        botones[2][7] = btnC8;
        botones[2][8] = btnC9;
        botones[2][9] = btnC10;
        botones[3][0] = btnD1;
        botones[3][1] = btnD2;
        botones[3][2] = btnD3;
        botones[3][3] = btnD4;
        botones[3][4] = btnD5;
        botones[3][5] = btnD6;
        botones[3][6] = btnD7;
        botones[3][7] = btnD8;
        botones[3][8] = btnD9;
        botones[3][9] = btnD10;
        botones[4][0] = btnE1;
        botones[4][1] = btnE2;
        botones[4][2] = btnE3;
        botones[4][3] = btnE4;
        botones[4][4] = btnE5;
        botones[4][5] = btnE6;
        botones[4][6] = btnE7;
        botones[4][7] = btnE8;
        botones[4][8] = btnE9;
        botones[4][9] = btnE10;

        cargarAsientos();
        actualizarContador();
        cantidadSeleccionados++;
        actualizarContador();
        cantidadSeleccionados--;
        actualizarContador();
       colocarImagen(lblImagen, funcion.getPelicula().getPortada());
    }
    
    private void seleccionarAsiento(int fila,int columna, JButton boton){
        if(funcion.getAsientos()[fila][columna]){
            JOptionPane.showMessageDialog(this,
            "Asiento ocupado");
            return;
        }
        
        int maximo = funcion.getBoletosGeneral()+ funcion.getBoletosNino()+funcion.getBoletos3RaEdad();
        
        if(seleccionados[fila][columna]){
            seleccionados[fila][columna]=false;
            cantidadSeleccionados--;
            boton.setBackground(null);
        }else{
            if(cantidadSeleccionados>=maximo){

            JOptionPane.showMessageDialog(this,"Ya seleccionó todos los asientos.");

                return;
            }
            seleccionados[fila][columna]=true;
            cantidadSeleccionados++;
            boton.setBackground(new Color(144, 238, 144));          
        }   
    }
    
    private void cargarAsientos(){
            for(int i=0;i<5;i++){

                for(int j=0;j<10;j++){

                    if(funcion.getAsientos()[i][j]){

                        botones[i][j].setEnabled(false);
                        botones[i][j].setBackground(new Color(102, 0, 26));
                    }
                 }
             }
            
    }
    private void actualizarContador(){

    int maximo = funcion.getBoletosGeneral()
               + funcion.getBoletosNino()
               + funcion.getBoletos3RaEdad();

    int restantes = maximo - cantidadSeleccionados;

    lblRestantes.setText("Asientos por seleccionar: " + restantes);
}
        private void colocarImagen(javax.swing.JLabel label, ImageIcon icono) {

        Image imagen = icono.getImage().getScaledInstance(
            label.getWidth(),
            label.getHeight(),
            Image.SCALE_SMOOTH);

        label.setIcon(new ImageIcon(imagen));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnPagar = new javax.swing.JButton();
        lblRestantes = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnB8 = new javax.swing.JButton();
        btnB9 = new javax.swing.JButton();
        btnB10 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        btnC6 = new javax.swing.JButton();
        btnC7 = new javax.swing.JButton();
        btnC8 = new javax.swing.JButton();
        btnC9 = new javax.swing.JButton();
        btnC10 = new javax.swing.JButton();
        btnD1 = new javax.swing.JButton();
        btnD2 = new javax.swing.JButton();
        btnD3 = new javax.swing.JButton();
        btnD4 = new javax.swing.JButton();
        btnD5 = new javax.swing.JButton();
        btnD6 = new javax.swing.JButton();
        btnD7 = new javax.swing.JButton();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnD8 = new javax.swing.JButton();
        btnA6 = new javax.swing.JButton();
        btnD9 = new javax.swing.JButton();
        btnA7 = new javax.swing.JButton();
        btnD10 = new javax.swing.JButton();
        btnE1 = new javax.swing.JButton();
        btnE2 = new javax.swing.JButton();
        btnE3 = new javax.swing.JButton();
        btnE4 = new javax.swing.JButton();
        btnE5 = new javax.swing.JButton();
        btnE6 = new javax.swing.JButton();
        btnE7 = new javax.swing.JButton();
        btnA8 = new javax.swing.JButton();
        btnA9 = new javax.swing.JButton();
        btnA10 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnE8 = new javax.swing.JButton();
        btnB6 = new javax.swing.JButton();
        btnE9 = new javax.swing.JButton();
        btnB7 = new javax.swing.JButton();
        btnE10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1071, 714));
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);

        btnPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPagar.setText("Completar Pago");
        btnPagar.setBorder(new javax.swing.border.MatteBorder(null));
        btnPagar.addActionListener(this::btnPagarActionPerformed);

        lblRestantes.setBackground(new java.awt.Color(255, 255, 255));
        lblRestantes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRestantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblImagen.setBackground(new java.awt.Color(255, 255, 255));
        lblImagen.setBorder(new javax.swing.border.MatteBorder(null));
        lblImagen.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRestantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1.setOpaque(false);

        jPanel2.setOpaque(false);

        btnB8.setBackground(new java.awt.Color(204, 204, 204));
        btnB8.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnB8.setText("B8");
        btnB8.addActionListener(this::btnB8ActionPerformed);

        btnB9.setBackground(new java.awt.Color(204, 204, 204));
        btnB9.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnB9.setText("B9");
        btnB9.addActionListener(this::btnB9ActionPerformed);

        btnB10.setBackground(new java.awt.Color(204, 204, 204));
        btnB10.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnB10.setText("B10");
        btnB10.addActionListener(this::btnB10ActionPerformed);

        btnC1.setBackground(new java.awt.Color(204, 204, 204));
        btnC1.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnC1.setText("C1");
        btnC1.addActionListener(this::btnC1ActionPerformed);

        btnC2.setBackground(new java.awt.Color(204, 204, 204));
        btnC2.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnC2.setText("C2");
        btnC2.addActionListener(this::btnC2ActionPerformed);

        btnC3.setBackground(new java.awt.Color(204, 204, 204));
        btnC3.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnC3.setText("C3");
        btnC3.addActionListener(this::btnC3ActionPerformed);

        btnC4.setBackground(new java.awt.Color(204, 204, 204));
        btnC4.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnC4.setText("C4");
        btnC4.addActionListener(this::btnC4ActionPerformed);

        btnC5.setBackground(new java.awt.Color(204, 204, 204));
        btnC5.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnC5.setText("C5");
        btnC5.addActionListener(this::btnC5ActionPerformed);

        btnC6.setBackground(new java.awt.Color(204, 204, 204));
        btnC6.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnC6.setText("C6");
        btnC6.addActionListener(this::btnC6ActionPerformed);

        btnC7.setBackground(new java.awt.Color(204, 204, 204));
        btnC7.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnC7.setText("C7");
        btnC7.addActionListener(this::btnC7ActionPerformed);

        btnC8.setBackground(new java.awt.Color(204, 204, 204));
        btnC8.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnC8.setText("C8");
        btnC8.addActionListener(this::btnC8ActionPerformed);

        btnC9.setBackground(new java.awt.Color(204, 204, 204));
        btnC9.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnC9.setText("C9");
        btnC9.addActionListener(this::btnC9ActionPerformed);

        btnC10.setBackground(new java.awt.Color(204, 204, 204));
        btnC10.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnC10.setText("C10");
        btnC10.addActionListener(this::btnC10ActionPerformed);

        btnD1.setBackground(new java.awt.Color(204, 204, 204));
        btnD1.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnD1.setText("D1");
        btnD1.addActionListener(this::btnD1ActionPerformed);

        btnD2.setBackground(new java.awt.Color(204, 204, 204));
        btnD2.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnD2.setText("C2");
        btnD2.addActionListener(this::btnD2ActionPerformed);

        btnD3.setBackground(new java.awt.Color(204, 204, 204));
        btnD3.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnD3.setText("C3");
        btnD3.addActionListener(this::btnD3ActionPerformed);

        btnD4.setBackground(new java.awt.Color(204, 204, 204));
        btnD4.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnD4.setText("C4");
        btnD4.addActionListener(this::btnD4ActionPerformed);

        btnD5.setBackground(new java.awt.Color(204, 204, 204));
        btnD5.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnD5.setText("D5");
        btnD5.addActionListener(this::btnD5ActionPerformed);

        btnD6.setBackground(new java.awt.Color(204, 204, 204));
        btnD6.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnD6.setText("D6");
        btnD6.addActionListener(this::btnD6ActionPerformed);

        btnD7.setBackground(new java.awt.Color(204, 204, 204));
        btnD7.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnD7.setText("D7");
        btnD7.addActionListener(this::btnD7ActionPerformed);

        btnA1.setBackground(new java.awt.Color(204, 204, 204));
        btnA1.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnA1.setText("A1");
        btnA1.addActionListener(this::btnA1ActionPerformed);

        btnA2.setBackground(new java.awt.Color(204, 204, 204));
        btnA2.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnA2.setText("A2");
        btnA2.addActionListener(this::btnA2ActionPerformed);

        btnA3.setBackground(new java.awt.Color(204, 204, 204));
        btnA3.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnA3.setText("A3");
        btnA3.addActionListener(this::btnA3ActionPerformed);

        btnA4.setBackground(new java.awt.Color(204, 204, 204));
        btnA4.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnA4.setText("A4");
        btnA4.addActionListener(this::btnA4ActionPerformed);

        btnA5.setBackground(new java.awt.Color(204, 204, 204));
        btnA5.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnA5.setText("A5");
        btnA5.addActionListener(this::btnA5ActionPerformed);

        btnD8.setBackground(new java.awt.Color(204, 204, 204));
        btnD8.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnD8.setText("D8");
        btnD8.addActionListener(this::btnD8ActionPerformed);

        btnA6.setBackground(new java.awt.Color(204, 204, 204));
        btnA6.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnA6.setText("A6");
        btnA6.addActionListener(this::btnA6ActionPerformed);

        btnD9.setBackground(new java.awt.Color(204, 204, 204));
        btnD9.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnD9.setText("D9");
        btnD9.addActionListener(this::btnD9ActionPerformed);

        btnA7.setBackground(new java.awt.Color(204, 204, 204));
        btnA7.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnA7.setText("A7");
        btnA7.addActionListener(this::btnA7ActionPerformed);

        btnD10.setBackground(new java.awt.Color(204, 204, 204));
        btnD10.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnD10.setText("D10");
        btnD10.addActionListener(this::btnD10ActionPerformed);

        btnE1.setBackground(new java.awt.Color(204, 204, 204));
        btnE1.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnE1.setText("E1");
        btnE1.addActionListener(this::btnE1ActionPerformed);

        btnE2.setBackground(new java.awt.Color(204, 204, 204));
        btnE2.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnE2.setText("E2");
        btnE2.addActionListener(this::btnE2ActionPerformed);

        btnE3.setBackground(new java.awt.Color(204, 204, 204));
        btnE3.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnE3.setText("E3");
        btnE3.addActionListener(this::btnE3ActionPerformed);

        btnE4.setBackground(new java.awt.Color(204, 204, 204));
        btnE4.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnE4.setText("E4");
        btnE4.addActionListener(this::btnE4ActionPerformed);

        btnE5.setBackground(new java.awt.Color(204, 204, 204));
        btnE5.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnE5.setText("E5");
        btnE5.addActionListener(this::btnE5ActionPerformed);

        btnE6.setBackground(new java.awt.Color(204, 204, 204));
        btnE6.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnE6.setText("E6");
        btnE6.addActionListener(this::btnE6ActionPerformed);

        btnE7.setBackground(new java.awt.Color(204, 204, 204));
        btnE7.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnE7.setText("E7");
        btnE7.addActionListener(this::btnE7ActionPerformed);

        btnA8.setBackground(new java.awt.Color(204, 204, 204));
        btnA8.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnA8.setText("A8");
        btnA8.addActionListener(this::btnA8ActionPerformed);

        btnA9.setBackground(new java.awt.Color(204, 204, 204));
        btnA9.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnA9.setText("A9");
        btnA9.addActionListener(this::btnA9ActionPerformed);

        btnA10.setBackground(new java.awt.Color(204, 204, 204));
        btnA10.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnA10.setText("A10");
        btnA10.addActionListener(this::btnA10ActionPerformed);

        btnB1.setBackground(new java.awt.Color(204, 204, 204));
        btnB1.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnB1.setText("B1");
        btnB1.addActionListener(this::btnB1ActionPerformed);

        btnB2.setBackground(new java.awt.Color(204, 204, 204));
        btnB2.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnB2.setText("B2");
        btnB2.addActionListener(this::btnB2ActionPerformed);

        btnB3.setBackground(new java.awt.Color(204, 204, 204));
        btnB3.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnB3.setText("B3");
        btnB3.addActionListener(this::btnB3ActionPerformed);

        btnB4.setBackground(new java.awt.Color(204, 204, 204));
        btnB4.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnB4.setText("B4");
        btnB4.addActionListener(this::btnB4ActionPerformed);

        btnB5.setBackground(new java.awt.Color(204, 204, 204));
        btnB5.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnB5.setText("B5");
        btnB5.addActionListener(this::btnB5ActionPerformed);

        btnE8.setBackground(new java.awt.Color(204, 204, 204));
        btnE8.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnE8.setText("E8");
        btnE8.addActionListener(this::btnE8ActionPerformed);

        btnB6.setBackground(new java.awt.Color(204, 204, 204));
        btnB6.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnB6.setText("B6");
        btnB6.addActionListener(this::btnB6ActionPerformed);

        btnE9.setBackground(new java.awt.Color(204, 204, 204));
        btnE9.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnE9.setText("E9");
        btnE9.addActionListener(this::btnE9ActionPerformed);

        btnB7.setBackground(new java.awt.Color(204, 204, 204));
        btnB7.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnB7.setText("B7");
        btnB7.addActionListener(this::btnB7ActionPerformed);

        btnE10.setBackground(new java.awt.Color(204, 204, 204));
        btnE10.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnE10.setText("E10");
        btnE10.addActionListener(this::btnE10ActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnE1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnA6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnA7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnA8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnA9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnA10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnE2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnE3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnE4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnE5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnE6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnE7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnE8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnE9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnE10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnB6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnB7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnB8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnB9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnB10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnC6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnC7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnC8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnC9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnC10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnD2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnD3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnD4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnD5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnD6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnD7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnD8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnD9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnD10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnD1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnE1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pantalla.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB1ActionPerformed
        seleccionarAsiento(1,0,btnB1);
    }//GEN-LAST:event_btnB1ActionPerformed

    private void btnB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB2ActionPerformed
        seleccionarAsiento(1,1,btnB2);
    }//GEN-LAST:event_btnB2ActionPerformed

    private void btnB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB3ActionPerformed
        seleccionarAsiento(1,2,btnB3);
    }//GEN-LAST:event_btnB3ActionPerformed

    private void btnB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB4ActionPerformed
        seleccionarAsiento(1,3,btnB4);
    }//GEN-LAST:event_btnB4ActionPerformed

    private void btnB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB5ActionPerformed
        seleccionarAsiento(1,4,btnB5);
    }//GEN-LAST:event_btnB5ActionPerformed

    private void btnB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB6ActionPerformed
        seleccionarAsiento(1,5,btnB6);
    }//GEN-LAST:event_btnB6ActionPerformed

    private void btnB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB7ActionPerformed
        seleccionarAsiento(1,6,btnB7);
    }//GEN-LAST:event_btnB7ActionPerformed

    private void btnB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB8ActionPerformed
        seleccionarAsiento(1,7,btnB8);
    }//GEN-LAST:event_btnB8ActionPerformed

    private void btnB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB9ActionPerformed
        seleccionarAsiento(1,8,btnB9);
    }//GEN-LAST:event_btnB9ActionPerformed

    private void btnB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB10ActionPerformed
        seleccionarAsiento(1,9,btnB10);
    }//GEN-LAST:event_btnB10ActionPerformed

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        seleccionarAsiento(2,0,btnC1);
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        seleccionarAsiento(2,1,btnC2);
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        seleccionarAsiento(2,2,btnC3);
    }//GEN-LAST:event_btnC3ActionPerformed

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        seleccionarAsiento(2,3,btnC4);
    }//GEN-LAST:event_btnC4ActionPerformed

    private void btnC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC5ActionPerformed
        seleccionarAsiento(2,4,btnC5);
    }//GEN-LAST:event_btnC5ActionPerformed

    private void btnC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC6ActionPerformed
        seleccionarAsiento(2,5,btnC6);
    }//GEN-LAST:event_btnC6ActionPerformed

    private void btnC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC7ActionPerformed
        seleccionarAsiento(2,6,btnC7);
    }//GEN-LAST:event_btnC7ActionPerformed

    private void btnC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC8ActionPerformed
        seleccionarAsiento(2,7,btnC8);
    }//GEN-LAST:event_btnC8ActionPerformed

    private void btnC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC9ActionPerformed
        seleccionarAsiento(2,8,btnC9);
    }//GEN-LAST:event_btnC9ActionPerformed

    private void btnC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC10ActionPerformed
        seleccionarAsiento(2,9,btnC10);
    }//GEN-LAST:event_btnC10ActionPerformed

    private void btnD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD1ActionPerformed
        seleccionarAsiento(3,0,btnD1);
    }//GEN-LAST:event_btnD1ActionPerformed

    private void btnD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD2ActionPerformed
        seleccionarAsiento(3,1,btnD2);
    }//GEN-LAST:event_btnD2ActionPerformed

    private void btnD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD3ActionPerformed
        seleccionarAsiento(3,2,btnD3);
    }//GEN-LAST:event_btnD3ActionPerformed

    private void btnD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD4ActionPerformed
        seleccionarAsiento(3,3,btnD4);
    }//GEN-LAST:event_btnD4ActionPerformed

    private void btnD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD5ActionPerformed
        seleccionarAsiento(3,4,btnD5);
    }//GEN-LAST:event_btnD5ActionPerformed

    private void btnD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD6ActionPerformed
        seleccionarAsiento(3,5,btnD6);
    }//GEN-LAST:event_btnD6ActionPerformed

    private void btnD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD7ActionPerformed
        seleccionarAsiento(3,6,btnD7);
    }//GEN-LAST:event_btnD7ActionPerformed

    private void btnD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD8ActionPerformed
        seleccionarAsiento(3,7,btnD8);
    }//GEN-LAST:event_btnD8ActionPerformed

    private void btnD9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD9ActionPerformed
        seleccionarAsiento(3,8,btnD9);
    }//GEN-LAST:event_btnD9ActionPerformed

    private void btnD10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD10ActionPerformed
        seleccionarAsiento(3,9,btnD10);
    }//GEN-LAST:event_btnD10ActionPerformed

    private void btnE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE1ActionPerformed
        seleccionarAsiento(4,0,btnE1);
    }//GEN-LAST:event_btnE1ActionPerformed

    private void btnE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE2ActionPerformed
        seleccionarAsiento(4,1,btnE2);
    }//GEN-LAST:event_btnE2ActionPerformed

    private void btnE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE3ActionPerformed
        seleccionarAsiento(4,2,btnE3);
    }//GEN-LAST:event_btnE3ActionPerformed

    private void btnE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE4ActionPerformed
        seleccionarAsiento(4,3,btnE4);
    }//GEN-LAST:event_btnE4ActionPerformed

    private void btnE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE5ActionPerformed
        seleccionarAsiento(4,4,btnE5);
    }//GEN-LAST:event_btnE5ActionPerformed

    private void btnE6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE6ActionPerformed
        seleccionarAsiento(4,5,btnE6);
    }//GEN-LAST:event_btnE6ActionPerformed

    private void btnE7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE7ActionPerformed
        seleccionarAsiento(4,6,btnE7);
    }//GEN-LAST:event_btnE7ActionPerformed

    private void btnE8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE8ActionPerformed
        seleccionarAsiento(4,7,btnE8);
    }//GEN-LAST:event_btnE8ActionPerformed

    private void btnE9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE9ActionPerformed
        seleccionarAsiento(4,8,btnE9);
    }//GEN-LAST:event_btnE9ActionPerformed

    private void btnE10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE10ActionPerformed
        seleccionarAsiento(4,9,btnE10);
    }//GEN-LAST:event_btnE10ActionPerformed

    private void btnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA1ActionPerformed
        seleccionarAsiento(0,0,btnA1);
    }//GEN-LAST:event_btnA1ActionPerformed

    private void btnA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA2ActionPerformed
        seleccionarAsiento(0,1,btnA2);
    }//GEN-LAST:event_btnA2ActionPerformed

    private void btnA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA3ActionPerformed
       seleccionarAsiento(0,2,btnA3);
    }//GEN-LAST:event_btnA3ActionPerformed

    private void btnA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA4ActionPerformed
        seleccionarAsiento(0,3,btnA4);
    }//GEN-LAST:event_btnA4ActionPerformed

    private void btnA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA5ActionPerformed
        seleccionarAsiento(0,4,btnA5);
    }//GEN-LAST:event_btnA5ActionPerformed

    private void btnA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA6ActionPerformed
        seleccionarAsiento(0,5,btnA6);
    }//GEN-LAST:event_btnA6ActionPerformed

    private void btnA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA7ActionPerformed
        seleccionarAsiento(0,6,btnA7);
    }//GEN-LAST:event_btnA7ActionPerformed

    private void btnA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA8ActionPerformed
        seleccionarAsiento(0,7,btnA8);
    }//GEN-LAST:event_btnA8ActionPerformed

    private void btnA9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA9ActionPerformed
        seleccionarAsiento(0,8,btnA9);
    }//GEN-LAST:event_btnA9ActionPerformed

    private void btnA10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA10ActionPerformed
        seleccionarAsiento(0,9,btnA10);
    }//GEN-LAST:event_btnA10ActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed

            for (int i = 0; i < 5; i++) {

                for (int j = 0; j < 10; j++) {

                    if (seleccionados[i][j]) {

                    funcion.getAsientos()[i][j] = true;
                    }
                 }
            }

            
        new RegistroDatos(funcion,cine).setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_btnPagarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new SeleccionAsientos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA1;
    private javax.swing.JButton btnA10;
    private javax.swing.JButton btnA2;
    private javax.swing.JButton btnA3;
    private javax.swing.JButton btnA4;
    private javax.swing.JButton btnA5;
    private javax.swing.JButton btnA6;
    private javax.swing.JButton btnA7;
    private javax.swing.JButton btnA8;
    private javax.swing.JButton btnA9;
    private javax.swing.JButton btnB1;
    private javax.swing.JButton btnB10;
    private javax.swing.JButton btnB2;
    private javax.swing.JButton btnB3;
    private javax.swing.JButton btnB4;
    private javax.swing.JButton btnB5;
    private javax.swing.JButton btnB6;
    private javax.swing.JButton btnB7;
    private javax.swing.JButton btnB8;
    private javax.swing.JButton btnB9;
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC10;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnC3;
    private javax.swing.JButton btnC4;
    private javax.swing.JButton btnC5;
    private javax.swing.JButton btnC6;
    private javax.swing.JButton btnC7;
    private javax.swing.JButton btnC8;
    private javax.swing.JButton btnC9;
    private javax.swing.JButton btnD1;
    private javax.swing.JButton btnD10;
    private javax.swing.JButton btnD2;
    private javax.swing.JButton btnD3;
    private javax.swing.JButton btnD4;
    private javax.swing.JButton btnD5;
    private javax.swing.JButton btnD6;
    private javax.swing.JButton btnD7;
    private javax.swing.JButton btnD8;
    private javax.swing.JButton btnD9;
    private javax.swing.JButton btnE1;
    private javax.swing.JButton btnE10;
    private javax.swing.JButton btnE2;
    private javax.swing.JButton btnE3;
    private javax.swing.JButton btnE4;
    private javax.swing.JButton btnE5;
    private javax.swing.JButton btnE6;
    private javax.swing.JButton btnE7;
    private javax.swing.JButton btnE8;
    private javax.swing.JButton btnE9;
    private javax.swing.JButton btnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblRestantes;
    // End of variables declaration//GEN-END:variables
}
