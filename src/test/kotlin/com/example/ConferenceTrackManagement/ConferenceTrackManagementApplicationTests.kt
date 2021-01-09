package com.example.ConferenceTrackManagement

import assignTalks
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import parseTalk
import parseTime

@SpringBootTest
class ConferenceTrackManagementApplicationTests {

	@Test
	fun `sample test 1`() {
		val talks = Talks("/Users/zeyang.li/Documents/Kotlin_test/Conference-Track-Management-Test/src/test/kotlin/com/example/ConferenceTrackManagement/demoTalks1.txt").obtainTalks()
		val parsedTalks = mutableListOf<TalkAndTimes>()
		for (talk in talks) {
			val parsedTalk = parseTalk(talk)
			parsedTalks.add(parsedTalk)
		}
		val tracks = assignTalks(parsedTalks)
		val result = parseTime(tracks)
		Assertions.assertEquals("Track 1:\n" +
				"09:00AM Rails for Python Developers lightning\n" +
				"09:05AM Lua for the Masses 30min\n" +
				"09:35AM Woah 30min\n" +
				"10:05AM Sit Down and Write 30min\n" +
				"10:35AM Programming in the Boondocks of Seattle 30min\n" +
				"11:05AM Ruby vs. Clojure for Back-End Development 30min\n" +
				"12:00PM Lunch\n" +
				"01:00PM A World Without HackerNews 30min\n" +
				"01:30PM User Interface CSS in Rails Apps 30min\n" +
				"02:00PM Overdoing it in Python 45min\n" +
				"02:45PM Ruby Errors from Mismatched Gem Versions 45min\n" +
				"03:30PM Common Ruby Errors 45min\n" +
				"04:15PM Accounting-Driven Development 45min\n" +
				"05:00PM Networking Event\n" +
				"\n" +
				"Track 2:\n" +
				"09:00AM Clojure Ate Scala (on my project) 45min\n" +
				"09:45AM Writing Fast Tests Against Enterprise Rails 60min\n" +
				"10:45AM Communicating Over Distance 60min\n" +
				"12:00PM Lunch\n" +
				"01:00PM Rails Magic 60min\n" +
				"02:00PM Ruby on Rails: Why We Should Move On 60min\n" +
				"03:00PM Ruby on Rails Legacy App Maintenance 60min\n" +
				"04:00PM Networking Event", result)
	}

	@Test
	fun `sample test 2`() {
		val talks = Talks("/Users/zeyang.li/Documents/Kotlin_test/Conference-Track-Management-Test/src/test/kotlin/com/example/ConferenceTrackManagement/demoTalks2.txt").obtainTalks()
		val parsedTalks = mutableListOf<TalkAndTimes>()
		for (talk in talks) {
			val parsedTalk = parseTalk(talk)
			parsedTalks.add(parsedTalk)
		}
		val tracks = assignTalks(parsedTalks)
		val result = parseTime(tracks)
		Assertions.assertEquals("Track 1:\n" +
				"09:00AM Rails for Python Developers lightning\n" +
				"09:05AM Lua for the Masses 30min\n" +
				"09:35AM Woah 30min\n" +
				"10:05AM Sit Down and Write 30min\n" +
				"10:35AM Programming in the Boondocks of Seattle 30min\n" +
				"11:05AM Ruby vs. Clojure for Back-End Development 30min\n" +
				"12:00PM Lunch\n" +
				"01:00PM A World Without HackerNews 30min\n" +
				"01:30PM User Interface CSS in Rails Apps 30min\n" +
				"02:00PM Add a new talks 33min\n" +
				"02:33PM Overdoing it in Python 45min\n" +
				"03:18PM Ruby Errors from Mismatched Gem Versions 45min\n" +
				"04:03PM Common Ruby Errors 45min\n" +
				"05:00PM Networking Event\n" +
				"\n" +
				"Track 2:\n" +
				"09:00AM Pair Programming vs Noise 45min\n" +
				"09:45AM Clojure Ate Scala (on my project) 45min\n" +
				"10:30AM Writing Fast Tests Against Enterprise Rails 60min\n" +
				"12:00PM Lunch\n" +
				"01:00PM Communicating Over Distance 60min\n" +
				"02:00PM Rails Magic 60min\n" +
				"03:00PM Ruby on Rails: Why We Should Move On 60min\n" +
				"04:00PM Ruby on Rails Legacy App Maintenance 60min\n" +
				"05:00PM Networking Event", result)
	}

	@Test
	fun `sample test 3`() {
		val talks = Talks("/Users/zeyang.li/Documents/Kotlin_test/Conference-Track-Management-Test/src/test/kotlin/com/example/ConferenceTrackManagement/demoTalks3.txt").obtainTalks()
		val parsedTalks = mutableListOf<TalkAndTimes>()
		for (talk in talks) {
			val parsedTalk = parseTalk(talk)
			parsedTalks.add(parsedTalk)
		}
		val tracks = assignTalks(parsedTalks)
		val result = parseTime(tracks)
		Assertions.assertEquals("Track 1:\n" +
				"09:00AM Rails for Python Developers lightning\n" +
				"09:05AM Lua for the Masses 30min\n" +
				"09:35AM Woah 30min\n" +
				"10:05AM Sit Down and Write 30min\n" +
				"10:35AM Overdoing it in Python 45min\n" +
				"12:00PM Lunch\n" +
				"01:00PM Ruby Errors from Mismatched Gem Versions 45min\n" +
				"01:45PM Common Ruby Errors 45min\n" +
				"02:30PM Accounting-Driven Development 45min\n" +
				"03:15PM Pair Programming vs Noise 45min\n" +
				"04:00PM Writing Fast Tests Against Enterprise Rails 60min\n" +
				"05:00PM Networking Event\n" +
				"\n" +
				"Track 2:\n" +
				"09:00AM Rails Magic 60min\n" +
				"12:00PM Lunch\n" +
				"04:00PM Networking Event", result)
	}

	@Test
	fun `sample test 4`() {
		val talks = Talks("/Users/zeyang.li/Documents/Kotlin_test/Conference-Track-Management-Test/src/test/kotlin/com/example/ConferenceTrackManagement/demoTalks4.txt").obtainTalks()
		val parsedTalks = mutableListOf<TalkAndTimes>()
		for (talk in talks) {
			val parsedTalk = parseTalk(talk)
			parsedTalks.add(parsedTalk)
		}
		val tracks = assignTalks(parsedTalks)
		val result = parseTime(tracks)
		Assertions.assertEquals("Track 1:\n" +
				"09:00AM Rails for Python Developers lightning\n" +
				"09:05AM Lua for the Masses 30min\n" +
				"09:35AM Overdoing it in Python 45min\n" +
				"10:20AM Ruby Errors from Mismatched Gem Versions 45min\n" +
				"11:05AM Common Ruby Errors 45min\n" +
				"12:00PM Lunch\n" +
				"01:00PM Writing Fast Tests Against Enterprise Rails 60min\n" +
				"04:00PM Networking Event", result)
	}

}
