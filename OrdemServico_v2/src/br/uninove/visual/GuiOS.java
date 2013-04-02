/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GuiOS.java
 *
 * Created on 29/03/2013, 16:08:30
 */
package br.uninove.visual;

import br.uninove.controle.Util_OS;
import br.uninove.modelo.OrdemServicoBean;
import br.uninove.modelo.OrdemServicoDao;

import java.awt.Dimension;
import java.util.Date;
import java.sql.Timestamp;

import javax.swing.JOptionPane;


/**
 *
 * @author Roberto Silva
 */
public class GuiOS extends javax.swing.JInternalFrame {

    /** Creates new form GuiOS */
    public GuiOS() {
        initComponents();
    }
    
    private String estado;
    private int os_codigo;
    
     public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2,
                (d.height - this.getSize().height) / 2);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblSolicitante = new javax.swing.JLabel();
        lblSetor = new javax.swing.JLabel();
        lblContato = new javax.swing.JLabel();
        lblEquipamento = new javax.swing.JLabel();
        lblSerial = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        tfSolicitante = new javax.swing.JTextField();
        cbSetor = new javax.swing.JComboBox();
        tfContato = new javax.swing.JFormattedTextField();
        cbEquipamento = new javax.swing.JComboBox();
        tfNSerial = new javax.swing.JTextField();
        tfModelo = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        lblObs = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        taObservacao = new javax.swing.JTextArea();
        btnInserir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tfOs_codigo = new javax.swing.JFormattedTextField();
        btnBaixar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setClosable(true);
        setIconifiable(true);
        setTitle("Ordem de Servi�o");

        lblSolicitante.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblSolicitante.setText("Solicitante:");

        lblSetor.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblSetor.setText("Setor:");

        lblContato.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblContato.setText("Contato:");

        lblEquipamento.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblEquipamento.setText("Equipamento:");

        lblSerial.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblSerial.setText("N�.Serial:");

        lblModelo.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblModelo.setText("Modelo:");

        tfSolicitante.setEditable(false);

        cbSetor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<-- Selecione -->", "Vendas", "Marketing", "Publicidade", "Financeiro", "Produ��o", "Engenharia", "Almoxarifado", "Log�stica", "Recurso Humanos", "Outros" }));
        cbSetor.setEnabled(false);

        tfContato.setEditable(false);
        try {
            tfContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbEquipamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<-- Selecione -->", "Teclado", "Mouse", "Monitor", "Caixa de Som", "Web C�mera\t", "Impressora", "Scanner", "Outros" }));
        cbEquipamento.setEnabled(false);

        tfNSerial.setEditable(false);

        tfModelo.setEditable(false);

        lblDescricao.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblDescricao.setText("Descri��o do defeito ou atividade: ");

        lblObs.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblObs.setText("Observa��o:");

        taDescricao.setColumns(20);
        taDescricao.setEditable(false);
        taDescricao.setRows(5);
        jScrollPane2.setViewportView(taDescricao);

        taObservacao.setColumns(20);
        taObservacao.setEditable(false);
        taObservacao.setRows(5);
        jScrollPane3.setViewportView(taObservacao);

        btnInserir.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnInserir.setText("Inserir");
        btnInserir.setNextFocusableComponent(btnEditar);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.setNextFocusableComponent(btnFechar);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnEditar.setText("Editar");
        btnEditar.setNextFocusableComponent(btnSalvar);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setNextFocusableComponent(tfOs_codigo);
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.setNextFocusableComponent(btnCancelar);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar O.S:"));

        tfOs_codigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        btnBaixar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnBaixar.setText("Baixar");
        btnBaixar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaixarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfOs_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBaixar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfOs_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBaixar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSalvar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnFechar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblObs)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblDescricao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                        .addComponent(lblContato, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblEquipamento)
                                        .addComponent(cbEquipamento, 0, 161, Short.MAX_VALUE)
                                        .addComponent(tfContato))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblSerial)
                                        .addComponent(tfNSerial, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                                .addComponent(lblSolicitante, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfSolicitante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblSetor)
                                .addComponent(cbSetor, 0, 207, Short.MAX_VALUE)
                                .addComponent(lblModelo)
                                .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnEditar, btnFechar, btnInserir, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSetor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSolicitante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblContato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipamento)
                            .addComponent(lblSerial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInserir)
                    .addComponent(btnEditar)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar)
                    .addComponent(btnSalvar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnEditar, btnFechar, btnInserir, btnSalvar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        mudarTela("inserir");
    }//GEN-LAST:event_btnInserirActionPerformed
 
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        mudarTela("cancelar");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        mudarTela("editar");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (isFieldsOK()) {
            //Inseri ou atualiza
            if (this.estado.equals("inserir")) {
                
                 try {
                    //cria o objeto O.S   
                    OrdemServicoBean osBean = new OrdemServicoBean();
                    //seta as variaveis do Objeto O.S
                    osBean.setOs_solicitante(tfSolicitante.getText().trim());
                    osBean.setOs_setor((String) cbSetor.getSelectedItem());
                    osBean.setOs_contato((String) tfContato.getText().trim());
                    osBean.setOs_equipamento((String) cbEquipamento.getSelectedItem());
                    osBean.setOs_serial(tfNSerial.getText().trim());
                    osBean.setOs_modelo(tfModelo.getText().trim());
                    osBean.setOs_descricao(taDescricao.getText().trim());
                    osBean.setOs_observacao(taObservacao.getText().trim());
                    osBean.setOs_data_hora(new Timestamp(new Date().getTime()));
                    osBean.setOs_status("PENDENTE");

                    //cria o objeto de controle p/persistencia com Banco de dados
                    OrdemServicoDao dao = new OrdemServicoDao();
                    //inseri 
                    dao.insert(osBean);

                    mudarTela("cancelar");

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,
                            "Ocorreu um erro, causa: " + e.getMessage(),
                            "Ordem de Servi�o",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else if (this.estado.equals("editar")) {
                
                try {
                    //cria o objeto O.S   
                    OrdemServicoBean osBean = new OrdemServicoBean();
                    //seta as variaveis do Objeto O.S
                    osBean.setOs_codigo(os_codigo);
                    osBean.setOs_contato((String) tfContato.getText().trim());
                    osBean.setOs_equipamento((String) cbEquipamento.getSelectedItem());
                    osBean.setOs_serial(tfNSerial.getText().trim());
                    osBean.setOs_modelo(tfModelo.getText().trim());
                    osBean.setOs_descricao(taDescricao.getText().trim());
                    osBean.setOs_observacao(taObservacao.getText().trim());
                    
                    //cria o objeto de controle p/persistencia com Banco de dados
                    OrdemServicoDao dao = new OrdemServicoDao();
                    //atualiza 
                    dao.update(osBean);
                    
                    mudarTela("cancelar");

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,
                            "Ocorreu um erro, causa: " + e.getMessage(),
                            "Ordem de Servi�o",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnBaixarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaixarActionPerformed
        try {
            
            //cria o objeto de controle p/persistencia com Banco de dados
            OrdemServicoDao dao = new OrdemServicoDao();
            OrdemServicoBean osb=dao.select(tfOs_codigo.getText().trim());
            
            if(osb != null){
                
                os_codigo=osb.getOs_codigo();
                tfSolicitante.setText(osb.getOs_solicitante());
                cbSetor.setSelectedItem((String)osb.getOs_setor());
                tfContato.setText(osb.getOs_contato());
                cbEquipamento.setSelectedItem((String)osb.getOs_equipamento());
                tfNSerial.setText(osb.getOs_serial());
                tfModelo.setText(osb.getOs_modelo());
                taDescricao.setText(osb.getOs_descricao());
                taObservacao.setText(osb.getOs_observacao());
                
            }else{
                tfOs_codigo.setValue(null);
                JOptionPane.showMessageDialog(null,
                            "Ordem de servi�o n�o existe, tente novamente.",
                            "Ordem de Servi�o",
                            JOptionPane.INFORMATION_MESSAGE); 
            }
            
        } catch (Exception e) {
                    e.printStackTrace();

                    JOptionPane.showMessageDialog(null,
                            "Ocorreu um erro, causa: " + e.getMessage(),
                            "Ordem de Servi�o",
                            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBaixarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaixar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbEquipamento;
    private javax.swing.JComboBox cbSetor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEquipamento;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblSerial;
    private javax.swing.JLabel lblSetor;
    private javax.swing.JLabel lblSolicitante;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JTextArea taObservacao;
    private javax.swing.JFormattedTextField tfContato;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfNSerial;
    private javax.swing.JFormattedTextField tfOs_codigo;
    private javax.swing.JTextField tfSolicitante;
    // End of variables declaration//GEN-END:variables

     /*
     Verifica campos obrigat�rios
     */
    private boolean isFieldsOK(){
        
        if(tfSolicitante.getText().trim().length() == 0){
             JOptionPane.showMessageDialog(null, 
                       "Ops, preencha o campo solicitante.",
                       "Ordem de Servi�o",
                       JOptionPane.WARNING_MESSAGE);
             tfSolicitante.requestFocus();
            return false;
        }
        
        if(tfContato.getValue() == null){
             JOptionPane.showMessageDialog(null, 
                       "Ops, preencha o campo contato.",
                       "Ordem de Servi�o",
                       JOptionPane.WARNING_MESSAGE);
             tfContato.requestFocus();
            return false;
        }
        
        if(cbSetor.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, 
                       "Ops, selecione um setor.",
                       "Ordem de Servi�o",
                       JOptionPane.WARNING_MESSAGE);
            cbSetor.requestFocus();
            return false;
        }
        
        if(taDescricao.getText().trim().length() == 0){
             JOptionPane.showMessageDialog(null, 
                       "Ops, Preencha o campo descri��o do defeito...",
                       "Ordem de Servi�o",
                       JOptionPane.WARNING_MESSAGE);
             taDescricao.requestFocus();
            return false;
        }
            
        return true;
    }
    
    private void mudarTela(String estado) {
        this.estado=estado;
        
        if(estado.equals("inserir")){
            btnSalvar.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnEditar.setEnabled(false);
            btnInserir.setEnabled(false);
            btnFechar.setEnabled(false);
            Util_OS.limparCampos(this.getContentPane());
            Util_OS.habilitarCampos(this.getContentPane());
            taDescricao.setText("");
            taObservacao.setText("");
            taDescricao.setEditable(true);
            taObservacao.setEditable(true);
            cbSetor.setSelectedIndex(0);
            cbEquipamento.setSelectedIndex(0);
            tfSolicitante.requestFocus();
        }else if(estado.equals("editar")){
            btnSalvar.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnEditar.setEnabled(false);
            btnInserir.setEnabled(false);
            btnFechar.setEnabled(false);
            Util_OS.habilitarCampos(this.getContentPane());
            taDescricao.setEditable(true);
            taObservacao.setEditable(true);
            tfSolicitante.setEditable(false);
            cbSetor.setEnabled(false);
            tfContato.requestFocus();
        }else if(estado.equals("cancelar")){
            btnSalvar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnEditar.setEnabled(true);
            btnInserir.setEnabled(true);
            btnFechar.setEnabled(true);
            Util_OS.limparCampos(this.getContentPane());
            Util_OS.desabilitarCampos(this.getContentPane());
            taDescricao.setText("");
            taObservacao.setText("");
            taDescricao.setEditable(false);
            taObservacao.setEditable(false);
            cbSetor.setSelectedIndex(0);
            cbEquipamento.setSelectedIndex(0);
            os_codigo=-1;
        }
    }
    
    
}