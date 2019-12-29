/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.sell.management.system;

import java.awt.Color;
import java.beans.PropertyVetoException;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Kawsar Hamid
 */
public class Admin extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs = null ;
    PreparedStatement ps = null;
    public Admin() {
        initComponents();
        dateclock();
        Dashboard dash = new Dashboard();
        this.dask.add(dash);
        conn = ConexionBD.Conexion();
        dash.show();
        getname();
    }
    
    public void getname()
    {
        NewJFrame lo =new NewJFrame();
        try 
        {
            String username = lo.utilisateur();
            String requet = "select * from login where username = '" + username + "'";
                ps = conn.prepareStatement(requet);
                rs = ps.executeQuery();
                if (rs.next()) 
                {
                    String t1 = rs.getString("name");
                    jLabel13.setText(t1);
                    ps.close();
                    rs.close();         
                }
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
        finally 
        {

            try 
            {
                ps.close();
                rs.close();
            } 
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, "erreur BD");
            }
        }
    }
    
    public void dateclock() 
    {
        Thread clock = new Thread() {
            public void run() {
                for (;;) {
                    Calendar Cal = new GregorianCalendar();

                    int sconde = Cal.get(Calendar.SECOND);
                    int minute = Cal.get(Calendar.MINUTE);
                    int heure = Cal.get(Calendar.HOUR);
                    int AM_PM = Cal.get(Calendar.AM_PM);  
                    String pa;
                    if(AM_PM==1){
                        pa="PM";
                    }else{
                        pa="AM";
                    }
                    
                         
                    labDate.setText( + heure + ":" + (minute) + ":" + sconde +" "+pa  );
                    
                 int mois = Cal.get(Calendar.MONTH);
                    int annee = Cal.get(Calendar.YEAR);
                    int jour = Cal.get(Calendar.DAY_OF_MONTH);

                    labdate2.setText( + jour + "/" + (mois+1) + "/" + annee);              
                    try {
                        sleep(1000);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

        };
        
clock.start();
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
        jPanel2 = new javax.swing.JPanel();
        viewcars = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sellcar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btndashboard = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        insertcar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        viewemployee = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        insertemployee = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        viewcustomer = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        insertcustomer = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        viewsells = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labDate = new javax.swing.JLabel();
        labdate2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dask = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewcars.setBackground(new java.awt.Color(54, 33, 89));
        viewcars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewcarsMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View Cars");

        javax.swing.GroupLayout viewcarsLayout = new javax.swing.GroupLayout(viewcars);
        viewcars.setLayout(viewcarsLayout);
        viewcarsLayout.setHorizontalGroup(
            viewcarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewcarsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        viewcarsLayout.setVerticalGroup(
            viewcarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewcarsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewcarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(viewcars, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, -1));

        sellcar.setBackground(new java.awt.Color(54, 33, 89));
        sellcar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellcarMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sell.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sell Car");

        javax.swing.GroupLayout sellcarLayout = new javax.swing.GroupLayout(sellcar);
        sellcar.setLayout(sellcarLayout);
        sellcarLayout.setHorizontalGroup(
            sellcarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellcarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        sellcarLayout.setVerticalGroup(
            sellcarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellcarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sellcarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(sellcar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 220, -1));

        btndashboard.setBackground(new java.awt.Color(54, 33, 89));
        btndashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btndashboardMousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crown.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dashboard");

        javax.swing.GroupLayout btndashboardLayout = new javax.swing.GroupLayout(btndashboard);
        btndashboard.setLayout(btndashboardLayout);
        btndashboardLayout.setHorizontalGroup(
            btndashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btndashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        btndashboardLayout.setVerticalGroup(
            btndashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btndashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btndashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(btndashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, -1));

        insertcar.setBackground(new java.awt.Color(54, 33, 89));
        insertcar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                insertcarMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/car.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Insert new Car");

        javax.swing.GroupLayout insertcarLayout = new javax.swing.GroupLayout(insertcar);
        insertcar.setLayout(insertcarLayout);
        insertcarLayout.setHorizontalGroup(
            insertcarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertcarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        insertcarLayout.setVerticalGroup(
            insertcarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertcarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(insertcarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(insertcar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, -1));

        viewemployee.setBackground(new java.awt.Color(54, 33, 89));
        viewemployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewemployeeMousePressed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("View Employee");

        javax.swing.GroupLayout viewemployeeLayout = new javax.swing.GroupLayout(viewemployee);
        viewemployee.setLayout(viewemployeeLayout);
        viewemployeeLayout.setHorizontalGroup(
            viewemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewemployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        viewemployeeLayout.setVerticalGroup(
            viewemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewemployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(viewemployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 220, -1));

        insertemployee.setBackground(new java.awt.Color(54, 33, 89));
        insertemployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                insertemployeeMousePressed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-dock.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Add Employee");

        javax.swing.GroupLayout insertemployeeLayout = new javax.swing.GroupLayout(insertemployee);
        insertemployee.setLayout(insertemployeeLayout);
        insertemployeeLayout.setHorizontalGroup(
            insertemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertemployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        insertemployeeLayout.setVerticalGroup(
            insertemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertemployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(insertemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(insertemployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 220, -1));

        viewcustomer.setBackground(new java.awt.Color(54, 33, 89));
        viewcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewcustomerMousePressed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("View Customer");

        javax.swing.GroupLayout viewcustomerLayout = new javax.swing.GroupLayout(viewcustomer);
        viewcustomer.setLayout(viewcustomerLayout);
        viewcustomerLayout.setHorizontalGroup(
            viewcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewcustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        viewcustomerLayout.setVerticalGroup(
            viewcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewcustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(viewcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 220, -1));

        insertcustomer.setBackground(new java.awt.Color(54, 33, 89));
        insertcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                insertcustomerMousePressed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/store.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Add Premium Customer");

        javax.swing.GroupLayout insertcustomerLayout = new javax.swing.GroupLayout(insertcustomer);
        insertcustomer.setLayout(insertcustomerLayout);
        insertcustomerLayout.setHorizontalGroup(
            insertcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertcustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        insertcustomerLayout.setVerticalGroup(
            insertcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertcustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(insertcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(insertcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, -1));

        logout.setBackground(new java.awt.Color(54, 33, 89));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutMousePressed(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Log-out");

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 220, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Nameless");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel26MousePressed(evt);
            }
        });
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, 10));

        viewsells.setBackground(new java.awt.Color(54, 33, 89));
        viewsells.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewsellsMousePressed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("View Sells");

        javax.swing.GroupLayout viewsellsLayout = new javax.swing.GroupLayout(viewsells);
        viewsells.setLayout(viewsellsLayout);
        viewsellsLayout.setHorizontalGroup(
            viewsellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewsellsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        viewsellsLayout.setVerticalGroup(
            viewsellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewsellsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewsellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(viewsells, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 220, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 500));

        jPanel3.setBackground(new java.awt.Color(122, 72, 221));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel12.setText("Welcome");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 11, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 150, 20));

        labDate.setFont(new java.awt.Font("DS-Digital", 1, 24)); // NOI18N
        labDate.setForeground(new java.awt.Color(255, 255, 255));
        labDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDate.setText("10:15:30 PM");
        jPanel3.add(labDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 140, 50));

        labdate2.setFont(new java.awt.Font("FreeSerif", 0, 14)); // NOI18N
        labdate2.setForeground(new java.awt.Color(255, 255, 255));
        labdate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labdate2.setText("12/02/2016");
        jPanel3.add(labdate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 90, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 810, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, -1, -1));

        javax.swing.GroupLayout daskLayout = new javax.swing.GroupLayout(dask);
        dask.setLayout(daskLayout);
        daskLayout.setHorizontalGroup(
            daskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        daskLayout.setVerticalGroup(
            daskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(dask, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 800, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel11MousePressed

    private void btndashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndashboardMousePressed
        setcolor(btndashboard);
        resetColor(insertcar);
        resetColor(viewcars);
        resetColor(sellcar);
        resetColor(insertcustomer);
        resetColor(viewcustomer);
        resetColor(insertemployee);
        resetColor(viewemployee);
        resetColor(viewsells);
        
        
        
        this.dask.removeAll();
        this.dask.repaint();
        
        Dashboard dash = new Dashboard();
        this.dask.add(dash);
        try {
            dash.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        dash.show();
    }//GEN-LAST:event_btndashboardMousePressed

    private void insertcarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertcarMousePressed
        resetColor(btndashboard);
        setcolor(insertcar);
        resetColor(viewcars);
        resetColor(sellcar);
        resetColor(insertcustomer);
        resetColor(viewcustomer);
        resetColor(insertemployee);
        resetColor(viewemployee);
        resetColor(viewsells);
        
        this.dask.removeAll();
        this.dask.repaint();
        
        Insertcar icar = new Insertcar();
        this.dask.add(icar);
        try {
            icar.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        icar.show();
    }//GEN-LAST:event_insertcarMousePressed

    private void viewcarsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewcarsMousePressed
        resetColor(btndashboard);
        resetColor(insertcar);
        setcolor(viewcars);
        resetColor(sellcar);
        resetColor(insertcustomer);
        resetColor(viewcustomer);
        resetColor(insertemployee);
        resetColor(viewemployee);
        resetColor(viewsells);
        
        this.dask.removeAll();
        this.dask.repaint();
        
        Viewcar vcar = new Viewcar();
        this.dask.add(vcar);
        try {
            vcar.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        vcar.show();
    }//GEN-LAST:event_viewcarsMousePressed

    private void sellcarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellcarMousePressed
        resetColor(btndashboard);
        resetColor(insertcar);
        resetColor(viewcars);
        setcolor(sellcar);
        resetColor(insertcustomer);
        resetColor(viewcustomer);
        resetColor(insertemployee);
        resetColor(viewemployee);
        resetColor(viewsells);
        
        this.dask.removeAll();
        this.dask.repaint();
        
        Sellcar scar = new Sellcar();
        this.dask.add(scar);
        try {
            scar.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        scar.show();
    }//GEN-LAST:event_sellcarMousePressed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void viewemployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewemployeeMousePressed
        resetColor(btndashboard);
        resetColor(insertcar);
        resetColor(viewcars);
        resetColor(sellcar);
        resetColor(insertcustomer);
        resetColor(viewcustomer);
        resetColor(insertemployee);
        setcolor(viewemployee);
        resetColor(viewsells);
        
        this.dask.removeAll();
        this.dask.repaint();
        
        Viewemployee vemployee = new Viewemployee();
        this.dask.add(vemployee);
        try {
            vemployee.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        vemployee.show();
    }//GEN-LAST:event_viewemployeeMousePressed

    private void insertemployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertemployeeMousePressed
        resetColor(btndashboard);
        resetColor(insertcar);
        resetColor(viewcars);
        resetColor(sellcar);
        resetColor(insertcustomer);
        resetColor(viewcustomer);
        setcolor(insertemployee);
        resetColor(viewemployee);
        resetColor(viewsells);
        
        this.dask.removeAll();
        this.dask.repaint();
        
        Addemployee aemployee = new Addemployee();
        this.dask.add(aemployee);
        try {
            aemployee.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        aemployee.show();
    }//GEN-LAST:event_insertemployeeMousePressed

    private void viewcustomerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewcustomerMousePressed
        resetColor(btndashboard);
        resetColor(insertcar);
        resetColor(viewcars);
        resetColor(sellcar);
        resetColor(insertcustomer);
        setcolor(viewcustomer);
        resetColor(insertemployee);
        resetColor(viewemployee);
        resetColor(viewsells);
        
        
        this.dask.removeAll();
        this.dask.repaint();
        
        Viewcustomer vcustomer = new Viewcustomer();
        this.dask.add(vcustomer);
        try {
            vcustomer.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        vcustomer.show();
    }//GEN-LAST:event_viewcustomerMousePressed

    private void insertcustomerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertcustomerMousePressed
        resetColor(btndashboard);
        resetColor(insertcar);
        resetColor(viewcars);
        resetColor(sellcar);
        setcolor(insertcustomer);
        resetColor(viewcustomer);
        resetColor(insertemployee);
        resetColor(viewemployee);
        resetColor(viewsells);
        
        this.dask.removeAll();
        this.dask.repaint();
        
        Addcustomer acustomer = new Addcustomer();
        this.dask.add(acustomer);
        try {
            acustomer.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        acustomer.show();
    }//GEN-LAST:event_insertcustomerMousePressed

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed
        this.dispose();
        NewJFrame firstframe = new NewJFrame();
        firstframe.setVisible(true);
    }//GEN-LAST:event_logoutMousePressed

    private void jLabel26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MousePressed
        this.dask.removeAll();
        this.dask.repaint();
        
        Dashboard dash = new Dashboard();
        this.dask.add(dash);
        try {
            dash.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        dash.show();
    }//GEN-LAST:event_jLabel26MousePressed

    private void viewsellsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewsellsMousePressed
        resetColor(btndashboard);
        resetColor(insertcar);
        resetColor(viewcars);
        resetColor(sellcar);
        resetColor(insertcustomer);
        resetColor(viewcustomer);
        resetColor(insertemployee);
        resetColor(viewemployee);
        setcolor(viewsells);
        
        this.dask.removeAll();
        this.dask.repaint();
        
        Viewsells sells = new Viewsells();
        this.dask.add(sells);
        try {
            sells.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        sells.show();
    }//GEN-LAST:event_viewsellsMousePressed
    
    void setcolor(JPanel panel)
    {
        panel.setBackground(new Color(85,65,118));
    }                                 
    void resetColor(JPanel panel)
    {
        panel.setBackground(new Color(54,33,89));
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btndashboard;
    private javax.swing.JDesktopPane dask;
    private javax.swing.JPanel insertcar;
    private javax.swing.JPanel insertcustomer;
    private javax.swing.JPanel insertemployee;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labDate;
    private javax.swing.JLabel labdate2;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel sellcar;
    private javax.swing.JPanel viewcars;
    private javax.swing.JPanel viewcustomer;
    private javax.swing.JPanel viewemployee;
    private javax.swing.JPanel viewsells;
    // End of variables declaration//GEN-END:variables
}