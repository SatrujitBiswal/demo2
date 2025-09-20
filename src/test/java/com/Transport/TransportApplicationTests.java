package com.Transport;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Transport.entity.Bus;
import com.Transport.entity.Profile;
import com.Transport.entity.Stop;
import com.Transport.entity.User;
import com.Transport.repository.BusRepository;
import com.Transport.repository.StopRepository;
import com.Transport.repository.UserRepository;
import com.Transport.repository.profileRepository;

@SpringBootTest
class TransportApplicationTests {
	@Autowired
private	BusRepository busRepository;
	@Autowired
private	StopRepository stopRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private profileRepository pRepository;

	@Test
	void saveBusAndStop() {
		
		Stop s1 = new Stop();
        s1.setName("Majestic");

        Stop s2 = new Stop();
        s2.setName("BTM Layout");

        Stop s3 = new Stop();
        s3.setName("Electronic City");
	
        stopRepository.saveAll(Arrays.asList(s1,s2,s3));
        
        Bus b1 = new Bus();
        b1.setName("panda");
        b1.setStops(Arrays.asList(s2,s3));
        
        Bus b2 = new Bus();
        b2.setName("rout");
        b2.setStops(Arrays.asList(s1,s2,s3));
        
        busRepository.saveAll(Arrays.asList(b1,b2));
	}
	
	@Test
	void userAndProfile() {
		
		Profile profile = new Profile();
        profile.setBio("Full Stack Developer");
		User u1 = new User();
		u1.setName("Adam");
		u1.setProfile(profile);
		
		userRepository.save(u1);
	}

}
