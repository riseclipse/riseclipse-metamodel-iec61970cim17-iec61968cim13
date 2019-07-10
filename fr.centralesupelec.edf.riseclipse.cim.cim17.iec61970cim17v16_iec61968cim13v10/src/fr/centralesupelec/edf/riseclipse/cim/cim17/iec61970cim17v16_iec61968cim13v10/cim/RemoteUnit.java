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
 * A representation of the model object '<em><b>Remote Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit#getRemoteUnitType <em>Remote Unit Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit#getCommunicationLinks <em>Communication Links</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit#getRemotePoints <em>Remote Points</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteUnit()
 * @model
 * @generated
 */
public interface RemoteUnit extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Remote Unit Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnitType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Unit Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Unit Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnitType
     * @see #isSetRemoteUnitType()
     * @see #unsetRemoteUnitType()
     * @see #setRemoteUnitType(RemoteUnitType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteUnit_RemoteUnitType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteUnit.remoteUnitType' kind='element'"
     * @generated
     */
    RemoteUnitType getRemoteUnitType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit#getRemoteUnitType <em>Remote Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Unit Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnitType
     * @see #isSetRemoteUnitType()
     * @see #unsetRemoteUnitType()
     * @see #getRemoteUnitType()
     * @generated
     */
    void setRemoteUnitType( RemoteUnitType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit#getRemoteUnitType <em>Remote Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemoteUnitType()
     * @see #getRemoteUnitType()
     * @see #setRemoteUnitType(RemoteUnitType)
     * @generated
     */
    void unsetRemoteUnitType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit#getRemoteUnitType <em>Remote Unit Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remote Unit Type</em>' attribute is set.
     * @see #unsetRemoteUnitType()
     * @see #getRemoteUnitType()
     * @see #setRemoteUnitType(RemoteUnitType)
     * @generated
     */
    boolean isSetRemoteUnitType();

    /**
     * Returns the value of the '<em><b>Communication Links</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink#getRemoteUnits <em>Remote Units</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Communication Links</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Communication Links</em>' reference list.
     * @see #isSetCommunicationLinks()
     * @see #unsetCommunicationLinks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteUnit_CommunicationLinks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink#getRemoteUnits
     * @model opposite="RemoteUnits" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteUnit.CommunicationLinks' kind='element'"
     * @generated
     */
    EList< CommunicationLink > getCommunicationLinks();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit#getCommunicationLinks <em>Communication Links</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCommunicationLinks()
     * @see #getCommunicationLinks()
     * @generated
     */
    void unsetCommunicationLinks();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit#getCommunicationLinks <em>Communication Links</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Communication Links</em>' reference list is set.
     * @see #unsetCommunicationLinks()
     * @see #getCommunicationLinks()
     * @generated
     */
    boolean isSetCommunicationLinks();

    /**
     * Returns the value of the '<em><b>Remote Points</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemotePoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemotePoint#getRemoteUnit <em>Remote Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Points</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Points</em>' reference list.
     * @see #isSetRemotePoints()
     * @see #unsetRemotePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteUnit_RemotePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemotePoint#getRemoteUnit
     * @model opposite="RemoteUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteUnit.RemotePoints' kind='element'"
     * @generated
     */
    EList< RemotePoint > getRemotePoints();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit#getRemotePoints <em>Remote Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemotePoints()
     * @see #getRemotePoints()
     * @generated
     */
    void unsetRemotePoints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit#getRemotePoints <em>Remote Points</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remote Points</em>' reference list is set.
     * @see #unsetRemotePoints()
     * @see #getRemotePoints()
     * @generated
     */
    boolean isSetRemotePoints();

} // RemoteUnit
