package com.feser.spring.data.r2dbc.demo.repository

import com.feser.spring.data.r2dbc.demo.domain.Country
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface CountryRepository: ReactiveCrudRepository<Country, Long>
