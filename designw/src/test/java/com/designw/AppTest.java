package com.designw;


import com.designw.model.*;
import com.designw.pare.dao.ImanagerDao;
import com.designw.pare.dao.IuserDao;
import com.designw.pare.service.Ipareservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/applicationContext.xml"})
public class AppTest 
{
    @Autowired
    private Ipareservice ipareservice;
    @Resource
    private IuserDao iuserDao;
    @Autowired
    private ImanagerDao imanagerDao;
    @Autowired
    @Test
    public void shouldAnswerWithTrue()
    {  /* List<Users> list=ipareservice.mSelectUsers();*/
        /*Users s=new Users();
        s.setUserId(1);*/
/*
        Student students=new Student();
        students.setStudentId(141404050);
        System.out.println(imanagerDao.getStudentNews(students));
        Users userss=new Users();
        userss.setUserId(1);
        Users users=iuserDao.getUsers(userss);
        System.out.println(users);
        List<GraduationNew> li=imanagerDao.selectGraduation();
        for (int i=0;i<li.size();i++){
            System.out.println(li.get(i).getGraduationScoreList());
        }*/
     ipareservice.deleteUserN(654123,1);


    }

}
