
public class Cliente {

	private String nome;
	private String dtNascimento;
	private String CPF;
	
	public String getCPF() {//Encapsulamento
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public Cliente(String nome, String dtNascimento, String CPF) {//Construtor
		super();
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.CPF = CPF;
	}

}
