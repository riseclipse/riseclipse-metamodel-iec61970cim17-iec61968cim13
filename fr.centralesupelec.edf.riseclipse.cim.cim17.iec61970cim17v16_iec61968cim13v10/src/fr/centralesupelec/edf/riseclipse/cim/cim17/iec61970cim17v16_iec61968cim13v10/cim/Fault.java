/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getPhases <em>Phases</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getImpedance <em>Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getFaultyEquipment <em>Faulty Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getFaultCauseTypes <em>Fault Cause Types</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getOutage <em>Outage</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFault()
 * @model
 * @generated
 */
public interface Fault extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseConnectedFaultKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseConnectedFaultKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #setKind(PhaseConnectedFaultKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFault_Kind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Fault.kind' kind='element'"
     * @generated
     */
    PhaseConnectedFaultKind getKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseConnectedFaultKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #getKind()
     * @generated
     */
    void setKind( PhaseConnectedFaultKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKind()
     * @see #getKind()
     * @see #setKind(PhaseConnectedFaultKind)
     * @generated
     */
    void unsetKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getKind <em>Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kind</em>' attribute is set.
     * @see #unsetKind()
     * @see #getKind()
     * @see #setKind(PhaseConnectedFaultKind)
     * @generated
     */
    boolean isSetKind();

    /**
     * Returns the value of the '<em><b>Phases</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phases</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phases</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode
     * @see #isSetPhases()
     * @see #unsetPhases()
     * @see #setPhases(PhaseCode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFault_Phases()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Fault.phases' kind='element'"
     * @generated
     */
    PhaseCode getPhases();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getPhases <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phases</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode
     * @see #isSetPhases()
     * @see #unsetPhases()
     * @see #getPhases()
     * @generated
     */
    void setPhases( PhaseCode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getPhases <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhases()
     * @see #getPhases()
     * @see #setPhases(PhaseCode)
     * @generated
     */
    void unsetPhases();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getPhases <em>Phases</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phases</em>' attribute is set.
     * @see #unsetPhases()
     * @see #getPhases()
     * @see #setPhases(PhaseCode)
     * @generated
     */
    boolean isSetPhases();

    /**
     * Returns the value of the '<em><b>Impedance</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Impedance</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Impedance</em>' containment reference.
     * @see #isSetImpedance()
     * @see #unsetImpedance()
     * @see #setImpedance(FaultImpedance)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFault_Impedance()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Fault.impedance' kind='element'"
     * @generated
     */
    FaultImpedance getImpedance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getImpedance <em>Impedance</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Impedance</em>' containment reference.
     * @see #isSetImpedance()
     * @see #unsetImpedance()
     * @see #getImpedance()
     * @generated
     */
    void setImpedance( FaultImpedance value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getImpedance <em>Impedance</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetImpedance()
     * @see #getImpedance()
     * @see #setImpedance(FaultImpedance)
     * @generated
     */
    void unsetImpedance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getImpedance <em>Impedance</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Impedance</em>' containment reference is set.
     * @see #unsetImpedance()
     * @see #getImpedance()
     * @see #setImpedance(FaultImpedance)
     * @generated
     */
    boolean isSetImpedance();

    /**
     * Returns the value of the '<em><b>Faulty Equipment</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getFaults <em>Faults</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Faulty Equipment</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Faulty Equipment</em>' reference.
     * @see #isSetFaultyEquipment()
     * @see #unsetFaultyEquipment()
     * @see #setFaultyEquipment(Equipment)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFault_FaultyEquipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getFaults
     * @model opposite="Faults" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Fault.FaultyEquipment' kind='element'"
     * @generated
     */
    Equipment getFaultyEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getFaultyEquipment <em>Faulty Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Faulty Equipment</em>' reference.
     * @see #isSetFaultyEquipment()
     * @see #unsetFaultyEquipment()
     * @see #getFaultyEquipment()
     * @generated
     */
    void setFaultyEquipment( Equipment value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getFaultyEquipment <em>Faulty Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFaultyEquipment()
     * @see #getFaultyEquipment()
     * @see #setFaultyEquipment(Equipment)
     * @generated
     */
    void unsetFaultyEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getFaultyEquipment <em>Faulty Equipment</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Faulty Equipment</em>' reference is set.
     * @see #unsetFaultyEquipment()
     * @see #getFaultyEquipment()
     * @see #setFaultyEquipment(Equipment)
     * @generated
     */
    boolean isSetFaultyEquipment();

    /**
     * Returns the value of the '<em><b>Fault Cause Types</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultCauseType}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultCauseType#getFaults <em>Faults</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fault Cause Types</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fault Cause Types</em>' reference list.
     * @see #isSetFaultCauseTypes()
     * @see #unsetFaultCauseTypes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFault_FaultCauseTypes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultCauseType#getFaults
     * @model opposite="Faults" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Fault.FaultCauseTypes' kind='element'"
     * @generated
     */
    EList< FaultCauseType > getFaultCauseTypes();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getFaultCauseTypes <em>Fault Cause Types</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFaultCauseTypes()
     * @see #getFaultCauseTypes()
     * @generated
     */
    void unsetFaultCauseTypes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getFaultCauseTypes <em>Fault Cause Types</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fault Cause Types</em>' reference list is set.
     * @see #unsetFaultCauseTypes()
     * @see #getFaultCauseTypes()
     * @generated
     */
    boolean isSetFaultCauseTypes();

    /**
     * Returns the value of the '<em><b>Outage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getFaults <em>Faults</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outage</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outage</em>' reference.
     * @see #isSetOutage()
     * @see #unsetOutage()
     * @see #setOutage(Outage)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFault_Outage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getFaults
     * @model opposite="Faults" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Fault.Outage' kind='element'"
     * @generated
     */
    Outage getOutage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getOutage <em>Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outage</em>' reference.
     * @see #isSetOutage()
     * @see #unsetOutage()
     * @see #getOutage()
     * @generated
     */
    void setOutage( Outage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getOutage <em>Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutage()
     * @see #getOutage()
     * @see #setOutage(Outage)
     * @generated
     */
    void unsetOutage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getOutage <em>Outage</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Outage</em>' reference is set.
     * @see #unsetOutage()
     * @see #getOutage()
     * @see #setOutage(Outage)
     * @generated
     */
    boolean isSetOutage();

} // Fault
