package com.xmen.adapter.router.facade;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.xmen.domain.models.RequestInHeadersDTO;
import com.xmen.domain.service.XmenService;
import static com.xmen.adapter.router.consts.DataRouterConsts.API_OPERATION_COUNT_ACTIVE;
import static com.xmen.adapter.router.error.handler.ErrorUtils.enviarErrorParametrosFacade;
import java.util.Arrays;
import java.util.List;

@Component
public class XmenFacade {
	
	@Autowired
	private XmenService xmenService; 

	public ResponseEntity<Object> validateMutants(String timestamp, String contentType, String request) {
		String[] vectorFields = { timestamp, contentType };
		// validar campos obligatorios que no esten vacios
		if (!checkFields(vectorFields)) {
			return enviarErrorParametrosFacade(API_OPERATION_COUNT_ACTIVE);
		} else {
			// instanciamos el objeto para los headers
			RequestInHeadersDTO requestInHeaders = new RequestInHeadersDTO(timestamp, contentType);
			return xmenService.validateMutants(requestInHeaders, request);
		}
	}

	private boolean checkFields(String[] vectorFields) {
		List<String> fields = Arrays.asList(vectorFields);
		for (String field : fields) {
			if (Strings.isEmpty(field)) {
				return false;
			}
		}
		return true;
	}

}
