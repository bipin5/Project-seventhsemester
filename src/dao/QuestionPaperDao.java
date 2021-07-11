package dao;

import java.util.List;
import model.Question;
import model.Teacher;
import model.User;

public interface QuestionPaperDao {
    
    //Questions
    boolean AddQuestion(Question a);
    boolean DeleteQuestion(int id);
    Question getbyid(int id);
    //boolean updatequestion( int id);
    //AddQuestion getbyId(int id);
    List<Question> getallQuestion();
   
}