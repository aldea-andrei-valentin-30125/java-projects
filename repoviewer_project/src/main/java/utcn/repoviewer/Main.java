
package utcn.repoviewer;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.*;
import javax.swing.plaf.SplitPaneUI;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;


public class Main extends javax.swing.JFrame {
    
    
    public Main() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPaneOptions = new javax.swing.JTabbedPane();
        panelChooseFolder = new javax.swing.JPanel();
        textFieldRootFolder = new javax.swing.JTextField();
        labelCurrentFolder = new javax.swing.JLabel();
        buttonChooseRootFolder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListStudents = new javax.swing.JList<>();
        textFieldSearchFilter = new javax.swing.JTextField();
        jLabelClearSelection = new javax.swing.JLabel();
        panelView = new javax.swing.JPanel();
        scrollPaneFolderSelect = new javax.swing.JScrollPane();
        treeFolders = new javax.swing.JTree();
        panelViewCode = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Repo Viewer");

        tabbedPaneOptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbedPaneOptionsMouseClicked(evt);
            }
        });

        textFieldRootFolder.setEditable(false);
        textFieldRootFolder.setText("select folder");
        textFieldRootFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldRootFolderMouseClicked(evt);
            }
        });

        labelCurrentFolder.setText("current folder");

        buttonChooseRootFolder.setText("...");
        buttonChooseRootFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChooseRootFolderActionPerformed(evt);
            }
        });

        jListStudents.setModel(studentsList);
        jScrollPane2.setViewportView(jListStudents);

        textFieldSearchFilter.setText("Search...");
        textFieldSearchFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldSearchFilterMouseClicked(evt);
            }
        });
        textFieldSearchFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSearchFilterKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSearchFilterKeyReleased(evt);
            }
        });

        jLabelClearSelection.setForeground(new java.awt.Color(0, 0, 204));
        jLabelClearSelection.setText("Clear Selection");
        jLabelClearSelection.setMaximumSize(jLabelClearSelection.getPreferredSize());
        jLabelClearSelection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClearSelection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClearSelectionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelClearSelectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelClearSelectionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelChooseFolderLayout = new javax.swing.GroupLayout(panelChooseFolder);
        panelChooseFolder.setLayout(panelChooseFolderLayout);
        panelChooseFolderLayout.setHorizontalGroup(
            panelChooseFolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChooseFolderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChooseFolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelChooseFolderLayout.createSequentialGroup()
                        .addComponent(labelCurrentFolder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldRootFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonChooseRootFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(textFieldSearchFilter, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(248, 248, 248)
                .addComponent(jLabelClearSelection)
                .addContainerGap())
        );
        panelChooseFolderLayout.setVerticalGroup(
            panelChooseFolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChooseFolderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChooseFolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChooseFolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonChooseRootFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelClearSelection))
                    .addGroup(panelChooseFolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCurrentFolder)
                        .addComponent(textFieldRootFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(textFieldSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );

        textFieldRootFolder.getAccessibleContext().setAccessibleName("");
        labelCurrentFolder.getAccessibleContext().setAccessibleName("labelFolder");
        buttonChooseRootFolder.getAccessibleContext().setAccessibleName("buttonChooseFolder");

        tabbedPaneOptions.addTab("choose folder", panelChooseFolder);

        panelView.setLayout(new java.awt.BorderLayout());

        treeFolders.setModel(treeModelFoldersStructure);
        treeFolders.setRootVisible(false);
        treeFolders.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
            public void treeCollapsed(javax.swing.event.TreeExpansionEvent evt) {
                treeFoldersTreeCollapsed(evt);
            }
            public void treeExpanded(javax.swing.event.TreeExpansionEvent evt) {
                treeFoldersTreeExpanded(evt);
            }
        });
        treeFolders.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                treeFoldersValueChanged(evt);
            }
        });
        scrollPaneFolderSelect.setViewportView(treeFolders);

        panelView.add(scrollPaneFolderSelect, java.awt.BorderLayout.WEST);

        panelViewCode.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelViewCodeLayout = new javax.swing.GroupLayout(panelViewCode);
        panelViewCode.setLayout(panelViewCodeLayout);
        panelViewCodeLayout.setHorizontalGroup(
            panelViewCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        panelViewCodeLayout.setVerticalGroup(
            panelViewCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelView.add(panelViewCode, java.awt.BorderLayout.CENTER);

        tabbedPaneOptions.addTab("view", panelView);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneOptions)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPaneOptions)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabbedPaneOptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedPaneOptionsMouseClicked
        studentsToView.clear();
        studentsToView.addAll(jListStudents.getSelectedValuesList());
        if (studentsToView.size() > 0){
            String defaultStudentForFolderStructure = studentsToView.get(0);
            String absolutePathToStudentFolder = getAbsolutePathToStudent(defaultStudentForFolderStructure);
            //System.out.println("this folder was selected" + absolutePathToStudentFolder);
     
            File rootDirectory = new File(absolutePathToStudentFolder);
            treePopulator.populate(rootDirectory); //Here is problem, too many calls -> tree resets after some events
            treeFolders.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        }
    }//GEN-LAST:event_tabbedPaneOptionsMouseClicked

    private void treeFoldersValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_treeFoldersValueChanged
        //System.out.println("this path was selected: " + treeFolders.getSelectionPath());
        panelViewCode.removeAll();
        if (treeFolders.getSelectionPath() != null){
            Object[] incapsulatedPath = treeFolders.getSelectionPath().getPath();
            String relativePathToFile = incapsulatedPath[1].toString();
            for (int i=2; i < incapsulatedPath.length; i++){
                relativePathToFile = String.join("\\", relativePathToFile, incapsulatedPath[i].toString());
            }
            panelViewCode.setLayout(new GridLayout(1, studentsToView.size()));
            // add all fileviews to the panel, but only if selection is a file!
            if (((FileNode)treeFolders.getLastSelectedPathComponent()).isViewableFile){
                for (String student: studentsToView){
                    FileView studentFileView = new FileView(student, getAbsolutePathToFile(student, relativePathToFile),studentsToView.size());
                    panelViewCode.add(studentFileView);
                }
            }
        }
        panelViewCode.revalidate();
        panelViewCode.repaint();
    }//GEN-LAST:event_treeFoldersValueChanged

    private void treeFoldersTreeExpanded(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_treeFoldersTreeExpanded
        panelView.revalidate();

    }//GEN-LAST:event_treeFoldersTreeExpanded

    private void treeFoldersTreeCollapsed(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_treeFoldersTreeCollapsed
        panelView.revalidate();

    }//GEN-LAST:event_treeFoldersTreeCollapsed

    private void jLabelClearSelectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClearSelectionMouseExited
        jLabelClearSelection.setText("Clear Selection");
    }//GEN-LAST:event_jLabelClearSelectionMouseExited

    private void jLabelClearSelectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClearSelectionMouseEntered
        jLabelClearSelection.setText("<html><a href=''>Clear Selection</a></html>");
    }//GEN-LAST:event_jLabelClearSelectionMouseEntered

    private void jLabelClearSelectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClearSelectionMouseClicked
        jListStudents.clearSelection();
    }//GEN-LAST:event_jLabelClearSelectionMouseClicked

    private void textFieldSearchFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSearchFilterKeyReleased
        jListStudents.setModel(studentsList);
        
        DefaultListModel<String> newModel = new DefaultListModel<>();
        for (int i = 0; i < jListStudents.getModel().getSize(); i++) {
            if (studentsList.get(i).toLowerCase().contains(textFieldSearchFilter.getText().toLowerCase())) {
                newModel.addElement(studentsList.getElementAt(i));
            }
        }
        jListStudents.setModel(newModel);
    }//GEN-LAST:event_textFieldSearchFilterKeyReleased

    private void textFieldSearchFilterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSearchFilterKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            textFieldSearchFilter.setText("");
        }
    }//GEN-LAST:event_textFieldSearchFilterKeyPressed

    private void textFieldSearchFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldSearchFilterMouseClicked
        if (textFieldSearchFilter.getText().equals("Search...")){
            textFieldSearchFilter.setText("");
        }
    }//GEN-LAST:event_textFieldSearchFilterMouseClicked

    private void buttonChooseRootFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChooseRootFolderActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Please choose root folder");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            this.loadStudents(chooser.getSelectedFile());
            textFieldRootFolder.setText(chooser.getSelectedFile().toString());
        }
        jListStudents.setModel(studentsList);
    }//GEN-LAST:event_buttonChooseRootFolderActionPerformed

    private void textFieldRootFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldRootFolderMouseClicked
        buttonChooseRootFolderActionPerformed(null);
    }//GEN-LAST:event_textFieldRootFolderMouseClicked
    
    
    private String getAbsolutePathToStudent(String studentName){
        return textFieldRootFolder.getText() + "\\" + studentName;
    }
    
    private String getAbsolutePathToFile(String studentName, String filePath){
        return textFieldRootFolder.getText() + "\\" + studentName + "\\" + filePath;
    }
    
    private void loadStudents(File rootFolder){
        studentsList.clear();
        for (File studentFolder : rootFolder.listFiles()){
           
            if (studentFolder.isDirectory())
                studentsList.addElement(studentFolder.getName());
        }
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonChooseRootFolder;
    private javax.swing.JLabel jLabelClearSelection;
    private javax.swing.JList<String> jListStudents;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCurrentFolder;
    private javax.swing.JPanel panelChooseFolder;
    private javax.swing.JPanel panelView;
    private javax.swing.JPanel panelViewCode;
    private javax.swing.JScrollPane scrollPaneFolderSelect;
    private javax.swing.JTabbedPane tabbedPaneOptions;
    private javax.swing.JTextField textFieldRootFolder;
    private javax.swing.JTextField textFieldSearchFilter;
    private javax.swing.JTree treeFolders;
    // End of variables declaration//GEN-END:variables
    private DefaultListModel<String> studentsList = new DefaultListModel<String>();
    private DefaultTreeModel treeModelFoldersStructure = new DefaultTreeModel(null);
    private TreePopulator treePopulator = new TreePopulator(treeModelFoldersStructure);
    private ArrayList<String> studentsToView = new ArrayList<String>();
}
