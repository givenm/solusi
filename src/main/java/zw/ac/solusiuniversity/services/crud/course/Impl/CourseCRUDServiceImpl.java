/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.course.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.Course;
import zw.ac.solusiuniversity.repository.CourseRepository;
import zw.ac.solusiuniversity.services.crud.course.CourseCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class CourseCRUDServiceImpl implements CourseCRUDService{
    
    @Autowired
    private CourseRepository repository;
    
    @Override
    public List<Course> findAll(){
        return repository.findAll();
    }

    @Override
    public void persist(Course course) {
        repository.save(course);
    }

    @Override
    public void merge(Course course) {
        if (course.getId() != null) {
            repository.save(course);
        }
    }

    @Override
    public Course findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(Course course) {
        repository.delete(course);
    }
}