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
 * A representation of the model object '<em><b>Time Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getOffset <em>Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getRecurrencePattern <em>Recurrence Pattern</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getRecurrencePeriod <em>Recurrence Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getScheduleInterval <em>Schedule Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getTimePoints <em>Time Points</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTimeSchedule()
 * @model
 * @generated
 */
public interface TimeSchedule extends Document {
    /**
     * Returns the value of the '<em><b>Disabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Disabled</em>' attribute.
     * @see #isSetDisabled()
     * @see #unsetDisabled()
     * @see #setDisabled(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTimeSchedule_Disabled()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TimeSchedule.disabled' kind='element'"
     * @generated
     */
    Boolean getDisabled();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getDisabled <em>Disabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disabled</em>' attribute.
     * @see #isSetDisabled()
     * @see #unsetDisabled()
     * @see #getDisabled()
     * @generated
     */
    void setDisabled( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getDisabled <em>Disabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDisabled()
     * @see #getDisabled()
     * @see #setDisabled(Boolean)
     * @generated
     */
    void unsetDisabled();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getDisabled <em>Disabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Disabled</em>' attribute is set.
     * @see #unsetDisabled()
     * @see #getDisabled()
     * @see #setDisabled(Boolean)
     * @generated
     */
    boolean isSetDisabled();

    /**
     * Returns the value of the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Offset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Offset</em>' attribute.
     * @see #isSetOffset()
     * @see #unsetOffset()
     * @see #setOffset(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTimeSchedule_Offset()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TimeSchedule.offset' kind='element'"
     * @generated
     */
    Float getOffset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getOffset <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset</em>' attribute.
     * @see #isSetOffset()
     * @see #unsetOffset()
     * @see #getOffset()
     * @generated
     */
    void setOffset( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getOffset <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOffset()
     * @see #getOffset()
     * @see #setOffset(Float)
     * @generated
     */
    void unsetOffset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getOffset <em>Offset</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Offset</em>' attribute is set.
     * @see #unsetOffset()
     * @see #getOffset()
     * @see #setOffset(Float)
     * @generated
     */
    boolean isSetOffset();

    /**
     * Returns the value of the '<em><b>Recurrence Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recurrence Pattern</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Recurrence Pattern</em>' attribute.
     * @see #isSetRecurrencePattern()
     * @see #unsetRecurrencePattern()
     * @see #setRecurrencePattern(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTimeSchedule_RecurrencePattern()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TimeSchedule.recurrencePattern' kind='element'"
     * @generated
     */
    String getRecurrencePattern();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getRecurrencePattern <em>Recurrence Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Recurrence Pattern</em>' attribute.
     * @see #isSetRecurrencePattern()
     * @see #unsetRecurrencePattern()
     * @see #getRecurrencePattern()
     * @generated
     */
    void setRecurrencePattern( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getRecurrencePattern <em>Recurrence Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRecurrencePattern()
     * @see #getRecurrencePattern()
     * @see #setRecurrencePattern(String)
     * @generated
     */
    void unsetRecurrencePattern();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getRecurrencePattern <em>Recurrence Pattern</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Recurrence Pattern</em>' attribute is set.
     * @see #unsetRecurrencePattern()
     * @see #getRecurrencePattern()
     * @see #setRecurrencePattern(String)
     * @generated
     */
    boolean isSetRecurrencePattern();

    /**
     * Returns the value of the '<em><b>Recurrence Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recurrence Period</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Recurrence Period</em>' attribute.
     * @see #isSetRecurrencePeriod()
     * @see #unsetRecurrencePeriod()
     * @see #setRecurrencePeriod(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTimeSchedule_RecurrencePeriod()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TimeSchedule.recurrencePeriod' kind='element'"
     * @generated
     */
    Float getRecurrencePeriod();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getRecurrencePeriod <em>Recurrence Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Recurrence Period</em>' attribute.
     * @see #isSetRecurrencePeriod()
     * @see #unsetRecurrencePeriod()
     * @see #getRecurrencePeriod()
     * @generated
     */
    void setRecurrencePeriod( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getRecurrencePeriod <em>Recurrence Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRecurrencePeriod()
     * @see #getRecurrencePeriod()
     * @see #setRecurrencePeriod(Float)
     * @generated
     */
    void unsetRecurrencePeriod();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getRecurrencePeriod <em>Recurrence Period</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Recurrence Period</em>' attribute is set.
     * @see #unsetRecurrencePeriod()
     * @see #getRecurrencePeriod()
     * @see #setRecurrencePeriod(Float)
     * @generated
     */
    boolean isSetRecurrencePeriod();

    /**
     * Returns the value of the '<em><b>Schedule Interval</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schedule Interval</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schedule Interval</em>' containment reference.
     * @see #isSetScheduleInterval()
     * @see #unsetScheduleInterval()
     * @see #setScheduleInterval(DateTimeInterval)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTimeSchedule_ScheduleInterval()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TimeSchedule.scheduleInterval' kind='element'"
     * @generated
     */
    DateTimeInterval getScheduleInterval();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getScheduleInterval <em>Schedule Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schedule Interval</em>' containment reference.
     * @see #isSetScheduleInterval()
     * @see #unsetScheduleInterval()
     * @see #getScheduleInterval()
     * @generated
     */
    void setScheduleInterval( DateTimeInterval value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getScheduleInterval <em>Schedule Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScheduleInterval()
     * @see #getScheduleInterval()
     * @see #setScheduleInterval(DateTimeInterval)
     * @generated
     */
    void unsetScheduleInterval();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getScheduleInterval <em>Schedule Interval</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Schedule Interval</em>' containment reference is set.
     * @see #unsetScheduleInterval()
     * @see #getScheduleInterval()
     * @see #setScheduleInterval(DateTimeInterval)
     * @generated
     */
    boolean isSetScheduleInterval();

    /**
     * Returns the value of the '<em><b>Time Points</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimePoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimePoint#getTimeSchedule <em>Time Schedule</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Points</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Points</em>' reference list.
     * @see #isSetTimePoints()
     * @see #unsetTimePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTimeSchedule_TimePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimePoint#getTimeSchedule
     * @model opposite="TimeSchedule" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TimeSchedule.TimePoints' kind='element'"
     * @generated
     */
    EList< TimePoint > getTimePoints();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getTimePoints <em>Time Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimePoints()
     * @see #getTimePoints()
     * @generated
     */
    void unsetTimePoints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule#getTimePoints <em>Time Points</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Points</em>' reference list is set.
     * @see #unsetTimePoints()
     * @see #getTimePoints()
     * @generated
     */
    boolean isSetTimePoints();

} // TimeSchedule
