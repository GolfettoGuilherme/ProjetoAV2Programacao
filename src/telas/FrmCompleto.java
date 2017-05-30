package telas;

import controladores.AlunoDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Aluno;


public class FrmCompleto extends javax.swing.JFrame {

    public FrmCompleto() {
        initComponents();
        carregarTabela();
        txtRa.setVisible(false);
        btnCancelar.setVisible(false);
        btnExcluir.setVisible(false);
        this.setTitle("Central do Aluno - Ava 2.0");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaAlunos = new javax.swing.JTable();
        txtNome = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtEnd = new javax.swing.JFormattedTextField();
        txtCurso = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtRa = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Endereço:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Telefone:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel7.setText("Dados do Aluno");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Curso:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("CPF:");

        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tbListaAlunos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbListaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "R.A.", "Nome", "CPF", "Endereço", "Curso", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbListaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListaAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbListaAlunos);

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtEnd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCurso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtRa.setText("jLabel2");

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCadastrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnExcluir))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel9)))
                                            .addComponent(jLabel4))
                                        .addGap(6, 6, 6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCurso, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEnd, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)))
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRa)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtRa))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carregarTabela(){
        AlunoDao dao = new AlunoDao();
        List<Aluno> alunos = dao.buscarAlunos();
        DefaultTableModel modeloTable = (DefaultTableModel) tbListaAlunos.getModel();
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }
        for(Aluno a : alunos){
            modeloTable.addRow(new Object[] {
                String.valueOf(a.getRa()),
                    a.getNome(), a.getCpf(),a.getEndereco(), a.getCurso(), a.getTelefone()
            });
        }
    }
    
    private void limparCampos(){
        txtRa.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtCurso.setText("");
        txtEnd.setText("");
        txtTelefone.setText("");
    }
    
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String mensagemRetorno = "";
        Aluno aluno = new Aluno();
        aluno.setNome(txtNome.getText());
        aluno.setCpf(txtCpf.getText());
        aluno.setCurso(txtCurso.getText());
        aluno.setEndereco(txtEnd.getText());
        aluno.setTelefone(txtTelefone.getText());
        int info = 0;
        
        if(btnCadastrar.getText().equals("Cadastrar")){
            AlunoDao dao = new AlunoDao();
            if(dao.inserirAluno(aluno)){
                mensagemRetorno = "Aluno inserido com sucesso";
                carregarTabela();
                limparCampos();
                info = JOptionPane.INFORMATION_MESSAGE;
            } else{
                mensagemRetorno = "Erro ao inserir aluno.";
                info = JOptionPane.ERROR_MESSAGE;
            }
        } else{
            aluno.setRa(Integer.parseInt(txtRa.getText()));
            AlunoDao dao = new AlunoDao();
            if(dao.alterarAluno(aluno)){
                mensagemRetorno = "Aluno alterado com sucesso";
                carregarTabela();
                limparCampos();
                btnCancelar.setVisible(false);
                btnExcluir.setVisible(false);
                info = JOptionPane.INFORMATION_MESSAGE;
            } else{
                mensagemRetorno = "Erro ao alterar aluno";
                info = JOptionPane.ERROR_MESSAGE;
            }
            btnCadastrar.setText("Cadastrar");
        }
        JOptionPane.showMessageDialog(this, mensagemRetorno, "Atenção", info);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tbListaAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListaAlunosMouseClicked
        int linha  = tbListaAlunos.rowAtPoint(evt.getPoint());
        int coluna = tbListaAlunos.columnAtPoint(evt.getPoint());
        txtRa.setText(tbListaAlunos.getModel().getValueAt(linha, 0).toString());
        txtNome.setText(tbListaAlunos.getModel().getValueAt(linha,1).toString());
        txtCpf.setText(tbListaAlunos.getModel().getValueAt(linha,2).toString());
        txtEnd.setText(tbListaAlunos.getModel().getValueAt(linha,3).toString());
        txtCurso.setText(tbListaAlunos.getModel().getValueAt(linha,4).toString());
        txtTelefone.setText(tbListaAlunos.getModel().getValueAt(linha,5).toString());
        btnCadastrar.setText("Alterar");
        btnCancelar.setVisible(true);
        btnExcluir.setVisible(true);
    }//GEN-LAST:event_tbListaAlunosMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        btnCadastrar.setText("Cadastrar");
        btnCancelar.setVisible(false);
        btnExcluir.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int ra = Integer.parseInt(txtRa.getText());
        AlunoDao dao = new AlunoDao();
        String mensagem = "";
        int info = 0;
        if(dao.excluirAluno(ra)){
            mensagem = "Aluno Excluido com Sucesso";
            carregarTabela();
            limparCampos();
            btnCancelar.setVisible(false);
            btnExcluir.setVisible(false);
            info = JOptionPane.INFORMATION_MESSAGE;
        } else{
            mensagem = "Erro ao excluir o aluno";
            info = JOptionPane.ERROR_MESSAGE;
        }
        JOptionPane.showMessageDialog(this, mensagem, "Atenção", info);
        btnCadastrar.setText("Cadastrar");
    }//GEN-LAST:event_btnExcluirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbListaAlunos;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtCurso;
    private javax.swing.JFormattedTextField txtEnd;
    private javax.swing.JFormattedTextField txtNome;
    private javax.swing.JLabel txtRa;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
