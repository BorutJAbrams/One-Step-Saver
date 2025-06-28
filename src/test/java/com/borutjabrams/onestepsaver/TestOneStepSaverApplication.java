package com.borutjabrams.onestepsaver;

import org.springframework.boot.SpringApplication;

public class TestOneStepSaverApplication {

	public static void main(String[] args) {
		SpringApplication.from(OneStepSaverApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
