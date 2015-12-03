package practicetest;

interface Hungry<E> {
	void munch(E x);
}

interface Carnivore<E extends Animal> extends Hungry<E> {}
// interface Herbivore<E extends Plant> extends Hungry<E> {}
interface Herbivore<E extends Animal> extends Hungry<E> {}
abstract class Plant {} 
abstract class Animal {}

class Grass extends Plant {
}

class Sheep extends Animal implements Herbivore<Sheep> {

	@Override
	public void munch(Sheep x) {
		// TODO Auto-generated method stub
		
	}

}

class Wolf extends Animal implements Carnivore<Sheep> {

	@Override
	public void munch(Sheep x) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Number6 {

}
