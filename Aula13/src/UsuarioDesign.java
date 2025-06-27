
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioDesign extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UsuarioDesign.class.getName());

    public UsuarioDesign() {
    initComponents();               // Inicializa todos os componentes da interface gráfica (botões, campos, tabela, etc.)
    setLocationRelativeTo(null);    // Centraliza a janela na tela quando for exibida
    carregarTabela();   
    // Chama o método para carregar os dados na tabela a partir do banco de dados

    // Adiciona um "mouse listener" para detectar quando o usuário clica em uma linha da tabela
    listaBancoDados.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int linha = listaBancoDados.getSelectedRow();   // Obtém o índice da linha selecionada na tabela
            if (linha != -1) {                               // Verifica se alguma linha foi realmente selecionada
                // Pega o valor da coluna 0 (id) da linha selecionada e converte para int, armazenando em idSelecionado
                idSelecionado = Integer.parseInt(listaBancoDados.getModel().getValueAt(linha, 0).toString());

                // Preenche o campo de texto 'Nome' com o valor da coluna 1 da linha selecionada
                txbNome.setText(listaBancoDados.getModel().getValueAt(linha, 1).toString());

                // Preenche o campo de texto 'E-mail' com o valor da coluna 2 da linha selecionada
                txbEmail.setText(listaBancoDados.getModel().getValueAt(linha, 2).toString());

                // Preenche o campo de texto 'Telefone' com o valor da coluna 3 da linha selecionada
                txbTelefone.setText(listaBancoDados.getModel().getValueAt(linha, 3).toString());

                // Preenche o campo de texto 'Tipo' com o valor da coluna 4 da linha selecionada (comentário indica correção)
                txbTipo.setText(listaBancoDados.getModel().getValueAt(linha, 4).toString());
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
                u.getIdUsuario(), // Coluna ID (oculta)
                u.getNomeUsuario(), // Nome
                u.getEmailUsuario(), // E-mail
                u.getTelefoneUsuario(), // Telefone
                u.getTipoUsuario() // Tipo
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("E-mail:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Tel.:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Tipo:");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar/Alterar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel1)
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txbTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(txbTelefone)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txbNome)
                                    .addComponent(txbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
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
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
  
        
       
        Usuario usuario = new Usuario();
    usuario.setNomeUsuario(txbNome.getText());
    usuario.setEmailUsuario(txbEmail.getText());
    usuario.setTelefoneUsuario(Integer.parseInt(txbTelefone.getText()));
    usuario.setTipoUsuario(txbTipo.getText());

    UsuarioDao dao = new UsuarioDao();
    boolean sucesso = dao.salvarOuAtualizarUsuario(usuario);

    if (sucesso) {
        JOptionPane.showMessageDialog(this, "Usuário salvo ou atualizado com sucesso!");
        carregarTabela();
        limparCampos();
        idSelecionado = -1;
    } else {
        JOptionPane.showMessageDialog(this, "Erro ao salvar/atualizar o usuário.");
    }
    
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (idSelecionado == -1) {  // Verifica se nenhum usuário foi selecionado na tabela (idSelecionado é -1 quando nada está selecionado)
    JOptionPane.showMessageDialog(this, "Selecione um usuário na tabela primeiro.");  // Exibe uma mensagem solicitando a seleção de um usuário
    return;  // Interrompe a execução do método para não continuar sem um usuário selecionado
}

Usuario usuario = new Usuario();  // Cria um novo objeto Usuario para armazenar os dados atualizados
usuario.setIdUsuario(idSelecionado);  // Define o ID do usuário para o que foi selecionado na tabela
usuario.setNomeUsuario(txbNome.getText());  // Atualiza o nome do usuário com o texto do campo txbNome
usuario.setEmailUsuario(txbEmail.getText());  // Atualiza o email do usuário com o texto do campo txbEmail
usuario.setTelefoneUsuario(Integer.parseInt(txbTelefone.getText()));  // Converte o texto do campo txbTelefone para inteiro e atualiza o telefone do usuário
usuario.setTipoUsuario(txbTipo.getText());  // Atualiza o tipo do usuário com o texto do campo txbTipo

UsuarioDao dao = new UsuarioDao();  // Cria uma instância do DAO para manipular o banco de dados
boolean sucesso = dao.atualizarUsuario(usuario);  // Tenta atualizar o usuário no banco, recebendo true se tiver sucesso

if (sucesso) {  // Se a atualização foi bem-sucedida
    JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso!");  // Exibe mensagem de sucesso
    carregarTabela();  // Atualiza a tabela para mostrar os dados atualizados
    limparCampos();  // Limpa os campos de entrada para evitar confusão
    //idSelecionado = -1;  // (Comentado) Reseta o ID selecionado para -1, ou seja, nenhum selecionado
} else {
    JOptionPane.showMessageDialog(this, "Erro ao atualizar usuário.");  // Exibe mensagem de erro caso falhe a atualização
}
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
     if (idSelecionado == -1) {
        JOptionPane.showMessageDialog(this, "Selecione um usuário na tabela primeiro.");
        return;
    }

    int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este usuário?", "Confirmação", JOptionPane.YES_NO_OPTION);

    if (confirmacao == JOptionPane.YES_OPTION) {
        UsuarioDao dao = new UsuarioDao();
        boolean sucesso = dao.excluirUsuario(idSelecionado);

        if (sucesso) {
            JOptionPane.showMessageDialog(this, "Usuário excluído com sucesso!");
            carregarTabela();
            limparCampos();
            idSelecionado = -1;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir usuário.");
        }
    }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String inputId = JOptionPane.showInputDialog(this, "Digite o ID do usuário que deseja buscar:");
    
    if (inputId != null && !inputId.trim().isEmpty()) {
        try {
            int id = Integer.parseInt(inputId.trim());
            UsuarioDao dao = new UsuarioDao();
            Usuario usuario = dao.buscarUsuarioPorId(id);

            if (usuario != null) {
                idSelecionado = usuario.getIdUsuario(); // Salva o ID para uso posterior (alterar/excluir)
                txbNome.setText(usuario.getNomeUsuario());
                txbEmail.setText(usuario.getEmailUsuario());
                txbTelefone.setText(String.valueOf(usuario.getTelefoneUsuario()));
                txbTipo.setText(usuario.getTipoUsuario());
                JOptionPane.showMessageDialog(this, "Usuário encontrado!");
            } else {
                JOptionPane.showMessageDialog(this, "Usuário com ID " + id + " não encontrado.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID inválido. Digite um número inteiro.");
        }
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new UsuarioDesign().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
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
