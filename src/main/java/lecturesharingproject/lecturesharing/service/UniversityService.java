package lecturesharingproject.lecturesharing.service;

import lecturesharingproject.lecturesharing.dao.UniversityDao;
import lecturesharingproject.lecturesharing.entity.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService implements IUniversityService {

    @Autowired
    public UniversityDao universityDao;

    @Override
    public University insertUniversity(University university) {
        return universityDao.save(university);
    }

    @Override
    public List<University> getAllUniversity() {
        return universityDao.findAll();
    }

    @Override
    public University getUniversity(int id) {
        return universityDao.getOne(id);
    }

    @Override
    public void removeUniversity(int id) {
        universityDao.deleteById(id);
    }
}
