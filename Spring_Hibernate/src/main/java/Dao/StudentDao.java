package Dao;



import Bean.Student;

public interface StudentDao {

	public void persistStudent(Student student);
	public Student findStudent(int eid);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);

	
}
