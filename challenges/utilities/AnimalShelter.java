package utilities;

public class AnimalShelter {
    Node front;
    Node rear;
    Animal dog = new Dog();
    Animal cat = new Cat();

    public Animal enqueue(Animal animal){
          Node node = new Node(animal,null);

          if(animal instanceof Dog || animal instanceof Cat){
              if(this.front == null){
                  this.front = node;
                  this.rear = node;
                  return animal;
              }else{
                  this.rear.next = node;
                  this.rear = node;
                  return animal;
              }
          }else{
              return null;
          }
    }

    public Class dequeue(Animal pref){
        try {
                 Node temp;
                 temp = this.front;
                 this.front = this.front.next;
                 temp.next = null;

            if(pref.getClass() == dog.getClass() || pref.getClass() == cat.getClass() ){
                 return temp.animal.getClass();
             }else {
                 return null;
             }
        }catch (NullPointerException n){
            return null;
        }

    }

    public String toString() {
        Node print;
        String result = "";
        print = front;
        while(print != null){
            result+="{ "+print.animal.getName() + " }  -> ";
            print = print.next;
        }
        return "AnimalShelter " + result + " " + print;
    }

    public static void main(String[] args){
        AnimalShelter queue = new AnimalShelter();

        Animal randomAnimal = new Cat("Bear");


        System.out.println(queue.enqueue(randomAnimal));
    }
}
