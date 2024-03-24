

Module	주제	시간	학습 내용
1	자바의 개요
클래스와 객체
상속과 다형성
예외처리
내부 클래스	8H		자바의 소개
	지역과 전역변수, 메모리관리
	객체생성과 메모리
	Extends / implements
	다형성, 상속의 활용
	사용자정의 exception
	내부클래스
2	컬렉션
제네릭
IO
람다식
Stream API	8H		제네릭
	컬렉션 API
	Iterating
	ByteStream,FilterStream
	Character Stream, conversion 
	Lambda Expression, Functional Interface
	Stream
3	병렬처리
통신	8H		쓰레드 동작방식과 메모리, 라이프사이클
	쓰레드풀,Callable,Future
	웹스크래핑,멀티통신
	프로토콜의 의의
	웹서버 구현
	사후테스트(실기평가/ 2H)



❊ 본 문서는 Copilot GPT을 활용하여 AI와 함께 작성되었습니다.

❊❊ 이 문서의 코드는 각 쳅터를 대표하고 간략한 최소한의 코드만을 첨부하였기에 강의 전체의 코드는 아래의 git레포지토리 사이트를 통해 git clone 또는 zip 압축 download를 통해 확인하시길 바랍니다. 



 
## 1일차 

### 자바란
**자바 (Java)**는 1995년 미국의 썬마이크로시스템즈라는 회사에서 개발한 객체지향 언어입니다. 현재는 오라클에 인수되어 배포되고 있으며, 다양한 플랫폼과 운영체제에서 사용됩니다. 자바는 안정성, 이식성, 확장성 등 다양한 장점을 가지고 있습니다. 이 언어는 다음과 같은 몇 가지 주요 용도로 활용됩니다 

	웹 애플리케이션 개발: 자바는 웹 애플리케이션을 개발하는 데 널리 사용됩니다. 
	스마트폰 어플 개발: 안드로이드 애플리케이션을 만들기 위해 자바를 활용할 수 있습니다. 
	웹 서버 개발: 자바는 서버 측 기술에 사용되어 동적이고 상호작용적인 웹 어플리케이션을 만들 수 있게 합니다. 
	빅 데이터 처리: 복잡한 데이터 집합과 방대한 양의 실시간 데이터를 처리하는 데 사용됩니다. 
	인공 지능 및 머신러닝: 기계 학습 라이브러리의 발전소 역할을 합니다. 

자바는 다양한 기능과 라이브러리로 구성된 풍부한 에코시스템을 제공하며, 고품질 학습 리소스와 적극적인 커뮤니티 지원도 가지고 있습니다. 또한 플랫폼 독립적이어서 여러 디바이스에서 실행할 수 있습니다. 이러한 이유로 자바는 여전히 프로그래머들 사이에서 많은 인기를 끌고 있습니다. 

### 역사
 

### 장점 

고품질 학습 리소스 
Java는 오랫동안 사용되어 왔기 때문에 새로운 프로그래머가 사용할 수 있는 학습 리소스가 많이 있습니다. 개발자를 학습 과정 내내 활용할 수 있는 자세한 설명서, 포괄적인 책, 과정이 마련되어 있습니다. 또한 초보자는 Advanced Java로 넘어 가기 전에 Core Java에서 코드 작성을 시작할 수 있습니다. 

기본 제공 함수 및 라이브러리 
Java를 사용하면 개발자가 처음부터 모든 새로운 기능을 작성할 필요가 없습니다. 대신 Java는 다양한 애플리케이션을 개발하기 위해 기본 제공 기능과 라이브러리로 구성된 풍부한 에코시스템을 제공합니다. 

적극적인 커뮤니티 지원 
Java에는 코딩 문제 발생 시 개발자를 지원할 수 있는 많은 활성 사용자와 커뮤니티가 있습니다. Java 플랫폼 소프트웨어도 정기적으로 유지 관리되고 업데이트됩니다. 

고품질 개발 도구 
Java는 자동화 편집, 디버깅, 테스트, 배포 및 변경 관리를 지원하는 다양한 도구를 제공합니다. 이러한 도구는 Java 프로그래밍을 시간과 비용 효율적으로 만듭니다. 

플랫폼 독립적 
Java 코드는 다시 작성하지 않고도 Windows, Linux, iOS 또는 Android와 같은 기본 플랫폼에서 실행할 수 있습니다. 따라서 여러 디바이스에서 애플리케이션을 실행하려는 오늘날의 환경에서 특히 유용합니다. 

보안 
사용자는 네트워크를 통해 신뢰할 수 없는 Java 코드를 다운로드하고 해당 Java 코드가 해를 끼칠 수 없는 안전한 환경에서 이를 실행할 수 있습니다. 신뢰할 수 없는 코드가 호스트 시스템을 바이러스에 감염시킬 수 없으며 하드 드라이브에서 파일을 읽거나 쓸 수 없습니다. Java의 보안 수준 및 제한 사항도 고도로 구성 가능합니다. 

### 자바의 특징
자바(Java)는 다음과 같은 주요 특징을 가진 프로그래밍 언어입니다
•	간단함: 자바는 배우기 쉽고, 구문이 간단하며 이해하기 쉽습니다.
•	객체 지향적: 자바는 완벽한 객체 지향 언어로, 애플리케이션의 기능을 오브젝트의 조합으로 구현합니다.
•	플랫폼 독립성: 자바 프로그램은 Java 가상 머신(JVM)에서 실행되므로, 어떤 하드웨어나 운영체제에서도 실행할 수 있습니다.
•	강력함: 자바는 분산형, 다중 스레드, 고성능 등의 특징을 가지며, 보안과 견고함에 중점을 둡니다.
•	이 외에도 자바는 인터프리터 언어이며, 아키텍처 중립적이고, 동적인 언어입니다

인터프리터 언어이다 (Interpreted)
–	자바는 정확하게 말하면 컴파일 언어인 동시에 인터프리터 언어이다. 자바는 먼저 텍스트 소스를 컴파일하여 이진 파일(클래스 파일)로 만든 다음, 자바 런타임이 이 클래스 파일을 인터프리트 interpret 하면서 실행한다. 자바는 먼저 시스템과 무관한 이진 파일을 만듦으로써 컴파일 언어에 가까운 속도와 함께 시스템의 독립성을 얻을 수 있었다.
–	인터프리터 언어는 코드를 한 줄씩 작성하고 실행하여 결과를 바로 확인할 수 있다.

자바의 메모리 사용방식
•	java프로그램은 JVM(Java Virtual Machine : 자바가상머신)이라는 프로그램만 있으면 실행이 가능한데, JVM이 OS에게서 메모리 사용권한을 할당받고 JVM이 자바프로그램을 호출하여 실행하게 된다. OS에서는 독립되었지만 JVM이라는 프로그램에 종속적이게 된다.
 

•	Class Loader: JVM내로 클래스를 로드하고 링크를 통해 배치하는 작업을 수행하는 모듈로써 런타임시 동적으로 클래스를 로드한다.
•	Execution Engine: Class Loader를 통해 JVM 내의 런타임 데이터 영역에 배치된 바이트 코드를 실행한다. 이 때, Execution Engine은 자바 바이트 코드를 명령어 단위로 읽어서 실행한다.
•	Garbage Collector: JVM은 Garbage Collector를 통해 메모리 관리 기능을 자동으로 수행한다. 애플리케이션이 생성한 객체의 생존 여부를 판단하여 더 이상 사용되지 않는 객체를 해제하는 방식으로 메모리를 자동 관리한다.
•	Runtime Data Areas: JVM이 운영체제 위에서 실행되면서 할당받는 메모리 영역이다. Class Loader에서 준비한 데이터들을 보관하는 저장소이다.

 
•	Method (Static) Area: JVM이 읽어들인 클래스와 인터페이스 대한 런타임 상수 풀, 멤버 변수(필드), 클래스 변수(Static 변수), 생성자와 메소드를 저장하는 공간이다.
•	Runtime Constant Pool
–	메소드 영역에 포함되지만 독자적 중요성이 있다.
–	클래스 파일 constant_pool 테이블에 해당하는 영역이다.
–	클래스와 인터페이스 상수, 메소드와 필드에 대한 모든 레퍼런스를 저장한다.
–	JVM은 런타임 상수 풀을 통해 해당 메소드나 필드의 실제 메모리 상 주소를 찾아 참조한다

 
•	메소드 영역/런타임 상수 풀의 사용기간 및 스레드 공유 범위
–	JVM 시작시 생성
–	프로그램 종료 시까지
–	명시적으로 null 선언 시
–	구성 방식이나 GC 방법은 JVM 벤더마다 다를 수 있다.
–	모든 스레드에서 공유한다.
•	Heap Area
–	JVM이 관리하는 프로그램 상에서 데이터를 저장하기 위해 런타임 시 동적으로 할당하여 사용하는 영역이다.
–	New 연산자로 생성된 객체 또는 객체(인스턴스)와 배열을 저장한다.
–	힙 영역에 생성된 객체와 배열은 스택 영역의 변수나 다른 객체의 필드에서 참조한다.
–	참조하는 변수나 필드가 없다면 의미 없는 객체가 되어 GC의 대상이 된다.
–	힙 영역의 사용기간 및 스레드 공유 범위
•	객체가 더 이상 사용되지 않거나 명시적으로 null 선언 시
•	GC(Garbage Collection) 대상
•	구성 방식이나 GC 방법은 JVM 벤더마다 다를 수 있다.
•	모든 스레드에서 공유한다.
•	Stack Area
–	각 스레드마다 하나씩 존재하며, 스레드가 시작될 때 할당된다.
–	메소드를 호출할 때마다 프레임(Frame)을 추가(push)하고 메소드가 종료되면 해당 프레임을 제거(pop)하는 동작을 수행한다.
–	선입후출(FILO, First In Last Out) 구조로 push와 pop 기능 사용
–	메소드 호출 시 생성되는 스레드 수행정보를 기록하는 Frame을 저장
–	메소드 정보, 지역변수, 매개변수, 연산 중 발생하는 임시 데이터 저장
–	기본(원시)타입 변수는 스택 영역에 직접 값을 가진다.
–	참조타임 변수는 힙 영역이나 메소드 영역의 객체 주소를 가진다.
•	PC Register
–	현재 수행 중인 JVM 명령 주소를 갖는다.
–	프로그램 실행은 CPU에서 인스트럭션(Instruction)을 수행.
–	CPU는 인스트럭션을 수행하는 동안 필요한 정보를 CPU 내 기억장치인 레지스터에 저장한다.
–	연산 결과값을 메모리에 전달하기 전 저장하는 CPU 내의 기억장치
•	Native Method Stack Area
–	자바 외 언어로 작성된 네이티브 코드를 위한 Stack이다.
–	즉, JNI(Java Native Interface)를 통해 호출되는 C/C++ 등의 코드를 수행하기 위한 스택이다.
–	네이티브 메소드의 매개변수, 지역변수 등을 바이트 코드로 저장한다.

### 지역변수와 전역변수
 

### 클래스
자바 클래스는 객체를 정의하는 틀이나 설계도로 사용됩니다. 이 클래스를 기반으로 여러 객체를 생성하여 사용합니다. 클래스는 객체의 상태를 나타내는 **필드 (field)**와 객체의 동작을 나타내는 **메소드 (method)**로 구성됩니다. 클래스는 실체화되지 않은 추상적인 개념으로, 객체를 생성하기 위해 사용됩니다

클래스를 선언하고 인스턴스를 생성하는 방법은 다음과 같습니다

    class Student {
    // 필드 (Field)
    String name; // 이름
    int age; // 나이
    int korean_score; // 국어 성적
    int math_score; // 수학 성적
    int english_score; // 영어 성적

    // 생성자 (Constructor)
    Student(String name, int age, int kor_score, int mat_score, int eng_score) {
        this.name = name;
        this.age = age;
        this.korean_score = kor_score;
        this.math_score = mat_score;
        this.english_score = eng_score;
    }

    // 메소드 (Method)
    public void printScore() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("국어 성적: " + korean_score);
        System.out.println("수학 성적: " + math_score);
        System.out.println("영어 성적: " + english_score);
    }
}
public class Main {
    public static void main(String[] args) {
        // 생성자가 없는 경우
        Student student1 = new Student("홍길동", 18, 100, 90, 80);
    }
}
클래스를 통해 객체를 생성할 때는 new 연산자를 사용하며, 생성자의 인자 값을 맞춰서 넣습니다. 이렇게 생성된 객체는 힙 메모리 영역에 생성되며 해당 클래스의 인스턴스라고 합니다. 클래스는 객체의 청사진이며, 인스턴스는 붕어빵 틀에서 찍어낸 붕어빵과 같습니다

