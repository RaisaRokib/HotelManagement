package hms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ShowInfo extends javax.swing.JFrame {

    /**
     * Creates new form ShowInfo
     */
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    public ShowInfo() {
        initComponents();
        show_user();
        this.setLocationRelativeTo(null);
       
       
    }
    
     public ArrayList<User> userList(){
        
        ArrayList<User> userList = new ArrayList<>();
         
         try{
           
            con = Connect.ConnectDB();
            String query1 = "SELECT * FROM driver";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            User user;
            while(rs.next()){
                user=new User(rs.getString("name"),rs.getString("gender"),rs.getString("company"),rs.getString("brand"));
                userList.add(user);
            }
            
         }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            }
         return userList;
        }
     public void show_user(){
          ArrayList<User> list = userList();
          DefaultTableModel model = (DefaultTableModel)jTable_Display_User.getModel();
          Object[] row = new Object[4];
         for(int i=0;i<list.size();i++){
             
              row[0]=list.get(i).getName();
              row[1]=list.get(i).getGender();
              row[2]=list.get(i).getCompany();
              row[3]=list.get(i).getBrand();
              model.addRow(row);
              
         }
     }
     public void clearTable()
{
    DefaultTableModel dm = (DefaultTableModel)jTable_Display_User.getModel();
    dm.getDataVector().removeAllElements();
    revalidate();
}
      public ArrayList<User> userList2(){
        
       ArrayList<User> userList2 = new ArrayList<>();
          
         try{
              con = Connect.ConnectDB();
             String query2 = "SELECT * FROM driver";
            Statement sst = con.createStatement();
            ResultSet rrs = sst.executeQuery(query2);
            User user2;
            
            while(rrs.next()){
                user2=new User(rs.getString("name"),rs.getString("gender"),rs.getString("company"),rs.getString("brand"));              
                userList2.add(user2);
            }
            
            
         }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            }
         return userList2;
        }
     public void show_user2(){
          ArrayList<User> list = userList2();
          DefaultTableModel model = (DefaultTableModel)jTable_Display_User.getModel();
          Object[] row = new Object[4];
         for(int i=0;i<list.size();i++){
              row[0]=list.get(i).getName();
              row[1]=list.get(i).getGender();
              row[2]=list.get(i).getCompany();
              row[3]=list.get(i).getBrand();
              model.addRow(row);
         }
     }
     
      public ArrayList<User> userList3(){
        
       ArrayList<User> userList3 = new ArrayList<>();
         
         try{
             con = Connect.ConnectDB();
             String query3 = "SELECT * FROM driver";
            Statement sst = con.createStatement();
            ResultSet rrs3 = sst.executeQuery(query3);
            User user3;
            
            while(rrs3.next()){
                user3=new User(rs.getString("name"),rs.getString("gender"),rs.getString("company"),rs.getString("brand"));              
                             
                userList3.add(user3);
            }
            
         }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            }
         return userList3;
        }
     public void show_user3(){
          ArrayList<User> list = userList3();
          DefaultTableModel model = (DefaultTableModel)jTable_Display_User.getModel();
          Object[] row = new Object[4];
         for(int i=0;i<list.size();i++){
              row[0]=list.get(i).getName();
              row[1]=list.get(i).getGender();
              row[2]=list.get(i).getCompany();
              row[3]=list.get(i).getBrand();
              model.addRow(row);
         }
     }
     
     
     public ArrayList<User> userList5(){
        
       ArrayList<User> userList5 = new ArrayList<>();
         
         try{
             con = Connect.ConnectDB();
             String query3 = q(txt_Search.getText());
            Statement sst = con.createStatement();
            ResultSet rrs3 = sst.executeQuery(query3);
            User user3;
            
            while(rrs3.next()){
                user3=new User(rs.getString("name"),rs.getString("gender"),rs.getString("company"),rs.getString("brand"));                          
                userList5.add(user3);
            }
            
         }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            }
         return userList5;
        }
     String q(String txtSearch){
         String sql= "SELECT * FROM driver WHERE name LIKE '%"+txtSearch+"%'";
         return sql;
     }
     public void show_user5(){
          ArrayList<User> list = userList5();
          DefaultTableModel model = (DefaultTableModel)jTable_Display_User.getModel();
          Object[] row = new Object[4];
         for(int i=0;i<list.size();i++){
              row[0]=list.get(i).getName();
              row[1]=list.get(i).getGender();
              row[2]=list.get(i).getCompany();
              row[3]=list.get(i).getBrand();
              model.addRow(row);
         }
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User = new javax.swing.JTable();
        txt_Search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_Display_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "gender", "company", "brand", "age", "location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User);

        txt_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_SearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SearchKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "search by gender", "search by name", "age (18-30)", "search by location" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_Search)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_SearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SearchKeyTyped

    }//GEN-LAST:event_txt_SearchKeyTyped

    private void txt_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SearchKeyReleased
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txt_SearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


         

            DefaultTableModel dtm = (DefaultTableModel) jTable_Display_User.getModel();
            dtm.setRowCount(0);
            int selected = jComboBox1.getSelectedIndex();
            String query = null;
            if (selected == 0) {
                query = "select * from driver where gender like '%"+txt_Search.getText().trim()+"%'";
                
                try{
                    PreparedStatement statement = con.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                String id = set.getString(1);
                String price = set.getString(5);
                String name = set.getString(4);
                String cat2 = set.getString(3);
                String age= set.getString(2);
                String loc= set.getString(7);

                Object data[] = {id, cat2, name, price, age, loc};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
                
            } else if (selected == 1) {
                query = "select * from driver where name like '%"+txt_Search.getText().trim()+"%'";
                    
                try{
                    PreparedStatement statement = con.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                String id = set.getString(1);
                String price = set.getString(5);
                String name = set.getString(4);
                String cat2 = set.getString(3);
                String age= set.getString(2);
                String loc= set.getString(7);

                Object data[] = {id, cat2, name, price, age, loc};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
            }  else if (selected == 2) {
                query = "select * from driver where age between 18 and 30 ";
                    
                try{
                    PreparedStatement statement = con.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                String id = set.getString(1);
                String price = set.getString(5);
                String name = set.getString(4);
                String cat2 = set.getString(3);
                String age= set.getString(2);
                String loc= set.getString(7);

                Object data[] = {id, cat2, name, price, age, loc};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
            }  else if (selected == 3) {
                query = "select * from driver where location like '%"+txt_Search.getText().trim()+"%'";
                    
                try{
                    PreparedStatement statement = con.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                String id = set.getString(1);
                String price = set.getString(5);
                String name = set.getString(4);
                String cat2 = set.getString(3);
                String age= set.getString(2);
                String loc= set.getString(7);

                Object data[] = {id, cat2, name, price, age, loc};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
            }  
            
     
           
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ShowInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User;
    private javax.swing.JTextField txt_Search;
    // End of variables declaration//GEN-END:variables
}
