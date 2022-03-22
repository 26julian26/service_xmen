package com.xmen.adapter.router.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.xmen.adapter.router.error.handler.ResponseErrorMessageDTO;
import com.xmen.adapter.router.facade.XmenFacade;
import static com.xmen.adapter.router.consts.DataRouterConsts.MAPPING_POST_MUTANT;
import static com.xmen.adapter.router.consts.DataRouterConsts.CROSS_ORIGIN;
import static com.xmen.adapter.router.consts.DataRouterConsts.CONTROLLER_PATH;
import static com.xmen.adapter.router.consts.DataRouterConsts.MAPPING_POST_STATS;
import static com.xmen.adapter.router.consts.DataRouterConsts.API_RESPONSE_COD_200;
import static com.xmen.adapter.router.consts.DataRouterConsts.API_RESPONSE_COD_400;
import static com.xmen.adapter.router.consts.DataRouterConsts.API_RESPONSE_COD_403;
import static com.xmen.adapter.router.consts.DataRouterConsts.API_RESPONSE_COD_422;
import static com.xmen.adapter.router.consts.DataRouterConsts.API_RESPONSE_COD_500;
import static com.xmen.adapter.router.consts.DataRouterConsts.API_PARAM_TIMESTAMP;
import static com.xmen.adapter.router.consts.DataRouterConsts.MOCK_2020_02_21T10_00_00;
import static com.xmen.adapter.router.consts.DataRouterConsts.HEADER_TIMESTAMP;
import static com.xmen.adapter.router.consts.DataRouterConsts.API_PARAM_CONTENT_TYPE;
import static com.xmen.adapter.router.consts.DataRouterConsts.MOCK_CONTENT_TYPE;
import static com.xmen.adapter.router.consts.DataRouterConsts.HEADER_CONTENT_TYPE;
import static com.xmen.adapter.router.consts.DataRouterConsts.API;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(CROSS_ORIGIN)
@RequestMapping(path = CONTROLLER_PATH)
@Validated
@Api(tags = API)
public class XmenController {
		
	@Autowired
	private XmenFacade xmenFacade;	
	
	
	@RequestMapping(value = MAPPING_POST_MUTANT, method = RequestMethod.POST)
	@ApiResponses(value = {
			 @ApiResponse(code = 200, message=API_RESPONSE_COD_200),
			 @ApiResponse(code = 400, message=API_RESPONSE_COD_400, response = ResponseErrorMessageDTO.class),
			 @ApiResponse(code = 422, message=API_RESPONSE_COD_422, response = ResponseErrorMessageDTO.class),
			 @ApiResponse(code = 422, message=API_RESPONSE_COD_403, response = ResponseErrorMessageDTO.class),
			 @ApiResponse(code = 500, message=API_RESPONSE_COD_500, response = ResponseErrorMessageDTO.class)
			})	
	public ResponseEntity<Object> mutant(
            @ApiParam(value = API_PARAM_TIMESTAMP, required = true, example = MOCK_2020_02_21T10_00_00) @Valid @RequestHeader(name = HEADER_TIMESTAMP, required = true) String timeStamp,
            @ApiParam(value = API_PARAM_CONTENT_TYPE, required = true, example = MOCK_CONTENT_TYPE) @Valid @RequestHeader(name = HEADER_CONTENT_TYPE, required = true) String contentType,
            @Valid @RequestBody String request			
	    ) {			
	        return xmenFacade.validateMutants(timeStamp, contentType, request);
	    }	
	    
	
	@RequestMapping(value = MAPPING_POST_STATS, method = RequestMethod.GET)
	@ApiResponses(value = {
			 @ApiResponse(code = 200, message=API_RESPONSE_COD_200),
			 @ApiResponse(code = 400, message=API_RESPONSE_COD_400, response = ResponseErrorMessageDTO.class),
			 @ApiResponse(code = 422, message=API_RESPONSE_COD_422, response = ResponseErrorMessageDTO.class),
			 @ApiResponse(code = 422, message=API_RESPONSE_COD_403, response = ResponseErrorMessageDTO.class),
			 @ApiResponse(code = 500, message=API_RESPONSE_COD_500, response = ResponseErrorMessageDTO.class)
			})	
	public String stats(
            @ApiParam(value = API_PARAM_TIMESTAMP, required = true, example = MOCK_2020_02_21T10_00_00) @Valid @RequestHeader(name = HEADER_TIMESTAMP, required = true) String timeStamp,
            @ApiParam(value = API_PARAM_CONTENT_TYPE, required = true, example = MOCK_CONTENT_TYPE) @Valid @RequestHeader(name = HEADER_CONTENT_TYPE, required = true) String contentType			
	    ) {
	        return "stats";
	    }		
	
}
