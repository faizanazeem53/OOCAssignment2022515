/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
/**
 *
 * @author Faizan
 */
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Person> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    @Override
    public String toString() {
        StringBuilder teamInfo = new StringBuilder("Team Name: " + name + "\n");
        for (Person member : members) {
            teamInfo.append(" - ").append(member.toString()).append("\n");
        }
        return teamInfo.toString();
    }
}
