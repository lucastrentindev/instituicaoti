package back;

/**
 * Lista da turma
 * 
 * @autor Lucas Trentin
 * @versão 1.0
 */

public class Turma{
	 private int codigo_turma;
	 private Disciplina disciplina; 
	 private Professor docente;
	 private AlunosLista aluno; 
	 private int aprovados;
     
	 
	 public int getAprovados() {
		return this.aprovados;
	}

	public void setAprovados(int aprovados) {
		this.aprovados = aprovados;
	}

	public Turma() {
		 this.aluno = new AlunosLista();
		 
	 }

	   public Aluno[] ListAlunos() {	     
		   	 
	    Aluno[] alunos = this.aluno.get();	
		   	
	    return alunos;
	    
	    }

	 public void InserirAluno(Aluno aluno) {
		 this.aluno.inserir(aluno);
		 
	 }

	public int getCodigo_turma() {
		return this.codigo_turma;
	}


	public void setCodigo_turma(int codigo_turma) {
		this.codigo_turma = codigo_turma;
	}
	
    public int getQtdeAluno(){
        return this.aluno.length();
    }
    

    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }
    
    public Disciplina getDisciplina(){
        return this.disciplina;
    }
    

    public void setProfessor(Professor prof){
        this.docente = prof;
    }
    
    public Professor getProfessor(){
        return this.docente;
    }
	 
	 
}
