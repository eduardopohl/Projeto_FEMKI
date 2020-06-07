package com.femkhra;

import com.femkhra.Models.Usuario;
import com.femkhra.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MVCApplication  implements  CommandLineRunner{
	
	   @Autowired
	   private UsuarioService usuarioService;
	     
	public static void main(String[] args) {
		SpringApplication.run(MVCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		  {
 // 		  Usuario newAdmin = new Usuario("admin@adm.com", "Admin", "121234");
 //  		  usuarioService.createAdmin(newAdmin); 
    	  }
	}  
}
