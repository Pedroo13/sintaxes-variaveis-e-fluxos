
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadedepessoas = 3;
		
		boolean acompanhado;

		// boolean acompanhado = quantidadedepessoas >= 2;
		if (quantidadedepessoas >= 2) {
			 acompanhado = true;
		} else {
			 acompanhado = false;
		}
		System.out.println("valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");

		} else {
			System.out.println("infelizmente voce n�o pode entra");
		}
	}
}