### 메서드
•	자바에서 메소드란 코드 블록 또는 문의 집합으로, 특정 작업을 수행하기 위해 함께 그룹화된 코드입니다. 메소드는 코드의 재사용성을 달성하는 데 사용되며, 한 번 정의한 후 여러 번 호출할 수 있습니다. 이를 통해 코드를 반복해서 작성할 필요 없이 쉽게 수정하고 읽을 수 있습니다.
•	
•	메소드는 호출할 때만 실행되며, 메서드 선언은 가시성, 반환 유형, 이름 및 인수와 같은 메서드 속성에 대한 정보를 제공합니다. 메서드 선언은 다음과 같은 구성 요소로 이루어져 있습니다:
•	
•	가시성 (Visibility): 메소드가 어디에서 접근 가능한지를 나타냅니다. 예를 들어, public, private, protected 등이 있습니다.
•	반환 유형 (Return Type): 메소드가 반환하는 값의 자료형을 지정합니다. 자료형이 없는 경우 void를 사용합니다.
•	메소드 이름 (Method Name): 메소드를 호출할 때 사용하는 이름입니다.
•	인수 (Parameters): 메소드에 전달되는 입력 값입니다. 매개변수를 통해 메소드의 동작을 조절할 수 있습니다.
•	class Ex04{
•	/*
•	static -> static		[클래스명.]메서드명();
•	static -> non-static		참조변수.메서드명();
•	non-static -> static		[클래스명.]메서드명();
•	non-static -> non-static	[this.]메서드명();
•	
•	*/
•	public static void main(String[] args){
•	  func01();
•	  Ex04 me=new Ex04();
•	  me=new Ex04();
•	  me.func02();
•	}
•	
•	  public static void func01(){
•	    System.out.println("static method func01()...");
•	  }
•	
•	  public void func02(){
•	    System.out.println("non-static method func02()...");
•	    func01();
•	  }
•	  public void func03(){
•	    System.out.println("non-static method func03()...");
•	  }•	}
•	
–	
### 오버로딩
자바 오버로딩은 한 클래스 내에서 같은 이름을 가진 메소드가 있더라도, 매개변수나 타입이 다르면 같은 이름을 사용하여 메소드를 정의할 수 있는 개념입니다. 이를 통해 메서드의 이름은 같고 매개변수의 유형과 갯수는 다르게 한다면 오버로딩을 할 수 있습니다.
예를 들어, 아래와 같은 클래스가 있다고 가정해봅시다
public class Test3 {
    public int Test(int i, int j) {
        return i + j;
    }

    public int Test(int i, int j, int k) {
        return i + j + k;
    }

    public int Test(double i, double j) {
        return i + j;
    }
}

public static void main(String args[]) {
    Test3 a = new Test3();
    int i = a.Test(1, 2);
    int j = a.Test(1, 2, 3);
    int k = a.Test(1.1, 2.2);
}

위의 코드에서 Test라는 이름을 가진 함수를 호출했을 때, 매개변수의 유형에 따라 호출되는 메소드가 다르게 됩니다. 이렇게 오버로딩을 사용하면 동일한 이름의 메소드를 중복 작성하여 사용의 편리성과 다형성을 실현할 수 있습니다12.

오버로딩의 성립 조건과 특징은 다음과 같습니다:

	메서드 이름이 같아야 합니다.
	매개변수 유형 (타입)이나 갯수 (파라미터)나 순서가 달라야 합니다.
	굳이 반환값을 통일하지 않아도 됩니다. (즉, 리턴타입, 리턴값과는 무관하다!)13

### 동적파라미터
•	자바에서 동적으로 파라미터를 다루는 방법 중 하나는 **가변인자 (varargs)**를 활용하는 것입니다. 가변인자를 사용하면 메소드에 동적으로 여러 개의 파라미터를 전달할 수 있습니다. 사용법은 변수 타입 뒤에 기호 ...를 붙여주면 됩니다. 가변인자를 가지고 있는 메소드를 호출할 때는 다음과 같은 방법을 사용할 수 있습니다.
가변인자 코드
public void printValues(String... values) {
    for (String value : values) {
        System.out.println(value);
    }
}

// 호출 예시
printValues("Apple", "Banana", "Cherry");

배열 사용 코드
public void printArray(String[] values) {
    for (String value : values) {
        System.out.println(value);
    }
}

// 호출 예시
String[] fruits = {"Apple", "Banana", "Cherry"};
printArray(fruits);

•	자바 내부에서는 배열의 활용하므로 배열을 활용하는 방법과 동일하며
•	주의 할 점으로는 JDK1.5부터 지원하는 문법이며 다른 매개변수가 더 있다면 가변인자는 마지막에 선언되어야 합니다.
•	
### 생성자
자바 생성자는 인스턴스가 생성될 때 호출되는 **“인스턴스 변수 초기화 메소드”**입니다. 이를 통해 인스턴스 변수의 초기화 작업을 수행하며, 인스턴스가 생성될 때 실행되어야 하는 작업을 위해서도 사용됩니다.

생성자는 클래스의 인스턴스를 초기화하고 설정하는 데 사용됩니다. 기본 생성자(default constructor)는 클래스의 인스턴스를 초기화하지 않고 설정할 수 있습니다. 객체를 생성할 때 메모리가 할당되고, 생성자를 호출하여 객체를 초기화합니다. Java 컴파일러는 클래스에 사용 가능한 생성자가 없는 경우 기본 생성자를 제공합니다.

생성자는 클래스 설계와 객체 생성에 중요한 역할을 합니다. 예를 들어, 얼굴이라는 클래스로 얼굴 객체를 만들 때, 생성자를 호출하여 얼굴의 각 부위를 초기화하고 화장을 하게 됩니다. 이를 통해 서로 다른 모양의 얼굴 객체를 생성할 수 있습니다.

자바에서는 두 가지 유형의 생성자가 있습니다:

매개 변수화된 생성자: 매개 변수를 받아 객체를 초기화하는 생성자입니다.
no-arg 생성자: 매개 변수 없이 객체를 초기화하는 생성자입니다.
생성자는 객체 생성 시 값을 구성하기 때문에 그 이름이 붙여졌습니다. 자바에서는 생성자를 통해 객체를 초기화하고 설정하는데 활용합니다.

### this 와 super
자바에서 this와 super는 객체 지향 프로그래밍에서 주로 사용되는 키워드입니다. 이 두 키워드의 차이점을 살펴보겠습니다: 

`this`:
this는 현재 클래스의 인스턴스를 가리키는 참조변수입니다. 
주로 동일한 클래스 내에서 정의된 변수를 식별할 때 사용됩니다. 
예를 들어, 클래스 내에 동일한 이름의 멤버 변수가 있을 때 this.var를 사용하여 클래스 영역에 정의된 변수를 참조할 수 있습니다. 
또한 this()를 사용하여 같은 클래스의 다른 생성자를 호출할 수 있습니다. 

`super`: 
super는 부모 클래스를 가리키는 참조변수입니다. 
주로 상속 관계에서 부모 클래스의 변수나 메서드를 호출할 때 사용됩니다. 
만약 부모 클래스와 자식 클래스에서 동일한 이름의 변수나 메서드가 있을 때, super를 사용하여 부모 클래스의 멤버를 구분할 수 있습니다. 
또한 super()를 사용하여 부모 클래스의 기본 생성자를 호출할 수 있습니다. 
간단한 예시를 통해 이해해보겠습니다: 
class Parent {
    String var;

    Parent() {
        var = "생성자도 물려주지 않는다.";
    }

    int method(int x, int y) {
        return x + y;
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println(var); // 부모 클래스에서 상속받은 String var
        System.out.println(method(7, 13)); // 부모 클래스에서 상속받은 int method()를 오버라이딩한 것
    }

    @Override
    int method(int x, int y) {
        return x * y;
    }

    int var; // 인스턴스 변수

    void test(double var) {
        System.out.println(var); // 입력받은 파라미터값
        System.out.println(this.var); // 인스턴스 변수 int var
        System.out.println(this.method(0, 20)); // 오버라이딩한 자식 클래스 메서드
        System.out.println(super.method(0, 20)); // 부모 클래스 메서드
    }
}

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.test(52);
    }
}

52.0
0
0
20

또 다른 예시로 this()를 사용한 코드도 살펴보겠습니다: 
class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    SutdaCard() {
        this(1, true); // 같은 클래스의 다른 생성자를 호출
    }

    String info() {
        return num + (isKwang ? "K" : "");
    }
}

이렇게 this와 super를 적절히 활용하여 클래스 간의 관계를 구분하고 초기화를 수행할 수 있습니다.

### Reflection
리플렉션(Reflection)은 자바에서 런타임에 클래스의 메타데이터를 검사하고 조작할 수 있는 기능입니다. 이를 통해 클래스, 메서드, 필드, 생성자 정보를 동적으로 검색하고 사용할 수 있습니다. 리플렉션은 유연성을 제공하지만, 성능 저하와 보안 문제를 유발할 수 있으므로 주의해서 사용해야 합니다.

클래스 정보 가져오기:
클래스 이름을 알고 있다면 Class.forName("패키지명.클래스명")을 사용하여 해당 클래스의 정보를 가져올 수 있습니다.
예시: 
Class carClass = Class.forName("com.mycompany.Car");

메서드 호출하기:
클래스의 메서드 정보를 가져온 후 invoke()를 사용하여 메서드를 실행할 수 있습니다.
예시:
Method move = carClass.getMethod("move"); 
move.invoke(obj, null);

필드 값 변경하기:
클래스의 필드 정보를 가져온 후 set()을 사용하여 필드 값을 변경할 수 있습니다.
예시: 
Field positionField = carClass.getDeclaredField("position"); 
positionField.set(obj, 42);

생성자로 객체 생성하기:
클래스의 생성자 정보를 가져온 후 newInstance()를 사용하여 객체를 생성할 수 있습니다.
예시:
Constructor<Car> constructor = carClass.getConstructor(String.class, int.class); 
Car car = constructor.newInstance("MyCar", 0);

Reflection은 프레임워크, 라이브러리, 테스트 도구 등에서 활용되며, 일반적인 애플리케이션 개발에서는 사용하지 않는 것이 좋습니다. 성능 오버헤드와 보안적인 이슈를 고려해야 하기 때문입니다.
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;

public class ClassLoaderTest {
    public void checkLoadedClasses() throws IOException {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        ClassLoader classLoader = this.getClass().getClassLoader();

        // Check if org.slf4j.impl.StaticLoggerBinder.class is loaded
        Enumeration<URL> resources1 = classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
        logger.error("resources1: {}", Collections.list(resources1));

        // Check if com.mytest.TestClass.class is loaded (replace with your own class)
        Enumeration<URL> resources2 = classLoader.getResources("com/mytest/TestClass.class");
        logger.error("resources2: {}", Collections.list(resources2));

        // Check if java.net.URL.class is loaded
        Enumeration<URL> resources3 = classLoader.getResources("java/net/URL.class");
        logger.error("resources3: {}", Collections.list(resources3));
    }

    public static void main(String[] args) throws IOException {
        ClassLoaderTest test = new ClassLoaderTest();
        test.checkLoadedClasses();
    }
}

