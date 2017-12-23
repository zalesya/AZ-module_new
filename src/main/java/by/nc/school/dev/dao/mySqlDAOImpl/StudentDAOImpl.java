package by.nc.school.dev.dao.mySqlDAOImpl;

import by.nc.school.dev.beans.Student;
import by.nc.school.dev.beans.Subject;
import by.nc.school.dev.dao.DAOInterfacesEntities.StudentDAO;
import by.nc.school.dev.dao.MySQLConnector;
import by.nc.school.dev.exceptions.UserException;

import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    private MySQLConnector mySQLConnector;

    private static final String SELECT_LAST_ID = "SELECT max(id) FROM students;";
    private static final String ALL_STUDENTS   = "SELECT * FROM students;";
    private static final String ADD_STUDENT    = "INSERT INTO students (username, password, role_id, surname, name, email," +
            " telephone_number) VALUES(?, ?, ?, ?, ?, ?, ?);";
    private static final String FIND_STUDENT_BY_ID = "SELECT students.id, students.surname, students.name, marks.subject, marks.mark, marks.date " +
            "FROM students JOIN marks ON students.id = marks.idMark WHERE students.id = ?;";
    //private static final String USER_BY_ID  = "SELECT * FROM users WHERE id = ?;";
   // private static final String UPDATE_USER = "UPDATE users SET username = ?, password = ?, role_id =?," +
      //      " surname = ?, name = ?, email = ?, telephone_number = ? WHERE id = ?;";
    //private static final String FIND_USER_BY_USERNAME = "SELECT * FROM users WHERE username = ?;";

    public StudentDAOImpl(MySQLConnector mySQLConnector) {
        this.mySQLConnector = mySQLConnector;
    }

    @Override
    public Student getStudentById(int id) throws UserException {
        mySQLConnector = new MySQLConnector();
        Student student = null;
        /*try (Connection connection = mySQLConnector.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_STUDENT_BY_ID)) {
            preparedStatement.setLong(1, id);
            System.out.println(id);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                student = new Student(resultSet.getLong("id"), resultSet.getString("surname"),
                        resultSet.getString("name"), resultSet.getString("subject"), resultSet.getLong("mark"), resultSet.getDate("date"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        return student;
    }

    public int addStudent() {
        mySQLConnector = new MySQLConnector();
       /* try (Connection connection = mySQLConnector.getConnection()) {
            try (Statement selectIdStatement = connection.createStatement();
                 PreparedStatement preparedStatementStudents = connection.prepareStatement(ADD_STUDENT);
                 PreparedStatement preparedStatementMarks = connection.prepareStatement(ADD_MARKS_DATE)) {
                connection.setAutoCommit(false);
                preparedStatementStudents.setString(1, student.getSurname());
                preparedStatementStudents.setString(2, student.getName());
                preparedStatementStudents.executeUpdate();
                System.out.print("Added students: " + preparedStatementStudents);
                long id = -1;
                ResultSet studentIdSet = selectIdStatement.executeQuery(SELECT_LAST_ID);

                if (studentIdSet.next()) {
                    id = studentIdSet.getLong("max(id)");
                }
                System.out.println("id = " + id);
                preparedStatementMarks.setString(1, student.getSubject());
                preparedStatementMarks.setLong(2, student.getMark());
                System.out.println(student.getDate().getTime());
                preparedStatementMarks.setDate(3, new java.sql.Date(student.getDate().getTime()));
                preparedStatementMarks.executeUpdate();
                System.out.print("; and marks: " + preparedStatementMarks + "\n");
                connection.commit();
                return id;
            } catch (SQLException e) {
                System.err.println(e.getMessage());
                connection.rollback();
            } finally {
                try {
                    connection.setAutoCommit(true);
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        return -1;
    }



    public boolean editStudent() {
        return false;
    }

    public boolean showStudentProfile() {
        return false;
    }

    public double getCoefficientScholarship() {
        return 0;
    }

    public List<Subject> getListLearningSubjects() {
        return null;
    }
}
