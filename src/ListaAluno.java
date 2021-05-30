import javax.swing.JOptionPane;

public class ListaAluno {
	
	private NoAluno inicio;

	public ListaAluno() {
		this.inicio = null;
	}

	public void adicionaInicio(Aluno a) {
		NoAluno al = new NoAluno(a);
		if(inicio!=null) {
			al.prox = inicio;
			inicio.anterior = al;
		}
		inicio = al;
	}

	public void adicionaFinal(Aluno n) {
		NoAluno c = new NoAluno(n);
		if (inicio == null) {
			inicio = c;
			c.anterior = null;
			c.prox = null;
		} else {
			NoAluno aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = c;
			c.anterior = aux;
			c.prox = null;
		}
	}
	
	public Aluno removeInicio() {
		Aluno c = null;

		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "ERRO, Lista Vázia");
		} else {
			c = inicio.aluno;
			inicio = inicio.prox;
			if (inicio != null) {
				inicio.anterior = null;
			}
		}

		return c;
	}
	
	public Aluno removefinal() {
		Aluno c = null;

		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "ERRO, Lista Vázia");
		} else {
			if (inicio.prox == null) {
				c = inicio.aluno;
				inicio = null;
			} else {
				NoAluno aux1 = inicio;
				NoAluno aux2 = null;

				while (aux1.prox != null) {
					aux2 = aux1;
					aux1 = aux1.prox;
				}
				c = aux1.aluno;
				aux2.prox.anterior = null;
				aux2.prox = null;
			}
		}

		return c;
	}
	
	public void percorrer() {
		
		if(inicio == null) {
			JOptionPane.showMessageDialog(null, "Lista vazia");
		}
		else {
			NoAluno aux = inicio;
			StringBuffer s = new StringBuffer();
			
			while(aux!=null) {
				s.append("ID: "+aux.aluno.getId()+"| Nome: "+aux.aluno.getNomeCompleto()+"| Curso: "+aux.aluno.getCurso()+"| Semestre: "+aux.aluno.getSemestre()+"\n");
				aux = aux.prox;
			}
			JOptionPane.showMessageDialog(null, s.toString());
		}
	}
	
	public String percorrer(int id) {
		if(inicio == null) {
			JOptionPane.showMessageDialog(null, "Lista vazia");
			return null;
		}
		else {
			NoAluno aux = inicio;
			StringBuffer s = new StringBuffer();
			
			while(aux!=null) {
				s.append("ID: "+aux.aluno.getId()+"| Nome: "+aux.aluno.getNomeCompleto()+"| Curso: "+aux.aluno.getCurso()+"| Semestre: "+aux.aluno.getSemestre()+"\n");
				aux = aux.prox;
			}
			return s.toString();
		}
	}
	
	public String retornaNome(int id) {
		if(inicio == null) {
			JOptionPane.showMessageDialog(null, "Lista vazia");
			return null;
		}
		else {
			NoAluno aux = inicio;
			
			while(aux!=null) {
				if(aux.aluno.getId() == id) {
					return aux.aluno.getNomeCompleto();
				}
				aux = aux.prox;
			}
			return null;
		}
	}
	
}
