import javax.swing.JOptionPane;

public class ListaMedia {
	
	private NoMedia inicio;

	public ListaMedia() {
		this.inicio = null;
	}

	public void adicionaInicio(Media a) {
		NoMedia al = new NoMedia(a);
		if(inicio!=null) {
			al.prox = inicio;
			inicio.anterior = al;
		}
		inicio = al;
	}

	public void adicionaFinal(Media n) {
		NoMedia c = new NoMedia(n);
		if (inicio == null) {
			inicio = c;
			c.anterior = null;
			c.prox = null;
		} else {
			NoMedia aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = c;
			c.anterior = aux;
			c.prox = null;
		}
	}
	
	public Media removeInicio() {
		Media c = null;

		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "ERRO, Lista Vázia");
		} else {
			c = inicio.media;
			inicio = inicio.prox;
			if (inicio != null) {
				inicio.anterior = null;
			}
		}

		return c;
	}
	
	public Media removefinal() {
		Media c = null;

		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "ERRO, Lista Vázia");
		} else {
			if (inicio.prox == null) {
				c = inicio.media;
				inicio = null;
			} else {
				NoMedia aux1 = inicio;
				NoMedia aux2 = null;

				while (aux1.prox != null) {
					aux2 = aux1;
					aux1 = aux1.prox;
				}
				c = aux1.media;
				aux2.prox.anterior = null;
				aux2.prox = null;
			}
		}

		return c;
	}
	
	public void iniciarMerge() {
		if(inicio == null) {
			System.out.println("Lista vazia");
			return;
		}
		else {
			NoMedia aux = inicio;
			MergeSort m = new MergeSort();
			m.inicioMerge(aux);
		}
	}
	
	public void percorrer() {
		
		if(inicio == null) {
			JOptionPane.showMessageDialog(null, "Lista vazia");
		}
		else {
			NoMedia aux = inicio;
			StringBuffer s = new StringBuffer();
			
			while(aux!=null) {
				s.append("ID do Aluno: "+aux.media.getAlunoId()+"| ID Disciplina: "+aux.media.getDisciplinaId()+"| Média: "+aux.media.getMediaFinal()+"\n");
				aux = aux.prox;
			}
			JOptionPane.showMessageDialog(null, s.toString());
			System.out.println(s.toString());
		}
	}
	
	public NoMedia getListaMedia() {
		if(inicio == null) {
			System.out.println("Lista vazia");
			return null;
		}
		else {
			return inicio;
		}

	}
	
	public void substituirListaOrganizada(NoMedia aux) {
		inicio = aux;
		StringBuffer s = new StringBuffer();
		
		while(aux!=null) {
			s.append("ID do Aluno: "+aux.media.getAlunoId()+"| ID Disciplina: "+aux.media.getDisciplinaId()+"| Média: "+aux.media.getMediaFinal()+"\n");
			aux = aux.prox;
		}
		System.out.println("Substituido por lista organizada pelo merge:\n"+s.toString());
	}

}
