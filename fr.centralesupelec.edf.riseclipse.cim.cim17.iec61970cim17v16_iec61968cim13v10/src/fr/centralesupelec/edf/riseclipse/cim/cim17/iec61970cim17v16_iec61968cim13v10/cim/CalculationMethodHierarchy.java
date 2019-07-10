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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculation Method Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy#getMeasurementValue <em>Measurement Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy#getCalculationMethodOrder <em>Calculation Method Order</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy#getMeasurement <em>Measurement</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCalculationMethodHierarchy()
 * @model
 * @generated
 */
public interface CalculationMethodHierarchy extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Measurement Value</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValue#getCalculationMethodHierarchy <em>Calculation Method Hierarchy</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCalculationMethodHierarchy_MeasurementValue()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValue#getCalculationMethodHierarchy
     * @model opposite="CalculationMethodHierarchy" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CalculationMethodHierarchy.MeasurementValue' kind='element'"
     * @generated
     */
    MeasurementValue getMeasurementValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy#getMeasurementValue <em>Measurement Value</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy#getMeasurementValue <em>Measurement Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurementValue()
     * @see #getMeasurementValue()
     * @see #setMeasurementValue(MeasurementValue)
     * @generated
     */
    void unsetMeasurementValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy#getMeasurementValue <em>Measurement Value</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurement Value</em>' reference is set.
     * @see #unsetMeasurementValue()
     * @see #getMeasurementValue()
     * @see #setMeasurementValue(MeasurementValue)
     * @generated
     */
    boolean isSetMeasurementValue();

    /**
     * Returns the value of the '<em><b>Calculation Method Order</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getCalculationMethodHierarchy <em>Calculation Method Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Calculation Method Order</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Calculation Method Order</em>' reference list.
     * @see #isSetCalculationMethodOrder()
     * @see #unsetCalculationMethodOrder()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCalculationMethodHierarchy_CalculationMethodOrder()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder#getCalculationMethodHierarchy
     * @model opposite="CalculationMethodHierarchy" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CalculationMethodHierarchy.CalculationMethodOrder' kind='element'"
     * @generated
     */
    EList< CalculationMethodOrder > getCalculationMethodOrder();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy#getCalculationMethodOrder <em>Calculation Method Order</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCalculationMethodOrder()
     * @see #getCalculationMethodOrder()
     * @generated
     */
    void unsetCalculationMethodOrder();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy#getCalculationMethodOrder <em>Calculation Method Order</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Calculation Method Order</em>' reference list is set.
     * @see #unsetCalculationMethodOrder()
     * @see #getCalculationMethodOrder()
     * @generated
     */
    boolean isSetCalculationMethodOrder();

    /**
     * Returns the value of the '<em><b>Measurement</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement#getCalculationMethodHierarchy <em>Calculation Method Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurement</em>' reference list.
     * @see #isSetMeasurement()
     * @see #unsetMeasurement()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCalculationMethodHierarchy_Measurement()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement#getCalculationMethodHierarchy
     * @model opposite="CalculationMethodHierarchy" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CalculationMethodHierarchy.Measurement' kind='element'"
     * @generated
     */
    EList< Measurement > getMeasurement();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy#getMeasurement <em>Measurement</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurement()
     * @see #getMeasurement()
     * @generated
     */
    void unsetMeasurement();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy#getMeasurement <em>Measurement</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurement</em>' reference list is set.
     * @see #unsetMeasurement()
     * @see #getMeasurement()
     * @generated
     */
    boolean isSetMeasurement();

} // CalculationMethodHierarchy
