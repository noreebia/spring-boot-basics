package practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class MainController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	Thing aThing;
	
	@GetMapping("/")
	public Thing route() {
		System.out.println("a connection!");
		logger.info("loggin!!");
		logger.debug("debuggin!");
		logger.warn("warning!!");
		return aThing;
//		return "";
	}
}
