package pillihuaman.lib.shared.utils.constants;

import java.math.BigDecimal;

import com.google.gson.Gson;


public class Constantes {

	public static final Gson CONVER_TO_JSON = new Gson();
	public static final String HEADER_USUARIOBEAN = "X-Custom-Udata";
	public static final Long VALOR_LONG_0 = (long) 0;
	public static final BigDecimal VALOR_BIGDECIMAL_0 = new BigDecimal("0");
	public static final String CADENA_VACIA = "";
	public static final String SLASH = "/";
	public static final String PUNTO = ".";
	public static final String GUION = "-";
	public static final String PIPE = "|";
	public static final String SIGNO_MAYOR = ">";
	public static final String SIGNO_MENOR = "<";
	public static final String SIGNO_MAYOR_IGUAL = "<=";
	public static final String SIGNO_MENOR_IGUAL = ">=";
	public static final String EXCEPTION_PRE_DECLARACION = "ExceptionPreDeclaracion";
	public static final String INDICADOR_ACTIVO = "1";
	public static final String INDICADOR_INACTIVO = "0";
	public static final String INDICADOR_ELIMINADO = "1";
	public static final String INDICADOR_NO_ELIMINADO = "0";
	public static final String INDICADOR_RPTA_ERROR = "1";
	public static final String INDICADOR_RPTA_EXITOSO = "0";
	public static final String RUC_PERSONA_NATURAL = "10";
	public static final String RUC_PERSONA_JURIDICA = "20";
	public static final String RUC_PERSONA_JURIDICA_15 = "15";
	public static final String RUC_PERSONA_JURIDICA_17 = "17";

	public static final String CODIGO_TIPO_DOC_DNI = "01";
	public static final String CODIGO_TIPO_DOC_RUC = "06";

	public static final String FORM_PERSONA_NATURAL = "0709";
	public static final String FORM_PERSONA_JURIDICA = "0710";
	public static final String COD_USUARIO_TOPICO = "usuarioTopico";

	public static final String DESC_ERROR_EVENTO_NO_CTRLDO_CUS = "Evento no controlado por CU";
	public static final String DESC_ERROR_BD = "Error de conectividad de BD";
	public static final String DESC_ERROR_JSON = "Error de interpretaci\u00f3n del JSON (malformado)";
	public static final String DESC_ERROR_FECHA = "fecha de la transacci\u00f3n es menor a la fecha de inicio de implementaci\u00f3n de CU";
	public static final String DESC_ERROR_DDPCONTRIBUYENTE = "No se encontr\u00f3 el detalle de la anulaci\u00f3n";
	public static final String DESC_ERROR_PAGONOSENCUENTRAANULADO = "El pago no se encuentra anulado";
	public static final String DESC_ERROR_NOENCONTRODETALLEANULACION = "No se encontr\u00f3 el detalle de la anulaci\u00f3n";
	public static final String DESC_ERROR_NOENCONTRODETALLEDECLARACION = "No se encontr\u00f3 el detalle de la declaraci\u00f3n";
	public static final String DESC_ERROR_TIP_DOCUMENT = "Tipo de documento no controlado por CU";
	public static final String DESC_ERROR_SUNAT= "Error en SUNAT";

	public static final String CASILLAS_OF_FORMAT_DATE_INPUT_DDMMYYYY = "790";
	public static final String DESC_USER_CU = "usuRegisCU";

	public static final String TOPICO_TECNOLOGIA_SES_PORENVIAR_AED = "topic-tecnologia-ses-porenviar-aed";
	public static final String TOPICO_TECNOLOGIA_SES_RESPUESTA = "topic-tecnologia-ses-respuesta";
	public static final String TOPICO_TECNOLOGIA_SCUC_PORENVIAR_LEGADOS = "topic-tecnologia-scuc-porenviar-legados";
	public static final String TOPICO_TECNOLOGIA_SCUC_RESPUESTA_LEGADOS = "topic-tecnologia-scuc-respuesta-legados";

