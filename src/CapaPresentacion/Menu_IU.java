/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaPresentacion;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author SHEY Y YOVAN
 */
public class Menu_IU extends javax.swing.JFrame {

    /**
     * Creates new form Menu_IU
     */
    public Menu_IU() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes_Proyecto/FONDO_FARMA.jpg"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jToolBar1 = new javax.swing.JToolBar();
        btnProductos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnCompras = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnIngresos = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnEgresos = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnVentas = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnCaja = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnCerrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_mantenimiento = new javax.swing.JMenu();
        Mantenimiento_Item_TipoUsuario = new javax.swing.JMenuItem();
        Mantenimiento_Item_Usuario = new javax.swing.JMenuItem();
        mantenimiento_item_turno = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mantenimiento_item_laboratorio = new javax.swing.JMenuItem();
        mantenimiento_item_categoria = new javax.swing.JMenuItem();
        mantenimiento_item_medida = new javax.swing.JMenuItem();
        mantenimiento_item_producto = new javax.swing.JMenuItem();
        mantenimiento_item_composicion = new javax.swing.JMenuItem();
        menu_compras = new javax.swing.JMenu();
        menu_inventario = new javax.swing.JMenu();
        menu_ventas = new javax.swing.JMenu();
        menu_caja = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMPRESA X");
        setExtendedState(6);

