package questao2;

import javax.swing.JOptionPane;


public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String login = JOptionPane.showInputDialog("DIGITE SEU LOGIN");
		String senha = JOptionPane.showInputDialog("DIGITE SUA SENHA");

		JOptionPane.showMessageDialog(null, verificaSenha(login, senha));

	}

	public static String verificaSenha(String login, String senha) {

		if (senha.length() > 5 && validar(senha)) {

			return "Senha Aceita Para o Usuário: " + login;

		}
		return "Verifique se a senha Possui no mínimo 6 caracteres.\r\n" + "Contém no mínimo 1 digito.\r\n"
				+ "Contém no mínimo 1 letra em minúsculo.\r\n" + "Contém no mínimo 1 letra em maiúsculo.\r\n"
				+ "Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+ \r\n"
				+ "para o usuário: " + login;
	}

	public static boolean validar(String senha) {
		if (senha.length() < 6)
			return false;

		boolean achouNumero = false;
		boolean achouMaiuscula = false;
		boolean achouMinuscula = false;
		boolean achouSimbolo = false;

		for (char c : senha.toCharArray()) {
			if (c >= '0' && c <= '9') {
				achouNumero = true;
			} else if (c >= 'A' && c <= 'Z') {
				achouMaiuscula = true;
			} else if (c >= 'a' && c <= 'z') {
				achouMinuscula = true;
			} else {
				achouSimbolo = true;
			}
		}
		return achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo;
	}

}
