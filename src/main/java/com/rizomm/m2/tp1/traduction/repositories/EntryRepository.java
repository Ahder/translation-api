package com.rizomm.m2.tp1.traduction.repositories;

import com.rizomm.m2.tp1.traduction.entites.Entry;
import org.springframework.data.repository.CrudRepository;

public interface EntryRepository extends CrudRepository<Entry, Integer> {
}
