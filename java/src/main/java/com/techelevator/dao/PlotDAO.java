package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Crop;
import com.techelevator.model.Note;
import com.techelevator.model.Plot;

public interface PlotDAO {

	List<Plot> listAllForUser(int userId);
	
	Plot plotById(int plotId);
		
	int create(Plot plot);

	void userPlot(int userId, int plotId);
	
	List<Note> getAllNotesForUser(int plotId);
	
	void addNewNote(Note newNote);

	void deleteNote(int id);

	void updateNote(Note updatedNote, int id);
	
	void abandonPlot(int plotId);
	
	void activatePlot(int plotId);
}
