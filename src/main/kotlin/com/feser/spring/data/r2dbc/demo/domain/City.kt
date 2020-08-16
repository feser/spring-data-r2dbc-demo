package com.feser.spring.data.r2dbc.demo.domain

import org.springframework.data.annotation.Id

data class City(@Id val id: Long?, val name: String, val country: String?)