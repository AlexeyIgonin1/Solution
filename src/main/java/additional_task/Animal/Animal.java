package additional_task.Animal;

public class Animal{
    public static void main(String[] args) {
        Cat mars = new Cat();
        Dog dug = new Dog();
        mars.sayHello();
        dug.sayHello();
        dug.catchCat(mars);
    }

        public static class Cat {
            public void sayHello() {
                System.out.println("Мяу!!!");
            }
        }

        public static class Dog {
            public void sayHello() {
                System.out.println("Гаф!!!");
            }

            public void catchCat(Cat cat) {
                System.out.println("Кошка поймана!!!");
            }
        }
    }


