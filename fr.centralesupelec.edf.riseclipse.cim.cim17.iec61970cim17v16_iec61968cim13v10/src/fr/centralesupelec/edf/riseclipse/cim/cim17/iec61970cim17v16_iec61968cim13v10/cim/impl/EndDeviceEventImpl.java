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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEventDetail;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEventType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterReading;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint;

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
 * An implementation of the model object '<em><b>End Device Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventImpl#getIssuerID <em>Issuer ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventImpl#getIssuerTrackingID <em>Issuer Tracking ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventImpl#getEndDevice <em>End Device</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventImpl#getEndDeviceEventType <em>End Device Event Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventImpl#getEndDeviceEventDetails <em>End Device Event Details</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventImpl#getMeterReading <em>Meter Reading</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventImpl#getUsagePoint <em>Usage Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceEventImpl extends ActivityRecordImpl implements EndDeviceEvent {
    /**
     * The default value of the '{@link #getIssuerID() <em>Issuer ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuerID()
     * @generated
     * @ordered
     */
    protected static final String ISSUER_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIssuerID() <em>Issuer ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuerID()
     * @generated
     * @ordered
     */
    protected String issuerID = ISSUER_ID_EDEFAULT;

    /**
     * This is true if the Issuer ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean issuerIDESet;

    /**
     * The default value of the '{@link #getIssuerTrackingID() <em>Issuer Tracking ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuerTrackingID()
     * @generated
     * @ordered
     */
    protected static final String ISSUER_TRACKING_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIssuerTrackingID() <em>Issuer Tracking ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuerTrackingID()
     * @generated
     * @ordered
     */
    protected String issuerTrackingID = ISSUER_TRACKING_ID_EDEFAULT;

    /**
     * This is true if the Issuer Tracking ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean issuerTrackingIDESet;

    /**
     * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserID()
     * @generated
     * @ordered
     */
    protected static final String USER_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserID()
     * @generated
     * @ordered
     */
    protected String userID = USER_ID_EDEFAULT;

    /**
     * This is true if the User ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean userIDESet;

    /**
     * The cached value of the '{@link #getEndDevice() <em>End Device</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDevice()
     * @generated
     * @ordered
     */
    protected EndDevice endDevice;

    /**
     * This is true if the End Device reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endDeviceESet;

    /**
     * The cached value of the '{@link #getEndDeviceEventType() <em>End Device Event Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceEventType()
     * @generated
     * @ordered
     */
    protected EndDeviceEventType endDeviceEventType;

    /**
     * This is true if the End Device Event Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endDeviceEventTypeESet;

    /**
     * The cached value of the '{@link #getEndDeviceEventDetails() <em>End Device Event Details</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceEventDetails()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceEventDetail > endDeviceEventDetails;

    /**
     * The cached value of the '{@link #getMeterReading() <em>Meter Reading</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeterReading()
     * @generated
     * @ordered
     */
    protected MeterReading meterReading;

    /**
     * This is true if the Meter Reading reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean meterReadingESet;

    /**
     * The cached value of the '{@link #getUsagePoint() <em>Usage Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsagePoint()
     * @generated
     * @ordered
     */
    protected UsagePoint usagePoint;

    /**
     * This is true if the Usage Point reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean usagePointESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EndDeviceEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEndDeviceEvent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIssuerID() {
        return issuerID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIssuerID( String newIssuerID ) {
        String oldIssuerID = issuerID;
        issuerID = newIssuerID;
        boolean oldIssuerIDESet = issuerIDESet;
        issuerIDESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_EVENT__ISSUER_ID, oldIssuerID, issuerID, !oldIssuerIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIssuerID() {
        String oldIssuerID = issuerID;
        boolean oldIssuerIDESet = issuerIDESet;
        issuerID = ISSUER_ID_EDEFAULT;
        issuerIDESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_EVENT__ISSUER_ID, oldIssuerID, ISSUER_ID_EDEFAULT, oldIssuerIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIssuerID() {
        return issuerIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIssuerTrackingID() {
        return issuerTrackingID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIssuerTrackingID( String newIssuerTrackingID ) {
        String oldIssuerTrackingID = issuerTrackingID;
        issuerTrackingID = newIssuerTrackingID;
        boolean oldIssuerTrackingIDESet = issuerTrackingIDESet;
        issuerTrackingIDESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_EVENT__ISSUER_TRACKING_ID,
                    oldIssuerTrackingID, issuerTrackingID, !oldIssuerTrackingIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIssuerTrackingID() {
        String oldIssuerTrackingID = issuerTrackingID;
        boolean oldIssuerTrackingIDESet = issuerTrackingIDESet;
        issuerTrackingID = ISSUER_TRACKING_ID_EDEFAULT;
        issuerTrackingIDESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_EVENT__ISSUER_TRACKING_ID,
                    oldIssuerTrackingID, ISSUER_TRACKING_ID_EDEFAULT, oldIssuerTrackingIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIssuerTrackingID() {
        return issuerTrackingIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUserID() {
        return userID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUserID( String newUserID ) {
        String oldUserID = userID;
        userID = newUserID;
        boolean oldUserIDESet = userIDESet;
        userIDESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_EVENT__USER_ID, oldUserID, userID, !oldUserIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUserID() {
        String oldUserID = userID;
        boolean oldUserIDESet = userIDESet;
        userID = USER_ID_EDEFAULT;
        userIDESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_EVENT__USER_ID, oldUserID, USER_ID_EDEFAULT, oldUserIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUserID() {
        return userIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDevice getEndDevice() {
        return endDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndDevice( EndDevice newEndDevice, NotificationChain msgs ) {
        EndDevice oldEndDevice = endDevice;
        endDevice = newEndDevice;
        boolean oldEndDeviceESet = endDeviceESet;
        endDeviceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_EVENT__END_DEVICE, oldEndDevice, newEndDevice, !oldEndDeviceESet );
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
    public void setEndDevice( EndDevice newEndDevice ) {
        if( newEndDevice != endDevice ) {
            NotificationChain msgs = null;
            if( endDevice != null ) msgs = ( ( InternalEObject ) endDevice ).eInverseRemove( this,
                    CimPackage.END_DEVICE__END_DEVICE_EVENTS, EndDevice.class, msgs );
            if( newEndDevice != null ) msgs = ( ( InternalEObject ) newEndDevice ).eInverseAdd( this,
                    CimPackage.END_DEVICE__END_DEVICE_EVENTS, EndDevice.class, msgs );
            msgs = basicSetEndDevice( newEndDevice, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceESet = endDeviceESet;
            endDeviceESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_EVENT__END_DEVICE, newEndDevice, newEndDevice, !oldEndDeviceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEndDevice( NotificationChain msgs ) {
        EndDevice oldEndDevice = endDevice;
        endDevice = null;
        boolean oldEndDeviceESet = endDeviceESet;
        endDeviceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_EVENT__END_DEVICE, oldEndDevice, null, oldEndDeviceESet );
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
    public void unsetEndDevice() {
        if( endDevice != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) endDevice ).eInverseRemove( this, CimPackage.END_DEVICE__END_DEVICE_EVENTS,
                    EndDevice.class, msgs );
            msgs = basicUnsetEndDevice( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceESet = endDeviceESet;
            endDeviceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_EVENT__END_DEVICE, null, null, oldEndDeviceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDevice() {
        return endDeviceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceEventType getEndDeviceEventType() {
        return endDeviceEventType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndDeviceEventType( EndDeviceEventType newEndDeviceEventType,
            NotificationChain msgs ) {
        EndDeviceEventType oldEndDeviceEventType = endDeviceEventType;
        endDeviceEventType = newEndDeviceEventType;
        boolean oldEndDeviceEventTypeESet = endDeviceEventTypeESet;
        endDeviceEventTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_TYPE, oldEndDeviceEventType, newEndDeviceEventType,
                    !oldEndDeviceEventTypeESet );
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
    public void setEndDeviceEventType( EndDeviceEventType newEndDeviceEventType ) {
        if( newEndDeviceEventType != endDeviceEventType ) {
            NotificationChain msgs = null;
            if( endDeviceEventType != null ) msgs = ( ( InternalEObject ) endDeviceEventType ).eInverseRemove( this,
                    CimPackage.END_DEVICE_EVENT_TYPE__END_DEVICE_EVENTS, EndDeviceEventType.class, msgs );
            if( newEndDeviceEventType != null ) msgs = ( ( InternalEObject ) newEndDeviceEventType ).eInverseAdd( this,
                    CimPackage.END_DEVICE_EVENT_TYPE__END_DEVICE_EVENTS, EndDeviceEventType.class, msgs );
            msgs = basicSetEndDeviceEventType( newEndDeviceEventType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceEventTypeESet = endDeviceEventTypeESet;
            endDeviceEventTypeESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_TYPE,
                            newEndDeviceEventType, newEndDeviceEventType, !oldEndDeviceEventTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEndDeviceEventType( NotificationChain msgs ) {
        EndDeviceEventType oldEndDeviceEventType = endDeviceEventType;
        endDeviceEventType = null;
        boolean oldEndDeviceEventTypeESet = endDeviceEventTypeESet;
        endDeviceEventTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_TYPE, oldEndDeviceEventType, null,
                    oldEndDeviceEventTypeESet );
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
    public void unsetEndDeviceEventType() {
        if( endDeviceEventType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) endDeviceEventType ).eInverseRemove( this,
                    CimPackage.END_DEVICE_EVENT_TYPE__END_DEVICE_EVENTS, EndDeviceEventType.class, msgs );
            msgs = basicUnsetEndDeviceEventType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceEventTypeESet = endDeviceEventTypeESet;
            endDeviceEventTypeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_TYPE, null, null, oldEndDeviceEventTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceEventType() {
        return endDeviceEventTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDeviceEventDetail > getEndDeviceEventDetails() {
        if( endDeviceEventDetails == null ) {
            endDeviceEventDetails = new EObjectWithInverseResolvingEList.Unsettable< EndDeviceEventDetail >(
                    EndDeviceEventDetail.class, this, CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_DETAILS,
                    CimPackage.END_DEVICE_EVENT_DETAIL__END_DEVICE_EVENT );
        }
        return endDeviceEventDetails;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceEventDetails() {
        if( endDeviceEventDetails != null ) ( ( InternalEList.Unsettable< ? > ) endDeviceEventDetails ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceEventDetails() {
        return endDeviceEventDetails != null && ( ( InternalEList.Unsettable< ? > ) endDeviceEventDetails ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeterReading getMeterReading() {
        return meterReading;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMeterReading( MeterReading newMeterReading, NotificationChain msgs ) {
        MeterReading oldMeterReading = meterReading;
        meterReading = newMeterReading;
        boolean oldMeterReadingESet = meterReadingESet;
        meterReadingESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_EVENT__METER_READING, oldMeterReading, newMeterReading,
                    !oldMeterReadingESet );
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
    public void setMeterReading( MeterReading newMeterReading ) {
        if( newMeterReading != meterReading ) {
            NotificationChain msgs = null;
            if( meterReading != null ) msgs = ( ( InternalEObject ) meterReading ).eInverseRemove( this,
                    CimPackage.METER_READING__END_DEVICE_EVENTS, MeterReading.class, msgs );
            if( newMeterReading != null ) msgs = ( ( InternalEObject ) newMeterReading ).eInverseAdd( this,
                    CimPackage.METER_READING__END_DEVICE_EVENTS, MeterReading.class, msgs );
            msgs = basicSetMeterReading( newMeterReading, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeterReadingESet = meterReadingESet;
            meterReadingESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_EVENT__METER_READING,
                        newMeterReading, newMeterReading, !oldMeterReadingESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMeterReading( NotificationChain msgs ) {
        MeterReading oldMeterReading = meterReading;
        meterReading = null;
        boolean oldMeterReadingESet = meterReadingESet;
        meterReadingESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_EVENT__METER_READING, oldMeterReading, null, oldMeterReadingESet );
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
    public void unsetMeterReading() {
        if( meterReading != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) meterReading ).eInverseRemove( this,
                    CimPackage.METER_READING__END_DEVICE_EVENTS, MeterReading.class, msgs );
            msgs = basicUnsetMeterReading( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeterReadingESet = meterReadingESet;
            meterReadingESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_EVENT__METER_READING, null, null, oldMeterReadingESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeterReading() {
        return meterReadingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UsagePoint getUsagePoint() {
        return usagePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUsagePoint( UsagePoint newUsagePoint, NotificationChain msgs ) {
        UsagePoint oldUsagePoint = usagePoint;
        usagePoint = newUsagePoint;
        boolean oldUsagePointESet = usagePointESet;
        usagePointESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_EVENT__USAGE_POINT, oldUsagePoint, newUsagePoint, !oldUsagePointESet );
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
    public void setUsagePoint( UsagePoint newUsagePoint ) {
        if( newUsagePoint != usagePoint ) {
            NotificationChain msgs = null;
            if( usagePoint != null ) msgs = ( ( InternalEObject ) usagePoint ).eInverseRemove( this,
                    CimPackage.USAGE_POINT__END_DEVICE_EVENTS, UsagePoint.class, msgs );
            if( newUsagePoint != null ) msgs = ( ( InternalEObject ) newUsagePoint ).eInverseAdd( this,
                    CimPackage.USAGE_POINT__END_DEVICE_EVENTS, UsagePoint.class, msgs );
            msgs = basicSetUsagePoint( newUsagePoint, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUsagePointESet = usagePointESet;
            usagePointESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_EVENT__USAGE_POINT, newUsagePoint, newUsagePoint, !oldUsagePointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetUsagePoint( NotificationChain msgs ) {
        UsagePoint oldUsagePoint = usagePoint;
        usagePoint = null;
        boolean oldUsagePointESet = usagePointESet;
        usagePointESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_EVENT__USAGE_POINT, oldUsagePoint, null, oldUsagePointESet );
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
    public void unsetUsagePoint() {
        if( usagePoint != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) usagePoint ).eInverseRemove( this, CimPackage.USAGE_POINT__END_DEVICE_EVENTS,
                    UsagePoint.class, msgs );
            msgs = basicUnsetUsagePoint( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUsagePointESet = usagePointESet;
            usagePointESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_EVENT__USAGE_POINT, null, null, oldUsagePointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsagePoint() {
        return usagePointESet;
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
        case CimPackage.END_DEVICE_EVENT__END_DEVICE:
            if( endDevice != null ) msgs = ( ( InternalEObject ) endDevice ).eInverseRemove( this,
                    CimPackage.END_DEVICE__END_DEVICE_EVENTS, EndDevice.class, msgs );
            return basicSetEndDevice( ( EndDevice ) otherEnd, msgs );
        case CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_TYPE:
            if( endDeviceEventType != null ) msgs = ( ( InternalEObject ) endDeviceEventType ).eInverseRemove( this,
                    CimPackage.END_DEVICE_EVENT_TYPE__END_DEVICE_EVENTS, EndDeviceEventType.class, msgs );
            return basicSetEndDeviceEventType( ( EndDeviceEventType ) otherEnd, msgs );
        case CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_DETAILS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceEventDetails() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.END_DEVICE_EVENT__METER_READING:
            if( meterReading != null ) msgs = ( ( InternalEObject ) meterReading ).eInverseRemove( this,
                    CimPackage.METER_READING__END_DEVICE_EVENTS, MeterReading.class, msgs );
            return basicSetMeterReading( ( MeterReading ) otherEnd, msgs );
        case CimPackage.END_DEVICE_EVENT__USAGE_POINT:
            if( usagePoint != null ) msgs = ( ( InternalEObject ) usagePoint ).eInverseRemove( this,
                    CimPackage.USAGE_POINT__END_DEVICE_EVENTS, UsagePoint.class, msgs );
            return basicSetUsagePoint( ( UsagePoint ) otherEnd, msgs );
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
        case CimPackage.END_DEVICE_EVENT__END_DEVICE:
            return basicUnsetEndDevice( msgs );
        case CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_TYPE:
            return basicUnsetEndDeviceEventType( msgs );
        case CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_DETAILS:
            return ( ( InternalEList< ? > ) getEndDeviceEventDetails() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE_EVENT__METER_READING:
            return basicUnsetMeterReading( msgs );
        case CimPackage.END_DEVICE_EVENT__USAGE_POINT:
            return basicUnsetUsagePoint( msgs );
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
        case CimPackage.END_DEVICE_EVENT__ISSUER_ID:
            return getIssuerID();
        case CimPackage.END_DEVICE_EVENT__ISSUER_TRACKING_ID:
            return getIssuerTrackingID();
        case CimPackage.END_DEVICE_EVENT__USER_ID:
            return getUserID();
        case CimPackage.END_DEVICE_EVENT__END_DEVICE:
            return getEndDevice();
        case CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_TYPE:
            return getEndDeviceEventType();
        case CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_DETAILS:
            return getEndDeviceEventDetails();
        case CimPackage.END_DEVICE_EVENT__METER_READING:
            return getMeterReading();
        case CimPackage.END_DEVICE_EVENT__USAGE_POINT:
            return getUsagePoint();
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
        case CimPackage.END_DEVICE_EVENT__ISSUER_ID:
            setIssuerID( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE_EVENT__ISSUER_TRACKING_ID:
            setIssuerTrackingID( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE_EVENT__USER_ID:
            setUserID( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE_EVENT__END_DEVICE:
            setEndDevice( ( EndDevice ) newValue );
            return;
        case CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_TYPE:
            setEndDeviceEventType( ( EndDeviceEventType ) newValue );
            return;
        case CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_DETAILS:
            getEndDeviceEventDetails().clear();
            getEndDeviceEventDetails().addAll( ( Collection< ? extends EndDeviceEventDetail > ) newValue );
            return;
        case CimPackage.END_DEVICE_EVENT__METER_READING:
            setMeterReading( ( MeterReading ) newValue );
            return;
        case CimPackage.END_DEVICE_EVENT__USAGE_POINT:
            setUsagePoint( ( UsagePoint ) newValue );
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
        case CimPackage.END_DEVICE_EVENT__ISSUER_ID:
            unsetIssuerID();
            return;
        case CimPackage.END_DEVICE_EVENT__ISSUER_TRACKING_ID:
            unsetIssuerTrackingID();
            return;
        case CimPackage.END_DEVICE_EVENT__USER_ID:
            unsetUserID();
            return;
        case CimPackage.END_DEVICE_EVENT__END_DEVICE:
            unsetEndDevice();
            return;
        case CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_TYPE:
            unsetEndDeviceEventType();
            return;
        case CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_DETAILS:
            unsetEndDeviceEventDetails();
            return;
        case CimPackage.END_DEVICE_EVENT__METER_READING:
            unsetMeterReading();
            return;
        case CimPackage.END_DEVICE_EVENT__USAGE_POINT:
            unsetUsagePoint();
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
        case CimPackage.END_DEVICE_EVENT__ISSUER_ID:
            return isSetIssuerID();
        case CimPackage.END_DEVICE_EVENT__ISSUER_TRACKING_ID:
            return isSetIssuerTrackingID();
        case CimPackage.END_DEVICE_EVENT__USER_ID:
            return isSetUserID();
        case CimPackage.END_DEVICE_EVENT__END_DEVICE:
            return isSetEndDevice();
        case CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_TYPE:
            return isSetEndDeviceEventType();
        case CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_DETAILS:
            return isSetEndDeviceEventDetails();
        case CimPackage.END_DEVICE_EVENT__METER_READING:
            return isSetMeterReading();
        case CimPackage.END_DEVICE_EVENT__USAGE_POINT:
            return isSetUsagePoint();
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
        result.append( " (issuerID: " );
        if( issuerIDESet )
            result.append( issuerID );
        else
            result.append( "<unset>" );
        result.append( ", issuerTrackingID: " );
        if( issuerTrackingIDESet )
            result.append( issuerTrackingID );
        else
            result.append( "<unset>" );
        result.append( ", userID: " );
        if( userIDESet )
            result.append( userID );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EndDeviceEventImpl
