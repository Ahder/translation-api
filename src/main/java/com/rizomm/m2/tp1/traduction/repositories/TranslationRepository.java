package com.rizomm.m2.tp1.traduction.repositories;

import com.rizomm.m2.tp1.traduction.entites.Translation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranslationRepository extends CrudRepository<Translation, Integer> {
}
