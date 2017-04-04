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
 * A representation of the model object '<em><b>DC Shunt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCShunt#getCapacitance <em>Capacitance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCShunt#getResistance <em>Resistance</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCShunt()
 * @model
 * @generated
 */
public interface DCShunt extends DCConductingEquipment {
    /**
     * Returns the value of the '<em><b>Capacitance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capacitance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capacitance</em>' attribute.
     * @see #isSetCapacitance()
     * @see #unsetCapacitance()
     * @see #setCapacitance(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCShunt_Capacitance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DCShunt.capacitance' kind='element'"
     * @generated
     */
    Float getCapacitance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCShunt#getCapacitance <em>Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capacitance</em>' attribute.
     * @see #isSetCapacitance()
     * @see #unsetCapacitance()
     * @see #getCapacitance()
     * @generated
     */
    void setCapacitance( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCShunt#getCapacitance <em>Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCapacitance()
     * @see #getCapacitance()
     * @see #setCapacitance(Float)
     * @generated
     */
    void unsetCapacitance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCShunt#getCapacitance <em>Capacitance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Capacitance</em>' attribute is set.
     * @see #unsetCapacitance()
     * @see #getCapacitance()
     * @see #setCapacitance(Float)
     * @generated
     */
    boolean isSetCapacitance();

    /**
     * Returns the value of the '<em><b>Resistance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resistance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resistance</em>' attribute.
     * @see #isSetResistance()
     * @see #unsetResistance()
     * @see #setResistance(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCShunt_Resistance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DCShunt.resistance' kind='element'"
     * @generated
     */
    Float getResistance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCShunt#getResistance <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resistance</em>' attribute.
     * @see #isSetResistance()
     * @see #unsetResistance()
     * @see #getResistance()
     * @generated
     */
    void setResistance( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCShunt#getResistance <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetResistance()
     * @see #getResistance()
     * @see #setResistance(Float)
     * @generated
     */
    void unsetResistance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCShunt#getResistance <em>Resistance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Resistance</em>' attribute is set.
     * @see #unsetResistance()
     * @see #getResistance()
     * @see #setResistance(Float)
     * @generated
     */
    boolean isSetResistance();

} // DCShunt
