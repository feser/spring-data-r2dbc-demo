package com.feser.spring.data.r2dbc.demo.config

import io.r2dbc.spi.ConnectionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.DefaultResourceLoader
import org.springframework.core.io.Resource
import org.springframework.core.io.ResourceLoader
import org.springframework.data.r2dbc.connectionfactory.init.ResourceDatabasePopulator

// See https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#howto-initialize-a-database-using-r2dbc
@Configuration(proxyBeanMethods = false)
class DatabaseInitializationConfiguration {

    @Autowired
    fun initializeDatabase(@Qualifier("connectionFactory") connectionFactory: ConnectionFactory) {
        val resourceLoader: ResourceLoader = DefaultResourceLoader()
        val scripts: Array<Resource> = arrayOf(resourceLoader.getResource("classpath:schema.sql"),
                resourceLoader.getResource("classpath:data.sql"))
        ResourceDatabasePopulator(*scripts).execute(connectionFactory).block()
    }
}