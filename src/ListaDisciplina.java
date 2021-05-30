import javax.swing.JOptionPane;

public class ListaDisciplina {
	
	private NoDisciplina inicio;

	public ListaDisciplina() {
		this.inicio = null;
	}

	public void adicionaInicio(Disciplina a) {
		NoDisciplina al = new NoDisciplina(a);
		if(inicio!=null) {
			al.prox = inicio;
			inicio.anterior = al;
		}
		inicio = al;
	}

	public void adicionaFinal(Disciplina n) {
		NoDisciplina c = new NoDisciplina(n);
		if (inicio == null) {
			inicio = c;
			c.anterior = null;
			c.prox = null;
		} else {
			NoDisciplina aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = c;
			c.anterior = aux;
			c.prox = null;
		}
	}
	
	public Disciplina removeInicio() {
		Disciplina c = null;

		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "ERRO, Lista Vázia");
		} else {
			c = inicio.disciplina;
			inicio = inicio.prox;
			if (inicio != null) {
				inicio.anterior = null;
			}
		}

		return c;
	}
	
	public Disciplina removefinal() {
		Disciplina c = null;

		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "ERRO, Lista Vázia");
		} else {
			if (inicio.prox == null) {
				c = inicio.disciplina;
				inicio = null;
			} else {
				NoDisciplina aux1 = inicio;
				NoDisciplina aux2 = null;

				while (aux1.prox != null) {
					aux2 = aux1;
					aux1 = aux1.prox;
				}
				c = aux1.disciplina;
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
			NoDisciplina aux = inicio;
			StringBuffer s = new StringBuffer();
			
			while(aux!=null) {
				s.append("ID: "+aux.disciplina.getId()+"| Nome da disciplina: "+aux.disciplina.getNomeDisciplina()+"\n");
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
			NoDisciplina aux = inicio;
			StringBuffer s = new StringBuffer();
			
			while(aux!=null) {
				s.append("ID: "+aux.disciplina.getId()+"| Nome da disciplina: "+aux.disciplina.getNomeDisciplina()+"\n");
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
			NoDisciplina aux = inicio;
			
			while(aux!=null) {
				if(aux.disciplina.getId() == id) {
					return aux.disciplina.getNomeDisciplina();
				}
				aux = aux.prox;
			}
			return null;
		}
	}

}
