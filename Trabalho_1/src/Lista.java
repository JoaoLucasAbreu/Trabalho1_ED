
public class Lista<T> {
    private No<T> inicio, fim;
    int total;

    // Método para inserir um elemento na lista
    public void inserir (T dado) {
    	No<T> aux = new No<T>(dado);
    	if (total == 0) {
    		inicio = aux;
    	} else {
    		aux.esq = fim;
    		fim.dir = aux;
    	}
    	
    	fim = aux;
    	total++;
    	
    }
    
    // Método para pesquisar um elemento na lista
    public No<T> pesquisar (T dado) {
    	No<T> aux = inicio;
    	boolean achou = false;
    	
    	while (aux != null && achou == false) {
    		
    		if (aux.dado.equals(dado)) {
    			achou = true;
    			break;
    			
    		}
    		
    		aux = aux.dir;
    		
    	}
    	
    	return aux;
    	
    }
    
    // Método para remover um elemento na lista
    public void remover(T dado) {
    	No<T> aux = pesquisar(dado);
    	
    	if (aux != null) {
    		if(total == 1) { // Caso tenha um único elemento
    			inicio = null;
    			fim = null;
    			
    		} else if (aux == inicio ) {
    			aux.dir.esq = null;
    			inicio = aux.dir;
    			aux.dir = null;
    			
    		} else if (aux == fim) {
    			aux.esq.dir = null;
    			fim = aux.esq;
    			aux.esq = null;
    			
    		} else {
    			aux.esq.dir = aux.dir;
    			aux.dir.esq = aux.esq;
    			aux.dir = null;
    			aux.esq = null;
    			
    		}
    		
    		total--;
    	
    }
    





    }


}

