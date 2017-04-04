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
 * A representation of the model object '<em><b>Measurement Value Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMeasurementValueQuality()
 * @model
 * @generated
 */
public interface MeasurementValueQuality extends Quality61850 {
    /**
     * Returns the value of the '<em><b>Measurement Value</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurement Value</em>' reference.
     * @see #isSetMeasurementValue()
     * @see #unsetMeasurementValue()
     * @see #setMeasurementValue(MeasurementValue)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMeasurementValueQuality_MeasurementValue()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValue#getMeasurementValueQuality
     * @model opposite="MeasurementValueQuality" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MeasurementValueQuality.MeasurementValue' kind='element'"
     * @generated
     */
    MeasurementValue getMeasurementValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measurement Value</em>' reference.
     * @see #isSetMeasurementValue()
     * @see #unsetMeasurementValue()
     * @see #getMeasurementValue()
     * @generated
     */
    void setMeasurementValue( MeasurementValue value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurementValue()
     * @see #getMeasurementValue()
     * @see #setMeasurementValue(MeasurementValue)
     * @generated
     */
    void unsetMeasurementValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurement Value</em>' reference is set.
     * @see #unsetMeasurementValue()
     * @see #getMeasurementValue()
     * @see #setMeasurementValue(MeasurementValue)
     * @generated
     */
    boolean isSetMeasurementValue();

} // MeasurementValueQuality
