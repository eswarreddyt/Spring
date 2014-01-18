/**
 * 
 */
package org.eswar.training.jbo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author EswarReddy
 *
 */
@Entity
@Table(name="NOTEX")
public class Notes {
	
	@Column(name="NOTES")
	public String notes;
	
	@Id
	@Column(name="MASTER_ID")
	public String polnumber;

	public Notes()
	{
		
		
	}
	public Notes(String notes, String polnumber) {
		this.notes = notes;
		this.polnumber = polnumber;
	}

	
	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	public String getPolnumber() {
		return polnumber;
	}

	public void setPolnumber(String polnumber) {
		this.polnumber = polnumber;
	}

	@Override
	public String toString() {
		return "Notes [notes=" + notes + ", polnumber=" + polnumber + "]";
	}




}
