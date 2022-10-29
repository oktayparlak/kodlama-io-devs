package oktayparlak.kodlama.io.devs.dataAccess.abstracts;

import oktayparlak.kodlama.io.devs.entities.concretes.Course;

import java.util.List;

public interface CourseRepository {

    List<Course> getAll();
    Course getById(int id);

    void add(Course course);
    void delete(Course course);
    void update(Course course);

}
