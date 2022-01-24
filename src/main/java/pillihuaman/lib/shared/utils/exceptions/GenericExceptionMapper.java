package pillihuaman.lib.shared.utils.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Exception> {
	
	
	public Response toResponse(Exception ex) {

     List<ErrorMessage> errors = new ArrayList<ErrorMessage>();

     ErrorMessage errorMessage = new ErrorMessage(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(),
                                                  EnumHTTP.getMensaje(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode()),null);

     StringWriter printStackTrace = new StringWriter();
     ex.printStackTrace(new PrintWriter(printStackTrace));
     errors.add(new ErrorMessage(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), printStackTrace.toString(),null));
     errorMessage.setErrors(errors);

     
     return Response.status(errorMessage.getCod())
                     .entity(errorMessage)
                     .build();
    }
}
