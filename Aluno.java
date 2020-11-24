package back;
/**
 * Alunos
 * 
 * @autor Lucas Trentin
 * @versão 1.0
 */
public class Aluno {
	private int codigo;
    private String nome;
    private String email;
    private Curso curso;
    private double n1;
    private double n2;
    private double n3;
    private double media;
    private boolean aprovado;
    
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
    
	
	/**
     * Calcula a média dos alunos e seta o status da aprovação
     */
	
	public void CalcularMedia(double n1,double n2,double n3) {
		
		this.media = (n1+n2+n3)/3;
		
		if(this.media >=7) 
		{
			this.aprovado = true;
		}
		
		else {
			this.aprovado = false;
		}
	}
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
    
	
    
 
}
