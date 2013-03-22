package land;
import java.util.List;

import program.Singleton;

public class Land {

	private List<Field> fields;

	/**
	 * 
	 * @return 
	 */
	public void loadLand() {
		Singleton s = Singleton.Instance();
		
		Integer id = s.stack.get(s.stack.size()-1);
		
		s.makeSpace(">> CALL: " + id + ": Land.loadLand()");
		s.depth--;
		// Ide j�n a k�d
		s.makeSpace("<< RETURN: " + id + ": Land.loadLand()");
		s.depth--;
		
	}

	/**
	 * 
	 * @return 
	 */
	public void putItems() {
		Singleton s = Singleton.Instance();
		
		Integer id = s.stack.get(s.stack.size()-1);
		
		s.makeSpace(">> CALL: " + id + ": Land.putItems()");
		s.depth--;
		// Ide j�n a k�d
		s.makeSpace("<< RETURN: " + id + ": Land.putItems()");
		s.depth--;
	}

	/**
	 * 
	 * @return 
	 */
	public void move() {
		Singleton s = Singleton.Instance();

		Integer id = s.stack.get(s.stack.size()-1);
		
		s.makeSpace(">> CALL: " + id + ": Land.move()");
		s.depth--;
		// Ide j�n a k�d
		s.makeSpace("<< RETURN: " + id + ": Land.move()");
		s.depth--;
	}

	/**
	 * 
	 * @return 
	 */
	public void buildLand() {
		Singleton s = Singleton.Instance();
		
		Integer id = s.stack.get(s.stack.size()-1);
		
		s.makeSpace(">> CALL: " + id + ": Land.buildLand()");
		
		// Field.addNeighbour h�v�sok
		s.stack.add(3);
		s.fields.get(2).addNeighbour(Dir.DOWN, s.fields.get(8));
		s.stack.remove(s.stack.size()-1);
		
		s.depth--;
		s.makeSpace("<< RETURN: " + id + ": Land.buildLand()");
		s.depth--;
	}

	/**
	 * 
	 * @return 
	 */
	public void init() {
		Singleton s = Singleton.Instance();

		Integer id = s.stack.get(s.stack.size()-1);
		
		s.makeSpace(">> CALL: " + id + ": Land.init()");
		
		/*ide j�n a k�d*/
		//palya bet�lt�se
		loadLand();
		//palya fel�p�t�se
		buildLand();
		//elemek palyara helyezese
		putItems();
		//leptetes
		move();
		
		s.depth--;
		
		s.makeSpace("<< RETURN: " + id + ": Land.init()");
		s.depth--;
	}

}


