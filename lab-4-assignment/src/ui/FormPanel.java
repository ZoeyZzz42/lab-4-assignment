/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.User;
import util.DatabaseConnector;

/**
 *
 * @author zoey42
 */
public class FormPanel extends javax.swing.JPanel {
    private String photoFilePath;
    /**
     * Creates new form FormPanel
     */
    private JPanel bottomPanel;
    public FormPanel(JPanel inputPanel) {
        initComponents();
        this.bottomPanel = inputPanel;
        typeComboBox.addItem("Regular");
        typeComboBox.addItem("Emergency");
        typeComboBox.addItem("VIP");
    }

    private FormPanel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderBtnGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        firstNameTxtField = new javax.swing.JTextField();
        lastNameTxtField = new javax.swing.JTextField();
        ageTxtField = new javax.swing.JTextField();
        emailTxtField = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        photoLabel = new javax.swing.JLabel();
        uploadBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        msgLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        maleBtn = new javax.swing.JRadioButton();
        genderLabel = new javax.swing.JLabel();
        femaleBtn = new javax.swing.JRadioButton();
        notSayBtn = new javax.swing.JRadioButton();

        mainPanel.setPreferredSize(new java.awt.Dimension(700, 500));

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        titleLabel.setText("User Registration Form");

        firstNameLabel.setText("First Name*");

        lastNameLabel.setText("Last Name*");

        ageLabel.setText("Age*");

        emailLabel.setText("Email*");

        submitBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        photoLabel.setText("Photo");

        uploadBtn.setText("Upload");
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        msgLabel.setText("Message(<=160 characters)");

        typeLabel.setText("Type*");

        typeComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        genderBtnGroup.add(maleBtn);
        maleBtn.setText("Male");

        genderLabel.setText("Gender*");

        genderBtnGroup.add(femaleBtn);
        femaleBtn.setText("Female");

        genderBtnGroup.add(notSayBtn);
        notSayBtn.setText("Prefer not to state");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(msgLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firstNameLabel)
                                .addComponent(emailLabel)
                                .addComponent(lastNameLabel)
                                .addComponent(ageLabel)
                                .addComponent(photoLabel)
                                .addComponent(typeLabel)
                                .addComponent(genderLabel))
                            .addGap(107, 107, 107)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstNameTxtField)
                                    .addComponent(lastNameTxtField)
                                    .addComponent(ageTxtField)
                                    .addComponent(emailTxtField)
                                    .addComponent(uploadBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(typeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(maleBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(femaleBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(notSayBtn))))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageLabel)
                    .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel)
                    .addComponent(emailTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(photoLabel)
                    .addComponent(uploadBtn))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel))
                .addGap(26, 26, 26)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maleBtn)
                    .addComponent(genderLabel)
                    .addComponent(femaleBtn)
                    .addComponent(notSayBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        User newUser = new User();
       
        String firstName = firstNameTxtField.getText();
        String lastName = lastNameTxtField.getText();
        String age = ageTxtField.getText();
        String email = emailTxtField.getText();
        String textBoxMsg = textArea.getText();
        String selectedType = (String) typeComboBox.getSelectedItem();
        String selectedGender = getSelectedGender();

        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setAge(age);
        newUser.setEmail(email);
        newUser.setTextBoxMsg(textBoxMsg);
        newUser.setPhotoFilePath(photoFilePath);
        newUser.setPatientType(selectedType);
        newUser.setGender(selectedGender);
        
        DatabaseConnector dbConnector = new DatabaseConnector();
        dbConnector.addUser(newUser);
        
        if (firstName.isEmpty() || lastName.isEmpty() || age.isEmpty() || email.isEmpty() || selectedGender == null) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!isValidName(firstName)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid first name.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!isValidName(lastName)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid last name.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int ageInt;
        try {
            ageInt = Integer.parseInt(age);
            if (ageInt < 0 || ageInt > 150) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid age.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (textBoxMsg.length() > 160) {
            JOptionPane.showMessageDialog(this, "Message should not exceed 160 characters.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String message = "First Name: " + firstName + "\n" +
        "Last Name: " + lastName + "\n" +
        "Age: " + age + "\n" +
        "Email: " + email + "\n" +
        "Type: " + selectedType + "\n" +
        "Gender: " + selectedGender + "\n" +
        "Message: " + textBoxMsg;

        if (photoFilePath != null) {
            ImageIcon photoIcon = new ImageIcon(photoFilePath);
            ImageIcon scaledPhoto = new ImageIcon(photoIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            JOptionPane.showMessageDialog(this, message, "User Registration Successful", JOptionPane.INFORMATION_MESSAGE, scaledPhoto);
        } else {
            JOptionPane.showMessageDialog(this, message, "User Registration Successful", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        ViewPanel newViewPanel = new ViewPanel(newUser);   
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        bottomPanel.add(newViewPanel);
        layout.next(bottomPanel);
    }//GEN-LAST:event_submitBtnActionPerformed

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
    
    private boolean isValidImageFormat(File file) {
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex == -1) {
            return false;
        }

        String fileExtension = fileName.substring(dotIndex + 1).toLowerCase();
        return fileExtension.equals("jpg") || fileExtension.equals("png") || fileExtension.equals("jpeg") || fileExtension.equals("gif");
    }
    
    private boolean isValidName(String name) {
        return !name.isEmpty() && name.matches("^[a-zA-Z]+$");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPanel().setVisible(true);
            }
        });
    }
    
    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg", "gif");
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(this);

        File selectedFile = fileChooser.getSelectedFile();
        if (result == JFileChooser.APPROVE_OPTION) {
            if (!isValidImageFormat(selectedFile)) {
                JOptionPane.showMessageDialog(this, "Please select a valid image file (jpg, png, jpeg, gif).", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            photoFilePath = selectedFile.getAbsolutePath();

            JOptionPane.showMessageDialog(this, "Photo uploaded successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_uploadBtnActionPerformed

    private String getSelectedGender() {
        if (maleBtn.isSelected()) {
            return "Male";
        } else if (femaleBtn.isSelected()) {
            return "Female";
        } else if (notSayBtn.isSelected()) {
            return "Prefer not to state";
        } else {
            return null;
        }
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTxtField;
    private javax.swing.JRadioButton femaleBtn;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTxtField;
    private javax.swing.ButtonGroup genderBtnGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTxtField;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton maleBtn;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JRadioButton notSayBtn;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JButton uploadBtn;
    // End of variables declaration//GEN-END:variables
}
