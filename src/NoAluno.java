
public class NoAluno {
	
	public Aluno aluno;
	public NoAluno prox;
	public NoAluno anterior;
	
	public NoAluno(Aluno aluno) {
		this.aluno = aluno;
		this.prox = null;
		this.anterior = null;
	}

}