### 상속
#### 클래스의 상속
•	상속은 객체지향 프로그래밍에서 중요한 개념입니다. 이를 통해 클래스 간에 코드를 재사용하고 중복을 최소화할 수 있습니다. 상속을 사용하는 주요 이유는 다음과 같습니다:
•	
•	코드 재사용:
•	이미 작성된 클래스를 확장하여 새로운 클래스를 만들 수 있습니다.
•	부모 클래스의 멤버(필드, 메서드)를 자식 클래스에서 그대로 사용할 수 있습니다.
•	
•	계층 구조:
•	상속을 통해 클래스 간에 계층 구조를 만들 수 있습니다.
•	부모 클래스를 일반화하고, 자식 클래스를 특수화하여 프로그램의 구조를 체계적으로 설계할 수 있습니다.
•	
•	중복 코드 최소화:
•	공통된 기능을 부모 클래스에 구현하면, 자식 클래스에서 해당 기능을 반복해서 작성할 필요가 없습니다. 
•	이로써 코드 중복을 줄이고 유지보수성을 향상시킬 수 있습니다.
•	
•	다형성 지원:
•	상속을 통해 다형성을 구현할 수 있습니다.
•	부모 클래스 타입으로 자식 클래스의 객체를 다룰 수 있어 유연한 프로그래밍이 가능합니다.
•	
•	상속은 프로그램의 구조를 더 명확하게 만들고, 코드를 효율적으로 관리할 수 있도록 도와줍니다.
•	클래스 간의 상속은 extends 키워드를 사용하여 선언합니다. 상속을 통해 부모 클래스의 멤버를 자식 클래스에게 물려줄 수 있습니다. 아래 예시를 통해 상속의 개념과 사용법을 살펴보겠습니다.
•	class People {
•	    // 필드
•	    String name; // 이름
•	    int age; // 나이
•	
•	    // 메소드
•	    public void printMyself() {
•	        System.out.println("이름: " + name);
•	        System.out.println("나이: " + age);
•	    }
•	}
•	
•	class Student extends People {
•	    // 추가 필드
•	    int koreanScore; // 국어 성적
•	    int mathScore; // 수학 성적
•	    int englishScore; // 영어 성적
•	
•	    // 생성자
•	    Student(String name, int age, int koreanScore, int mathScore, int englishScore) {
•	        super.name = name; // 부모 클래스의 필드
•	        super.age = age; // 부모 클래스의 필드
•	        this.koreanScore = koreanScore;
•	        this.mathScore = mathScore;
•	        this.englishScore = englishScore;
•	    }
•	
•	    // 추가 메소드
•	    public void printScore() {
•	        System.out.println("국어 성적: " + koreanScore);
•	        System.out.println("수학 성적: " + mathScore);
•	        System.out.println("영어 성적: " + englishScore);
•	    }
•	}
•	
•	public class Main {
•	    public static void main(String[] args) {
•	        Student student = new Student("홍길동", 18, 100, 90, 80);
•	        student.printMyself(); // 부모 메소드 호출
•	        student.printScore(); // 자식 메소드 호출
•	    }•	}
•	
•	위 예시에서 Student 클래스는 People 클래스를 상속받았습니다. Student 클래스는 부모 클래스인 People의 필드와 메소드를 사용할 수 있으며, 추가적으로 자신만의 필드와 메소드를 정의할 수 있습니다. 상속을 통해 코드를 재사용하고 중복을 최소화할 수 있습니다
•	

#### 인터페이스
•	인터페이스의 상속에는 implements 키워드가 사용된다
•	다중 상속이 허용됨
•	객체 생성불가(객체생성 대상은 클래스)
•	상수형 변수만을 갖는다 - final 생략가능, static 생략가능
•	접근제한자는 오직 public만 갖는다 - public 생략가능
•	추상메서드만을 갖는다 - abstract 생략가능
•	인터페이스간의 상속은 extends 키워드를 사용
•	interface Lec08{
•		public final static int su1=1111;
•		final static int su2=2222;
•		static int su3=3333;
•		int su4=4444;
•		
•		public abstract void func01();
•		public void func03();
•		void func04();
•	}
•	
•	interface Lec888{}
•	
•	interface Lec88 extends Lec08,Lec888{
•		public abstract void func03();•	}
•	

#### 디폴트 메서드
디폴트 메서드란? 인터페이스에 선언된 메서드 중, default 키워드를 사용하여 실제 구현을 포함할 수 있는 메서드입니다.
디폴트 메서드(Default Method)는 자바 8에서 도입된 기능으로, 인터페이스(Interface)에서 메타데이터를 검사하고 조작할 수 있게 해줍니다. 이를 통해 클래스, 메서드, 필드, 생성자 정보를 동적으로 검색하고 사용할 수 있습니다. 디폴트 메서드는 유연성을 제공하지만, 성능 저하와 보안 문제를 유발할 수 있으므로 주의해서 사용해야 합니다.

디폴트 메서드를 사용하는 이유는 다음과 같습니다:

기존 인터페이스 확장:
기존 인터페이스에 새로운 메서드를 추가하면 모든 구현체에서 해당 메서드를 구현해야 했습니다.
디폴트 메서드를 사용하면 인터페이스에 기본 구현을 제공할 수 있어, 기존 코드를 변경하지 않고도 새로운 기능을 확장할 수 있습니다.
소스 호환성 유지:
라이브러리 설계자가 API를 변경하면서도 기존 버전과의 호환성을 유지할 수 있습니다.
디폴트 메서드를 이용하여 기존 코드를 수정하지 않고도 새로운 기능을 추가할 수 있습니다.
다중 상속 지원:
디폴트 메서드를 통해 다중 상속 동작을 지원할 수 있습니다.
여러 인터페이스에서 동일한 메서드를 제공할 때 충돌을 방지하고 해결할 수 있습니다.

디폴트 메서드는 프로그램이 자신의 클래스, 필드, 메서드, 생성자 등에 대한 정보를 동적으로 얻을 수 있게 해주며, 이를 통해 해당 클래스 또는 객체를 조작하거나 실행할 수 있습니다. 하지만 성능 저하와 보안 취약성에 주의하여 사용해야 합니다.
예시로, 아래 코드는 디폴트 메서드를 사용한 인터페이스와 클래스의 예시입니다
public interface MyInterface {
    void abstractMethodA();
    void abstractMethodB();
    
    default void defaultMethodA() {
        System.out.println("Hello from defaultMethodA");
    }
}

public class MyClass implements MyInterface {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.abstractMethodA(); // Implement this method
        myClass.abstractMethodB(); // Implement this method
        myClass.defaultMethodA(); // Use the default implementation
    }
}

디폴트 메서드 defaultMethodA는 인터페이스 MyInterface에 기본 구현으로 제공되며, MyClass에서는 해당 메서드를 직접 구현하지 않아도 사용할 수 있습니다.

### 다형성
•	다형성(Polymorphism)은 객체지향 프로그래밍에서 중요한 개념입니다. 이를 통해 같은 자료형에 여러 가지 객체를 대입하여 다양한 결과를 얻어낼 수 있습니다. 다형성은 다양한 형태를 가질 수 있는 능력을 의미하며, 객체를 부품화하여 유지 보수를 용이하게 합니다.
•	자바에서 다형성을 구현하는 데 사용되는 주요 키워드와 개념은 다음과 같습니다.
•	
•	상속 (Inheritance):
•	클래스 간의 상속을 통해 다형성을 구현할 수 있습니다.
•	부모 클래스의 멤버를 자식 클래스에서 상속받아 사용합니다.
•	
•	메서드 오버라이딩 (Method Overriding):
•	자식 클래스에서 부모 클래스의 메서드를 재정의하는 것입니다.
•	동일한 메서드 시그니처를 가진 자식 클래스의 메서드가 부모 클래스의 메서드를 대체합니다.
•	
•	업캐스팅 (Upcasting):
•	자식 클래스의 객체를 부모 클래스 타입으로 참조하는 것입니다.
•	다형성을 활용하여 여러 타입의 객체를 하나의 변수로 다룰 수 있습니다.
•	
•	인터페이스 (Interface):
•	인터페이스를 구현한 클래스들은 같은 인터페이스 타입으로 다룰 수 있습니다.
•	인터페이스를 통해 다형성을 구현할 수 있습니다.
•	
•	다형성 (Polymorphism):
•	다양한 형태를 가진 객체를 동일한 타입으로 다루는 능력입니다.
•	상속, 메서드 오버라이딩, 업캐스팅, 인터페이스를 통해 다형성을 실현할 수 있습니다.
•	
•	이러한 키워드와 개념을 활용하여 자바에서 다형성을 구현할 수 있습니다
•	package app;
•	// 다형성
•	interface Machine{
•		void on();
•		void off();
•		abstract void work();
•	}
•	
•	class Tv implements Machine{
•		public void on() {
•			System.out.println("켜다");
•		}
•		public void off() {
•			System.out.println("끄다");
•		}
•		public void work() {
•			System.out.println("방송 주파수를 잡아 화면과 소리를 출력해준다");
•		}
•	}
•	
•	class Radio implements Machine{
•		public void on() {
•			System.out.println("켜다");
•		}
•		public void off() {
•			System.out.println("끄다");
•		}
•		public void work() {
•			System.out.println("주파수를 잡아 소리를 들려준다");
•		}
•	}
•	
•	class Audio implements Machine{
•		public void on() {
•			System.out.println("켜다");
•		}
•		public void off() {
•			System.out.println("끄다");
•		}
•		public void work() {
•			System.out.println("음악을 들려준다");
•		}
•	}
•	
•	
•	public class Main {
•	
•		public static void main(String[] args) {
•			java.util.Scanner sc;
•			sc=new java.util.Scanner(System.in);
•			System.out.print("1.tv 2.radio 3.audio>");
•			int input=sc.nextInt();
•			Machine remote;
•			if(input==1) {
•				remote=new Tv();
•			}else if(input==2){
•				remote=new Radio();
•			}else {
•				remote=new Audio();
•			}
•			remote.on();
•			remote.work();
•			remote.off();
•		}
•	•	}
•	

### 내부클래스
•	내부 클래스(inner class)란 
하나의 클래스 내부에 선언된 또 다른 클래스를 의미
내부 클래스	특징
인스턴스 클래스 
(instance class)	외부 클래스의 멤버변수 선언 위치에 선언하며, 외부 클래스의 인스턴스 멤버처럼 다뤄진다.
주로 외부 클래스의 인스턴스 멤버들과 관련된 작업에 사용될 목적으로 선언된다.
스태틱 클래스 
(static class)	외부 클래스의 멤버변수 선언 위치에 선언하며, 외부 클래스의 static 멤버처럼 다뤄진다.
다만 주의할점은 static이라고 해서 new 생성자 초기화를 못하는 건 아니다.
즉, 일반적인 static 필드 변수나 static 메서드와 달리, staic 내부 클래스는 같은 static이지만 메모리 구조나 기능이 전혀 다르다.
지역 클래스 
(local class)	외부 클래스의 메서드나 초기화블럭 안에 선언하며, 선언된 메서드 블록 영역 내부에서만 사용될 수 있다.
익명 클래스 
(anonymous class)	클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스이다.
주로 클래스를 일회용으로 사용할때 자주 이용된다.

 
## 2일차 
### 제네릭
제네릭(Generic)은 자바에서 소스 코드 컴파일 시 타입을 체크해주는 기능입니다. 주로 여러 가지 타입을 다루는 클래스나 메서드에 적용하여 사용합니다. 제네릭을 사용해야 하는 이유는 다음과 같습니다:

타입 안정성(Type Safety):
제네릭을 사용함으로써 잘못된 타입이 사용될 수 있는 문제를 컴파일 과정에서 제거할 수 있습니다.
실행 시 타입 에러가 나는 것보다는 컴파일 시에 미리 타입을 강하게 체크해서 에러를 사전에 방지하는 것이 좋습니다.

코드 재사용 및 유지보수성:
제네릭을 활용하면 타입 변환을 최소화하고 코드를 재사용할 수 있습니다.
유지보수성을 향상시킬 수 있습니다.
제네릭의 사용법과 예시를 살펴보겠습니다:

제네릭 클래스:
클래스를 설계할 때 구체적인 타입을 명시하지 않고 타입 파라미터로 넣어두었다가 실제 사용될 때 구체적인 타입을 지정합니다.
예시:
public class ExClassGeneric<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}

제네릭 인터페이스:
인터페이스도 제네릭으로 설정해두고 활용할 수 있습니다.
예시:

interface ExInterfaceGeneric<T> {
    T example();
}

class ExGeneric implements ExInterfaceGeneric<String> {
    @Override
    public String example() {
        return null;
    }
} 

제네릭 메서드:
메서드 내에서도 제네릭을 사용할 수 있습니다.
예시
public class People<T, M> {
    private T name;
    private M age;

    public People(T name, M age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getAge() {
        return age;
    }

    public void setAge(M age) {
        this.age = age;
    }

    // Generic Method
    public static <T, V> boolean compare(People<T, V> p1, People<T, V> p2) {
        boolean nameCompare = p1.getName().equals(p2.getName());
        boolean ageCompare = p1.getAge().equals(p2.getAge());
        return nameCompare && ageCompare;
    }
}

### 컬렉션 API
배열을 이용한 자료구조 구현 예시
package day02;

public class Arr {
	private Object[] arr=new Object[0];
	
