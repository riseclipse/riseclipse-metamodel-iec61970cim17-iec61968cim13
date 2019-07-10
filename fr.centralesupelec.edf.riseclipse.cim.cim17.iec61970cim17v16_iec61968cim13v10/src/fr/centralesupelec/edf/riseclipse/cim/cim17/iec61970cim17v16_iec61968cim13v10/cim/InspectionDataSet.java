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
 * A representation of the model object '<em><b>Inspection Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InspectionDataSet#getLocationCondition <em>Location Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InspectionDataSet#getAccordingToSchedules <em>According To Schedules</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInspectionDataSet()
 * @model
 * @generated
 */
public interface InspectionDataSet extends ProcedureDataSet {
    /**
     * Returns the value of the '<em><b>Location Condition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location Condition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location Condition</em>' attribute.
     * @see #isSetLocationCondition()
     * @see #unsetLocationCondition()
     * @see #setLocationCondition(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInspectionDataSet_LocationCondition()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='InspectionDataSet.locationCondition' kind='element'"
     * @generated
     */
    String getLocationCondition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InspectionDataSet#getLocationCondition <em>Location Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location Condition</em>' attribute.
     * @see #isSetLocationCondition()
     * @see #unsetLocationCondition()
     * @see #getLocationCondition()
     * @generated
     */
    void setLocationCondition( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InspectionDataSet#getLocationCondition <em>Location Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLocationCondition()
     * @see #getLocationCondition()
     * @see #setLocationCondition(String)
     * @generated
     */
    void unsetLocationCondition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InspectionDataSet#getLocationCondition <em>Location Condition</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Location Condition</em>' attribute is set.
     * @see #unsetLocationCondition()
     * @see #getLocationCondition()
     * @see #setLocationCondition(String)
     * @generated
     */
    boolean isSetLocationCondition();

    /**
     * Returns the value of the '<em><b>According To Schedules</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getInspectionDataSet <em>Inspection Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>According To Schedules</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>According To Schedules</em>' reference list.
     * @see #isSetAccordingToSchedules()
     * @see #unsetAccordingToSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInspectionDataSet_AccordingToSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getInspectionDataSet
     * @model opposite="InspectionDataSet" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='InspectionDataSet.AccordingToSchedules' kind='element'"
     * @generated
     */
    EList< ScheduledEventData > getAccordingToSchedules();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InspectionDataSet#getAccordingToSchedules <em>According To Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccordingToSchedules()
     * @see #getAccordingToSchedules()
     * @generated
     */
    void unsetAccordingToSchedules();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InspectionDataSet#getAccordingToSchedules <em>According To Schedules</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>According To Schedules</em>' reference list is set.
     * @see #unsetAccordingToSchedules()
     * @see #getAccordingToSchedules()
     * @generated
     */
    boolean isSetAccordingToSchedules();

} // InspectionDataSet
