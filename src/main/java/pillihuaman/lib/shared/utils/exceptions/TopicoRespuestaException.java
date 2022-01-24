package pillihuaman.lib.shared.utils.exceptions;



public class TopicoRespuestaException extends Exception {

	private static final long serialVersionUID = -7600411902480257068L;

	private String numIdEvento;
	private String desMensaje;

	public TopicoRespuestaException() {
	}

	public TopicoRespuestaException(String numIdEvento, String desMensaje) {
		this.numIdEvento = numIdEvento;
		this.desMensaje = desMensaje;
	}

	/**
	 * @return the numIdEvento
	 */
	public String getNumIdEvento() {
		return numIdEvento;
	}

	/**
	 * @param numIdEvento
	 *            the numIdEvento to set
	 */
	public void setNumIdEvento(String numIdEvento) {
		this.numIdEvento = numIdEvento;
	}

	/**
	 * @return the desMensaje
	 */
	public String getDesMensaje() {
		return desMensaje;
	}

	/**
	 * @param desMensaje
	 *            the desMensaje to set
	 */
	public void setDesMensaje(String desMensaje) {
		this.desMensaje = desMensaje;
	}



	

}
