/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kjarkko.stardust.gui;

import java.awt.Color;
import kjarkko.stardust.logic.Planet;
import kjarkko.stardust.logic.Planets;
import kjarkko.stardust.util.Coordinate;
import kjarkko.stardust.util.Vector;

/**
 *
 * @author jarkko
 */
public class ControlPanel extends javax.swing.JFrame {

    /**
     * Creates new form ControlPanel
     */
    public ControlPanel() {
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

        planetColor = new javax.swing.JTextField();
        planetName = new javax.swing.JTextField();
        planetMass = new javax.swing.JTextField();
        planetRadius = new javax.swing.JTextField();
        planetYvel = new javax.swing.JTextField();
        planetXvel = new javax.swing.JTextField();
        planetYloc = new javax.swing.JTextField();
        planetXLoc = new javax.swing.JTextField();
        createPlanetButton = new javax.swing.JButton();
        planetXlocMagn = new javax.swing.JTextField();
        planetMassMagnitude = new javax.swing.JTextField();
        planetYlocMagn = new javax.swing.JTextField();
        planetYvelMagn = new javax.swing.JTextField();
        planetXvelMagn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        planetColor.setText("Color");
        planetColor.setMinimumSize(new java.awt.Dimension(100, 30));

        planetName.setText("Name");
        planetName.setMinimumSize(new java.awt.Dimension(100, 30));

        planetMass.setText("Mass");
        planetMass.setMinimumSize(new java.awt.Dimension(100, 30));
        planetMass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planetMassActionPerformed(evt);
            }
        });

        planetRadius.setText("Radius");
        planetRadius.setMinimumSize(new java.awt.Dimension(100, 30));
        planetRadius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planetRadiusActionPerformed(evt);
            }
        });

        planetYvel.setText("y velocity");
        planetYvel.setMinimumSize(new java.awt.Dimension(100, 30));
        planetYvel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planetYvelActionPerformed(evt);
            }
        });

        planetXvel.setText("x velocity");
        planetXvel.setMinimumSize(new java.awt.Dimension(100, 30));
        planetXvel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planetXvelActionPerformed(evt);
            }
        });

        planetYloc.setText("y coordinate");
        planetYloc.setMinimumSize(new java.awt.Dimension(100, 30));
        planetYloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planetYlocActionPerformed(evt);
            }
        });

        planetXLoc.setText("x coordinate");
        planetXLoc.setMinimumSize(new java.awt.Dimension(100, 30));
        planetXLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planetXLocActionPerformed(evt);
            }
        });

        createPlanetButton.setText("Create");
        createPlanetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlanetButtonActionPerformed(evt);
            }
        });

        planetXlocMagn.setText("Magnitude");
        planetXlocMagn.setMinimumSize(new java.awt.Dimension(100, 30));
        planetXlocMagn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planetXlocMagnActionPerformed(evt);
            }
        });

        planetMassMagnitude.setText("Magnitude");
        planetMassMagnitude.setMinimumSize(new java.awt.Dimension(100, 30));
        planetMassMagnitude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planetMassMagnitudeActionPerformed(evt);
            }
        });

        planetYlocMagn.setText("Magnitude");
        planetYlocMagn.setMinimumSize(new java.awt.Dimension(100, 30));
        planetYlocMagn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planetYlocMagnActionPerformed(evt);
            }
        });

        planetYvelMagn.setText("Magnitude");
        planetYvelMagn.setMinimumSize(new java.awt.Dimension(100, 30));
        planetYvelMagn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planetYvelMagnActionPerformed(evt);
            }
        });

        planetXvelMagn.setText("Magnitude");
        planetXvelMagn.setMinimumSize(new java.awt.Dimension(100, 30));
        planetXvelMagn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planetXvelMagnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(planetName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(planetColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(planetRadius, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(planetMass, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(planetMassMagnitude, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(planetYvel, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(planetYvelMagn, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(createPlanetButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(planetYloc, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(planetXvel, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(planetYlocMagn, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(planetXvelMagn, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(planetXLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(planetXlocMagn, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(planetName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(planetColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(planetRadius, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetMass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetMassMagnitude, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetXLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetXlocMagn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetYloc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetYlocMagn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetXvel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetXvelMagn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetYvel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetYvelMagn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createPlanetButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void planetMassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planetMassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planetMassActionPerformed

    private void planetRadiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planetRadiusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planetRadiusActionPerformed

    private void planetYvelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planetYvelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planetYvelActionPerformed

    private void planetXvelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planetXvelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planetXvelActionPerformed

    private void planetYlocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planetYlocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planetYlocActionPerformed

    private void planetXLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planetXLocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planetXLocActionPerformed

    private void createPlanetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlanetButtonActionPerformed
        // TODO add your handling code here:
        try {
            Planets.get().add(
                    new Planet(
                            new Coordinate(
                                    Double.parseDouble(planetXLoc.getText()),
                                    Double.parseDouble(planetYloc.getText())),
                            new Vector(
                                    Double.parseDouble(planetXvel.getText()),
                                    Double.parseDouble(planetYvel.getText())),
                            Double.parseDouble(planetMass.getText()),
                            Color.decode(planetColor.getText()),
                            planetName.getText(),
                            Integer.parseInt(planetRadius.getText())
                    )
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_createPlanetButtonActionPerformed

    private void planetXlocMagnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planetXlocMagnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planetXlocMagnActionPerformed

    private void planetMassMagnitudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planetMassMagnitudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planetMassMagnitudeActionPerformed

    private void planetYlocMagnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planetYlocMagnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planetYlocMagnActionPerformed

    private void planetYvelMagnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planetYvelMagnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planetYvelMagnActionPerformed

    private void planetXvelMagnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planetXvelMagnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planetXvelMagnActionPerformed

    public static void start() {
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
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createPlanetButton;
    private javax.swing.JTextField planetColor;
    private javax.swing.JTextField planetMass;
    private javax.swing.JTextField planetMassMagnitude;
    private javax.swing.JTextField planetName;
    private javax.swing.JTextField planetRadius;
    private javax.swing.JTextField planetXLoc;
    private javax.swing.JTextField planetXlocMagn;
    private javax.swing.JTextField planetXvel;
    private javax.swing.JTextField planetXvelMagn;
    private javax.swing.JTextField planetYloc;
    private javax.swing.JTextField planetYlocMagn;
    private javax.swing.JTextField planetYvel;
    private javax.swing.JTextField planetYvelMagn;
    // End of variables declaration//GEN-END:variables
}
