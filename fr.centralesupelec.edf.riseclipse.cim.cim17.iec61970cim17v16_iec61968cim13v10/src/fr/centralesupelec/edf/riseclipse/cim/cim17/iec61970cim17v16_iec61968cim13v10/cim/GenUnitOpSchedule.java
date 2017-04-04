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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Unit Op Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenUnitOpSchedule#getGeneratingUnit <em>Generating Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGenUnitOpSchedule()
 * @model
 * @generated
 */
public interface GenUnitOpSchedule extends RegularIntervalSchedule {
    /**
     * Returns the value of the '<em><b>Generating Unit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenUnitOpSchedule <em>Gen Unit Op Schedule</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Generating Unit</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generating Unit</em>' reference.
     * @see #isSetGeneratingUnit()
     * @see #unsetGeneratingUnit()
     * @see #setGeneratingUnit(GeneratingUnit)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGenUnitOpSchedule_GeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenUnitOpSchedule
     * @model opposite="GenUnitOpSchedule" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GenUnitOpSchedule.GeneratingUnit' kind='element'"
     * @generated
     */
    GeneratingUnit getGeneratingUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenUnitOpSchedule#getGeneratingUnit <em>Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generating Unit</em>' reference.
     * @see #isSetGeneratingUnit()
     * @see #unsetGeneratingUnit()
     * @see #getGeneratingUnit()
     * @generated
     */
    void setGeneratingUnit( GeneratingUnit value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenUnitOpSchedule#getGeneratingUnit <em>Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGeneratingUnit()
     * @see #getGeneratingUnit()
     * @see #setGeneratingUnit(GeneratingUnit)
     * @generated
     */
    void unsetGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenUnitOpSchedule#getGeneratingUnit <em>Generating Unit</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Generating Unit</em>' reference is set.
     * @see #unsetGeneratingUnit()
     * @see #getGeneratingUnit()
     * @see #setGeneratingUnit(GeneratingUnit)
     * @generated
     */
    boolean isSetGeneratingUnit();

} // GenUnitOpSchedule
