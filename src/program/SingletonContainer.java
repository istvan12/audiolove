package program;

import item.Volatile;

import java.util.List;
import java.util.Map;

import land.Land;
import movable.Movable;

public class SingletonContainer {

	private Land container;
	private List<Movable> movable;
	private List<Volatile> volatiles;
	private static SingletonContainer instance;
	private Integer antKillerSpray;
	private Integer antSnellSpray;

	/**
	 * 
	 * @param Volatile
	 * @return 
	 */
	public void addVolatile(int Volatile) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Movable
	 * @return 
	 */
	public void addMovable(int Movable) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public static SingletonContainer getInstance() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public List<Movable> getMovables() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public List<Volatile> getVolatiles() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Volatile
	 * @return 
	 */
	public void removeVolatile(int Volatile) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Movable
	 * @return 
	 */
	public void removeMovable(int Movable) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Integer
	 * @return 
	 */
	public void decreaseAntKillerSpray(int Integer) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Integer
	 * @return 
	 */
	public void decreaseAntSmellSpray(int Integer) {
		throw new UnsupportedOperationException();
	}

}