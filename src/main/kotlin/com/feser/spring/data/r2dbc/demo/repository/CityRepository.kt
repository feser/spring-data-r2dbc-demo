package com.feser.spring.data.r2dbc.demo.repository

import com.feser.spring.data.r2dbc.demo.domain.City
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Flux

interface CityRepository: ReactiveCrudRepository<City, Long> {

    @Query("select city.id, city.name, country.name as country from city join country on city.country_id = country.id")
    override fun findAll(): Flux<City>
}