	void removeItem(Object item) {
		int idx=-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==item) {
				idx=i;
				break;
			}
		}
		if(idx!=-1) {
			remove(idx);
		}
	}
	
	void remove(int idx) {
		Object[] arr2=new Object[arr.length-1];
		for(int i=0; i<idx; i++) {
			arr2[i]=arr[i];
		}
		for(int i=idx+1; i<arr.length; i++) {
			arr2[i-1]=arr[i];
		}
		arr=arr2;
	}
	int size() {
		return arr.length;
	}
	Object get(int idx) {
		return arr[idx];
	}
	void add(Object su) {
		Object[] arr2=new Object[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			arr2[i]=arr[i];
		}
		arr2[arr2.length-1]=su;
		arr=arr2;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Arr arr=new Arr();
		arr.add(1111);
		arr.add(2222);
		arr.add(3333);
		arr.add(4444);
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}

연결구조를 이용한 자료구조 구현 예시
package day02;

class Node{
	int val;
	Node nxt;
}

class Arr2{
	Node first;
	int cnt=0;
	
	int size() {
		return cnt;
	}
	
	int get(int idx) {
		Node temp=first;
		for(int i=0; i<idx; i++) {
			temp=temp.nxt;
		}
		return temp.val;
	}
	
	void add(int su) {
		cnt++;
		Node node=new Node();
		node.val=su;
		if(cnt==1) {
			first=node;
		}else {
			Node temp=first;
			while(true) {
				if(temp.nxt==null)break;
				temp=temp.nxt;
			}
			temp.nxt=node;
		}
//		first.nxt=node;
//		first.nxt.nxt=node;
//		first.nxt.nxt.nxt=node;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Arr2 arr=new Arr2();
		arr.add(1111);
		arr.add(2222);
		arr.add(3333);
		arr.add(4444);
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}

ArrayList와 LinkedList의 비교
package day02;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex03 {

	public static void main(String[] args) {
		long before=System.currentTimeMillis();
		java.util.ArrayList arr=new ArrayList();
		//java.util.LinkedList arr=new LinkedList();
		for(int i=0; i<10000000; i++)
		arr.add(i);
		for(int i=0; i<arr.size(); i++) {
			Object obj=arr.get(i);
		}
		long after=System.currentTimeMillis();
		
		System.out.println(after-before);
		
//		arr.add(2222);
//		arr.add(3333);
//		arr.add(4444);
//		for(int i=0; i<arr.size(); i++) {
//			int obj=(int)arr.get(i);
//			System.out.println(obj);
//		}
	}
}

#### 선형 자료구조와 비선형 자료구조
선형자료구조
선형 자료구조는 하나의 자료 뒤에 하나의 자료가 존재하는 형태의 자료 구조를 말합니다. 이는 자료들 간의 앞뒤 관계가 1:1의 선형 관계를 가지는 것을 의미합니다. 대표적인 선형 자료구조로는 배열, 리스트, 스택, 큐 등이 있습니다.

배열 (Array):
같은 타입의 변수들로 이루어진 유한 집합입니다.
배열 요소(element)는 배열을 구성하는 각각의 값이며, 인덱스(index)는 배열의 위치를 가리키는 숫자입니다. 인덱스는 0부터 시작합니다.
리스트 (List):
데이터 요소를 순서대로 정렬한 자료구조입니다.
연결 리스트(Linked List)와 배열 리스트(Array List)가 있으며, 각각 다양한 특성을 가지고 있습니다.
스택 (Stack):
후입선출(LIFO, Last-In-First-Out) 원칙을 따르는 자료구조입니다.
데이터를 삽입(push)하고 삭제(pop)할 수 있습니다.
큐 (Queue):
선입선출(FIFO, First-In-First-Out) 원칙을 따르는 자료구조입니다.
데이터를 삽입(enqueue)하고 삭제(dequeue)할 수 있습니다.

비선형 자료구조
자바에서 제공하는 기본적인 비선형 자료구조 클래스와 인터페이스에는 다음과 같은 것들이 있습니다:

그래프 (Graph):
그래프는 정점(vertex)과 간선(edge)으로 연결되어 있는 객체 간의 관계를 표현하는 비선형 자료구조입니다.
자바에서는 그래프를 직접 제공하는 클래스나 인터페이스는 없지만, 그래프를 구현할 때 인접 리스트(Adjacency List)나 인접 행렬(Adjacency Matrix)을 활용하여 구현할 수 있습니다.
트리 (Tree):
트리는 계층적인 구조를 가지며, 부모-자식 관계로 연결된 비선형 자료구조입니다.
자바에서는 java.util.TreeSet과 java.util.TreeMap이 트리 기반의 자료구조를 제공합니다.
인터페이스 (Interface):
인터페이스는 자바에서 추상 자료형을 정의하는 방법 중 하나입니다.
인터페이스를 활용하여 그래프나 트리를 구현할 때, 메서드 시그니처를 정의하고 클래스에서 해당 메서드를 구현할 수 있습니다.
기타 비선형 자료구조:
자바에서는 그 외에도 다양한 비선형 자료구조를 구현할 수 있습니다.
예를 들면 힙(Heap), 그래프 탐색 알고리즘 등이 있습니다.
자바에서는 이러한 기본적인 비선형 자료구조를 활용하여 다양한 프로그램을 개발할 수 있습니다

#### List<E>
순서가 있는 자료구조로 만들어진 경우는 List Interface를 구현합니다.
그리고 List Interface를 구현한 클래스들은 ArrayList, LinkedList, Vector, Stack등이 존재합니다.

ArrayList:
동적 배열을 사용하여 요소를 저장합니다.
인덱스를 사용하여 요소에 직접 액세스할 수 있습니다.
삽입과 삭제가 빈번하지 않은 경우에 적합합니다.(이론적)
package day02;

import java.util.ArrayList;
import java.util.List;

public class Ex05 {

	public static void main(String[] args) {
		List list=new ArrayList ();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		List list2=new ArrayList ();
		list2.add(2222);
		list2.add(3333);
		list2.add(4444);
//		list2.removeAll(list);
		list2.set(1, 5555);
		Object[] arr3=list2.toArray();
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}
}

LinkedList:
각 요소가 다음 요소와 이전 요소를 가리키는 이중 연결 리스트를 사용합니다.
삽입과 삭제가 빈번한 데이터에 적합합니다. (이론적)
package day02;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex05 {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		LinkedList list2=new LinkedList();
		list2.add(2222);
		list2.add(3333);
		list2.add(4444);
//		list2.removeAll(list);
		list2.set(1, 5555);
		Object[] arr3=list2.toArray();
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}
}

Vector:
ArrayList와 유사한 동작을 수행하는 클래스입니다.
컬렉션 프레임워크가 자바에 포함되기 이전부터 존재하던 자료구조로 호환성이 특징입니다.
package day02;

import java.util.Vector;

public class Ex09 {

	public static void main(String[] args) {
		java.util.Vector vec;
		vec=new Vector();
		vec.addElement(1111);
		vec.addElement(2222);
		vec.addElement(3333);
		vec.addElement(4444);
		vec.addElement(5555);
		
		System.out.println(vec.elementAt(0));
		System.out.println(vec.elementAt(1));
		System.out.println(vec.elementAt(2));
		System.out.println(vec.elementAt(3));
		System.out.println(vec.elementAt(4));
	}
}

Stack:
Vector를 상속하여 구현된 클래스입니다.
Queue가 인터페이스로 존재하는 반면, 클래스로 존재함이 특징입니다.
package day02;

import java.util.Stack;

public class Ex07 {

	public static void main(String[] args) {
		java.util.Stack stack;
		stack=new Stack();
		stack.push(1111);
		stack.push(2222);
		stack.push(3333);
		stack.push(4444);
		stack.push(5555);
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
//		System.out.println(stack.pop());
	}
}

Queue:
대표적으로 구현된 클래스가 LinkedList 입니다.
package day02;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex06 {

	public static void main(String[] args) {
		java.util.List list;
		list=new ArrayList();
		list=new LinkedList();
		java.util.Queue que;
		que=new LinkedList();
		que.offer(1111);
		que.offer(2222);
		que.offer(3333);
		que.offer(4444);
		while(que.peek()!=null) {
			System.out.println(que.peek());
			que.poll();
		}
//		while(que.peek()!=null) {
//			System.out.println(que.poll());
//		}
		
//		que.poll();
//		System.out.println(que.peek());
//		System.out.println(que.peek());
//		System.out.println(que.peek());
//		System.out.println(que.poll());
//		System.out.println(que.poll());
//		System.out.println(que.poll());
//		System.out.println(que.poll());
//		System.out.println(que.poll());
	}
}

#### Set<E>
집합처럼 중복되지 않는 원소들의 모음을 만들 수 있는 자료구조를 Set이라고 합니다.
HashSet과 TreeSet은 모두 자바에서 키(key)와 값을 연결하는 데이터 구조를 나타내는 클래스입니다. 그러나 두 클래스 사이에 중요한 차이점이 있습니다:

정렬 여부:
HashSet: 저장 순서가 유지되지 않으며, 중복을 허용하지 않습니다.
TreeSet: 이진 탐색 트리(Red-Black Tree)의 형태로 데이터를 저장하며, 오름차순으로 자동 정렬됩니다.
성능:
HashSet: 데이터 추가, 삭제에는 빠르지만 검색과 정렬에서는 느립니다.
TreeSet: 데이터 추가, 삭제에는 시간이 더 걸리지만 검색과 정렬에서 뛰어납니다.
package day02;

public class Ex11 {

	public static void main(String[] args) {
		// 순서가 없는 자료구조 - 집합
		// 1.중복을 허용하지 않는다
		// 2.순서o
		
		
		java.util.Set set1;
		set1=new java.util.HashSet();
		set1.add("첫번째");
		set1.add("두번째");
		set1.add("세번째");
		set1.add("네번째");
		set1.add("다섯번째");
		
		System.out.println(set1.remove(new String("첫번째")));
		java.util.Iterator ite;
		ite=set1.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
//		Object[] arr=set1.toArray();
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}
}


#### Map<K,V>
Map은 다른 언어에서는 Associated Array, Dictionary, Symbol Table 등으로 부르기도 합니다.
HashMap – key값의 해쉬값으로 entry를 찾아 데이터에 접급
TreeMap – key값을 기준으로 node의 위치를 재배치하며 저장, Red-Break Tree라는 자료구조
Hashtable – HashMap과 동일한 key값 연결기반 데이터 구조, 차이점은
동기화(Synchronization):
Hashtable은 동기화되어 있어 멀티스레드 환경에서 안전하게 사용할 수 있습니다.
HashMap은 비동기적이므로 멀티스레드 환경에서 동시 접근 시 동기화를 직접 처리해야 합니다.
null 허용 여부:
Hashtable은 null 키를 허용하지 않습니다.
HashMap은 하나의 null 키와 임의의 수의 null 값을 허용합니다.
LinkedHashMap – HashMap를 상속하여 구현되어 거의 동일하나 입력순서에 따라 key의 순서가 보장
package day02;

import java.util.*;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		// map - key:val쌍으로 
		Map map=new TreeMap();
		map.put("key1","key1");
		map.put("key2",1234);
		map.put("key3",'a');
		map.put("key4",true);
		map.put("key5",null);
		
		System.out.println("size:"+map.size());
		
		Collection list = map.values();
		Iterator ite=list.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
		
//		Set entrys=map.entrySet();
//		Iterator ite=entrys.iterator();
//		while(ite.hasNext()) {
//			java.util.Map.Entry entry;
//			entry=(Entry) ite.next();
//			System.out.println(entry.getKey()
//					+":"+entry.getValue());
//		}

//		Set keys=map.keySet();
//		Iterator ite=keys.iterator();
//		while(ite.hasNext()) {
//			Object key=ite.next();
//			System.out.print(key);
//			System.out.print(":");
//			System.out.println(map.get(key));
//		}
	}
}

### Iterating

