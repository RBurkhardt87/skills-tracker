package org.launchcode.skill_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@ResponseBody
public class SkillTrackerController {


        @GetMapping("/")
        public String homepage() {
            return "<html>" +
                    "<h1> Skills Tracker </h1>" +
                    "<h2> We have a few skills we would like to learn. Here is the list!</h2>" +
                    "<ol>" +
                    "<li> Java </li>" +
                    "<li> JavaScript </li>" +
                    "<li> Python </li>" +
                    "</ol>" +
                    "<a href='/form'> Click for Form </a>" +
                    "</html>";
        }
        @GetMapping("form")
        public String form() {
            return "<html>" +
                    "<form action='/form/{name}' method='POST'>" +
                    "<label for='name'> Name: </label><br>" +
                    "<input type='text' id='name' name='name'> </input><br>" +
                    "<label for='age'> Age: </label><br>" +
                    "<input type='text' id='age' name='age'> </input><br>" +



                    "<label for='first'> My favorite language: </label><br>" +
                    "<select name='firstLanguage' id='first'>" +
                    "<option value='Java'> Java </option>" +
                    "<option value='JavaScript'> JavaScript </option>" +
                    "<option value='Python'> Python </option>" +
                    "</select><br>" +
                    "<label for='second'> My second favorite language: </label><br>" +
                    "<select name='secondLanguage' id='second'>" +
                    "<option value='Java'> Java </option>" +
                    "<option value='Javascript'> JavaScript </option>" +
                    "<option value='Python'> Python </option>" +
                    "</select><br>" +
                    "<label for='third'> My third favorite language: </label><br>" +
                    "<select name='thirdLanguage' id='third'>" +
                    "<option value='Java'> Java </option>" +
                    "<option value='Javascript'> JavaScript </option>" +
                    "<option value='Python'> Python </option>" +
                    "</select><br>" +
                    "<h3> Do you have another additional language that you have enjoyed learning? </h3>" +
                    "<label for='fourth'> Additional Language: </label><br>" +
                    "<input type='text' id='fourth' name='fourth'> </input><br><br>" +
                    "<button type='submit'> SUBMIT </button>" +
                    "</form>" +
                    "</html>";

        }
        @PostMapping("form/{name}")
        public String results(@RequestParam String name, int age, String firstLanguage, String secondLanguage, String thirdLanguage, String fourth){

            return "<html>" +
                    "<h1> Name: " + name + "</h1>" +
                    "<h2> Age: " + age + "</h2>" +
                    "<ol>" +
                    "<li>" + firstLanguage + "</li>" +
                    "<li>" + secondLanguage + "</li>" +
                    "<li>" + thirdLanguage +"</li>" +
                    "</ol>" +
                    "<h3> Additional Language: " + fourth + "</h3>" +
                    "<h3> Let's view your choices in table form... </h3>" +
                    "<h4> Favorite Languages: </h4>" +
                    "<table>" +
                        "<tr>" +
                            "<th> First Language </th>" +
                            "<th> Second Language </th>" +
                            "<th> Third Language </th>" +
                            "<th> Additional Language </th>" +
                        "</tr>" +
                        "<tr>" +
                            "<th>" + firstLanguage + "</th>" +
                            "<th>" + secondLanguage + "</th>" +
                            "<th>" + thirdLanguage + "</th>" +
                            "<th>" + fourth + "</th>" +
                        "</tr>" +
                    "</table>" +
                    "</html>";
        }
    }

