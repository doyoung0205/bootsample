package org.zerock.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tbl_boards")
public class Board {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)  // 식별키의 생성  auto : 특정 데이터베이스에 맞게 자동으로 생성되는 방식
	private Long bno;
	private String title;
	private String writer;
	private String content;
	private String content2;
	
	//게시판 작성시간
	@CreationTimestamp
	private Timestamp regdate;  //LocalDateTime
	
	
	//최종 수정 시간
	@UpdateTimestamp
	private Timestamp updatedat; //LocalDateTime 

}
