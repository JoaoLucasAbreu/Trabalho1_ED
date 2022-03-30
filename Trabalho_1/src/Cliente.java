
public class Cliente {
	String nome;
	String cpf;
	
	public Cliente (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
    @Override
    public String toString() {
    	 return "-------------" + 
                 "\nNome: " + nome + 
                  "\n CPF: " + cpf + 
                  "\n-------------";
    }
	
}
