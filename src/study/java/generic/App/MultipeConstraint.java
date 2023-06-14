package study.java.generic.App;

public class MultipeConstraint {
    public static void main(String[] args) {
        // Data<Manager> managerData = new Data<Manager>(new Manager()); Error
        Data<VicePresident> vpData = new Data<VicePresident>(new VicePresident());
    }

    public interface canSayHello{
        void sayHello(String name);
    }

    public static abstract class Employee{
        
    }

    public static class Manager extends Employee{

    }

    public static class VicePresident extends Employee implements canSayHello{
        public void sayHello(String name) {
            System.out.println("Hello, " + name);
        }
    }

    public static class Data<T extends Employee & canSayHello>{
        private T type;

        public Data(T type){
            this.type = type;
        }

        public T getType() {
            return this.type;
        }

        public void setType(T type) {
            this.type = type;
        }
    }
}
