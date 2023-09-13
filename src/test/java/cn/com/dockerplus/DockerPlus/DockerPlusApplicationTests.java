package cn.com.dockerplus.DockerPlus;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.InspectImageResponse;
import com.github.dockerjava.api.command.ListImagesCmd;
import com.github.dockerjava.core.DockerClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DockerPlusApplicationTests {

	@Test
	void contextLoads() {
		String url = "tcp://127.0.0.1:2375";
		DockerClient client = DockerClientBuilder.getInstance(url).build();
		if (client != null) {
			ListImagesCmd listImagesCmd = client.listImagesCmd();
			System.out.println("listImagesCmd.getImageNameFilter() = " + listImagesCmd.getImageNameFilter());
		}
	}

}
