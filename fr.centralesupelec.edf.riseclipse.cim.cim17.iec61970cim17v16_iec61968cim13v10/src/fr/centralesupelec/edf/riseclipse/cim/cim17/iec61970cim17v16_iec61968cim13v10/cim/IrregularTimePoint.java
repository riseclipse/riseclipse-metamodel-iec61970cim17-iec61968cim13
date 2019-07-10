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
 * A representation of the model object '<em><b>Irregular Time Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getTime <em>Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getValue1 <em>Value1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getValue2 <em>Value2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIrregularTimePoint()
 * @model
 * @generated
 */
public interface IrregularTimePoint extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time</em>' attribute.
     * @see #isSetTime()
     * @see #unsetTime()
     * @see #setTime(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIrregularTimePoint_Time()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IrregularTimePoint.time' kind='element'"
     * @generated
     */
    Float getTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getTime <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time</em>' attribute.
     * @see #isSetTime()
     * @see #unsetTime()
     * @see #getTime()
     * @generated
     */
    void setTime( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getTime <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTime()
     * @see #getTime()
     * @see #setTime(Float)
     * @generated
     */
    void unsetTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getTime <em>Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time</em>' attribute is set.
     * @see #unsetTime()
     * @see #getTime()
     * @see #setTime(Float)
     * @generated
     */
    boolean isSetTime();

    /**
     * Returns the value of the '<em><b>Value1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value1</em>' attribute.
     * @see #isSetValue1()
     * @see #unsetValue1()
     * @see #setValue1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIrregularTimePoint_Value1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IrregularTimePoint.value1' kind='element'"
     * @generated
     */
    Float getValue1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getValue1 <em>Value1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value1</em>' attribute.
     * @see #isSetValue1()
     * @see #unsetValue1()
     * @see #getValue1()
     * @generated
     */
    void setValue1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getValue1 <em>Value1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue1()
     * @see #getValue1()
     * @see #setValue1(Float)
     * @generated
     */
    void unsetValue1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getValue1 <em>Value1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value1</em>' attribute is set.
     * @see #unsetValue1()
     * @see #getValue1()
     * @see #setValue1(Float)
     * @generated
     */
    boolean isSetValue1();

    /**
     * Returns the value of the '<em><b>Value2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value2</em>' attribute.
     * @see #isSetValue2()
     * @see #unsetValue2()
     * @see #setValue2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIrregularTimePoint_Value2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IrregularTimePoint.value2' kind='element'"
     * @generated
     */
    Float getValue2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getValue2 <em>Value2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value2</em>' attribute.
     * @see #isSetValue2()
     * @see #unsetValue2()
     * @see #getValue2()
     * @generated
     */
    void setValue2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getValue2 <em>Value2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue2()
     * @see #getValue2()
     * @see #setValue2(Float)
     * @generated
     */
    void unsetValue2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getValue2 <em>Value2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value2</em>' attribute is set.
     * @see #unsetValue2()
     * @see #getValue2()
     * @see #setValue2(Float)
     * @generated
     */
    boolean isSetValue2();

    /**
     * Returns the value of the '<em><b>Interval Schedule</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularIntervalSchedule#getTimePoints <em>Time Points</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interval Schedule</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interval Schedule</em>' reference.
     * @see #isSetIntervalSchedule()
     * @see #unsetIntervalSchedule()
     * @see #setIntervalSchedule(IrregularIntervalSchedule)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIrregularTimePoint_IntervalSchedule()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularIntervalSchedule#getTimePoints
     * @model opposite="TimePoints" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IrregularTimePoint.IntervalSchedule' kind='element'"
     * @generated
     */
    IrregularIntervalSchedule getIntervalSchedule();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interval Schedule</em>' reference.
     * @see #isSetIntervalSchedule()
     * @see #unsetIntervalSchedule()
     * @see #getIntervalSchedule()
     * @generated
     */
    void setIntervalSchedule( IrregularIntervalSchedule value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIntervalSchedule()
     * @see #getIntervalSchedule()
     * @see #setIntervalSchedule(IrregularIntervalSchedule)
     * @generated
     */
    void unsetIntervalSchedule();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Interval Schedule</em>' reference is set.
     * @see #unsetIntervalSchedule()
     * @see #getIntervalSchedule()
     * @see #setIntervalSchedule(IrregularIntervalSchedule)
     * @generated
     */
    boolean isSetIntervalSchedule();

} // IrregularTimePoint
