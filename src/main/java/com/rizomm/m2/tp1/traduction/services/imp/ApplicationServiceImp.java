package com.rizomm.m2.tp1.traduction.services.imp;

import com.rizomm.m2.tp1.traduction.entites.Application;
import com.rizomm.m2.tp1.traduction.entites.Translation;
import com.rizomm.m2.tp1.traduction.repositories.ApplicationRepository;
import com.rizomm.m2.tp1.traduction.repositories.TranslationRepository;
import com.rizomm.m2.tp1.traduction.services.ApplicationService;
import com.rizomm.m2.tp1.traduction.services.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImp implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public List<Application> findAll() {
        return (List<Application>) applicationRepository.findAll();
    }

    @Override
    public Application createApplication(Application application) {
        application.setId(null);
        return applicationRepository.save(application);
    }


}
