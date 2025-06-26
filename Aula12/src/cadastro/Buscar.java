// Buscar.java
package cadastro;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

/**
 * Uma caixa de diálogo para solicitar um ID de usuário para a busca.
 * Ela estende JDialog em vez de JFrame porque é uma janela secundária,
 * que depende de uma janela principal.
 */
public class Buscar extends JDialog {

    // Componentes da interface gráfica.
    private final JLabel labelId = new JLabel("Digite o ID do usuário:");
    private final JTextField campoId = new JTextField(10); // Campo de texto com 10 colunas de largura.
    private final JButton botaoBuscar = new JButton("Buscar");

    // Variável para armazenar o usuário que foi encontrado no banco.
    private Usuario usuarioEncontrado = null;

    /**
     * Construtor da caixa de diálogo.
     * @param parent A janela "pai" da qual este diálogo é chamado (no seu caso, UsuarioDesign).
     * @param modal Se 'true', a janela principal fica bloqueada até que este diálogo seja fechado.
     */
    public Buscar(java.awt.Frame parent, boolean modal) {
        super(parent, modal); // Chama o construtor da classe JDialog.
        setTitle("Buscar Usuário por ID"); // Define o título da janela.
        setLayout(new FlowLayout()); // Define um layout simples para os componentes.
        setSize(300, 100); // Define o tamanho da janela.
        setLocationRelativeTo(parent); // Centraliza a janela em relação à janela pai.

        // Adiciona os componentes à janela.
        add(labelId);
        add(campoId);
        add(botaoBuscar);

        // Adiciona um "ouvinte de ação" para o botão Buscar.
        botaoBuscar.addActionListener((ActionEvent e) -> {
            buscarUsuario();
        });
    }

    /**
     * Lógica que é executada quando o botão "Buscar" é clicado.
     */
    private void buscarUsuario() {
        try {
            // Pega o texto do campo e converte para um número inteiro.
            int id = Integer.parseInt(campoId.getText());

            // Cria uma instância do DAO para acessar o banco.
            UsuarioDao dao = new UsuarioDao();

            // Chama o método de busca e armazena o resultado na nossa variável.
            this.usuarioEncontrado = dao.buscarPorId(id);

            // Fecha a caixa de diálogo.
            dispose();

        } catch (NumberFormatException ex) {
            // Se o usuário digitar algo que não é um número, mostra uma mensagem de erro.
            JOptionPane.showMessageDialog(this, "Por favor, digite um ID válido (apenas números).", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método público que permite à janela principal pegar o resultado da busca.
     * @return O Usuario encontrado, ou null se nada foi encontrado.
     */
    public Usuario getUsuarioEncontrado() {
        return this.usuarioEncontrado;
    }
}
