package pillihuaman.lib.shared.utils.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class UnprocessableEntityExceptionMapper implements ExceptionMapper<UnprocessableEntityException> {
	

	public static int HTTP_UNPROCESSABLE_ENTITY = 422;
	
	public Response toResponse(UnprocessableEntityException ex) {

        ErrorMessage errorMessage = new ErrorMessage(HTTP_UNPROCESSABLE_ENTITY, EnumHTTP.getMensaje(HTTP_UNPROCESSABLE_ENTITY),null);
        errorMessage.setErrors(ex.getErrors());
        
        
        return Response.status(errorMessage.getCod())
                        .entity(errorMessage)
                        .build();
    }
}
