package com.zhu.springbootle.repository;



import com.zhu.springbootle.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
