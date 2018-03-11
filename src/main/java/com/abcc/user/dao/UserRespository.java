package com.abcc.user.dao;

import com.abcc.framework.repository.BaseRepository;
import com.abcc.user.model.User;

public interface UserRespository extends BaseRepository {

	User getUser(String string, String userId);

}
