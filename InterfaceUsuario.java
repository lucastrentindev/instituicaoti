package front;

import java.util.Scanner;
import back.Turma;
import back.Disciplina;
import back.AlunosLista;
import back.Professor;
import back.Aluno;
import back.Curso;
import back.TurmaLista;


public class InterfaceUsuario {

	 Scanner read = new Scanner(System.in);
	
	 private TurmaLista turmas;
	 private AlunosLista alunos;

	 
	 public InterfaceUsuario() {
		 
		 this.alunos = new AlunosLista();
		 this.turmas = new TurmaLista();
		 this.showMenuPrincipal();
		 
	 }
	 
	 public void showMenuPrincipal()
	    {
	       System.out.println("------------------------------------------------------------");
	       System.out.println(" ");
	       System.out.println("Instituição de TI - Lucas Trentin");
	       System.out.println(" ");
	       System.out.println("------------------------------------------------------------");
	       System.out.println(" ");
	       System.out.println("Escolha uma das opções abaixo:");
	       System.out.println(" ");
	       
	       System.out.println("1) Listar revenda");
	       System.out.println("2) Informar dados de uma revenda");
	       System.out.println("3) Consultar os dados de uma revenda");
	       System.out.println("4) Consultar estatísticas gerais");
	       System.out.println("5) Sair");
	       
	       int opcao = read.nextInt();
	       showEscolha(opcao);
	       
	    }
	    

	    private void showEscolha(int opcao) {
	    	
	    	switch (opcao) {
	    	case 1:
	    		showListTurmas();
	    		espera_entrada();
	    		showMenuPrincipal();
	    	break;
	    	case 2:
	    		showCadastroTurmas();
	    		showMenuPrincipal();
	    		break;
	    	case 3:
	    		 showDadosTurma();
	    		 espera_entrada();
	    		 showMenuPrincipal();
	    		break;
	    	case 4:
	    		showEstatisticasTurmas();
	    		espera_entrada();
	    		 showMenuPrincipal();
	    	case 5:
	    		Sair();
	    		break;
	    	default:
	    		System.out.println("Insira uma opcão válida");
	    		showMenuPrincipal();
	    	}
	    }
	   
		/**
	     *Mostra todas as turmas cadastradas no sistema.
	     */
	    private void showListTurmas()
	    {
	    if(turmas.Vazio())  	
	    this.turmas.todasturmas();
	    else {
	    	System.out.println("Nenhuma turma cadastrada!");
	    }
	    }
	    
	    /**
	     *Abre o menu de cadastro de turma e alunos de uma turma
	     */
	    private void showCadastroTurmas()
	    {
	    	Turma turma = new Turma();
	    	
	        System.out.println("Informe o código da turma:");
	        
	        int codigo = read.nextInt();
	        turma.setCodigo_turma(codigo);
	       
	        if(turmas.PesquisaPorId(codigo) != null)
	        {
	        	System.out.println("Turma já cadastrada!");
	        }
	        else {
	        read.nextLine();
	        System.out.println("Informe o nome da disciplina:");
	        String disciplina_nome = read.nextLine();
	        Disciplina disci = new Disciplina();
	        disci.setNome_disciplina(disciplina_nome);
	        turma.setDisciplina(disci);
	        
	        
	        System.out.println("Informe o nome do Professor");
	        String nome_professor = read.nextLine();
	        Professor prof = new Professor(); 
	        prof.setNome(nome_professor);
	        turma.setProfessor(prof);
	             
	             	       	 
	        int qtdAlunos = 0;
	        int aprovados = 0;
	        char opcao;
	         
	        do {
	        if(qtdAlunos >30)
	       		{
	        	System.out.println("Turma Cheia");
	        	return;
	       		}
	  	      
	        Aluno aluno = new Aluno();
	        
	        System.out.println("Informe o código do Aluno");
	        int codigo_aluno = read.nextInt();
	        aluno.setCodigo(codigo_aluno);
	        
	        while(alunos.PesquisaPorId(codigo_aluno) != null)
	        {
	        	System.out.println("Aluno já cadastrado, informe outro código");
	 	        codigo_aluno = read.nextInt();
	 	        aluno.setCodigo(codigo_aluno);
	        	
	        }
	        int codigo_curso = 0;
	        
	        while(codigo_curso <=0 || codigo_curso >=5)  
	        {
	        	Curso curso = new Curso();
	        	System.out.println("Informe o código do Curso");
	        	System.out.println("[1] - Ciência de Computação");
	        	System.out.println("[2] - Sistemas de Informação");
	        	System.out.println("[3] - Engenharia de Computação");
	        	System.out.println("[4] - Análise e Desenvolvimento de Sistemas");
	        	codigo_curso= read.nextInt();
	        	
	        	curso.DeterminaCurso(codigo_curso);
	        	
	        	aluno.setCurso(curso);
	        }
	        
	        read.nextLine(); 
	        System.out.println("Informe o nome do Aluno");
	        String nomealuno = read.nextLine();      
	        aluno.setNome(nomealuno);
	            
	        //read.nextLine(); 
	        System.out.println("Informe o e-mail do Aluno");
	        String email_aluno = read.nextLine();
	        aluno.setEmail(email_aluno);
	        
	      
	        System.out.println("Informe a nota 1");
	        double n1 = read.nextDouble();
	        aluno.setN1(n1);
	        read.nextLine();
	      
	        System.out.println("Informe a nota 2");
	        double n2 = read.nextDouble();
	        aluno.setN2(n2);
	        read.nextLine();
	        
	        System.out.println("Informe a nota 3");
	        double n3 = read.nextDouble();
	        aluno.setN3(n3);
	       
	        aluno.CalcularMedia(n1, n2, n3);
	        
	        if(aluno.isAprovado())
				{
	        	    aprovados++;
					turma.setAprovados(aprovados);
				}
	        this.turmas.inserir(turma);	        
	        turma.InserirAluno(aluno);
	        this.alunos.inserir(aluno);
	        qtdAlunos++;
	       
	        opcao = 0;
	        while ((opcao != 'S') && (opcao != 's') && (opcao != 'N') && (opcao != 'n')){
	        
	        System.out.print("Continuar Informando Alunos (S / N)? : ");
	        opcao = read.next().charAt(0);
	        
	        }
	        }while (opcao == 's' || opcao == 'S');	     
	        
	        }
	    }
           
