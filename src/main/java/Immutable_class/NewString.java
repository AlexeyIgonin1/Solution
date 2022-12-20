package Immutable_class;

public final class NewString {

   private int count;
   private User user;

    public NewString(int count, User userP) {

        this.count = count;
        this.user = new User(userP.name, userP.age);
    }

    public int getCount() {
        return count;
    }

    public User getUser() {
        return new User(user.name, user.age);
    }

    @Override
    public String toString() {
        return "NewString{" +
                "count=" + count +
                ", user=" + user +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        NewString x = new NewString(5, new User("Anton", 8));
        User user1 = new User("Ivan", 8);
        User user2 = new User("Iva", 7);
        User user3 = new User("Ivan", 8);


       // User.staticInt = 7;
    }


}
