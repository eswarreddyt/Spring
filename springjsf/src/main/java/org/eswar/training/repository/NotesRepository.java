/**
 * 
 */
package org.eswar.training.repository;

import java.util.List;

import org.eswar.training.jbo.Notes;


/**
 * @author EswarReddy
 *
 */
public interface NotesRepository {
	

	public Notes returnNotesObj(String notes);
	
	public List<Notes> getAllNotes();
	
	public Notes returnNotesObjbyQuery(String notes);
	
	public void update(Notes notes) ;

	
}
