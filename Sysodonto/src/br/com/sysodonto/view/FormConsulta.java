/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.view;

import br.com.sysodonto.business.BConsulta;
import br.com.sysodonto.business.BDentista;
import br.com.sysodonto.business.BPaciente;
import br.com.sysodonto.entity.Consulta;
import br.com.sysodonto.entity.Dentista;
import br.com.sysodonto.entity.Paciente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samsung
 */
public class FormConsulta extends javax.swing.JInternalFrame {
    
    
    private JTable tabela = null;
    private DefaultTableModel modelo = new DefaultTableModel();
    
    /**
     * Creates new form FormPaciente
     */
    public FormConsulta(){
        initComponents();
        preparaComboBox();
        listarConsultas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadastro = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        txtData = new com.toedter.calendar.JDateChooser();
        lblHora = new javax.swing.JLabel();
        cbHora = new javax.swing.JComboBox<>();
        lblPaciente = new javax.swing.JLabel();
        cbPaciente = new javax.swing.JComboBox<>();
        lblDentista = new javax.swing.JLabel();
        cbDentista = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        barraRolagem = new javax.swing.JScrollPane();
        calAgenda = new com.toedter.calendar.JCalendar();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Menu Consulta");
        setPreferredSize(new java.awt.Dimension(1145, 720));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        painelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblData.setText("Data:");

        lblHora.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblHora.setText("Hora:");

        cbHora.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00" }));

        lblPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPaciente.setText("Paciente:");

        cbPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblDentista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDentista.setText("Dentista:");

        cbDentista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDentistaActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mais.png"))); // NOI18N
        btnCadastrar.setText("  Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addComponent(lblData)
                        .addGap(18, 18, 18)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lblHora)
                        .addGap(18, 18, 18)
                        .addComponent(cbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPaciente)
                        .addGap(18, 18, 18)
                        .addComponent(cbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDentista)
                        .addGap(18, 18, 18)
                        .addComponent(cbDentista, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDentista)
                        .addComponent(cbDentista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHora)
                        .addComponent(cbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPaciente))
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        barraRolagem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agenda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        calAgenda.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calAgendaPropertyChange(evt);
            }
        });

        lblId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblId.setText("ID da Consulta:");

        txtId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barraRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblId)
                                .addGap(18, 18, 18)
                                .addComponent(txtId))
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraRolagem)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 165, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        this.setVisible(false);
        
        barraRolagem.getViewport().remove(tabela);
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        BPaciente bp = new BPaciente();
        BDentista bd = new BDentista();
        
        Paciente paciente = bp.getPacienteUnico(String.valueOf(cbPaciente.getSelectedItem()));
        Dentista dentista = bd.getDentistaUnico(String.valueOf(cbDentista.getSelectedItem()));
        
        Consulta consulta = new Consulta(txtData.getCalendar(), String.valueOf(cbHora.getSelectedItem()), paciente, dentista);
        
        if(new BConsulta().cadastraConsulta(consulta)){
            JOptionPane.showMessageDialog(null, "Consulta Cadastrada com Sucesso!");
            barraRolagem.getViewport().remove(tabela);
        
            listarConsultas();
        } else{
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Consulta!");
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    protected void listarConsultas(){
        
        preparaTabela();
        tabela.setModel(modelo);
        
        List<Consulta> lista = new BConsulta().getConsultas(calAgenda.getCalendar());
        ConsultaTableModel ctm = new ConsultaTableModel(lista);
        tabela.setModel(ctm);
    }
    
    private void cbDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDentistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDentistaActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        try {
            Consulta consulta = new BConsulta().getConsulta(Integer.parseInt(txtId.getText()));
            FormAtualizarConsulta fac = new FormAtualizarConsulta(consulta);
            fac.setLocationRelativeTo(null);
            fac.setVisible(true);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "ID inexistente!");
        }
        
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void calAgendaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calAgendaPropertyChange
        barraRolagem.getViewport().remove(tabela);
        
        listarConsultas();
    }//GEN-LAST:event_calAgendaPropertyChange
    
    protected void preparaComboBox() {
        //limpando
        cbDentista.removeAllItems();
        cbPaciente.removeAllItems();
        
        
        //criando listas para add nos comboBox
        List<Paciente> pacientes = new ArrayList<>();
        List<Dentista> dentistas = new ArrayList<>();
        
        pacientes = buscarPacientes();
        dentistas = buscarDentistas();
        
        for (Paciente paciente : pacientes) {
            cbPaciente.addItem(paciente.getNome());
        }
        
        for (Dentista dentista : dentistas) {
            cbDentista.addItem(dentista.getNome());
        }
    }
    
    private List<Paciente> buscarPacientes(){
        BPaciente bp = new BPaciente();
        
        List<Paciente> pacientes = new ArrayList<>();
        pacientes = bp.getPacientesOrder();
        
        return pacientes;
    }
    
    private List<Dentista> buscarDentistas(){
        BDentista bd = new BDentista();
        List<Dentista> dentistas = new ArrayList<>();
        dentistas = bd.getDentistasOrder();
        
        return dentistas;
    }
    
    private void preparaTabela() {
        tabela = new JTable();
        barraRolagem.getViewport().add(tabela);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane barraRolagem;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private com.toedter.calendar.JCalendar calAgenda;
    private javax.swing.JComboBox<String> cbDentista;
    private javax.swing.JComboBox<String> cbHora;
    private javax.swing.JComboBox<String> cbPaciente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDentista;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JPanel painelCadastro;
    private com.toedter.calendar.JDateChooser txtData;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables

    
}