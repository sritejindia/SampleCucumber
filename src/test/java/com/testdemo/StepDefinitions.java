package com.testdemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {
    @When("the Maker starts a game")
    public void the_Maker_starts_a_game() {
        System.out.println("IN method 1");
    }

    @Then("the Maker waits for a Breaker to join")
    public void the_Maker_waits_for_a_Breaker_to_join() {
        System.out.println("IN method 2");
    }

    @Given("the Maker has started a game with the word {string}")
    public void the_Maker_has_started_a_game_with_the_word(String string) {
        System.out.println("IN method 3");
    }

    @When("the Breaker joins the Maker's game")
    public void the_Breaker_joins_the_Maker_s_game() {
        System.out.println("IN method 4");
    }

    @Then("the Breaker must guess a word with {int} characters")
    public void the_Breaker_must_guess_a_word_with_characters(Integer int1) {
        System.out.println("IN method 5");
    }

    @Given("I am out shopping")
    public void i_am_out_shopping() {
        System.out.println("In method 6");
    }


    @Given("I have eggs")
    public void i_have_eggs() {
        System.out.println("In method 6");
    }
    @Given("I have milk")
    public void i_have_milk() {
        System.out.println("In method 6");
    }
    @Given("I have butter")
    public void i_have_butter() {
        System.out.println("In method 6");
    }
    @When("I check my list")
    public void i_check_my_list() {
        System.out.println("In method 6");
    }
    @Then("I don't need anything")
    public void i_don_t_need_anything() {
        System.out.println("In method 6");
    }




}
