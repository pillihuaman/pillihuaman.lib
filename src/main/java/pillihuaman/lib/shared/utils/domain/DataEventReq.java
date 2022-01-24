package pillihuaman.lib.shared.utils.domain;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import pillihuaman.lib.shared.utils.constants.FormatoFecha;

public class DataEventReq implements Serializable {

    private static final long serialVersionUID = 1L;

    private String numRuc;
    private String codTipoDocumento;
    private String codSubTipoDocumento;
    private String numVersionDocumento;
    private String numDocumento;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFecha.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFecha.ZONA_HORARIA)
    private Date fecDocumento;

    /**
     * @return the numRuc
     */
    public String getNumRuc() {
        return numRuc;
    }

    /**
     * @param numRuc the numRuc to set
     */
    public void setNumRuc(String numRuc) {
        this.numRuc = numRuc;
    }

    /**
     * @return the codTipoDocumento
     */
    public String getCodTipoDocumento() {
        return codTipoDocumento;
    }

    /**
     * @param codTipoDocumento the codTipoDocumento to set
     */
    public void setCodTipoDocumento(String codTipoDocumento) {
        this.codTipoDocumento = codTipoDocumento;
    }

    /**
     * @return the codSubTipoDocumento
     */
    public String getCodSubTipoDocumento() {
        return codSubTipoDocumento;
    }

    /**
     * @param codSubTipoDocumento the codSubTipoDocumento to set
     */
    public void setCodSubTipoDocumento(String codSubTipoDocumento) {
        this.codSubTipoDocumento = codSubTipoDocumento;
    }

    /**
     * @return the numVersionDocumento
     */
    public String getNumVersionDocumento() {
        return numVersionDocumento;
    }

    /**
     * @param numVersionDocumento the numVersionDocumento to set
     */
    public void setNumVersionDocumento(String numVersionDocumento) {
        this.numVersionDocumento = numVersionDocumento;
    }

    /**
     * @return the numDocumento
     */
    public String getNumDocumento() {
        return numDocumento;
    }

    /**
     * @param numDocumento the numDocumento to set
     */
    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    /**
     * @return the fecDocumento
     */
    public Date getFecDocumento() {
        return fecDocumento;
    }

    /**
     * @param fecDocumento the fecDocumento to set
     */
    public void setFecDocumento(Date fecDocumento) {
        this.fecDocumento = fecDocumento;
    }

}
