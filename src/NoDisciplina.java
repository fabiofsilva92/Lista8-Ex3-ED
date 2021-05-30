
public class NoDisciplina {
	
	public Disciplina disciplina;
	public NoDisciplina prox;
	public NoDisciplina anterior;
	
	public NoDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
		this.prox = null;
		this.anterior = null;
	}

}
