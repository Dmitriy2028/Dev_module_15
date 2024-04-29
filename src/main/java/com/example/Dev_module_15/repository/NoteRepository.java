package com.example.Dev_module_15.repository;

import com.example.Dev_module_15.entity.Note;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class NoteRepository {
    private final Map<Long, Note> notes = new HashMap<>();
    private long nextId = 1;

    public List<Note> listAll() {
        return new ArrayList<>(notes.values());
    }

    public Note add(Note note) {
        note.setId(nextId++);
        notes.put(note.getId(), note);
        return note;
    }

    public void deleteById(long id) {
        if (!notes.containsKey(id)) {
            throw new IllegalArgumentException("Note with id " + id + " not found");
        }
        notes.remove(id);
    }

    public void update(Note note) {
        if (!notes.containsKey(note.getId())) {
            throw new IllegalArgumentException("Note with id " + note.getId() + " not found");
        }
        notes.put(note.getId(), note);
    }

    public Note getById(long id) {
        if (!notes.containsKey(id)) {
            throw new IllegalArgumentException("Note with id " + id + " not found");
        }
        return notes.get(id);
    }
}
