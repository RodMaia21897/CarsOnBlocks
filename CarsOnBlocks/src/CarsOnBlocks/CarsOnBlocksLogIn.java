/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarsOnBlocks;

import blockChain.p2p.miner.InterfaceRemoteMiner;
import static java.lang.String.valueOf;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import myUtils.RMI;
import templarCoin.core.User;


/**
 *
 * @author Rodrigo Maia & Rúben Poupado
 */
public class CarsOnBlocksLogIn extends javax.swing.JFrame {
    
    // Variável que servirá como a "base de dados" do sistema.
    public CarRegistry carRegistry;
    /**
     * Creates new form MineUi
     */
    
    // Construtor que inicializa as interfaces e a classe 'base de dados' do sistema, também como o seu carregamento.
    public CarsOnBlocksLogIn() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        Tabs = new javax.swing.JTabbedPane();
        UpdatesPanel = new javax.swing.JPanel();
        UpdatesLogin = new javax.swing.JPanel();
        UpdatesLoginArea = new javax.swing.JPanel();
        UpdatesLoginUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        UpdatesLoginbt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        UpdatesLoginPass = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        UpdatesServerTxt = new javax.swing.JTextField();
        ClientsPanel = new javax.swing.JPanel();
        ClientsList = new javax.swing.JScrollPane();
        ClientsListTxt = new javax.swing.JList<>();
        CarsPanel = new javax.swing.JPanel();
        CarsList = new javax.swing.JScrollPane();
        CarsListTxt = new javax.swing.JList<>();
        CarsDescription = new javax.swing.JPanel();
        CarInfoList = new javax.swing.JScrollPane();
        CarInfoTxt = new javax.swing.JList<>();
        RegisterPanel = new javax.swing.JPanel();
        RegisterClientPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        RegisterClientUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RegisterClientBt = new javax.swing.JButton();
        RegisterClientPass = new javax.swing.JPasswordField();
        RegisterClientPassC = new javax.swing.JPasswordField();
        RegisterClientPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        RegisterCarModel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        RegisterCarBt = new javax.swing.JButton();
        RegisterCarManu = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Info"));
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("Close");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TabsStateChanged(evt);
            }
        });

        jLabel1.setText("Username:");

        UpdatesLoginbt.setText("Login");
        UpdatesLoginbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatesLoginbtActionPerformed(evt);
            }
        });

        jLabel2.setText("Password:");

        jLabel15.setText("Server Address");

        UpdatesServerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatesServerTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpdatesLoginAreaLayout = new javax.swing.GroupLayout(UpdatesLoginArea);
        UpdatesLoginArea.setLayout(UpdatesLoginAreaLayout);
        UpdatesLoginAreaLayout.setHorizontalGroup(
            UpdatesLoginAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(UpdatesLoginAreaLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(UpdatesLoginAreaLayout.createSequentialGroup()
                .addGroup(UpdatesLoginAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdatesLoginPass)
                    .addComponent(UpdatesServerTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UpdatesLoginUser))
                .addContainerGap())
            .addGroup(UpdatesLoginAreaLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(UpdatesLoginbt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        UpdatesLoginAreaLayout.setVerticalGroup(
            UpdatesLoginAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdatesLoginAreaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdatesLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(UpdatesLoginPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdatesServerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdatesLoginbt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout UpdatesLoginLayout = new javax.swing.GroupLayout(UpdatesLogin);
        UpdatesLogin.setLayout(UpdatesLoginLayout);
        UpdatesLoginLayout.setHorizontalGroup(
            UpdatesLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpdatesLoginArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        UpdatesLoginLayout.setVerticalGroup(
            UpdatesLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdatesLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdatesLoginArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );

        javax.swing.GroupLayout UpdatesPanelLayout = new javax.swing.GroupLayout(UpdatesPanel);
        UpdatesPanel.setLayout(UpdatesPanelLayout);
        UpdatesPanelLayout.setHorizontalGroup(
            UpdatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpdatesLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        UpdatesPanelLayout.setVerticalGroup(
            UpdatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdatesPanelLayout.createSequentialGroup()
                .addComponent(UpdatesLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Tabs.addTab("Updates", UpdatesPanel);

        ClientsListTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientsListTxtMouseClicked(evt);
            }
        });
        ClientsList.setViewportView(ClientsListTxt);

        javax.swing.GroupLayout ClientsPanelLayout = new javax.swing.GroupLayout(ClientsPanel);
        ClientsPanel.setLayout(ClientsPanelLayout);
        ClientsPanelLayout.setHorizontalGroup(
            ClientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ClientsList, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        ClientsPanelLayout.setVerticalGroup(
            ClientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ClientsList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        Tabs.addTab("Clients", ClientsPanel);

        CarsListTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarsListTxtMouseClicked(evt);
            }
        });
        CarsList.setViewportView(CarsListTxt);

        CarsDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CarInfoList.setViewportView(CarInfoTxt);

        javax.swing.GroupLayout CarsDescriptionLayout = new javax.swing.GroupLayout(CarsDescription);
        CarsDescription.setLayout(CarsDescriptionLayout);
        CarsDescriptionLayout.setHorizontalGroup(
            CarsDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CarInfoList, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );
        CarsDescriptionLayout.setVerticalGroup(
            CarsDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CarInfoList)
        );

        javax.swing.GroupLayout CarsPanelLayout = new javax.swing.GroupLayout(CarsPanel);
        CarsPanel.setLayout(CarsPanelLayout);
        CarsPanelLayout.setHorizontalGroup(
            CarsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CarsList, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CarsDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CarsPanelLayout.setVerticalGroup(
            CarsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CarsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CarsDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CarsPanelLayout.createSequentialGroup()
                        .addComponent(CarsList, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 224, Short.MAX_VALUE))))
        );

        Tabs.addTab("Cars", CarsPanel);

        RegisterClientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Client"));

        jLabel3.setText("Username");

        RegisterClientUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterClientUserActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        jLabel5.setText("Password Confirm");

        RegisterClientBt.setText("Register");
        RegisterClientBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterClientBtActionPerformed(evt);
            }
        });

        RegisterClientPassC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterClientPassCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegisterClientPanelLayout = new javax.swing.GroupLayout(RegisterClientPanel);
        RegisterClientPanel.setLayout(RegisterClientPanelLayout);
        RegisterClientPanelLayout.setHorizontalGroup(
            RegisterClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterClientPanelLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(RegisterClientBt)
                .addGap(66, 66, 66))
            .addGroup(RegisterClientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegisterClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegisterClientUser)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegisterClientPass)
                    .addComponent(RegisterClientPassC))
                .addContainerGap())
        );
        RegisterClientPanelLayout.setVerticalGroup(
            RegisterClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterClientPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterClientUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterClientPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegisterClientPassC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(RegisterClientBt)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        RegisterClientPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Car"));

        jLabel10.setText("Model");

        RegisterCarModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterCarModelActionPerformed(evt);
            }
        });

        jLabel11.setText("Manufactor");

        RegisterCarBt.setText("Register");
        RegisterCarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterCarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegisterClientPanel1Layout = new javax.swing.GroupLayout(RegisterClientPanel1);
        RegisterClientPanel1.setLayout(RegisterClientPanel1Layout);
        RegisterClientPanel1Layout.setHorizontalGroup(
            RegisterClientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterClientPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(RegisterCarBt)
                .addGap(66, 66, 66))
            .addGroup(RegisterClientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegisterClientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegisterCarModel)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegisterCarManu))
                .addContainerGap())
        );
        RegisterClientPanel1Layout.setVerticalGroup(
            RegisterClientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterClientPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterCarModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegisterCarManu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(RegisterCarBt)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegisterClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterClientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RegisterClientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegisterClientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Tabs.addTab("Register", RegisterPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabs, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TabsStateChanged
        // Atualiza o painel dos Carros
        if (Tabs.getSelectedComponent() == CarsPanel) {
            DefaultListModel model = new DefaultListModel();
            model.addAll(carRegistry.getCarsList());
            CarsListTxt.setModel(model);
        }

        // Atualiza o painel dos Clientes
        if (Tabs.getSelectedComponent() == ClientsPanel) {
            DefaultListModel model = new DefaultListModel();
            model.addAll(carRegistry.getClientsList());
            ClientsListTxt.setModel(model);
        }

        
    }//GEN-LAST:event_TabsStateChanged

    private void RegisterCarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterCarBtActionPerformed
        String model = RegisterCarModel.getText();
        String man = RegisterCarManu.getText();
        Car c = new Car();
        c.setManufacturer(man);
        c.setModel(model);
        c.setId(carRegistry.getCarRegistrySize()+1);
        carRegistry.addCar(c);
        carRegistry.save();
    }//GEN-LAST:event_RegisterCarBtActionPerformed

    private void RegisterCarModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterCarModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterCarModelActionPerformed

    private void RegisterClientPassCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterClientPassCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterClientPassCActionPerformed

    private void RegisterClientBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterClientBtActionPerformed
        try {
            User u = User.load(txtRegisterUser.getText());
            JOptionPane.showMessageDialog(this, "As passwords não combinam");
            return;
        } catch (Exception e) {
        }
        try {
            if (!Arrays.equals(RegisterClientPass.getPassword(), RegisterClientPassC.getPassword())) {
                return;
            }
            User.register(RegisterClientUser.getText(), new String(RegisterClientPassC.getPassword()));
            JOptionPane.showMessageDialog(this, "User registado");

        } catch (Exception ex) {
            Logger.getLogger(Autentication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RegisterClientBtActionPerformed

    private void RegisterClientUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterClientUserActionPerformed

    }//GEN-LAST:event_RegisterClientUserActionPerformed

    private void CarsListTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarsListTxtMouseClicked
        // TODO add your handling code here:
        DefaultListModel model = new DefaultListModel();
        model.addAll(carRegistry.getCarInfoList(CarsListTxt.getSelectedValue()));
        CarInfoTxt.setModel(model);
    }//GEN-LAST:event_CarsListTxtMouseClicked

    private void ClientsListTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientsListTxtMouseClicked
        // TODO add your handling code here:
        DefaultListModel model = new DefaultListModel();
        model.addAll(carRegistry.getCarInfoList(ClientsListTxt.getSelectedValue()));
        ClientCarInfoList.setModel(model);
    }//GEN-LAST:event_ClientsListTxtMouseClicked

    private void UpdatesLoginbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatesLoginbtActionPerformed
        try {
            User user = User.load(UpdatesLoginUser.getText(), new String(UpdatesLoginPass.getPassword()));
            InterfaceRemoteMiner miner= ( InterfaceRemoteMiner)
            RMI.getRemote(UpdatesServerTxt.getText());
            user.setMiner(miner);
            
        } catch (Exception ex) {
            Logger.getLogger(CarsOnBlocksLogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdatesLoginbtActionPerformed

    private void UpdatesServerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatesServerTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdatesServerTxtActionPerformed

    // Método de ação que cria e adiciona um novo bloco à blockchain
    // Método de ação que efetua o login de um cliente.
    // Método de ação que efetua o registo de um cliente.
    // Método de ação que efetua o registo de um carro.
    // Método de ação que efetua atualizações dos componentes de acordo à tab selecionada.
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarsOnBlocksLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarsOnBlocksLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarsOnBlocksLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarsOnBlocksLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarsOnBlocksLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane CarInfoList;
    private javax.swing.JList<CarInfo> CarInfoTxt;
    private javax.swing.JPanel CarsDescription;
    private javax.swing.JScrollPane CarsList;
    private javax.swing.JList<Car> CarsListTxt;
    private javax.swing.JPanel CarsPanel;
    private javax.swing.JScrollPane ClientsList;
    private javax.swing.JList<User> ClientsListTxt;
    private javax.swing.JPanel ClientsPanel;
    private javax.swing.JButton RegisterCarBt;
    private javax.swing.JTextField RegisterCarManu;
    private javax.swing.JTextField RegisterCarModel;
    private javax.swing.JButton RegisterClientBt;
    private javax.swing.JPanel RegisterClientPanel;
    private javax.swing.JPanel RegisterClientPanel1;
    private javax.swing.JPasswordField RegisterClientPass;
    private javax.swing.JPasswordField RegisterClientPassC;
    private javax.swing.JTextField RegisterClientUser;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JPanel UpdatesLogin;
    private javax.swing.JPanel UpdatesLoginArea;
    private javax.swing.JPasswordField UpdatesLoginPass;
    private javax.swing.JTextField UpdatesLoginUser;
    private javax.swing.JButton UpdatesLoginbt;
    private javax.swing.JPanel UpdatesPanel;
    private javax.swing.JTextField UpdatesServerTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
