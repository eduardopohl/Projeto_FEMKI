package com.femkhra.Repositories;

import java.util.List;

import com.femkhra.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<Usuario, String> {

	List<Usuario> findByNameLike(String name); 

}
