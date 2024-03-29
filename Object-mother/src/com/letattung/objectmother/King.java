/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/object-mother
 */
package com.letattung.objectmother;

public class King implements Royalty{

	boolean isDrunk = false;
	boolean isHappy = false;
	
	@Override
	public void makeDrunk() {
		isDrunk = true;
	}

	@Override
	public void makeSober() {
		isDrunk = false;
	}

	@Override
	public void makeHappy() {
		isHappy = true;
	}

	@Override
	public void makeUnhappy() {
		isHappy = false;
	}

	public boolean isHappy(){
		return isHappy;
	}
	
	public void flirt(Queen queen) {
		boolean flirtStatus = queen.getFlirted(this);
		if (flirtStatus == false){
			this.makeUnhappy();
		}else{
			this.makeHappy();
		}
	}
}
