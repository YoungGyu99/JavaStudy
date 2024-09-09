package ref;

public class Method2 {

	public static void main(String[] args) {
		/*createStudent()라는 메서드를 만들고 객첼르 생성한느 부분도 이 메서드안에 함께 포함했다. 이제 이 메서드 하나로 객체의 생성과 초기값 설정을 모두 처리한다.
		 * 그런데 메서드 안에서 객체를 생성했기 때문에 만들어진 객체를 메서드 밖에서 사용할수 있게 돌려주어야 한다. 그래야 메서드 밖에서 이 객체를 사용할 수 있다.
		 * 메서드는 호출 결과를 반환(return)을 할 수 있다. 메서드의 반환 기능을 사용해서 만들어진 참조 값을 메서드 밖으로 반환하면 된다.
		 * */
				Student student1 = createStudent("학생1", 15, 90);
				System.out.println("student=" + student1);
				Student student2 = createStudent("학생2", 16, 80);
				System.out.println("student=" + student2);

				/* createStudent()는 생성한 Student 인스턴스의 참조값을 반환한다. 이렇게 반환된 참조값을 student1 변수에 저장했다.
				 * 앞으로 student1 을통해 Student인스턴스를 사용할 수 있다.
				 * */
				
				printStudent(student1);
				printStudent(student2);
			}
			static Student createStudent(String name, int age, int grade) {
				Student student = new Student(); //x001
				System.out.println("student=" + student);
				student.name = name;
				student.age = age;
				student.grade = grade;
				return student; //x001
				
			}
		
			static void printStudent(Student student) {
				System.out.println("이름:" + student.name + "나이: " + student.age + "성적: " + student.grade);

			}
	}

