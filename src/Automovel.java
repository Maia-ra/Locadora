
public class Automovel {

	private String placa;
	private String chassi;
	private int anoFabricacao;
	private String modelo;
	private String cor;
	private double valorDiaria;
	
	
	
	public Automovel(String placa, String chassi, int anoFabricacao, String modelo, String cor, double valorDiaria) {
		super();//Construtor para ser utilizado na classe principal
		this.placa = placa;
		this.chassi = chassi;
		this.anoFabricacao = anoFabricacao;
		this.modelo = modelo;
		this.cor = cor;
		this.valorDiaria = valorDiaria;
	}
	
	
	
	public String toString() {
		return "Placa:" + getPlaca() + ", Chassi:" + getChassi() + ", Ano de Fabricação:"
				+ getAnoFabricacao() + ", Modelo:" + getModelo() + ", Cor:" + getCor() + ", Valor da diaria: R$ "
				+ getValorDiaria();
	}



	public String getPlaca() {//Encapsulamento através do metodos get e sets
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
	
	
}
