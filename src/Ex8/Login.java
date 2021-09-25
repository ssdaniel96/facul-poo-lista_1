package Ex8;

import javax.swing.JOptionPane;
/*Faça um algoritmo para ler um número que é um código de usuário. Caso este código
seja diferente de um código armazenado internamente no algoritmo (igual a 1234)
deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja correto,
deve ser lido outro valor que é a senha. Se esta senha estiver incorreta (a certa é
9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja correta,
deve ser mostrada a mensagem ‘Acesso permitido*/
public class Login{
    public static void main(String[] args) {
        int codReference = 1234;
        int senhaReferencia = 9999;

        int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código de usuário, numérico"));
        if (cod != codReference){
            JOptionPane.showMessageDialog(null, "Usuário inválido");
            return;
        }

        int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha de usuário, numérica"));
        if (senha != senhaReferencia){
            JOptionPane.showMessageDialog(null, "Senha inválida");
            return;
        }

        JOptionPane.showMessageDialog(null, "Acesso permitido");

    }
}