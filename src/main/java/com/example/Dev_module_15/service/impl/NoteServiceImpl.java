package com.example.Dev_module_15.service.impl;

import com.example.Dev_module_15.entity.Note;
import com.example.Dev_module_15.repository.NoteRepository;
import com.example.Dev_module_15.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    NoteRepository noteRepository;

    @Override
    public List<Note> listAll() {
        return noteRepository.listAll();
    }

    @Override
    public Note add(Note note) {
        return noteRepository.add(note);
    }

    @Override
    public void deleteById(long id) {
        noteRepository.deleteById(id);
    }

    @Override
    public void update(Note note) {
        noteRepository.update(note);
    }

    @Override
    public Note getById(long id) {
        return noteRepository.getById(id);
    }
}
