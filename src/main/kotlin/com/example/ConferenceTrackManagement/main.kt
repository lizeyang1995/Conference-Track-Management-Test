import com.example.ConferenceTrackManagement.TalkAndTimes
import com.example.ConferenceTrackManagement.Talks
import java.util.*

fun main() {
    val talks = Talks("/Users/zeyang.li/Documents/Kotlin_test/Conference-Track-Management-Test/src/main/kotlin/com/example/ConferenceTrackManagement/Talks.txt").obtainTalks()
    val parsedTalks = mutableListOf<TalkAndTimes>()
    for (talk in talks) {
        val parsedTalk = parseTalk(talk)
        parsedTalks.add(parsedTalk)
    }
    val tracks = assignTalks(parsedTalks)
    val result = parseTime(tracks)
    println(result)
}