package AddingFrames;

import source.Bag;
import source.PublicAirport;

public class JFramePublicAriport extends javax.swing.JInternalFrame {

    public JFramePublicAriport() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPublicAirport = new javax.swing.JLabel();
        lblIdAirport = new javax.swing.JLabel();
        lblCityLocated = new javax.swing.JLabel();
        txtSubsidy = new javax.swing.JTextField();
        txtIdAiroport = new javax.swing.JTextField();
        lblAirportName = new javax.swing.JLabel();
        txtAirportName = new javax.swing.JTextField();
        lblCountryLocated = new javax.swing.JLabel();
        txtCityLocated = new javax.swing.JTextField();
        lblSubsidy = new javax.swing.JLabel();
        txtCountryLocated = new javax.swing.JTextField();
        btnAddPublicAirport = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblPublicAirport.setText("Aeropuerto Publico");

        lblIdAirport.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdAirport.setText("Id del Aeropuerto:");

        lblCityLocated.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCityLocated.setText("Ciudad Ubicada:");

        lblAirportName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAirportName.setText("Nombre del Aeropuerto:");

        lblCountryLocated.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCountryLocated.setText("Pais Ubicada:");

        lblSubsidy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubsidy.setText("Subsidio:");

        btnAddPublicAirport.setText("Guardar");
        btnAddPublicAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPublicAirportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPublicAirport)
                .addGap(160, 160, 160))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCityLocated)
                    .addComponent(lblAirportName)
                    .addComponent(lblCountryLocated)
                    .addComponent(lblSubsidy)
                    .addComponent(lblIdAirport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddPublicAirport)
                    .addComponent(txtAirportName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCityLocated, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubsidy, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCountryLocated, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdAiroport, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAirportName, lblCityLocated, lblCountryLocated, lblIdAirport, lblSubsidy});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPublicAirport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdAirport)
                    .addComponent(txtIdAiroport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAirportName)
                    .addComponent(txtAirportName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCityLocated)
                    .addComponent(txtCityLocated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountryLocated)
                    .addComponent(txtCountryLocated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubsidy)
                    .addComponent(txtSubsidy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddPublicAirport)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPublicAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPublicAirportActionPerformed
        var idAirport = this.txtIdAiroport.getText();
        var nameAirport = this.txtAirportName.getText();
        var cityLocated = this.txtCityLocated.getText();
        var countryLocated = this.txtCountryLocated.getText();
        var subsidy = Double.parseDouble(this.txtSubsidy.getText());
        PublicAirport publicAirport = new PublicAirport(idAirport, nameAirport, cityLocated, countryLocated, subsidy);
        
        var bag = Bag.getInstance();
        bag.addAirport(publicAirport);
        
        setDefaultCloseOperation(JFramePublicAriport.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnAddPublicAirportActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPublicAirport;
    private javax.swing.JLabel lblAirportName;
    private javax.swing.JLabel lblCityLocated;
    private javax.swing.JLabel lblCountryLocated;
    private javax.swing.JLabel lblIdAirport;
    private javax.swing.JLabel lblPublicAirport;
    private javax.swing.JLabel lblSubsidy;
    private javax.swing.JTextField txtAirportName;
    private javax.swing.JTextField txtCityLocated;
    private javax.swing.JTextField txtCountryLocated;
    private javax.swing.JTextField txtIdAiroport;
    private javax.swing.JTextField txtSubsidy;
    // End of variables declaration//GEN-END:variables
}
