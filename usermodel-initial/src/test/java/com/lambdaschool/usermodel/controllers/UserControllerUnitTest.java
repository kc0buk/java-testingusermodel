package com.lambdaschool.usermodel.controllers;

import com.lambdaschool.usermodel.models.Role;
import com.lambdaschool.usermodel.models.User;
import com.lambdaschool.usermodel.models.UserRoles;
import com.lambdaschool.usermodel.models.Useremail;
import com.lambdaschool.usermodel.services.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserControllerUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    private List<User> userList;

    @Before
    public void setUp() throws Exception {
        userList = new ArrayList<>();

        Role r1 = new Role("admin");
        Role r2 = new Role("user");
        Role r3 = new Role("data");

        r1.setRoleid(1);
        r2.setRoleid(2);
        r3.setRoleid(3);

        // admin, data, user
        User u1 = new User("adminTEST",
                "password",
                "adminTEST@lambdaschool.local");
        u1.setUserid(10);

        u1.getRoles()
                .add(new UserRoles(u1, r1));
        u1.getRoles()
                .add(new UserRoles(u1, r2));
        u1.getRoles()
                .add(new UserRoles(u1, r3));

        u1.getUseremails()
                .add(new Useremail(u1,
                        "adminTEST@email.local"));
        u1.getUseremails().get(0).setUseremailid(11);

        u1.getUseremails()
                .add(new Useremail(u1,
                        "adminTEST@mymail.local"));
        u1.getUseremails().get(1).setUseremailid(12);

        userList.add(u1);

        // data, user
        User u2 = new User("cinnamonTEST",
                "1234567",
                "cinnamonTEST@lambdaschool.local");
        u2.setUserid(20);

        u2.getRoles()
                .add(new UserRoles(u2, r2));
        u2.getRoles()
                .add(new UserRoles(u2, r3));

        u2.getUseremails()
                .add(new Useremail(u2,
                        "cinnamonTEST@mymail.local"));
        u2.getUseremails().get(0).setUseremailid(21);

        u2.getUseremails()
                .add(new Useremail(u2,
                        "hopsTEST@mymail.local"));
        u2.getUseremails().get(1).setUseremailid(22);

        u2.getUseremails()
                .add(new Useremail(u2,
                        "bunnyTEST@email.local"));
        u2.getUseremails().get(2).setUseremailid(23);

        userList.add(u2);

        // user
        User u3 = new User("barnbarnTEST",
                "ILuvM4th!",
                "barnbarnTEST@lambdaschool.local");
        u3.setUserid(30);

        u3.getRoles()
                .add(new UserRoles(u3, r2));

        u3.getUseremails()
                .add(new Useremail(u3,
                        "barnbarnTEST@email.local"));
        u3.getUseremails().get(0).setUseremailid(31);

        userList.add(u3);

        User u4 = new User("puttatTEST",
                "password",
                "puttatTEST@school.lambda");
        u4.setUserid(40);

        u4.getRoles()
                .add(new UserRoles(u4, r2));

        userList.add(u4);

        User u5 = new User("misskittyTEST",
                "password",
                "misskittyTEST@school.lambda");
        u5.setUserid(50);

        u5.getRoles()
                .add(new UserRoles(u5, r2));

        userList.add(u5);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void listAllUsers() {
    }

    @Test
    public void getUserById() {
    }

    @Test
    public void getUserByName() {
    }

    @Test
    public void getUserLikeName() {
    }

    @Test
    public void addNewUser() {
    }

    @Test
    public void updateFullUser() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUserById() {
    }
}