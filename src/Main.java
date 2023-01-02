public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("1st");
        Singleton singleton1 = Singleton.getInstance("ciao");
        Singleton singleton2 = Singleton.getInstance("string");

        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());
        System.out.println(singleton2.getValue());
    }

}