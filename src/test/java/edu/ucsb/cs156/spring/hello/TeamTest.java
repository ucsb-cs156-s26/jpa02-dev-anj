package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_true_for_same_object() {
        assertTrue(team.equals(team));
    }

    @Test
    public void equals_returns_false_for_different_class() {
        assertFalse(team.equals("not a team"));
    }   

    @Test
    public void equals_returns_true_when_name_and_members_match() {
        Team other = new Team("test-team");
        assertTrue(team.equals(other)); 
    }

    @Test
    public void equals_returns_false_when_name_matches_but_members_differ() {
        Team other = new Team("test-team");
        other.addMember("Alice");

        assertFalse(team.equals(other));    
    }

    @Test
    public void equals_returns_false_when_name_differs() {
        Team other = new Team("different-team");
        assertFalse(team.equals(other));
    }

    @Test
    public void hashCode_returns_expected() {
        int result = team.hashCode();
        int expectedResult = -1226298695; // temporary placeholder
        assertEquals(expectedResult, result);
}
   


    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
