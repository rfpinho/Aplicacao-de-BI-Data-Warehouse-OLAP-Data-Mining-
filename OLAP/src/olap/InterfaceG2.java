package olap;

import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class InterfaceG2 extends javax.swing.JFrame {
    private int opcao;
    private List<CompanhiaAereaDTO> listaCompanhiasAereas;
    
    public InterfaceG2(int opcao, List<CompanhiaAereaDTO> listaCompanhiasAereas) {
        this.opcao = opcao;
        this.listaCompanhiasAereas = listaCompanhiasAereas;
        initComponents();
        criarGraficoBarras();
        criarGraficoLinhas();
    }
    
    private void criarGraficoBarras() {
        JFreeChart barChart = ChartFactory.createBarChart("Número de voos por companhia aérea", "Companhias aéreas", "", criarConjuntoDados(), PlotOrientation.HORIZONTAL, true, true, false);
        ChartPanel myChartPanel = new ChartPanel(barChart, true);
        myChartPanel.setSize(this.jPanel1.getWidth(), this.jPanel1.getHeight());
        myChartPanel.setVisible(true);
        this.jPanel1.removeAll();
        this.jPanel1.add(myChartPanel);
        this.jPanel1.revalidate();
        this.jPanel1.repaint();
    }
    
    private DefaultCategoryDataset criarConjuntoDados() {
        int i;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
        for (i = 0; i < listaCompanhiasAereas.size(); i = i + 1){
            dataset.addValue(listaCompanhiasAereas.get(i).getNPartidas(), "Número de voos", listaCompanhiasAereas.get(i).getNome());
        }
        return dataset; 
    }
    
    private void criarGraficoLinhas() {
        String str;
        if (opcao == 1) str = "cancelados";
        else str = "desviados";
        JFreeChart lineChart = ChartFactory.createLineChart("% Voos " + str + " por companhia aérea", "Companhias aéreas", "", criarConjuntoDados2(),PlotOrientation.HORIZONTAL, true, true, false);
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560 , 367));
        ChartPanel myChartPanel = new ChartPanel(lineChart, true);
        myChartPanel.setSize(this.jPanel2.getWidth(), this.jPanel2.getHeight());
        myChartPanel.setVisible(true);
        this.jPanel2.removeAll();
        this.jPanel2.add(myChartPanel);
        this.jPanel2.revalidate();
        this.jPanel2.repaint();
    }
    
    private DefaultCategoryDataset criarConjuntoDados2() {
        int i;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (i = 0; i < listaCompanhiasAereas.size(); i = i + 1){
            if (opcao == 1){
                dataset.addValue(listaCompanhiasAereas.get(i).getPercentagemNVoosCancelados(), "% Voos cancelados", "" + (i + 1));
            }
            else{
                dataset.addValue(listaCompanhiasAereas.get(i).getPercentagemNVoosDesviados(), "% Voos desviados", "" + (i + 1));
            }
        }
        return dataset;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}