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
 * A representation of the model object '<em><b>Per Length Phase Impedance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthPhaseImpedance#getConductorCount <em>Conductor Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthPhaseImpedance#getPhaseImpedanceData <em>Phase Impedance Data</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerLengthPhaseImpedance()
 * @model
 * @generated
 */
public interface PerLengthPhaseImpedance extends PerLengthImpedance {
    /**
     * Returns the value of the '<em><b>Conductor Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conductor Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conductor Count</em>' attribute.
     * @see #isSetConductorCount()
     * @see #unsetConductorCount()
     * @see #setConductorCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerLengthPhaseImpedance_ConductorCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PerLengthPhaseImpedance.conductorCount' kind='element'"
     * @generated
     */
    Integer getConductorCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthPhaseImpedance#getConductorCount <em>Conductor Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conductor Count</em>' attribute.
     * @see #isSetConductorCount()
     * @see #unsetConductorCount()
     * @see #getConductorCount()
     * @generated
     */
    void setConductorCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthPhaseImpedance#getConductorCount <em>Conductor Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConductorCount()
     * @see #getConductorCount()
     * @see #setConductorCount(Integer)
     * @generated
     */
    void unsetConductorCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthPhaseImpedance#getConductorCount <em>Conductor Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conductor Count</em>' attribute is set.
     * @see #unsetConductorCount()
     * @see #getConductorCount()
     * @see #setConductorCount(Integer)
     * @generated
     */
    boolean isSetConductorCount();

    /**
     * Returns the value of the '<em><b>Phase Impedance Data</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseImpedanceData}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseImpedanceData#getPhaseImpedance <em>Phase Impedance</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Impedance Data</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Impedance Data</em>' reference list.
     * @see #isSetPhaseImpedanceData()
     * @see #unsetPhaseImpedanceData()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerLengthPhaseImpedance_PhaseImpedanceData()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseImpedanceData#getPhaseImpedance
     * @model opposite="PhaseImpedance" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PerLengthPhaseImpedance.PhaseImpedanceData' kind='element'"
     * @generated
     */
    EList< PhaseImpedanceData > getPhaseImpedanceData();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthPhaseImpedance#getPhaseImpedanceData <em>Phase Impedance Data</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseImpedanceData()
     * @see #getPhaseImpedanceData()
     * @generated
     */
    void unsetPhaseImpedanceData();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthPhaseImpedance#getPhaseImpedanceData <em>Phase Impedance Data</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Impedance Data</em>' reference list is set.
     * @see #unsetPhaseImpedanceData()
     * @see #getPhaseImpedanceData()
     * @generated
     */
    boolean isSetPhaseImpedanceData();

} // PerLengthPhaseImpedance
