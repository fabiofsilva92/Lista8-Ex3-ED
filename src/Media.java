
public class Media {

	public int getAlunoId() {
		return alunoId;
	}
	public void setAlunoId(int alunoId) {
		this.alunoId = alunoId;
	}
	public int getDisciplinaId() {
		return disciplinaId;
	}
	public void setDisciplinaId(int disciplinaId) {
		this.disciplinaId = disciplinaId;
	}
	public double getMediaFinal() {
		return mediaFinal;
	}
	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}
	public Media(int alunoId, int disciplinaId, double mediaFinal) {
		super();
		this.alunoId = alunoId;
		this.disciplinaId = disciplinaId;
		this.mediaFinal = mediaFinal;
	}
	private int alunoId;
	private int disciplinaId;
	private double mediaFinal;
	
}
