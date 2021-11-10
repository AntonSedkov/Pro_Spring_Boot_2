package by.anthony.todomongo.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;

@Configuration
public class MongoEmbConfig {
    private Environment environment;

    public MongoEmbConfig(Environment environment) {
        this.environment = environment;
    }

    @Bean
    @DependsOn("embeddedMongoServer")
    public MongoClient mongoClient() {
        int port = this.environment.getProperty("local.mongo.port", Integer.class);
        return MongoClients.create("mongodb://localhost:" + port);
    }

}