package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		double a = 1; // conversão de tipo implicíta
		System.out.println(a);
		
		float b = (float) 1.23456788888; // conversão explicita, perde informação (casting)
		System.out.println(b);
		
		int c = 130; // CAST
		byte d = (byte) c;
		System.out.println(d);// -126
		
		double e = 1; //CAST)
		int f = (int) e;
		System.out.println(f);
		
	}

}
