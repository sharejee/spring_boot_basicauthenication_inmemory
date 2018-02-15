package com.demospringsecurity2.demospringsecurity2.domain.services;

import com.demospringsecurity2.demospringsecurity2.domain.models.SecUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 1/2/2018
*/
public interface UserService {
	SecUser findUserByEmail(String email);

	void saveUser(SecUser secUser);

	List<SecUser> findAllUsers();

	SecUser getUserById(Long id);

	void deleteUser(Long id);

	void updateUser(SecUser secUser, Long id);

	SecUser findByEmailAndPassword(String email, String password);

}
