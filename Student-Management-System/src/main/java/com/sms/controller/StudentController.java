package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.Student;
import com.sms.repo.StudentRepository;

@RestController
@CrossOrigin
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/students")
	public List<Student> getStudentsList(){
		return (List<Student>) studentRepository.findAll();
	}
	@PostMapping("/students")
	public List<Student> saveStudentsList(@RequestBody Student student){
		studentRepository.save(student);
		return (List<Student>) studentRepository.findAll();
	}
	@PutMapping("/students")
	public List<Student> updateStudentsList(@RequestBody Student student){
		studentRepository.save(student);
		return (List<Student>) studentRepository.findAll();
	}
	@DeleteMapping("/students/{rollNo}")
	public List<Student> deleteStudentsList(@PathVariable("rollNo") long rollNo){
		studentRepository.deleteById(rollNo);
		return (List<Student>) studentRepository.findAll();
	}

}
