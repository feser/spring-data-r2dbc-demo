package com.feser.spring.data.r2dbc.demo.controller

import com.feser.spring.data.r2dbc.demo.domain.Country
import com.feser.spring.data.r2dbc.demo.repository.CountryRepository
import kotlinx.coroutines.reactive.awaitFirst
import kotlinx.coroutines.runBlocking
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@RestController
@RequestMapping("/country")
class CountryController(private val countryRepository: CountryRepository) {

    @GetMapping("/all")
    fun all(): Flux<Country> {
        return countryRepository.findAll()
    }

    @PostMapping("")
    fun create(@RequestBody country: Country): Mono<Country> {
        return countryRepository.save(country)
    }

    @PostMapping("/test/transactional")
    @Transactional
    fun testTransactional(@RequestBody country: Country): Country = runBlocking {
        countryRepository.save(country).awaitFirst()
        throw RuntimeException("throw after save")
    }

    @PostMapping("/test/without-transactional")
    fun testWithoutTransactional(@RequestBody country: Country): Country = runBlocking {
        countryRepository.save(country).awaitFirst()
        throw RuntimeException("throw after save")
    }
}