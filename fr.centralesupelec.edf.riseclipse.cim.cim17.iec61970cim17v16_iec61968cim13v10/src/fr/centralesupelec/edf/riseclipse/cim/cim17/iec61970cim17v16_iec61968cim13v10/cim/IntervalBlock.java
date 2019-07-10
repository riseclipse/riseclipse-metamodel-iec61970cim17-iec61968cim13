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
 * A representation of the model object '<em><b>Interval Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getMeterReading <em>Meter Reading</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getPendingCalculation <em>Pending Calculation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getIntervalReadings <em>Interval Readings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getReadingType <em>Reading Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIntervalBlock()
 * @model
 * @generated
 */
public interface IntervalBlock extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Meter Reading</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterReading#getIntervalBlocks <em>Interval Blocks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Meter Reading</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Meter Reading</em>' reference.
     * @see #isSetMeterReading()
     * @see #unsetMeterReading()
     * @see #setMeterReading(MeterReading)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIntervalBlock_MeterReading()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterReading#getIntervalBlocks
     * @model opposite="IntervalBlocks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IntervalBlock.MeterReading' kind='element'"
     * @generated
     */
    MeterReading getMeterReading();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getMeterReading <em>Meter Reading</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Meter Reading</em>' reference.
     * @see #isSetMeterReading()
     * @see #unsetMeterReading()
     * @see #getMeterReading()
     * @generated
     */
    void setMeterReading( MeterReading value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getMeterReading <em>Meter Reading</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeterReading()
     * @see #getMeterReading()
     * @see #setMeterReading(MeterReading)
     * @generated
     */
    void unsetMeterReading();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getMeterReading <em>Meter Reading</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Meter Reading</em>' reference is set.
     * @see #unsetMeterReading()
     * @see #getMeterReading()
     * @see #setMeterReading(MeterReading)
     * @generated
     */
    boolean isSetMeterReading();

    /**
     * Returns the value of the '<em><b>Pending Calculation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getIntervalBlocks <em>Interval Blocks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pending Calculation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pending Calculation</em>' reference.
     * @see #isSetPendingCalculation()
     * @see #unsetPendingCalculation()
     * @see #setPendingCalculation(PendingCalculation)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIntervalBlock_PendingCalculation()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation#getIntervalBlocks
     * @model opposite="IntervalBlocks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IntervalBlock.PendingCalculation' kind='element'"
     * @generated
     */
    PendingCalculation getPendingCalculation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getPendingCalculation <em>Pending Calculation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pending Calculation</em>' reference.
     * @see #isSetPendingCalculation()
     * @see #unsetPendingCalculation()
     * @see #getPendingCalculation()
     * @generated
     */
    void setPendingCalculation( PendingCalculation value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getPendingCalculation <em>Pending Calculation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPendingCalculation()
     * @see #getPendingCalculation()
     * @see #setPendingCalculation(PendingCalculation)
     * @generated
     */
    void unsetPendingCalculation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getPendingCalculation <em>Pending Calculation</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pending Calculation</em>' reference is set.
     * @see #unsetPendingCalculation()
     * @see #getPendingCalculation()
     * @see #setPendingCalculation(PendingCalculation)
     * @generated
     */
    boolean isSetPendingCalculation();

    /**
     * Returns the value of the '<em><b>Interval Readings</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalReading}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalReading#getIntervalBlocks <em>Interval Blocks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interval Readings</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interval Readings</em>' reference list.
     * @see #isSetIntervalReadings()
     * @see #unsetIntervalReadings()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIntervalBlock_IntervalReadings()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalReading#getIntervalBlocks
     * @model opposite="IntervalBlocks" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IntervalBlock.IntervalReadings' kind='element'"
     * @generated
     */
    EList< IntervalReading > getIntervalReadings();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getIntervalReadings <em>Interval Readings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIntervalReadings()
     * @see #getIntervalReadings()
     * @generated
     */
    void unsetIntervalReadings();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getIntervalReadings <em>Interval Readings</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Interval Readings</em>' reference list is set.
     * @see #unsetIntervalReadings()
     * @see #getIntervalReadings()
     * @generated
     */
    boolean isSetIntervalReadings();

    /**
     * Returns the value of the '<em><b>Reading Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingType#getIntervalBlocks <em>Interval Blocks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reading Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reading Type</em>' reference.
     * @see #isSetReadingType()
     * @see #unsetReadingType()
     * @see #setReadingType(ReadingType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIntervalBlock_ReadingType()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingType#getIntervalBlocks
     * @model opposite="IntervalBlocks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IntervalBlock.ReadingType' kind='element'"
     * @generated
     */
    ReadingType getReadingType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getReadingType <em>Reading Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reading Type</em>' reference.
     * @see #isSetReadingType()
     * @see #unsetReadingType()
     * @see #getReadingType()
     * @generated
     */
    void setReadingType( ReadingType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getReadingType <em>Reading Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReadingType()
     * @see #getReadingType()
     * @see #setReadingType(ReadingType)
     * @generated
     */
    void unsetReadingType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock#getReadingType <em>Reading Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reading Type</em>' reference is set.
     * @see #unsetReadingType()
     * @see #getReadingType()
     * @see #setReadingType(ReadingType)
     * @generated
     */
    boolean isSetReadingType();

} // IntervalBlock
