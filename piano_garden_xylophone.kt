//1
fun buildPositiveRelationships(activity: String): String {
    val message = when (activity) {
        "listening" -> "Listen with an open heart to others and be mindful of your own inner voice."
        "sharing" -> "Be prepared to share feelings and thoughts in a respectful manner."
        "compromising" -> "Be willing to compromise and negotiate with each other."
        "supporting" -> "Be supportive of each other and ready to accept help from each other."
        "communicating" -> "Communicate clearly and often about issues that require attention or need to be resolved."
        else -> "No message found."
    }
    return message
}

//2
fun setBoundaries(relationships: List<String>): Boolean {
    relationships.forEach {
        it ->
        when (it) {
            "listening" -> println("Be mindful of boundaries when listening to others.")
            "sharing" -> println("Set appropriate boundaries in order to protect your privacy and safety.")
            "compromising" -> println("Find the balance between compromising and standing up for your own beliefs.")
            "supporting" -> println("Be careful not to be too supportive as enabling behaviour is not beneficial to the relationship.")
            "communicating" -> println("Be open to communicating about limitations and boundaries as needed.")
            else -> println("No message found.")
        }
    }
    return true
}

//3
fun createMutualTrust(favouriteActivities: List<String>): Boolean {
    favouriteActivities.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Create mutual trust by being there to listen and understand the other's feelings.")
            "sharing" -> println("Share your thoughts and feelings to strengthen the trust between you.")
            "compromising" -> println("Be willing to compromise and trust that the other person will do the same.")
            "supporting" -> println("Be supportive of each other and demonstrate trust in how you handle conflicts.")
            "communicating" -> println("Communicate openly and honestly to build a constructive level of trust between you.")
            else -> println("No message found.")
        }
    }
    return true
}

//4
fun beMindful(relationshipsTypes: List<String>): Boolean {
    relationshipsTypes.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Be mindful of your thoughts and feelings when listening to others.")
            "sharing" -> println("Be mindful of how much you share and when it is appropriate to do so.")
            "compromising" -> println("Be mindful of when it is appropriate to compromise and when it is better to stand your ground.")
            "supporting" -> println("Be mindful of when providing support is the right thing to do and when it can only do more harm than good.")
            "communicating" -> println("Be mindful of how you communicate with others and be aware of how your words affect them.")
            else -> println("No message found.")
        }
    }
    return true
}

//5
fun respectDiversity(activities: List<String>): Boolean {
    activities.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Respect the diversity of opinions of others by actively listening to their point of view.")
            "sharing" -> println("Be respectful of the diversity of ideas and opinions when sharing your thoughts and feelings.")
            "compromising" -> println("Be conscious of the diversity in the beliefs of both parties when negotiating.")
            "supporting" -> println("Be respectful and understanding to the diversity of needs in relationships when providing support.")
            "communicating" -> println("Be mindful of diversity when communicating to avoid any misunderstandings.")
            else -> println("No message found.")
        }
    }
    return true
}

//6
fun beRespectful(activities: List<String>): Boolean {
    activities.forEach {
        it -> 
        when (it) {
            "listening" -> println("Be respectful of the speaker and their opinions when listening to them.")
            "sharing" -> println("Show respect to those you are sharing with by being open to what they have to say.")
            "compromising" -> println("Be respectful when compromising and negotiating with another person.")
            "supporting" -> println("Show respect to the person you are supporting by being understanding and patient.")
            "communicating" -> println("Be respectful when communicating with others by being open and honest.")
            else -> println("No message found.")
        }
    }
    return true
}

//7
fun showEmpathy(relationships: List<String>): Boolean {
    relationships.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Show empathy by being attentive and understanding the feelings of the other person.")
            "sharing" -> println("Be empathetic when sharing your own thoughts and feelings.")
            "compromising" -> println("Be mindful to show empathy when negotiating and compromising with others.")
            "supporting" -> println("When support is needed, be empathetic to the person's struggles.")
            "communicating" -> println("Express empathy when communicating by being understanding of the person's feelings.")
            else -> println("No message found.")
        }
    }
    return true
}

//8
fun developSympathy(activities: List<String>): Boolean {
    activities.forEach {
        it -> 
        when (it) {
            "listening" -> println("Develop sympathy by taking the time to genuinely listen to the other person's concerns.")
            "sharing" -> println("Be sympathetic when sharing your own thoughts and feelings.")
            "compromising" -> println("Be sympathetic when compromising and negotiating with another person.")
            "supporting" -> println("Be sympathetic when providing support to another person.")
            "communicating" -> println("Express sympathy when communicating by being understanding of the person's struggles.")
            else -> println("No message found.")
        }
    }
    return true
}

//9
fun expressGratitude(activities: List<String>): Boolean {
    activities.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Express gratitude to the other person by thanking them for taking the time to share their feelings.")
            "sharing" -> println("Show appreciation by expressing gratitude for their willingness to share with you.")
            "compromising" -> println("Express gratitude to the other person for being willing to work together to find a solution.")
            "supporting" -> println("Show gratitude for the other person's support and willingness to help you.")
            "communicating" -> println("Express your appreciation for their willingness to communicate with you.")
            else -> println("No message found.")
        }
    }
    return true
}

//10
fun practiceHonesty(relationships: List<String>): Boolean {
    relationships.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Practice honesty by being sincere in your listening and be open to admitting your own mistakes.")
            "sharing" -> println("Show honesty by being open and honest in your sharing.")
            "compromising" -> println("Be honest about your feelings and needs when negotiating and compromising.")
            "supporting" -> println("Be honest and upfront about what you can and cannot offer when offering support.")
            "communicating" -> println("Be honest and truthful when communicating with others to avoid misunderstandings.")
            else -> println("No message found.")
        }
    }
    return true
}

