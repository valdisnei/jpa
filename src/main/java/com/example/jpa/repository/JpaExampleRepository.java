package com.example.jpa.repository;

import com.example.jpa.model.AcessoCaptadorOnline;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Valdisnei on 05/01/2017.
 */
@Repository
public interface JpaExampleRepository extends CrudRepository<AcessoCaptadorOnline,Long> {
}
