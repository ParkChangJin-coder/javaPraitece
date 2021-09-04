package inheritance;

class Parent{ //부모클래스
	int parentField;
	
	public Parent() {
		System.out.println("부모 클래스 생성자입니다.");
	}
	
	public void ParentMethod() {
		System.out.println("부모 클래스 메소드 입니다.");
	}
}

class Child extends Parent{ //자식 클래스
	int childField;
	
	public Child() {
		//super(); 명시를 안 해도 컴파일러가 자동으로 생성
		// this.와 마찬가지로 첫줄에만 올 수 있다.
		System.out.println("자식 클래스 생성자 입니다.");
	}
	
	public void ChildMethod() {
		System.out.println("자식 클래스 메소드 입니다.");
	}
	
}

public class Ex01 {
	
	public static void main(String[] args) {
		Child child = new Child(); //자식 클래스 객체 생성
		//Parent parent = new Parent();
		
		child.childField = 20;
		System.out.println(child.childField);
		
		child.parentField = 50;
		System.out.println(child.parentField);
		
		child.ChildMethod(); //자식 메소드 호출
		child.ParentMethod(); //부모 메소드 호출
		//parent.parentField = 100;
		//System.out.println(parent.parentField);
		//parent.ParentMethod();
	}

}
