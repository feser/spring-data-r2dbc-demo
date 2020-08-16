package com.feser.spring.data.r2dbc.demo.controller

import com.feser.spring.data.r2dbc.demo.domain.City
import com.feser.spring.data.r2dbc.demo.repository.CityRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/city")
class CityController(private val cityRepository: CityRepository) {

    @GetMapping("/all")
    fun all(): Flux<City> {
        return cityRepository.findAll()
    }
}
