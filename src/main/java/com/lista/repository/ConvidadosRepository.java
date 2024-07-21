package com.lista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lista.model.ConvidadosModel;

public interface ConvidadosRepository extends JpaRepository<ConvidadosModel, Long> {
	ConvidadosModel findByName(String name);
}

