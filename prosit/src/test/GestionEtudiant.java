/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;


public interface GestionEtudiant {
    public void afficherEtudiants(List<Etudiant> etudiants, Consumer<Etudiant> consumer);
    public void afficherEtudiantsSelonFiltre(List<Etudiant> etudiants, Predicate<Etudiant> predicate, Consumer<Etudiant> consumer);
    public String afficherNomEtudiant(List<Etudiant> etudiants, Function<Etudiant, String> function);
    public Etudiant creeEtudiant(Supplier<Etudiant> supplier);   
    public Stream convertListStream(List<Etudiant> etudiants);
    
}
