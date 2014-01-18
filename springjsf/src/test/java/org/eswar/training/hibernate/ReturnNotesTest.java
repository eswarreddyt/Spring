package org.eswar.training.hibernate;

import org.eswar.training.jbo.Notes;

import org.eswar.training.repository.NotesRepository;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;


public class ReturnNotesTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/org/eswar/training/jbo/application-config.xml");
		
		//ReturnNotes notes = context.getBean(ReturnNotes.class);
		NotesRepository notesRepository = (NotesRepository)context.getBean("notesRepository");
		
		String polnumber = "POL1234";
		
		Notes notesObj = notesRepository.returnNotesObj(polnumber);
		System.out.println(notesObj.getNotes());
		
		notesObj.setNotes("updating notes of policy"+polnumber);
		
		notesRepository.update(notesObj);
		notesObj = notesRepository.returnNotesObj(polnumber);
		System.out.println(notesObj.getNotes());


	}

}
