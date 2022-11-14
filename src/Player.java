
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

/**
 * The Class Player represents the player of treasure game.
 * 
 * @author SUNGWON MUN
 */
public class Player extends Character implements Moveable {

	private boolean hasKey;

	/**
	 * Constructor for player object. The label should be "PLAYER" and not have a
	 * key by default.
	 *
	 * @param currentRoom the room that the player should start in
	 * @throws IllegalArgumentException if the currentRoom is not a StartRoom
	 */
	public Player(Room currentRoom) {
		super(currentRoom, "PLAYER");

		if (!(currentRoom instanceof StartRoom)) {
			throw new IllegalArgumentException("Player should start at start room");
		}

		hasKey = false;
	}

	/**
	 * Determines if the player has the key.
	 *
	 * @return true, if has the key
	 */
	public boolean hasKey() {
		return hasKey;
	}

	/**
	 * Gives player the key.
	 */
	public void obtainKey() {
		hasKey = true;
	}

	/**
	 * Moves the Player to the destination room.
	 *
	 * @param destination the Room to change it to
	 * @return true, if successful
	 */
	@Override
	public boolean changeRoom(Room destination) {
		if (!canMoveTo(destination))
			return false;

		setCurrentRoom(destination);
		return true;
	}

	/**
	 * Checks if the player can move to the given destination. A valid move is the
	 * destination is a room adjacent to the player.
	 *
	 * @param destination the destination
	 * @return true, if they can, false otherwise
	 */
	@Override
	public boolean canMoveTo(Room destination) {
		return getCurrentRoom().isAdjacent(destination);
	}

	/**
	 * Checks if the player needs to teleport and move them if needed.
	 *
	 * @return true, if successful
	 */
	public boolean teleport() {
		if (getCurrentRoom() instanceof PortalRoom) {
			setCurrentRoom(((PortalRoom) getCurrentRoom()).getTeleportLocation());
			return true;
		}

		return false;
	}

	/**
	 * Determines whether or not the given dragon is nearby. A dragon is considered
	 * nearby if it is in one of the adjacent rooms.
	 *
	 * @param d the dragon to check if nearby
	 * @return true, if is dragon nearby
	 */
	public boolean isDragonNearby(Dragon d) {
		return getCurrentRoom().isAdjacent(d.getCurrentRoom());
	}

	/**
	 * Determines whether or not a portal room is nearby. A portal room is
	 * considered nearby if it is one of the adjacent rooms.
	 *
	 * @return true, if is portal nearby
	 */
	public boolean isPortalNearby() {
		for (Room room : getAdjacentRooms()) {
			if (room instanceof PortalRoom)
				return true;
		}

		return false;
	}

	/**
	 * Determines whether or not the treasure room is nearby. The treasure room is
	 * considered nearby if it is one of the adjacent rooms.
	 *
	 * @return true, if is treasure nearby
	 */
	public boolean isTreasureNearby() {
		for (Room room : this.getAdjacentRooms()) {
			if (room instanceof TreasureRoom)
				return true;
		}

		return false;
	}

}
