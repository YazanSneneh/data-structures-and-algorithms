package utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {


    @Test
    public void enqueue() {
        AnimalShelter queue = new AnimalShelter();
        Animal dog = new Dog("hatchiko");
        queue.enqueue(dog);

        Animal cat = new Cat("Savannah");
        queue.enqueue(cat);

        Animal cat2 = new Dog("cao Manee");
        queue.enqueue(cat2);

        assertEquals("Edge case test add when queue is empty",dog.getClass() ,queue.front.animal.getClass());


        assertNotNull("expected failure is that front is not pointing to next node",queue.front.next);
        assertEquals("expected failure rear is not pointing to last node","cao Manee",queue.rear.animal.getName());

        assertEquals("Happy Path everything is working perfectly", "AnimalShelter { hatchiko }  -> { Savannah }  -> { cao Manee }  ->  null", queue.toString());

        Animal bear = new Animal("bear");
        assertNull("when Animal is neither dog nor Cat, return Null",queue.enqueue(bear));
    }

    @Test
    public void dequeue() {
        AnimalShelter queue = new AnimalShelter();

        // edge case:
        assertNull("When Queue is empty return null", queue.front);

        Animal dog = new Dog("hatchiko");
        queue.enqueue(dog);

        Animal cat = new Cat("Savannah");
        queue.enqueue(cat);

        Animal bear = new Animal("Bear");
        queue.enqueue(bear);

        // edge cases & expected failure &  happy case(successfully remove and behave like expected):
        assertEquals("when pref object from Dog class then return dog type", queue.dog instanceof Dog ,  queue.enqueue(dog) instanceof Dog);
        assertEquals("when pref object from Cat class then return Cat type", queue.cat instanceof Cat ,  queue.enqueue(cat) instanceof Cat);
        assertNull("when Animal is neither dog nor Cat, return Null",queue.dequeue(bear));

    }
}