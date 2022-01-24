package pillihuaman.lib.shared.utils.exceptions;

import java.util.Arrays;
import java.util.List;

public class UnprocessableEntityException extends Exception {

	private static final long serialVersionUID = -7600411902480257068L;

	private List<ErrorMessage> errors;

	public UnprocessableEntityException(List<ErrorMessage> errors) {
		this.errors = errors;
	}

	public UnprocessableEntityException(ErrorMessage error) {
		this.errors = Arrays.asList(error);
	}

	public List<ErrorMessage> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorMessage> errors) {
		this.errors = errors;
	}

}
