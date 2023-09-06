package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variable which we require in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Who is the current President of India?",
            R.drawable.droupadi_murmu,
            "Narendra Modi", "Droupadi Murmu",
            "Pratibha Patil", "Amit Shah", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Who was the first man to fly into outer space?",
            R.drawable.yuri_gagarin,
            "Rakesh Sharma", "Neil Armstrong",
            "Buzz Aldrin", "Yuri Gagarin",
            4
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "In which year did Mumbai city experience the attack of 26/11?",
            R.drawable.mumbai_,
            "2008", "2009",
            "2011", "2007", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What is the capital of Canada?",
            R.drawable.flag_canada,
            "Toronto", "Ottawa",
            "Vancouver", "Washington D.C.", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Which river's increase in level is leading to flooding in Delhi currently?",
            R.drawable.yamuna,
            "Ganga", "Yamuna",
            "Godavari", "Narmada", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "When did Mahatma Gandhi die?",
            R.drawable.gandhi,
            "2 October,1948", "27 January,1947",
            "30 January,1948", "2 October,1947", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What is the currency of Dubai?",
            R.drawable.dubai,
            "Dirham", "Dollar",
            "Dubaian", "lira", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Who designed the national flag of India?",
            R.drawable.ic_flag_of_india,
            "Rabindranath Tagore", "Mahatma Gandhi",
            "Jawaharlal Nehru", "Pingali Venkayya", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Who is the Chairman of Graphic Era Group of Institutions?",
            R.drawable.kamal_ghanshala,
            "Dr.Sanjay Jasola", "Dr. S.R. Khanduja",
            "Dr. Kamal Ghanshala", "none of these", 3
        )

        questionsList.add(que10)

        return questionsList
    }
}