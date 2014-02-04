/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.course;

import java.util.List;
import zw.ac.solusiuniversity.model.Course;

/**
 *
 * @author Luckbliss
 */
public interface CourseCRUDService {
    public Course findById(String id);

    public List<Course> findAll();

    public void persist(Course course);

    public void merge(Course course);

    public void delete(Course course);
}
