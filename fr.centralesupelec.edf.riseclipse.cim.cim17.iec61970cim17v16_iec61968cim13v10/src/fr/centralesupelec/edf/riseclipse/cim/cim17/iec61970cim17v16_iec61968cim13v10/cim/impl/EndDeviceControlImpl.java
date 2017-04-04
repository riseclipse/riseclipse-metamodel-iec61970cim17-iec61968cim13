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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DateTimeInterval;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControlType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FloatQuantity;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePointGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Device Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceControlImpl#getDrProgramLevel <em>Dr Program Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceControlImpl#getDrProgramMandatory <em>Dr Program Mandatory</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceControlImpl#getIssuerID <em>Issuer ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceControlImpl#getIssuerTrackingID <em>Issuer Tracking ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceControlImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceControlImpl#getPriceSignal <em>Price Signal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceControlImpl#getPrimaryDeviceTiming <em>Primary Device Timing</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceControlImpl#getScheduledInterval <em>Scheduled Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceControlImpl#getSecondaryDeviceTiming <em>Secondary Device Timing</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceControlImpl#getEndDeviceGroups <em>End Device Groups</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceControlImpl#getEndDeviceControlType <em>End Device Control Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceControlImpl#getUsagePointGroups <em>Usage Point Groups</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceControlImpl#getEndDeviceAction <em>End Device Action</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceControlImpl#getEndDevices <em>End Devices</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceControlImpl#getUsagePoints <em>Usage Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceControlImpl extends IdentifiedObjectImpl implements EndDeviceControl {
    /**
     * The default value of the '{@link #getDrProgramLevel() <em>Dr Program Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDrProgramLevel()
     * @generated
     * @ordered
     */
    protected static final Integer DR_PROGRAM_LEVEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDrProgramLevel() <em>Dr Program Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDrProgramLevel()
     * @generated
     * @ordered
     */
    protected Integer drProgramLevel = DR_PROGRAM_LEVEL_EDEFAULT;

    /**
     * This is true if the Dr Program Level attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean drProgramLevelESet;

    /**
     * The default value of the '{@link #getDrProgramMandatory() <em>Dr Program Mandatory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDrProgramMandatory()
     * @generated
     * @ordered
     */
    protected static final Boolean DR_PROGRAM_MANDATORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDrProgramMandatory() <em>Dr Program Mandatory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDrProgramMandatory()
     * @generated
     * @ordered
     */
    protected Boolean drProgramMandatory = DR_PROGRAM_MANDATORY_EDEFAULT;

    /**
     * This is true if the Dr Program Mandatory attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean drProgramMandatoryESet;

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
     * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReason()
     * @generated
     * @ordered
     */
    protected static final String REASON_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReason()
     * @generated
     * @ordered
     */
    protected String reason = REASON_EDEFAULT;

    /**
     * This is true if the Reason attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reasonESet;

    /**
     * The cached value of the '{@link #getPriceSignal() <em>Price Signal</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriceSignal()
     * @generated
     * @ordered
     */
    protected FloatQuantity priceSignal;

    /**
     * This is true if the Price Signal containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean priceSignalESet;

    /**
     * The cached value of the '{@link #getPrimaryDeviceTiming() <em>Primary Device Timing</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrimaryDeviceTiming()
     * @generated
     * @ordered
     */
    protected EndDeviceTiming primaryDeviceTiming;

    /**
     * This is true if the Primary Device Timing containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean primaryDeviceTimingESet;

    /**
     * The cached value of the '{@link #getScheduledInterval() <em>Scheduled Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScheduledInterval()
     * @generated
     * @ordered
     */
    protected DateTimeInterval scheduledInterval;

    /**
     * This is true if the Scheduled Interval containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean scheduledIntervalESet;

    /**
     * The cached value of the '{@link #getSecondaryDeviceTiming() <em>Secondary Device Timing</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecondaryDeviceTiming()
     * @generated
     * @ordered
     */
    protected EndDeviceTiming secondaryDeviceTiming;

    /**
     * This is true if the Secondary Device Timing containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean secondaryDeviceTimingESet;

    /**
     * The cached value of the '{@link #getEndDeviceGroups() <em>End Device Groups</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceGroups()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceGroup > endDeviceGroups;

    /**
     * The cached value of the '{@link #getEndDeviceControlType() <em>End Device Control Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceControlType()
     * @generated
     * @ordered
     */
    protected EndDeviceControlType endDeviceControlType;

    /**
     * This is true if the End Device Control Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endDeviceControlTypeESet;

    /**
     * The cached value of the '{@link #getUsagePointGroups() <em>Usage Point Groups</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsagePointGroups()
     * @generated
     * @ordered
     */
    protected EList< UsagePointGroup > usagePointGroups;

    /**
     * The cached value of the '{@link #getEndDeviceAction() <em>End Device Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceAction()
     * @generated
     * @ordered
     */
    protected EndDeviceAction endDeviceAction;

    /**
     * This is true if the End Device Action reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endDeviceActionESet;

    /**
     * The cached value of the '{@link #getEndDevices() <em>End Devices</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDevices()
     * @generated
     * @ordered
     */
    protected EList< EndDevice > endDevices;

    /**
     * The cached value of the '{@link #getUsagePoints() <em>Usage Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsagePoints()
     * @generated
     * @ordered
     */
    protected EList< UsagePoint > usagePoints;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EndDeviceControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEndDeviceControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getDrProgramLevel() {
        return drProgramLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDrProgramLevel( Integer newDrProgramLevel ) {
        Integer oldDrProgramLevel = drProgramLevel;
        drProgramLevel = newDrProgramLevel;
        boolean oldDrProgramLevelESet = drProgramLevelESet;
        drProgramLevelESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL,
                    oldDrProgramLevel, drProgramLevel, !oldDrProgramLevelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDrProgramLevel() {
        Integer oldDrProgramLevel = drProgramLevel;
        boolean oldDrProgramLevelESet = drProgramLevelESet;
        drProgramLevel = DR_PROGRAM_LEVEL_EDEFAULT;
        drProgramLevelESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL,
                    oldDrProgramLevel, DR_PROGRAM_LEVEL_EDEFAULT, oldDrProgramLevelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDrProgramLevel() {
        return drProgramLevelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getDrProgramMandatory() {
        return drProgramMandatory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDrProgramMandatory( Boolean newDrProgramMandatory ) {
        Boolean oldDrProgramMandatory = drProgramMandatory;
        drProgramMandatory = newDrProgramMandatory;
        boolean oldDrProgramMandatoryESet = drProgramMandatoryESet;
        drProgramMandatoryESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY,
                    oldDrProgramMandatory, drProgramMandatory, !oldDrProgramMandatoryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDrProgramMandatory() {
        Boolean oldDrProgramMandatory = drProgramMandatory;
        boolean oldDrProgramMandatoryESet = drProgramMandatoryESet;
        drProgramMandatory = DR_PROGRAM_MANDATORY_EDEFAULT;
        drProgramMandatoryESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY,
                        oldDrProgramMandatory, DR_PROGRAM_MANDATORY_EDEFAULT, oldDrProgramMandatoryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDrProgramMandatory() {
        return drProgramMandatoryESet;
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
                CimPackage.END_DEVICE_CONTROL__ISSUER_ID, oldIssuerID, issuerID, !oldIssuerIDESet ) );
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
                CimPackage.END_DEVICE_CONTROL__ISSUER_ID, oldIssuerID, ISSUER_ID_EDEFAULT, oldIssuerIDESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CONTROL__ISSUER_TRACKING_ID,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_CONTROL__ISSUER_TRACKING_ID,
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
    public String getReason() {
        return reason;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReason( String newReason ) {
        String oldReason = reason;
        reason = newReason;
        boolean oldReasonESet = reasonESet;
        reasonESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_CONTROL__REASON, oldReason, reason, !oldReasonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReason() {
        String oldReason = reason;
        boolean oldReasonESet = reasonESet;
        reason = REASON_EDEFAULT;
        reasonESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_CONTROL__REASON, oldReason, REASON_EDEFAULT, oldReasonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReason() {
        return reasonESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FloatQuantity getPriceSignal() {
        return priceSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPriceSignal( FloatQuantity newPriceSignal, NotificationChain msgs ) {
        FloatQuantity oldPriceSignal = priceSignal;
        priceSignal = newPriceSignal;
        boolean oldPriceSignalESet = priceSignalESet;
        priceSignalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_CONTROL__PRICE_SIGNAL, oldPriceSignal, newPriceSignal, !oldPriceSignalESet );
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
    public void setPriceSignal( FloatQuantity newPriceSignal ) {
        if( newPriceSignal != priceSignal ) {
            NotificationChain msgs = null;
            if( priceSignal != null ) msgs = ( ( InternalEObject ) priceSignal ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_CONTROL__PRICE_SIGNAL, null, msgs );
            if( newPriceSignal != null ) msgs = ( ( InternalEObject ) newPriceSignal ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_CONTROL__PRICE_SIGNAL, null, msgs );
            msgs = basicSetPriceSignal( newPriceSignal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPriceSignalESet = priceSignalESet;
            priceSignalESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CONTROL__PRICE_SIGNAL,
                        newPriceSignal, newPriceSignal, !oldPriceSignalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPriceSignal( NotificationChain msgs ) {
        FloatQuantity oldPriceSignal = priceSignal;
        priceSignal = null;
        boolean oldPriceSignalESet = priceSignalESet;
        priceSignalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_CONTROL__PRICE_SIGNAL, oldPriceSignal, null, oldPriceSignalESet );
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
    public void unsetPriceSignal() {
        if( priceSignal != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) priceSignal ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_CONTROL__PRICE_SIGNAL, null, msgs );
            msgs = basicUnsetPriceSignal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPriceSignalESet = priceSignalESet;
            priceSignalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_CONTROL__PRICE_SIGNAL, null, null, oldPriceSignalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPriceSignal() {
        return priceSignalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceTiming getPrimaryDeviceTiming() {
        return primaryDeviceTiming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPrimaryDeviceTiming( EndDeviceTiming newPrimaryDeviceTiming,
            NotificationChain msgs ) {
        EndDeviceTiming oldPrimaryDeviceTiming = primaryDeviceTiming;
        primaryDeviceTiming = newPrimaryDeviceTiming;
        boolean oldPrimaryDeviceTimingESet = primaryDeviceTimingESet;
        primaryDeviceTimingESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_CONTROL__PRIMARY_DEVICE_TIMING, oldPrimaryDeviceTiming,
                    newPrimaryDeviceTiming, !oldPrimaryDeviceTimingESet );
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
    public void setPrimaryDeviceTiming( EndDeviceTiming newPrimaryDeviceTiming ) {
        if( newPrimaryDeviceTiming != primaryDeviceTiming ) {
            NotificationChain msgs = null;
            if( primaryDeviceTiming != null ) msgs = ( ( InternalEObject ) primaryDeviceTiming ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_CONTROL__PRIMARY_DEVICE_TIMING, null, msgs );
            if( newPrimaryDeviceTiming != null )
                msgs = ( ( InternalEObject ) newPrimaryDeviceTiming ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_CONTROL__PRIMARY_DEVICE_TIMING, null, msgs );
            msgs = basicSetPrimaryDeviceTiming( newPrimaryDeviceTiming, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPrimaryDeviceTimingESet = primaryDeviceTimingESet;
            primaryDeviceTimingESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CONTROL__PRIMARY_DEVICE_TIMING,
                            newPrimaryDeviceTiming, newPrimaryDeviceTiming, !oldPrimaryDeviceTimingESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPrimaryDeviceTiming( NotificationChain msgs ) {
        EndDeviceTiming oldPrimaryDeviceTiming = primaryDeviceTiming;
        primaryDeviceTiming = null;
        boolean oldPrimaryDeviceTimingESet = primaryDeviceTimingESet;
        primaryDeviceTimingESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_CONTROL__PRIMARY_DEVICE_TIMING, oldPrimaryDeviceTiming, null,
                    oldPrimaryDeviceTimingESet );
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
    public void unsetPrimaryDeviceTiming() {
        if( primaryDeviceTiming != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) primaryDeviceTiming ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_CONTROL__PRIMARY_DEVICE_TIMING, null, msgs );
            msgs = basicUnsetPrimaryDeviceTiming( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPrimaryDeviceTimingESet = primaryDeviceTimingESet;
            primaryDeviceTimingESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_CONTROL__PRIMARY_DEVICE_TIMING, null, null, oldPrimaryDeviceTimingESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrimaryDeviceTiming() {
        return primaryDeviceTimingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval getScheduledInterval() {
        return scheduledInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetScheduledInterval( DateTimeInterval newScheduledInterval,
            NotificationChain msgs ) {
        DateTimeInterval oldScheduledInterval = scheduledInterval;
        scheduledInterval = newScheduledInterval;
        boolean oldScheduledIntervalESet = scheduledIntervalESet;
        scheduledIntervalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL, oldScheduledInterval, newScheduledInterval,
                    !oldScheduledIntervalESet );
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
    public void setScheduledInterval( DateTimeInterval newScheduledInterval ) {
        if( newScheduledInterval != scheduledInterval ) {
            NotificationChain msgs = null;
            if( scheduledInterval != null ) msgs = ( ( InternalEObject ) scheduledInterval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL, null, msgs );
            if( newScheduledInterval != null ) msgs = ( ( InternalEObject ) newScheduledInterval ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL, null, msgs );
            msgs = basicSetScheduledInterval( newScheduledInterval, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldScheduledIntervalESet = scheduledIntervalESet;
            scheduledIntervalESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL,
                            newScheduledInterval, newScheduledInterval, !oldScheduledIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetScheduledInterval( NotificationChain msgs ) {
        DateTimeInterval oldScheduledInterval = scheduledInterval;
        scheduledInterval = null;
        boolean oldScheduledIntervalESet = scheduledIntervalESet;
        scheduledIntervalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL, oldScheduledInterval, null,
                    oldScheduledIntervalESet );
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
    public void unsetScheduledInterval() {
        if( scheduledInterval != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) scheduledInterval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL, null, msgs );
            msgs = basicUnsetScheduledInterval( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldScheduledIntervalESet = scheduledIntervalESet;
            scheduledIntervalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL, null, null, oldScheduledIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetScheduledInterval() {
        return scheduledIntervalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceTiming getSecondaryDeviceTiming() {
        return secondaryDeviceTiming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSecondaryDeviceTiming( EndDeviceTiming newSecondaryDeviceTiming,
            NotificationChain msgs ) {
        EndDeviceTiming oldSecondaryDeviceTiming = secondaryDeviceTiming;
        secondaryDeviceTiming = newSecondaryDeviceTiming;
        boolean oldSecondaryDeviceTimingESet = secondaryDeviceTimingESet;
        secondaryDeviceTimingESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_CONTROL__SECONDARY_DEVICE_TIMING, oldSecondaryDeviceTiming,
                    newSecondaryDeviceTiming, !oldSecondaryDeviceTimingESet );
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
    public void setSecondaryDeviceTiming( EndDeviceTiming newSecondaryDeviceTiming ) {
        if( newSecondaryDeviceTiming != secondaryDeviceTiming ) {
            NotificationChain msgs = null;
            if( secondaryDeviceTiming != null )
                msgs = ( ( InternalEObject ) secondaryDeviceTiming ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_CONTROL__SECONDARY_DEVICE_TIMING, null, msgs );
            if( newSecondaryDeviceTiming != null )
                msgs = ( ( InternalEObject ) newSecondaryDeviceTiming ).eInverseAdd( this,
                        EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_CONTROL__SECONDARY_DEVICE_TIMING, null, msgs );
            msgs = basicSetSecondaryDeviceTiming( newSecondaryDeviceTiming, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSecondaryDeviceTimingESet = secondaryDeviceTimingESet;
            secondaryDeviceTimingESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_CONTROL__SECONDARY_DEVICE_TIMING, newSecondaryDeviceTiming,
                    newSecondaryDeviceTiming, !oldSecondaryDeviceTimingESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSecondaryDeviceTiming( NotificationChain msgs ) {
        EndDeviceTiming oldSecondaryDeviceTiming = secondaryDeviceTiming;
        secondaryDeviceTiming = null;
        boolean oldSecondaryDeviceTimingESet = secondaryDeviceTimingESet;
        secondaryDeviceTimingESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_CONTROL__SECONDARY_DEVICE_TIMING, oldSecondaryDeviceTiming, null,
                    oldSecondaryDeviceTimingESet );
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
    public void unsetSecondaryDeviceTiming() {
        if( secondaryDeviceTiming != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) secondaryDeviceTiming ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_CONTROL__SECONDARY_DEVICE_TIMING, null, msgs );
            msgs = basicUnsetSecondaryDeviceTiming( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSecondaryDeviceTimingESet = secondaryDeviceTimingESet;
            secondaryDeviceTimingESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_CONTROL__SECONDARY_DEVICE_TIMING, null, null,
                    oldSecondaryDeviceTimingESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSecondaryDeviceTiming() {
        return secondaryDeviceTimingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDeviceGroup > getEndDeviceGroups() {
        if( endDeviceGroups == null ) {
            endDeviceGroups = new EObjectWithInverseEList.Unsettable.ManyInverse< EndDeviceGroup >(
                    EndDeviceGroup.class, this, CimPackage.END_DEVICE_CONTROL__END_DEVICE_GROUPS,
                    CimPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS );
        }
        return endDeviceGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceGroups() {
        if( endDeviceGroups != null ) ( ( InternalEList.Unsettable< ? > ) endDeviceGroups ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceGroups() {
        return endDeviceGroups != null && ( ( InternalEList.Unsettable< ? > ) endDeviceGroups ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceControlType getEndDeviceControlType() {
        return endDeviceControlType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndDeviceControlType( EndDeviceControlType newEndDeviceControlType,
            NotificationChain msgs ) {
        EndDeviceControlType oldEndDeviceControlType = endDeviceControlType;
        endDeviceControlType = newEndDeviceControlType;
        boolean oldEndDeviceControlTypeESet = endDeviceControlTypeESet;
        endDeviceControlTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_CONTROL__END_DEVICE_CONTROL_TYPE, oldEndDeviceControlType,
                    newEndDeviceControlType, !oldEndDeviceControlTypeESet );
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
    public void setEndDeviceControlType( EndDeviceControlType newEndDeviceControlType ) {
        if( newEndDeviceControlType != endDeviceControlType ) {
            NotificationChain msgs = null;
            if( endDeviceControlType != null ) msgs = ( ( InternalEObject ) endDeviceControlType ).eInverseRemove( this,
                    CimPackage.END_DEVICE_CONTROL_TYPE__END_DEVICE_CONTROLS, EndDeviceControlType.class, msgs );
            if( newEndDeviceControlType != null )
                msgs = ( ( InternalEObject ) newEndDeviceControlType ).eInverseAdd( this,
                        CimPackage.END_DEVICE_CONTROL_TYPE__END_DEVICE_CONTROLS, EndDeviceControlType.class, msgs );
            msgs = basicSetEndDeviceControlType( newEndDeviceControlType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceControlTypeESet = endDeviceControlTypeESet;
            endDeviceControlTypeESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_CONTROL__END_DEVICE_CONTROL_TYPE, newEndDeviceControlType,
                    newEndDeviceControlType, !oldEndDeviceControlTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEndDeviceControlType( NotificationChain msgs ) {
        EndDeviceControlType oldEndDeviceControlType = endDeviceControlType;
        endDeviceControlType = null;
        boolean oldEndDeviceControlTypeESet = endDeviceControlTypeESet;
        endDeviceControlTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_CONTROL__END_DEVICE_CONTROL_TYPE, oldEndDeviceControlType, null,
                    oldEndDeviceControlTypeESet );
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
    public void unsetEndDeviceControlType() {
        if( endDeviceControlType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) endDeviceControlType ).eInverseRemove( this,
                    CimPackage.END_DEVICE_CONTROL_TYPE__END_DEVICE_CONTROLS, EndDeviceControlType.class, msgs );
            msgs = basicUnsetEndDeviceControlType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceControlTypeESet = endDeviceControlTypeESet;
            endDeviceControlTypeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_CONTROL__END_DEVICE_CONTROL_TYPE, null, null, oldEndDeviceControlTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceControlType() {
        return endDeviceControlTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< UsagePointGroup > getUsagePointGroups() {
        if( usagePointGroups == null ) {
            usagePointGroups = new EObjectWithInverseEList.Unsettable.ManyInverse< UsagePointGroup >(
                    UsagePointGroup.class, this, CimPackage.END_DEVICE_CONTROL__USAGE_POINT_GROUPS,
                    CimPackage.USAGE_POINT_GROUP__END_DEVICE_CONTROLS );
        }
        return usagePointGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsagePointGroups() {
        if( usagePointGroups != null ) ( ( InternalEList.Unsettable< ? > ) usagePointGroups ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsagePointGroups() {
        return usagePointGroups != null && ( ( InternalEList.Unsettable< ? > ) usagePointGroups ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceAction getEndDeviceAction() {
        return endDeviceAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndDeviceAction( EndDeviceAction newEndDeviceAction, NotificationChain msgs ) {
        EndDeviceAction oldEndDeviceAction = endDeviceAction;
        endDeviceAction = newEndDeviceAction;
        boolean oldEndDeviceActionESet = endDeviceActionESet;
        endDeviceActionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_CONTROL__END_DEVICE_ACTION, oldEndDeviceAction, newEndDeviceAction,
                    !oldEndDeviceActionESet );
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
    public void setEndDeviceAction( EndDeviceAction newEndDeviceAction ) {
        if( newEndDeviceAction != endDeviceAction ) {
            NotificationChain msgs = null;
            if( endDeviceAction != null ) msgs = ( ( InternalEObject ) endDeviceAction ).eInverseRemove( this,
                    CimPackage.END_DEVICE_ACTION__END_DEVICE_CONTROL, EndDeviceAction.class, msgs );
            if( newEndDeviceAction != null ) msgs = ( ( InternalEObject ) newEndDeviceAction ).eInverseAdd( this,
                    CimPackage.END_DEVICE_ACTION__END_DEVICE_CONTROL, EndDeviceAction.class, msgs );
            msgs = basicSetEndDeviceAction( newEndDeviceAction, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceActionESet = endDeviceActionESet;
            endDeviceActionESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_CONTROL__END_DEVICE_ACTION,
                            newEndDeviceAction, newEndDeviceAction, !oldEndDeviceActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEndDeviceAction( NotificationChain msgs ) {
        EndDeviceAction oldEndDeviceAction = endDeviceAction;
        endDeviceAction = null;
        boolean oldEndDeviceActionESet = endDeviceActionESet;
        endDeviceActionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_CONTROL__END_DEVICE_ACTION, oldEndDeviceAction, null,
                    oldEndDeviceActionESet );
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
    public void unsetEndDeviceAction() {
        if( endDeviceAction != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) endDeviceAction ).eInverseRemove( this,
                    CimPackage.END_DEVICE_ACTION__END_DEVICE_CONTROL, EndDeviceAction.class, msgs );
            msgs = basicUnsetEndDeviceAction( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceActionESet = endDeviceActionESet;
            endDeviceActionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_CONTROL__END_DEVICE_ACTION, null, null, oldEndDeviceActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceAction() {
        return endDeviceActionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDevice > getEndDevices() {
        if( endDevices == null ) {
            endDevices = new EObjectWithInverseEList.Unsettable.ManyInverse< EndDevice >( EndDevice.class, this,
                    CimPackage.END_DEVICE_CONTROL__END_DEVICES, CimPackage.END_DEVICE__END_DEVICE_CONTROLS );
        }
        return endDevices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDevices() {
        if( endDevices != null ) ( ( InternalEList.Unsettable< ? > ) endDevices ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDevices() {
        return endDevices != null && ( ( InternalEList.Unsettable< ? > ) endDevices ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< UsagePoint > getUsagePoints() {
        if( usagePoints == null ) {
            usagePoints = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< UsagePoint >( UsagePoint.class,
                    this, CimPackage.END_DEVICE_CONTROL__USAGE_POINTS, CimPackage.USAGE_POINT__END_DEVICE_CONTROLS );
        }
        return usagePoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsagePoints() {
        if( usagePoints != null ) ( ( InternalEList.Unsettable< ? > ) usagePoints ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsagePoints() {
        return usagePoints != null && ( ( InternalEList.Unsettable< ? > ) usagePoints ).isSet();
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
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_GROUPS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceGroups() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_CONTROL_TYPE:
            if( endDeviceControlType != null ) msgs = ( ( InternalEObject ) endDeviceControlType ).eInverseRemove( this,
                    CimPackage.END_DEVICE_CONTROL_TYPE__END_DEVICE_CONTROLS, EndDeviceControlType.class, msgs );
            return basicSetEndDeviceControlType( ( EndDeviceControlType ) otherEnd, msgs );
        case CimPackage.END_DEVICE_CONTROL__USAGE_POINT_GROUPS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUsagePointGroups() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_ACTION:
            if( endDeviceAction != null ) msgs = ( ( InternalEObject ) endDeviceAction ).eInverseRemove( this,
                    CimPackage.END_DEVICE_ACTION__END_DEVICE_CONTROL, EndDeviceAction.class, msgs );
            return basicSetEndDeviceAction( ( EndDeviceAction ) otherEnd, msgs );
        case CimPackage.END_DEVICE_CONTROL__END_DEVICES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDevices() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.END_DEVICE_CONTROL__USAGE_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUsagePoints() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.END_DEVICE_CONTROL__PRICE_SIGNAL:
            return basicUnsetPriceSignal( msgs );
        case CimPackage.END_DEVICE_CONTROL__PRIMARY_DEVICE_TIMING:
            return basicUnsetPrimaryDeviceTiming( msgs );
        case CimPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL:
            return basicUnsetScheduledInterval( msgs );
        case CimPackage.END_DEVICE_CONTROL__SECONDARY_DEVICE_TIMING:
            return basicUnsetSecondaryDeviceTiming( msgs );
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_GROUPS:
            return ( ( InternalEList< ? > ) getEndDeviceGroups() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_CONTROL_TYPE:
            return basicUnsetEndDeviceControlType( msgs );
        case CimPackage.END_DEVICE_CONTROL__USAGE_POINT_GROUPS:
            return ( ( InternalEList< ? > ) getUsagePointGroups() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_ACTION:
            return basicUnsetEndDeviceAction( msgs );
        case CimPackage.END_DEVICE_CONTROL__END_DEVICES:
            return ( ( InternalEList< ? > ) getEndDevices() ).basicRemove( otherEnd, msgs );
        case CimPackage.END_DEVICE_CONTROL__USAGE_POINTS:
            return ( ( InternalEList< ? > ) getUsagePoints() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL:
            return getDrProgramLevel();
        case CimPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY:
            return getDrProgramMandatory();
        case CimPackage.END_DEVICE_CONTROL__ISSUER_ID:
            return getIssuerID();
        case CimPackage.END_DEVICE_CONTROL__ISSUER_TRACKING_ID:
            return getIssuerTrackingID();
        case CimPackage.END_DEVICE_CONTROL__REASON:
            return getReason();
        case CimPackage.END_DEVICE_CONTROL__PRICE_SIGNAL:
            return getPriceSignal();
        case CimPackage.END_DEVICE_CONTROL__PRIMARY_DEVICE_TIMING:
            return getPrimaryDeviceTiming();
        case CimPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL:
            return getScheduledInterval();
        case CimPackage.END_DEVICE_CONTROL__SECONDARY_DEVICE_TIMING:
            return getSecondaryDeviceTiming();
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_GROUPS:
            return getEndDeviceGroups();
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_CONTROL_TYPE:
            return getEndDeviceControlType();
        case CimPackage.END_DEVICE_CONTROL__USAGE_POINT_GROUPS:
            return getUsagePointGroups();
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_ACTION:
            return getEndDeviceAction();
        case CimPackage.END_DEVICE_CONTROL__END_DEVICES:
            return getEndDevices();
        case CimPackage.END_DEVICE_CONTROL__USAGE_POINTS:
            return getUsagePoints();
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
        case CimPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL:
            setDrProgramLevel( ( Integer ) newValue );
            return;
        case CimPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY:
            setDrProgramMandatory( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_CONTROL__ISSUER_ID:
            setIssuerID( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE_CONTROL__ISSUER_TRACKING_ID:
            setIssuerTrackingID( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE_CONTROL__REASON:
            setReason( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE_CONTROL__PRICE_SIGNAL:
            setPriceSignal( ( FloatQuantity ) newValue );
            return;
        case CimPackage.END_DEVICE_CONTROL__PRIMARY_DEVICE_TIMING:
            setPrimaryDeviceTiming( ( EndDeviceTiming ) newValue );
            return;
        case CimPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL:
            setScheduledInterval( ( DateTimeInterval ) newValue );
            return;
        case CimPackage.END_DEVICE_CONTROL__SECONDARY_DEVICE_TIMING:
            setSecondaryDeviceTiming( ( EndDeviceTiming ) newValue );
            return;
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_GROUPS:
            getEndDeviceGroups().clear();
            getEndDeviceGroups().addAll( ( Collection< ? extends EndDeviceGroup > ) newValue );
            return;
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_CONTROL_TYPE:
            setEndDeviceControlType( ( EndDeviceControlType ) newValue );
            return;
        case CimPackage.END_DEVICE_CONTROL__USAGE_POINT_GROUPS:
            getUsagePointGroups().clear();
            getUsagePointGroups().addAll( ( Collection< ? extends UsagePointGroup > ) newValue );
            return;
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_ACTION:
            setEndDeviceAction( ( EndDeviceAction ) newValue );
            return;
        case CimPackage.END_DEVICE_CONTROL__END_DEVICES:
            getEndDevices().clear();
            getEndDevices().addAll( ( Collection< ? extends EndDevice > ) newValue );
            return;
        case CimPackage.END_DEVICE_CONTROL__USAGE_POINTS:
            getUsagePoints().clear();
            getUsagePoints().addAll( ( Collection< ? extends UsagePoint > ) newValue );
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
        case CimPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL:
            unsetDrProgramLevel();
            return;
        case CimPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY:
            unsetDrProgramMandatory();
            return;
        case CimPackage.END_DEVICE_CONTROL__ISSUER_ID:
            unsetIssuerID();
            return;
        case CimPackage.END_DEVICE_CONTROL__ISSUER_TRACKING_ID:
            unsetIssuerTrackingID();
            return;
        case CimPackage.END_DEVICE_CONTROL__REASON:
            unsetReason();
            return;
        case CimPackage.END_DEVICE_CONTROL__PRICE_SIGNAL:
            unsetPriceSignal();
            return;
        case CimPackage.END_DEVICE_CONTROL__PRIMARY_DEVICE_TIMING:
            unsetPrimaryDeviceTiming();
            return;
        case CimPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL:
            unsetScheduledInterval();
            return;
        case CimPackage.END_DEVICE_CONTROL__SECONDARY_DEVICE_TIMING:
            unsetSecondaryDeviceTiming();
            return;
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_GROUPS:
            unsetEndDeviceGroups();
            return;
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_CONTROL_TYPE:
            unsetEndDeviceControlType();
            return;
        case CimPackage.END_DEVICE_CONTROL__USAGE_POINT_GROUPS:
            unsetUsagePointGroups();
            return;
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_ACTION:
            unsetEndDeviceAction();
            return;
        case CimPackage.END_DEVICE_CONTROL__END_DEVICES:
            unsetEndDevices();
            return;
        case CimPackage.END_DEVICE_CONTROL__USAGE_POINTS:
            unsetUsagePoints();
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
        case CimPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL:
            return isSetDrProgramLevel();
        case CimPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY:
            return isSetDrProgramMandatory();
        case CimPackage.END_DEVICE_CONTROL__ISSUER_ID:
            return isSetIssuerID();
        case CimPackage.END_DEVICE_CONTROL__ISSUER_TRACKING_ID:
            return isSetIssuerTrackingID();
        case CimPackage.END_DEVICE_CONTROL__REASON:
            return isSetReason();
        case CimPackage.END_DEVICE_CONTROL__PRICE_SIGNAL:
            return isSetPriceSignal();
        case CimPackage.END_DEVICE_CONTROL__PRIMARY_DEVICE_TIMING:
            return isSetPrimaryDeviceTiming();
        case CimPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL:
            return isSetScheduledInterval();
        case CimPackage.END_DEVICE_CONTROL__SECONDARY_DEVICE_TIMING:
            return isSetSecondaryDeviceTiming();
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_GROUPS:
            return isSetEndDeviceGroups();
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_CONTROL_TYPE:
            return isSetEndDeviceControlType();
        case CimPackage.END_DEVICE_CONTROL__USAGE_POINT_GROUPS:
            return isSetUsagePointGroups();
        case CimPackage.END_DEVICE_CONTROL__END_DEVICE_ACTION:
            return isSetEndDeviceAction();
        case CimPackage.END_DEVICE_CONTROL__END_DEVICES:
            return isSetEndDevices();
        case CimPackage.END_DEVICE_CONTROL__USAGE_POINTS:
            return isSetUsagePoints();
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
        result.append( " (drProgramLevel: " );
        if( drProgramLevelESet )
            result.append( drProgramLevel );
        else
            result.append( "<unset>" );
        result.append( ", drProgramMandatory: " );
        if( drProgramMandatoryESet )
            result.append( drProgramMandatory );
        else
            result.append( "<unset>" );
        result.append( ", issuerID: " );
        if( issuerIDESet )
            result.append( issuerID );
        else
            result.append( "<unset>" );
        result.append( ", issuerTrackingID: " );
        if( issuerTrackingIDESet )
            result.append( issuerTrackingID );
        else
            result.append( "<unset>" );
        result.append( ", reason: " );
        if( reasonESet )
            result.append( reason );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EndDeviceControlImpl
