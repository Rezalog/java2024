package day02;

// Say라는 Functional Interface를 정의합니다.
@FunctionalInterface
interface Say {
    int something(int a, int b);
}

class Person {
    public void hi(Say line) {
        int number = line.something(3, 4);
        System.out.println("Number is " + number);
    }
}


public class Ex61 {
    public static void main(String[] args) {
        
        // 람다식을 사용하지 않고 Say 인터페이스를 구현합니다.
        // Person person = new Person();
        // person.hi(new Say() {
        //     public int something(int a, int b) {
        //         System.out.println("My Name is Coding-Factory");
        //         System.out.println("Nice to meet you");
        //         System.out.println("Parameter number is " + a + ", " + b);
        //         return 7;
        //     }
        // });

                // 람다식을 사용하여 Say 인터페이스를 구현합니다.
        Person person = new Person();
        person.hi((a, b) -> {
            System.out.println("This is Coding-Factory!");
            System.out.println("Thank you, Lambda");
            System.out.println("Parameter number is " + a + ", " + b);
            return 7;
        });

    }
}
