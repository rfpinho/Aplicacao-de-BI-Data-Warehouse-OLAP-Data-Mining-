package olap;

import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Interface extends javax.swing.JFrame {
    private OLAP olap;
    private int diaInicio, mesInicio, diaFinal, mesFinal, diaInicio2, mesInicio2, diaFinal2, mesFinal2;
    private boolean mostrarGrafico = true;
    private boolean mostrarGrafico2 = true;
    
    public Interface(OLAP olap) {
        this.olap = olap;
        initComponents();
        
        jLabel9.setVisible(false); jLabel10.setVisible(false);
        jLabel19.setVisible(false); jLabel20.setVisible(false);
        jTable1.getTableHeader().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                jTable1HeaderSelecionado(event);
            }
        });
        jTable2.getTableHeader().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                jTable2HeaderSelecionado(event);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jComboBox12 = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox10 = new javax.swing.JComboBox();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jComboBox11 = new javax.swing.JComboBox();
        jButton9 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interface");

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1707, 823));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome companhia", "Número de voos", "% Voos cancelados", "% Voos desviados", "% Voos atrasadosP (Tmédio)", "% Voos atrasadosC (Tmédio)", "Velocidade média de voo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(180);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(180);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(180);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(180);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(180);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(180);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(180);
        }

        jLabel1.setText("Selecione o período temporal (2015)");

        jLabel2.setText("Informação de voos de cada companhia aérea");

        jButton1.setText("   Ok   ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Total de companhias aéreas: 14");

        jLabel4.setText("Início");

        jLabel5.setText("Fim");

        jLabel6.setText("Informação de voos da companhia aérea");

        jLabel7.setText("Selecionar período");

        jLabel8.setText("Selecionar opção");

        jLabel9.setText("Opção");

        jLabel10.setText("Período");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar companhia aérea", "Alaska Airlines Inc.", "American Airlines Inc.", "American Eagle Airlines Inc.", "Atlantic Southeast Airlines", "Delta Airlines Inc.", "Frontier Airlines Inc.", "Hawaiian Airlines Inc.", "JetBlue Airways", "Skywest Airlines Inc.", "Southwest Airlines Co.", "Spirit Airlines", "United Airlines Inc.", "US Airways Inc.", "Virgin America" }));

        jButton7.setText("   Mostrar   ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Mês");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Trimestre");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Número de voos");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Número de voos cancelados");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("Número de voos desviados");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("Tempo médio de atraso à partida");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton12.setText("Tempo médio de atraso à chegada");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jLabel25.setText("Dia");

        jLabel26.setText("Mês");

        jLabel27.setText("Dia");

        jLabel28.setText("Mês");

        jRadioButton13.setText("Lucro líquido ($)");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar companhia aérea", "Alaska Airlines Inc.", "American Airlines Inc.", "American Eagle Airlines Inc.", "Atlantic Southeast Airlines", "Delta Airlines Inc.", "Frontier Airlines Inc.", "Hawaiian Airlines Inc.", "JetBlue Airways", "Skywest Airlines Inc.", "Southwest Airlines Co.", "Spirit Airlines", "United Airlines Inc.", "US Airways Inc.", "Virgin America" }));

        jLabel30.setText("Comparar com a  companhia aérea");

        jLabel31.setText("Cabeçalho");

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Mostrar gráfico");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel25))
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61)
                                                .addComponent(jLabel5))
                                            .addComponent(jLabel26))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel27))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel28))
                                        .addGap(60, 60, 60)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel9))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(46, 46, 46)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jRadioButton12)
                                                                    .addComponent(jRadioButton6)
                                                                    .addComponent(jRadioButton5)
                                                                    .addComponent(jRadioButton13))
                                                                .addComponent(jButton7))
                                                            .addComponent(jRadioButton4)
                                                            .addComponent(jRadioButton3)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(25, 25, 25)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel8)
                                                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel30)
                                                            .addComponent(jLabel7)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(48, 48, 48)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jRadioButton1)
                                                            .addComponent(jRadioButton2))))
                                                .addGap(81, 81, 81)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel31)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addGap(1, 1, 1)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton13)
                        .addGap(9, 9, 9)
                        .addComponent(jButton7)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("     Companhias aéreas     ", jPanel1);

        jLabel11.setText("Selecione o período temporal (2015)");

        jLabel12.setText("Informação de voos de cada aeroporto");

        jLabel13.setText("Total de aeroportos: 322");

        jLabel14.setText("Início");

        jLabel15.setText("Fim");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Nome aeroporto", "Movimento", "% Voos cancelados", "% Voos desviados", "Taxi out médio", "Taxi in médio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(40);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(320);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(320);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(180);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(180);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(180);
            jTable2.getColumnModel().getColumn(3).setMaxWidth(180);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(180);
            jTable2.getColumnModel().getColumn(4).setMaxWidth(180);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(180);
            jTable2.getColumnModel().getColumn(5).setMaxWidth(180);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(180);
            jTable2.getColumnModel().getColumn(6).setMaxWidth(180);
        }

        jLabel16.setText("Informação de voos do aeroporto");

        jLabel17.setText("Selecionar período");

        jLabel18.setText("Selecionar opção");

        jLabel19.setText("Opção");

        jLabel20.setText("Período");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jButton2.setText("   Ok   ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("<<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("<");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText(">");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(">>");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar aeroporto", "Aberdeen Regional Airport", "Abilene Regional Airport", "Abraham Lincoln Capital Airport", "Adak Airport", "Akron-Canton Regional Airport", "Albany International Airport", "Albert J. Ellis Airport", "Albuquerque International Sunport", "Alexandria International Airport", "Alpena County Regional Airport", "Appleton International Airport", "Arcata Airport", "Arnold Palmer Regional Airport", "Asheville Regional Airport", "Aspen-Pitkin County Airport", "Atlantic City International Airport", "Augusta Regional AirportÂ (Bush Field)", "Austin-Bergstrom International Airport", "Baltimore-Washington International Airport", "Bangor International Airport", "Barkley Regional Airport", "Barnstable Municipal Airport", "Baton Rouge Metropolitan Airport", "Bellingham International Airport", "Bemidji Regional Airport", "Bert Mooney Airport", "Bethel Airport", "Bill and Hillary Clinton National AirportÂ (Adams Field)", "Billings Logan International Airport", "Birmingham-Shuttlesworth International Airport", "Bishop International Airport", "Bismarck Municipal Airport", "Blue Grass Airport", "Bob Hope AirportÂ (Hollywood Burbank Airport)", "Boise AirportÂ (Boise Air Terminal)", "Bozeman Yellowstone International AirportÂ (Gallatin Field Airport)", "Bradley International Airport", "Brainerd Lakes Regional Airport", "Brownsville/South Padre Island International Airport", "Brunswick Golden Isles Airport", "Buffalo Niagara International Airport", "Burlington International Airport", "Canyonlands Field", "Capital Region International AirportÂ ( Lansing Capital City)", "Cedar City Regional Airport", "Central Illinois Regional Airport at Bloomington-Normal", "Central Nebraska Regional Airport", "Central Wisconsin Airport", "Charleston International Airport/Charleston AFB", "Charlotte Douglas International Airport", "Charlottesville-Albemarle Airport", "Chattanooga Metropolitan AirportÂ (Lovell Field)", "Cherry Capital Airport", "Chicago Midway International Airport", "Chicago O'Hare International Airport", "Chippewa County International Airport", "Chippewa Valley Regional Airport", "Cincinnati/Northern Kentucky International Airport", "City of Colorado Springs Municipal Airport", "Cleveland Hopkins International Airport", "Coastal Carolina Regional AirportÂ (Craven County Regional)", "Columbia Metropolitan Airport", "Columbia Regional Airport", "Columbus Metropolitan Airport", "Corpus Christi International Airport", "Cyril E. King Airport", "Dallas Love Field", "Dallas/Fort Worth International Airport", "Dane County Regional Airport", "Daytona Beach International Airport", "Deadhorse AirportÂ (Prudhoe Bay Airport)", "Del Norte County AirportÂ (Jack McNamara Field)", "Delta County Airport", "Denver International Airport", "Des Moines International Airport", "Destin-Fort Walton Beach Airport/Eglin AFB", "Detroit Metropolitan Airport", "Devils Lake Regional Airport", "Dickinson Theodore Roosevelt Regional Airport", "Dillingham Airport", "Dothan Regional Airport", "Dubuque Regional Airport", "Duluth International Airport", "Durango-La Plata County Airport", "Eagle County Regional Airport", "East Texas Regional Airport", "Easterwood Airport", "El Paso International Airport", "Elko Regional Airport", "Elmira/Corning Regional Airport", "Eppley Airfield", "Erie International Airport", "Eugene AirportÂ (Mahlon Sweet Field)", "Evansville Regional Airport", "Fairbanks International Airport", "Falls International Airport", "Fayetteville Regional Airport", "Flagstaff Pulliam Airport", "Ford Airport", "Fort Lauderdale-Hollywood International Airport", "Fort Smith Regional Airport", "Fort Wayne International Airport", "Fresno Yosemite International Airport", "Friedman Memorial Airport", "Gainesville Regional Airport", "Garden City Regional Airport", "Gen. Edward Lawrence Logan International Airport", "General Mitchell International Airport", "General Wayne A. Downing Peoria International Airport", "George Bush Intercontinental Airport", "Gerald R. Ford International Airport", "Gillette-Campbell County Airport", "Glacier Park International Airport", "Golden Triangle Regional Airport", "Grand Forks International Airport", "Grand Junction Regional AirportÂ (Walker Field)", "Great Falls International Airport", "Greater Binghamton Airport", "Greater Rochester International Airport", "Green Bay-Austin Straubel International Airport", "Greenville-Spartanburg International Airport", "Guam International Airport", "Gulfport-Biloxi International Airport", "Gunnison-Crested Butte Regional Airport", "Gustavus Airport", "Harrisburg International Airport", "Hartsfield-Jackson Atlanta International Airport", "Hattiesburg-Laurel Regional Airport", "Hays Regional Airport", "Hector International Airport", "Helena Regional Airport", "Henry E. Rohlsen Airport", "Hilo International Airport", "Honolulu International Airport", "Houghton County Memorial Airport", "Huntsville International Airport", "Idaho Falls Regional Airport", "Indianapolis International Airport", "Ithaca Tompkins Regional Airport", "Jack Brooks Regional AirportÂ (Southeast Texas Regional)", "Jackson Hole Airport", "Jackson-Evers International Airport", "Jacksonville International Airport", "James M. Cox Dayton International Airport", "Jamestown Regional Airport", "John F. Kennedy International AirportÂ (New York International Airport)", "John Wayne AirportÂ (Orange County Airport)", "Joplin Regional Airport", "Juneau International Airport", "Kahului Airport", "Kalamazoo/Battle Creek International Airport", "Kansas City International Airport", "Ketchikan International Airport", "Key West International Airport", "Killeen-Fort Hood Regional Airport", "King Salmon Airport", "Kodiak Airport", "Kona International Airport at Keahole", "La Crosse Regional Airport", "Lafayette Regional Airport", "LaGuardia Airport (Marine Air Terminal)", "Lake Charles Regional Airport", "Laramie Regional Airport", "Laredo International Airport", "Lawton-Fort Sill Regional Airport", "Lea County Regional Airport", "Lehigh Valley International Airport", "Lewiston-Nez Perce County Airport", "Lihue Airport", "Lincoln AirportÂ (Lincoln Municipal)", "Long Beach AirportÂ (Daugherty Field)", "Long Island MacArthur Airport", "Los Angeles International Airport", "Louis Armstrong New Orleans International Airport", "Louisville International AirportÂ (Standiford Field)", "Lubbock Preston Smith International Airport", "Luis MuÃ±oz MarÃ­n International Airport", "Magic Valley Regional AirportÂ (Joslin Field)", "Mammoth Yosemite Airport", "Manchester-Boston Regional Airport", "Manhattan Regional Airport", "Martha's Vineyard Airport", "MBS International Airport", "McAllen-Miller International AirportÂ (McAllen Miller International)", "McCarran International Airport", "McClellan-Palomar Airport", "McGhee Tyson Airport", "Meadows Field", "Melbourne International Airport", "Memphis International Airport", "Mercedita Airport", "Meridian Regional Airport", "Merle K. (Mudhole) Smith Airport", "Miami International Airport", "Midland International Airport", "Minneapolis-Saint Paul International Airport", "Minot International Airport", "Missoula International Airport", "Mobile Regional Airport", "Monroe Regional Airport", "Monterey Regional AirportÂ (Monterey Peninsula Airport)", "Montgomery Regional Airport", "Montrose Regional Airport", "Muskegon County Airport", "Myrtle Beach International Airport", "Nantucket Memorial Airport", "Nashville International Airport", "Natrona County International Airport", "Newark Liberty International Airport", "Newport News/Williamsburg International Airport", "Niagara Falls International Airport", "Nome Airport", "Norfolk International Airport", "Norman Y. Mineta San JosÃ© International Airport", "Northeast Florida Regional AirportÂ (St. Augustine Airport)", "Northwest Arkansas Regional Airport", "Northwest Florida Beaches International Airport", "Oakland International Airport", "Ontario International Airport", "Orlando International Airport", "Pago Pago International Airport (Tafuna Airport)", "Palm Beach International Airport", "Palm Springs International Airport", "Pellston Regional Airport of Emmet County", "Pensacola International AirportÂ (Pensacola Gulf Coast Regional Airport)", "Petersburg James A. Johnson Airport", "Philadelphia International Airport", "Phoenix Sky Harbor International Airport", "Piedmont Triad International Airport", "Pittsburgh International Airport", "Plattsburgh International Airport", "Pocatello Regional Airport", "Port Columbus International Airport", "Portland International Airport", "Portland International Jetport", "Pueblo Memorial Airport", "Quad City International Airport", "Rafael HernÃ¡ndez Airport", "Raleigh-Durham International Airport", "Ralph Wien Memorial Airport", "Range Regional AirportÂ (Chisholm-Hibbing Airport)", "Rapid City Regional Airport", "Redding Municipal Airport", "Redmond Municipal AirportÂ (Roberts Field)", "Reno/Tahoe International Airport", "Rhinelander-Oneida County Airport", "Richmond International Airport", "Rick Husband Amarillo International Airport", "Roanoke Regional AirportÂ (Woodrum Field)", "Rochester International Airport", "Rock Springs-Sweetwater County Airport", "Rogue Valley International Airport", "Ronald Reagan Washington National Airport", "Roswell International Air Center", "Sacramento International Airport", "Salt Lake City International Airport", "San Angelo Regional AirportÂ (Mathis Field)", "San Antonio International Airport", "San Diego International AirportÂ (Lindbergh Field)", "San Francisco International Airport", "San Luis Obispo County Regional AirportÂ (McChesney Field)", "Santa Barbara Municipal AirportÂ (Santa Barbara Airport)", "Santa Fe Municipal Airport", "Santa Maria Public AirportÂ (Capt G. Allan Hancock Field)", "Sarasota-Bradenton International Airport", "Savannah/Hilton Head International Airport", "Sawyer International Airport", "Seattle-Tacoma International Airport", "Shreveport Regional Airport", "Sioux Falls Regional Airport", "Sioux Gateway Airport", "Sitka Rocky Gutierrez Airport", "Sloulin Field International Airport", "South Bend International AirportÂ (South Bend Regional)", "Southwest Florida International Airport", "Southwest Georgia Regional Airport", "Southwest Oregon Regional AirportÂ (North Bend Municipal)", "Spokane International Airport", "Springfield-Branson National Airport", "St. Cloud Regional Airport", "St. George Regional Airport", "St. Louis International Airport at Lambert Field", "Stewart International Airport", "Syracuse Hancock International Airport", "Tallahassee International Airport", "Tampa International Airport", "Ted Stevens Anchorage International Airport", "Texarkana Regional AirportÂ (Webb Field)", "The Eastern Iowa Airport", "Theodore Francis Green State Airport", "Toledo Express Airport", "Trenton Mercer Airport", "Tri-Cities Airport", "Tri-Cities Regional Airport", "Tucson International Airport", "Tulsa International Airport", "Tyler Pounds Regional Airport", "University of Illinois - Willard Airport", "University Park Airport", "Valdez Airport", "Valdosta Regional Airport", "Valley International Airport", "Waco Regional Airport", "Washington Dulles International Airport", "Waterloo Regional Airport", "Westchester County Airport", "Westerly State Airport", "Wichita Dwight D. Eisenhower National AirportÂ (Wichita Mid-Continent Airport)", "Wichita Falls Municipal Airport/Sheppard AFB", "Wiley Post-Will Rogers Memorial Airport", "Wilkes-Barre/Scranton International Airport", "Will Rogers World Airport", "William P. Hobby Airport", "Wilmington Airport", "Wilmington International Airport", "Worcester Regional Airport", "Wrangell Airport", "Yakutat Airport", "Yampa Valley AirportÂ (Yampa Valley Regional)", "Yeager Airport", "Yellowstone Regional Airport", "Yuma International Airport" }));

        jRadioButton7.setSelected(true);
        jRadioButton7.setText("Mês");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.setText("Trimestre");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jRadioButton9.setSelected(true);
        jRadioButton9.setText("Movimento (partidas + chegadas)");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        jRadioButton10.setText("Número de voos cancelados");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        jRadioButton11.setText("Número de voos desviados");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        jButton8.setText("   Mostrar   ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jLabel21.setText("Dia");

        jLabel22.setText("Mês");

        jLabel23.setText("Dia");

        jLabel24.setText("Mês");

        jLabel32.setText("Cabeçalho");

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Mostrar gráfico");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel20))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(47, 47, 47)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jRadioButton10)
                                                .addComponent(jRadioButton11)
                                                .addComponent(jRadioButton9)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel17)
                                                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel18)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(48, 48, 48)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jRadioButton8)
                                                .addComponent(jRadioButton7)))
                                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                        .addComponent(jLabel19)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel15))
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox2))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)))
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox2)
                        .addComponent(jLabel32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton8)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton11)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("     Aeroportos     ", jPanel2);

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar companhia aérea", "Alaska Airlines Inc.", "American Airlines Inc.", "American Eagle Airlines Inc.", "Atlantic Southeast Airlines", "Delta Airlines Inc.", "Frontier Airlines Inc.", "Hawaiian Airlines Inc.", "JetBlue Airways", "Skywest Airlines Inc.", "Southwest Airlines Co.", "Spirit Airlines", "United Airlines Inc.", "US Airways Inc.", "Virgin America" }));

        jButton9.setText("Mostrar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        jLabel29.setText("Hub no aeroporto: ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1240, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(951, 951, 951))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("     Hubs     ", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1344, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void jTable1HeaderSelecionado(MouseEvent event) {
        int coluna = jTable1.columnAtPoint(event.getPoint());
        List<CompanhiaAereaDTO> listaCompanhiasAereas;
        if (validarData(diaInicio + "/" + mesInicio + "/2015") == true && validarData(diaFinal + "/" + mesFinal + "/2015") == true){
            if (coluna == 0){
                listaCompanhiasAereas = olap.informacaoVoosCompanhiasAereas(diaInicio, mesInicio, diaFinal, mesFinal, "nome asc", "ca.nome asc");
                setTableContent(listaCompanhiasAereas);
            }
            else if (coluna == 1){
                listaCompanhiasAereas = olap.informacaoVoosCompanhiasAereas(diaInicio, mesInicio, diaFinal, mesFinal, "sum(nPartidas) desc", "ca.nome asc");
                setTableContent(listaCompanhiasAereas);
            }
            else if (coluna == 2){
                listaCompanhiasAereas = olap.informacaoVoosCompanhiasAereas(diaInicio, mesInicio, diaFinal, mesFinal, "sum(nVoosCancelados)/sum(nPartidas) asc", "ca.nome asc");
                setTableContent(listaCompanhiasAereas);
                if (mostrarGrafico == true){
                    InterfaceG2 ig2 = new InterfaceG2(1, olap.informacaoVoosCompanhiasAereas(diaInicio, mesInicio, diaFinal, mesFinal, "sum(nPartidas) desc", "ca.nome asc"));
                    ig2.setVisible(true);
                }
            }
            else if (coluna == 3){
                listaCompanhiasAereas = olap.informacaoVoosCompanhiasAereas(diaInicio, mesInicio, diaFinal, mesFinal, "sum(nVoosDesviados)/sum(nChegadas) asc", "ca.nome asc");
                setTableContent(listaCompanhiasAereas);
                if (mostrarGrafico == true){
                    InterfaceG2 ig2 = new InterfaceG2(2, olap.informacaoVoosCompanhiasAereas(diaInicio, mesInicio, diaFinal, mesFinal, "sum(nPartidas) desc", "ca.nome asc"));
                    ig2.setVisible(true);
                }
            }
            else if (coluna == 4){
                listaCompanhiasAereas = olap.informacaoVoosCompanhiasAereas(diaInicio, mesInicio, diaFinal, mesFinal, "sum(nVoosAtrasadosP)/sum(nPartidas) asc", "ca.nome asc");
                setTableContent(listaCompanhiasAereas);
                if (mostrarGrafico == true){
                    InterfaceG1 ig1 = new InterfaceG1(1, olap.informacaoVoosCompanhiasAereas(diaInicio, mesInicio, diaFinal, mesFinal, "nome asc", "ca.nome asc"));
                    ig1.setVisible(true);
                }
            }
            else if (coluna == 5){
                listaCompanhiasAereas = olap.informacaoVoosCompanhiasAereas(diaInicio, mesInicio, diaFinal, mesFinal, "sum(nVoosAtrasadosC)/sum(nChegadas) asc", "ca.nome asc");
                setTableContent(listaCompanhiasAereas);
                if (mostrarGrafico == true){
                    InterfaceG1 ig1 = new InterfaceG1(2, olap.informacaoVoosCompanhiasAereas(diaInicio, mesInicio, diaFinal, mesFinal, "nome asc", "ca.nome asc"));
                    ig1.setVisible(true);
                }
            }
            else if (coluna == 6){
                JOptionPane.showMessageDialog(this, "Funcionalidade não implementada");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "A data selecionada não é válida");
        }
    }
    
    private void jTable2HeaderSelecionado(MouseEvent event) {
        int coluna = jTable2.columnAtPoint(event.getPoint());
         List<AeroportoDTO> listaAeroportos;
        if (validarData(diaInicio2 + "/" + mesInicio2 + "/2015") == true && validarData(diaFinal2 + "/" + mesFinal2 + "/2015") == true){
            if (coluna == 1){
                listaAeroportos = olap.informacaoVoosAeroportos(diaInicio2, mesInicio2, diaFinal2, mesFinal2, "nome asc");
                setTableContent2(listaAeroportos);
            }
            else if (coluna == 2){
                listaAeroportos = olap.informacaoVoosAeroportos(diaInicio2, mesInicio2, diaFinal2, mesFinal2, "sum(nPartidas) desc");
                setTableContent2(listaAeroportos);
            }
            else if (coluna == 3){
                listaAeroportos = olap.informacaoVoosAeroportos(diaInicio2, mesInicio2, diaFinal2, mesFinal2, "sum(nVoosCancelados)/sum(nPartidas) desc");
                setTableContent2(listaAeroportos);
                if (mostrarGrafico2 == true){
                    InterfaceG3 ig3 = new InterfaceG3(1, olap.informacaoVoosAeroportos(diaInicio2, mesInicio2, diaFinal2, mesFinal2, "sum(nPartidas) desc"));
                    ig3.setVisible(true);
                }
            }
            else if (coluna == 4){
                listaAeroportos = olap.informacaoVoosAeroportos(diaInicio2, mesInicio2, diaFinal2, mesFinal2, "sum(nVoosDesviados)/sum(nChegadas) desc");
                setTableContent2(listaAeroportos);
                if (mostrarGrafico2 == true){
                    InterfaceG3 ig3 = new InterfaceG3(2, olap.informacaoVoosAeroportos(diaInicio2, mesInicio2, diaFinal2, mesFinal2, "sum(nPartidas) desc"));
                    ig3.setVisible(true);
                }
            }
            else if (coluna == 5){
                listaAeroportos = olap.informacaoVoosAeroportos(diaInicio2, mesInicio2, diaFinal2, mesFinal2, "sum(somaTaxiOut)/sum(nPartidas) desc");
                setTableContent2(listaAeroportos);
            }
            else if (coluna == 6){
                listaAeroportos = olap.informacaoVoosAeroportos(diaInicio2, mesInicio2, diaFinal2, mesFinal2, "sum(somaTaxiIn)/sum(nChegadas) desc");
                setTableContent2(listaAeroportos);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "A data selecionada não é válida");
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        diaInicio = Integer.parseInt(this.jComboBox1.getSelectedItem().toString());
        mesInicio = Integer.parseInt(this.jComboBox2.getSelectedItem().toString());
        diaFinal = Integer.parseInt(this.jComboBox3.getSelectedItem().toString());
        mesFinal = Integer.parseInt(this.jComboBox4.getSelectedItem().toString());
        if (validarData(diaInicio + "/" + mesInicio + "/2015") == true && validarData(diaFinal + "/" + mesFinal + "/2015") == true){
            List<CompanhiaAereaDTO> listaCompanhiasAereas = olap.informacaoVoosCompanhiasAereas(diaInicio, mesInicio, diaFinal, mesFinal, "nome asc", "ca.nome asc");
            setTableContent(listaCompanhiasAereas);
        }
        else{
            JOptionPane.showMessageDialog(this, "A data selecionada não é válida");
        }       
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        diaInicio2 = Integer.parseInt(this.jComboBox5.getSelectedItem().toString());
        mesInicio2 = Integer.parseInt(this.jComboBox6.getSelectedItem().toString());
        diaFinal2 = Integer.parseInt(this.jComboBox7.getSelectedItem().toString());
        mesFinal2 = Integer.parseInt(this.jComboBox8.getSelectedItem().toString());
        if (validarData(diaInicio2 + "/" + mesInicio2 + "/2015") == true && validarData(diaFinal2 + "/" + mesFinal2 + "/2015") == true){
            List<AeroportoDTO> listaAeroportos = olap.informacaoVoosAeroportos(diaInicio2, mesInicio2, diaFinal2, mesFinal2, "sum(nPartidas) desc");
            setTableContent2(listaAeroportos);
        }
        else{
            JOptionPane.showMessageDialog(this, "A data selecionada não é válida");
        }       
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        this.jRadioButton10.setSelected(false);
        this.jRadioButton11.setSelected(false);
    }//GEN-LAST:event_jRadioButton9ActionPerformed
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int opcao = 1;
        String companhiaAerea, companhiaAerea2, periodo = null;
        List<CompanhiaAereaDTO> listaCompanhiasAereas;
        companhiaAerea = this.jComboBox9.getSelectedItem().toString();
        companhiaAerea2 = this.jComboBox12.getSelectedItem().toString();
        if (companhiaAerea.equals("Selecionar companhia aérea") == false){
            if (this.jRadioButton1.isSelected()) periodo = "mes";
            else if (this.jRadioButton2.isSelected()) periodo = "trimestre";
            if (this.jRadioButton3.isSelected()) opcao = 1;
            else if (this.jRadioButton4.isSelected()) opcao = 2;
            else if (this.jRadioButton5.isSelected()) opcao = 3;
            else if (this.jRadioButton6.isSelected()) opcao = 4;
            else if (this.jRadioButton12.isSelected()) opcao = 5;
            else if (this.jRadioButton13.isSelected()) opcao = 6;
            listaCompanhiasAereas = olap.informacaoVoosCompanhiaAerea(companhiaAerea, periodo);
            DefaultCategoryDataset dataSet = criarConjuntoDados(new DefaultCategoryDataset(), listaCompanhiasAereas, periodo, opcao);
            if (companhiaAerea2.equals("Selecionar companhia aérea")){
                criarGraficoLinhaCompanhiaAerea(dataSet);
            }
            else{
                listaCompanhiasAereas = olap.informacaoVoosCompanhiaAerea(companhiaAerea2, periodo);
                DefaultCategoryDataset dataSet2 = criarConjuntoDados(dataSet, listaCompanhiasAereas, periodo, opcao);
                criarGraficoLinhaCompanhiaAerea(dataSet2);
            }
            jLabel9.setVisible(true); jLabel10.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Erro! Nenhuma companhia aérea foi selecionada");
        }
    }//GEN-LAST:event_jButton7ActionPerformed
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int opcao = 1;
        String aeroporto, periodo = null;
        aeroporto = this.jComboBox10.getSelectedItem().toString();
        if (aeroporto.equals("Selecionar aeroporto") == false){
            if (this.jRadioButton7.isSelected()) periodo = "mes";
            else if (this.jRadioButton8.isSelected()) periodo = "trimestre";
            if (this.jRadioButton9.isSelected()) opcao = 1;
            else if (this.jRadioButton10.isSelected()) opcao = 2;
            else if (this.jRadioButton11.isSelected()) opcao = 3;
            criarGraficoLinhaAeroporto(aeroporto, periodo, opcao);
            jLabel19.setVisible(true); jLabel20.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Erro! Nenhuma aeroporto foi selecionado");
        }
    }//GEN-LAST:event_jButton8ActionPerformed
    
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        this.jRadioButton2.setSelected(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed
    
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        this.jRadioButton1.setSelected(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed
    
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        this.jRadioButton4.setSelected(false);
        this.jRadioButton5.setSelected(false);
        this.jRadioButton6.setSelected(false);
        this.jRadioButton12.setSelected(false);
        this.jRadioButton13.setSelected(false);
    }//GEN-LAST:event_jRadioButton3ActionPerformed
    
    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        this.jRadioButton3.setSelected(false);
        this.jRadioButton5.setSelected(false);
        this.jRadioButton6.setSelected(false);
        this.jRadioButton12.setSelected(false);
        this.jRadioButton13.setSelected(false);
    }//GEN-LAST:event_jRadioButton4ActionPerformed
    
    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        this.jRadioButton3.setSelected(false);
        this.jRadioButton4.setSelected(false);
        this.jRadioButton6.setSelected(false);
        this.jRadioButton12.setSelected(false);
        this.jRadioButton13.setSelected(false);
    }//GEN-LAST:event_jRadioButton5ActionPerformed
    
    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        this.jRadioButton3.setSelected(false);
        this.jRadioButton4.setSelected(false);
        this.jRadioButton5.setSelected(false);
        this.jRadioButton12.setSelected(false);
        this.jRadioButton13.setSelected(false);
    }//GEN-LAST:event_jRadioButton6ActionPerformed
    
    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        this.jRadioButton3.setSelected(false);
        this.jRadioButton4.setSelected(false);
        this.jRadioButton5.setSelected(false);
        this.jRadioButton6.setSelected(false);
        this.jRadioButton13.setSelected(false);
    }//GEN-LAST:event_jRadioButton12ActionPerformed
    
    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        this.jRadioButton8.setSelected(false);
    }//GEN-LAST:event_jRadioButton7ActionPerformed
    
    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        this.jRadioButton7.setSelected(false);
    }//GEN-LAST:event_jRadioButton8ActionPerformed
    
    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        this.jRadioButton9.setSelected(false);
        this.jRadioButton11.setSelected(false);
    }//GEN-LAST:event_jRadioButton10ActionPerformed
    
    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        this.jRadioButton9.setSelected(false);
        this.jRadioButton10.setSelected(false);
    }//GEN-LAST:event_jRadioButton11ActionPerformed
    
    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        this.jRadioButton3.setSelected(false);
        this.jRadioButton4.setSelected(false);
        this.jRadioButton5.setSelected(false);
        this.jRadioButton6.setSelected(false);
        this.jRadioButton12.setSelected(false);
    }//GEN-LAST:event_jRadioButton13ActionPerformed
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String companhiaAerea, aeroporto;
        companhiaAerea = this.jComboBox11.getSelectedItem().toString();
        if (companhiaAerea != "Selecionar companhia aérea"){
            aeroporto = olap.obterHubCompanhiaAerea(companhiaAerea);
            this.jTextField1.setText(aeroporto);
            criarGraficoBarrasHub(companhiaAerea, aeroporto);
        }
        else{
            JOptionPane.showMessageDialog(this, "Erro! Nenhuma companhia aérea foi selecionada");
        }
    }//GEN-LAST:event_jButton9ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(this, "Funcionalidade não implementada");
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JOptionPane.showMessageDialog(this, "Funcionalidade não implementada");
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(this, "Funcionalidade não implementada");
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(this, "Funcionalidade não implementada");
    }//GEN-LAST:event_jButton6ActionPerformed
    
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected() == true){
            mostrarGrafico = true;
        }
        else{
            mostrarGrafico = false;
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected() == true){
            mostrarGrafico2 = true;
        }
        else{
            mostrarGrafico2 = false;
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed
    
    private boolean validarData(String strData) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try{
            dateFormat.parse(strData.trim());
        } catch (ParseException e){
            return false;
        }
        return true;
    }
    
    private void setTableContent(List<CompanhiaAereaDTO> listaCompanhiasAereas) {
        int i;
        DecimalFormat df = new DecimalFormat("0.00");
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        if (model.getRowCount() > 0){    
            removeTableContent();
        }
        for (i = 0; i < listaCompanhiasAereas.size(); i = i + 1){
            CompanhiaAereaDTO ca = listaCompanhiasAereas.get(i);
            model.addRow(new Object[]{ ca.getNome(), ca.getNPartidas(), df.format(ca.getPercentagemNVoosCancelados()) + " %", df.format(ca.getPercentagemNVoosDesviados()) + " %", df.format(ca.getPercentagemVoosAtrasadosP()) + " %     (" + df.format(ca.getTempoMedioAtrasoP()) + " min)", df.format(ca.getPercentagemVoosAtrasadosC()) + " %     (" + df.format(ca.getTempoMedioAtrasoC()) + " min)", df.format(ca.getVelocidadeMediaVoo()) + " km/h" });
        }
    }
    
    private void removeTableContent() {
        int i, tableSize;
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        tableSize = model.getRowCount();
        for (i = tableSize - 1; i >= 0; i = i - 1){
            model.removeRow(i);
        }
    }
    
    private void setTableContent2(List<AeroportoDTO> listaAeroportos) {
        int i;
        DecimalFormat df = new DecimalFormat("0.00");
        DefaultTableModel model = (DefaultTableModel) this.jTable2.getModel();
        if (model.getRowCount() > 0){    
            removeTableContent2();
        }
        for (i = 0; i < 15; i = i + 1){
            AeroportoDTO a = listaAeroportos.get(i);
            model.addRow(new Object[]{(i + 1), a.getNome(), (a.getNPartidas() + a.getNChegadas()), df.format(a.getPercentagemVoosCancelados()) + " %", df.format(a.getPercentagemVoosDesviados()) + " %", a.getTaxiOutMedio() + " min", a.getTaxiInMedio() + " min" });
        }
    }
    
    private void removeTableContent2() {
        int i, tableSize;
        DefaultTableModel model = (DefaultTableModel) this.jTable2.getModel();
        tableSize = model.getRowCount();
        for (i = tableSize - 1; i >= 0; i = i - 1){
            model.removeRow(i);
        }
    }
    
    private void criarGraficoLinhaCompanhiaAerea(DefaultCategoryDataset dataSetCompanhiaAerea) {
        JFreeChart lineChart = ChartFactory.createLineChart("Estatísticas do ano 2015", "Período temporal", "Número", dataSetCompanhiaAerea,PlotOrientation.VERTICAL, true, true, false);
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        ChartPanel myChartPanel = new ChartPanel(lineChart, true);
        myChartPanel.setSize(this.jPanel3.getWidth(), this.jPanel3.getHeight());
        myChartPanel.setVisible(true);
        this.jPanel3.removeAll();
        this.jPanel3.add(myChartPanel);
        this.jPanel3.revalidate();
        this.jPanel3.repaint();
    }
    
    private DefaultCategoryDataset criarConjuntoDados(DefaultCategoryDataset dataset, List<CompanhiaAereaDTO> listaCompanhiasAereas, String periodo, int opcao) {
        int i;
        List<String> meses = Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");
        List<String> trimestres = Arrays.asList("1º Trimestre", "2º Trimestre", "3º Trimestre", "4º Trimestre");
        if (periodo.equals("mes")){
            for (i = 0; i < listaCompanhiasAereas.size(); i = i + 1){
                if (opcao == 1){ dataset.addValue(listaCompanhiasAereas.get(i).getNPartidas(), listaCompanhiasAereas.get(i).getNome(), meses.get(i));}
                else if (opcao == 2) dataset.addValue(listaCompanhiasAereas.get(i).getNVoosCancelados(), listaCompanhiasAereas.get(i).getNome(), meses.get(i));
                else if (opcao == 3) dataset.addValue(listaCompanhiasAereas.get(i).getNVoosDesviados(), listaCompanhiasAereas.get(i).getNome(), meses.get(i));
                else if (opcao == 4) dataset.addValue(listaCompanhiasAereas.get(i).getTempoMedioAtrasoP(), listaCompanhiasAereas.get(i).getNome(), meses.get(i));
                else if (opcao == 5) dataset.addValue(listaCompanhiasAereas.get(i).getTempoMedioAtrasoC(), listaCompanhiasAereas.get(i).getNome(), meses.get(i));
                else if (opcao == 6) dataset.addValue(listaCompanhiasAereas.get(i).getLucroLiquido(), listaCompanhiasAereas.get(i).getNome(), meses.get(i));
            }
        }
        else if (periodo.equals("trimestre")){
            for (i = 0; i < listaCompanhiasAereas.size(); i = i + 1){
                if (opcao == 1) dataset.addValue(listaCompanhiasAereas.get(i).getNPartidas(), listaCompanhiasAereas.get(i).getNome(), trimestres.get(i));
                else if (opcao == 2) dataset.addValue(listaCompanhiasAereas.get(i).getNVoosCancelados(), listaCompanhiasAereas.get(i).getNome(), trimestres.get(i));
                else if (opcao == 3) dataset.addValue(listaCompanhiasAereas.get(i).getNVoosDesviados(), listaCompanhiasAereas.get(i).getNome(), trimestres.get(i));
                else if (opcao == 4) dataset.addValue(listaCompanhiasAereas.get(i).getTempoMedioAtrasoP(), listaCompanhiasAereas.get(i).getNome(), trimestres.get(i));
                else if (opcao == 5) dataset.addValue(listaCompanhiasAereas.get(i).getTempoMedioAtrasoC(), listaCompanhiasAereas.get(i).getNome(), trimestres.get(i));
                else if (opcao == 6) dataset.addValue(listaCompanhiasAereas.get(i).getLucroLiquido(), listaCompanhiasAereas.get(i).getNome(), trimestres.get(i));
            }
        }
        return dataset;
    }
    
    private void criarGraficoLinhaAeroporto(String aeroporto, String periodo, int opcao) {
        JFreeChart lineChart = ChartFactory.createLineChart("Estatísticas do ano 2015", "Período temporal", "Número", criarConjuntoDados2(aeroporto, periodo, opcao),PlotOrientation.VERTICAL, true, true, false);
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560 , 367));
        ChartPanel myChartPanel = new ChartPanel(lineChart, true);
        myChartPanel.setSize(this.jPanel4.getWidth(), this.jPanel4.getHeight());
        myChartPanel.setVisible(true);
        this.jPanel4.removeAll();
        this.jPanel4.add(myChartPanel);
        this.jPanel4.revalidate();
        this.jPanel4.repaint();
    }
    
    private DefaultCategoryDataset criarConjuntoDados2(String aeroporto, String periodo, int opcao) {
        int i, indiceTempo;
        List<String> meses = Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");
        List<String> trimestres = Arrays.asList("1º Trimestre", "2º Trimestre", "3º Trimestre", "4º Trimestre");
        List<AeroportoDTO> listaAeroportos = olap.informacaoVoosAeroporto(aeroporto, periodo);
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (periodo.equals("mes")){
            for (i = 0; i < listaAeroportos.size(); i = i + 1){
                indiceTempo = listaAeroportos.get(i).getPeriodo() - 1;
                if (opcao == 1) dataset.addValue(listaAeroportos.get(i).getNPartidas() + listaAeroportos.get(i).getNChegadas(), aeroporto, meses.get(indiceTempo));
                else if (opcao == 2) dataset.addValue(listaAeroportos.get(i).getNVoosCancelados(), aeroporto, meses.get(indiceTempo));
                else if (opcao == 3) dataset.addValue(listaAeroportos.get(i).getNVoosDesviados(), aeroporto, meses.get(indiceTempo));
            }
        }
        else if (periodo.equals("trimestre")){
            for (i = 0; i < listaAeroportos.size(); i = i + 1){
                indiceTempo = listaAeroportos.get(i).getPeriodo() - 1;
                if (opcao == 1) dataset.addValue(listaAeroportos.get(i).getNPartidas() + listaAeroportos.get(i).getNChegadas(), aeroporto, trimestres.get(indiceTempo));
                else if (opcao == 2) dataset.addValue(listaAeroportos.get(i).getNVoosCancelados(), aeroporto, trimestres.get(indiceTempo));
                else if (opcao == 3) dataset.addValue(listaAeroportos.get(i).getNVoosDesviados(), aeroporto, trimestres.get(indiceTempo));
            }
        }
        return dataset;
    }
    
    private void criarGraficoBarrasHub(String companhiaAerea, String aeroporto) {
        JFreeChart barChart = ChartFactory.createBarChart("Comparação do taxi in e taxi out no hub da companhia aérea", "Companhias aéreas", "Tempo médio (min)", criarConjuntoDados3(companhiaAerea, aeroporto), PlotOrientation.HORIZONTAL, true, true, false);
        ChartPanel myChartPanel = new ChartPanel(barChart, true);
        myChartPanel.setSize(this.jPanel6.getWidth(), this.jPanel6.getHeight());
        myChartPanel.setVisible(true);
        this.jPanel6.removeAll();
        this.jPanel6.add(myChartPanel);
        this.jPanel6.revalidate();
        this.jPanel6.repaint();
    }
    
    private DefaultCategoryDataset criarConjuntoDados3(String companhiaAerea, String aeroporto) {
        int i;
        float taxiOut, taxiIn;
        List<AeroportoDTO> listaCompanhiasAereas = olap.informacaoHub(aeroporto);
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
        for (i = 0; i < listaCompanhiasAereas.size(); i = i + 1){
            taxiOut = listaCompanhiasAereas.get(i).getTaxiOutMedio();
            taxiIn = listaCompanhiasAereas.get(i).getTaxiInMedio();
            if (listaCompanhiasAereas.get(i).getNome().equals(companhiaAerea)){
                taxiOut = listaCompanhiasAereas.get(i).getTaxiOutMedio() * 0.90f;
                taxiIn = listaCompanhiasAereas.get(i).getTaxiInMedio() * 0.90f;
            }
            dataset.addValue(taxiIn, "Taxi in" , listaCompanhiasAereas.get(i).getNome());
            dataset.addValue(taxiOut, "Taxi out" , listaCompanhiasAereas.get(i).getNome());
        }
        return dataset; 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}