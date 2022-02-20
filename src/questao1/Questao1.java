package questao1;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j >= 1; j--) // imprime os espaços
				System.out.print(" ");
			for (int j = 1; j <= i; j++) // imprime os *
				System.out.print("*");
			System.out.println("\n");
		}
	}

}