//11
fun findBalance(activities: List<String>): Boolean {
    activities.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Find a balance between listening attentively and giving constructive feedback.")
            "sharing" -> println("Find the balance between self-disclosure and privacy when sharing.")
            "compromising" -> println("Be prepared to find a balance between accommodating the other person and standing up for your own beliefs.")
            "supporting" -> println("Find the balance between providing support and enabling behaviour.")
            "communicating" -> println("Find a balance between being assertive in your communication and remaining respectful.")
            else -> println("No message found.")
        }
    }
    return true
}

//12
fun buildConnection(activities: List<String>): Boolean {
    activities.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Build a connection by being present in the conversation and listening attentively to the other person.")
            "sharing" -> println("Share meaningful information to build a strong connection with the other person.")
            "compromising" -> println("Be willing to compromise and negotiate to build a better connection between you.")
            "supporting" -> println("Building a connection requires support from both parties to be effective.")
            "communicating" -> println("Be open to communicating about issues to build a strong connection between you.")
            else -> println("No message found.")
        }
    }
    return true
}

//13
fun encourageDialogue(relationships: List<String>): Boolean {
    relationships.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Encourage dialogue by being open to hearing other people's opinion and ideas.")
            "sharing" -> println("Share ideas and opinions in a constructive manner to encourage dialogue.")
            "compromising" -> println("Be open to compromise and negotiate with each other to continue the dialogue.")
            "supporting" -> println("Encourage dialogue by being supportive and understanding of the other's concerns and needs.")
            "communicating" -> println("Be open to communicating about any struggles to encourage constructive dialogue.")
            else -> println("No message found.")
        }
    }
    return true
}

//14
fun cultivateUnderstanding(activities: List<String>): Boolean {
    activities.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Cultivate understanding by actively listening and being open to the other person's perspective.")
            "sharing" -> println("Share what you think and how you feel in a respectful manner to cultivate understanding.")
            "compromising" -> println("Be willing to compromise and negotiate to cultivate mutual understanding.")
            "supporting" -> println("Cultivate understanding by being supportive and understanding of the other's needs.")
            "communicating" -> println("Communicate openly and honestly to cultivate understanding between you.")
            else -> println("No message found.")
        }
    }
    return true
}

//15
fun createPositiveEnvironment(relationships: List<String>): Boolean {
    relationships.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Create a positive environment by being an active listener.")
            "sharing" -> println("Be encouraging and positive when sharing your thoughts and feelings.")
            "compromising" -> println("Be flexible and open to compromise and negotiation to create a positive environment.")
            "supporting" -> println("Create a positive environment by offering supportive words and actions.")
            "communicating" -> println("Communicate in a positive manner to create a constructive environment.")
            else -> println("No message found.")
        }
    }
    return true
}

//16
fun practiceSelfAwareness(activities: List<String>): Boolean {
    activities.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Practice self-awareness by being aware of your own feelings and reactions when listening.")
            "sharing" -> println("Be mindful of how much you share and the impact it may have on those around you when sharing.")
            "compromising" -> println("Practice self-awareness by being aware of your own feelings and needs when compromising.")
            "supporting" -> println("Practice self-awareness by being mindful of your own needs and limitations when providing support.")
            "communicating" -> println("Be mindful of how you communicate and the impact it can have on those involved when communicating.")
            else -> println("No message found.")
        }
    }
    return true
}

//17
fun practiceSelfCare(activities: List<String>): Boolean {
    activities.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Practice self-care by taking a break from listening if it becomes overwhelming.")
            "sharing" -> println("Be mindful of how much you share and make sure to practice self-care when needed.")
            "compromising" -> println("Practice self-care by being aware of your own feelings and needs when negotiating.")
            "supporting" -> println("Be mindful of your own needs and limitations when providing support and take time to practice self-care.")
            "communicating" -> println("Be aware of how you are communicating and when it is time for a break to practice self-care.")
            else -> println("No message found.")
        }
    }
    return true
}

//18
fun forgiveMistakes(activities: List<String>): Boolean {
    activities.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Forgive mistakes by being open to the other person's perspective and learning from the experience.")
            "sharing" -> println("Be open to learning from mistakes and forgiving them when needed when sharing.")
            "compromising" -> println("Be open and willing to forgive mistakes if they occur when compromising with others.")
            "supporting" -> println("Forgive mistakes when offering support and be understanding of the person's struggles.")
            "communicating" -> println("Be open to forgiving mistakes when communicating and be understanding of each other's feelings.")
            else -> println("No message found.")
        }
    }
    return true
}

//19
fun beNonJudgemental(activities: List<String>): Boolean {
    activities.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Be non-judgemental when listening to another person by being understanding and open to their point of view.")
            "sharing" -> println("Show acceptance and be non-judgemental when sharing your thoughts and feelings.")
            "compromising" -> println("Be willing to compromise without judgement when negotiating with another person.")
            "supporting" -> println("Be non-judgemental and accept the person for who they are when providing support.")
            "communicating" -> println("Be non-judgemental when communicating with another and respect their opinion.")
            else -> println("No message found.")
        }
    }
    return true
}

//20
fun practicePatience(relationships: List<String>): Boolean {
    relationships.forEach { 
        it -> 
        when (it) {
            "listening" -> println("Practice patience when listening to the other person by allowing them to finish what they have to say.")
            "sharing" -> println("Be patient when sharing your thoughts and feelings and respect the other person's opinion.")
            "compromising" -> println("Be patient and willing to find a balance between accommodating the other person and maintaining your own beliefs.")