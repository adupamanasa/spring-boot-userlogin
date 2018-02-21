package com.nrg.rest.service;

import com.nrg.rest.model.MessageResponse;
import com.nrg.rest.model.User;

public interface UserLoginService {

	public MessageResponse validateUser(User user);
}
