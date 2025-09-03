
public class Moto extends Veiculo {

	private int cilindrada;
	
	public int getCilindrada() {
		return cilindrada;
	}
	
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public double calcularAluguel(int dias) {
		double valorBase = getValorDiaria() * dias;
		double desconto = valorBase * 0.95;
		return desconto;
	}

}
