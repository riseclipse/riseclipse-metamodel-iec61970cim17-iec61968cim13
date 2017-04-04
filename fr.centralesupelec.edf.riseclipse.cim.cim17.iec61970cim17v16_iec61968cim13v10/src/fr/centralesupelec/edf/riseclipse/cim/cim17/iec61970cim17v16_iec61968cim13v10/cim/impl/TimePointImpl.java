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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Status;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimePoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimePointImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimePointImpl#getRelativeTimeInterval <em>Relative Time Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimePointImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimePointImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimePointImpl#getWindow <em>Window</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimePointImpl#getTimeSchedule <em>Time Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimePointImpl extends IdentifiedObjectImpl implements TimePoint {
    /**
     * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateTime()
     * @generated
     * @ordered
     */
    protected static final Date DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateTime()
     * @generated
     * @ordered
     */
    protected Date dateTime = DATE_TIME_EDEFAULT;

    /**
     * This is true if the Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dateTimeESet;

    /**
     * The default value of the '{@link #getRelativeTimeInterval() <em>Relative Time Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelativeTimeInterval()
     * @generated
     * @ordered
     */
    protected static final Float RELATIVE_TIME_INTERVAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRelativeTimeInterval() <em>Relative Time Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelativeTimeInterval()
     * @generated
     * @ordered
     */
    protected Float relativeTimeInterval = RELATIVE_TIME_INTERVAL_EDEFAULT;

    /**
     * This is true if the Relative Time Interval attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean relativeTimeIntervalESet;

    /**
     * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequenceNumber()
     * @generated
     * @ordered
     */
    protected static final Integer SEQUENCE_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequenceNumber()
     * @generated
     * @ordered
     */
    protected Integer sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

    /**
     * This is true if the Sequence Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sequenceNumberESet;

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
     * The cached value of the '{@link #getWindow() <em>Window</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindow()
     * @generated
     * @ordered
     */
    protected DateTimeInterval window;

    /**
     * This is true if the Window containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windowESet;

    /**
     * The cached value of the '{@link #getTimeSchedule() <em>Time Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeSchedule()
     * @generated
     * @ordered
     */
    protected TimeSchedule timeSchedule;

    /**
     * This is true if the Time Schedule reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeScheduleESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimePointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTimePoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDateTime( Date newDateTime ) {
        Date oldDateTime = dateTime;
        dateTime = newDateTime;
        boolean oldDateTimeESet = dateTimeESet;
        dateTimeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TIME_POINT__DATE_TIME, oldDateTime, dateTime, !oldDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDateTime() {
        Date oldDateTime = dateTime;
        boolean oldDateTimeESet = dateTimeESet;
        dateTime = DATE_TIME_EDEFAULT;
        dateTimeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TIME_POINT__DATE_TIME, oldDateTime, DATE_TIME_EDEFAULT, oldDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDateTime() {
        return dateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRelativeTimeInterval() {
        return relativeTimeInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelativeTimeInterval( Float newRelativeTimeInterval ) {
        Float oldRelativeTimeInterval = relativeTimeInterval;
        relativeTimeInterval = newRelativeTimeInterval;
        boolean oldRelativeTimeIntervalESet = relativeTimeIntervalESet;
        relativeTimeIntervalESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TIME_POINT__RELATIVE_TIME_INTERVAL,
                    oldRelativeTimeInterval, relativeTimeInterval, !oldRelativeTimeIntervalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRelativeTimeInterval() {
        Float oldRelativeTimeInterval = relativeTimeInterval;
        boolean oldRelativeTimeIntervalESet = relativeTimeIntervalESet;
        relativeTimeInterval = RELATIVE_TIME_INTERVAL_EDEFAULT;
        relativeTimeIntervalESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TIME_POINT__RELATIVE_TIME_INTERVAL,
                    oldRelativeTimeInterval, RELATIVE_TIME_INTERVAL_EDEFAULT, oldRelativeTimeIntervalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRelativeTimeInterval() {
        return relativeTimeIntervalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSequenceNumber( Integer newSequenceNumber ) {
        Integer oldSequenceNumber = sequenceNumber;
        sequenceNumber = newSequenceNumber;
        boolean oldSequenceNumberESet = sequenceNumberESet;
        sequenceNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TIME_POINT__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber, !oldSequenceNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSequenceNumber() {
        Integer oldSequenceNumber = sequenceNumber;
        boolean oldSequenceNumberESet = sequenceNumberESet;
        sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
        sequenceNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TIME_POINT__SEQUENCE_NUMBER,
                    oldSequenceNumber, SEQUENCE_NUMBER_EDEFAULT, oldSequenceNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSequenceNumber() {
        return sequenceNumberESet;
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
                    CimPackage.TIME_POINT__STATUS, oldStatus, newStatus, !oldStatusESet );
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
                    EOPPOSITE_FEATURE_BASE - CimPackage.TIME_POINT__STATUS, null, msgs );
            if( newStatus != null ) msgs = ( ( InternalEObject ) newStatus ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TIME_POINT__STATUS, null, msgs );
            msgs = basicSetStatus( newStatus, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TIME_POINT__STATUS, newStatus, newStatus, !oldStatusESet ) );
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
                    CimPackage.TIME_POINT__STATUS, oldStatus, null, oldStatusESet );
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
                    EOPPOSITE_FEATURE_BASE - CimPackage.TIME_POINT__STATUS, null, msgs );
            msgs = basicUnsetStatus( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TIME_POINT__STATUS, null, null, oldStatusESet ) );
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
    public DateTimeInterval getWindow() {
        return window;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindow( DateTimeInterval newWindow, NotificationChain msgs ) {
        DateTimeInterval oldWindow = window;
        window = newWindow;
        boolean oldWindowESet = windowESet;
        windowESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TIME_POINT__WINDOW, oldWindow, newWindow, !oldWindowESet );
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
    public void setWindow( DateTimeInterval newWindow ) {
        if( newWindow != window ) {
            NotificationChain msgs = null;
            if( window != null ) msgs = ( ( InternalEObject ) window ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TIME_POINT__WINDOW, null, msgs );
            if( newWindow != null ) msgs = ( ( InternalEObject ) newWindow ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TIME_POINT__WINDOW, null, msgs );
            msgs = basicSetWindow( newWindow, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindowESet = windowESet;
            windowESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TIME_POINT__WINDOW, newWindow, newWindow, !oldWindowESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindow( NotificationChain msgs ) {
        DateTimeInterval oldWindow = window;
        window = null;
        boolean oldWindowESet = windowESet;
        windowESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TIME_POINT__WINDOW, oldWindow, null, oldWindowESet );
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
    public void unsetWindow() {
        if( window != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) window ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TIME_POINT__WINDOW, null, msgs );
            msgs = basicUnsetWindow( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindowESet = windowESet;
            windowESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TIME_POINT__WINDOW, null, null, oldWindowESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindow() {
        return windowESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TimeSchedule getTimeSchedule() {
        return timeSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTimeSchedule( TimeSchedule newTimeSchedule, NotificationChain msgs ) {
        TimeSchedule oldTimeSchedule = timeSchedule;
        timeSchedule = newTimeSchedule;
        boolean oldTimeScheduleESet = timeScheduleESet;
        timeScheduleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TIME_POINT__TIME_SCHEDULE, oldTimeSchedule, newTimeSchedule, !oldTimeScheduleESet );
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
    public void setTimeSchedule( TimeSchedule newTimeSchedule ) {
        if( newTimeSchedule != timeSchedule ) {
            NotificationChain msgs = null;
            if( timeSchedule != null ) msgs = ( ( InternalEObject ) timeSchedule ).eInverseRemove( this,
                    CimPackage.TIME_SCHEDULE__TIME_POINTS, TimeSchedule.class, msgs );
            if( newTimeSchedule != null ) msgs = ( ( InternalEObject ) newTimeSchedule ).eInverseAdd( this,
                    CimPackage.TIME_SCHEDULE__TIME_POINTS, TimeSchedule.class, msgs );
            msgs = basicSetTimeSchedule( newTimeSchedule, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTimeScheduleESet = timeScheduleESet;
            timeScheduleESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TIME_POINT__TIME_SCHEDULE, newTimeSchedule, newTimeSchedule, !oldTimeScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTimeSchedule( NotificationChain msgs ) {
        TimeSchedule oldTimeSchedule = timeSchedule;
        timeSchedule = null;
        boolean oldTimeScheduleESet = timeScheduleESet;
        timeScheduleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TIME_POINT__TIME_SCHEDULE, oldTimeSchedule, null, oldTimeScheduleESet );
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
    public void unsetTimeSchedule() {
        if( timeSchedule != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) timeSchedule ).eInverseRemove( this, CimPackage.TIME_SCHEDULE__TIME_POINTS,
                    TimeSchedule.class, msgs );
            msgs = basicUnsetTimeSchedule( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTimeScheduleESet = timeScheduleESet;
            timeScheduleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TIME_POINT__TIME_SCHEDULE, null, null, oldTimeScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeSchedule() {
        return timeScheduleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TIME_POINT__TIME_SCHEDULE:
            if( timeSchedule != null ) msgs = ( ( InternalEObject ) timeSchedule ).eInverseRemove( this,
                    CimPackage.TIME_SCHEDULE__TIME_POINTS, TimeSchedule.class, msgs );
            return basicSetTimeSchedule( ( TimeSchedule ) otherEnd, msgs );
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
        case CimPackage.TIME_POINT__STATUS:
            return basicUnsetStatus( msgs );
        case CimPackage.TIME_POINT__WINDOW:
            return basicUnsetWindow( msgs );
        case CimPackage.TIME_POINT__TIME_SCHEDULE:
            return basicUnsetTimeSchedule( msgs );
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
        case CimPackage.TIME_POINT__DATE_TIME:
            return getDateTime();
        case CimPackage.TIME_POINT__RELATIVE_TIME_INTERVAL:
            return getRelativeTimeInterval();
        case CimPackage.TIME_POINT__SEQUENCE_NUMBER:
            return getSequenceNumber();
        case CimPackage.TIME_POINT__STATUS:
            return getStatus();
        case CimPackage.TIME_POINT__WINDOW:
            return getWindow();
        case CimPackage.TIME_POINT__TIME_SCHEDULE:
            return getTimeSchedule();
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
        case CimPackage.TIME_POINT__DATE_TIME:
            setDateTime( ( Date ) newValue );
            return;
        case CimPackage.TIME_POINT__RELATIVE_TIME_INTERVAL:
            setRelativeTimeInterval( ( Float ) newValue );
            return;
        case CimPackage.TIME_POINT__SEQUENCE_NUMBER:
            setSequenceNumber( ( Integer ) newValue );
            return;
        case CimPackage.TIME_POINT__STATUS:
            setStatus( ( Status ) newValue );
            return;
        case CimPackage.TIME_POINT__WINDOW:
            setWindow( ( DateTimeInterval ) newValue );
            return;
        case CimPackage.TIME_POINT__TIME_SCHEDULE:
            setTimeSchedule( ( TimeSchedule ) newValue );
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
        case CimPackage.TIME_POINT__DATE_TIME:
            unsetDateTime();
            return;
        case CimPackage.TIME_POINT__RELATIVE_TIME_INTERVAL:
            unsetRelativeTimeInterval();
            return;
        case CimPackage.TIME_POINT__SEQUENCE_NUMBER:
            unsetSequenceNumber();
            return;
        case CimPackage.TIME_POINT__STATUS:
            unsetStatus();
            return;
        case CimPackage.TIME_POINT__WINDOW:
            unsetWindow();
            return;
        case CimPackage.TIME_POINT__TIME_SCHEDULE:
            unsetTimeSchedule();
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
        case CimPackage.TIME_POINT__DATE_TIME:
            return isSetDateTime();
        case CimPackage.TIME_POINT__RELATIVE_TIME_INTERVAL:
            return isSetRelativeTimeInterval();
        case CimPackage.TIME_POINT__SEQUENCE_NUMBER:
            return isSetSequenceNumber();
        case CimPackage.TIME_POINT__STATUS:
            return isSetStatus();
        case CimPackage.TIME_POINT__WINDOW:
            return isSetWindow();
        case CimPackage.TIME_POINT__TIME_SCHEDULE:
            return isSetTimeSchedule();
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
        result.append( " (dateTime: " );
        if( dateTimeESet )
            result.append( dateTime );
        else
            result.append( "<unset>" );
        result.append( ", relativeTimeInterval: " );
        if( relativeTimeIntervalESet )
            result.append( relativeTimeInterval );
        else
            result.append( "<unset>" );
        result.append( ", sequenceNumber: " );
        if( sequenceNumberESet )
            result.append( sequenceNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TimePointImpl
