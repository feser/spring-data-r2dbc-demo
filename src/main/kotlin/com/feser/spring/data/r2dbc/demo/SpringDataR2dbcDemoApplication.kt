package com.feser.spring.data.r2dbc.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@SpringBootApplication
@EnableR2dbcRepositories
class SpringDataR2dbcDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringDataR2dbcDemoApplication>(*args)
}

