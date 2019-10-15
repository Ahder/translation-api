package com.rizomm.m2.tp1.traduction.services.imp;

import com.rizomm.m2.tp1.traduction.entites.Application;
import com.rizomm.m2.tp1.traduction.entites.Translation;
import com.rizomm.m2.tp1.traduction.repositories.ApplicationRepository;
import com.rizomm.m2.tp1.traduction.repositories.TranslationRepository;
import com.rizomm.m2.tp1.traduction.services.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TranslationServiceImp implements TranslationService {

    @Autowired
    private TranslationRepository translationRepository;

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public Translation createTranslation(Translation translation, Integer applicationId) {
        // check if application exists
        Optional<Application> application = applicationRepository.findById(applicationId);
        if (application.isPresent()) {
        translation.setApplication(application.get());
        return  translationRepository.save(translation);
        }
        return null;
    }

    @Override
    public List<Translation> getAll() {
        return (List<Translation>) translationRepository.findAll();
    }
}
