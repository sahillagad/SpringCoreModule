package Service;

import Bean.Student;
import Dao.StudentDao;

public interface StudentService {

	public void persistStudent(Student student);
	public Student findStudent(int eid);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);

}
