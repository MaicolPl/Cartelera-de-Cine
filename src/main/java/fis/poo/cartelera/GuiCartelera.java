/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fis.poo.cartelera;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author usuario
 */
public class GuiCartelera extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GuiCartelera.class.getName());

    
    ArrayList<Pelicula> peliculas = new ArrayList<>();
    
    private Cine cine;
    /**
     * Creates new form GuiCartelera
     */
    public GuiCartelera() {
    this(new Cine());
}
    
    public GuiCartelera(Cine cine) {
        initComponents();
        this.cine = cine;
        
        this.setLocationRelativeTo(null);
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       
        btnFactura.setFocusPainted(false);
        
        cbxUbicacion.addItem("Condado");
        cbxUbicacion.addItem("Quicentro");
        cbxUbicacion.addItem("CCI");
        
        System.out.println("Hola");
        
         peliculas.add(new Pelicula("MINIONS Y MONSTRUOS","Los Minions emprenden un viaje para encontrar"
                 + " criaturas aterradoras para que aparezcan en su película de monstruos.\n" +
                    "","/imagenes/MINION.jpg","1h 45min","/imagenes/MinionsBaneer.jpeg","https://www.youtube.com/watch?v=4Wm2P-4Ilvc"));
         peliculas.add(new Pelicula("SPIDER MAN UN NUEVO DIA","Tras el Día del Juicio Final, Peter"
                 + " Parker intenta centrarse en la universidad y abandonar a Spider-Man. "
                 + "Cuando una nueva amenaza pone en peligro a sus amigos, debe romper "
                 + "su promesa y volver al traje.","/imagenes/Spider.jpg","2h 40min","","")); 
         peliculas.add(new Pelicula("MOANA","Moana que quiere ser una viajera marinera."
                 + " Cuando su isla natal se ve amenazada, Moana debe adentrarse en el mar"
                 + " junto a un semidiós llamado Maui para salvar a su pueblo.","/imagenes/moana.jpg","2h 10min","",""));
         peliculas.add(new Pelicula("EVIL DEAD EN LLAMAS","Tras de la pérdida de su esposo, "
                 + "una mujer busca consuelo con sus suegros. "
                 + "A medida que uno a uno se transforman en deaítas, "
                 + "ella llega a descubrir que los votos que tomó en la vida "
                 + "- perviven incluso en la muerte.","/imagenes/evildead.jpg","2h 05min","",""));
         peliculas.add(new Pelicula("LA ODISEA","Después de la Guerra de Troya, "
                 + "Odiseo se enfrenta a un peligroso viaje de regreso a Ítaca, "
                 + "encontrándose con criaturas como el cíclope Polifemo, las Sirenas y "
                 + "Calipso en el camino.","/imagenes/odisea.jpg","3h 10min","",""));
         peliculas.add(new Pelicula("TOY STORY 5","Los juguetes están de vuelta. Esta vez, "
                 + "Buzz Lightyear, Woody, Jessie y el resto de la pandilla se enfrentan a un nuevo reto "
                 + "cuando conocen a Lilypad, una nueva tablet que llega con sus propias ideas "
                 + "disruptivas sobre lo que es mejor para Bonnie. ¿Volverá a ser lo mismo "
                 + "la hora de jugar?","/imagenes/toystory.jpg","2h 00min","",""));
         peliculas.add(new Pelicula("SUPERGIRL","Tomando como referencia la reciente miniserie escrita por Tom King, "
                 + "esta película promete una visión diferente de lo que la mayoría piensa cuando le viene a la mente "
                 + "la prima de Superman. \"Veremos la diferencia entre Superman, que fue enviado a la Tierra y criado "
                 + "por unos padres cariñosos desde que era un bebé, y Supergirl, criada en una roca, una astilla de Krypton, "
                 + "y que vio morir y ser asesinados de formas terribles a todos los que la rodeaban durante los primeros 14 años "
                 + "de su vida para luego venir a la Tierra. Ella es mucho más dura y no es la Supergirl a la que estamos "
                 + "acostumbrados\".","/imagenes/supergirl.jpg","2h 05min","",""));
         peliculas.add(new Pelicula("BACKROOMS","Una extraña puerta aparece en el sótano de una exposición de muebles. "
                 + "Cuando el paciente de una terapeuta desaparece en una dimensión más allá de la realidad, ella deberá adentrarse "
                 + "en lo desconocido para intentar salvarlo... Adaptación de un cortometraje del propio "
                 + "Kane Parsons.","/imagenes/backrooms.jpg","2h 05min","",""));
         peliculas.add(new Pelicula("EL DIA DE LA REVELACION","Si descubrieras que no estamos solos, si alguien te abriera los ojos "
                 + "y te lo demostrase, ¿te asustarías? Este verano, la verdad será revelada a siete mil millones de personas. "
                 + "Llega... el día de la revelación.","/imagenes/revelacion.jpg","2h 40min","",""));
         
         peliculas.add(new Pelicula("AMOS DEL UNIVERSO","He-Man, el hombre más poderoso del universo, va contra el malvado Skeletor "
                 + "para salvar el planeta Eternia y proteger los secretos del Castillo Grayskull.","/imagenes/amos.jpg","2h 30min","",""));
         
         
         Collections.shuffle(peliculas);
         

        //colocarImagen(lblMovie1, peliculas.get(0).getPortada());
        
        
         JLabel[] labels = {lblMovie1, lblMovie2, lblMovie3, lblMovie4,
             lblMovie5,lblMovie6,lblMovie7,lblMovie8,lblMovie9,lblMovie10};

        for (int i = 0; i < labels.length; i++) {
            colocarImagen(labels[i], peliculas.get(i).getPortada());
        }
        
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/Logo.jpg"));
       colocarImagen(lblLogo, icono);
        
        
    }

     private void colocarImagen(javax.swing.JLabel label, ImageIcon icono) {

        Image imagen = icono.getImage().getScaledInstance(
                label.getWidth(),
                label.getHeight(),
                Image.SCALE_SMOOTH);

        label.setIcon(new ImageIcon(imagen));
    }
    private void abrirPelicula(int index) {
        Pelicula p = peliculas.get(index);
        if (cbxUbicacion.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Seleccione una ubicación");
            return;
        }
        cine.setUbicacion(cbxUbicacion.getSelectedItem().toString());
        
        new VentanaPelicula(p,cine).setVisible(true);
        this.dispose();
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        cbxUbicacion = new javax.swing.JComboBox<>();
        btnFactura = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblMovie1 = new javax.swing.JLabel();
        lblMovie2 = new javax.swing.JLabel();
        lblMovie3 = new javax.swing.JLabel();
        lblMovie4 = new javax.swing.JLabel();
        lblMovie5 = new javax.swing.JLabel();
        lblMovie6 = new javax.swing.JLabel();
        lblMovie7 = new javax.swing.JLabel();
        lblMovie9 = new javax.swing.JLabel();
        lblMovie8 = new javax.swing.JLabel();
        lblMovie10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cartelera");

        lblLogo.setMaximumSize(new java.awt.Dimension(100, 100));

        cbxUbicacion.addActionListener(this::cbxUbicacionActionPerformed);

        btnFactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFactura.setText("Facturas");
        btnFactura.setBorder(null);
        btnFactura.setBorderPainted(false);
        btnFactura.addActionListener(this::btnFacturaActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(cbxUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setHorizontalScrollBar(null);

        lblMovie1.setBackground(new java.awt.Color(255, 255, 255));
        lblMovie1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lblMovie1.setOpaque(true);
        lblMovie1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMovie1MouseClicked(evt);
            }
        });

        lblMovie2.setBackground(new java.awt.Color(255, 255, 255));
        lblMovie2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lblMovie2.setOpaque(true);
        lblMovie2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMovie2MouseClicked(evt);
            }
        });

        lblMovie3.setBackground(new java.awt.Color(255, 255, 255));
        lblMovie3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lblMovie3.setOpaque(true);
        lblMovie3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMovie3MouseClicked(evt);
            }
        });

        lblMovie4.setBackground(new java.awt.Color(255, 255, 255));
        lblMovie4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lblMovie4.setOpaque(true);
        lblMovie4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMovie4MouseClicked(evt);
            }
        });

        lblMovie5.setBackground(new java.awt.Color(255, 255, 255));
        lblMovie5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lblMovie5.setOpaque(true);
        lblMovie5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMovie5MouseClicked(evt);
            }
        });

        lblMovie6.setBackground(new java.awt.Color(255, 255, 255));
        lblMovie6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lblMovie6.setOpaque(true);
        lblMovie6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMovie6MouseClicked(evt);
            }
        });

        lblMovie7.setBackground(new java.awt.Color(255, 255, 255));
        lblMovie7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lblMovie7.setOpaque(true);
        lblMovie7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMovie7MouseClicked(evt);
            }
        });

        lblMovie9.setBackground(new java.awt.Color(255, 255, 255));
        lblMovie9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lblMovie9.setOpaque(true);
        lblMovie9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMovie9MouseClicked(evt);
            }
        });

        lblMovie8.setBackground(new java.awt.Color(255, 255, 255));
        lblMovie8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lblMovie8.setOpaque(true);
        lblMovie8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMovie8MouseClicked(evt);
            }
        });

        lblMovie10.setBackground(new java.awt.Color(255, 255, 255));
        lblMovie10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lblMovie10.setOpaque(true);
        lblMovie10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMovie10MouseClicked(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMovie1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMovie9, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMovie2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMovie6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblMovie8, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(lblMovie10, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMovie5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblMovie3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMovie4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMovie7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMovie2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMovie1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMovie3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMovie4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMovie5, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMovie6, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMovie7, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMovie9, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMovie8, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMovie10, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMovie1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovie1MouseClicked
        abrirPelicula(0);
        /*Pelicula p = peliculas.get(0);
         new VentanaPelicula(p).setVisible(true);
         this.dispose();
         */
    }//GEN-LAST:event_lblMovie1MouseClicked

    private void lblMovie2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovie2MouseClicked
        abrirPelicula(1); 
    }//GEN-LAST:event_lblMovie2MouseClicked

    private void lblMovie5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovie5MouseClicked
        abrirPelicula(4);
    }//GEN-LAST:event_lblMovie5MouseClicked

    private void lblMovie3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovie3MouseClicked
        abrirPelicula(2);
    }//GEN-LAST:event_lblMovie3MouseClicked

    private void lblMovie4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovie4MouseClicked
        abrirPelicula(3);
    }//GEN-LAST:event_lblMovie4MouseClicked

    private void lblMovie9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovie9MouseClicked
         abrirPelicula(8);
    }//GEN-LAST:event_lblMovie9MouseClicked

    private void lblMovie8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovie8MouseClicked
         abrirPelicula(7);
    }//GEN-LAST:event_lblMovie8MouseClicked

    private void lblMovie10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovie10MouseClicked
         abrirPelicula(9);
    }//GEN-LAST:event_lblMovie10MouseClicked

    private void lblMovie6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovie6MouseClicked
        abrirPelicula(5);
    }//GEN-LAST:event_lblMovie6MouseClicked

    private void lblMovie7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMovie7MouseClicked
        abrirPelicula(6);
    }//GEN-LAST:event_lblMovie7MouseClicked

    private void cbxUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUbicacionActionPerformed
   
        
        cbxUbicacion.addActionListener(e -> {
         if (cbxUbicacion.getSelectedIndex() != -1) {
          this.dispose();
         new GuiCartelera(cine).setVisible(true);
        }
    });
        
    }//GEN-LAST:event_cbxUbicacionActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
    
        new Factura(cine).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFacturaActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new GuiCartelera().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFactura;
    private javax.swing.JComboBox<String> cbxUbicacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMovie1;
    private javax.swing.JLabel lblMovie10;
    private javax.swing.JLabel lblMovie2;
    private javax.swing.JLabel lblMovie3;
    private javax.swing.JLabel lblMovie4;
    private javax.swing.JLabel lblMovie5;
    private javax.swing.JLabel lblMovie6;
    private javax.swing.JLabel lblMovie7;
    private javax.swing.JLabel lblMovie8;
    private javax.swing.JLabel lblMovie9;
    // End of variables declaration//GEN-END:variables
}
