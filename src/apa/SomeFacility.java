package apa;

import apa.impl.*;

import java.util.Collection;

import org.protege.owl.codegeneration.CodeGenerationFactory;
import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.FactoryHelper;
import org.protege.owl.codegeneration.impl.ProtegeJavaMapping;
import org.protege.owl.codegeneration.inference.CodeGenerationInference;
import org.protege.owl.codegeneration.inference.SimpleInference;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

/**
 * A class that serves as the entry point to the generated code providing access
 * to existing individuals in the ontology and the ability to create new individuals in the ontology.<p>
 * 
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: SomeFacility<br>
 * @version generated on Mon Mar 09 12:06:31 CDT 2015 by james
 */
public class SomeFacility implements CodeGenerationFactory {
    private OWLOntology ontology;
    private ProtegeJavaMapping javaMapping = new ProtegeJavaMapping();
    private FactoryHelper delegate;
    private CodeGenerationInference inference;

    public SomeFacility(OWLOntology ontology) {
	    this(ontology, new SimpleInference(ontology));
    }
    
    public SomeFacility(OWLOntology ontology, CodeGenerationInference inference) {
        this.ontology = ontology;
        this.inference = inference;
        javaMapping.initialize(ontology, inference);
        delegate = new FactoryHelper(ontology, inference);
    }

    public OWLOntology getOwlOntology() {
        return ontology;
    }
    
    public void saveOwlOntology() throws OWLOntologyStorageException {
        ontology.getOWLOntologyManager().saveOntology(ontology);
    }
    
    public void flushOwlReasoner() {
        delegate.flushOwlReasoner();
    }
    
    public boolean canAs(WrappedIndividual resource, Class<? extends WrappedIndividual> javaInterface) {
    	return javaMapping.canAs(resource, javaInterface);
    }
    
    public  <X extends WrappedIndividual> X as(WrappedIndividual resource, Class<? extends X> javaInterface) {
    	return javaMapping.as(resource, javaInterface);
    }
    
    public Class<?> getJavaInterfaceFromOwlClass(OWLClass cls) {
        return javaMapping.getJavaInterfaceFromOwlClass(cls);
    }
    
    public OWLClass getOwlClassFromJavaInterface(Class<?> javaInterface) {
	    return javaMapping.getOwlClassFromJavaInterface(javaInterface);
    }
    
