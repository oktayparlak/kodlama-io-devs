package oktayparlak.kodlama.io.devs.business.concretes;

import oktayparlak.kodlama.io.devs.business.abstracts.CourseService;
import oktayparlak.kodlama.io.devs.dataAccess.abstracts.CourseRepository;
import oktayparlak.kodlama.io.devs.entities.concretes.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseManager implements CourseService {

    private CourseRepository courseRepository;

    //@Autowired
    public CourseManager(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAll() {
        return courseRepository.getAll();
    }

    @Override
    public Course getById(int id) {
        return courseRepository.getById(id);
    }

    @Override
    public void add(Course course) {
        courseRepository.add(course);
    }

    @Override
    public void delete(Course course) {
        courseRepository.delete(course);
    }

    @Override
    public void update(Course course) {
        courseRepository.delete(course);
    }
}
