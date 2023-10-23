/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
/**
 *
 * @author Faizan
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TeamBuilder {
    private List<Person> people;

    public TeamBuilder() {
        this.people = new ArrayList<>();
    }

    public void loadPeopleData(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String firstName = parts[1];
                String lastName = parts[2];
                String email = parts[3];
                people.add(new Person(id, firstName, lastName, email));
            }
        } catch (IOException e) {
        }
    }

    public List<Team> createTeams(int numTeams, int teamSize) {
        List<Team> teams = new ArrayList<>();
        Collections.shuffle(people, new Random());

        for (int i = 0; i < numTeams; i++) {
            Team team = new Team("Team " + (i + 1));
            for (int j = 0; j < teamSize; j++) {
                team.addMember(people.get(i * teamSize + j));
            }
            teams.add(team);
        }

        return teams;
    }
}