    public CodeGenerationInference getInference() {
        return inference;
    }

    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#CFD
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#CFD", CFD.class, DefaultCFD.class);
    }

    /**
     * Creates an instance of type CFD.  Modifies the underlying ontology.
     */
    public CFD createCFD(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_CFD, DefaultCFD.class);
    }

    /**
     * Gets an instance of type CFD with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public CFD getCFD(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_CFD, DefaultCFD.class);
    }

    /**
     * Gets all instances of CFD from the ontology.
     */
    public Collection<? extends CFD> getAllCFDInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_CFD, DefaultCFD.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#CPU
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#CPU", CPU.class, DefaultCPU.class);
    }

    /**
     * Creates an instance of type CPU.  Modifies the underlying ontology.
     */
    public CPU createCPU(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_CPU, DefaultCPU.class);
    }

    /**
     * Gets an instance of type CPU with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public CPU getCPU(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_CPU, DefaultCPU.class);
    }

    /**
     * Gets all instances of CPU from the ontology.
     */
    public Collection<? extends CPU> getAllCPUInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_CPU, DefaultCPU.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Case
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Case", Case.class, DefaultCase.class);
    }

    /**
     * Creates an instance of type Case.  Modifies the underlying ontology.
     */
    public Case createCase(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_CASE, DefaultCase.class);
    }

    /**
     * Gets an instance of type Case with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Case getCase(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_CASE, DefaultCase.class);
    }

    /**
     * Gets all instances of Case from the ontology.
     */
    public Collection<? extends Case> getAllCaseInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_CASE, DefaultCase.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Computer
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Computer", Computer.class, DefaultComputer.class);
    }

    /**
     * Creates an instance of type Computer.  Modifies the underlying ontology.
     */
    public Computer createComputer(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_COMPUTER, DefaultComputer.class);
    }

    /**
     * Gets an instance of type Computer with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Computer getComputer(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_COMPUTER, DefaultComputer.class);
    }

    /**
     * Gets all instances of Computer from the ontology.
     */
    public Collection<? extends Computer> getAllComputerInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_COMPUTER, DefaultComputer.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Equipment
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Equipment", Equipment.class, DefaultEquipment.class);
    }

    /**
     * Creates an instance of type Equipment.  Modifies the underlying ontology.
     */
    public Equipment createEquipment(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_EQUIPMENT, DefaultEquipment.class);
    }

    /**
     * Gets an instance of type Equipment with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Equipment getEquipment(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_EQUIPMENT, DefaultEquipment.class);
    }

    /**
     * Gets all instances of Equipment from the ontology.
     */
    public Collection<? extends Equipment> getAllEquipmentInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_EQUIPMENT, DefaultEquipment.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Facility
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Facility", Facility.class, DefaultFacility.class);
    }

    /**
     * Creates an instance of type Facility.  Modifies the underlying ontology.
     */
    public Facility createFacility(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_FACILITY, DefaultFacility.class);
    }

    /**
     * Gets an instance of type Facility with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Facility getFacility(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_FACILITY, DefaultFacility.class);
    }

    /**
     * Gets all instances of Facility from the ontology.
     */
    public Collection<? extends Facility> getAllFacilityInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_FACILITY, DefaultFacility.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Harddrive
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Harddrive", Harddrive.class, DefaultHarddrive.class);
    }

    /**
     * Creates an instance of type Harddrive.  Modifies the underlying ontology.
     */
    public Harddrive createHarddrive(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_HARDDRIVE, DefaultHarddrive.class);
    }

    /**
     * Gets an instance of type Harddrive with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Harddrive getHarddrive(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_HARDDRIVE, DefaultHarddrive.class);
    }

    /**
     * Gets all instances of Harddrive from the ontology.
     */
    public Collection<? extends Harddrive> getAllHarddriveInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_HARDDRIVE, DefaultHarddrive.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Memory
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Memory", Memory.class, DefaultMemory.class);
    }

    /**
     * Creates an instance of type Memory.  Modifies the underlying ontology.
     */
    public Memory createMemory(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_MEMORY, DefaultMemory.class);
    }

    /**
     * Gets an instance of type Memory with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Memory getMemory(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_MEMORY, DefaultMemory.class);
    }

    /**
     * Gets all instances of Memory from the ontology.
     */
    public Collection<? extends Memory> getAllMemoryInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_MEMORY, DefaultMemory.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Motherboard
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Motherboard", Motherboard.class, DefaultMotherboard.class);
    }

    /**
     * Creates an instance of type Motherboard.  Modifies the underlying ontology.
     */
    public Motherboard createMotherboard(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_MOTHERBOARD, DefaultMotherboard.class);
    }

    /**
     * Gets an instance of type Motherboard with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Motherboard getMotherboard(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_MOTHERBOARD, DefaultMotherboard.class);
    }

    /**
     * Gets all instances of Motherboard from the ontology.
     */
    public Collection<? extends Motherboard> getAllMotherboardInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_MOTHERBOARD, DefaultMotherboard.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#SCF
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#SCF", SCF.class, DefaultSCF.class);
    }

    /**
     * Creates an instance of type SCF.  Modifies the underlying ontology.
     */
    public SCF createSCF(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_SCF, DefaultSCF.class);
    }

    /**
     * Gets an instance of type SCF with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public SCF getSCF(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_SCF, DefaultSCF.class);
    }

    /**
     * Gets all instances of SCF from the ontology.
     */
    public Collection<? extends SCF> getAllSCFInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_SCF, DefaultSCF.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Service
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#Service", Service.class, DefaultService.class);
    }

    /**
     * Creates an instance of type Service.  Modifies the underlying ontology.
     */
    public Service createService(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_SERVICE, DefaultService.class);
    }

    /**
     * Gets an instance of type Service with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Service getService(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_SERVICE, DefaultService.class);
    }

    /**
     * Gets all instances of Service from the ontology.
     */
    public Collection<? extends Service> getAllServiceInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_SERVICE, DefaultService.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#WCF
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#WCF", WCF.class, DefaultWCF.class);
    }

    /**
     * Creates an instance of type WCF.  Modifies the underlying ontology.
     */
    public WCF createWCF(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_WCF, DefaultWCF.class);
    }

    /**
     * Gets an instance of type WCF with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public WCF getWCF(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_WCF, DefaultWCF.class);
    }

    /**
     * Gets all instances of WCF from the ontology.
     */
    public Collection<? extends WCF> getAllWCFInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_WCF, DefaultWCF.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#energyCF
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#energyCF", EnergyCF.class, DefaultEnergyCF.class);
    }

    /**
     * Creates an instance of type EnergyCF.  Modifies the underlying ontology.
     */
    public EnergyCF createEnergyCF(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_ENERGYCF, DefaultEnergyCF.class);
    }

    /**
     * Gets an instance of type EnergyCF with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public EnergyCF getEnergyCF(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_ENERGYCF, DefaultEnergyCF.class);
    }

    /**
     * Gets all instances of EnergyCF from the ontology.
     */
    public Collection<? extends EnergyCF> getAllEnergyCFInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_ENERGYCF, DefaultEnergyCF.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#energyData
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#energyData", EnergyData.class, DefaultEnergyData.class);
    }

    /**
     * Creates an instance of type EnergyData.  Modifies the underlying ontology.
     */
    public EnergyData createEnergyData(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_ENERGYDATA, DefaultEnergyData.class);
    }

    /**
     * Gets an instance of type EnergyData with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public EnergyData getEnergyData(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_ENERGYDATA, DefaultEnergyData.class);
    }

    /**
     * Gets all instances of EnergyData from the ontology.
     */
    public Collection<? extends EnergyData> getAllEnergyDataInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_ENERGYDATA, DefaultEnergyData.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#energySource
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#energySource", EnergySource.class, DefaultEnergySource.class);
    }

    /**
     * Creates an instance of type EnergySource.  Modifies the underlying ontology.
     */
    public EnergySource createEnergySource(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_ENERGYSOURCE, DefaultEnergySource.class);
    }

    /**
     * Gets an instance of type EnergySource with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public EnergySource getEnergySource(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_ENERGYSOURCE, DefaultEnergySource.class);
    }

    /**
     * Gets all instances of EnergySource from the ontology.
     */
    public Collection<? extends EnergySource> getAllEnergySourceInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_ENERGYSOURCE, DefaultEnergySource.class);
    }


    /* ***************************************************
     * Class http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#mService
     */

    {
        javaMapping.add("http://www.semanticweb.org/james/ontologies/2015/0/untitled-ontology-15#mService", MService.class, DefaultMService.class);
    }

    /**
     * Creates an instance of type MService.  Modifies the underlying ontology.
     */
    public MService createMService(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_MSERVICE, DefaultMService.class);
    }

    /**
     * Gets an instance of type MService with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public MService getMService(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_MSERVICE, DefaultMService.class);
    }

    /**
     * Gets all instances of MService from the ontology.
     */
    public Collection<? extends MService> getAllMServiceInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_MSERVICE, DefaultMService.class);
    }


}
