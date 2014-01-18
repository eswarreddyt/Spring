package org.eswar.training.bean;

import java.util.List;

import org.eswar.training.jbo.Notes;
import org.eswar.training.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class NotesBean {
	
	@Autowired
	NotesRepository notesRepository;
	
	String notes;

	public NotesRepository getNotesRepo() {
		return notesRepository;
	}

	public void setNotesRepo(NotesRepository notesRepo) {
		this.notesRepository = notesRepo;
	}
	
	
	public void getNotes()
	{
		List<Notes> notesList = notesRepository.getAllNotes();
		this.notes = notesList.toString();
	}
	
	public void updateNotes()
	{
		
		Notes notesobj = new Notes();
		notesobj.setNotes(this.notes);
		notesRepository.update(notesobj);
		
	}

}
