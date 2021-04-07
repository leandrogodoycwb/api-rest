package com.github.leandrogodoycwb.apijavaaula.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.leandrogodoycwb.apijavaaula.models.Aula;

public interface AulaRepository extends JpaRepository<Aula, Long> {
	Aula findById(long id);
}
