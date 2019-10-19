package com.example.demo;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

import com.example.demo.Board.Board;
import com.example.demo.Board.BoardRepository;
import com.example.demo.enums.BoardType;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaAuditing 
@SpringBootApplication
@EntityScan(basePackages = {"com.example.demo"})
@EnableJpaRepositories(basePackages = {"com.example.demo"})
public class MyPetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPetApplication.class, args);
	}


	//TODO 스웨거 http://localhost:8080/swagger-ui.html#/
	//TODO 엔티티 테이블에 index 거는법 키 다양하게 거는법 찾기
	//TODO 게시판에 좋아요 기능 구현
	//TODO 댓글 기능 구현, 댓글 좋아요 기능 구현
	//TODO 대댓글 기능 구현 (대댓글까지만!)

	// @Bean
	// public CommandLineRunner runner(BoardRepository boardRepository) {
	// 	return (args) -> {
			

	// 		IntStream.rangeClosed(1, 120).forEach(index ->
	// 			boardRepository.save(Board.builder()
	// 					.title("게시글"+index)
	// 					.subTitle("순서"+index)
	// 					.content("컨텐츠")
	// 					.boardType(BoardType.free)
	// 					.build())
	// 		);
	// 	};
	// }

}
