package desafios_udemy;

// EXPRESSÃO --> { [6*(3+2)]²/(3*2) - [((1-5)*(2-7))/2]²} ³/ 10³

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 3;
		int c = 2;
		int d = 2;
		int e = 3;
		int f = 2;
		int g = 1;
		int h = 5;
		int i = 2;
		int j = 7;
		int k = 2;
		int l = 2;
		int m = 3;
		int n = 10;
		int o = 3;
		
		int exp1 = (a*(b+c)); // [6*(3+2)]
		System.out.println(exp1);
		
		double exp2 = Math.pow(exp1, d); // [6*(3+2)]²
		System.out.println(exp2);
		
		int exp3 = (int)exp2 / (e*f); // Aqui foi realizado um CAST trazendo a exp2 para "int"
		System.out.println(exp3); // [6*(3+2)]²/(3*2)
		
		int exp4 = g-h; // (1-5)
		System.out.println(exp4); 
		
		int exp5 = i-j; // (2-7)
		System.out.println(exp5);
		
		int exp6 = exp4 * exp5; // (1-5)*(2-7)
		System.out.println(exp6);
		
		int exp7 = exp6 / k; // (1-5)*(2-7) / 2
		System.out.println(exp7);
		
		double exp8 = Math.pow(exp7, l); // (1-5)*(2-7)/2 ²
		System.out.println(exp8);
		
		double exp9 = exp3 - exp8; // (6*(3+2)²/(3*2)) - ((1-5)*(2-7)/2²)
		System.out.println(exp9);
		
		double exp10 = Math.pow(exp9, m); // (6*(3+2)²/(3*2)) - ((1-5)*(2-7)/2²)³
		System.out.println(exp10);
		
		double exp11 = Math.pow(n, o); // 10³
		System.out.println(exp11);
		
		double expFinal = exp10 / exp11;
		System.out.println("O resultado da expressão matemática é = " + expFinal);
		
	}
}
