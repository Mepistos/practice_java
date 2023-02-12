public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Car myCar = new Car("Hyondai", 2023, "Black");

    }

    class Car{
        // field
        private String modelName;
        private int modelYear;
        private String color;
    
        // method
        public String getModel(){
            return this.modelName + ", " + this.modelYear + ", " + this.color;
        }
    
        Car(String modelName, int modelYear, String color){
            this.modelName = modelName;
            this.modelYear = modelYear;
            this.color = color;
        }
    }
}


/*
    OOP -> oobject oriented programming

    class: it's a blueprint, define the object
    instance: real working object. -> it's on the memory

    ex) class vs. instance
        Car -> the largest group        => class
        filed:
            car.modelName = "Honda"
            car.modelYear = 2023
            car.color = "Black"
            car.maxSpeed = 250
        
        method:
            car.accelerate()
            car.brake()

        myCar = new Car(~~~~)           => instance
        friendsCar = new Car(~~~~)      => instance

    field & method
        field: properties
        method: functions
            def.
                access_modifier return_type method_name(parameters) {
                    operations
                }

                access modifier: for data hiding
                    private: only through the inner public method
                    public: anywhere in using that object
                    default: if not define the access modifier, it's a default. same class and smae packages can accessable
                    protected: can access down below
                        1. class member that define the this object
                        2. package member, contain the class that define the this object
                        3. child class, heritage the class that define the this object
                return type: int double char ... etc.
                method name: define the name for method call
                parameters: arguments for running the method
                operations: real operation
            
            ** method overloading
                in java, cannot use same method name
                but using method overloading, you can define the same name for method
                same name methods are difference in the parameters
                    parameters type, number of parameters
                it can be reduce the characters for methods        
*/

/*
    class

    class is contain members, field and method
    and also, have the constructor
    ex)
        class Car() {
            // field
            private String modelName;
            private int modelYear;
            private String color;

            // constructor
            Car(String modelName, int modelYear){
                this.modelName = modelName;
                this.modelYear = modelYear;
            }

            // method
            public String getModel(){
                return this.modelName + ", " + this.modelYear + ", " + this.color;
            }
        }
    
    field: variables in the class. there is 3 types
        1. class variable(static variable)
        2. instance variable
        3. local variable
    method: group of operations
    constructor: it initialize the instance's field
*/

/*
    define class and using class

    - the most important thing is OOP's abstraction
    
    how to define the class
        access_modifier class class_name {
            //field
            ...
            //method
            ...
        }

    how to create instance
        class_name obj_name;
        obj_name = new class_name();
        
        ex) public class Car() {~~~}
            Car myCar;
            myCar = new Car();

        you can write in one line
        class_name = obj_name = new class_name();
        
        ex) public class Car() {~~~}
            Car myCar = new Car();
*/

