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
 * A representation of the model object '<em><b>DC Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTerminal#getDCConductingEquipment <em>DC Conducting Equipment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCTerminal()
 * @model
 * @generated
 */
public interface DCTerminal extends DCBaseTerminal {
    /**
     * Returns the value of the '<em><b>DC Conducting Equipment</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCConductingEquipment#getDCTerminals <em>DC Terminals</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DC Conducting Equipment</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DC Conducting Equipment</em>' reference.
     * @see #isSetDCConductingEquipment()
     * @see #unsetDCConductingEquipment()
     * @see #setDCConductingEquipment(DCConductingEquipment)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCTerminal_DCConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCConductingEquipment#getDCTerminals
     * @model opposite="DCTerminals" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DCTerminal.DCConductingEquipment' kind='element'"
     * @generated
     */
    DCConductingEquipment getDCConductingEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTerminal#getDCConductingEquipment <em>DC Conducting Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DC Conducting Equipment</em>' reference.
     * @see #isSetDCConductingEquipment()
     * @see #unsetDCConductingEquipment()
     * @see #getDCConductingEquipment()
     * @generated
     */
    void setDCConductingEquipment( DCConductingEquipment value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTerminal#getDCConductingEquipment <em>DC Conducting Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCConductingEquipment()
     * @see #getDCConductingEquipment()
     * @see #setDCConductingEquipment(DCConductingEquipment)
     * @generated
     */
    void unsetDCConductingEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTerminal#getDCConductingEquipment <em>DC Conducting Equipment</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Conducting Equipment</em>' reference is set.
     * @see #unsetDCConductingEquipment()
     * @see #getDCConductingEquipment()
     * @see #setDCConductingEquipment(DCConductingEquipment)
     * @generated
     */
    boolean isSetDCConductingEquipment();

} // DCTerminal
