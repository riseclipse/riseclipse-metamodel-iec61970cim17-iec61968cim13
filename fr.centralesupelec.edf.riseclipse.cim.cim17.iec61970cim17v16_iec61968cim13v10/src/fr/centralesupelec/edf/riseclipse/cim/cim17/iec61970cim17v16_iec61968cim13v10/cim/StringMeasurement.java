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
 * A representation of the model object '<em><b>String Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StringMeasurement#getStringMeasurementValues <em>String Measurement Values</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStringMeasurement()
 * @model
 * @generated
 */
public interface StringMeasurement extends Measurement {
    /**
     * Returns the value of the '<em><b>String Measurement Values</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StringMeasurementValue}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StringMeasurementValue#getStringMeasurement <em>String Measurement</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>String Measurement Values</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>String Measurement Values</em>' reference list.
     * @see #isSetStringMeasurementValues()
     * @see #unsetStringMeasurementValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStringMeasurement_StringMeasurementValues()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StringMeasurementValue#getStringMeasurement
     * @model opposite="StringMeasurement" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StringMeasurement.StringMeasurementValues' kind='element'"
     * @generated
     */
    EList< StringMeasurementValue > getStringMeasurementValues();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StringMeasurement#getStringMeasurementValues <em>String Measurement Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStringMeasurementValues()
     * @see #getStringMeasurementValues()
     * @generated
     */
    void unsetStringMeasurementValues();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StringMeasurement#getStringMeasurementValues <em>String Measurement Values</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>String Measurement Values</em>' reference list is set.
     * @see #unsetStringMeasurementValues()
     * @see #getStringMeasurementValues()
     * @generated
     */
    boolean isSetStringMeasurementValues();

} // StringMeasurement
