import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		Lista<Cliente> lista = new Lista<Cliente>();
				
				do {
					opcao = Integer.parseInt(JOptionPane.showInputDialog(menu()));
					if (opcao < 1 || opcao > 6) {
						JOptionPane.showMessageDialog(null, "Op��o invalida");
					} else {
						switch (opcao) {
							case 1:
								Conta.abrirConta();
								break;
							case 2:
								Conta.realizarSaque();
								break;
							case 3:
								Conta.realizarDeposito();
								break;
							case 4:
								Conta.relatorioContas();
								break;
							case 5 :
								Conta.encerrarConta();
								break;
						}
					}
				} while (opcao != 6);
				
				JOptionPane.showMessageDialog(null, "Volte sempre!");
			}

	
	public static String menu() {
		String aux = "Escolha uma op��o: " + "\n";
			   aux += "1. Abrir Conta. " + "\n";
			   aux += "2. Realizar Saque. " + "\n";
			   aux += "3. Realizar Dep�sito. " + "\n";
			   aux += "4. Relat�rio de Contas. " + "\n";
			   aux += "5. Encerrar Conta. " + "\n";
			   aux += "6. Encerrar Aplica��o. " + "\n";
			   return aux;
	}

}
