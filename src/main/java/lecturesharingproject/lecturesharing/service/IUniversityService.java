package lecturesharingproject.lecturesharing.service;
import lecturesharingproject.lecturesharing.entity.University;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IUniversityService {

    University insertUniversity(University university);

    List<University> getAllUniversity();

    Optional<University> getUniversity(int id);

    void removeUniversity(int id);



}
