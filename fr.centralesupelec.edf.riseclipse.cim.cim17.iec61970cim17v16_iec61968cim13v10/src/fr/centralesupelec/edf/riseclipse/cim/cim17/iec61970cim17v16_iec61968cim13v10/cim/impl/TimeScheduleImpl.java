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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimePoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeSchedule;

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
 * An implementation of the model object '<em><b>Time Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimeScheduleImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimeScheduleImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimeScheduleImpl#getRecurrencePattern <em>Recurrence Pattern</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimeScheduleImpl#getRecurrencePeriod <em>Recurrence Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimeScheduleImpl#getScheduleInterval <em>Schedule Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimeScheduleImpl#getTimePoints <em>Time Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeScheduleImpl extends DocumentImpl implements TimeSchedule {
    /**
     * The default value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisabled()
     * @generated
     * @ordered
     */
    protected static final Boolean DISABLED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisabled()
     * @generated
     * @ordered
     */
    protected Boolean disabled = DISABLED_EDEFAULT;

    /**
     * This is true if the Disabled attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean disabledESet;

    /**
     * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
    protected static final Float OFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
    protected Float offset = OFFSET_EDEFAULT;

    /**
     * This is true if the Offset attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean offsetESet;

    /**
     * The default value of the '{@link #getRecurrencePattern() <em>Recurrence Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecurrencePattern()
     * @generated
     * @ordered
     */
    protected static final String RECURRENCE_PATTERN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRecurrencePattern() <em>Recurrence Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecurrencePattern()
     * @generated
     * @ordered
     */
    protected String recurrencePattern = RECURRENCE_PATTERN_EDEFAULT;

    /**
     * This is true if the Recurrence Pattern attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean recurrencePatternESet;

    /**
     * The default value of the '{@link #getRecurrencePeriod() <em>Recurrence Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecurrencePeriod()
     * @generated
     * @ordered
     */
    protected static final Float RECURRENCE_PERIOD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRecurrencePeriod() <em>Recurrence Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecurrencePeriod()
     * @generated
     * @ordered
     */
    protected Float recurrencePeriod = RECURRENCE_PERIOD_EDEFAULT;

    /**
     * This is true if the Recurrence Period attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean recurrencePeriodESet;

    /**
     * The cached value of the '{@link #getScheduleInterval() <em>Schedule Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScheduleInterval()
     * @generated
     * @ordered
     */
    protected DateTimeInterval scheduleInterval;

    /**
     * This is true if the Schedule Interval containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean scheduleIntervalESet;

    /**
     * The cached value of the '{@link #getTimePoints() <em>Time Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimePoints()
     * @generated
     * @ordered
     */
    protected EList< TimePoint > timePoints;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimeScheduleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTimeSchedule();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDisabled( Boolean newDisabled ) {
        Boolean oldDisabled = disabled;
        disabled = newDisabled;
        boolean oldDisabledESet = disabledESet;
        disabledESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TIME_SCHEDULE__DISABLED, oldDisabled, disabled, !oldDisabledESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDisabled() {
        Boolean oldDisabled = disabled;
        boolean oldDisabledESet = disabledESet;
        disabled = DISABLED_EDEFAULT;
        disabledESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TIME_SCHEDULE__DISABLED, oldDisabled, DISABLED_EDEFAULT, oldDisabledESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDisabled() {
        return disabledESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOffset() {
        return offset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOffset( Float newOffset ) {
        Float oldOffset = offset;
        offset = newOffset;
        boolean oldOffsetESet = offsetESet;
        offsetESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TIME_SCHEDULE__OFFSET, oldOffset, offset, !oldOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOffset() {
        Float oldOffset = offset;
        boolean oldOffsetESet = offsetESet;
        offset = OFFSET_EDEFAULT;
        offsetESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TIME_SCHEDULE__OFFSET, oldOffset, OFFSET_EDEFAULT, oldOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOffset() {
        return offsetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRecurrencePattern() {
        return recurrencePattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRecurrencePattern( String newRecurrencePattern ) {
        String oldRecurrencePattern = recurrencePattern;
        recurrencePattern = newRecurrencePattern;
        boolean oldRecurrencePatternESet = recurrencePatternESet;
        recurrencePatternESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TIME_SCHEDULE__RECURRENCE_PATTERN,
                    oldRecurrencePattern, recurrencePattern, !oldRecurrencePatternESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRecurrencePattern() {
        String oldRecurrencePattern = recurrencePattern;
        boolean oldRecurrencePatternESet = recurrencePatternESet;
        recurrencePattern = RECURRENCE_PATTERN_EDEFAULT;
        recurrencePatternESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TIME_SCHEDULE__RECURRENCE_PATTERN,
                    oldRecurrencePattern, RECURRENCE_PATTERN_EDEFAULT, oldRecurrencePatternESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRecurrencePattern() {
        return recurrencePatternESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRecurrencePeriod() {
        return recurrencePeriod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRecurrencePeriod( Float newRecurrencePeriod ) {
        Float oldRecurrencePeriod = recurrencePeriod;
        recurrencePeriod = newRecurrencePeriod;
        boolean oldRecurrencePeriodESet = recurrencePeriodESet;
        recurrencePeriodESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TIME_SCHEDULE__RECURRENCE_PERIOD,
                    oldRecurrencePeriod, recurrencePeriod, !oldRecurrencePeriodESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRecurrencePeriod() {
        Float oldRecurrencePeriod = recurrencePeriod;
        boolean oldRecurrencePeriodESet = recurrencePeriodESet;
        recurrencePeriod = RECURRENCE_PERIOD_EDEFAULT;
        recurrencePeriodESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TIME_SCHEDULE__RECURRENCE_PERIOD,
                    oldRecurrencePeriod, RECURRENCE_PERIOD_EDEFAULT, oldRecurrencePeriodESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRecurrencePeriod() {
        return recurrencePeriodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval getScheduleInterval() {
        return scheduleInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetScheduleInterval( DateTimeInterval newScheduleInterval, NotificationChain msgs ) {
        DateTimeInterval oldScheduleInterval = scheduleInterval;
        scheduleInterval = newScheduleInterval;
        boolean oldScheduleIntervalESet = scheduleIntervalESet;
        scheduleIntervalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL, oldScheduleInterval, newScheduleInterval,
                    !oldScheduleIntervalESet );
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
    public void setScheduleInterval( DateTimeInterval newScheduleInterval ) {
        if( newScheduleInterval != scheduleInterval ) {
            NotificationChain msgs = null;
            if( scheduleInterval != null ) msgs = ( ( InternalEObject ) scheduleInterval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL, null, msgs );
            if( newScheduleInterval != null ) msgs = ( ( InternalEObject ) newScheduleInterval ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL, null, msgs );
            msgs = basicSetScheduleInterval( newScheduleInterval, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldScheduleIntervalESet = scheduleIntervalESet;
            scheduleIntervalESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL,
                        newScheduleInterval, newScheduleInterval, !oldScheduleIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetScheduleInterval( NotificationChain msgs ) {
        DateTimeInterval oldScheduleInterval = scheduleInterval;
        scheduleInterval = null;
        boolean oldScheduleIntervalESet = scheduleIntervalESet;
        scheduleIntervalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL, oldScheduleInterval, null, oldScheduleIntervalESet );
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
    public void unsetScheduleInterval() {
        if( scheduleInterval != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) scheduleInterval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL, null, msgs );
            msgs = basicUnsetScheduleInterval( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldScheduleIntervalESet = scheduleIntervalESet;
            scheduleIntervalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL, null, null, oldScheduleIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetScheduleInterval() {
        return scheduleIntervalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TimePoint > getTimePoints() {
        if( timePoints == null ) {
            timePoints = new EObjectWithInverseResolvingEList.Unsettable< TimePoint >( TimePoint.class, this,
                    CimPackage.TIME_SCHEDULE__TIME_POINTS, CimPackage.TIME_POINT__TIME_SCHEDULE );
        }
        return timePoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimePoints() {
        if( timePoints != null ) ( ( InternalEList.Unsettable< ? > ) timePoints ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimePoints() {
        return timePoints != null && ( ( InternalEList.Unsettable< ? > ) timePoints ).isSet();
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
        case CimPackage.TIME_SCHEDULE__TIME_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTimePoints() ).basicAdd( otherEnd,
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
        case CimPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL:
            return basicUnsetScheduleInterval( msgs );
        case CimPackage.TIME_SCHEDULE__TIME_POINTS:
            return ( ( InternalEList< ? > ) getTimePoints() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.TIME_SCHEDULE__DISABLED:
            return getDisabled();
        case CimPackage.TIME_SCHEDULE__OFFSET:
            return getOffset();
        case CimPackage.TIME_SCHEDULE__RECURRENCE_PATTERN:
            return getRecurrencePattern();
        case CimPackage.TIME_SCHEDULE__RECURRENCE_PERIOD:
            return getRecurrencePeriod();
        case CimPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL:
            return getScheduleInterval();
        case CimPackage.TIME_SCHEDULE__TIME_POINTS:
            return getTimePoints();
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
        case CimPackage.TIME_SCHEDULE__DISABLED:
            setDisabled( ( Boolean ) newValue );
            return;
        case CimPackage.TIME_SCHEDULE__OFFSET:
            setOffset( ( Float ) newValue );
            return;
        case CimPackage.TIME_SCHEDULE__RECURRENCE_PATTERN:
            setRecurrencePattern( ( String ) newValue );
            return;
        case CimPackage.TIME_SCHEDULE__RECURRENCE_PERIOD:
            setRecurrencePeriod( ( Float ) newValue );
            return;
        case CimPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL:
            setScheduleInterval( ( DateTimeInterval ) newValue );
            return;
        case CimPackage.TIME_SCHEDULE__TIME_POINTS:
            getTimePoints().clear();
            getTimePoints().addAll( ( Collection< ? extends TimePoint > ) newValue );
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
        case CimPackage.TIME_SCHEDULE__DISABLED:
            unsetDisabled();
            return;
        case CimPackage.TIME_SCHEDULE__OFFSET:
            unsetOffset();
            return;
        case CimPackage.TIME_SCHEDULE__RECURRENCE_PATTERN:
            unsetRecurrencePattern();
            return;
        case CimPackage.TIME_SCHEDULE__RECURRENCE_PERIOD:
            unsetRecurrencePeriod();
            return;
        case CimPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL:
            unsetScheduleInterval();
            return;
        case CimPackage.TIME_SCHEDULE__TIME_POINTS:
            unsetTimePoints();
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
        case CimPackage.TIME_SCHEDULE__DISABLED:
            return isSetDisabled();
        case CimPackage.TIME_SCHEDULE__OFFSET:
            return isSetOffset();
        case CimPackage.TIME_SCHEDULE__RECURRENCE_PATTERN:
            return isSetRecurrencePattern();
        case CimPackage.TIME_SCHEDULE__RECURRENCE_PERIOD:
            return isSetRecurrencePeriod();
        case CimPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL:
            return isSetScheduleInterval();
        case CimPackage.TIME_SCHEDULE__TIME_POINTS:
            return isSetTimePoints();
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
        result.append( " (disabled: " );
        if( disabledESet )
            result.append( disabled );
        else
            result.append( "<unset>" );
        result.append( ", offset: " );
        if( offsetESet )
            result.append( offset );
        else
            result.append( "<unset>" );
        result.append( ", recurrencePattern: " );
        if( recurrencePatternESet )
            result.append( recurrencePattern );
        else
            result.append( "<unset>" );
        result.append( ", recurrencePeriod: " );
        if( recurrencePeriodESet )
            result.append( recurrencePeriod );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TimeScheduleImpl
