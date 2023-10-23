/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
* My github Repo link https://github.com/faizanazeem53/OOCAssignment2022515
*/
package main;

import java.util.List;

/**
 *
 * @author Faizan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TeamBuilder teamBuilder = new TeamBuilder();
        teamBuilder.loadPeopleData("C:\\Users\\Faizan\\Documents\\NetBeansProjects\\Assignment(2022515)\\src\\main\\MOCK_DATA.csv");

        int numTeams = 20;
        int teamSize = 5;

        List<Team> teams = teamBuilder.createTeams(numTeams, teamSize);

        for (Team team : teams) {
            System.out.println(team);
        }
    }
    
}
