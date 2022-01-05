import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import org.w3c.dom.css.RGBColor;

public class Home_JFrame extends javax.swing.JFrame {
    Color grayishColor = new Color(163,179,188);
    
    public Home_JFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        shopDetails_JButton = new javax.swing.JButton();
        home_JButton = new javax.swing.JButton();
        importConfig_JButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        home_Control2 = new Home_Control();
        homeWindowState = new javax.swing.JPanel();
        homegreen_JButton = new javax.swing.JButton();
        homeorange_JButton = new javax.swing.JButton();
        homered_JButton = new javax.swing.JButton();
        shopDetails_Control2 = new ShopDetails_Control();
        importConfig_Control1 = new ImportConfig_Control();
        shopDetailsWindowControl = new javax.swing.JPanel();
        shopdetailsgreen_JButton = new javax.swing.JButton();
        shopdetailsorange_JButton = new javax.swing.JButton();
        shopdetailsred_JButton = new javax.swing.JButton();
        importConfigWindowState = new javax.swing.JPanel();
        importconfiggreen_JButton = new javax.swing.JButton();
        importconfigorange_JButton = new javax.swing.JButton();
        importconfigred_JButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(235, 237, 239));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        shopDetails_JButton.setBackground(new java.awt.Color(255, 255, 255));
        shopDetails_JButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        shopDetails_JButton.setForeground(new java.awt.Color(163, 179, 188));
        shopDetails_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShopDetails_IconGrayish.png"))); // NOI18N
        shopDetails_JButton.setText("  Shop Details");
        shopDetails_JButton.setActionCommand("importConfig_JButton");
        shopDetails_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shopDetails_JButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ShopDetails_IconBlack.png"))); // NOI18N
        shopDetails_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shopDetails_JButtonMouseClicked(evt);
            }
        });

        home_JButton.setBackground(new java.awt.Color(255, 255, 255));
        home_JButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        home_JButton.setForeground(new java.awt.Color(163, 179, 188));
        home_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home_IconGrayish.png"))); // NOI18N
        home_JButton.setText("  Home");
        home_JButton.setActionCommand("home_JButton");
        home_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home_JButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Home_IconBlack.png"))); // NOI18N
        home_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_JButtonMouseClicked(evt);
            }
        });

        importConfig_JButton.setBackground(new java.awt.Color(255, 255, 255));
        importConfig_JButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        importConfig_JButton.setForeground(new java.awt.Color(163, 179, 188));
        importConfig_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImportConfig_IconGrayish.png"))); // NOI18N
        importConfig_JButton.setText("  Import Config");
        importConfig_JButton.setActionCommand("importConfig_JButton");
        importConfig_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        importConfig_JButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImportConfig_IconBlack.png"))); // NOI18N
        importConfig_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importConfig_JButtonMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EasyImport_Logo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(163, 179, 188));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("(5.0.0 bis 5.7.6)");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(163, 179, 188));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Kompatibel mit:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Shopware_Icon.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(importConfig_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
            .addComponent(shopDetails_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(home_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(home_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shopDetails_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(importConfig_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(249, 249, 249)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(607, Short.MAX_VALUE)))
        );

        homegreen_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/greenmac.png"))); // NOI18N
        homegreen_JButton.setBorderPainted(false);
        homegreen_JButton.setContentAreaFilled(false);
        homegreen_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homegreen_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homegreen_JButtonminimize_buttonMouseClicked(evt);
            }
        });

        homeorange_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orangemac.png"))); // NOI18N
        homeorange_JButton.setBorderPainted(false);
        homeorange_JButton.setContentAreaFilled(false);
        homeorange_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeorange_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeorange_JButtonMouseClicked(evt);
            }
        });

        homered_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redmac.png"))); // NOI18N
        homered_JButton.setBorderPainted(false);
        homered_JButton.setContentAreaFilled(false);
        homered_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homered_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homered_JButtonexit_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homeWindowStateLayout = new javax.swing.GroupLayout(homeWindowState);
        homeWindowState.setLayout(homeWindowStateLayout);
        homeWindowStateLayout.setHorizontalGroup(
            homeWindowStateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeWindowStateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(homered_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeorange_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homegreen_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        homeWindowStateLayout.setVerticalGroup(
            homeWindowStateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homegreen_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homeorange_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homered_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(home_Control2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(604, 604, 604)
                        .addComponent(homeWindowState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(homeWindowState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(home_Control2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        shopdetailsgreen_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/greenmac.png"))); // NOI18N
        shopdetailsgreen_JButton.setBorderPainted(false);
        shopdetailsgreen_JButton.setContentAreaFilled(false);
        shopdetailsgreen_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shopdetailsgreen_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shopdetailsgreen_JButtonminimize_buttonMouseClicked(evt);
            }
        });

        shopdetailsorange_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orangemac.png"))); // NOI18N
        shopdetailsorange_JButton.setBorderPainted(false);
        shopdetailsorange_JButton.setContentAreaFilled(false);
        shopdetailsorange_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shopdetailsorange_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shopdetailsorange_JButtonMouseClicked(evt);
            }
        });

        shopdetailsred_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redmac.png"))); // NOI18N
        shopdetailsred_JButton.setBorderPainted(false);
        shopdetailsred_JButton.setContentAreaFilled(false);
        shopdetailsred_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shopdetailsred_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shopdetailsred_JButtonexit_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout shopDetailsWindowControlLayout = new javax.swing.GroupLayout(shopDetailsWindowControl);
        shopDetailsWindowControl.setLayout(shopDetailsWindowControlLayout);
        shopDetailsWindowControlLayout.setHorizontalGroup(
            shopDetailsWindowControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shopDetailsWindowControlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(shopdetailsred_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shopdetailsorange_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shopdetailsgreen_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        shopDetailsWindowControlLayout.setVerticalGroup(
            shopDetailsWindowControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shopdetailsgreen_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(shopdetailsorange_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(shopdetailsred_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        importconfiggreen_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/greenmac.png"))); // NOI18N
        importconfiggreen_JButton.setBorderPainted(false);
        importconfiggreen_JButton.setContentAreaFilled(false);
        importconfiggreen_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        importconfiggreen_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importconfiggreen_JButtonminimize_buttonMouseClicked(evt);
            }
        });

        importconfigorange_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orangemac.png"))); // NOI18N
        importconfigorange_JButton.setBorderPainted(false);
        importconfigorange_JButton.setContentAreaFilled(false);
        importconfigorange_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        importconfigorange_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importconfigorange_JButtonMouseClicked(evt);
            }
        });

        importconfigred_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redmac.png"))); // NOI18N
        importconfigred_JButton.setBorderPainted(false);
        importconfigred_JButton.setContentAreaFilled(false);
        importconfigred_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        importconfigred_JButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importconfigred_JButtonexit_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout importConfigWindowStateLayout = new javax.swing.GroupLayout(importConfigWindowState);
        importConfigWindowState.setLayout(importConfigWindowStateLayout);
        importConfigWindowStateLayout.setHorizontalGroup(
            importConfigWindowStateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, importConfigWindowStateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(importconfigred_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(importconfigorange_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(importconfiggreen_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        importConfigWindowStateLayout.setVerticalGroup(
            importConfigWindowStateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(importconfiggreen_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(importconfigorange_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(importconfigred_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(shopDetails_Control2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shopDetailsWindowControl, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(importConfig_Control1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importConfigWindowState, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shopDetailsWindowControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importConfigWindowState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(importConfig_Control1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shopDetails_Control2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void centreWindow(Window frame) {
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
    frame.setLocation(x, y);
}
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                // Makes The Buttons Borderless & Sets The Font Size
                home_JButton.setBorderPainted( false );
                home_JButton.setContentAreaFilled(false);
                shopDetails_JButton.setBorderPainted( false );
                shopDetails_JButton.setContentAreaFilled(false);
                importConfig_JButton.setBorderPainted( false );
                importConfig_JButton.setContentAreaFilled(false);
                home_JButton.setForeground(Color.BLACK);
                shopDetailsWindowControl.setVisible(false);
                importConfigWindowState.setVisible(false);
                shopDetails_Control2.setVisible(false);
                importConfig_Control1.setVisible(false);
                home_JButton.setSelected(true);
                this.setSize(1012, 780);
                centreWindow(this);
                this.addComponentListener(new ComponentAdapter() {
                public void componentResized(ComponentEvent e) {
                    setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));
                }
            }); 
    }//GEN-LAST:event_formWindowOpened

    private void shopdetailsred_JButtonexit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopdetailsred_JButtonexit_buttonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_shopdetailsred_JButtonexit_buttonMouseClicked

    private void shopdetailsorange_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopdetailsorange_JButtonMouseClicked

    }//GEN-LAST:event_shopdetailsorange_JButtonMouseClicked

    private void shopdetailsgreen_JButtonminimize_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopdetailsgreen_JButtonminimize_buttonMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_shopdetailsgreen_JButtonminimize_buttonMouseClicked

    private void homered_JButtonexit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homered_JButtonexit_buttonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_homered_JButtonexit_buttonMouseClicked

    private void homeorange_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeorange_JButtonMouseClicked

    }//GEN-LAST:event_homeorange_JButtonMouseClicked

    private void homegreen_JButtonminimize_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homegreen_JButtonminimize_buttonMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_homegreen_JButtonminimize_buttonMouseClicked

    private void importconfigred_JButtonexit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importconfigred_JButtonexit_buttonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_importconfigred_JButtonexit_buttonMouseClicked

    private void importconfigorange_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importconfigorange_JButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_importconfigorange_JButtonMouseClicked

    private void importconfiggreen_JButtonminimize_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importconfiggreen_JButtonminimize_buttonMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_importconfiggreen_JButtonminimize_buttonMouseClicked

    private void importConfig_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importConfig_JButtonMouseClicked
        home_JButton.setForeground(grayishColor);
        shopDetails_JButton.setForeground(grayishColor);
        importConfig_JButton.setForeground(Color.BLACK);
        home_Control2.setVisible(false);
        shopDetails_Control2.setVisible(false);
        importConfig_Control1.setVisible(true);
        home_JButton.setSelected(false);
        shopDetails_JButton.setSelected(false);
        importConfig_JButton.setSelected(true);
        homeWindowState.setVisible(false);
        importConfigWindowState.setVisible(true);
        shopDetailsWindowControl.setVisible(false);
    }//GEN-LAST:event_importConfig_JButtonMouseClicked

    private void home_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_JButtonMouseClicked
        home_JButton.setForeground(Color.BLACK);
        shopDetails_JButton.setForeground(grayishColor);
        importConfig_JButton.setForeground(grayishColor);
        home_Control2.setVisible(true);
        shopDetails_Control2.setVisible(false);
        importConfig_Control1.setVisible(false);
        home_JButton.setSelected(true);
        shopDetails_JButton.setSelected(false);
        importConfig_JButton.setSelected(false);
        homeWindowState.setVisible(true);
        importConfigWindowState.setVisible(false);
        shopDetailsWindowControl.setVisible(false);
        homeWindowState.setVisible(true);
    }//GEN-LAST:event_home_JButtonMouseClicked

    private void shopDetails_JButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopDetails_JButtonMouseClicked
        home_JButton.setForeground(grayishColor);
        shopDetails_JButton.setForeground(Color.BLACK);
        importConfig_JButton.setForeground(grayishColor);
        home_Control2.setVisible(false);
        shopDetails_Control2.setVisible(true);
        importConfig_Control1.setVisible(false);
        home_JButton.setSelected(false);
        shopDetails_JButton.setSelected(true);
        importConfig_JButton.setSelected(false);
        homeWindowState.setVisible(false);
        importConfigWindowState.setVisible(false);
        shopDetailsWindowControl.setVisible(true);
    }//GEN-LAST:event_shopDetails_JButtonMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel homeWindowState;
    private Home_Control home_Control2;
    private javax.swing.JButton home_JButton;
    private javax.swing.JButton homegreen_JButton;
    private javax.swing.JButton homeorange_JButton;
    private javax.swing.JButton homered_JButton;
    private javax.swing.JPanel importConfigWindowState;
    private ImportConfig_Control importConfig_Control1;
    private javax.swing.JButton importConfig_JButton;
    private javax.swing.JButton importconfiggreen_JButton;
    private javax.swing.JButton importconfigorange_JButton;
    private javax.swing.JButton importconfigred_JButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel shopDetailsWindowControl;
    private ShopDetails_Control shopDetails_Control2;
    private javax.swing.JButton shopDetails_JButton;
    private javax.swing.JButton shopdetailsgreen_JButton;
    private javax.swing.JButton shopdetailsorange_JButton;
    private javax.swing.JButton shopdetailsred_JButton;
    // End of variables declaration//GEN-END:variables
}
