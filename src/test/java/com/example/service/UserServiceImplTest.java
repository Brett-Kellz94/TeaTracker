package com.example.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.TeaTracker.pojos.User;
import com.TeaTracker.repo.UserRepo;
import com.TeaTracker.service.UserService;

import org.junit.jupiter.api.Test;



@SpringBootTest 
class UserServiceImplTest {
	
	@Autowired 
	private UserService service;
	
	@InjectMocks
	private UserRepo repo;
	
	private User user;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	
	@BeforeEach
	void setUp() throws Exception {
		this.user = new User(0, "branden", "addicott", "badd", "pa$$w0rd", 0);
		}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void readUser() {
		fail("Not yet implemented");
	}

}
