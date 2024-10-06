package java_interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Student> studentList = Stream.of(
		new Student(1,"srini",44,"male","computer science","Salem",4,Arrays.asList("+18764672378","+17654562340"),678),
		new Student(3,"Kumar",41,"male","Mechanical","Irving",7,Arrays.asList("+18736788990","+17654562368"),789),
		new Student(5,"Raju",23,"male","computer science","Salem",89,Arrays.asList("+18764672370","+17654562341"),500),
		new Student(2,"Vani",23,"female","computer science","Plano",50,Arrays.asList("+18764672379","+17654562342"),800),
		new Student(4,"Aruna",26,"female","Electronics","Dallas",45,Arrays.asList("+18764672377","+17654562343"),654)
	    ).collect(Collectors.toList());
		
		//Student rank between 50 & 100
		
		List<Student> rankList = studentList.stream().filter(student-> student.getRank()>50 && student.getRank()<100)
		.collect(Collectors.toList());
		//System.out.println(rankList);

		//Student living in same city, results are sorted by student name in ascenidng order
		
		List<Student> sameCityList = studentList.stream().filter(student-> student.getCity()
				.equalsIgnoreCase("salem"))
				.sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder()))
				.collect(Collectors.toList());
		//System.out.println(sameCityList);
		
		//retrive dept names
		
		Set<String> deptNames = studentList.stream()
				 .map(Student::getDept)
				 //.distinct()
				.collect(Collectors.toSet());
		//System.out.println(deptNames);
		
		// Find all contacts for the students
		//  https://www.youtube.com/watch?v=Ul_7T2WJIuQ
		
		List<String> contactList = studentList.stream().flatMap(student->student.getContacts().stream())
				.collect(Collectors.toList());
		System.out.println(contactList);
		
		Optional<Student> student1 = studentList.stream().sorted(Comparator.comparing(Student::getMarks,Comparator.reverseOrder())).skip(1).findFirst();
	
		System.out.println(student1);
	
	}

}
