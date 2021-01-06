package library.security.configuration.databaseconfig;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
//@PropertySource({"classpath:application.properties"})
//@EnableJpaRepositories(
//        basePackages = "library.jpa.entity.reserve",
//        entityManagerFactoryRef = "userEntityManagerReserve",
//        transactionManagerRef = "userTransactionManagerReserve")
public class ReserveDatabaseConfig {

    @Bean(name = "userDataSourceReserve")
    @ConfigurationProperties(prefix="spring.datareserve")
    public DataSourceProperties userDataSource() {
        return new DataSourceProperties();
    }
}
