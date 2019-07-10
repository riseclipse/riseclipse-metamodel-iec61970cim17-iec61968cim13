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
 * A representation of the model object '<em><b>Operational Updated Rating</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalUpdatedRating#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalUpdatedRating#getPlannedOutage <em>Planned Outage</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperationalUpdatedRating()
 * @model
 * @generated
 */
public interface OperationalUpdatedRating extends OperationalRestriction {
    /**
     * Returns the value of the '<em><b>Change Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Change Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Change Type</em>' attribute.
     * @see #isSetChangeType()
     * @see #unsetChangeType()
     * @see #setChangeType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperationalUpdatedRating_ChangeType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperationalUpdatedRating.changeType' kind='element'"
     * @generated
     */
    String getChangeType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalUpdatedRating#getChangeType <em>Change Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Change Type</em>' attribute.
     * @see #isSetChangeType()
     * @see #unsetChangeType()
     * @see #getChangeType()
     * @generated
     */
    void setChangeType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalUpdatedRating#getChangeType <em>Change Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChangeType()
     * @see #getChangeType()
     * @see #setChangeType(String)
     * @generated
     */
    void unsetChangeType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalUpdatedRating#getChangeType <em>Change Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Change Type</em>' attribute is set.
     * @see #unsetChangeType()
     * @see #getChangeType()
     * @see #setChangeType(String)
     * @generated
     */
    boolean isSetChangeType();

    /**
     * Returns the value of the '<em><b>Planned Outage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getUpdatedRatings <em>Updated Ratings</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Planned Outage</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Planned Outage</em>' reference.
     * @see #isSetPlannedOutage()
     * @see #unsetPlannedOutage()
     * @see #setPlannedOutage(Outage)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperationalUpdatedRating_PlannedOutage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getUpdatedRatings
     * @model opposite="UpdatedRatings" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperationalUpdatedRating.PlannedOutage' kind='element'"
     * @generated
     */
    Outage getPlannedOutage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalUpdatedRating#getPlannedOutage <em>Planned Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Planned Outage</em>' reference.
     * @see #isSetPlannedOutage()
     * @see #unsetPlannedOutage()
     * @see #getPlannedOutage()
     * @generated
     */
    void setPlannedOutage( Outage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalUpdatedRating#getPlannedOutage <em>Planned Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlannedOutage()
     * @see #getPlannedOutage()
     * @see #setPlannedOutage(Outage)
     * @generated
     */
    void unsetPlannedOutage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalUpdatedRating#getPlannedOutage <em>Planned Outage</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Planned Outage</em>' reference is set.
     * @see #unsetPlannedOutage()
     * @see #getPlannedOutage()
     * @see #setPlannedOutage(Outage)
     * @generated
     */
    boolean isSetPlannedOutage();

} // OperationalUpdatedRating
