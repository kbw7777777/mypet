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
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = {"com.example.demo"})
@EnableJpaRepositories(basePackages = {"com.example.demo"})
public class MyPetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPetApplication.class, args);
	}

	//TODO 게시글 등록하는 api 
	//TODO 스웨거 붙여보기
	//
	// @Bean
	// public CommandLineRunner runner(BoardRepository boardRepository) {
	// 	return (args) -> {
			

	// 		IntStream.rangeClosed(1, 200).forEach(index ->
	// 			boardRepository.save(Board.builder()
	// 					.title("게시글"+index)
	// 					.subTitle("순서"+index)
	// 					.content("컨텐츠")
	// 					.boardType(BoardType.free)
	// 					.createdDate(LocalDateTime.now())
	// 					.updatedDate(LocalDateTime.now())
	// 					.build())
	// 		);
	// 	};
	// }

}
