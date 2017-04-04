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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceTiming;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RandomisationKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Device Timing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceTimingImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceTimingImpl#getDurationIndefinite <em>Duration Indefinite</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceTimingImpl#getRandomisation <em>Randomisation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceTimingImpl#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceTimingImpl extends MinimalEObjectImpl.Container implements EndDeviceTiming {
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
     * The default value of the '{@link #getDurationIndefinite() <em>Duration Indefinite</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDurationIndefinite()
     * @generated
     * @ordered
     */
    protected static final Boolean DURATION_INDEFINITE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDurationIndefinite() <em>Duration Indefinite</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDurationIndefinite()
     * @generated
     * @ordered
     */
    protected Boolean durationIndefinite = DURATION_INDEFINITE_EDEFAULT;

    /**
     * This is true if the Duration Indefinite attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean durationIndefiniteESet;

    /**
     * The default value of the '{@link #getRandomisation() <em>Randomisation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRandomisation()
     * @generated
     * @ordered
     */
    protected static final RandomisationKind RANDOMISATION_EDEFAULT = RandomisationKind.START;

    /**
     * The cached value of the '{@link #getRandomisation() <em>Randomisation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRandomisation()
     * @generated
     * @ordered
     */
    protected RandomisationKind randomisation = RANDOMISATION_EDEFAULT;

    /**
     * This is true if the Randomisation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean randomisationESet;

    /**
     * The cached value of the '{@link #getInterval() <em>Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterval()
     * @generated
     * @ordered
     */
    protected DateTimeInterval interval;

    /**
     * This is true if the Interval containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean intervalESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EndDeviceTimingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEndDeviceTiming();
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
                CimPackage.END_DEVICE_TIMING__DURATION, oldDuration, duration, !oldDurationESet ) );
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
                CimPackage.END_DEVICE_TIMING__DURATION, oldDuration, DURATION_EDEFAULT, oldDurationESet ) );
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
    public Boolean getDurationIndefinite() {
        return durationIndefinite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDurationIndefinite( Boolean newDurationIndefinite ) {
        Boolean oldDurationIndefinite = durationIndefinite;
        durationIndefinite = newDurationIndefinite;
        boolean oldDurationIndefiniteESet = durationIndefiniteESet;
        durationIndefiniteESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_TIMING__DURATION_INDEFINITE,
                    oldDurationIndefinite, durationIndefinite, !oldDurationIndefiniteESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDurationIndefinite() {
        Boolean oldDurationIndefinite = durationIndefinite;
        boolean oldDurationIndefiniteESet = durationIndefiniteESet;
        durationIndefinite = DURATION_INDEFINITE_EDEFAULT;
        durationIndefiniteESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_TIMING__DURATION_INDEFINITE,
                    oldDurationIndefinite, DURATION_INDEFINITE_EDEFAULT, oldDurationIndefiniteESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDurationIndefinite() {
        return durationIndefiniteESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RandomisationKind getRandomisation() {
        return randomisation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRandomisation( RandomisationKind newRandomisation ) {
        RandomisationKind oldRandomisation = randomisation;
        randomisation = newRandomisation == null ? RANDOMISATION_EDEFAULT : newRandomisation;
        boolean oldRandomisationESet = randomisationESet;
        randomisationESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_TIMING__RANDOMISATION, oldRandomisation, randomisation, !oldRandomisationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRandomisation() {
        RandomisationKind oldRandomisation = randomisation;
        boolean oldRandomisationESet = randomisationESet;
        randomisation = RANDOMISATION_EDEFAULT;
        randomisationESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_TIMING__RANDOMISATION,
                    oldRandomisation, RANDOMISATION_EDEFAULT, oldRandomisationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRandomisation() {
        return randomisationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval getInterval() {
        return interval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInterval( DateTimeInterval newInterval, NotificationChain msgs ) {
        DateTimeInterval oldInterval = interval;
        interval = newInterval;
        boolean oldIntervalESet = intervalESet;
        intervalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_TIMING__INTERVAL, oldInterval, newInterval, !oldIntervalESet );
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
    public void setInterval( DateTimeInterval newInterval ) {
        if( newInterval != interval ) {
            NotificationChain msgs = null;
            if( interval != null ) msgs = ( ( InternalEObject ) interval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_TIMING__INTERVAL, null, msgs );
            if( newInterval != null ) msgs = ( ( InternalEObject ) newInterval ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_TIMING__INTERVAL, null, msgs );
            msgs = basicSetInterval( newInterval, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIntervalESet = intervalESet;
            intervalESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_TIMING__INTERVAL, newInterval, newInterval, !oldIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetInterval( NotificationChain msgs ) {
        DateTimeInterval oldInterval = interval;
        interval = null;
        boolean oldIntervalESet = intervalESet;
        intervalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_TIMING__INTERVAL, oldInterval, null, oldIntervalESet );
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
    public void unsetInterval() {
        if( interval != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) interval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.END_DEVICE_TIMING__INTERVAL, null, msgs );
            msgs = basicUnsetInterval( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIntervalESet = intervalESet;
            intervalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_TIMING__INTERVAL, null, null, oldIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInterval() {
        return intervalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.END_DEVICE_TIMING__INTERVAL:
            return basicUnsetInterval( msgs );
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
        case CimPackage.END_DEVICE_TIMING__DURATION:
            return getDuration();
        case CimPackage.END_DEVICE_TIMING__DURATION_INDEFINITE:
            return getDurationIndefinite();
        case CimPackage.END_DEVICE_TIMING__RANDOMISATION:
            return getRandomisation();
        case CimPackage.END_DEVICE_TIMING__INTERVAL:
            return getInterval();
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
        case CimPackage.END_DEVICE_TIMING__DURATION:
            setDuration( ( Float ) newValue );
            return;
        case CimPackage.END_DEVICE_TIMING__DURATION_INDEFINITE:
            setDurationIndefinite( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_TIMING__RANDOMISATION:
            setRandomisation( ( RandomisationKind ) newValue );
            return;
        case CimPackage.END_DEVICE_TIMING__INTERVAL:
            setInterval( ( DateTimeInterval ) newValue );
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
        case CimPackage.END_DEVICE_TIMING__DURATION:
            unsetDuration();
            return;
        case CimPackage.END_DEVICE_TIMING__DURATION_INDEFINITE:
            unsetDurationIndefinite();
            return;
        case CimPackage.END_DEVICE_TIMING__RANDOMISATION:
            unsetRandomisation();
            return;
        case CimPackage.END_DEVICE_TIMING__INTERVAL:
            unsetInterval();
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
        case CimPackage.END_DEVICE_TIMING__DURATION:
            return isSetDuration();
        case CimPackage.END_DEVICE_TIMING__DURATION_INDEFINITE:
            return isSetDurationIndefinite();
        case CimPackage.END_DEVICE_TIMING__RANDOMISATION:
            return isSetRandomisation();
        case CimPackage.END_DEVICE_TIMING__INTERVAL:
            return isSetInterval();
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
        result.append( ", durationIndefinite: " );
        if( durationIndefiniteESet )
            result.append( durationIndefinite );
        else
            result.append( "<unset>" );
        result.append( ", randomisation: " );
        if( randomisationESet )
            result.append( randomisation );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EndDeviceTimingImpl
