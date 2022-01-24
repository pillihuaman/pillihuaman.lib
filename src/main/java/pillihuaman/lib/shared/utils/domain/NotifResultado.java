package pillihuaman.lib.shared.utils.domain;

import java.io.Serializable;

public class NotifResultado implements Serializable {

    private static final long serialVersionUID = 1L;
	private String numRuc;
	private String codTipoDocumento;
	private String codSubTipoDocumento;
	private String numVersionDocumento;
	private String numDocumento;
	private String fecDocumento;
	private String numReqRi;


	public String getNumRuc() {
		return numRuc;
	}
	public void setNumRuc(String numRuc) {
		this.numRuc = numRuc;
	}
	public String getCodTipoDocumento() {
		return codTipoDocumento;
	}
	public void setCodTipoDocumento(String codTipoDocumento) {
		this.codTipoDocumento = codTipoDocumento;
	}
	public String getCodSubTipoDocumento() {
		return codSubTipoDocumento;
	}
	public void setCodSubTipoDocumento(String codSubTipoDocumento) {
		this.codSubTipoDocumento = codSubTipoDocumento;
	}
	public String getNumVersionDocumento() {
		return numVersionDocumento;
	}
	public void setNumVersionDocumento(String numVersionDocumento) {
		this.numVersionDocumento = numVersionDocumento;
	}
	public String getNumDocumento() {
		return numDocumento;
	}
	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}
	public String getFecDocumento() {
		return fecDocumento;
	}
	public void setFecDocumento(String fecDocumento) {
		this.fecDocumento = fecDocumento;
	}

	public String getNumReqRi() {
		return numReqRi;
	}
	public void setNumReqRi(String numReqRi) {
		this.numReqRi = numReqRi;
	}
}
