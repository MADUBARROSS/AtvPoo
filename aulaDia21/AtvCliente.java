package aulaDia21;

public class AtvCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setNome("madu");
		cliente1.setTelefone("16554254896");
		cliente1.setCpf("48756325584");
		cliente1.setRg("58745698852");
		
		cliente2.setNome("duda");
		cliente2.setTelefone("17889546314");
		cliente2.setCpf("489754563328");
		cliente2.setRg("59874563215");
		
		System.out.println("-----OBJETO 1-----");
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getCpf());
		
		System.out.println("-----OBJETO 2-----");
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getCpf());

	}

}