Iterator 인터페이스는 컬렉션 프레임워크에서 저장된 요소를 읽어오는 방법을 표준화하기 위한 역할을 합니다. 이 인터페이스는 주로 읽기 전용으로 사용되며, hasNext()와 next()라는 두 가지 주요 메소드를 제공합니다. hasNext() 메소드는 다음 요소가 있는지 확인하고, next() 메소드는 다음 요소를 반환합니다.

Iterator 인터페이스는 Collection의 하위 컬렉션들이 소유하고 있으며, 이 컬렉션들은 Iterator 타입의 객체를 반환하는 메소드를 이미 구현하고 있습니다. 예를 들어, List와 Set 계열의 컬렉션들은 Iterator 인터페이스를 구현하지만, Map 계열은 별도의 방법을 사용합니다.

Iterator 인터페이스의 구현 예시는 다음과 같습니다:
// Vector 컬렉션의 Iterator 사용 예
Vector<Integer> vec = new Vector<>();
vec.add(1);
vec.add(2);
vec.add(3);

Iterator<Integer> it = vec.iterator();
while (it.hasNext()) {
    Integer number = it.next();
    System.out.println(number);
}
이 코드는 Vector 컬렉션에 숫자를 추가하고, iterator() 메소드를 사용하여 Iterator 객체를 생성한 다음, hasNext()와 next() 메소드를 사용하여 모든 요소를 출력합니다.

개선된 루프문, 즉 "향상된 for문"은 컬렉션과 배열을 더 쉽게 순회할 수 있도록 도와줍니다. 이 문법은 다음과 같이 사용됩니다:
for (타입 변수명 : 배열 또는 컬렉션) {
    // 반복 실행할 코드
}

ListIterator<E> 인터페이스는 주로 List 인터페이스를 구현한 클래스들에 의해 구현됩니다. 이러한 클래스들은 다음과 같습니다:

ArrayList: 가장 널리 사용되는 List 구현체 중 하나로, 배열 기반의 데이터 구조를 가지고 있습니다.
LinkedList: 이중 연결 리스트 기반의 List 구현체로, 요소의 삽입과 삭제가 빈번할 때 유용합니다.
Vector: ArrayList와 유사하지만, 동기화된 메소드를 제공하여 멀티스레드 환경에서 사용됩니다.
Stack: Vector를 상속받아 구현된 클래스로, 후입선출(LIFO) 방식의 스택 구현을 제공합니다.
이 클래스들은 listIterator() 메소드를 통해 ListIterator 객체를 생성할 수 있으며, 이를 통해 리스트의 요소들을 순회하고 수정하는 등의 작업을 수행할 수 있습니다.
주요 내용은 다음과 같습니다:

	양방향 이동 지원: ListIterator는 컬렉션 요소에 대한 양방향 이동을 지원합니다.
	기능 추가: Iterator 인터페이스를 상속받아 요소 대체, 추가, 인덱스 검색 등의 기능을 추가했습니다.
	List 컬렉션 클래스 사용: List 인터페이스를 구현한 List 컬렉션 클래스에서만 사용 가능합니다.
	메소드 예시: listIterator() 메소드를 사용하여 요소에 접근하고, hasNext() 및 hasPrevious() 메소드를 통해 순방향 및 역순으로 요소를 출력할 수 있습니다.

Map 인터페이스를 구현한 객체를 순회하는 방법은 여러 가지가 있습니다. 주요 방법은 다음과 같습니다:

entrySet() 사용: Map의 entrySet() 메소드는 Map 내의 모든 키-값 쌍을 Set 형태로 반환합니다. 이 Set을 순회하면서 키와 값을 얻을 수 있습니다.
for (Map.Entry<K, V> entry : map.entrySet()) {
    K key = entry.getKey();
    V value = entry.getValue();
    // 키와 값 사용
}

keySet() 사용: Map의 keySet() 메소드는 모든 키를 Set 형태로 반환합니다. 이 Set을 순회하면서 각 키에 해당하는 값을 Map에서 얻을 수 있습니다.
for (K key : map.keySet()) {
    V value = map.get(key);
    // 키와 값 사용
}

values() 사용: Map의 values() 메소드는 모든 값을 컬렉션 형태로 반환합니다. 이 컬렉션을 순회하면서 값을 사용할 수 있습니다.
for (V value : map.values()) {
    // 값 사용
}

Java 8 이상의 forEach 사용: Java 8부터는 Map에 forEach 메소드가 추가되어 람다 표현식을 사용하여 간결하게 순회할 수 있습니다.
map.forEach((key, value) -> {
    // 키와 값 사용
});


### IO 
자바의 I/O(Input/Output)는 데이터의 입출력을 처리하는 기능을 말합니다1. 이는 키보드로 텍스트를 입력하고, 모니터로 입력한 텍스트를 출력하는 것과 같은 입출력의 간단한 예를 포함합니다.

자바에서는 java.io 패키지를 통해 다양한 I/O 관련 클래스를 제공합니다. 이 패키지는 파일과 관련된 처리를 하기 위한 File 클래스와, 데이터 입출력을 위한 다양한 입출력 스트림 클래스를 제공합니다. 스트림 클래스는 바이트(Byte) 기반의 스트림과, 문자(Character) 기반의 스트림으로 나눠집니다. 바이트 기반 스트림은 그림, 멀티미디어, 문자 등 모든 종류의 데이터를 송수신 할 수 있지만, 문자 기반 스트림은 오직 문자만 주고 받을 수 있습니다.

InputStream과 OutputStream은 각각 바이트 기반 입출력 스트림의 최상위 클래스입니다. 이 두 최상위 클래스를 상속받는 하위 클래스는 접미사로 InputStream 혹은 OutputStream이 붙습니다.

간단하게 첫 줄만 번역하면 데이터 스트림, 직렬화 및 파일 시스템을 통한 시스템 입력 및 출력 제공이라는 말을 볼 수가 있습니다. 즉, java.io 패키지 안에는 파일 입출력과 관련된 클래스들로 구성되어 있다는 의미입니다

자바의 I/O(Input/Output)를 사용하는 방법은 크게 세 가지 단계로 나눌 수 있습니다:

