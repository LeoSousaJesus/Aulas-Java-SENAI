
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

                    Usuario usuarioSelecionado = new Usuario();
                    usuarioSelecionado.setIdUsuario(Integer.parseInt(listaBancoDados.getModel().getValueAt(linha, 0).toString()));
                    usuarioSelecionado.setNomeUsuario(listaBancoDados.getModel().getValueAt(linha, 1).toString());
                    usuarioSelecionado.setEmailUsuario(listaBancoDados.getModel().getValueAt(linha, 2).toString());
                    usuarioSelecionado.setTelefoneUsuario(Integer.parseInt(listaBancoDados.getModel().getValueAt(linha, 3).toString()));
                    usuarioSelecionado.setTipoUsuario(listaBancoDados.getModel().getValueAt(linha, 4).toString());

                    idSelecionado = usuarioSelecionado.getIdUsuario();
                    preencherCampos(usuarioSelecionado);
                }
            }
        });
    }
    private int idSelecionado = -1;
    private final UsuarioDao dao = new UsuarioDao();

    private void ocultarColunaId() {
        ocultarColunaId();
    }

    public void carregarTabela() {
    List<Usuario> lista = dao.listarUsuarios();

    // Modelo da tabela que não permite edição
    DefaultTableModel modelo = new DefaultTableModel(
        new String[]{"id", "Nome", "E-mail", "Telefone", "Tipo"}, 0
    ) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Nenhuma célula será editável
        }
    };

    // Preenche o modelo com os dados
    for (Usuario u : lista) {
        Object[] linha = new Object[]{
            u.getIdUsuario(),
            u.getNomeUsuario(),
            u.getEmailUsuario(),
            u.getTelefoneUsuario(),
            u.getTipoUsuario()
        };
        modelo.addRow(linha);
    }

    // Aplica o modelo à tabela
    listaBancoDados.setModel(modelo);

    // Oculta a coluna ID
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
        btnSalvar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Cadastro");

        listaBancoDados.setAutoCreateRowSorter(true);
        listaBancoDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
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
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovo)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(30, 30, 30)
                        .addComponent(btnExcluir)
                        .addGap(26, 26, 26)
                        .addComponent(btnSalvar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        UsuarioDao dao = new UsuarioDao();
        Usuario usuario = new Usuario();

        usuario.setNomeUsuario(txbNome.getText());
        usuario.setEmailUsuario(txbEmail.getText());

        try {
            usuario.setTelefoneUsuario(Integer.parseInt(txbTelefone.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Telefone deve ser um número.");
            return;
        }

        usuario.setTipoUsuario(txbTipo.getText());

        boolean isNovoCadastro = (idSelecionado == -1);

        // Se for edição, é necessário definir o ID
        if (!isNovoCadastro) {
            usuario.setIdUsuario(idSelecionado);
        }

        boolean sucesso = dao.salvarOuAtualizarUsuario(usuario, isNovoCadastro);

        if (sucesso) {
            JOptionPane.showMessageDialog(this, isNovoCadastro ? "Usuário cadastrado com sucesso!" : "Usuário atualizado com sucesso!");
            carregarTabela();
            limparCampos();
            idSelecionado = -1;
        } else {
            JOptionPane.showMessageDialog(this, "Erro: este e-mail já está cadastrado.");
        }


    }//GEN-LAST:event_btnSalvarActionPerformed


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
                    preencherCampos(usuario);
                } else {
                    JOptionPane.showMessageDialog(this, "Usuário com ID " + id + " não encontrado.");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "ID inválido. Digite um número inteiro.");
            }
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void preencherCampos(Usuario usuario) {
        txbNome.setText(usuario.getNomeUsuario());
        txbEmail.setText(usuario.getEmailUsuario());
        txbTelefone.setText(String.valueOf(usuario.getTelefoneUsuario()));
        txbTipo.setText(usuario.getTipoUsuario());
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new UsuarioDesign().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
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
