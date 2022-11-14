//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:    P05 Dragon Treasure Adventure 2.0
// Course:   CS 300 Fall 2022
//
// Author:   SUNGWON MUN
// Email:    smun4@wisc.edu
// Lecturer: Jeff Nyhoff
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name:    N/A
// Partner Email:   N/A
// Partner Lecturer's Name: N/A
// 
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
//   ___ Write-up states that pair programming is allowed for this assignment.
//   ___ We have both read and understand the course Pair Programming Policy.
//   ___ We have registered our team prior to the team registration deadline.
//
///////////////////////// ALWAYS CREDIT OUTSIDE HELP //////////////////////////
//
// Persons:         none
// Online Sources: none
//
///////////////////////////////////////////////////////////////////////////////
import java.util.ArrayList;

/**
 * The Class Character represents a generic character in the game.
 * @author SUNGWON MUN
 */
public class Character {

	/** The current room. */
	private Room currentRoom; //current room the character is in
	
	/** The label. */
	private String label; //a label giving a basic description of the character
	
	/**
	 * Instantiates a new character.
	 *
	 * @param currentRoom the current room
	 * @param label the label
	 * @throws IllegalArgumentException if currentRoom is null.
	 */
	public Character(Room currentRoom,
			 String label) {
		if(currentRoom == null)
			throw new IllegalArgumentException("The current room cannot be null");
		
		this.currentRoom = currentRoom;
		this.label = label;
	}
	
	/**
	 * Gets the current room.
	 *
	 * @return the current room
	 */
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
	
	/**
	 * Gets the label.
	 *
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	
	/**
	 * Gets the adjacent rooms.
	 *
	 * @return the adjacent rooms
	 */
	public ArrayList<Room> getAdjacentRooms() {
		return currentRoom.getAdjacentRooms();
	}
	
	/**
	 * Sets the current room.
	 *
	 * @param newRoom the new current room
	 */
	public void setCurrentRoom(Room newRoom) {
		this.currentRoom = newRoom;
	}
}
