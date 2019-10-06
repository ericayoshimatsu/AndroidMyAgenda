package com.motchan.myagenda.DAO;

import com.motchan.myagenda.model.ListEntry;

import java.util.ArrayList;
import java.util.List;

public class EntryDAO {

    private final static List<ListEntry> listEntry = new ArrayList<>();
    public List<ListEntry> alltEntries() {
        return new ArrayList<>(listEntry);
    }

    public void save(ListEntry entry) {
        listEntry.add(entry);

    }
}
