package com.rizomm.m2.tp1.traduction.services;

import com.rizomm.m2.tp1.traduction.entites.Application;

import java.util.List;

public interface ApplicationService {

    List<Application> findAll();

    Application createApplication(Application application);

}
