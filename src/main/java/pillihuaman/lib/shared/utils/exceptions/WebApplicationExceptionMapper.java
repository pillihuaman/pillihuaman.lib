package pillihuaman.lib.shared.utils.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class WebApplicationExceptionMapper implements ExceptionMapper<WebApplicationException> {
	

	
    public Response toResponse(WebApplicationException ex) {

        int statusCode = ex.getResponse().getStatus();
        String msg = EnumHTTP.getMensaje(statusCode);
        String exc = EnumHTTP.getMensaje(statusCode);

        ErrorMessage errorMessage = new ErrorMessage(statusCode, msg,exc);

        
        return Response.status(errorMessage.getCod())
                        .entity(errorMessage)
                        .build();
    }

}