	    /**
	     *Mostra os alunos de uma turma com suas notas e o resultado final.
	     */
		private void showDadosTurma() {
			
			System.out.println("Informe o código da turma:");
			int codigo = read.nextInt();
						
			 Turma turma = null;
			 
			 turma = this.turmas.PesquisaPorId(codigo);
			 if(turma == null) {
				 System.out.println("Turma não encontrada!");
			 }
			 else {					 
			 Aluno[] aluno = turma.ListAlunos();
             int total = turma.getQtdeAluno();
             
             System.out.println("Código Turma: "+ turma.getCodigo_turma());
        	 System.out.println("Disciplina: "+turma.getDisciplina().getNome_disciplina());
        	 System.out.println("Professor: "+turma.getProfessor().getNome());
        	 
             for(int i = 0; i < total; i++){
            	           	 
                 System.out.println("Aluno: "+aluno[i].getNome());
                 System.out.println("Curso: "+aluno[i].getCurso().getNome_curso());
                 System.out.println("Nota 1: "+aluno[i].getN1()); 
     			 System.out.println("Nota 2: "+aluno[i].getN2()); 
     			 System.out.println("Nota 3: "+aluno[i].getN3()); 
                 System.out.println(aluno[i].getMedia());
                 
                 if(aluno[i].isAprovado())
 				{
 					System.out.println("APROVADO");
 				}
                 else 
 				{
 					System.out.println("REPROVADO");
 				}
             }
             System.out.println("------------------------------------------------------------");
             }
            	 
			 }
		
		/**
	     *Exibe a estáticas gerais das turmas.
	     */
		private void showEstatisticasTurmas() {
			  
			if(turmas.Vazio())  	
				this.turmas.estatiscas();
			else 
				System.out.println("Nenhuma turma cadastrada!");
		
			
		}
		
		/**
	     *Metodo que aguarda uma entrada para continuar.
	     */
		private void espera_entrada(){ 
			System.out.println("");
		    System.out.print("Pressione uma tecla para continuar...");
		    read.nextLine();
		    read.nextLine();
		    System.out.print("\n");
		}
		/**
	     *Metodo de sair do sistema
	     */		
		private void Sair() {
			 char opcao;
		      
			 opcao = 0;
		       
		      while ((opcao != 'S') && (opcao != 's') && (opcao != 'N') && (opcao != 'n')){
			        
			        System.out.print("Deseja Continuar (S / N)? : ");
			        opcao = read.next().charAt(0);
			        
			       
		      if((opcao == 'n' || opcao == 'N')){
		    	  showMenuPrincipal();
		      }
		      else {
		    	  System.exit(1);
		    	  
		      }
		      }
		}
	
}
		

	

