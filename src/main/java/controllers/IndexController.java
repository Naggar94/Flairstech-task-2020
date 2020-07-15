package controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import returnables.Error;

@RestController
public class IndexController implements ErrorController{

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public Error error() {
    	return new Error("INTERNAL_ERROR");
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
