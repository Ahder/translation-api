package com.rizomm.m2.tp1.traduction.services.imp;

import com.rizomm.m2.tp1.traduction.entites.Application;
import com.rizomm.m2.tp1.traduction.entites.Entry;
import com.rizomm.m2.tp1.traduction.entites.Translation;
import com.rizomm.m2.tp1.traduction.repositories.ApplicationRepository;
import com.rizomm.m2.tp1.traduction.repositories.EntryRepository;
import com.rizomm.m2.tp1.traduction.repositories.TranslationRepository;
import com.rizomm.m2.tp1.traduction.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntryServiceImp implements EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private ApplicationRepository applicationRepository;

    @Autowired
    private TranslationRepository translationRepository;

    @Override
    public Entry updateEntry(Entry entry, Integer applicationId, Integer translationId, Integer entryId) {
        Optional<Application> application = applicationRepository.findById(applicationId);
        if(application.isPresent())
        {
            Optional<Translation> translation = translationRepository.findById(translationId);
            if (translation.isPresent()) {
                Optional<Entry> entry1 = entryRepository.findById(entryId);
                if (entry1.isPresent()) {
                    entry.setId(entryId);
                    return entryRepository.save(entry);
                }
            }
        }
        return null;
    }

    @Override
    public Entry getEntry(Integer applicationId, Integer translationId, Integer entryId) {
        Optional<Application> application = applicationRepository.findById(applicationId);
        if(application.isPresent()) {
            Optional<Translation> translation = translationRepository.findById(translationId);
            if (translation.isPresent()) {
                Optional<Entry> entry = entryRepository.findById(entryId);
                if (entry.isPresent()) {
                    return entry.get();
                }
            }
        }
        return null;
    }

    @Override
    public Entry deleteEntry(Integer applicationId, Integer translationId, Integer entryId) {
        Entry entry = getEntry(applicationId, translationId, entryId);
        if(entry != null)
        {
            entryRepository.deleteById(entryId);
        }
        return entry;
    }

    @Override
    public List<Entry> getAllEntries() {
        return (List<Entry>) entryRepository.findAll();
    }
}
