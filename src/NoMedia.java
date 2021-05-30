
public class NoMedia {
	
	public Media media;
	public NoMedia prox;
	public NoMedia anterior;
	
	public NoMedia(Media media) {
		this.media = media;
		this.prox = null;
		this.anterior = null;
	}

}
