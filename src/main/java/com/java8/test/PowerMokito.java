package com.java8.test;
//package com.winterbe.java8.samples.test;
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.powermock.api.mockito.PowerMockito;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;
//
//public class PowerMokito {
//
//    @RunWith(PowerMockRunner.class)
//    @PrepareForTest(UserController.class)
//    public class UserControllerTest {
//
//        private DefaultUserService mockUserService;
//        private UserController userController;
//
//        @Test
//        public void testGetUserCount() {
//            mockUserService = PowerMockito.mock(DefaultUserService.class);
//            PowerMockito.when(mockUserService.getUserCount()).thenReturn(100L);
//            userController = new UserController(mockUserService);
//            assertEquals(100L, userController.getUserCount().longValue());
//        }
//
//        @Test
//        public void testMockStatic() throws Exception {
//            PowerMock.mockStaticPartial(UUID.class, "randomUUID");
//            EasyMock.expect(UUID.randomUUID()).andReturn(UUID.fromString("067e6162-3b6f-4ae2-a171-2470b63dff00"));
//            PowerMock.replayAll();
//            UserController userController = new UserController();
//            Assert.assertTrue(userController.createUserId(getNewUser()).contains("067e6162-3b6f-4ae2-a171-2470b63dff00"));
//            PowerMock.verifyAll();
//        }
//
//    /////////////////////////////////////////////////////
//    public class User {
//
//        private String firstName;
//        private String surname;
//
//        public String getFirstName() {
//            return firstName;
//        }
//        public void setFirstName(String firstName) {
//            this.firstName = firstName;
//        }
//        public String getSurname() {
//            return surname;
//        }
//        public void setSurname(String surname) {
//            this.surname = surname;
//        }
//    }
//
//    public class DefaultUserService implements UserService {
//
//        @Override
//        public User getUserById(Long userId) {
//            return null;
//        }
//
//        @Override
//        public void updateUserDetails(User newUserDetails) {
//        }
//
//        @Override
//        public void createUser(User user) {
//        }
//
//        @Override
//        public Long getUserCount() {
//            throw new UnsupportedOperationException("Not implemented");
//        }
//    }
//
//    public class UserController {
//
//        private UserService userService;
//
//        public UserController(UserService userService) {
//            this.userService = userService;
//        }
//
//        public Long getUserCount() {
//            return userService.getUserCount();
//        }
//
//        public String createUserId(User user) {
//            return String.format("%s_%s", user.getSurname(), UUID.randomUUID().toString());
//        }
//    }
//
//
//}
