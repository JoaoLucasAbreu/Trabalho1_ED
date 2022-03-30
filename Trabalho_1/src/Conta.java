import javax.swing.JOptionPane;
public class Conta {

	Cliente cliente;
	double saldo;
	
	static Lista<Conta> lista = new Lista<Conta>();
	
	public Conta (Cliente cliente) {
		this.cliente = cliente; 
	}
	

	public static void abrirConta() {
		String nome = JOptionPane.showInputDialog("Nome: ");
		String cpf = JOptionPane.showInputDialog("CPF: ");
		
		Cliente c =  new Cliente(nome, cpf);
		
		Conta conta = new Conta(c);
		conta.saldo = 0;
		
		if(lista.pesquisar(conta) == null) {
			lista.inserir(conta);
			JOptionPane.showMessageDialog(null, "Conta aberta com sucesso!");
			Main.main2(conta);
			
		} else {
			JOptionPane.showMessageDialog(null, "Essa conta ja possui cadastro!");
			
		}
			
	}
	
	public static void entrarConta() {
		String nome = JOptionPane.showInputDialog("Nome: ");
		String cpf = JOptionPane.showInputDialog("CPF: ");
		
		Cliente c =  new Cliente(nome, cpf);
		
		Conta conta = new Conta(c);

		
		if(lista.pesquisar(conta) != null) {
			JOptionPane.showMessageDialog(null, "Entrando na conta");
			Main.main2(conta);
			
		} else {
			JOptionPane.showMessageDialog(null, "Conta não registrada");
			
		}
			
	}
	
	public static void realizarSaque(Conta conta) {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do saque?"));
		
			if (conta.saldo <= 0 && conta.saldo < valor) {
				JOptionPane.showMessageDialog(null, "Saldo Indisponível");
				
			} else {
				
				lista.remover(conta);
				
				conta.saldo = conta.saldo - valor;
				JOptionPane.showMessageDialog(null, "Saldo atual: " + conta.saldo);
				lista.inserir(conta);
				
				}
		}
	
	public static void relatorioConta() {
		lista.imprimir();
	}
	
	
	@Override
	public boolean equals(Object obj) {
        return obj != null
            && obj instanceof Conta
            && this.cliente.cpf.equals(((Conta) obj).cliente.cpf);
	}
	
	
}
