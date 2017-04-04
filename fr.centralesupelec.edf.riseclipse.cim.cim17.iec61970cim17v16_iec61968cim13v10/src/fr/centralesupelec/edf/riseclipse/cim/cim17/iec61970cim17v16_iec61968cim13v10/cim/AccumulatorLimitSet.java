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
 * A representation of the model object '<em><b>Accumulator Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorLimitSet#getLimits <em>Limits</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorLimitSet#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccumulatorLimitSet()
 * @model
 * @generated
 */
public interface AccumulatorLimitSet extends LimitSet {
    /**
     * Returns the value of the '<em><b>Limits</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorLimit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorLimit#getLimitSet <em>Limit Set</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Limits</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Limits</em>' reference list.
     * @see #isSetLimits()
     * @see #unsetLimits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccumulatorLimitSet_Limits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorLimit#getLimitSet
     * @model opposite="LimitSet" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AccumulatorLimitSet.Limits' kind='element'"
     * @generated
     */
    EList< AccumulatorLimit > getLimits();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorLimitSet#getLimits <em>Limits</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLimits()
     * @see #getLimits()
     * @generated
     */
    void unsetLimits();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorLimitSet#getLimits <em>Limits</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Limits</em>' reference list is set.
     * @see #unsetLimits()
     * @see #getLimits()
     * @generated
     */
    boolean isSetLimits();

    /**
     * Returns the value of the '<em><b>Measurements</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Accumulator}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Accumulator#getLimitSets <em>Limit Sets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurements</em>' reference list.
     * @see #isSetMeasurements()
     * @see #unsetMeasurements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccumulatorLimitSet_Measurements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Accumulator#getLimitSets
     * @model opposite="LimitSets" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AccumulatorLimitSet.Measurements' kind='element'"
     * @generated
     */
    EList< Accumulator > getMeasurements();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorLimitSet#getMeasurements <em>Measurements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurements()
     * @see #getMeasurements()
     * @generated
     */
    void unsetMeasurements();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorLimitSet#getMeasurements <em>Measurements</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurements</em>' reference list is set.
     * @see #unsetMeasurements()
     * @see #getMeasurements()
     * @generated
     */
    boolean isSetMeasurements();

} // AccumulatorLimitSet
