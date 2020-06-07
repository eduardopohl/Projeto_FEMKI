package com.femkhra.Repositories;


import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.femkhra.Models.Cadastro;
import com.femkhra.Models.Equipamento;

public interface EquipamentoRepository extends CrudRepository<Equipamento, String>{

Iterable<Equipamento> findByCadastro(Cadastro cadastro);




}
