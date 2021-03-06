/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.harley.reman.interfaz.interfaces;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;
/**
 *
 * @author User
 */
public class VTEspecificacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form VTEspecificacion
     */
    public VTEspecificacion() {
        initComponents();
        trEspecificacion.addMouseListener(ml);
    }
    MouseListener ml = new MouseAdapter(){
        public void mouseClicked(MouseEvent evt) {
         // Se obtiene el path para esa fila. Con el path podemos obtener
         // los nodos.
            if (evt.getButton()==3){
                TreePath selPath = trEspecificacion.getPathForLocation(evt.getX(), evt.getY());
                trEspecificacion.setSelectionPath(selPath);
                if(selPath !=null){
                    if(selPath.getLastPathComponent().toString().equals("Documento Especificación")){
                    }
                    else if(selPath.getLastPathComponent().toString().equals("Especificación")){
                       menu1.show(evt.getComponent(), evt.getX(),evt.getY()+10);
                    }
                    else{
                       menu2.show(evt.getComponent(), evt.getX(),evt.getY()+10);
                    }
                }
            }
        }
    };
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new javax.swing.JPopupMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        trEspecificacion = new javax.swing.JTree();

        jMenuItem4.setText("Crear Especificacion");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menu1.add(jMenuItem4);

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu2.add(jMenuItem1);

        jMenuItem2.setText("Restaurar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menu2.add(jMenuItem2);

        jMenuItem3.setText("Eliminar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu2.add(jMenuItem3);

        setMaximizable(true);
        setResizable(true);

        trEspecificacion.setBackground(new java.awt.Color(217, 221, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Documento Especificación");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Especificación");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ESP 0001");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        trEspecificacion.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(trEspecificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(trEspecificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //NUEVO
        VEspecificacion vespecificacion = new VEspecificacion();
        vespecificacion.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //MODIFICAR
        VMEspecificacion vmespecificacion = new VMEspecificacion();
        vmespecificacion.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //ELIMINAR
        int resp = JOptionPane.showConfirmDialog(null, "Eliminar Especificacion", "Alerta!", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //RESTAURAR
    }//GEN-LAST:event_jMenuItem3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu menu1;
    private javax.swing.JPopupMenu menu2;
    private javax.swing.JTree trEspecificacion;
    // End of variables declaration//GEN-END:variables
}
