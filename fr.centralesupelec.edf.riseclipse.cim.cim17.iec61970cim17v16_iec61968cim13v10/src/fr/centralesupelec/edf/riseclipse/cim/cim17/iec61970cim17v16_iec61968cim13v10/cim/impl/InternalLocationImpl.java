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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InternalLocation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.InternalLocationImpl#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.InternalLocationImpl#getBuildingNumber <em>Building Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.InternalLocationImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.InternalLocationImpl#getRoomNumber <em>Room Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalLocationImpl extends WorkLocationImpl implements InternalLocation {
    /**
     * The default value of the '{@link #getBuildingName() <em>Building Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBuildingName()
     * @generated
     * @ordered
     */
    protected static final String BUILDING_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBuildingName() <em>Building Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBuildingName()
     * @generated
     * @ordered
     */
    protected String buildingName = BUILDING_NAME_EDEFAULT;

    /**
     * This is true if the Building Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean buildingNameESet;

    /**
     * The default value of the '{@link #getBuildingNumber() <em>Building Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBuildingNumber()
     * @generated
     * @ordered
     */
    protected static final String BUILDING_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBuildingNumber() <em>Building Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBuildingNumber()
     * @generated
     * @ordered
     */
    protected String buildingNumber = BUILDING_NUMBER_EDEFAULT;

    /**
     * This is true if the Building Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean buildingNumberESet;

    /**
     * The default value of the '{@link #getFloor() <em>Floor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFloor()
     * @generated
     * @ordered
     */
    protected static final Integer FLOOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFloor() <em>Floor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFloor()
     * @generated
     * @ordered
     */
    protected Integer floor = FLOOR_EDEFAULT;

    /**
     * This is true if the Floor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean floorESet;

    /**
     * The default value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoomNumber()
     * @generated
     * @ordered
     */
    protected static final String ROOM_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoomNumber()
     * @generated
     * @ordered
     */
    protected String roomNumber = ROOM_NUMBER_EDEFAULT;

    /**
     * This is true if the Room Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean roomNumberESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InternalLocationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getInternalLocation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBuildingName( String newBuildingName ) {
        String oldBuildingName = buildingName;
        buildingName = newBuildingName;
        boolean oldBuildingNameESet = buildingNameESet;
        buildingNameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.INTERNAL_LOCATION__BUILDING_NAME, oldBuildingName, buildingName, !oldBuildingNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBuildingName() {
        String oldBuildingName = buildingName;
        boolean oldBuildingNameESet = buildingNameESet;
        buildingName = BUILDING_NAME_EDEFAULT;
        buildingNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.INTERNAL_LOCATION__BUILDING_NAME,
                    oldBuildingName, BUILDING_NAME_EDEFAULT, oldBuildingNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBuildingName() {
        return buildingNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBuildingNumber( String newBuildingNumber ) {
        String oldBuildingNumber = buildingNumber;
        buildingNumber = newBuildingNumber;
        boolean oldBuildingNumberESet = buildingNumberESet;
        buildingNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.INTERNAL_LOCATION__BUILDING_NUMBER,
                    oldBuildingNumber, buildingNumber, !oldBuildingNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBuildingNumber() {
        String oldBuildingNumber = buildingNumber;
        boolean oldBuildingNumberESet = buildingNumberESet;
        buildingNumber = BUILDING_NUMBER_EDEFAULT;
        buildingNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.INTERNAL_LOCATION__BUILDING_NUMBER,
                    oldBuildingNumber, BUILDING_NUMBER_EDEFAULT, oldBuildingNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBuildingNumber() {
        return buildingNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getFloor() {
        return floor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFloor( Integer newFloor ) {
        Integer oldFloor = floor;
        floor = newFloor;
        boolean oldFloorESet = floorESet;
        floorESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.INTERNAL_LOCATION__FLOOR, oldFloor, floor, !oldFloorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFloor() {
        Integer oldFloor = floor;
        boolean oldFloorESet = floorESet;
        floor = FLOOR_EDEFAULT;
        floorESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.INTERNAL_LOCATION__FLOOR, oldFloor, FLOOR_EDEFAULT, oldFloorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFloor() {
        return floorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRoomNumber( String newRoomNumber ) {
        String oldRoomNumber = roomNumber;
        roomNumber = newRoomNumber;
        boolean oldRoomNumberESet = roomNumberESet;
        roomNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.INTERNAL_LOCATION__ROOM_NUMBER, oldRoomNumber, roomNumber, !oldRoomNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRoomNumber() {
        String oldRoomNumber = roomNumber;
        boolean oldRoomNumberESet = roomNumberESet;
        roomNumber = ROOM_NUMBER_EDEFAULT;
        roomNumberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.INTERNAL_LOCATION__ROOM_NUMBER, oldRoomNumber, ROOM_NUMBER_EDEFAULT, oldRoomNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRoomNumber() {
        return roomNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.INTERNAL_LOCATION__BUILDING_NAME:
            return getBuildingName();
        case CimPackage.INTERNAL_LOCATION__BUILDING_NUMBER:
            return getBuildingNumber();
        case CimPackage.INTERNAL_LOCATION__FLOOR:
            return getFloor();
        case CimPackage.INTERNAL_LOCATION__ROOM_NUMBER:
            return getRoomNumber();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.INTERNAL_LOCATION__BUILDING_NAME:
            setBuildingName( ( String ) newValue );
            return;
        case CimPackage.INTERNAL_LOCATION__BUILDING_NUMBER:
            setBuildingNumber( ( String ) newValue );
            return;
        case CimPackage.INTERNAL_LOCATION__FLOOR:
            setFloor( ( Integer ) newValue );
            return;
        case CimPackage.INTERNAL_LOCATION__ROOM_NUMBER:
            setRoomNumber( ( String ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.INTERNAL_LOCATION__BUILDING_NAME:
            unsetBuildingName();
            return;
        case CimPackage.INTERNAL_LOCATION__BUILDING_NUMBER:
            unsetBuildingNumber();
            return;
        case CimPackage.INTERNAL_LOCATION__FLOOR:
            unsetFloor();
            return;
        case CimPackage.INTERNAL_LOCATION__ROOM_NUMBER:
            unsetRoomNumber();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.INTERNAL_LOCATION__BUILDING_NAME:
            return isSetBuildingName();
        case CimPackage.INTERNAL_LOCATION__BUILDING_NUMBER:
            return isSetBuildingNumber();
        case CimPackage.INTERNAL_LOCATION__FLOOR:
            return isSetFloor();
        case CimPackage.INTERNAL_LOCATION__ROOM_NUMBER:
            return isSetRoomNumber();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (buildingName: " );
        if( buildingNameESet )
            result.append( buildingName );
        else
            result.append( "<unset>" );
        result.append( ", buildingNumber: " );
        if( buildingNumberESet )
            result.append( buildingNumber );
        else
            result.append( "<unset>" );
        result.append( ", floor: " );
        if( floorESet )
            result.append( floor );
        else
            result.append( "<unset>" );
        result.append( ", roomNumber: " );
        if( roomNumberESet )
            result.append( roomNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //InternalLocationImpl
