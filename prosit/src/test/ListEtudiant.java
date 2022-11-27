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


    public class ListEtudiant implements GestionEtudiant {
    @Override
    public void afficherEtudiants(List<Etudiant> etudiants, Consumer<Etudiant> consumer) {
        for (Etudiant e : etudiants) {
            consumer.accept(e);
        }
    }
    @Override
    public void afficherEtudiantsSelonFiltre(List<Etudiant> etudiants, Predicate<Etudiant> predicate, Consumer<Etudiant> consumer) {
        for (Etudiant e : etudiants) {
            if(predicate.test(e)){
                consumer.accept(e);
            }            
        }
    }
    @Override
    public String afficherNomEtudiant(List<Etudiant> etudiants, Function<Etudiant, String> function) {
        String nomsEtudiant = "";  
        for (Etudiant e : etudiants) {
            nomsEtudiant+= "\n"+function.apply(e);
        }
        return nomsEtudiant;
    }
    @Override
    public Etudiant creeEtudiant(Supplier<Etudiant> supplier) {
        return  supplier.get();
    }
    @Override
    public Stream convertListStream(List<Etudiant> etudiants) {
        return etudiants.stream();
    }
}
