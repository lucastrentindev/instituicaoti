package back;
/**
 * Lista dos alunos em geral
 * 
 * @autor Lucas Trentin
 * @versão 1.0
 */

public class AlunosLista extends Aluno {
	
    private Aluno[] aluno = new Aluno[100];
    private int i;
    

    public Aluno PesquisaPorId(int codigo){
		  for(int i = 0; i<this.length(); i++) {
			  if(aluno[i].getCodigo() == codigo) {
				  return aluno[i];
			  }
		  }
	     return null;   
     }
     
    
    public AlunosLista(){
        this.aluno = new Aluno[100];
        this.i = 0;
    } 

    public void inserir(Aluno al){
        this.aluno[this.i] = al;
        this.i++;
    }

    public int length(){
        return this.i;
    }
    

    public Aluno[] get(){
        return  this.aluno;
    }
    

}
