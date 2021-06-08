import java.text.DecimalFormat;

public class Funcionario {
	private String Nome;
	private String Cpf;
	private double Salario;
	private DecimalFormat df = new DecimalFormat("#,###.00");
	
	//GETS
	public String getNome() {
		return this.Nome;
	}
	
	public String getCpf() {
		return this.Cpf;
	}
	
	public double getSalario() {
		return this.Salario;
	}
	
	public String getSalario(String cifra) {
		String Salario = cifra + df.format(this.Salario);
		Salario = Salario.replace('.', '-');
		Salario = Salario.replace(',', '.');
		Salario = Salario.replace('-', ',');
		return Salario;
	}
	
	//SETS
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public void setNome(String Nome, boolean caixaalta) {
		if(caixaalta) {
			this.Nome = Nome.toUpperCase();
		} else {
			this.Nome = Nome.toLowerCase();
		}
	}
	
	public void set(String Nome, boolean caixaalta, String primeiraPalavara) {
		if(caixaalta) {
			Nome = Nome.toUpperCase();
		} else {
			Nome = Nome.toLowerCase();
		}
		
		if(primeiraPalavara == "S") {
			this.Nome = this.Nome = Nome.split(" ") [0];
		}
	}
	
	public void setNome(String Nome, String primeiraPalavra) {
		if(primeiraPalavra == "S") {
			this.Nome = this.Nome = Nome.split(" ") [0];
		}
	}
	
	public void setCpf(String Cpf) {
		this.Cpf = Cpf;
	}
	
	public void setSalario(double Salario) {
		this.Salario = Salario;
	}
	
	public void imprimir() {
		System.out.println("Seu nome: " + this.getNome());
		System.out.println("Seu CPF: " + this.getCpf());
		System.out.println("Seu Salário: " + this.getSalario());
		System.out.println("Seu salário com cifra: " + this.getSalario("R$"));
	}
	
}
