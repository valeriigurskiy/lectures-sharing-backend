package lecturesharingproject.lecturesharing.validator;

import lecturesharingproject.lecturesharing.entity.Role;
import lecturesharingproject.lecturesharing.entity.University;
import lecturesharingproject.lecturesharing.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Service
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        User user = (User) obj;
        if (user.getLogin().charAt(0) < 65 || user.getLogin().charAt(0) > 90 || user.getLogin().charAt(0) < 97 || user.getLogin().charAt(0) > 122 || user.getLogin().charAt(0) < 48 || user.getLogin().charAt(0) > 57) {
            errors.rejectValue("login", "user.login.incorrect-login", "Your login must include only letters and numbers");
        }
        if (user.getName().charAt(0) < 65 || user.getName().charAt(0) > 90 || user.getName().charAt(0) < 97 || user.getName().charAt(0) > 122) {
            errors.rejectValue("name", "user.name.incorrect-name", "Your name must include only letter");
        }
        if (user.getLastname().charAt(0) < 65 || user.getLastname().charAt(0) > 90 || user.getLastname().charAt(0) < 97 || user.getLastname().charAt(0) > 122) {
            errors.rejectValue("name", "user.name.incorrect-name", "Your lastname must include only letter");
        }
        if (!user.getRole().equals(Role.ADMIN)  || !user.getRole().equals(Role.USER) ) {
            errors.rejectValue("role", "user.role.unknown-role", "Your role must be admin or user");
        }
        if (user.getPassword().charAt(0) < 65 || user.getPassword().charAt(0) > 90 || user.getPassword().charAt(0) < 97 || user.getPassword().charAt(0) > 122 || user.getPassword().charAt(0) < 48 || user.getPassword().charAt(0) > 57) {
            errors.rejectValue("password", "user.password.invalid-password", "Your password must include only letters and numbers");
        }
        if (user.getAge() < 48 || user.getAge() > 57) {
            errors.rejectValue("age", "user.age.invalid-age", "Your age must be number");
        }
//        if(!user.getUniversity().equals(University.NAU) || !user.getUniversity().equals(University.KPI) || !user.getUniversity().equals(University.KNU) || !user.getUniversity().equals(University.NMU)){
//            errors.rejectValue("university", "user.university.unknown-university", "You have only 4 universities for choosing.");
//        }


    }
}
