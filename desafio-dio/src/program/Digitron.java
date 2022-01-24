package program;

public class Digitron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int T = leitor.nextInt();
    	int B, A1, D1, L1, A2, D2, L2, V1, V2;
    	
    		B =  5 ; //BONUS
    		A1 = 52; // ATAQUE
    		D1 = 1; // DEFESA
    		L1 = 11; // LEVEL DO TREINADOR
    		
    		A2 = 1; //ATAQUE
    		D2 = 52;//DEFESA
    		L2 = 1; // LEVEL DO TREINADOR

    		V1 = ((A1 + D1)/2) + (L1 % 2 == 0 ? B : 0);
    		V2 = ((A2 + D2)/2) + (L2 % 2 == 0 ? B : 0);
    		
                if (V1 > V2) System.out.println("Bruno");
    		else if ( V2>V1 ) System.out.println("Guarte");
    		else System.out.println("Empate");
    	

	}

}
