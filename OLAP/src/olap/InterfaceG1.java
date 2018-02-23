package olap;

import java.awt.Color;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class InterfaceG1 extends javax.swing.JFrame {
    private List<CompanhiaAereaDTO> listaCompanhiasAereas;
    
    public InterfaceG1(int opcao, List<CompanhiaAereaDTO> listaCompanhiasAereas) {
        this.listaCompanhiasAereas = listaCompanhiasAereas;
        initComponents();
        if (opcao == 1) criarGraficoDistribuicaoAtraso();
        else criarGraficoAtrasosPartidaChegada();
    }
    
    private void criarGraficoDistribuicaoAtraso() {
        JFreeChart stackedBarChart = ChartFactory.createStackedBarChart("Repartição do tempo de atraso à partida por companhia aérea", "Companhias aéreas", "Percentagem", criarConjuntoDados(), PlotOrientation.HORIZONTAL, true, true, false);
        CategoryPlot plot = stackedBarChart.getCategoryPlot();
        plot.getRenderer().setSeriesPaint(0, new Color(65, 105, 225));
        plot.getRenderer().setSeriesPaint(1, new Color(30, 144, 225));
        plot.getRenderer().setSeriesPaint(2, new Color(0, 191, 225));
        plot.getRenderer().setSeriesPaint(3, new Color(135, 206, 250));
        
        ChartPanel myChartPanel = new ChartPanel(stackedBarChart, true);
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
            dataset.addValue(listaCompanhiasAereas.get(i).getPercentagemAtrasoVerificacoesTecnicas(), "Late aircraft delay", listaCompanhiasAereas.get(i).getNome());
            dataset.addValue(listaCompanhiasAereas.get(i).getPercentagemAtrasoCompanhiaAerea(), "Airlines delay", listaCompanhiasAereas.get(i).getNome());
            dataset.addValue(listaCompanhiasAereas.get(i).getPercentagemAtrasoSistemaAereo(), "Air system delay", listaCompanhiasAereas.get(i).getNome());
            dataset.addValue(listaCompanhiasAereas.get(i).getPercentagemAtrasoCondicoesMeterologicas(), "Weather delay", listaCompanhiasAereas.get(i).getNome());
        }
        return dataset; 
    }
    
    private void criarGraficoAtrasosPartidaChegada() {
        JFreeChart chart = ChartFactory.createStackedBarChart("Percentagem de voos atrasos à partida e à chegada por companhia aérea", "Companhias aéreas", "", criarConjuntoDados2(), PlotOrientation.HORIZONTAL, true, true, false);      
        ChartPanel myChartPanel = new ChartPanel(chart, true);
        myChartPanel.setSize(this.jPanel1.getWidth(), this.jPanel1.getHeight());
        myChartPanel.setVisible(true);
        this.jPanel1.removeAll();
        this.jPanel1.add(myChartPanel);
        this.jPanel1.revalidate();
        this.jPanel1.repaint();
    }
    
    private DefaultCategoryDataset criarConjuntoDados2() {
        int i;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (i = 0; i < listaCompanhiasAereas.size(); i = i + 1){
            dataset.addValue(-listaCompanhiasAereas.get(i).getPercentagemVoosAtrasadosP(), "% Voos atrasos à partida", listaCompanhiasAereas.get(i).getNome());
            dataset.addValue(listaCompanhiasAereas.get(i).getPercentagemVoosAtrasadosC(), "% Voos atrasos à chegada", listaCompanhiasAereas.get(i).getNome());
        }
        return dataset; 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}