import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int opc = 0; int menuopc = 0;
		ListaAluno al = new ListaAluno();
		ListaDisciplina dc = new ListaDisciplina();
		ListaMedia md = new ListaMedia();
		MergeSort ms = new MergeSort();
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Alunos; \n 2- Disciplinas; \n3-Média"));
			switch (opc) {
			
			case 1://aluno
			do {
				menuopc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar no inicio"
					+ "\n 2 - Adicionar no final"+"\n 3 - Remover no inicio \n 4 - Remover no final \n 5- Percorrer lista \n0 - Voltar ao menu anterior"));
				switch(menuopc) {
				case 1: int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do aluno: "));
						String nome = JOptionPane.showInputDialog("Digite o nome completo do aluno: ");
						String curso = JOptionPane.showInputDialog("Digite o curso realizado pelo aluno: ");
						int semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre do aluno: "));
						Aluno aluno = new Aluno(id, nome, curso, semestre);
						al.adicionaInicio(aluno);
						al.percorrer();
					break;
				case 2: id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do aluno: "));
						nome = JOptionPane.showInputDialog("Digite o nome completo do aluno: ");
						curso = JOptionPane.showInputDialog("Digite o curso realizado pelo aluno: ");
						semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre do aluno: "));
						aluno = new Aluno(id, nome, curso, semestre);
						al.adicionaFinal(aluno);
						al.percorrer();
					break;
				case 3: aluno = al.removeInicio();
						JOptionPane.showMessageDialog(null, "Aluno deletado da lista: " + aluno.getNomeCompleto());
					break;
				case 4: aluno = al.removefinal();
						JOptionPane.showMessageDialog(null, "Aluno deletado da lista: " + aluno.getNomeCompleto());
					break;
				case 5 : al.percorrer();
				break;
				}
			}while(menuopc != 0);
			break;
			case 2: //disciplina
				do {
					menuopc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar no inicio"
							+ "\n 2 - Adicionar no final"+"\n 3 - Remover no inicio \n 4 - Remover no final \n 5- Percorrer lista \n0 - Voltar ao menu anterior"));
						switch(menuopc) {
						case 1: int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da Disciplina: "));
								String nome = JOptionPane.showInputDialog("Digite o nome da Disciplina: ");
								Disciplina disciplina = new Disciplina(id, nome);
								dc.adicionaInicio(disciplina);
								dc.percorrer();
							break;
						case 2: id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do da Disciplina: "));
								nome = JOptionPane.showInputDialog("Digite o nome da Disciplina: ");
								disciplina = new Disciplina(id, nome);
								dc.adicionaFinal(disciplina);
								dc.percorrer();
							break;
						case 3: disciplina = dc.removeInicio();
								JOptionPane.showMessageDialog(null, "Disciplina deletado da lista: " + disciplina.getNomeDisciplina());
							break;
						case 4: disciplina = dc.removefinal();
								JOptionPane.showMessageDialog(null, "Disciplina deletado da lista: " + disciplina.getNomeDisciplina());
							break;
						case 5 : dc.percorrer();
						break;
						}
				}while(menuopc!=0);
				break;
			case 3: //media
				do {
					menuopc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar no inicio"
							+ "\n 2 - Adicionar no final"+"\n 3 - Remover no inicio \n 4 - Remover no final \n 5- Percorrer lista \n0 - Voltar ao menu anterior"));
						switch(menuopc) {
						case 1: 
								int idAluno = Integer.parseInt(JOptionPane.showInputDialog("Alunos disponíveis: \n"+al.percorrer(0)+"\n Digite o id do aluno para cadastro da média: "));
								String nomeAux = al.retornaNome(idAluno);
								if(nomeAux==null) {
									System.out.println("Aluno inválido");
									break;
								}
								int idDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Disciplinas disponíveis: "+dc.percorrer(0)+"\n Digite o id da disciplina para cadastro da média: "));
								nomeAux = dc.retornaNome(idDisciplina);
								if(nomeAux==null) {
									System.out.println("Disciplina inválida");
									break;
								}
								double mediaFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite a média: "));
								Media media = new Media(idAluno, idDisciplina, mediaFinal);
								md.adicionaInicio(media);
								md.percorrer();
							break;
						case 2: idAluno = Integer.parseInt(JOptionPane.showInputDialog("Alunos disponíveis: \n"+al.percorrer(0)+"\n Digite o id do aluno para cadastro da média: "));
								nomeAux = al.retornaNome(idAluno);
								if(nomeAux==null) {
									System.out.println("Aluno inválido");
									break;
								}
								idDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Disciplinas disponíveis: "+dc.percorrer(0)+"\n Digite o id da disciplina para cadastro da média: "));
								nomeAux = dc.retornaNome(idDisciplina);
								if(nomeAux==null) {
									System.out.println("Disciplina inválida");
									break;
								}
								mediaFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite a média: "));
								media = new Media(idAluno, idDisciplina, mediaFinal);
								md.adicionaFinal(media);
								md.percorrer();
							break;
						case 3: media = md.removeInicio();
								JOptionPane.showMessageDialog(null, "Media deletado da lista: " + media.getMediaFinal());
							break;
						case 4: media = md.removefinal();
								JOptionPane.showMessageDialog(null, "Media deletado da lista: " + media.getMediaFinal());
							break;
						case 5 : md.percorrer();
						break;
						}
				}while(menuopc!=0);
				break;
			case 4:NoMedia aux = md.getListaMedia();
			if(aux !=null) {
				NoMedia mediaSorted = ms.inicioMerge(aux); //MERGE REALIZADO COM O PARAMETRO DA NOTA E NAO DO ID.
				md.substituirListaOrganizada(mediaSorted);
				int contador = 0;
				aux = mediaSorted;
				while(aux!=null) {
					System.out.println("Aluno: "+al.retornaNome(aux.media.getAlunoId())+ "| Disciplina: "+dc.retornaNome(aux.media.getDisciplinaId())+"| Média: "+aux.media.getMediaFinal());
					if(aux.media.getMediaFinal()>=8) {
						contador++;
					}
					aux = aux.prox;
				}
				System.out.println(contador+" alunos com media maior que 8.");
			}
				break;
			
		}

	}while(opc!=9);

}
}
