package br.com.erudio.configuration

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.GatewayFilterSpec
import org.springframework.cloud.gateway.route.builder.PredicateSpec
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApiGatewayConfiguration {

    @Bean
    fun gatewayRouter(builder: RouteLocatorBuilder): RouteLocator {
        return builder.routes()
            .route {p: PredicateSpec ->
                p.path("/get")
                    .filters{f: GatewayFilterSpec ->
                        f.addRequestHeader("Hello", "Word")
                        f.addRequestParameter("Hello", "Word")
                    }
                    .uri("http://httpbin.org:80")
            }
            .build()
    }
}