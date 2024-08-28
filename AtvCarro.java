package aulaDia21;

public class AtvCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		
		carro1.setCor("Amarelo");
		carro1.setPorta(4);
		carro1.setRodas(4);
		carro1.setTipo("esportivo");
		
		carro2.setCor("Branco");
		carro2.setPorta(4);
		carro2.setRodas(4);
		carro2.setTipo("caminhonete");
		
		carro3.setCor("vermelho");
		carro3.setPorta(2);
		carro3.setRodas(4);
		carro3.setTipo("gol");
		
		carro4.setCor("preto");
		carro4.setPorta(6);
		carro4.setRodas(4);
		carro4.setTipo("limusine");

		System.out.println("-----Carro 1-----");
		System.out.println(carro1.getCor());
		System.out.println(carro1.getPorta());
		System.out.println(carro1.setRodas());
		System.out.println(carro1.getTipo());
		
		System.out.println("-----Carro 2-----");
		System.out.println(carro2.getCor());
		System.out.println(carro2.getPorta());
		System.out.println(carro2.setRodas());
		System.out.println(carro2.getTipo());
		
		System.out.println("-----Carro 3-----");
		System.out.println(carro3.getCor());
		System.out.println(carro3.getPorta());
		System.out.println(carro3.setRodas());
		System.out.println(carro3.getTipo());
		
		System.out.println("-----Carro 4-----");
		System.out.println(carro4.getCor());
		System.out.println(carro4.getPorta());
		System.out.println(carro4.setRodas());
		System.out.println(carro4.getTipo());
	}

}
