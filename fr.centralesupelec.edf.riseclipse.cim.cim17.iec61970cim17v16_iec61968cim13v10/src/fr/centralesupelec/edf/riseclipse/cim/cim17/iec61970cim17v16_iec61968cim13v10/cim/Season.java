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
 * A representation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Season#getEndDate <em>End Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Season#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSeason()
 * @model
 * @generated
 */
public interface Season extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>End Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Date</em>' attribute.
     * @see #isSetEndDate()
     * @see #unsetEndDate()
     * @see #setEndDate(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSeason_EndDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Season.endDate' kind='element'"
     * @generated
     */
    String getEndDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Season#getEndDate <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Date</em>' attribute.
     * @see #isSetEndDate()
     * @see #unsetEndDate()
     * @see #getEndDate()
     * @generated
     */
    void setEndDate( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Season#getEndDate <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDate()
     * @see #getEndDate()
     * @see #setEndDate(String)
     * @generated
     */
    void unsetEndDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Season#getEndDate <em>End Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Date</em>' attribute is set.
     * @see #unsetEndDate()
     * @see #getEndDate()
     * @see #setEndDate(String)
     * @generated
     */
    boolean isSetEndDate();

    /**
     * Returns the value of the '<em><b>Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Date</em>' attribute.
     * @see #isSetStartDate()
     * @see #unsetStartDate()
     * @see #setStartDate(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSeason_StartDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Season.startDate' kind='element'"
     * @generated
     */
    String getStartDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Season#getStartDate <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Date</em>' attribute.
     * @see #isSetStartDate()
     * @see #unsetStartDate()
     * @see #getStartDate()
     * @generated
     */
    void setStartDate( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Season#getStartDate <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartDate()
     * @see #getStartDate()
     * @see #setStartDate(String)
     * @generated
     */
    void unsetStartDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Season#getStartDate <em>Start Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Start Date</em>' attribute is set.
     * @see #unsetStartDate()
     * @see #getStartDate()
     * @see #setStartDate(String)
     * @generated
     */
    boolean isSetStartDate();

    /**
     * Returns the value of the '<em><b>Season Day Type Schedules</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SeasonDayTypeSchedule}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SeasonDayTypeSchedule#getSeason <em>Season</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Season Day Type Schedules</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Season Day Type Schedules</em>' reference list.
     * @see #isSetSeasonDayTypeSchedules()
     * @see #unsetSeasonDayTypeSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSeason_SeasonDayTypeSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SeasonDayTypeSchedule#getSeason
     * @model opposite="Season" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Season.SeasonDayTypeSchedules' kind='element'"
     * @generated
     */
    EList< SeasonDayTypeSchedule > getSeasonDayTypeSchedules();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSeasonDayTypeSchedules()
     * @see #getSeasonDayTypeSchedules()
     * @generated
     */
    void unsetSeasonDayTypeSchedules();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Season Day Type Schedules</em>' reference list is set.
     * @see #unsetSeasonDayTypeSchedules()
     * @see #getSeasonDayTypeSchedules()
     * @generated
     */
    boolean isSetSeasonDayTypeSchedules();

} // Season
