package back;

/**
 * Lista da turma
 * 
 * @autor Lucas Trentin
 * @versão 1.0
 */

public class Lista {
	private Object[] array;
    private int i;
    
    /**
     * Cria uma Lista do tipo Objeto
     * 
     */
    public Lista(){
        this.array = new Object[100];
        this.i = 0;
    } 
    /**
     * Adiciona um objeto a lista
     * @param Objeto da lista
     */
    public void inserir(Object obj){
        this.array[this.i] = obj;
        this.i++;
    }
    /**
     * Retorna o tamanho da lista
     * 
     */
    public int length(){
        return this.i;
    }
    /**
     * Pega o array do objeto
     
     */
    public Object[] get(){
        return this.array;
    }
    /**
     * Verifica se existe algum array do objeto.
     */
    public boolean Vazio() {
    	
    	if(this.i > 0)
    	return true;
    	else return false;
    	
    }
    
    
}
