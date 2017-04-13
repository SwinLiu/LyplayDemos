package com.lyplay.controller;

import static com.lyplay.model.RestResult.success;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyplay.model.LoginUser;
import com.lyplay.model.RestResult;

/**
 * 
 * Login Rest API Functions
 * 
 * @author lyplay.com
 *
 */

@Controller("loginController")
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@RequestMapping(value = "/api/login", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public RestResult login(@Valid @RequestBody LoginUser user, BindingResult result) throws Exception {
		StringBuffer sb = new StringBuffer();
		if(result.hasErrors()) {
            List<FieldError> errors = result.getFieldErrors();
            for(FieldError err : errors) {
            	sb.append("ObjectName:" + err.getObjectName() + ";\n");
            	sb.append("FieldName:" + err.getField() + ";\n");
            	sb.append("FieldValue:" + err.getRejectedValue() + ";\n");
            	sb.append("Message:" + err.getDefaultMessage() + ";\n");
            	sb.append("Code:" + err.getCode() + ";\n\n");
            }
        }
		
		return success(sb.toString());
	}
	
	
}