        escritorio.setBackground(new java.awt.Color(0, 0, 0));
        escritorio.setToolTipText("");

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setRollover(true);

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Proyecto/producto.png"))); // NOI18N
        btnProductos.setEnabled(false);
        btnProductos.setFocusable(false);
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnProductos);
        jToolBar1.add(jSeparator1);

        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Proyecto/compras.png"))); // NOI18N
        btnCompras.setEnabled(false);
        btnCompras.setFocusable(false);
        btnCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCompras);
        jToolBar1.add(jSeparator2);

        btnIngresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Proyecto/ingresos.png"))); // NOI18N
        btnIngresos.setEnabled(false);
        btnIngresos.setFocusable(false);
        btnIngresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnIngresos);
        jToolBar1.add(jSeparator3);

        btnEgresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Proyecto/egresos.png"))); // NOI18N
        btnEgresos.setEnabled(false);
        btnEgresos.setFocusable(false);
        btnEgresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEgresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEgresos);
        jToolBar1.add(jSeparator4);

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Proyecto/ventas.png"))); // NOI18N
        btnVentas.setEnabled(false);
        btnVentas.setFocusable(false);
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnVentas);
        jToolBar1.add(jSeparator5);

        btnCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Proyecto/caja.png"))); // NOI18N
        btnCaja.setEnabled(false);
        btnCaja.setFocusable(false);
        btnCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCaja);
        jToolBar1.add(jSeparator6);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Proyecto/cerrar.png"))); // NOI18N
        btnCerrar.setFocusable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCerrar);

        escritorio.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 442, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 255, 153));
        jMenuBar1.setEnabled(false);
        jMenuBar1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N

        menu_mantenimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        menu_mantenimiento.setText("MANTENIMIENTO");
        menu_mantenimiento.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        menu_mantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_mantenimientoActionPerformed(evt);
            }
        });

        Mantenimiento_Item_TipoUsuario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Mantenimiento_Item_TipoUsuario.setText("TIPO DE USUARIO");
        Mantenimiento_Item_TipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mantenimiento_Item_TipoUsuarioActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(Mantenimiento_Item_TipoUsuario);

        Mantenimiento_Item_Usuario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Mantenimiento_Item_Usuario.setText("USUARIO");
        Mantenimiento_Item_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mantenimiento_Item_UsuarioActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(Mantenimiento_Item_Usuario);

        mantenimiento_item_turno.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        mantenimiento_item_turno.setText("TURNO");
        mantenimiento_item_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimiento_item_turnoActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(mantenimiento_item_turno);
        menu_mantenimiento.add(jSeparator7);

        mantenimiento_item_laboratorio.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        mantenimiento_item_laboratorio.setText("LABORATORIO");
        mantenimiento_item_laboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimiento_item_laboratorioActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(mantenimiento_item_laboratorio);

        mantenimiento_item_categoria.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        mantenimiento_item_categoria.setText("CATEGORIA");
        mantenimiento_item_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimiento_item_categoriaActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(mantenimiento_item_categoria);

        mantenimiento_item_medida.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        mantenimiento_item_medida.setText("MEDIDA");
        mantenimiento_item_medida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimiento_item_medidaActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(mantenimiento_item_medida);

        mantenimiento_item_producto.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        mantenimiento_item_producto.setText("PRODUCTO");
        mantenimiento_item_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimiento_item_productoActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(mantenimiento_item_producto);

        mantenimiento_item_composicion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        mantenimiento_item_composicion.setText("COMPOSICION");
        mantenimiento_item_composicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimiento_item_composicionActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(mantenimiento_item_composicion);

        jMenuBar1.add(menu_mantenimiento);

        menu_compras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        menu_compras.setText("COMPRAS");
        menu_compras.setEnabled(false);
        menu_compras.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jMenuBar1.add(menu_compras);

        menu_inventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        menu_inventario.setText("INVENTARIO");
        menu_inventario.setEnabled(false);
        menu_inventario.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jMenuBar1.add(menu_inventario);

        menu_ventas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        menu_ventas.setText("VENTAS");
        menu_ventas.setEnabled(false);
        menu_ventas.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jMenuBar1.add(menu_ventas);

        menu_caja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        menu_caja.setText("CAJA");
        menu_caja.setEnabled(false);
        menu_caja.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jMenuBar1.add(menu_caja);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_mantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_mantenimientoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menu_mantenimientoActionPerformed

    private void Mantenimiento_Item_TipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mantenimiento_Item_TipoUsuarioActionPerformed
        // TODO add your handling code here:
        TipoUsuario_IU frame = new TipoUsuario_IU();
        escritorio.add(frame);
        Dimension deskopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((deskopSize.width - FrameSize.width) / 2, (deskopSize.height - FrameSize.height) / 2);
        frame.show();
    }//GEN-LAST:event_Mantenimiento_Item_TipoUsuarioActionPerformed

    private void Mantenimiento_Item_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mantenimiento_Item_UsuarioActionPerformed
        // TODO add your handling code here:
           Usuario_IU frame = new Usuario_IU();
        escritorio.add(frame);
        Dimension deskopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((deskopSize.width - FrameSize.width) / 2, (deskopSize.height - FrameSize.height) / 2);
        frame.show();
    }//GEN-LAST:event_Mantenimiento_Item_UsuarioActionPerformed

    private void btnIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresosActionPerformed

    private void mantenimiento_item_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimiento_item_turnoActionPerformed
        // TODO add your handling code here:
          Turno_IU frame = new Turno_IU();
        escritorio.add(frame);
        Dimension deskopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((deskopSize.width - FrameSize.width) / 2, (deskopSize.height - FrameSize.height) / 2);
        frame.show();
    }//GEN-LAST:event_mantenimiento_item_turnoActionPerformed

    private void mantenimiento_item_laboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimiento_item_laboratorioActionPerformed
        // TODO add your handling code here:
         Marca_IU frame = new Marca_IU();
        escritorio.add(frame);
        Dimension deskopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((deskopSize.width - FrameSize.width) / 2, (deskopSize.height - FrameSize.height) / 2);
        frame.show();
    }//GEN-LAST:event_mantenimiento_item_laboratorioActionPerformed

    private void mantenimiento_item_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimiento_item_categoriaActionPerformed
        // TODO add your handling code here:
         Categoria_IU frame = new Categoria_IU();
        escritorio.add(frame);
        Dimension deskopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((deskopSize.width - FrameSize.width) / 2, (deskopSize.height - FrameSize.height) / 2);
        frame.show();
    }//GEN-LAST:event_mantenimiento_item_categoriaActionPerformed

    private void mantenimiento_item_medidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimiento_item_medidaActionPerformed
        // TODO add your handling code here:
           Medida_IU frame = new Medida_IU();
        escritorio.add(frame);
        Dimension deskopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((deskopSize.width - FrameSize.width) / 2, (deskopSize.height - FrameSize.height) / 2);
        frame.show();
    }//GEN-LAST:event_mantenimiento_item_medidaActionPerformed

    private void mantenimiento_item_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimiento_item_productoActionPerformed
        // TODO add your handling code here:
         Producto_IU frame = new Producto_IU();
        escritorio.add(frame);
        Dimension deskopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((deskopSize.width - FrameSize.width) / 2, (deskopSize.height - FrameSize.height) / 2);
        frame.show();
    }//GEN-LAST:event_mantenimiento_item_productoActionPerformed

    private void mantenimiento_item_composicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimiento_item_composicionActionPerformed
        // TODO add your handling code here:
       Composicion_IU frame = new Composicion_IU();
        escritorio.add(frame);
        Dimension deskopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((deskopSize.width - FrameSize.width) / 2, (deskopSize.height - FrameSize.height) / 2);
        frame.show();
    }//GEN-LAST:event_mantenimiento_item_composicionActionPerformed

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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_IU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Mantenimiento_Item_TipoUsuario;
    private javax.swing.JMenuItem Mantenimiento_Item_Usuario;
    public static javax.swing.JButton btnCaja;
    public static javax.swing.JButton btnCerrar;
    public static javax.swing.JButton btnCompras;
    public static javax.swing.JButton btnEgresos;
    public static javax.swing.JButton btnIngresos;
    public static javax.swing.JButton btnProductos;
    public static javax.swing.JButton btnVentas;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mantenimiento_item_categoria;
    private javax.swing.JMenuItem mantenimiento_item_composicion;
    private javax.swing.JMenuItem mantenimiento_item_laboratorio;
    private javax.swing.JMenuItem mantenimiento_item_medida;
    private javax.swing.JMenuItem mantenimiento_item_producto;
    private javax.swing.JMenuItem mantenimiento_item_turno;
    public static javax.swing.JMenu menu_caja;
    public static javax.swing.JMenu menu_compras;
    public static javax.swing.JMenu menu_inventario;
    public javax.swing.JMenu menu_mantenimiento;
    public static javax.swing.JMenu menu_ventas;
    // End of variables declaration//GEN-END:variables
}
