package com.example.Mapping.Service;

import com.example.Mapping.Model.Student;
import com.example.Mapping.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    public void deleteStudent(String id) {
        studentRepo.deleteById(id);
    }

    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();

    }

    public Student getStudentById(String id) {
        return studentRepo.findById(id).orElse(null);
    }
}
