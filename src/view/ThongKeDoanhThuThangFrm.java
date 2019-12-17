package view;

import controller.ThongKeDoanhThuThangDAO;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.DoanhThuThang;

public class ThongKeDoanhThuThangFrm extends javax.swing.JFrame {

    private ArrayList<DoanhThuThang> listDoanhThu;
    private final ThongKeDoanhThuThangDAO tkDao;
    private DefaultTableModel tableModel;

    public ThongKeDoanhThuThangFrm() {

        initComponents();
        listDoanhThu = new ArrayList<>();
        tkDao = new ThongKeDoanhThuThangDAO();
        listDoanhThu = tkDao.getDoanhThuThang();
        tableModel = (DefaultTableModel) tblDoanhThuThang.getModel();
        tblDoanhThuThang.getTableHeader().setFont(new Font("courier new", Font.PLAIN, 12));
        tableModel.getDataVector().removeAllElements();
        for (DoanhThuThang dtThang : listDoanhThu) {
            tableModel.addRow(dtThang.toObject());
        }
        setGaravity();
    }

    private void setGaravity() {
        this.pack();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoanhThuThang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDoanhThuThang.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        tblDoanhThuThang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tháng", "Tổng doanh thu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDoanhThuThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoanhThuThangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDoanhThuThang);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel1.setText("THỐNG KÊ DOANH THU HÀNG THÁNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDoanhThuThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoanhThuThangMouseClicked
        // TODO add your handling code here:

        tableModel = (DefaultTableModel) tblDoanhThuThang.getModel();
        int check = tblDoanhThuThang.getSelectedRow();

        String numQuery = tableModel.getValueAt(check, 0).toString();
        DanhSachHoaDonThangFrm dsHDJFrame = new DanhSachHoaDonThangFrm(numQuery);
        this.dispose();
        dsHDJFrame.setVisible(true);


    }//GEN-LAST:event_tblDoanhThuThangMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new ThongKeDoanhThuThangFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDoanhThuThang;
    // End of variables declaration//GEN-END:variables
}
