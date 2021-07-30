package com.f4.hellopuppyalram.domain.example.repository.impl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.f4.hellopuppyalram.domain.example.entity.Alram;


@Repository
public interface AlramRepository extends JpaRepository<Alram, Long>{
	
	//List<Alram> findAllMemberByTeamId(Long id);

}
