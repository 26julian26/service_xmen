package com.xmen.adapter.router.consts;

public class DataRouterConsts {
	
	 /**
	* componentes
	*/
	public static final String COMPONENT_SCAN = "com.xmen.adapter, com.xmen.domain";
	
	/*
	 * path controller
	 * */
	public static final String CONTROLLER_PATH = "/";
	public static final String MAPPING_POST_MUTANT = "/mutant";
	public static final String MAPPING_POST_STATS = "/stats";
	public static final String API = "Mutantes Xmen";
	public static final String CROSS_ORIGIN = "*";
	
	/**
	* operacones o metodos
	*/
	public static final String API_OPERATION_MUTANT = "muntant";
	public static final String API_OPERATION_STATS = "stats";
		
	/**
	* descripcion de operacione so metodos
	*/
	public static final String NOTE_API_OPERATION_MUTANTA = "Servicio que valida si un humano es mutante.";
	public static final String NOTE_API_OPERATION_STATS = "Servicio que muestra las estadisticas de las verificaciones de ADN";	
	
	/**
	* mensajes de respuesta de acuerdo al codigo http
	*/
	public static final String API_RESPONSE_COD_200 = "Consulta exitosa.";
	public static final String API_RESPONSE_COD_400 = "Falta algún parámetro en la cabecera.";
	public static final String API_RESPONSE_COD_422 = "Error servicio externo.";
	public static final String API_RESPONSE_COD_403 = "Error Forbidden.";
	public static final String API_RESPONSE_COD_500 = "Error Desconocido.";	
	
	/**
	* key headers
	*/
	public static final String HEADER_TIMESTAMP = "timestamp";
	public static final String HEADER_CONTENT_TYPE = "Content-Type";
	
	/**
	* swagger headers
	*/
	public static final String API_PARAM_TIMESTAMP = "Fecha y hora de la transaccion. Ej: 2020-02-21T10:00:00";
	public static final String API_PARAM_CONTENT_TYPE = "Tipo de contenido que sera retornado. Ej: application/json";
	
	/**
	* valores mock
	*/
	public static final String MOCK_2020_02_21T10_00_00 = "2020-02-21T10:00:00";
	public static final String MOCK_MENSAJE_ERROR = "error en la validación de datos de entrada.";
	public static final String MOCK_CONTENT_TYPE = "application/json";
	
	   /**
     * swagger
     */
    public static String SWAGGER_TITTLE = "Xmen - ADN";
    public static String SWAGGER_DESCRIPTION = "\"Xmen - ADN\"";
    public static String SWAGGER_VERSION = "1.0.0";	
    
    /**
    * operacones o metodos
    */
    public static final String API_OPERATION_COUNT_ACTIVE = "count_active";    
    
    /**
     * formato para el codigo de error
     */
    public static final String GENERIC_CODIGO_ERROR = "%1$s|%2$s|%3$s";    
    
    /**
     * vaalores Mock
     */
    public static final String MOCK_MS = "MS";    
    
    /*
     * mensajes de error 
     * */ 
    public static final String MSG_ERROR_PARAMETROS_VACIOS = "Algún campo obligatorio esta vacío"; 
}
