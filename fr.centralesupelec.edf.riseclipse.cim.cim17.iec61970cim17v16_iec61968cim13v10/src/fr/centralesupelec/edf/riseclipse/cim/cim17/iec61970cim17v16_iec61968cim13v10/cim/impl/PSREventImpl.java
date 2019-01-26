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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PSREvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PSREventKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSR Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PSREventImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PSREventImpl#getPowerSystemResource <em>Power System Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSREventImpl extends ActivityRecordImpl implements PSREvent {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final PSREventKind KIND_EDEFAULT = PSREventKind.IN_SERVICE;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected PSREventKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemResource()
     * @generated
     * @ordered
     */
    protected PowerSystemResource powerSystemResource;

    /**
     * This is true if the Power System Resource reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerSystemResourceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PSREventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPSREvent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PSREventKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( PSREventKind newKind ) {
        PSREventKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSR_EVENT__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        PSREventKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSR_EVENT__KIND, oldKind, KIND_EDEFAULT, oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKind() {
        return kindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemResource getPowerSystemResource() {
        return powerSystemResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerSystemResource( PowerSystemResource newPowerSystemResource,
            NotificationChain msgs ) {
        PowerSystemResource oldPowerSystemResource = powerSystemResource;
        powerSystemResource = newPowerSystemResource;
        boolean oldPowerSystemResourceESet = powerSystemResourceESet;
        powerSystemResourceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PSR_EVENT__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, newPowerSystemResource,
                    !oldPowerSystemResourceESet );
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
    public void setPowerSystemResource( PowerSystemResource newPowerSystemResource ) {
        if( newPowerSystemResource != powerSystemResource ) {
            NotificationChain msgs = null;
            if( powerSystemResource != null ) msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__PSR_EVENTS, PowerSystemResource.class, msgs );
            if( newPowerSystemResource != null ) msgs = ( ( InternalEObject ) newPowerSystemResource )
                    .eInverseAdd( this, CimPackage.POWER_SYSTEM_RESOURCE__PSR_EVENTS, PowerSystemResource.class, msgs );
            msgs = basicSetPowerSystemResource( newPowerSystemResource, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemResourceESet = powerSystemResourceESet;
            powerSystemResourceESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSR_EVENT__POWER_SYSTEM_RESOURCE,
                        newPowerSystemResource, newPowerSystemResource, !oldPowerSystemResourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerSystemResource( NotificationChain msgs ) {
        PowerSystemResource oldPowerSystemResource = powerSystemResource;
        powerSystemResource = null;
        boolean oldPowerSystemResourceESet = powerSystemResourceESet;
        powerSystemResourceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PSR_EVENT__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, null,
                    oldPowerSystemResourceESet );
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
    public void unsetPowerSystemResource() {
        if( powerSystemResource != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__PSR_EVENTS, PowerSystemResource.class, msgs );
            msgs = basicUnsetPowerSystemResource( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemResourceESet = powerSystemResourceESet;
            powerSystemResourceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PSR_EVENT__POWER_SYSTEM_RESOURCE, null, null, oldPowerSystemResourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemResource() {
        return powerSystemResourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.PSR_EVENT__POWER_SYSTEM_RESOURCE:
            if( powerSystemResource != null ) msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__PSR_EVENTS, PowerSystemResource.class, msgs );
            return basicSetPowerSystemResource( ( PowerSystemResource ) otherEnd, msgs );
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
        case CimPackage.PSR_EVENT__POWER_SYSTEM_RESOURCE:
            return basicUnsetPowerSystemResource( msgs );
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
        case CimPackage.PSR_EVENT__KIND:
            return getKind();
        case CimPackage.PSR_EVENT__POWER_SYSTEM_RESOURCE:
            return getPowerSystemResource();
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
        case CimPackage.PSR_EVENT__KIND:
            setKind( ( PSREventKind ) newValue );
            return;
        case CimPackage.PSR_EVENT__POWER_SYSTEM_RESOURCE:
            setPowerSystemResource( ( PowerSystemResource ) newValue );
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
        case CimPackage.PSR_EVENT__KIND:
            unsetKind();
            return;
        case CimPackage.PSR_EVENT__POWER_SYSTEM_RESOURCE:
            unsetPowerSystemResource();
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
        case CimPackage.PSR_EVENT__KIND:
            return isSetKind();
        case CimPackage.PSR_EVENT__POWER_SYSTEM_RESOURCE:
            return isSetPowerSystemResource();
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
        result.append( " (kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PSREventImpl
