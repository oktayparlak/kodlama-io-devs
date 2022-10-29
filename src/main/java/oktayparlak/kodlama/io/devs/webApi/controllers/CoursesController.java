package oktayparlak.kodlama.io.devs.webApi.controllers;

import oktayparlak.kodlama.io.devs.business.abstracts.CourseService;
import oktayparlak.kodlama.io.devs.entities.concretes.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CoursesController {

    private CourseService courseService;

    @Autowired
    public CoursesController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/getall")
    public List<Course> getAll() {
        return courseService.getAll();
    }

    @GetMapping("/get/id")
    public Course getById(int id) {
        return courseService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Course course) {
        courseService.add(course);
    }

    @DeleteMapping("/delete/course")
    public void delete(Course course) {
        courseService.delete(course);
    }
    @GetMapping("/update/course")
    public void update(Course course) {
        courseService.update(course);
    }

}
