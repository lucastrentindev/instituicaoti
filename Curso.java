package back;

/**
 * Cursos dispon�veis
 * 
 * @autor Lucas Trentin
 * @vers�o 1.0
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
	 setNome_curso("Ci�ncia de Computa��o");
	break;
	
	case 2:
		setNome_curso("Sistemas de Informa��o");
	break;
	
	case 3:
		setNome_curso("Engenharia de Computa��o");
	break;
	
	case 4:
		setNome_curso("An�lise e Desenvolvimento de Sistemas");
	break;
	
	
		}
	}
}
