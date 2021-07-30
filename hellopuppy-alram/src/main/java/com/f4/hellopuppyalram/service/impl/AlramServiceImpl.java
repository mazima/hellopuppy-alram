package com.f4.hellopuppyalram.service.impl;

import org.springframework.stereotype.Service;

import com.f4.hellopuppyalram.domain.example.repository.impl.AlramRepository;
import com.f4.hellopuppyalram.service.AlramService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AlramServiceImpl implements AlramService {

	private final AlramRepository alramRepository;
	
	/*
	 * @Override public List<Member> findAllMemberByTeamId(Long id) { // TODO
	 * Auto-generated method stub return alramRepository.findAllMemberByTeamId(id);
	 * }
	 */
	

}
