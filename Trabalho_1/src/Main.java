import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
			
		JOptionPane.showMessageDialog(null, "Bem vindo ao sistema de \n" + "gerenciamento de contas");
		int opcao1 = main1();
			
			if (opcao1 == 4) {	
				JOptionPane.showMessageDialog(null, "Volte sempre!");
					
			} 
				
		}
	
	public static int main1() {
		int opcao1 = 0;
		do {
			opcao1 = Integer.parseInt(JOptionPane.showInputDialog(menu1()));
				if (opcao1 < 1 || opcao1 > 3) {
					JOptionPane.showMessageDialog(null, "Opção invalida");
				} else {
					switch (opcao1) {
						case 1:
							Conta.abrirConta();
							return opcao1;
							break;
						case 2:
							Conta.entrarConta();
							return opcao1;
							break;
						case 3:
							Conta.relatorioContas();
							break;
					}
				}
			} while (opcao1 != 4);
		return opcao1;
		
	}
	
	public static int main2(Conta conta) {
		int opcao2 = 0;
		
		do {
			opcao2 = Integer.parseInt(JOptionPane.showInputDialog(menu2()));
				if (opcao2 < 1 || opcao2 > 3) {
					JOptionPane.showMessageDialog(null, "Opção invalida");
				} else {
					switch (opcao2) {
						case 1:
							Conta.realizarSaque(conta);
							break;
						case 2:
							Conta.realizarDepósito(conta);
							break;
						case 3:
							Conta.encerrarConta();
							break;
					}
				}
			} while (opcao2 != 4);
			return opcao2;
		
			
	}

	
	public static String menu1() {
		String aux = "Escolha uma opção: " + "\n";
			   aux += "1. Abrir uma Conta. " + "\n";
			   aux += "2. Entrar na sua Conta. " + "\n";
			   aux += "3. Relatório de Contas. " + "\n";
			   aux += "4. Encerrar Aplicação. " + "\n";
			   return aux;
	}
	
	public static String menu2() {
		String aux = "Escolha uma opção: " + "\n";
			   aux += "1. Realizar Saque. " + "\n";
			   aux += "2. Realizar Depósito. " + "\n";
			   aux += "3. Encerrar Conta. " + "\n";
			   aux += "4. Encerrar Aplicação. " + "\n";
			   return aux;
	}

}
