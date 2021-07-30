package com.f4.hellopuppyalram.domain.example.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.f4.hellopuppyalram.domain.example.enums.AlramType;
import com.f4.hellopuppyalram.domain.example.vo.MemberInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="alram")
public class Alram {
	@Id
	@Column(name = "seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seq;
	
	@Column(name = "alram_type")
	@Enumerated(EnumType.STRING)
	private AlramType alramType;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "to")
	@Embedded
	private MemberInfo to;
	
	@Column(name = "create_dt")
	private Date createDt;
	
}
