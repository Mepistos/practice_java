import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Stream;

public class App {

    int field1;
    String field2;

    int num1, num2;
    double num3 = 3.14;
    double num4 = 1.23, num5 = 4.56;

    // const
    final int AGES = 20;
    // literal
    int var = 30;               // 30 is literal
    final int LIT_TEMP = 100;   // 100 is literal

    /*
        type
            - integer
                byte    1byte 
                short   2byte
                int     4byte
                long    8byte
            - real number
                float   4byte(8bit+23bit)
                double  8byte(11bit+52bit)
            - character
                char    2byte
            - logical
                boolean 1byte


        type conversion
            - implicit conversion
                is automatically, by the compiler
                byte -> short -> int -> long -> float -> double
                        char ↗
                ex)
                    double num1 = 10;
                    System.out.println(num1);
                    
                    10.0
                    -> int literal이 doulbe varialbe에 대입되면서 int->double의 자동변환이 이루어짐
            - explicit conversion
                using typecast (type)
                ex)
                    int num1=1, num2=4;

                    double result1 = num1/num2;
                    double result2 = (double)num1/num2;

                    System.out.println(result1);
                    System.out.println(result2);

                    0.0
                    0.25
                    -> using the typecast (double), then result is change the double calc.
     */

     /*
        operator
            - arithmetic
                +
                -
                *
                /
                %
            - assignment
                =
                +=
                -=
                *=
                /=
                %=
                &=
                |=
                ^=
                <<=
                >>=
                >>>=
            - increment and decrement
                ++
                --
            - comparison
                ==
                !=
                >
                >=
                <
                <=
            - logical
                &&
                ||
                !
            - bitwise
                &
                |
                ^
                ~
                <<
                >>
                >>>
            - ternary
                cond ? ret1 : ret2
                ex)
                    int num1=5, num2=7;
                    int result;

                    result = (num1-num2 >0) ? num1 : num2;
                    System.out.println(result);
                    
                    7
            - instanceof
                 참조변수가 참조하고 있는 인스턴스의 실제 타입을 반환
                    => 해당 객체가 어떤 클래스, 인터페이스로부터 생성되었는지를 판별해 주는 역할
                (instance_name) instanceof (class_name or interface_name)
                ex)
                    class A{}
                    class B extends A{}
                    public static void main(String[] args){
                        A a = new A();
                        B b = new B();
                        System.out.println(a instanceof A); // true
                        System.out.println(b instanceof A); // true
                        System.out.println(a instanceof B); // false
                        System.out.println(b instanceof B); // true
                    }
    */

    /*
        control flow statements
            - conditional statements
                if
                if / else
                if / else if / else
                switch - case
            - iteration statements
                while
                do / while
                for
                Enhanced for -> iteration statements for collection framework and arrays
            - etc.
                loop control
                    continue
                    break
                    break with label
                        ex)
                            allLoop :
                            for (int i=2;i<10;i++){
                                for(int j=2;j<10;j++){
                                    if(i==5)
                                        break allLoop;
                                }
                                System.out.println(i+" * "+j+" = "+(i*j));
                            }
    */

    /*
        array
            - d1
                type[] name;
                type name[];

                name = new type[len];

                ex)
                    int[] temp = new int[3];
                    temp[0] = 1;
                    temp[1] = 2;
                    temp[2] = 3;

                type                init_value
                char                '\u0000'
                byte/short/int      0
                long                0L
                float               0.0F
                double              0.0 or 0.0D
                boolean             false
                array/instance/etc. null

                - init
                    type[] name = {ele1, ele2, ...};
                    type[] name = new type[]{ele1, ele2, ...};
            - dn
                type[][] name;
                type name[][];
                type[] name[];

                ex)
                    int[][] arr = new int[2][3];

                    int k = 10;
                    for (int i=0;i<arr.length;i++){
                        for (int j=0;j<arr[i].length;j++){
                            arr[i][j] = k;
                            k += 10;
                        }
                    }
                
                - init
                    type name[num of row][num of col] = {
                        {ele[0][0], ele[0][1], ...},
                        {ele[1][0], ele[1][1], ...},
                        ...
                    };
            - dynamic
                ex)
                    int[][] arr = new int[3][];
                    arr[0] = new int[2];
                    arr[1] = new int[4];
                    arr[2] = new int[1];
            - array copy
                - System class: arraycopy() method
                - Array class: copyOf() method
                - Object class: clone() method
                - copy with using for statement and index
                ex)
                    int[] arr1 = new int[]{1,2,3,4,5};
                    int newLen = 10;

                    // System class
                    int[] arr2 = new int[newLen];
                    System.arraycopy(arr1, 0, arr2, 0, arr1.length);
                    // Array class
                    int[] arr3 = Arrays.copyOf(arr1, newLen);
                    // Object class
                    int[] arr4 = (int[])arr1.clone();
                - Enhanced for statement
                    for (type name : array or collection name){
                        statement;
                    }
                    ex)
                        int[] arr = new int[]{1,2,3,4,5};
                        for (int e : arr){
                            System.out.println(e);
                        }
    */

    // one line
    /* 
    many line
     */

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        System.out.print(7);
        System.out.println(3);
        System.out.println(3.14);
        System.out.println("자바");
        System.out.println("문자열" + "연결");
        System.out.println("숫자" + 3 + "문자연결");

        /*
        JAVA8 변경사항
            람다표현식 -> 함수형 프로그래밍
            스트림API -> 데이터 추상화
            java.time package -> Joda-Time 날짜시간 API
            Nashorn -> JS 엔진
         */

         // lambda expression
        new Thread(new Runnable(){
            public void run(){
                System.out.println("oldest version thread");
            }
        }).start();

         new Thread(()->{
            System.out.println("lambda expression thread");
         }).start();

        
        // stream API
        String[] arr = new String[]{"넷", "둘", "셋", "하나"};

        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(e->System.out.print(e + " "));
        System.out.println();

        Stream<String> stream2 = Arrays.stream(arr, 1, 3);
        stream2.forEach(e->System.out.print(e + " "));
        System.out.println();


        // java.time
        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());

        LocalDate otherDay = today.withYear(1982);
        System.out.println(otherDay.getYear());

    }
}