스트림 생성: java.io 패키지의 클래스들을 이용해 입력 또는 출력 스트림을 생성합니다. 예를 들어, FileInputStream과 FileOutputStream 클래스는 파일로부터 바이트를 읽고 쓰는데 사용됩니다.
데이터 읽기/쓰기: 생성된 스트림을 통해 데이터를 읽거나 쓸 수 있습니다. read() 메소드를 이용해 데이터를 읽고, write() 메소드를 이용해 데이터를 쓸 수 있습니다.
스트림 닫기: 사용이 끝난 스트림은 반드시 닫아야 합니다. 이는 close() 메소드를 호출함으로써 수행할 수 있습니다.
아래는 파일에서 데이터를 읽어오는 간단한 예제입니다:
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("input.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

이 예제에서는 FileInputStream을 이용해 "input.txt"라는 파일로부터 데이터를 읽어옵니다. read() 메소드는 파일의 끝에 도달하면 -1을 반환하므로, 이를 이용해 파일의 모든 데이터를 읽어올 수 있습니다. 마지막으로, finally 블록에서 close() 메소드를 호출하여 스트림을 닫습니다.

또한, 자바 7부터는 try-with-resources 문을 이용하여 자동으로 리소스를 닫을 수 있습니다. 이를 이용하면 finally 블록에서 수동으로 리소스를 닫는 것을 피할 수 있습니다. 아래는 try-with-resources를 이용한 예제입니다:
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

이 예제에서는 try-with-resources 문을 이용하여 FileInputStream을 생성하고, 작업이 끝나면 자동으로 close() 메소드가 호출되어 스트림이 닫힙니다.

자바에서는 데이터를 입출력하기 위해 다양한 종류의 스트림을 제공합니다. 스트림은 데이터의 흐름을 다루는데 사용되며, 각 끝점의 연결 통로입니다. 스트림의 주요 종류는 다음과 같습니다:

바이트 스트림 (InputStream, OutputStream): 바이트 단위로 데이터를 전송하며, 입출력 대상에 따라 여러 가지의 입출력 스트림이 있습니다. 기본 클래스로 InputStream과 OutputStream이 있으며, 입출력 대상에 따라 여러 가지 자식들을 가지고 있습니다. 예를 들어, 파일은 FileInputStream과 FileOutputStream, 메모리는 ByteArrayInputStream과 ByteArrayOutputStream 등을 사용합니다.
문자기반 스트림 (Reader, Writer): 문자 데이터를 읽고 출력할 때 사용합니다. 이들은 오직 문자만 주고받을 수 있게 특화되어 있습니다. 입력 문자 스트림의 종류에는 Buffer, CharArray, Filter, InputStream, Piped가 있으며, 출력 문자 스트림에는 Buffer, CharArray, Filter, OutputStream, Piped, Print, String 등이 있습니다.
보조 스트림: 실제 데이터를 주고받는 스트림은 아니지만, 스트림의 기능을 향상시키거나 새로운 기능을 추가할 수 있습니다. 예를 들어, text 파일을 읽기 위해 FileInputStream을 사용할 때, 입력 성능을 향상시키기 위해 버퍼를 사용하는 보조스트림인 BufferedInputStream을 사용할 수 있습니다.

자바의 필터 스트림은 다른 스트림과 연결되어 여러 가지 편리한 기능을 제공하는 스트림입니다.  들은 보조 스트림이라고도 불리며, 일부는 FilterInputStream과  FilterOutputStream의 하위 클래스입니다. 필터 스트림은 단독으로 데이터를 읽을 수 없으며, 입력 스트림으로부터 읽힌 데이터만 가공할 수 있습니다.

필터 스트림에는 여러 종류가 있습니다:

	BufferedInputStream / BufferedOutputStream: 이들은 기존 FileStream을 사용했을 때보다 더 빠른 속도를 기대할 수 있습니다. 버퍼의 크기를 지정해 주지 않으면 8192 byte로 설정됩니다.
	DataInputStream / DataOutputStream: 이들은 FilterInputStream과 FilterOutputStream을 상속받았으며, DataInput 인터페이스와 DataOutput 인터페이스를 구현하여 데이터를 읽고 쓰는 데에 있어 byte 단위가 아닌 8가지 기본 자료형의 단위를 사용할 수 있다는 장점이 있습니다.
	PrintStream: 이 필터 스트림의 특징은, 다양한 형태의 데이터를 문자열의 형태로 출력하거나(println), 문자열의 형태로 조합하여 출력한다(printf)는 것입니다.
	FileReader / FileWriter: 이들은 문자 기반의 파일 입출력을 수행합니다.
	CharArrayReader / CharArrayWriter: 이들은 문자 배열을 읽고 쓰는데 사용됩니다.
	PipedReader / PipedWriter: 이들은 스레드 간에 데이터를 전송할 때 사용됩니다.
	StringReader / StringWriter: 이들은 문자열을 읽고 쓰는데 사용됩니다.
	BufferedReader / BufferedWriter: 이들은 버퍼를 사용하여 입출력의 효율성을 높입니다.
	FilterReader / FilterWriter: 이들은 필터 스트림의 기본 클래스로, 다른 필터 스트림들이 이 클래스를 상속받아 사용합니다.
	
필터 스트림은 입출력 스트림에 연결하여 사용하면 됩니다. 이들은 파일 입출력, 문자 변환, 성능 향상, 기본 데이터 타입 입출력, 객체 입출력 등의 기능을 제공합니다.

PipedReader와 PipedWriter를 사용하는 간단한 자바 예제를 보여드리겠습니다. 이 예제에서는 두 개의 스레드를 생성하고, 하나의 스레드에서 다른 스레드로 문자 데이터를 전송합니다:
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

class MyThread extends Thread {
    private PipedReader pr;
    private PipedWriter pw;

    MyThread(String name, PipedReader pr, PipedWriter pw) {
        super(name);
        this.pr = pr;
        this.pw = pw;
    }

    @Override
    public void run() {
        try {
            if (getName().equals("Thread 1")) {
                for (int cnt = 0; cnt < 15; cnt++) {
                    pw.write("Thread 1" + cnt + "\n");
                }
                pw.close();
            } else {
                int item;
                while ((item = pr.read()) != -1) {
                    System.out.print((char) item);
                }
                pr.close();
            }
        } catch (IOException e) {
        }
    }
}

public class PipedThreads {
    public static void main(String[] args) throws Exception {
        PipedWriter pw = new PipedWriter();
        PipedReader pr = new PipedReader(pw);

        MyThread mt1 = new MyThread("Thread 1", pr, pw);
        MyThread mt2 = new MyThread("Thread 2", pr, pw);

        mt1.start();
        Thread.sleep(2000);
        mt2.start();
    }
}

이 코드를 실행하면 "Thread 1"이라는 이름의 스레드가 문자 데이터를 작성하고, "Thread 2"라는 이름의 스레드가 그 데이터를 읽어 출력합니다

### Lambda Expression
함수형 프로그래밍(Functional Programming, FP)은 계산을 수학적 함수의 평가로 취급하고, 상태 변경이나 가변 데이터를 피하는 프로그래밍 패러다임입니다. 이 방식은 코드의 가독성을 높이고, 버그를 줄이며, 프로그램의 예측 가능성을 향상시킵니다.

함수형 프로그래밍의 주요 원칙은 다음과 같습니다:

순수 함수(Pure Function): 같은 입력에 대해 항상 같은 출력을 반환하며, 프로그램의 상태를 변경하지 않는 함수를 말합니다.
일급 객체(First-class Citizen): 함수를 변수에 할당하거나, 다른 함수의 인자로 전달하고, 함수에서 함수를 반환할 수 있음을 의미합니다.
부작용(Side-Effect) 최소화: 함수형 프로그래밍은 부작용을 최소화하고, 순수 함수의 사용을 강조합니다.
자바에서는 전통적으로 객체 지향 프로그래밍 언어였지만, 자바 8부터 람다 표현식(Lambda Expressions), 스트림 API(Stream API), Optional 클래스 등 함수형 프로그래밍을 지원하는 다양한 기능을 도입했습니다1. 람다 표현식을 사용하면 코드를 더 간결하고 명확하게 작성할 수 있으며, 스트림 API를 통해 컬렉션을 함수형 스타일로 쉽게 처리할 수 있습니다.

람다식의 기본 구조는 다음과 같습니다.
(매개변수, ...) -> { 실행문 ... }

여기서 (매개변수, ...)는 오른쪽 중괄호 { } 블록을 실행하기 위해 필요한 값을 제공하는 역할을 합니다. 매개 변수의 이름은 개발자가 자유롭게 지정할 수 있으며 인자타입도 명시하지 않아도 됩니다. -> 기호는 매개 변수를 이용해서 중괄호 { } 바디를 실행한다는 뜻으로 해석하면 됩니다.

간단한 람다식 사용 예제를 살펴보겠습니다:

람다식을 사용하지 않은 경우 
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

// 람다식을 사용하지 않고 Say 인터페이스를 구현합니다.
Person person = new Person();
person.hi(new Say() {
    public int something(int a, int b) {
        System.out.println("My Name is Coding-Factory");
        System.out.println("Nice to meet you");
        System.out.println("Parameter number is " + a + ", " + b);
        return 7;
    }
});

람다식을 사용한 경우
// 람다식을 사용하여 Say 인터페이스를 구현합니다.
Person person = new Person();
person.hi((a, b) -> {
    System.out.println("This is Coding-Factory!");
    System.out.println("Thank you, Lambda");
    System.out.println("Parameter number is " + a + ", " + b);
    return 7;
});

람다식의 장단점:

장점:
코드를 간결하게 만들 수 있습니다.
가독성이 향상되며, 개발자의 의도가 명확하게 드러납니다.
함수를 만들지 않고 한 번에 처리할 수 있어 코딩 시간이 줄어듭니다.
병렬 프로그래밍에 용이합니다.
단점:
람다를 사용하여 만든 무명 함수는 재사용이 불가능합니다.
디버깅이 다소 까다롭습니다.
람다를 남발하면 코드가 지저분해질 수 있습니다.
재귀로 만들 경우에는 다소 부적합할 수 있습니다.


### Functional Interface
자바에서 함수형 인터페이스(Functional Interface)는 추상 메서드가 딱 하나만 존재하는 인터페이스를 말합니다. 이는 함수를 1급 객체처럼 다룰 수 있게 해주는 어노테이션으로, 인터페이스에 선언하여 단 하나의 추상 메소드만을 갖도록 제한하는 역할을 합니다. 람다식은 이러한 함수형 인터페이스를 기반으로만 작성이 될 수 있습니다.

함수형 인터페이스는 자바 언어의 단점을 보완하기 위해 도입되었습니다. 자바는 기본적으로 함수를 일급 객체로 사용할 수 없는데, 이를 보완하기 위해 함수형 인터페이스가 도입되었습니다. 덕분에 자바는 전보다 간결한 표현이 가능해졌고, 가독성이 높아졌습니다.

함수형 인터페이스는 다음과 같은 형태를 가집니다:
@FunctionalInterface
interface InterfaceName {
    ReturnType methodName(Type parameter);
}
여기서 @FunctionalInterface는 이 인터페이스가 함수형 인터페이스임을 나타내는 어노테이션입니다. InterfaceName은 인터페이스의 이름, methodName은 메소드의 이름, Type은 매개변수의 타입, ReturnType은 메소드의 반환 타입을 나타냅니다.

자바에서 함수형 인터페이스를 사용하는 간단한 예제는 다음과 같습니다:
@FunctionalInterface
interface Compare {
    int compareTo(int a, int b);
}

public class Main {
    public static void exec(Compare com) {
        int k = 10;
        int m = 20;
        int value = com.compareTo(k, m);
        System.out.println(value);
    }

    public static void main(String[] args) {
        exec((i, j) -> {
            return i + j;
        });
    }
}
이 예제에서는 Compare라는 함수형 인터페이스를 선언하고, compareTo라는 메소드를 정의합니다. 그리고 exec라는 메소드에서 Compare 인터페이스의 compareTo 메소드를 호출합니다. 마지막으로 main 메소드에서 exec 메소드를 호출하면서 람다식 (i, j) -> { return i + j; }을 인자로 전달합니다.

### Stream API
자바의 스트림 API(Stream API)는 자바 8부터 도입된 기능으로, 컬렉션 데이터를 처리하고 변환하는 작업을 간단하게 할 수 있는 API입니다. 스트림 API를 사용하면 선언적으로 데이터 컬렉션을 처리할 수 있으며, 복잡한 작업도 간결한 코드로 표현할 수 있습니다.

스트림 API의 주요 특징은 다음과 같습니다:

	내부 반복: 스트림은 외부 반복을 통해 작업하는 컬렉션과는 달리 내부 반복을 통해 작업을 수행합니다.
	단 한 번만 사용: 스트림은 재사용이 가능한 컬렉션과는 달리 단 한 번만 사용할 수 있습니다.
	원본 데이터를 변경하지 않음: 스트림은 원본 데이터를 변경하지 않습니다.
스트림 API는 데이터를 추상화하여 다루므로, 다양한 방식으로 저장된 데이터를 읽고 쓰기 위한 공통된 방법을 제공합니다. 따라서 스트림 API를 이용하면 배열이나 컬렉션뿐만 아니라 파일에 저장된 데이터도 모두 같은 방법으로 다룰 수 있게 됩니다.

스트림 API를 사용하는 예시 코드는 다음과 같습니다:
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println(squaredNumbers);
    }
}

이 코드에서 List<Integer> numbers는 정수의 리스트를 나타내며, stream() 메소드를 통해 스트림으로 변환된 후, map() 메소드를 사용해 각 요소를 제곱하는 함수가 적용됩니다. 마지막으로, collect() 메소드를 통해 결과를 다시 리스트로 수집합니다.

자바의 스트림 API를 사용하는 방법은 크게 세 가지 단계로 나눌 수 있습니다:

	생성하기: 스트림 객체를 생성하는 단계입니다. 스트림은 재사용이 불가능하므로, 닫히면 다시 생성해주어야 합니다. 이는 Collection 인터페이스에 정의된 stream() 메소드를 호출함으로써 수행할 수 있습니다.

	가공하기: 원본의 데이터를 별도의 데이터로 가공하기 위한 중간 연산입니다. 연산 결과를 스트림으로 다시 반환하기 때문에 연속해서 중간 연산을 이어갈 수 있습니다. 예를 들어, filter, map 등의 메소드가 있습니다.

	결과 만들기: 가공된 데이터로부터 원하는 결과를 만들기 위한 최종 연산입니다. 예를 들어, collect, count, forEach 등의 메소드가 있습니다.


아래는 리스트에서 짝수만을 필터링하고, 각 숫자에 10을 곱한 후, 그 결과를 출력하는 스트림 API 사용 예제입니다:
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
numbers.stream()
    .filter(n -> n % 2 == 0)
    .map(n -> n * 10)
    .forEach(System.out::println);

이 예제는 스트림 API를 사용하여 데이터를 선언적으로 처리하는 방법을 보여줍니다. 스트림 API를 사용함으로써 개발자는 '무엇을 할 것인가 (What)'에 집중할 수 있으며, '어떻게 할 것인가 (How)'에 대한 부담을 줄일 수 있습니다.

스트림 API는 다양한 데이터 처리 작업에 활용될 수 있습니다. 예를 들어, 데이터 필터링, 변환, 집계 등의 작업을 간결하고 효율적으로 수행할 수 있습니다. 왜냐하면 스트림 API는 데이터를 추상화하고, 함수형 프로그래밍의 장점을 활용할 수 있기 때문입니다. 아래 코드는 스트림 API를 사용하여 문자열 리스트에서 특정 문자열을 찾아 그 개수를 세는 예제입니다:
List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
long count = strings.stream()
    .filter(s -> s.startsWith("a"))
    .count();
System.out.println("'a'로 시작하는 단어의 개수: " + count);

이 예제는 스트림 API를 사용하여 데이터를 처리하는 과정에서 발생할 수 있는 복잡성을 크게 줄일 수 있음을 보여줍니다. 이와 같이 스트림 API를 적용하면, 보다 선언적이고 간결한 코드로 데이터 처리 로직을 구현할 수 있습니다.

 
## 3일차 
### Thread
프로세스(Process): 프로세스는 실행 중인 프로그램을 의미하며, 운영체제로부터 자원을 할당받은 독립적인 작업 단위입니다. 각 프로세스는 독립된 메모리 영역(Code, Data, Stack, Heap)을 가지고 있어, 다른 프로세스와 자원을 공유하지 않습니다.
스레드(Thread): 스레드는 프로세스 내에서 실행되는 실행 흐름의 단위로, 프로세스의 자원을 공유합니다. 스레드는 프로세스 내에서 코드, 데이터, 힙 영역을 공유하면서 실행되지만, 각 스레드마다 별도의 스택을 가집니다.
간단히 말해, 프로세스는 실행 중인 프로그램 자체이고, 스레드는 그 프로그램 내에서 개별적으로 실행되는 작업의 흐름입니다. 멀티스레딩을 사용하면 하나의 프로세스 내에서 여러 작업을 동시에 처리할 수 있어, 자원을 보다 효율적으로 사용할 수 있습니다.

스레드의 역사는 1965년 버클리 시분할 시스템에서 '프로세스’라는 이름으로 처음 사용되었습니다. 이후, 1970년대에 멀틱스(Multics)에서 맥스 스미스(Max Smith)에 의해 최초로 구현되었고, IBM의 PL/I 프로그래밍 언어에서도 ‘TASK’ 명령을 통해 스레드를 생성할 수 있었습니다. 유닉스의 등장과 함께 프로세스 개념이 확장되었고, 이후 사용자들은 메모리를 공유할 수 있는 ‘라이트웨이트(lightweight)’ 스레드를 그리워하게 되었으며, 이것이 스레드 발명으로 이어졌습니다.

스레드는 프로그램 내에서 실행되는 흐름의 단위로, 일반적으로 한 프로그램은 하나의 스레드를 가지지만, 멀티스레드 환경에서는 여러 스레드를 동시에 실행할 수 있습니다. 
스레드는 현대 운영체제의 핵심 기술로, 프로세스 내에서 독립적인 실행 흐름을 가지며, 프로세스의 자원과 메모리를 공유합니다. 스레드 구현에는 사용자 수준 스레드와 커널 수준 스레드 두 가지 방식이 있으며, 이를 통해 멀티태스킹 환경에서 프로그램의 응답성이 향상되고, 시스템의 자원을 보다 효율적으로 사용할 수 있습니다.

쓰레드란 프로그램(프로세스) 실행의 단위이며 하나의 프로세스는 여러개의 쓰레드로 구성이 가능하다.
하나의 프로세스를 구성하는 쓰레드들은 프로세스에 할당된 메모리, 자원 등을 공유한다.

