package aulaDia21;

public class AtvAviao {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao () ;
		Aviao aviao2 = new Aviao ();
		Aviao aviao3 = new Aviao ();
		Aviao aviao4 = new Aviao ();
		
		aviao1.setcompania ("Latam");
		aviao1.setAssentos (50) ;
		aviao1.setCor ("Branco") ;
		aviao1.setTurbinas (4) ;
		
		aviao2.setcompania ("Gol");
		aviao2.setAssentos (51) ;
		aviao2.setCor ("Laranja") ;
		aviao2.setTurbinas (3) ;
		
		aviao3.setcompania ("Phenom");
		aviao3.setAssentos (300) ;
		aviao3.setCor ("Branco") ;
		aviao3.setTurbinas (3) ;
		
		aviao4.setcompania ("Azul");
		aviao4.setAssentos (60) ;
		aviao4.setCor ("Azul Escuro") ;
		aviao4.setTurbinas (4) ;
		
		System.out.println("-----OBJETO 1-----");
		System. out.println (aviao1.getCompania () );
		System. out.println (aviao1.getAssentos ());
		System. out.println (aviao1.getCor ());
		System. out.println (aviao1.getTurbinas());
		
		System.out.println("-----OBJETO 2-----");
		System. out.println (aviao2.getCompania () );
		System. out.println (aviao2.getAssentos ());
		System. out.println (aviao2.getCor ());
		System. out.println (aviao2.getTurbinas());
		
		System.out.println("-----OBJETO 3-----");
		System. out.println (aviao3.getCompania () );
		System. out.println (aviao3.getAssentos ());
		System. out.println (aviao3.getCor ());
		System. out.println (aviao3.getTurbinas());
		
		System.out.println("-----OBJETO 4-----");
		System. out.println (aviao4.getCompania () );
		System. out.println (aviao4.getAssentos ());
		System. out.println (aviao4.getCor ());
		System. out.println (aviao4.getTurbinas());

	}

}
