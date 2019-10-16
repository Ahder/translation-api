package com.rizomm.m2.tp1.traduction.services;

import com.rizomm.m2.tp1.traduction.entites.Translation;

import java.util.List;

public interface TranslationService {

    Translation createTranslation(Translation translation, Integer applicationId);

    List<Translation> getAll();
}
