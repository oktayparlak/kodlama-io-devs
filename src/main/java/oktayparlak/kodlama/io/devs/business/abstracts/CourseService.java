package oktayparlak.kodlama.io.devs.business.abstracts;

import oktayparlak.kodlama.io.devs.entities.concretes.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAll();
    Course getById(int id);

    void add(Course course);
    void delete(Course course);
    void update(Course course);

}
