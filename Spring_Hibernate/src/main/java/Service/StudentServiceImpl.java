package Service;

import Bean.Student;
import Dao.StudentDao;

public class StudentServiceImpl implements StudentService {

	private StudentDao dao;

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	public void persistStudent(Student student) {
		
		dao.persistStudent(student);
		
	}

	@Override
	public Student findStudent(int eid) {
		Student student=dao.findStudent(eid);
		
		return student;
	}

	@Override
	public void updateStudent(Student student) {
	
		dao.updateStudent(student);
	}

	@Override
	public void deleteStudent(Student student) {
	     dao.deleteStudent(student);
		
	}
	
	
	

	
	
	
	
}
