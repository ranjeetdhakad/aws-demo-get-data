package now.aws.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import now.aws.demo.entity.Account;
import now.aws.demo.service.GetApiService;

@RestController
@RequestMapping(value = "/api/")
public class GetApiController {
	
	private final GetApiService service;
	
	   @Autowired
	    public GetApiController(GetApiService service) {
	        this.service = service;
	    }
	 @RequestMapping(value = "/account/{accountId}",
	            method = RequestMethod.GET,
	            produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	    @ResponseBody
	    public ResponseEntity<?> getAccountById( 
	            @PathVariable Long accountId) {

	        ResponseEntity<?> ret = null;

	        try {

	            Account account = service.getAccount(accountId);
	            ret = new ResponseEntity<>(account, HttpStatus.OK);
	        } catch (Exception ex) {
	        	ex.printStackTrace();
	        	 ret = new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	        }

	        return ret;
	    }

}
