
public class Aluno {

	private int id;
	private String nomeCompleto;
	private String curso;
	private int semestre;

	
	public Aluno(int id, String nomeCompleto, String curso, int semestre) {
		
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.curso = curso;
		this.semestre = semestre;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
}
