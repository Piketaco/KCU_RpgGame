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
import processing.core.PImage;

/**
 * The Class StartRoom represents a start room
 * 
 * @author SUNGWON MUN
 */
public class StartRoom extends Room{

	/**
	 * Instantiates a new start room.
	 *
	 * @param ID the id
	 * @param image the image
	 */
	public StartRoom(int ID, PImage image){
		super(ID, "You find yourself in the entrance to a cave holding treasure.", image);
	}
}
