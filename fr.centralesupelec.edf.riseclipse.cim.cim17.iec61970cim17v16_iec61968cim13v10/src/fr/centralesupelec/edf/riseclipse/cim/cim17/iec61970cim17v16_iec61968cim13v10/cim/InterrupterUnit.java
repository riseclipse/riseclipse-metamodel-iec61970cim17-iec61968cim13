/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interrupter Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InterrupterUnit#getOperatingMechanism <em>Operating Mechanism</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInterrupterUnit()
 * @model
 * @generated
 */
public interface InterrupterUnit extends Asset {
    /**
     * Returns the value of the '<em><b>Operating Mechanism</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanism#getInterrupterUnit <em>Interrupter Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operating Mechanism</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operating Mechanism</em>' reference.
     * @see #isSetOperatingMechanism()
     * @see #unsetOperatingMechanism()
     * @see #setOperatingMechanism(OperatingMechanism)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInterrupterUnit_OperatingMechanism()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingMechanism#getInterrupterUnit
     * @model opposite="InterrupterUnit" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='InterrupterUnit.OperatingMechanism' kind='element'"
     * @generated
     */
    OperatingMechanism getOperatingMechanism();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InterrupterUnit#getOperatingMechanism <em>Operating Mechanism</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operating Mechanism</em>' reference.
     * @see #isSetOperatingMechanism()
     * @see #unsetOperatingMechanism()
     * @see #getOperatingMechanism()
     * @generated
     */
    void setOperatingMechanism( OperatingMechanism value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InterrupterUnit#getOperatingMechanism <em>Operating Mechanism</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperatingMechanism()
     * @see #getOperatingMechanism()
     * @see #setOperatingMechanism(OperatingMechanism)
     * @generated
     */
    void unsetOperatingMechanism();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InterrupterUnit#getOperatingMechanism <em>Operating Mechanism</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operating Mechanism</em>' reference is set.
     * @see #unsetOperatingMechanism()
     * @see #getOperatingMechanism()
     * @see #setOperatingMechanism(OperatingMechanism)
     * @generated
     */
    boolean isSetOperatingMechanism();

} // InterrupterUnit
