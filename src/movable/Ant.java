package movable;

import program.Singleton;
import item.Item;
import item.Tentacle;
import land.Dir;

public class Ant extends Item implements Movable {

	private Tentacle tentacle;
	private Boolean isKilled = false;
	private Boolean isActive = false;
	private Integer wait;
	private Boolean haveFood = false;
	private Integer HP;
	private Dir dir;

	/**
	 * 
	 * @param Integer
	 * @return 
	 */
	public void lostHP(int Integer) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public void pickUpFood() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public void rest() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public void reverseDir() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public void kill() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Dir
	 * @return 
	 */
	public void setDir(int Dir) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAlive() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * @param ant - 
	 * @param b - 
	 */
	@Override
	public void collisionWithAnt(Ant ant, boolean b) {
		Singleton s = Singleton.Instance();
		
		Integer id = s.stack.remove(s.stack.size()-1);
		
		s.makeSpace(">> CALL: " + id + ": Ant.collisionWithAnt(" + s.ants.indexOf(ant) + ": Ant, " + String.valueOf(b) + ")");
		s.depth--;
		
		s.makeSpace("<< RETURN: " + id + ": Ant.collisionWithAnt(" + s.ants.indexOf(ant) + ": Ant, " + String.valueOf(b) + ")");
		s.depth--;
	}
}

