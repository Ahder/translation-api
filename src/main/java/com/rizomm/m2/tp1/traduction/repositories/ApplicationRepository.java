package com.rizomm.m2.tp1.traduction.repositories;

import com.rizomm.m2.tp1.traduction.entites.Application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Integer> {
}
