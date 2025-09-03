import java.util.ArrayList;
import java.util.List;



public class Principal {

	public static void main(String[] args) {
		List<Veiculo> minhaLista = new ArrayList<>();
		Carro c1 = new Carro();
		c1.setMarca("Volkswagen");
		c1.setModelo("Passat");
		c1.setAno(2020);
		c1.setPlaca("JGE-2132");
		c1.setValorDiaria(120);
		c1.setQuantidadePortas(4);
		
		
		Moto m1 = new Moto();
		m1.setMarca("BMW");
		m1.setModelo("S1000RR");
		m1.setAno(2021);
		m1.setPlaca("XYZ-5678");
		m1.setValorDiaria(80);
		m1.setCilindrada(1000);
		
		
		Caminhao cam1 = new Caminhao();
		cam1.setMarca("Volvo");
		cam1.setModelo("FH");
		cam1.setAno(2019);
		cam1.setPlaca("DEF-9876");
		cam1.setValorDiaria(300);
		cam1.setCapacidadeCarga(25);
		
		minhaLista.add(cam1);
		minhaLista.add(m1);
		minhaLista.add(c1);
		
		System.out.println("Imprimindo a lista:");
		for (Veiculo veiculo : minhaLista) {
			System.out.println(veiculo.getMarca());
		}
		
		
	}
	
	
}
