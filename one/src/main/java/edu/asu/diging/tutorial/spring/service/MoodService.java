package edu.asu.diging.tutorial.spring.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodService {
	public String[] moods;
	public String reason;

	public Mood getCurrentMood() {
		// reference: http://www.javapractices.com/topic/TopicAction.do?Id=62
		moods = new String[] { "happy", "sad", "jealous", "angry" };
		Random randomGenerator = new Random();
		// System.out.println(moods.length);
		int randomInt = randomGenerator.nextInt(moods.length);
		// System.out.println(randomInt);
		// System.out.println(moods[randomInt]);
		return new Mood(moods[randomInt]);
	}

	// public void configure() {
	//
	// }

	public String getReason() {
		String reason = "there is noone to play with me.";
		System.out.println(reason);
		return reason;
	}

}
