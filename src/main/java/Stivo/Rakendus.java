package Stivo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }
 
	//lisage teine tervitusfunktsioon
	@RequestMapping("/algus2")
	String tervitusfunktsioon2() {
		return "Tere!!";
	}
	
	@RequestMapping("/tervita")
	String tervitusfunktsioon3(String eesnimi){
		return "Tere, "+ eesnimi;
	}
	
    public static void main(String[] args) {
		System.getProperties().put("server.port", 4444);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar