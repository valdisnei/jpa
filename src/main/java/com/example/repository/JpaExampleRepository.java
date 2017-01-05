package com.example.repository;

import com.example.model.AcessoCaptadorOnline;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Valdisnei on 05/01/2017.
 */
public interface JpaExampleRepository extends CrudRepository<AcessoCaptadorOnline,Long> {
}
