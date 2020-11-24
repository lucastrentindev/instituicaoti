package back;

/**
 * Cursos disponíveis
 * 
 * @autor Lucas Trentin
 * @versão 1.0
 */

public class Curso {
  private int cod_curso;
  private String nome_curso;
  
public int getCod_curso() {
	return cod_curso;
}
public void setCod_curso(int cod_curso) {
	this.cod_curso = cod_curso;
}
public String getNome_curso() {
	return nome_curso;
}
public void setNome_curso(String nome_curso) {
	this.nome_curso = nome_curso;
}
 

public void DeterminaCurso(int codigo) {
	switch(codigo) {
	case 1:
	 setNome_curso("Ciência de Computação");
	break;
	
	case 2:
		setNome_curso("Sistemas de Informação");
	break;
	
	case 3:
		setNome_curso("Engenharia de Computação");
	break;
	
	case 4:
		setNome_curso("Análise e Desenvolvimento de Sistemas");
	break;
	
	
		}
	}
}
