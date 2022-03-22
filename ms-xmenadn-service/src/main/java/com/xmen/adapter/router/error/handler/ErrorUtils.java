package com.xmen.adapter.router.error.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static com.xmen.adapter.router.consts.DataRouterConsts.GENERIC_CODIGO_ERROR;
import static com.xmen.adapter.router.consts.DataRouterConsts.MOCK_MS;
import static com.xmen.adapter.router.consts.DataRouterConsts.MSG_ERROR_PARAMETROS_VACIOS;

public class ErrorUtils {

    /**
     * metodo que envia errores de  parametros de entrada en el facade
     * @param nombreMetodo
     * @return
     */
    public static ResponseEntity<Object> enviarErrorParametrosFacade(String nombreMetodo) {
        ResponseErrorMessageDTO errorMessage = new ResponseErrorMessageDTO(String.format(GENERIC_CODIGO_ERROR,MOCK_MS,nombreMetodo, HttpStatus.UNPROCESSABLE_ENTITY.value()), MSG_ERROR_PARAMETROS_VACIOS);
        return new ResponseEntity<>(errorMessage, HttpStatus.UNPROCESSABLE_ENTITY);
    }
}