프로세스와 같이 실행, 준비, 대기 등의 실행 상태를 가지며 실행 상태가 변할때마다 쓰레드 문맥교환(context switching)을 수행한다.

각 쓰레드별로 자신만의 스택과 레지스터를 가진다.
 
PC 레지스터(Program Counter)는 현재 실행 중인 스레드의 JVM(Java Virtual Machine) 명령어 주소를 가리키는 데 사용됩니다. 이 레지스터는 JVM이 실행하는 각 스레드마다 별도로 존재하며, 현재 실행 중인 명령어의 위치를 추적하는 데 중요한 역할을 합니다

 

자바 스레드의 라이프사이클은 다음과 같은 상태로 구성됩니다:

Runnable (준비상태): 스레드 객체가 생성되고 실행될 준비가 된 상태입니다start() 메소드 호출로 이 상태에 진입합니다.
Running (실행상태): 스레드가 CPU 스케줄러에 의해 선택되어 실행되는 상태입니다.
Blocked (지연 상태): 스레드가 실행 중 일시적으로 작업을 멈추고 대기하는 상태입니다. 이는 동기화 블록에 의해 발생하거나, I/O 작업을 기다리는 경우에 발생할 수 있습니다.
Dead (종료상태): 스레드의 run() 메소드가 완료되어 더 이상 실행할 코드가 없거나, stop() 메소드가 호출되어 스레드가 종료된 상태입니다.
스레드의 상태는 Thread.State 열거형을 통해 확인할 수 있으며, 스레드의 상태를 관리하는 것은 자바 멀티스레드 프로그래밍에서 중요한 부분입니다. 각 상태는 스레드의 작업 수행 능력과 관련이 있으며, 스레드 스케줄링과 동기화에 영향을 미칩니다.

 

자바에서 스레드를 생성하는 방법은 크게 두 가지가 있습니다:

Thread 클래스 상속: Thread 클래스를 상속받아 run() 메소드를 오버라이드하는 방법입니다. 예를 들어:

public class MyThread extends Thread {
    @Override
    public void run() {
        // 스레드가 실행할 코드
    }
}

그리고 start() 메소드를 호출하여 스레드를 실행합니다:
MyThread t = new MyThread();
t.start();
Runnable 인터페이스 구현: Runnable 인터페이스를 구현하고, run() 메소드를 오버라이드하여 스레드를 생성하는 방법입니다. 예를 들어:
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // 스레드가 실행할 코드
    }
}

그런 다음 Thread 객체를 생성하고 Runnable 객체를 전달하여 스레드를 실행합니다:
MyRunnable r = new MyRunnable();
Thread t = new Thread(r);
t.start();


이 두 방법 모두 자바 프로그램에서 멀티스레딩을 구현할 때 사용됩니다. 선택은 클래스의 다른 상속 요구 사항이나 설계에 따라 달라질 수 있습니다.

#### 스레드의 상태
자바에서 스레드의 상태를 확인하는 예시는 다음과 같습니다:
public class ThreadStateCheck {
    public static void main(String[] args) {
        // 스레드 생성
        Thread thread = new Thread(() -> {
            try {
                // 스레드를 1초간 대기
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // 스레드 상태 출력
        System.out.println("Before start: " + thread.getState());

        // 스레드 시작
        thread.start();

        // 스레드 상태 출력
        System.out.println("After start: " + thread.getState());

        // 스레드가 종료될 때까지 대기
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // 스레드 상태 출력
        System.out.println("After join: " + thread.getState());
    }
}
이 코드는 스레드를 생성하고, getState() 메소드를 사용하여 스레드의 상태를 확인하는 과정을 보여줍니다. 스레드가 시작되기 전(Before start), 시작된 후(After start), 그리고 종료된 후(After join)의 상태를 출력합니다. 이러한 방법으로 스레드의 생명 주기 동안 각 단계에서 스레드의 상태를 확인할 수 있습니다

#### 동기화

스레드 간의 경쟁 상태(Race Condition)는 여러 스레드가 동시에 공유 자원에 접근하려고 할 때 발생합니다. 특히, 한 스레드가 데이터를 읽거나 쓰는 동안 다른 스레드가 동일한 데이터에 접근하여 변경을 시도할 때 이러한 상태가 발생할 수 있습니다. 이로 인해 데이터의 불일치 문제가 발생하며, 예상치 못한 결과를 초래할 수 있습니다.

예를 들어, 두 스레드가 동시에 같은 변수를 증가시키려고 할 때, 한 스레드가 변수의 값을 읽고, 그 값에 1을 더한 다음, 결과를 저장하기 전에 다른 스레드가 동일한 값을 읽어서 1을 더하고 저장한다면, 두 스레드 모두가 동일한 초기 값을 기반으로 연산을 수행하기 때문에, 실제로는 변수가 두 번 증가해야 하지만 실제로는 한 번만 증가하는 문제가 발생합니다.

따라서 멀티스레드 프로그래밍에서는 동기화 메커니즘을 사용하여 이러한 경쟁 상태를 방지하고, 공유 자원에 대한 안전한 접근을 보장해야 합니다. 이에대한 해결책으로

	배타적 실행: 한 스레드가 공유 데이터를 변경하는 동안 다른 스레드의 접근을 막아 일관되지 않은 상태를 방지합니다.
	가시성: 한 스레드에서 이루어진 변경 사항을 다른 스레드에서 볼 수 있도록 합니다.
	순서화: 코드 실행 순서가 바뀌는 것을 방지하여, 스레드 간의 예측 가능한 실행 순서를 보장합니다.
	
동기화를 통해 스레드들이 공유 자원에 대한 접근을 순차적으로 할 수 있게 하여, 데이터의 안정성을 확보하고 예상치 못한 결과를 방지할 수 있습니다

자바에서 스레드 간의 동기화는 주로 synchronized 키워드를 사용하여 이루어집니다. 이 키워드는 메소드 전체나 특정 코드 블록에 대해 동기화를 적용할 수 있으며, 공유 자원에 대한 동시 접근을 제어하여 데이터의 일관성과 무결성을 유지하는 데 목적이 있습니다. synchronized로 지정된 영역은 한 번에 하나의 스레드만이 접근할 수 있으며, 다른 스레드는 해당 영역이 사용 가능해질 때까지 대기해야 합니다.

예를 들어, 다음과 같이 메소드 전체를 동기화할 수 있습니다:
public synchronized void synchronizedMethod() {
    // 공유 자원을 사용하는 코드
}
또는 특정 코드 블록만 동기화할 수도 있습니다:
public void method() {
    synchronized(this) {
        // 공유 자원을 사용하는 코드
    }
}

wait(), notify(), notifyAll() 메소드를 사용하여 스레드 간의 통신을 조정할 필요가 있습니다. 이 메소드들은 스레드가 객체의 잠금을 해제하고 대기하거나, 대기 중인 스레드를 깨우는 데 사용됩니다.

class SharedArea {
    private int counter = 0;
    private boolean available = false;

    public synchronized int getCounter() {
        // 스레드가 counter 값을 요청할 때, 값이 설정되지 않았다면 대기
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        available = false; // 값을 가져갔으니 다시 false로 설정
        notifyAll(); // 다른 스레드에게 counter 사용 가능함을 알림
        return counter;
    }

    public synchronized void setCounter(int value) {
        // 스레드가 counter 값을 설정할 때, 이전 값이 아직 사용 중이라면 대기
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        counter = value;
        available = true; // 새 값이 설정되었으니 true로 설정
        notifyAll(); // 다른 스레드에게 새 값이 설정됨을 알림
    }
}

class ProducerThread extends Thread {
    private SharedArea sharedArea;

    public ProducerThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedArea.setCounter(i);
            System.out.println("생산자: " + i + " 설정");
        }
    }
}

class ConsumerThread extends Thread {
    private SharedArea sharedArea;

    public ConsumerThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    public void run() {
        int value;
        for (int i = 0; i < 10; i++) {
            value = sharedArea.getCounter();
            System.out.println("소비자: " + value + " 가져옴");
        }
    }
}

public class ThreadSyncExample {
    public static void main(String[] args) {
        SharedArea sharedArea = new SharedArea();
        Thread producer = new ProducerThread(sharedArea);
        Thread consumer = new ConsumerThread(sharedArea);

        producer.start();
        consumer.start();
    }
}

#### 스레드 풀
스레드 풀을 사용하는 방법은 ExecutorService 인터페이스와 Executors 클래스를 활용하는 것입니다. 스레드 풀은 미리 생성된 스레드 집합을 관리하여, 작업을 효율적으로 처리할 수 있게 해줍니다. 다음은 스레드 풀을 사용하는 기본적인 단계입니다:

스레드 풀 생성: Executors 클래스의 정적 메소드를 사용하여 스레드 풀을 생성합니다. 예를 들어, 고정된 수의 스레드를 가진 풀을 만들고 싶다면 newFixedThreadPool 메소드를 사용할 수 있습니다.
ExecutorService executorService = Executors.newFixedThreadPool(10);
 // 10개의 스레드를 가진 풀 생성

작업 제출: execute 또는 submit 메소드를 사용하여 스레드 풀에 작업을 제출합니다. execute는 반환 값이 없는 작업에 사용되며, submit은 Future 객체를 통해 결과를 반환할 수 있는 작업에 사용됩니다.
executorService.submit(() -> {
    // 여기에 작업 코드를 작성
});

스레드 풀 종료: 작업이 모두 완료되면 shutdown 메소드를 호출하여 스레드 풀을 종료합니다. 이는 스레드 풀이 더 이상 새로운 작업을 받지 않도록 하며, 현재 진행 중인 작업들은 완료됩니다.
executorService.shutdown();

스레드 풀을 사용하면 스레드 생성과 소멸에 따른 오버헤드를 줄이고, 시스템 자원을 효율적으로 사용할 수 있습니다

주요 스레드풀의 종류는 다음과 같습니다:

newFixedThreadPool: 고정된 수의 스레드를 생성하고, 스레드가 종료되면 새로운 스레드를 생성하여 수를 유지합니다1.
newCachedThreadPool: 필요에 따라 스레드 수를 증가시키며, 사용하지 않는 스레드는 일정 시간 후에 제거합니다. 최대 스레드 수는 Integer.MAX_VALUE입니다1.
newSingleThreadExecutor: 단일 스레드를 사용하여 작업을 순차적으로 실행합니다1.
newScheduledThreadPool: 예약된 작업이나 반복 작업을 위한 스레드풀로, 특정 시간 이후 또는 주기적으로 작업을 실행할 때 사용됩니다1.
이러한 스레드풀은 자바의 java.util.concurrent.Executors 클래스를 통해 제공되며, 각각의 사용 사례에 따라 적절한 스레드풀을 선택하여 사용할 수 있습니다.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // 스레드풀 생성: 10개의 스레드를 유지하는 고정된 스레드풀
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // 100개의 작업을 스레드풀에 제출
        for (int i = 0; i < 100; i++) {
            executor.submit(new Task(i));
        }

