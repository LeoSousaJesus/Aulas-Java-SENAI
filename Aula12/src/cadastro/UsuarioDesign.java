package cadastro;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioDesign extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UsuarioDesign.class.getName());

    public UsuarioDesign() {
        initComponents();
        setLocationRelativeTo(null); 
        carregarTabela(); 
        
        
        
        listaBancoDados.addMouseListener(new java.awt.event.MouseAdapter() {
     public void mouseClicked(java.awt.event.MouseEvent evt) {
        int linha = listaBancoDados.getSelectedRow();
        if (linha != -1) {
            idSelecionado = Integer.parseInt(listaBancoDados.getModel().getValueAt(linha, 0).toString());
            txbNome.setText(listaBancoDados.getModel().getValueAt(linha, 1).toString());
            txbEmail.setText(listaBancoDados.getModel().getValueAt(linha, 2).toString());
            txbTelefone.setText(listaBancoDados.getModel().getValueAt(linha, 3).toString());
            txbTipo.setText(listaBancoDados.getModel().getValueAt(linha, 4).toString()); // Corrigido
        }
    }
});
    }
    
    private int idSelecionado = -1;
    
    
    
    public void carregarTabela() {
    // Cria uma instância do DAO para buscar os usuários
    UsuarioDao dao = new UsuarioDao();
    
    // Pega a lista de usuários do banco, ordenada por nome
    List<Usuario> lista = dao.listarUsuarios();

    // Pega o modelo da tabela para manipular as linhas
    DefaultTableModel modelo = (DefaultTableModel) listaBancoDados.getModel();
    
    // Limpa todas as linhas existentes para evitar duplicação
    modelo.setRowCount(0);

    // Adiciona os usuários na tabela, linha a linha
    for (Usuario u : lista) {
        Object[] linha = new Object[]{
            u.getId(),        // Coluna ID (oculta)
            u.getNome(),      // Nome
            u.getEmail(),     // E-mail
            u.getTelefone(),  // Telefone
            u.getTipo_usuario()       // Tipo
        };
        modelo.addRow(linha);
    }

    // Oculta a coluna ID para não aparecer na tabela
    if (listaBancoDados.getColumnModel().getColumnCount() > 0) {
        listaBancoDados.getColumnModel().getColumn(0).setMinWidth(0);
        listaBancoDados.getColumnModel().getColumn(0).setMaxWidth(0);
        listaBancoDados.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
}

    
    
    private void limparCampos() {
        txbNome.setText("");
        txbEmail.setText("");
        txbTelefone.setText("");
        txbTipo.setText("");
    }    
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaBancoDados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txbNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txbEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txbTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txbTipo = new javax.swing.JTextField();
        btnListar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Cadastro");

        listaBancoDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listaBancoDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Nome:", "E-mail:", "Telefone:", "Tipo:"
            }
        ));
        jScrollPane1.setViewportView(listaBancoDados);
        listaBancoDados.getAccessibleContext().setAccessibleName("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Nome:");

        txbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("E-mail:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Tel.:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Tipo:");

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txbTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                .addComponent(txbTelefone)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txbNome, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                .addComponent(txbEmail))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnSalvar)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnListar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txbNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    Usuario usuarios = new Usuario();
    usuarios.setNome(txbNome.getText());
    usuarios.setEmail(txbEmail.getText());
    usuarios.setTelefone(txbTelefone.getText());
    usuarios.setTipo_usuario(txbTipo.getText());

    UsuarioDao dao = new UsuarioDao();
    boolean sucesso = dao.salvarUsuario(usuarios);

    if (sucesso) {
        JOptionPane.showMessageDialog(this, "Usuário salvo com sucesso!");
        carregarTabela();  // Atualiza a tabela para mostrar o novo usuário
        limparCampos();
    } else {
        JOptionPane.showMessageDialog(this, "Erro ao salvar usuário.");
    }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        carregarTabela();        
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (idSelecionado == -1) {
        JOptionPane.showMessageDialog(this, "Selecione um usuário na tabela primeiro.");
        return;
    }

    Usuario usuarios = new Usuario();
    usuarios.setId(idSelecionado);
    usuarios.setNome(txbNome.getText());
    usuarios.setEmail(txbEmail.getText());
    usuarios.setTelefone(txbTelefone.getText());
    usuarios.setTipo_usuario(txbTipo.getText());

    UsuarioDao dao = new UsuarioDao();
    boolean sucesso = dao.atualizarUsuario(usuarios);

    if (sucesso) {
        JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso!");
        carregarTabela();
        limparCampos();
        //idSelecionado = -1;
    } else {
        JOptionPane.showMessageDialog(this, "Erro ao atualizar usuário.");
    }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbNomeActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new UsuarioDesign().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaBancoDados;
    private javax.swing.JTextField txbEmail;
    private javax.swing.JTextField txbNome;
    private javax.swing.JTextField txbTelefone;
    private javax.swing.JTextField txbTipo;
    // End of variables declaration//GEN-END:variables
}
