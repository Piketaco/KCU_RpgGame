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

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Class Room represents a room.
 * 
 * @author SUNGWON MUN
 */
public class Room {

	/** The description. */
	private String description; // verbal description of the room
	
	/** The adj rooms. */
	private ArrayList<Room> adjRooms; // list of all rooms directly connect
	
	/** The id. */
	private final int ID; // a "unique" identifier for each room
	
	/** The processing. */
	protected static PApplet processing; // PApplet object which the rooms will use to
	
	/** The image. */
	// draw stuff to the GUI
	private PImage image; // stores the image that corresponds to the background of a room

	/**
	 * Instantiates a new room.
	 *
	 * @param id          the id
	 * @param description the room description
	 * @param image the image
	 */
	public Room(int id, String description, PImage image) {
		ID = id;
		this.description = description;
		adjRooms = new ArrayList<>();
		this.image = image;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Gets the adjacent rooms.
	 *
	 * @return the adjacent rooms
	 */
	public ArrayList<Room> getAdjacentRooms() {
		return adjRooms;
	}

	/**
	 * Adds the to adjacent rooms.
	 *
	 * @param toAdd the to add
	 */
	public void addToAdjacentRooms(Room toAdd) {
		adjRooms.add(toAdd);
	}

	/**
	 * Gets the room description.
	 *
	 * @return the room description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the processing for the class.
	 * 
	 * @param processing the PApplet that this room will use to draw to the window
	 */
	public static void setProcessing(PApplet processing) {
		Room.processing = processing;
	}



	/**
	 * Checks if is adjacent.
	 *
	 * @param r the room
	 * @return true, if is adjacent
	 */
	public boolean isAdjacent(Room r) {
		return adjRooms.contains(r);
	}

	/**
	 * Determines if the given object is equal to this room. They are equal if other
	 * is a Room and their IDs are the same.
	 *
	 * @param other the other
	 * @return true if the two rooms are equal, false otherwise
	 */
	@Override
	public boolean equals(Object other) {
		if (other instanceof Room) {
			Room otherRoom = (Room) other;
			return this.ID == otherRoom.ID;
		}
		return false;
	}

	/**
	 * Returns a String representation of this room.
	 *
	 * @return Returns a string in the form of "<ID>: <description>\n Adjacent
	 *         Rooms: <r1's ID> <r2's ID>" list of adjacent room IDs continues for
	 *         all rooms adjacent to this Room.
	 */
	@Override
	public String toString() {
		String s = this.ID + ": " + this.description + "\n Adjacent Rooms: ";
		for (int i = 0; i < adjRooms.size(); i++) {
			s += adjRooms.get(i).ID + " ";
		}
		return s.trim();
	}
	
	/**
	 * Draws this Room to the window by drawing the background image, a rectangle, and some text.
	 */
	public void draw() {
		processing.image(image, 0, 0);
		processing.fill(-7028);
		processing.rect(0, 500, 800, 600);
		processing.fill(0);
		processing.text(toString(), 300, 525);
	}

}
