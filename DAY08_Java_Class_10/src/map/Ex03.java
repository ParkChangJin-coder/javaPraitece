package map;

import java.util.*;

class Student{
	public int studentID;
	public String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (student.studentID == studentID) && name.equals(student.name);
		}else {
			return false;
		}
	};
	
	@Override
	public int hashCode() {
		return (studentID + name).hashCode();
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(1, "홍길동"), 90);
		map.put(new Student(2, "성춘향"), 99);
		map.put(new Student(3, "이몽룡"), 80);
		map.put(new Student(1, "홍길동"), 95);
		
		System.out.println("총 엔트리 수 : " + map.size());
		//equals와 hashcode override가 없다면 size는 4개가 된다.
		System.out.println();
		
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			Student key = keyIter.next();
			int value = map.get(key);
			System.out.println("학번은 : " + key.studentID);
			System.out.println("이름은 : " + key.name);
			System.out.println("점수는 : " + value);
			System.out.println();
		}
	}
}
