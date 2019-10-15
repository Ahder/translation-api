package com.rizomm.m2.tp1.traduction.services;

import com.rizomm.m2.tp1.traduction.entites.Entry;

import java.util.List;

public interface EntryService {

    Entry updateEntry(Entry entry, Integer applicationId, Integer translationId, Integer entryId);

    Entry getEntry(Integer applicationId, Integer translationId, Integer entryId);

    Entry deleteEntry(Integer applicationId, Integer translationId, Integer entryId);

    List<Entry> getAllEntries();
}
