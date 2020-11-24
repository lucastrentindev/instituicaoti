package back;

/**
 * Lista da turma
 * 
 * @autor Lucas Trentin
 * @versão 1.0
 */

public class TurmaLista extends Lista {
  
	 /**
     * Retorna todas as turmas com o codigo,disciplina,professor e quantidade de alunos
     */
	public void todasturmas() {
		Turma obj;
		
		for(int i = 0; i < this.length(); i++){
			 obj = (Turma)this.get()[i];
			 
			 System.out.println("Código da turma: "+obj.getCodigo_turma());
			 System.out.println("Disciplina: "+obj.getDisciplina().getNome_disciplina());
			 System.out.println("Professor: "+obj.getProfessor().getNome());
		     System.out.println("Quantidades de Alunos: "+obj.getQtdeAluno());
		     System.out.println("------------------------------------------------------------");
		    		 	             
        }
	}
	
	/**  
     * Pesquisa uma turma na lista de turmas
     * @param código da turma
     * @return retorna null ou o objeto da turma
     */
	public Turma PesquisaPorId(int codigo){
		  Turma obj;
	         for(int i = 0; i < this.length(); i++){
	            obj = (Turma)this.get()[i];
	            if(obj.getCodigo_turma() == codigo){
	                return obj;
	            }
       }
       return null;
   }
	
	/**  
	* Para cada turma cria um objeto e pega os dados dos alunos, realiza calculo de porcentagem
	* de aprovações e também mostra todos os alunos matriculados por turma e geral.
    * 
    */
	public void estatiscas() {
		Turma obj;
		
		double percentual_turma;
		int total_matriculados = 0;
		int toal_aprovados = 0;
		
		for(int i = 0; i < this.length(); i++){
			 obj = (Turma)this.get()[i];
			 
			 System.out.println("Código da turma: "+obj.getCodigo_turma());
			 System.out.println("Disciplina: "+obj.getDisciplina().getNome_disciplina());
			 System.out.println("Professor: "+obj.getProfessor().getNome());
		     System.out.println("Quantidades de Alunos Matriculados: "+obj.getQtdeAluno());
		     System.out.println("Quantidades de Alunos Aprovados: "+obj.getAprovados());
		     
		     total_matriculados = total_matriculados+= obj.getQtdeAluno();
		     toal_aprovados = toal_aprovados += obj.getAprovados();
		     
		     percentual_turma = (obj.getAprovados() / obj.getQtdeAluno()) * 100;
		     
		     System.out.println("Percentual de aprovaçao da Turma: "+percentual_turma+"%");
		     System.out.println("------------------------------------------------------------");	     
        }
		System.out.println("");
		System.out.println("INFORMAÇÕES GERAIS DA INSTITUIÇÃO ");
		System.out.println("Total de Alunos Matriculados: "+total_matriculados);	
		System.out.println("Porcentagem Geral de Aprovados:  " +((double)toal_aprovados / (double)total_matriculados) * 100+"%");
	}


	}
	