        // 스레드풀 종료 요청
        executor.shutdown();
        try {
            // 모든 작업이 완료될 때까지 대기
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Task implements Runnable {
    private int taskId;

    public Task(int id) {
        this.taskId = id;
    }

    @Override
    public void run() {
        // 작업 내용
        System.out.println("Task ID : " + this.taskId + " performed by " 
                           + Thread.currentThread().getName());
    }
}

이 코드는 newFixedThreadPool 메소드를 사용하여 고정된 수(10개)의 스레드를 가진 스레드풀을 생성합니다. 그런 다음 for 루프를 사용하여 100개의 작업을 스레드풀에 제출합니다. 각 작업은 Task 클래스의 인스턴스로, Runnable 인터페이스를 구현합니다. 마지막으로 shutdown 메소드를 호출하여 스레드풀의 종료를 요청하고, awaitTermination 메소드로 모든 작업이 완료될 때까지 대기합니다.

Callable 인터페이스를 사용하여 스레드 풀에서 작업을 수행하고 결과를 반환받을 수도 있습니다.

1.	Callable 인터페이스 구현: Callable 인터페이스를 구현하는 클래스를 생성하고, call() 메소드를 오버라이드하여 작업 내용을 정의합니다. call() 메소드는 작업의 결과를 반환합니다.
import java.util.concurrent.Callable;

public class WordLengthCallable implements Callable<Integer> {
    private final String word;

    public WordLengthCallable(String word) {
        this.word = word;
    }

    @Override
    public Integer call() {
        return word.length(); // 단어의 길이를 반환
    }
}

2.	스레드 풀 생성: Executors 클래스의 정적 메소드를 사용하여 스레드 풀을 생성합니다.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

ExecutorService pool = Executors.newFixedThreadPool(3); 
// 3개의 스레드를 가진 풀 생성

3.	작업 제출 및 결과 처리: submit() 메소드를 사용하여 Callable 객체를 스레드 풀에 제출하고, Future 객체를 통해 결과를 처리합니다.
import java.util.concurrent.Future;

Callable<Integer> callable = new WordLengthCallable("Hello");
Future<Integer> future = pool.submit(callable);

// 나중에 결과를 가져옵니다. 필요하다면 이 부분에서 블로킹될 수 있습니다.
Integer result = future.get();

4.	스레드 풀 종료: 모든 작업이 완료된 후에는 스레드 풀을 종료합니다.
pool.shutdown();

Callable을 사용하면 작업의 결과를 Future 객체를 통해 비동기적으로 받을 수 있으며, 예외 처리도 보다 용이합니다

### 통신
URL (Uniform Resource Locator): URL은 웹 자원의 실제 위치를 가리킵니다. 즉, 컴퓨터 네트워크 상에서 리소스가 어디 있는지를 알려주는 규약입니다. 예를 들어, http://abc.com/index는 abc.com에서 index라는 경로를 나타내고 있으며, 이는 자원의 실제 위치이므로 URL입니다.
URI (Uniform Resource Identifier): URI는 웹 자원을 식별하는 데 사용됩니다. 이는 리소스의 위치뿐만 아니라 자원에 대한 고유 식별자로서 URL을 의미를 포함합니다. 예를 들어, http://abc.com/user/107에서 http://abc.com/user/까지는 자원의 실제 위치를 나타내므로 URL이며, 끝의 /107 부분은 식별자이므로 http://abc.com/user/107은 URL을 포함한 URI라고 볼 수 있습니다.
따라서, URL은 URI의 하위 집합으로 볼 수 있으며, 모든 URL은 URI이지만 모든 URI가 URL인 것은 아닙니다.
package day03;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex01 {

	public static void main(String[] args) {
		try {
//			java.net.URL url=new URL("https://www.busan.go.kr/nbnews/1567932?curPage=&srchBeginDt=2022-06-09&srchEndDt=2023-06-09&searchKey=&searchText=");
			java.net.URL url=new URL("https://getbootstrap.com/docs/3.4/css/#tables");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println(url.getRef());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}


#### 웹 스크래핑
Java.net 패키지 라이브러리 사용
package day03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

public class Ex02 {

	public static void main(String[] args) {
		File google =new File("daum.html");
		URLConnection conn=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		Writer fw=null;
		try {
			URL url=new URL("https://daum.net");
			conn=url.openConnection();
			is = conn.getInputStream();
			isr=new InputStreamReader(is,"UTF-8");
			br=new BufferedReader(isr);
			fw=new FileWriter(google, Charset.forName("UTF-8"));
			String msg=null;
			while((msg=br.readLine())!=null)
				fw.write(msg);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw!=null)fw.close();
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

Jsoup 라이브러리 사용: Jsoup은 HTML 문서를 파싱하고, DOM을 탐색하며, 데이터를 추출하는 데 사용되는 Java 라이브러리입니다. 웹 페이지로부터 HTML 소스 코드를 가져오기 위해 connect() 메소드를 사용하고, select() 메소드로 DOM을 쿼리하여 필요한 데이터를 추출할 수 있습니다
package day03;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Ex03 {
    public static void main(String[] args) {
        try {
            // 웹 페이지로부터 HTML을 가져옵니다.
            Document doc = Jsoup.connect("https://jsoup.org/").get();
            
            // 원하는 요소를 선택합니다.
            Elements newsHeadlines = doc.select("h2");
            
            // 추출된 데이터를 출력합니다.
            for (Element headline : newsHeadlines) {
                System.out.println(headline.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

Json 페이지의 경우:
package day03;

import org.json.JSONArray;
import org.json.JSONObject;

public class Ex04 {
    public static void main(String[] args) {
        String jsonString="{\"root\":[{\"id\":1111,\"name\":\"guest\"},{\"id\":2222,\"name\":\"admin\"}]}";
        JSONObject obj = new JSONObject(jsonString);
        JSONArray arr = obj.getJSONArray("root");
        for(int i = 0; i < arr.length(); i++){
            JSONObject item = arr.getJSONObject(i);
            // 배열 내 아이템 사용
            int id=item.getInt("id");
            String name=item.getString("name");
            System.out.println(String.format("%s:%s", id,name));
        }
    }
}

### 멀티통신
Client
package day03;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex06 extends Frame implements ActionListener {
	static TextArea ta;
	static TextField tf;
	static PrintStream ps;
	
	public Ex06() {
		setLayout(new BorderLayout());
		
		ta=new TextArea();
		tf=new TextField();
		tf.addActionListener(this);
		add(BorderLayout.CENTER,ta);
		add(BorderLayout.SOUTH,tf);
		
		setBounds(100,100,300,600);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg=tf.getText();
		ps.println(msg);
		tf.setText("");
	}


	public static void main(String[] args) {
		Ex06 me=new Ex06();
		byte[] addr= {127,0,0,1};
		// byte[] addr= {(byte)192,(byte)168,20,25};
		int port=3000;
		
		java.net.Socket sock=null;
		try {
			sock=new Socket(InetAddress.getByAddress(addr),port);
			OutputStream os = sock.getOutputStream();
			InputStream is = sock.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			ps=new PrintStream(os);
			String msg=null;
			while((msg=br.readLine())!=null) {
				ta.setText(ta.getText()+msg+"\n");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

Server
package day03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Ex07 extends Thread {
	Socket sock;
	static List<OutputStream> list=new ArrayList<>();
	
	public Ex07(Socket sock) {
		this.sock=sock;
	}
	
	@Override
	public void run() {
		try {
			InputStream is = sock.getInputStream();
			OutputStream os = sock.getOutputStream();
			list.add(os);
			while(true) {
				for(OutputStream os2:list)
					os2.write(is.read());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try(
			ServerSocket serv=new ServerSocket(3000);
				) {
			
			while(true) {
				Socket sock=serv.accept();
				System.out.println(sock.getInetAddress().getHostAddress());
				Ex07 me=new Ex07(sock);
				me.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


### 프로토콜의 의의

네트워킹에서 데이터 서식 지정 및 처리를 위한 규칙의 집합입니다. 컴퓨터나 기기들이 서로 통신할 수 있도록 하는 공통 언어와 같으며, OSI 모델의 다양한 계층에 속하는 여러 프로토콜이 있습니다. 예를 들어, 인터넷 프로토콜(IP)은 데이터 패킷의 출처와 목적지를 표시하여 라우팅을 담당하고, 전송 제어 프로토콜(TCP)은 네트워크를 통한 데이터 패킷의 전송이 원활하게 진행되도록 보장합니다. 또한, HTTP는 웹 페이지와 같은 데이터를 전송하는 데 사용되며, HTTPS는 HTTP 메시지를 암호화하여 보안을 강화합니다.

프로토콜은 네트워크에 연결된 컴퓨터 간 정보를 주고받을 때 지키기로 약속한 규칙으로, 접속 방식, 데이터 형식, 전달 방식 등을 정합니다. 이러한 프로토콜은 네트워크의 안정성과 효율성을 보장하며, 다양한 네트워크 장비와 시스템이 서로 호환될 수 있도록 합니다.

HTTP(Hypertext Transfer Protocol)는 웹에서 데이터를 주고받기 위한 기본적인 프로토콜입니다. 클라이언트-서버 모델을 기반으로 하며, 주로 웹 브라우저(클라이언트)와 웹 서버 사이의 통신에 사용됩니다. HTTP의 주요 특징은 다음과 같습니다:

비연결성: HTTP는 요청을 처리하고 응답을 한 후 연결을 끊는 비연결성 프로토콜입니다. 이는 서버가 동시에 많은 클라이언트의 요청을 처리할 수 있게 해줍니다.
무상태성: HTTP는 이전 요청의 정보를 기억하지 않는 무상태 프로토콜입니다. 이는 각 요청이 독립적이라는 것을 의미합니다.
확장 가능성: HTTP 헤더를 통해 새로운 기능을 쉽게 추가할 수 있습니다. 이를 통해 프로토콜을 확장하고 다양한 데이터 형식을 지원할 수 있습니다.
HTTP 작동 방식은 다음과 같습니다:

요청(Request): 클라이언트가 서버에 데이터를 요청할 때 HTTP 요청 메시지를 보냅니다. 이 메시지에는 요청하는 리소스의 URL, HTTP 메소드(GET, POST 등), 헤더, 그리고 필요한 경우 본문 데이터가 포함됩니다.
응답(Response): 서버는 클라이언트의 요청을 처리한 후 HTTP 응답 메시지를 보냅니다. 응답에는 상태 코드(200 OK, 404 Not Found 등), 응답 헤더, 그리고 요청된 데이터가 포함될 수 있습니다.

참고
웹 프로토콜의 국제 표준 문서는 주로 다음과 같은 기관들에 의해 제정 및 관리됩니다:

IETF: 인터넷에서 사용되는 기술들을 표준화하는 국제 조직입니다. 인터넷의 발전과 구조의 진화를 위해 다양한 표준을 제정하고 관리합니다.
W3C (World Wide Web Consortium): 웹의 잠재된 가능성을 이끌어내기 위한 국제적인 컨소시엄으로, 웹 관련 제품의 상호 호환성을 향상시키기 위한 개방적인 규격을 작성합니다.
WAI (Web Accessibility Initiative): 웹 접근성과 관련된 국제 표준을 제공합니다.
RFC: IETF에서 제공하고 관리하는 문서로, 인터넷 개발에 필요한 기술, 연구 결과, 절차 등을 기술해 놓은 메모입니다. 인터넷 표준은 대부분 RFC로 문서화되며, 이 문서들은 공개적으로 토론과 검토를 거쳐 표준화됩니다.
간단히 말해, IETF는 인터넷 기술의 규칙을 정하는 조직이고, RFC는 그 규칙이 문서화된 형태입니다. IETF에서 정한 규약이나 기술 사양은 RFC 문서로 발행되어 인터넷 커뮤니티에 의해 검토되고, 필요한 경우 표준으로 채택됩니다.
이러한 기관들은 웹의 상호운용성, 접근성, 그리고 발전을 위해 다양한 표준 문서를 발행하고 있으며, 이 문서들은 웹 개발자들이 웹 사이트와 애플리케이션을 구축할 때 따라야 하는 지침을 제공합니다. 또한, 이 표준들은 웹의 안정성과 확장성을 보장하며, 사용자들에게 일관된 웹 경험을 제공하기 위한 기반이 됩니다. 웹 표준 문서에는 HTML, CSS, JavaScript 등의 기술 사양이 포함되어 있습니다.



### 웹서버 구현
package day03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex08 extends Thread {
	Socket sock;
	
	public Ex08(Socket sock) {
		this.sock=sock;
	}
	
	@Override
	public void run() {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = sock.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			
			String msg=br.readLine(); //GET / HTTP/1.1
			String[] msgs=msg.split(" ");
			os = sock.getOutputStream();
			if(msgs[1].equals("/")) msgs[1]="/index.html";
			File f=new File("ROOT"+msgs[1]);
			if(f.exists()){
				os.write("HTTP/1.1 200 ok\n".getBytes());
			}else {
				f=new File("ROOT/err.html");
				os.write("HTTP/1.1 200 ok\n".getBytes());
			}
			InputStream is2=new FileInputStream(f);
			os.write("Content-Type:text/html; charset=utf-8\n".getBytes());
			os.write("\n".getBytes());
			int cnt=-1;
			while((cnt=is2.read())!=-1)
				os.write(cnt);
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null)os.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try(
				ServerSocket serv=new ServerSocket(8080);
				) {
			
			while(true) {
				Socket sock=serv.accept();
//				System.out.println(sock.getInetAddress().getHostAddress());
				Ex08 me=new Ex08(sock);
				me.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}




