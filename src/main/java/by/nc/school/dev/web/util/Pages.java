package by.nc.school.dev.web.util;

public interface Pages {
    interface VIEWS {
        String PATH_ABSOLUTE = "/";
        interface LOGIN {
            String PATH = "/login";
            String PATH_ABSOLUTE = PATH;
            String VIEW = "login";
        }

        interface STUDENT {
            String PATH = "/student";
            String PATH_ABSOLUTE = PATH;
            String VIEW = "student";
        }

        interface PROFESSOR {
            String PATH = "/professor";
            String PATH_ABSOLUTE = PATH;
            String VIEW = "professor";
        }

        interface ACCOUNT {
            String PATH = "/account";
            String PATH_ABSOLUTE = USER.PATH_ABSOLUTE + PATH;
            String VIEW = "account";
        }

        public interface HOME {
            String PATH = "/home";
            String PATH_ABSOLUTE = USER.PATH_ABSOLUTE + PATH;
            String VIEW = "home";
        }

        public interface ABOUT {
            String PATH = "/about";
            String PATH_ABSOLUTE = USER.PATH_ABSOLUTE + PATH;
            String VIEW = "about";
        }
    }

    interface USER {
        String PATH_ABSOLUTE = "/user";

        interface LOGIN {
            String PATH = "/login";
            String PATH_ABSOLUTE = USER.PATH_ABSOLUTE + PATH;
        }

        interface LOGOUT {
            String PATH = "/logout";
            String PATH_ABSOLUTE = USER.PATH_ABSOLUTE + PATH;
            String VIEW = "logout";
        }

        interface REGISTER {
            String PATH = "/register";
            String PATH_ABSOLUTE = USER.PATH_ABSOLUTE + PATH;
        }

        interface ADD_USER {
            String PATH = "/addUser";
            String PATH_ABSOLUTE = USER.PATH_ABSOLUTE + PATH;
            String VIEW = "addUser";
        }

        interface EDIT_USER {
            String PATH = "/editUser";
            String PATH_ABSOLUTE = USER.PATH_ABSOLUTE + PATH;
            String VIEW = "editUser";
        }

        interface ALL_USERS {
            String PATH = "/getAllUsers";
            String PATH_ABSOLUTE = USER.PATH_ABSOLUTE + PATH;
            String VIEW = "allUsers";
        }
    }

    interface STUDENT {
        String PATH_ABSOLUTE = "/student";
        interface ADD_STUDENT {
            String PATH = "/addStudent";
            String PATH_ABSOLUTE = STUDENT.PATH_ABSOLUTE + PATH;
        }
        interface EDIT_STUDENT {
            String PATH = "/editStudent";
            String PATH_ABSOLUTE = STUDENT.PATH_ABSOLUTE + PATH;
        }
        interface ALL_STUDENTS {
            String PATH = "/allStudents";
            String PATH_ABSOLUTE = STUDENT.PATH_ABSOLUTE + PATH;
        }

        public interface DELETE_STUDENT {
            String PATH = "/deleteStudent";
            String PATH_ABSOLUTE = STUDENT.PATH_ABSOLUTE + PATH;
        }
    }

    interface PROFESSOR {
        String PATH_ABSOLUTE = "/professor";
        interface ADD_PROFESSOR {
            String PATH = "/addProfessor";
            String PATH_ABSOLUTE = Pages.PROFESSOR.PATH_ABSOLUTE + PATH;
        }
        interface EDIT_PROFESSOR {
            String PATH = "/editProfessor";
            String PATH_ABSOLUTE = Pages.PROFESSOR.PATH_ABSOLUTE + PATH;
        }

        public interface ALL_PROFESSORS {
            String PATH = "/allProfessors";
            String PATH_ABSOLUTE = PROFESSOR.PATH_ABSOLUTE + PATH;
        }

        public interface DELETE_PROFESSOR {
            String PATH = "/deleteProfessor";
            String PATH_ABSOLUTE = PROFESSOR.PATH_ABSOLUTE + PATH;
        }
    }

    public interface SUBJECT {
        String PATH_ABSOLUTE = "/subject";
        interface ADD_SUBJECT {
            String PATH = "/addSubject";
            String PATH_ABSOLUTE = Pages.SUBJECT.PATH_ABSOLUTE + PATH;
        }
        interface EDIT_SUBJECT {
            String PATH = "/editSubject";
            String PATH_ABSOLUTE = Pages.SUBJECT.PATH_ABSOLUTE + PATH;
        }

        interface ALL_SUBJECTS {
            String PATH = "/allSubjects";
            String PATH_ABSOLUTE = SUBJECT.PATH_ABSOLUTE + PATH;
        }

        public interface ALL_SUBJECTS_STUDY {
            String PATH = "/allSubjectsStudy";
            String PATH_ABSOLUTE = SUBJECT.PATH_ABSOLUTE + PATH;
        }
    }
}
