public class Home_Control extends javax.swing.JPanel {

    public Home_Control() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        information_Label = new javax.swing.JLabel();
        stop_JButton = new javax.swing.JButton();
        start_JButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(716, 722));

        information_Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        information_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        stop_JButton.setBackground(new java.awt.Color(255, 255, 255));
        stop_JButton.setText("Import Stoppen");
        stop_JButton.setBorderPainted(false);
        stop_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stop_JButtonMouseClicked(evt);
            }
        });

        start_JButton.setBackground(new java.awt.Color(255, 255, 255));
        start_JButton.setText("Import Starten");
        start_JButton.setBorderPainted(false);
        start_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                start_JButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(information_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(start_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(stop_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(information_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 481, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stop_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void start_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_JButtonMouseClicked
        information_Label.setText("Import wird gestartet...");
    }//GEN-LAST:event_start_JButtonMouseClicked

    private void stop_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stop_JButtonMouseClicked
        information_Label.setText("Import wird gestoppt...");
    }//GEN-LAST:event_stop_JButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel information_Label;
    private javax.swing.JButton start_JButton;
    private javax.swing.JButton stop_JButton;
    // End of variables declaration//GEN-END:variables
}
