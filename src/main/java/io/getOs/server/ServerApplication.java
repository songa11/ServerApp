package io.getOs.server;

import io.getOs.server.enumeration.Status;
import io.getOs.server.model.Server;
import io.getOs.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
    @Bean
	CommandLineRunner run(ServerRepo serverRepo) {
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16 GB", "Personal PC", "http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.10", "Fedora Linux", "16 GB", "Dell Server", "http://localhost:8080/server/image/server2.png", Status.SERVER_DOWN));
			serverRepo.save(new Server(null, "192.168.1.16", "MS 2008", "32 GB", "Web Server", "http://localhost:8080/server/image/server3.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.60", "Redhat Enterprise Linux", "64 GB", "Mail Server", "http://localhost:8080/server/image/server4.png", Status.SERVER_DOWN));


		};


	}

}
