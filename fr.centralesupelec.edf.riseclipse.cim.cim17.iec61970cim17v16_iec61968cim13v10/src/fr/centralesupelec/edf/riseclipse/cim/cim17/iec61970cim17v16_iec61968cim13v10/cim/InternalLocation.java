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
 * A representation of the model object '<em><b>Internal Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getBuildingNumber <em>Building Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getFloor <em>Floor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getRoomNumber <em>Room Number</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInternalLocation()
 * @model
 * @generated
 */
public interface InternalLocation extends WorkLocation {
    /**
     * Returns the value of the '<em><b>Building Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Building Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Building Name</em>' attribute.
     * @see #isSetBuildingName()
     * @see #unsetBuildingName()
     * @see #setBuildingName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInternalLocation_BuildingName()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='InternalLocation.buildingName' kind='element'"
     * @generated
     */
    String getBuildingName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getBuildingName <em>Building Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Building Name</em>' attribute.
     * @see #isSetBuildingName()
     * @see #unsetBuildingName()
     * @see #getBuildingName()
     * @generated
     */
    void setBuildingName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getBuildingName <em>Building Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBuildingName()
     * @see #getBuildingName()
     * @see #setBuildingName(String)
     * @generated
     */
    void unsetBuildingName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getBuildingName <em>Building Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Building Name</em>' attribute is set.
     * @see #unsetBuildingName()
     * @see #getBuildingName()
     * @see #setBuildingName(String)
     * @generated
     */
    boolean isSetBuildingName();

    /**
     * Returns the value of the '<em><b>Building Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Building Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Building Number</em>' attribute.
     * @see #isSetBuildingNumber()
     * @see #unsetBuildingNumber()
     * @see #setBuildingNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInternalLocation_BuildingNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='InternalLocation.buildingNumber' kind='element'"
     * @generated
     */
    String getBuildingNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getBuildingNumber <em>Building Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Building Number</em>' attribute.
     * @see #isSetBuildingNumber()
     * @see #unsetBuildingNumber()
     * @see #getBuildingNumber()
     * @generated
     */
    void setBuildingNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getBuildingNumber <em>Building Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBuildingNumber()
     * @see #getBuildingNumber()
     * @see #setBuildingNumber(String)
     * @generated
     */
    void unsetBuildingNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getBuildingNumber <em>Building Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Building Number</em>' attribute is set.
     * @see #unsetBuildingNumber()
     * @see #getBuildingNumber()
     * @see #setBuildingNumber(String)
     * @generated
     */
    boolean isSetBuildingNumber();

    /**
     * Returns the value of the '<em><b>Floor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Floor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Floor</em>' attribute.
     * @see #isSetFloor()
     * @see #unsetFloor()
     * @see #setFloor(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInternalLocation_Floor()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='InternalLocation.floor' kind='element'"
     * @generated
     */
    Integer getFloor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getFloor <em>Floor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Floor</em>' attribute.
     * @see #isSetFloor()
     * @see #unsetFloor()
     * @see #getFloor()
     * @generated
     */
    void setFloor( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getFloor <em>Floor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFloor()
     * @see #getFloor()
     * @see #setFloor(Integer)
     * @generated
     */
    void unsetFloor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getFloor <em>Floor</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Floor</em>' attribute is set.
     * @see #unsetFloor()
     * @see #getFloor()
     * @see #setFloor(Integer)
     * @generated
     */
    boolean isSetFloor();

    /**
     * Returns the value of the '<em><b>Room Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Room Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Room Number</em>' attribute.
     * @see #isSetRoomNumber()
     * @see #unsetRoomNumber()
     * @see #setRoomNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInternalLocation_RoomNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='InternalLocation.roomNumber' kind='element'"
     * @generated
     */
    String getRoomNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getRoomNumber <em>Room Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Room Number</em>' attribute.
     * @see #isSetRoomNumber()
     * @see #unsetRoomNumber()
     * @see #getRoomNumber()
     * @generated
     */
    void setRoomNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getRoomNumber <em>Room Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRoomNumber()
     * @see #getRoomNumber()
     * @see #setRoomNumber(String)
     * @generated
     */
    void unsetRoomNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation#getRoomNumber <em>Room Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Room Number</em>' attribute is set.
     * @see #unsetRoomNumber()
     * @see #getRoomNumber()
     * @see #setRoomNumber(String)
     * @generated
     */
    boolean isSetRoomNumber();

} // InternalLocation
