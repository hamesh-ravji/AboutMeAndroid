package com.example.aboutmeapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var _name: MutableLiveData<String> = MutableLiveData("Hamesh Ravji")
    val name: LiveData<String>
        get() = _name

    var _summary: MutableLiveData<String> = MutableLiveData("Placeholder")
    val summary: LiveData<String>
        get() = _summary

    var _softwareDevelopmentSkills: MutableLiveData<MutableList<String>> =
        MutableLiveData(mutableListOf(
            "Web Design",
            "Android Development (Kotlin)",
            "Proficient in Python, Java",
            "Comfortable programming in C, C++, C#, JavaScript, HTML, CSS, SQL",
            "Knowledge of Networking and Communications such as circuit and packet switching and other various networking protocols such as IP protocols",
            "Comfortable with REST API development, using Node.js and Java SpringBoot frameworks for multiple projects using a Client-Server architecture",
            "Experience programming Embedded Systems"
        ))
    val softwareDevelopmentSkills: LiveData<MutableList<String>>
        get() = _softwareDevelopmentSkills

    var _teamworkCommunicationSkills: MutableLiveData<MutableList<String>> =
        MutableLiveData(mutableListOf(
            "Completed multiple team projects throughout University, team sizes ranging from 2 to 8",
            "Familiar with using communication tools such as Slack and Discord",
            "Previously used Atlassian's Jira and Confluence tools while working at Seequent",
            "Capable of using different development methodologies, experience using SCRUM for group project"
        ))
    val teamworkCommunicationSkills: LiveData<MutableList<String>>
        get() = _teamworkCommunicationSkills



}