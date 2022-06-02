
public class Aluguel implements Total {// implementando a interface

	private Automovel auto;
	private Cliente cliente;
	private String dtAluguel;
	private int qtDias;

	public Aluguel(Automovel auto, Cliente cliente, String dtAluguel, int qtDias) {
		// Interface Alugar foi implementada na classe Aluguel como um construtor que
		// sera utilizado na classe Principal
		this.auto = auto;
		this.cliente = cliente;
		this.dtAluguel = dtAluguel;
		this.qtDias = qtDias;

	}
@Override
	public String toString() {
		return auto + ", Dias de aluguel:" + qtDias + ", Data de aquisição: " + dtAluguel;
	}

	public Automovel getAuto() {// Encapsulamento
		return auto;
	}

	public void setAuto(Automovel auto) {
		this.auto = auto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDtAluguel() {
		return dtAluguel;
	}

	public void setDtAluguel(String dtAluguel) {
		this.dtAluguel = dtAluguel;
	}

	public int getQtDias() {
		return qtDias;
	}

	public void setQtDias(int qtDias) {
		this.qtDias = qtDias;
	}
	
	public double totalapagar() {//Interface implementada na classe aluguel

		double total = auto.getValorDiaria() * qtDias;

		return total;
	}
	

 
}
