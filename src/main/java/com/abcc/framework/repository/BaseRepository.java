package com.abcc.framework.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BaseRepository {

	@PersistenceContext
    public EntityManager entityManager;
}
