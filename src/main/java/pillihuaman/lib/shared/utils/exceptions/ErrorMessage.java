package pillihuaman.lib.shared.utils.exceptions;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

public class ErrorMessage implements Serializable {

	private static final long serialVersionUID = 6450383229867016978L;

	private int cod;
	private String msg;
	private String exc;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<ErrorMessage> errors;

	public ErrorMessage(int cod, String msg,String exc) {
		this.cod = cod;
		this.msg = msg;
		this.exc = exc;

	}

	public int getCod() { return cod; }

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<ErrorMessage> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorMessage> errors) {
		this.errors = errors;
	}
	public String getExc() {
		return exc;
	}

	public void setExc(String exc) {
		this.exc = exc;
	}
	@Override
	public String toString() {
		return "ErrorMessage [cod=" + cod + ", msg=" + msg + "]";
	}

}
