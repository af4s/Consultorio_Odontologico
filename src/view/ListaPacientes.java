/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.TMPacientes;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Paciente;

/**
 *
 * @author ch
 */
public class ListaPacientes extends javax.swing.JDialog {

    private TMPacientes tmPacientes;
    private Paciente pacienteSelecionado;

    /**
     * Creates new form TesteLista
     *
     * @param parent
     * @param modal
     */
    public ListaPacientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();

        this.tmPacientes = new TMPacientes();
        this.tblPacientes.setModel(tmPacientes);
        this.carregarArquivo("src/csv/lst_pacientes.csv");
        this.tmPacientes.fireTableDataChanged();
        this.pacienteSelecionado = new Paciente();

    }

    /**
     * @return the tmPacientes
     */
    public TMPacientes getTmPacientes() {
        return tmPacientes;
    }

    /**
     * @param tmPacientes the tmPacientes to set
     */
    public void setTmPacientes(TMPacientes tmPacientes) {
        this.tmPacientes = tmPacientes;
    }

    /**
     * @return the pacienteSelecionado
     */
    public Paciente getPacienteSelecionado() {
        return pacienteSelecionado;
    }

    /**
     * @param pacienteSelecionado the pacienteSelecionado to set
     */
    public void setPacienteSelecionado(Paciente pacienteSelecionado) {
        this.pacienteSelecionado = pacienteSelecionado;
    }

    public final void carregarArquivo(String caminho) {
        FileReader arquivo;
        try {
            arquivo = new FileReader(caminho);
            Scanner ler = new Scanner(arquivo);
            ler.useDelimiter("\n");
            ler.next();

            while (ler.hasNext()) {
                String linhaCsv = ler.next();
                Paciente p = new Paciente();
                p.setInfoCSV(linhaCsv);
                this.getTmPacientes().addLinha(p);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrCadPaciente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERRO! Arquivo não foi carregado.");
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
        tblPacientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Pacientes Cadastrados");
        setModal(true);

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPacientes.setToolTipText("Clique duas vezes no paciente desejado para selecioná-lo!");
        tblPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPacientesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblPacientes);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA DE PACIENTES CADASTRADOS NO SISTEMA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblPacientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPacientesMouseReleased

        if (evt.getClickCount() == 2) {
            int linha = this.tblPacientes.getSelectedRow();
            this.pacienteSelecionado = this.getTmPacientes().getLstPacientes().get(linha);
//            System.out.println(this.pacienteSelecionado.getNome());
            dispose();
        }
    }//GEN-LAST:event_tblPacientesMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPacientes;
    // End of variables declaration//GEN-END:variables
}
