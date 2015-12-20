/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.harley.reman.interfaz.interfaces;

import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.TreePath;

/**
 *
 * @author User
 */
public class VTElicitacion extends javax.swing.JInternalFrame {

    MouseListener ml = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            // Se obtiene el path para esa fila. Con el path podemos obtener
            // los nodos.
            if (e.getButton() == MouseEvent.BUTTON3) {
                TreePath selPath = treeEdu.getPathForLocation(e.getX(), e.getY());
                treeEdu.setSelectionPath(selPath);
                if (selPath != null) {
                    switch (selPath.getLastPathComponent().toString()) {
                        case "Documento de Educción":
                            menuDocEdu.show(e.getComponent(), e.getX(), e.getY() + 10);
                            break;
                        case "Educción":
                            break;
                        default:
                            menuEdu.show(e.getComponent(), e.getX(), e.getY() + 10);
                            break;
                    }
                }
            }
        }
    };

    /**
     * Creates new form VTEduccion
     *
     * @param tree arbol que se muestra en la educcion
     */
    public VTElicitacion(JTree tree) {
        initComponents();
        treeEdu.setModel(tree.getModel());
        treeEdu.addMouseListener(ml);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuDocEdu = new javax.swing.JPopupMenu();
        menuDocEduItem1 = new javax.swing.JMenuItem();
        menuEdu = new javax.swing.JPopupMenu();
        menuEduItem1 = new javax.swing.JMenuItem();
        menuEduItem2 = new javax.swing.JMenuItem();
        menuEduItem3 = new javax.swing.JMenuItem();
        scrollTree = new javax.swing.JScrollPane();
        treeEdu = new javax.swing.JTree();

        menuDocEduItem1.setText("Crear Educción");
        menuDocEduItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDocEduItem1ActionPerformed(evt);
            }
        });
        menuDocEdu.add(menuDocEduItem1);

        menuEduItem1.setText("Modificar");
        menuEduItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEduItem1ActionPerformed(evt);
            }
        });
        menuEdu.add(menuEduItem1);

        menuEduItem2.setText("Eliminar");
        menuEduItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEduItem2ActionPerformed(evt);
            }
        });
        menuEdu.add(menuEduItem2);

        menuEduItem3.setText("Restaurar");
        menuEduItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEduItem3ActionPerformed(evt);
            }
        });
        menuEdu.add(menuEduItem3);

        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(250, 322));

        treeEdu.setBackground(new java.awt.Color(217, 221, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Documento de la Educción");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Educción");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("EDU 0001");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeEdu.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        scrollTree.setViewportView(treeEdu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTree, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuDocEduItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDocEduItem1ActionPerformed
        //NUEVA EDUCCION
        VEduccion veduccion = new VEduccion();
        veduccion.setVisible(true);
    }//GEN-LAST:event_menuDocEduItem1ActionPerformed

    private void menuEduItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEduItem1ActionPerformed
        //MODIFICAR EDUCCION
        VMEduccion vmeduccion = new VMEduccion();
        vmeduccion.setVisible(true);
    }//GEN-LAST:event_menuEduItem1ActionPerformed

    private void menuEduItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEduItem2ActionPerformed
        //ELIMINAR
        int resp = JOptionPane.showConfirmDialog(null, "Eliminar Educción", "Alerta!", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_menuEduItem2ActionPerformed

    private void menuEduItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEduItem3ActionPerformed
        //RESTAURAR
    }//GEN-LAST:event_menuEduItem3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu menuDocEdu;
    private javax.swing.JMenuItem menuDocEduItem1;
    private javax.swing.JPopupMenu menuEdu;
    private javax.swing.JMenuItem menuEduItem1;
    private javax.swing.JMenuItem menuEduItem2;
    private javax.swing.JMenuItem menuEduItem3;
    private javax.swing.JScrollPane scrollTree;
    private javax.swing.JTree treeEdu;
    // End of variables declaration//GEN-END:variables
}
