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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Status;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduled Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ScheduledEventImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ScheduledEventImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ScheduledEventImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ScheduledEventImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ScheduledEventImpl#getScheduledEventData <em>Scheduled Event Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduledEventImpl extends IdentifiedObjectImpl implements ScheduledEvent {
    /**
     * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected static final Float DURATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected Float duration = DURATION_EDEFAULT;

    /**
     * This is true if the Duration attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean durationESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected Status status;

    /**
     * This is true if the Status containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statusESet;

    /**
     * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssets()
     * @generated
     * @ordered
     */
    protected EList< Asset > assets;

    /**
     * The cached value of the '{@link #getScheduledEventData() <em>Scheduled Event Data</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScheduledEventData()
     * @generated
     * @ordered
     */
    protected ScheduledEventData scheduledEventData;

    /**
     * This is true if the Scheduled Event Data reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean scheduledEventDataESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScheduledEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getScheduledEvent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDuration() {
        return duration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDuration( Float newDuration ) {
        Float oldDuration = duration;
        duration = newDuration;
        boolean oldDurationESet = durationESet;
        durationESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SCHEDULED_EVENT__DURATION, oldDuration, duration, !oldDurationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDuration() {
        Float oldDuration = duration;
        boolean oldDurationESet = durationESet;
        duration = DURATION_EDEFAULT;
        durationESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SCHEDULED_EVENT__DURATION, oldDuration, DURATION_EDEFAULT, oldDurationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDuration() {
        return durationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SCHEDULED_EVENT__TYPE, oldType, type, !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SCHEDULED_EVENT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Status getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStatus( Status newStatus, NotificationChain msgs ) {
        Status oldStatus = status;
        status = newStatus;
        boolean oldStatusESet = statusESet;
        statusESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SCHEDULED_EVENT__STATUS, oldStatus, newStatus, !oldStatusESet );
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
    public void setStatus( Status newStatus ) {
        if( newStatus != status ) {
            NotificationChain msgs = null;
            if( status != null ) msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.SCHEDULED_EVENT__STATUS, null, msgs );
            if( newStatus != null ) msgs = ( ( InternalEObject ) newStatus ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.SCHEDULED_EVENT__STATUS, null, msgs );
            msgs = basicSetStatus( newStatus, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SCHEDULED_EVENT__STATUS, newStatus, newStatus, !oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStatus( NotificationChain msgs ) {
        Status oldStatus = status;
        status = null;
        boolean oldStatusESet = statusESet;
        statusESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SCHEDULED_EVENT__STATUS, oldStatus, null, oldStatusESet );
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
    public void unsetStatus() {
        if( status != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.SCHEDULED_EVENT__STATUS, null, msgs );
            msgs = basicUnsetStatus( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SCHEDULED_EVENT__STATUS, null, null, oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatus() {
        return statusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Asset > getAssets() {
        if( assets == null ) {
            assets = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Asset >( Asset.class, this,
                    CimPackage.SCHEDULED_EVENT__ASSETS, CimPackage.ASSET__SCHEDULED_EVENTS );
        }
        return assets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssets() {
        if( assets != null ) ( ( InternalEList.Unsettable< ? > ) assets ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssets() {
        return assets != null && ( ( InternalEList.Unsettable< ? > ) assets ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ScheduledEventData getScheduledEventData() {
        return scheduledEventData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetScheduledEventData( ScheduledEventData newScheduledEventData,
            NotificationChain msgs ) {
        ScheduledEventData oldScheduledEventData = scheduledEventData;
        scheduledEventData = newScheduledEventData;
        boolean oldScheduledEventDataESet = scheduledEventDataESet;
        scheduledEventDataESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SCHEDULED_EVENT__SCHEDULED_EVENT_DATA, oldScheduledEventData, newScheduledEventData,
                    !oldScheduledEventDataESet );
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
    public void setScheduledEventData( ScheduledEventData newScheduledEventData ) {
        if( newScheduledEventData != scheduledEventData ) {
            NotificationChain msgs = null;
            if( scheduledEventData != null ) msgs = ( ( InternalEObject ) scheduledEventData ).eInverseRemove( this,
                    CimPackage.SCHEDULED_EVENT_DATA__SCHEDULED_EVENTS, ScheduledEventData.class, msgs );
            if( newScheduledEventData != null ) msgs = ( ( InternalEObject ) newScheduledEventData ).eInverseAdd( this,
                    CimPackage.SCHEDULED_EVENT_DATA__SCHEDULED_EVENTS, ScheduledEventData.class, msgs );
            msgs = basicSetScheduledEventData( newScheduledEventData, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldScheduledEventDataESet = scheduledEventDataESet;
            scheduledEventDataESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.SCHEDULED_EVENT__SCHEDULED_EVENT_DATA,
                            newScheduledEventData, newScheduledEventData, !oldScheduledEventDataESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetScheduledEventData( NotificationChain msgs ) {
        ScheduledEventData oldScheduledEventData = scheduledEventData;
        scheduledEventData = null;
        boolean oldScheduledEventDataESet = scheduledEventDataESet;
        scheduledEventDataESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SCHEDULED_EVENT__SCHEDULED_EVENT_DATA, oldScheduledEventData, null,
                    oldScheduledEventDataESet );
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
    public void unsetScheduledEventData() {
        if( scheduledEventData != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) scheduledEventData ).eInverseRemove( this,
                    CimPackage.SCHEDULED_EVENT_DATA__SCHEDULED_EVENTS, ScheduledEventData.class, msgs );
            msgs = basicUnsetScheduledEventData( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldScheduledEventDataESet = scheduledEventDataESet;
            scheduledEventDataESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SCHEDULED_EVENT__SCHEDULED_EVENT_DATA, null, null, oldScheduledEventDataESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetScheduledEventData() {
        return scheduledEventDataESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SCHEDULED_EVENT__ASSETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAssets() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.SCHEDULED_EVENT__SCHEDULED_EVENT_DATA:
            if( scheduledEventData != null ) msgs = ( ( InternalEObject ) scheduledEventData ).eInverseRemove( this,
                    CimPackage.SCHEDULED_EVENT_DATA__SCHEDULED_EVENTS, ScheduledEventData.class, msgs );
            return basicSetScheduledEventData( ( ScheduledEventData ) otherEnd, msgs );
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
        case CimPackage.SCHEDULED_EVENT__STATUS:
            return basicUnsetStatus( msgs );
        case CimPackage.SCHEDULED_EVENT__ASSETS:
            return ( ( InternalEList< ? > ) getAssets() ).basicRemove( otherEnd, msgs );
        case CimPackage.SCHEDULED_EVENT__SCHEDULED_EVENT_DATA:
            return basicUnsetScheduledEventData( msgs );
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
        case CimPackage.SCHEDULED_EVENT__DURATION:
            return getDuration();
        case CimPackage.SCHEDULED_EVENT__TYPE:
            return getType();
        case CimPackage.SCHEDULED_EVENT__STATUS:
            return getStatus();
        case CimPackage.SCHEDULED_EVENT__ASSETS:
            return getAssets();
        case CimPackage.SCHEDULED_EVENT__SCHEDULED_EVENT_DATA:
            return getScheduledEventData();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.SCHEDULED_EVENT__DURATION:
            setDuration( ( Float ) newValue );
            return;
        case CimPackage.SCHEDULED_EVENT__TYPE:
            setType( ( String ) newValue );
            return;
        case CimPackage.SCHEDULED_EVENT__STATUS:
            setStatus( ( Status ) newValue );
            return;
        case CimPackage.SCHEDULED_EVENT__ASSETS:
            getAssets().clear();
            getAssets().addAll( ( Collection< ? extends Asset > ) newValue );
            return;
        case CimPackage.SCHEDULED_EVENT__SCHEDULED_EVENT_DATA:
            setScheduledEventData( ( ScheduledEventData ) newValue );
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
        case CimPackage.SCHEDULED_EVENT__DURATION:
            unsetDuration();
            return;
        case CimPackage.SCHEDULED_EVENT__TYPE:
            unsetType();
            return;
        case CimPackage.SCHEDULED_EVENT__STATUS:
            unsetStatus();
            return;
        case CimPackage.SCHEDULED_EVENT__ASSETS:
            unsetAssets();
            return;
        case CimPackage.SCHEDULED_EVENT__SCHEDULED_EVENT_DATA:
            unsetScheduledEventData();
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
        case CimPackage.SCHEDULED_EVENT__DURATION:
            return isSetDuration();
        case CimPackage.SCHEDULED_EVENT__TYPE:
            return isSetType();
        case CimPackage.SCHEDULED_EVENT__STATUS:
            return isSetStatus();
        case CimPackage.SCHEDULED_EVENT__ASSETS:
            return isSetAssets();
        case CimPackage.SCHEDULED_EVENT__SCHEDULED_EVENT_DATA:
            return isSetScheduledEventData();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (duration: " );
        if( durationESet )
            result.append( duration );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ScheduledEventImpl
