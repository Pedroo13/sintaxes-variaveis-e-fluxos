
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadedePessoas = 1;

		if (idade >= 18) {
			System.out.println("voce tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadedePessoas >= 2) {
				System.out.println("voce é menor de idade " + " entra fodase");
			}else {
				System.out.println("vaza");
			}	
		}
	}
}
