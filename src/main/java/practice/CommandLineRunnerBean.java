package practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerBean implements CommandLineRunner {

	@Autowired
	Thing thing;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("my thing: " + thing.name + "," + thing.age);
//		thing.setAge(10);
//		thing.setName("yoyo!");
	}
}
