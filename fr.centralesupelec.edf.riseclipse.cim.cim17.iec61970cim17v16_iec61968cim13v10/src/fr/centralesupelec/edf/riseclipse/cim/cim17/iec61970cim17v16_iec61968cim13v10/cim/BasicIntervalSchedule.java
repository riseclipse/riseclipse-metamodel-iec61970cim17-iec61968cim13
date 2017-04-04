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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue1Multiplier <em>Value1 Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue2Multiplier <em>Value2 Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBasicIntervalSchedule()
 * @model
 * @generated
 */
public interface BasicIntervalSchedule extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Start Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Time</em>' attribute.
     * @see #isSetStartTime()
     * @see #unsetStartTime()
     * @see #setStartTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBasicIntervalSchedule_StartTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BasicIntervalSchedule.startTime' kind='element'"
     * @generated
     */
    Date getStartTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getStartTime <em>Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Time</em>' attribute.
     * @see #isSetStartTime()
     * @see #unsetStartTime()
     * @see #getStartTime()
     * @generated
     */
    void setStartTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getStartTime <em>Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartTime()
     * @see #getStartTime()
     * @see #setStartTime(Date)
     * @generated
     */
    void unsetStartTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getStartTime <em>Start Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Start Time</em>' attribute is set.
     * @see #unsetStartTime()
     * @see #getStartTime()
     * @see #setStartTime(Date)
     * @generated
     */
    boolean isSetStartTime();

    /**
     * Returns the value of the '<em><b>Value1 Multiplier</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value1 Multiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value1 Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetValue1Multiplier()
     * @see #unsetValue1Multiplier()
     * @see #setValue1Multiplier(UnitMultiplier)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBasicIntervalSchedule_Value1Multiplier()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BasicIntervalSchedule.value1Multiplier' kind='element'"
     * @generated
     */
    UnitMultiplier getValue1Multiplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue1Multiplier <em>Value1 Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value1 Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetValue1Multiplier()
     * @see #unsetValue1Multiplier()
     * @see #getValue1Multiplier()
     * @generated
     */
    void setValue1Multiplier( UnitMultiplier value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue1Multiplier <em>Value1 Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue1Multiplier()
     * @see #getValue1Multiplier()
     * @see #setValue1Multiplier(UnitMultiplier)
     * @generated
     */
    void unsetValue1Multiplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue1Multiplier <em>Value1 Multiplier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value1 Multiplier</em>' attribute is set.
     * @see #unsetValue1Multiplier()
     * @see #getValue1Multiplier()
     * @see #setValue1Multiplier(UnitMultiplier)
     * @generated
     */
    boolean isSetValue1Multiplier();

    /**
     * Returns the value of the '<em><b>Value1 Unit</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value1 Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value1 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol
     * @see #isSetValue1Unit()
     * @see #unsetValue1Unit()
     * @see #setValue1Unit(UnitSymbol)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBasicIntervalSchedule_Value1Unit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BasicIntervalSchedule.value1Unit' kind='element'"
     * @generated
     */
    UnitSymbol getValue1Unit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value1 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol
     * @see #isSetValue1Unit()
     * @see #unsetValue1Unit()
     * @see #getValue1Unit()
     * @generated
     */
    void setValue1Unit( UnitSymbol value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue1Unit()
     * @see #getValue1Unit()
     * @see #setValue1Unit(UnitSymbol)
     * @generated
     */
    void unsetValue1Unit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value1 Unit</em>' attribute is set.
     * @see #unsetValue1Unit()
     * @see #getValue1Unit()
     * @see #setValue1Unit(UnitSymbol)
     * @generated
     */
    boolean isSetValue1Unit();

    /**
     * Returns the value of the '<em><b>Value2 Multiplier</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value2 Multiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value2 Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetValue2Multiplier()
     * @see #unsetValue2Multiplier()
     * @see #setValue2Multiplier(UnitMultiplier)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBasicIntervalSchedule_Value2Multiplier()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BasicIntervalSchedule.value2Multiplier' kind='element'"
     * @generated
     */
    UnitMultiplier getValue2Multiplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue2Multiplier <em>Value2 Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value2 Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetValue2Multiplier()
     * @see #unsetValue2Multiplier()
     * @see #getValue2Multiplier()
     * @generated
     */
    void setValue2Multiplier( UnitMultiplier value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue2Multiplier <em>Value2 Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue2Multiplier()
     * @see #getValue2Multiplier()
     * @see #setValue2Multiplier(UnitMultiplier)
     * @generated
     */
    void unsetValue2Multiplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue2Multiplier <em>Value2 Multiplier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value2 Multiplier</em>' attribute is set.
     * @see #unsetValue2Multiplier()
     * @see #getValue2Multiplier()
     * @see #setValue2Multiplier(UnitMultiplier)
     * @generated
     */
    boolean isSetValue2Multiplier();

    /**
     * Returns the value of the '<em><b>Value2 Unit</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value2 Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value2 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol
     * @see #isSetValue2Unit()
     * @see #unsetValue2Unit()
     * @see #setValue2Unit(UnitSymbol)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBasicIntervalSchedule_Value2Unit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BasicIntervalSchedule.value2Unit' kind='element'"
     * @generated
     */
    UnitSymbol getValue2Unit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value2 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol
     * @see #isSetValue2Unit()
     * @see #unsetValue2Unit()
     * @see #getValue2Unit()
     * @generated
     */
    void setValue2Unit( UnitSymbol value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue2Unit()
     * @see #getValue2Unit()
     * @see #setValue2Unit(UnitSymbol)
     * @generated
     */
    void unsetValue2Unit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value2 Unit</em>' attribute is set.
     * @see #unsetValue2Unit()
     * @see #getValue2Unit()
     * @see #setValue2Unit(UnitSymbol)
     * @generated
     */
    boolean isSetValue2Unit();

} // BasicIntervalSchedule
