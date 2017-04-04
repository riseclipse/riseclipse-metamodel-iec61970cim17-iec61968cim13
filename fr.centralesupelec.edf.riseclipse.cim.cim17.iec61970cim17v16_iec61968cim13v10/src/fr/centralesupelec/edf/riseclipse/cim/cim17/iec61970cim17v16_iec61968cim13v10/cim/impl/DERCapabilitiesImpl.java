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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERCapabilities;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupDispatch;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DER Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DERCapabilitiesImpl#getDERGroupDispatch <em>DER Group Dispatch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DERCapabilitiesImpl extends CimObjectWithIDImpl implements DERCapabilities {
    /**
     * The cached value of the '{@link #getDERGroupDispatch() <em>DER Group Dispatch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDERGroupDispatch()
     * @generated
     * @ordered
     */
    protected DERGroupDispatch derGroupDispatch;

    /**
     * This is true if the DER Group Dispatch reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean derGroupDispatchESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DERCapabilitiesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDERCapabilities();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DERGroupDispatch getDERGroupDispatch() {
        if( derGroupDispatch != null && derGroupDispatch.eIsProxy() ) {
            InternalEObject oldDERGroupDispatch = ( InternalEObject ) derGroupDispatch;
            derGroupDispatch = ( DERGroupDispatch ) eResolveProxy( oldDERGroupDispatch );
            if( derGroupDispatch != oldDERGroupDispatch ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.DER_CAPABILITIES__DER_GROUP_DISPATCH, oldDERGroupDispatch, derGroupDispatch ) );
            }
        }
        return derGroupDispatch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DERGroupDispatch basicGetDERGroupDispatch() {
        return derGroupDispatch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDERGroupDispatch( DERGroupDispatch newDERGroupDispatch, NotificationChain msgs ) {
        DERGroupDispatch oldDERGroupDispatch = derGroupDispatch;
        derGroupDispatch = newDERGroupDispatch;
        boolean oldDERGroupDispatchESet = derGroupDispatchESet;
        derGroupDispatchESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DER_CAPABILITIES__DER_GROUP_DISPATCH, oldDERGroupDispatch, newDERGroupDispatch,
                    !oldDERGroupDispatchESet );
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
    public void setDERGroupDispatch( DERGroupDispatch newDERGroupDispatch ) {
        if( newDERGroupDispatch != derGroupDispatch ) {
            NotificationChain msgs = null;
            if( derGroupDispatch != null ) msgs = ( ( InternalEObject ) derGroupDispatch ).eInverseRemove( this,
                    CimPackage.DER_GROUP_DISPATCH__DER_CAPABILITIES, DERGroupDispatch.class, msgs );
            if( newDERGroupDispatch != null ) msgs = ( ( InternalEObject ) newDERGroupDispatch ).eInverseAdd( this,
                    CimPackage.DER_GROUP_DISPATCH__DER_CAPABILITIES, DERGroupDispatch.class, msgs );
            msgs = basicSetDERGroupDispatch( newDERGroupDispatch, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDERGroupDispatchESet = derGroupDispatchESet;
            derGroupDispatchESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DER_CAPABILITIES__DER_GROUP_DISPATCH,
                        newDERGroupDispatch, newDERGroupDispatch, !oldDERGroupDispatchESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDERGroupDispatch( NotificationChain msgs ) {
        DERGroupDispatch oldDERGroupDispatch = derGroupDispatch;
        derGroupDispatch = null;
        boolean oldDERGroupDispatchESet = derGroupDispatchESet;
        derGroupDispatchESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DER_CAPABILITIES__DER_GROUP_DISPATCH, oldDERGroupDispatch, null,
                    oldDERGroupDispatchESet );
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
    public void unsetDERGroupDispatch() {
        if( derGroupDispatch != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) derGroupDispatch ).eInverseRemove( this,
                    CimPackage.DER_GROUP_DISPATCH__DER_CAPABILITIES, DERGroupDispatch.class, msgs );
            msgs = basicUnsetDERGroupDispatch( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDERGroupDispatchESet = derGroupDispatchESet;
            derGroupDispatchESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DER_CAPABILITIES__DER_GROUP_DISPATCH, null, null, oldDERGroupDispatchESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDERGroupDispatch() {
        return derGroupDispatchESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.DER_CAPABILITIES__DER_GROUP_DISPATCH:
            if( derGroupDispatch != null ) msgs = ( ( InternalEObject ) derGroupDispatch ).eInverseRemove( this,
                    CimPackage.DER_GROUP_DISPATCH__DER_CAPABILITIES, DERGroupDispatch.class, msgs );
            return basicSetDERGroupDispatch( ( DERGroupDispatch ) otherEnd, msgs );
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
        case CimPackage.DER_CAPABILITIES__DER_GROUP_DISPATCH:
            return basicUnsetDERGroupDispatch( msgs );
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
        case CimPackage.DER_CAPABILITIES__DER_GROUP_DISPATCH:
            if( resolve ) return getDERGroupDispatch();
            return basicGetDERGroupDispatch();
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
        case CimPackage.DER_CAPABILITIES__DER_GROUP_DISPATCH:
            setDERGroupDispatch( ( DERGroupDispatch ) newValue );
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
        case CimPackage.DER_CAPABILITIES__DER_GROUP_DISPATCH:
            unsetDERGroupDispatch();
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
        case CimPackage.DER_CAPABILITIES__DER_GROUP_DISPATCH:
            return isSetDERGroupDispatch();
        }
        return super.eIsSet( featureID );
    }

} //DERCapabilitiesImpl
