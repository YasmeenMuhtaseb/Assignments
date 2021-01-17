package com.dojooverflow.dojooverflow.repositories;

import com.dojooverflow.dojooverflow.models.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuestionRepository extends CrudRepository<Question,Long> {
    List<Question> findAll();

}
