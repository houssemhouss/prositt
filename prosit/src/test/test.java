/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;


public class test {
    public static void main(String[] args) {
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant(1111, 23, "Houcem"));
        etudiants.add(new Etudiant(0000, 20, "Hosni"));
        etudiants.add(new Etudiant(3333, 22, "Yesmine"));
        etudiants.add(new Etudiant(2222, 33, "Marco"));

        ListEtudiant listEtudiant = new ListEtudiant();

        listEtudiant.afficherEtudiants(etudiants, t -> System.out.println(t));

        System.out.println(" \n*********");
        listEtudiant.afficherEtudiantsSelonFiltre(etudiants, x -> x.getAge() >= 20 && x.getAge() <= 40, t -> System.out.println(t));

        System.out.println(" \n************");
        System.out.println(listEtudiant.afficherNomEtudiant(etudiants, (t) -> t.getNom()));

        Etudiant createdEtudiant = listEtudiant.creeEtudiant(()-> new Etudiant());
    }
    
}
