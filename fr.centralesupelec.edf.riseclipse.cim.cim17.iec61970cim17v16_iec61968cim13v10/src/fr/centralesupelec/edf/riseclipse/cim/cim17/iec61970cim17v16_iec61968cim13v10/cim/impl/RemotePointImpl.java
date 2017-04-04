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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemotePoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemotePointImpl#getRemoteUnit <em>Remote Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemotePointImpl extends IdentifiedObjectImpl implements RemotePoint {
    /**
     * The cached value of the '{@link #getRemoteUnit() <em>Remote Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteUnit()
     * @generated
     * @ordered
     */
    protected RemoteUnit remoteUnit;

    /**
     * This is true if the Remote Unit reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean remoteUnitESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RemotePointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRemotePoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemoteUnit getRemoteUnit() {
        return remoteUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRemoteUnit( RemoteUnit newRemoteUnit, NotificationChain msgs ) {
        RemoteUnit oldRemoteUnit = remoteUnit;
        remoteUnit = newRemoteUnit;
        boolean oldRemoteUnitESet = remoteUnitESet;
        remoteUnitESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_POINT__REMOTE_UNIT, oldRemoteUnit, newRemoteUnit, !oldRemoteUnitESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRemoteUnit( RemoteUnit newRemoteUnit ) {
        if( newRemoteUnit != remoteUnit ) {
            NotificationChain msgs = null;
            if( remoteUnit != null ) msgs = ( ( InternalEObject ) remoteUnit ).eInverseRemove( this,
                    CimPackage.REMOTE_UNIT__REMOTE_POINTS, RemoteUnit.class, msgs );
            if( newRemoteUnit != null ) msgs = ( ( InternalEObject ) newRemoteUnit ).eInverseAdd( this,
                    CimPackage.REMOTE_UNIT__REMOTE_POINTS, RemoteUnit.class, msgs );
            msgs = basicSetRemoteUnit( newRemoteUnit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRemoteUnitESet = remoteUnitESet;
            remoteUnitESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_POINT__REMOTE_UNIT, newRemoteUnit, newRemoteUnit, !oldRemoteUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRemoteUnit( NotificationChain msgs ) {
        RemoteUnit oldRemoteUnit = remoteUnit;
        remoteUnit = null;
        boolean oldRemoteUnitESet = remoteUnitESet;
        remoteUnitESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_POINT__REMOTE_UNIT, oldRemoteUnit, null, oldRemoteUnitESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemoteUnit() {
        if( remoteUnit != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) remoteUnit ).eInverseRemove( this, CimPackage.REMOTE_UNIT__REMOTE_POINTS,
                    RemoteUnit.class, msgs );
            msgs = basicUnsetRemoteUnit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRemoteUnitESet = remoteUnitESet;
            remoteUnitESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_POINT__REMOTE_UNIT, null, null, oldRemoteUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemoteUnit() {
        return remoteUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.REMOTE_POINT__REMOTE_UNIT:
            if( remoteUnit != null ) msgs = ( ( InternalEObject ) remoteUnit ).eInverseRemove( this,
                    CimPackage.REMOTE_UNIT__REMOTE_POINTS, RemoteUnit.class, msgs );
            return basicSetRemoteUnit( ( RemoteUnit ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.REMOTE_POINT__REMOTE_UNIT:
            return basicUnsetRemoteUnit( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.REMOTE_POINT__REMOTE_UNIT:
            return getRemoteUnit();
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
        case CimPackage.REMOTE_POINT__REMOTE_UNIT:
            setRemoteUnit( ( RemoteUnit ) newValue );
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
        case CimPackage.REMOTE_POINT__REMOTE_UNIT:
            unsetRemoteUnit();
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
        case CimPackage.REMOTE_POINT__REMOTE_UNIT:
            return isSetRemoteUnit();
        }
        return super.eIsSet( featureID );
    }

} //RemotePointImpl