	public static final String CODIGO_ERROR_2001 = "2001";
	public static final String CODIGO_ERROR_2002 = "2002";
	public static final String CODIGO_ERROR_2003 = "2003";
	public static final String CODIGO_ERROR_2004 = "2004";
	public static final String CODIGO_ERROR_2005 = "2005";
	public static final String CODIGO_ERROR_2006 = "2006";
	public static final String CODIGO_ERROR_2007 = "2007";
	public static final String CODIGO_ERROR_2008 = "2008";
	public static final String CODIGO_ERROR_2009 = "2009";
	public static final String CODIGO_ERROR_2010 = "2010";
	public static final String CODIGO_ERROR_2011 = "2011";
	public static final String CODIGO_ERROR_2012 = "2012";
	public static final String CODIGO_ERROR_2013 = "2013";

	public static final String MENSAJE_ERROR_2001 = "La longitud del D.N.I. indicado no es v\u00e1lido";
	public static final String MENSAJE_ERROR_2002 = "La longitud del R.U.C. indicado no es v\u00e1lido";
	public static final String MENSAJE_ERROR_2003 = "Cliente debe ser diferente al Emisor";
	public static final String MENSAJE_ERROR_2004 = "La longitud del documento indicado no es v\u00e1lido";
	public static final String MENSAJE_ERROR_2005 = "Datos no v\u00e1lido para el documento '-' ";
	public static final String MENSAJE_ERROR_2006 = "Longitud no v\u00e1lida para la raz\u00f3n Social";
	public static final String MENSAJE_ERROR_2007 = "El DNI ingresado no existe o no es v\u00e1lido";
	public static final String MENSAJE_ERROR_2008 = "El RUC ingresado no existe o no es v\u00e1lido";
	public static final String MENSAJE_ERROR_2009 = "Debes ingresar un correo v\u00e1lido";
	public static final String MENSAJE_ERROR_2010 = "M\u00ednimo 5 caracteres para el campo desServicio";
	public static final String MENSAJE_ERROR_2011 = "Monto Total por Honorarios ingresado debe ser mayor a cero";
	public static final String MENSAJE_ERROR_2012 = "Solo puedes registrar 20 recibos por honorarios como frecuentes";
	public static final String MENSAJE_ERROR_2013 = "La fecha de emisi\u00f3n no es v\u00e1lida";

	public static final String CODIGO_ERROR_422 = "422";
	public static final String CODIGO_ERROR_500 = "500";

	public static final String MENSAJE_ERROR_500 = "Internal Server Error - Se present\u00f3 una condici\u00f3n inesperada que impidi\u00f3 completar el Request";
	public static final String MENSAJE_ERROR_422 = "Unprocessable Entity - Se presentar\u00f3n errores de validaci\u00f3n que impidieron completar el Request";

	public static final int CODIGO_CARACTER_0 = 0;
	public static final int CODIGO_CARACTER_15 = 15;
	public static final int CODIGO_CARACTER_5 = 5;
	public static final int CODIGO_CARACTER_60 = 60;
	public static final int CODIGO_CARACTER_100 = 100;
	public static final int CODIGO_CARACTER_250 = 250;

	public static final int NUMERO_DIAS_02 = 2;
	
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String DATE_FORMAT_JSON = "yyyy-MM-dd'T'HH:mm:ss.SSS";

	public static final String HOUR_START_FORMAT_MONGO = "T00:00:00Z";
	public static final String HOUR_END_FORMAT_MONGO = "T23:59:59Z";

	public static final String TIME_ZONE_GMT_5 = "GMT-5:00";
	
	public static final int INICIAR_PROCESO = 0;
	
	public static final int PROCESO_EXITOSO = 1;
	
	public static final int ERROR_PROCESO = 2;

	public static final String INSERTAR_RECIBO_RHE = "001";
	public static final String INSERTAR_PAGORECIBO_RHE = "002";
	public static final String INSERTAR_BAJARECIBO_RHE = "003";
	public static final String INSERTAR_NUEVOEMISOR_RHE = "004";
	public static final String INSERTAR_REVERTIR_RHE = "005";
	
	public static final String LINEA_CABECERA = "================================================================================";
	
	public static final String SCHEMA_VERSION_MONGO = "1.0";
}
