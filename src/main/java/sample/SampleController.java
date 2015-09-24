package sample;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@SpringBootApplication
public class SampleController {

    @RequestMapping("/get")
    public String index() {
        return "This is get method.";
    }
    
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String post() {
        return "This is post method.";
    }
    
    @RequestMapping(value = "/post/{var}", method = RequestMethod.POST)
    public String postWithInput(@PathVariable String var) {
        return "This method was called with variable: ".concat(var);
    }
    
    public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleController.class, args);
	}


}