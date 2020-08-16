package com.feser.spring.data.r2dbc.demo.domain

import org.springframework.data.annotation.Id

data class Country(@Id val id: Long?, val name: String)