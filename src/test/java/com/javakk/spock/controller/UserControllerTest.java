package com.javakk.spock.controller;

import com.javakk.spock.model.APIException;
import com.javakk.spock.model.UserVO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Created by sunmeng9
 * @Date 2022/2/28 2:19 PM
 * @Description TODO
 */
@SpringBootTest
public class UserControllerTest {

// @Autowired
// public UserController userController;
//
// @Test
// public void testException() {
//  UserVO user = new UserVO();
//  user.setAge(1);
//  System.out.println(userController);
//  try {
//   userController.validateUser(user);
//  } catch (APIException e) {
//   Assert.assertTrue(e.getErrorCode().equals("10001"));
//   Assert.assertTrue(e.getErrorMessage().equals("user is null"));
//  }
//
////  user = new UserVO();
////  try {
////   userController.validateUser(user);
////  } catch (APIException e) {
////   assertThat(e.getErrorCode(), "10002");
////   assertThat(e.getErrorMessage(), "user name is null");
////  }
// }
}
