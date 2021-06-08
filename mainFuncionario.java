import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class mainFuncionario {

	public static void main(String[] args) {
		Funcionario pessoa = new Funcionario();
		
		
		
		int answer;
		
		//Faça a Inserção de dados até que o usuario clique em sim
		
		do {
			//Inserção de dados
			pessoa.setNome(JOptionPane.showInputDialog("Seu Nome:"));
			pessoa.setCpf(JOptionPane.showInputDialog("Seu CPF:"));
			pessoa.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Seu Salario")));
				
				
			//Confirmação dos dados
			answer = JOptionPane.showConfirmDialog(
					null,
					"Essas informações estão certas?" + System.lineSeparator() +
					"Nome: " + pessoa.getNome() + System.lineSeparator() + "CPF: " + pessoa.getCpf() + System.lineSeparator() + "Salário: " + pessoa.getSalario() + System.lineSeparator() + "Salário com cifra: " + pessoa.getSalario("R$")
				);
			
		} while(answer == 1);
		
		if(answer == 2) {
			
		}else {
			pessoa.imprimir();
		}
		
	}

}