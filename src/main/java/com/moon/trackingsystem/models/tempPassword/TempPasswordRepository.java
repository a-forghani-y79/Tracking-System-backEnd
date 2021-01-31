package com.moon.trackingsystem.models.tempPassword;

import com.moon.trackingsystem.models.team.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempPasswordRepository extends JpaRepository<TempPassword, Integer> {


}
