package pillihuaman.lib.shared.utils.exceptions;


import org.apache.commons.lang3.StringUtils;

public enum EnumHTTP {
	
	HTTP_ERROR_500(500,"Internal Server Error - Se presento una condici\u00F3n inesperada que impidi\u00F3 completar el Request"),
	HTTP_ERROR_400(400,"Bad Request - El Request no puede ser entendido por el Servidor debido a errores de sintaxis, El cliente no debe repetir el Request sin modificaciones"),
	HTTP_ERROR_401(401,"Unauthorized - Fallo en la autenticaci\u00F3n del Cliente"),
	HTTP_ERROR_403(403,"Forbidden - El Cliente no tiene autorizaci\u00F3n para acceder al Recurso"),
	HTTP_ERROR_404(404,"Not Found - El Recurso Solicitado no puede ser encontrado"),
	HTTP_ERROR_405(405,"Method Not Allowed - La ruta especificada no existe"),
	HTTP_ERROR_422(422,"Unprocessable Entity - Se presentaron errores de validaci\u00F3n que impidieron completar el Request");

	private EnumHTTP(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	private int code;
	private String msg;

	public int getCodigo() {
		return code;
	}
	public void setCodigo(int code) {
		this.code = code;
	}
	public String getMensaje() {
		return msg;
	}
    public void setMensaje(String msg) {
		this.msg = msg;
	}
	
	public static String getMensaje(int code) {
        String msg = StringUtils.EMPTY;

        for (EnumHTTP enumHTTP : EnumHTTP.values()) {
            if (enumHTTP.code == code) {
				msg = enumHTTP.msg;
                break;
            }
        }

        return msg;
    }
	
}
