package com.f4.hellopuppyalram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.f4.hellopuppyalram.domain.example.entity.Alram;
import com.f4.hellopuppyalram.service.AlramService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/alram")
@AllArgsConstructor
public class AlramController {
	@Autowired
	private AlramService alramService;
	
	/*
	 * @GetMapping("/members/teams/{teamId}") public ResponseEntity<List<Alram>>
	 * getTeamMember(@PathVariable Long teamId) { return null; //return
	 * ResponseEntity.ok().body(alramService.findAllMemberByTeamId(teamId)); }
	 */

}
