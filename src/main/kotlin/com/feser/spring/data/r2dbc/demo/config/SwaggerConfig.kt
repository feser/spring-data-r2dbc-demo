package com.feser.spring.data.r2dbc.demo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfig {

    @Bean
    fun api(): Docket = Docket(DocumentationType.SWAGGER_2)
            .useDefaultResponseMessages(false)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.feser.spring.data.r2dbc.demo"))
            .build()
            .apiInfo(apiInfo())

    private fun apiInfo() = ApiInfoBuilder()
            .title("Spring Data R2DBC Demo")
            .description("This is swagger documentation for Spring Data R2DBC Demo")
            .build()

}
