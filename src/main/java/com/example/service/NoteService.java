package com.example.service;

import com.example.entity.Note;
import com.example.entity.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class NoteService {
    private final NoteRepository noteRepository;

    public void deleteById(long id) {
        noteRepository.deleteById(id);
    }
    public Note getById(Long id){
       return noteRepository.getById(id);
    }
    public List<Note> listAll(){
        return noteRepository.findAll();
    }
    public void add(String title,String content ){
        Note newNote = new Note();
        newNote.setId(new RandomIdGenerator().generate());
        newNote.setTitle(title);
        newNote.setContent(content);
        noteRepository.save(newNote);
    }
    public void update(Note note,String newTitle, String newContent) {
        note.setTitle(newTitle);
        note.setContent(newContent);
        noteRepository.save(note);
    }

}
