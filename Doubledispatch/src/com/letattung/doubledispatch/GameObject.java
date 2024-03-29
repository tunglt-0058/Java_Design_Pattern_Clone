/*
 * hoc theo project java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/double-dispatch
 */
package com.letattung.doubledispatch;

public abstract class GameObject extends Rectangle{

	private boolean damaged;
	private boolean onFire;
	
	public GameObject(int left, int right, int top, int bottom) {
		super(left, right, top, bottom);
	}

	@Override
	public String toString(){
		return String.format("%s at %s damaged=%b onFire=%b", this.getClass().getSimpleName(), super.toString(), isDamaged(), isOnFire());
	}
	
	public boolean isOnFire(){
		return onFire;
	}
	
	public void setOnFire(boolean onFire){
		this.onFire = onFire;
	}
	
	public boolean isDamaged(){
		return damaged;
	}
	
	public void setDamaged(boolean damaged){
		this.damaged = damaged;
	}
	
	public abstract void collision(GameObject gameObject);
	public abstract void collisionResolve(FlamingAsteroid flamingAsteroid);
	public abstract void collisionResolve(Meteoroid meteoroid);
	public abstract void collisionResolve(SpaceStationMir spaceStationMir);
	public abstract void collisionResolve(SpaceStationIss spaceStationIss);
}
