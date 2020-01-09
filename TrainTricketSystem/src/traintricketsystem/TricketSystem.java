
package traintricketsystem;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TricketSystem extends javax.swing.JFrame {

    public TricketSystem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1800, 750));
        setPreferredSize(new java.awt.Dimension(1800, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Train Tricket System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel1)
                .addContainerGap(397, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1240, 120));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Class");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Tricket Type");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Adult");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Child");

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton1.setText("Standard");

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton2.setText("Economy");

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton3.setText("Frist Class");

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton4.setText("Single");

        jRadioButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton5.setText("Return");

        jRadioButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton6.setText("Yes");

        jRadioButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton7.setText("Yes");

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Destenation");

        jComboBox1.setBackground(new java.awt.Color(255, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uttara", "Joydappur", "Valuka", "Mymenshing" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton4)
                            .addComponent(jLabel3)))
                    .addComponent(jRadioButton3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(89, 89, 89))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 720, 290));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Total");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Reset");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 51));
        jButton3.setText("Exit");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Sub Total :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Tax :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Total :");

        jTextField1.setBackground(new java.awt.Color(255, 255, 102));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jTextField2.setBackground(new java.awt.Color(255, 255, 102));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jTextField3.setBackground(new java.awt.Color(255, 255, 102));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 720, 220));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Class");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Tricket Type");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Adult");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Child");

        jTextField4.setBackground(new java.awt.Color(255, 255, 102));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jTextField5.setBackground(new java.awt.Color(255, 255, 102));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jTextField6.setBackground(new java.awt.Color(255, 255, 102));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jTextField7.setBackground(new java.awt.Color(255, 255, 102));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("From :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("To :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Date :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Time :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText("Tricket No ");

        jTextField8.setBackground(new java.awt.Color(255, 255, 102));
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setText("Price");

        jTextField9.setBackground(new java.awt.Color(255, 255, 102));
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setText("Route");

        jTextField10.setBackground(new java.awt.Color(255, 255, 102));
        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jTextField11.setBackground(new java.awt.Color(255, 255, 102));
        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jTextField12.setBackground(new java.awt.Color(255, 255, 102));
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jTextField13.setBackground(new java.awt.Color(255, 255, 102));
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jTextField14.setBackground(new java.awt.Color(255, 255, 102));
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addGap(3, 3, 3)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField13)
                            .addComponent(jTextField14)
                            .addComponent(jTextField12)
                            .addComponent(jTextField11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(jTextField9)
                            .addComponent(jTextField10))
                        .addGap(59, 59, 59))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel13)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(69, 69, 69)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 500, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        jTextField14.setText(tTime.format(timer.getTime()));

        SimpleDateFormat tDate = new SimpleDateFormat("dd-MM-yyyy");
        jTextField13.setText(tDate.format(timer.getTime()));

        jTextField11.setText("Dhaka");
        jTextField12.setText((String) jComboBox1.getSelectedItem() + "");
        int num1;
        String q1 = " ";
        num1 =1+ (int) (Math.random() *100);
        q1 += num1 +1;
        jTextField8.setText(q1);
        jTextField10.setText("ANY");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        double tax = 19.50;
        double MilesK8 = 25.78;
        double MileK12 = 25.10;
        double MileK20 = 45.23;
        double MileK30 = 55.98;
        double totalCost, eco = 3.85, fclass = 5.60;

        if ((jRadioButton1.isSelected()) && (jRadioButton4.isSelected())
           && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
           .equals("Uttara")) {

            totalCost = (tax * MilesK8) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MilesK8);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", MilesK8 + totalCost);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
        } else if ((jRadioButton1.isSelected()) && (jRadioButton5.isSelected())
            && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
            .equals("Uttara")) {

            totalCost = (tax * (MilesK8 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MilesK8 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format(" %.2f", (MilesK8 + totalCost) * 2);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("RETURN");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
        } else if ((jRadioButton1.isSelected()) && (jRadioButton4.isSelected())
            && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
            .equals("Uttara")) {

            totalCost = (tax * MilesK8 * 2) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MilesK8);
            jTextField1.setText(subTotal);
            String Total = String.format(" %.2f", MilesK8 + totalCost - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton1.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Uttara")) {

            totalCost = (tax * (MilesK8 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MilesK8 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format(" %.2f", ((MilesK8 + totalCost) 
                    * 2) - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("RETURN");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton1.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Joydppur")) {

            totalCost = (tax * MileK12) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK12);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", MileK12 + totalCost);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
        } else if ((jRadioButton1.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Joydappur")) {

            totalCost = (tax * (MileK12 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK12 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", (MileK12 + totalCost) * 2);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("RETURN");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
        } else if ((jRadioButton1.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Joydappur")) {

            totalCost = (tax * MileK12 * 2) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK12);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", MileK12 + totalCost - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton1.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Joydappur")) {

            totalCost = (tax * (MileK12 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK12 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", ((MileK12 + totalCost)
                    * 2) - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("RETURN");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton1.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Valuka")) {

            totalCost = (tax * MileK20) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK20);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", MileK20 + totalCost);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
        } else if ((jRadioButton1.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Valuka")) {

            totalCost = (tax * (MileK20 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK20 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", (MileK20 + totalCost) * 2);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("RETURN");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
        } else if ((jRadioButton1.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Valuka")) {

            totalCost = (tax * MileK20 * 2) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK20);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", MileK20 + totalCost - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton1.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Valuka")) {

            totalCost = (tax * (MileK20 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK20 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", ((MileK20 + totalCost) 
                    * 2) - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("RETURN");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton1.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Mymenshing")) {

            totalCost = (tax * MileK30) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK30);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", MileK30 + totalCost);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
        } else if ((jRadioButton1.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Mymenshing")) {

            totalCost = (tax * (MileK30 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK30 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", (MileK30 + totalCost) * 2);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("RETURN");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
        } else if ((jRadioButton1.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Mymenshing")) {

            totalCost = (tax * MileK30 * 2) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK30);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", MileK30 + totalCost - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton1.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Mymenshing")) {

            totalCost = (tax * (MileK30 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK30 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", ((MileK30 + totalCost) * 2) - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("STD");
            jTextField5.setText("RETURN");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
            
            
        } else if ((jRadioButton2.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Uttara")) {

            totalCost = (tax * (MilesK8 + eco)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MilesK8 + eco);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", MilesK8 + totalCost + eco);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");

        } else if ((jRadioButton2.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Uttara")) {

            totalCost = (tax *( MilesK8+eco)) / 100;
            String sTax = String.format("%.2f",totalCost-18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MilesK8+eco);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f",( MilesK8 + totalCost+eco) - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton2.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Uttara")) {

            totalCost = (tax * (MilesK8 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MilesK8 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", ((MilesK8 + totalCost) * 2) - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("RETURN");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton2.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Uttara")) {

            totalCost = (tax * (MilesK8 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MilesK8 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", (MilesK8 + totalCost) * 2);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("RETURN");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
        } else if ((jRadioButton2.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Joydappur")) {

            totalCost = (tax * (MileK12 + eco)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f",MileK12 + eco);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", MileK12 + totalCost + eco);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");

        } else if ((jRadioButton2.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Joydappur")) {

            totalCost = (tax *(MileK12+eco)) / 100;
            String sTax = String.format("%.2f", totalCost-18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f",( MileK12+eco));
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", (MileK12 + totalCost+eco)
                    - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton2.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Joydappur")) {

            totalCost = (tax * (MileK12 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK12 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", ((MileK12 + totalCost)
                    * 2) - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("RETURN");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton2.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Joydappur")) {

            totalCost = (tax * (MileK12 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK12 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", (MileK12 + totalCost) * 2);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("RETURN");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
        } else if ((jRadioButton2.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Valuka")) {

            totalCost = (tax * (MileK20 + eco)) / 100;
            String sTax = String.format("%.2f",totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK20 + eco);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", MileK20 + totalCost + eco);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");

        } else if ((jRadioButton2.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("valuka")) {

            totalCost = (tax *( MileK20+eco)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK20+eco);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", (MileK20+eco + totalCost)
                    - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton2.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Valuka")) {

            totalCost = (tax * (MileK20 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK20 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", ((MileK20 + totalCost) * 2)
                    - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("RETURN");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton2.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Valuka")) {

            totalCost = (tax * (MileK20 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK20 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", (MileK20 + totalCost) * 2);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("RETURN");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
        } else if ((jRadioButton2.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Mymenshing")) {

            totalCost = (tax * (MileK30 + eco)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK30 + eco);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", MileK30 + totalCost + eco);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");

        } else if ((jRadioButton2.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Mymenshing")) {

            totalCost = (tax * (MileK30+eco)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK30+fclass);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f",( MileK30 + totalCost+eco)
                    - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton2.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Mymenshing")) {

            totalCost = (tax * (MileK30 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK30 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", ((MileK30 + totalCost)
                    * 2) - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("RETURN");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton2.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Mymenshing")) {

            totalCost = (tax * (MileK30 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK30 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", (MileK30 + totalCost) * 2);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("ECONOMY");
            jTextField5.setText("RETURN");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
            
            
        }
        
    else if ((jRadioButton3.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Uttara")) {

            totalCost = (tax * (MilesK8 +fclass)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MilesK8 + fclass);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", MilesK8 + totalCost +fclass);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");

        } else if ((jRadioButton3.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Uttara")) {

            totalCost = (tax *( MilesK8+fclass)) / 100;
            String sTax = String.format("%.2f",totalCost-18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MilesK8+fclass);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f",( MilesK8 + totalCost+fclass)
                    - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton3.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Uttara")) {

            totalCost = (tax * (MilesK8 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MilesK8 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", ((MilesK8 + totalCost)
                    * 2) - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("RETURN");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton3.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Uttara")) {

            totalCost = (tax * (MilesK8 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MilesK8 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", (MilesK8 + totalCost) * 2);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("RETURN");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
        } else if ((jRadioButton3.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Joydappur")) {

            totalCost = (tax * (MileK12 +fclass)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f",MileK12 + fclass);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", MileK12 + totalCost +fclass);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");

        } else if ((jRadioButton3.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem(
                ).equals("Joydappur")) {

            totalCost = (tax *(MileK12+fclass)) / 100;
            String sTax = String.format("%.2f", totalCost-18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f",( MileK12+fclass));
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", (MileK12 + totalCost+fclass)
                    - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton3.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Joydappur")) {

            totalCost = (tax * (MileK12 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK12 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", ((MileK12 + totalCost)
                    * 2) - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("RETURN");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton3.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Joydappur")) {

            totalCost = (tax * (MileK12 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK12 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", (MileK12 + totalCost) * 2);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("RETURN");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
        } else if ((jRadioButton3.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Valuka")) {

            totalCost = (tax * (MileK20 +fclass)) / 100;
            String sTax = String.format("%.2f",totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK20 +fclass);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", MileK20 + totalCost+fclass);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");

        } else if ((jRadioButton3.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("valuka")) {

            totalCost = (tax *( MileK20+fclass)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK20+fclass);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", (MileK20+fclass + totalCost)
                    - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton3.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Valuka")) {

            totalCost = (tax * (MileK20 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK20 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", ((MileK20 + totalCost)
                    * 2) - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("RETURN");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton3.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem(
                ).equals("Valuka")) {

            totalCost = (tax * (MileK20 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK20 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", (MileK20 + totalCost) * 2);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("RETURN");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
        } else if ((jRadioButton3.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Mymenshing")) {

            totalCost = (tax * (MileK30 +fclass)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK30 +fclass);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", MileK30 + totalCost +fclass);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");

        } else if ((jRadioButton3.isSelected()) && (jRadioButton4.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Mymenshing")) {

            totalCost = (tax * (MileK30+fclass)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK30+fclass);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f",( MileK30 + totalCost+fclass)
                    - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("ONE WAY");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton3.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton7.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Mymenshing")) {

            totalCost = (tax * (MileK30 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost - 18);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK30 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", ((MileK30 + totalCost) 
                    * 2) - 18);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("RETURN");
            jTextField6.setText("NIL");
            jTextField7.setText("ONE");
        } else if ((jRadioButton3.isSelected()) && (jRadioButton5.isSelected())
                && (jRadioButton6.isSelected()) && jComboBox1.getSelectedItem()
                        .equals("Mymenshing")) {

            totalCost = (tax * (MileK30 * 2)) / 100;
            String sTax = String.format("%.2f", totalCost);
            jTextField2.setText(sTax);
            String subTotal = String.format("%.2f", MileK30 * 2);
            jTextField1.setText(subTotal);
            String Total = String.format("%.2f", (MileK30 + totalCost) * 2);
            jTextField3.setText(Total);
            jTextField9.setText(Total);
            jTextField4.setText("FRISTCLASS");
            jTextField5.setText("RETURN");
            jTextField6.setText("ONE");
            jTextField7.setText("NIL");
            
            
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TricketSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TricketSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TricketSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TricketSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TricketSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
