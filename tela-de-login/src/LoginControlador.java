package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;

	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("carlosvinicios@id.uff.br");
		boolean senhaValida = campoSenha.getText().equals("aluno123");
		
		if(emailValido && senhaValida) {
			Notifications.create()
				.position(Pos.TOP_RIGHT)
				.title("Login FXML")
				.text("Login efetuado com sucesso!")
				.showInformation();
		} else {
			Notifications.create()
				.position(Pos.TOP_RIGHT)
				.title("Login FXML")
				.text("Usuário e Senha inválidos!")
				.showError();
		}
	}
}