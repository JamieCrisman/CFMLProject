package apa;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: CPU <br>
 * @version generated on Mon Mar 09 12:06:31 CDT 2015 by james
 */

public interface CPU extends Computer {

    /* ***************************************************
     * Property http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#madeFrom
     */
     
    /**
     * Gets all property values for the madeFrom property.<p>
     * 
     * @returns a collection of values for the madeFrom property.
     */
    Collection<? extends CPU> getMadeFrom();

    /**
     * Checks if the class has a madeFrom property value.<p>
     * 
     * @return true if there is a madeFrom property value.
     */
    boolean hasMadeFrom();

    /**
     * Adds a madeFrom property value.<p>
     * 
     * @param newMadeFrom the madeFrom property value to be added
     */
    void addMadeFrom(CPU newMadeFrom);

    /**
     * Removes a madeFrom property value.<p>
     * 
     * @param oldMadeFrom the madeFrom property value to be removed.
     */
    void removeMadeFrom(CPU oldMadeFrom);


    /* ***************************************************
     * Property http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#producedBy
     */
     
    /**
     * Gets all property values for the producedBy property.<p>
     * 
     * @returns a collection of values for the producedBy property.
     */
    Collection<? extends Service> getProducedBy();

    /**
     * Checks if the class has a producedBy property value.<p>
     * 
     * @return true if there is a producedBy property value.
     */
    boolean hasProducedBy();

    /**
     * Adds a producedBy property value.<p>
     * 
     * @param newProducedBy the producedBy property value to be added
     */
    void addProducedBy(Service newProducedBy);

    /**
     * Removes a producedBy property value.<p>
     * 
     * @param oldProducedBy the producedBy property value to be removed.
     */
    void removeProducedBy(Service oldProducedBy);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
