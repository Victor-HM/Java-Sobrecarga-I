import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class mainFuncionario {

	public static void main(String[] args) {
		Funcionario pessoa = new Funcionario();
		
		
		
		int answer;
		
		//Fa�a a Inser��o de dados at� que o usuario clique em sim
		
		do {
			//Inser��o de dados
			pessoa.setNome(JOptionPane.showInputDialog("Seu Nome:"));
			pessoa.setCpf(JOptionPane.showInputDialog("Seu CPF:"));
			pessoa.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Seu Salario")));
				
				
			//Confirma��o dos dados
			answer = JOptionPane.showConfirmDialog(
					null,
					"Essas informa��es est�o certas?" + System.lineSeparator() +
					"Nome: " + pessoa.getNome() + System.lineSeparator() + "CPF: " + pessoa.getCpf() + System.lineSeparator() + "Sal�rio: " + pessoa.getSalario() + System.lineSeparator() + "Sal�rio com cifra: " + pessoa.getSalario("R$")
				);
			
		} while(answer == 1);
		
		if(answer == 2) {
			
		}else {
			pessoa.imprimir();
		}
		
	}

}