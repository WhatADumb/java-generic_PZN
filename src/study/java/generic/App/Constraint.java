package study.java.generic.App;

public class Constraint {
    public static void main(String[] args) {
        DataNumber<Integer> intNumber = new DataNumber<Integer>(100);
        DataNumber<Double> doubleNumber = new DataNumber<Double>(200.45);

        intNumber.sayData();
        doubleNumber.sayData();

        // DataNumber<Boolean> boolNumber = new DataNumber<Boolean>(true); Error
    }

    public static class DataNumber<T extends Number>{
        private T type;

        public DataNumber(T type){
            this.type = type;
        }

        public T getType() {
            return this.type;
        }

        public void setType(T type) {
            this.type = type;
        }

        public void sayData(){
            System.out.println(this.type.intValue());
        }
    }
}