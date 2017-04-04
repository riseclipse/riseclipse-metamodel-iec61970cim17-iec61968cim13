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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularIntervalSchedule;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IrregularTimePoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Irregular Time Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IrregularTimePointImpl#getTime <em>Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IrregularTimePointImpl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IrregularTimePointImpl#getValue2 <em>Value2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IrregularTimePointImpl#getIntervalSchedule <em>Interval Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IrregularTimePointImpl extends CimObjectWithIDImpl implements IrregularTimePoint {
    /**
     * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTime()
     * @generated
     * @ordered
     */
    protected static final Float TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTime()
     * @generated
     * @ordered
     */
    protected Float time = TIME_EDEFAULT;

    /**
     * This is true if the Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeESet;

    /**
     * The default value of the '{@link #getValue1() <em>Value1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue1()
     * @generated
     * @ordered
     */
    protected static final Float VALUE1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue1() <em>Value1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue1()
     * @generated
     * @ordered
     */
    protected Float value1 = VALUE1_EDEFAULT;

    /**
     * This is true if the Value1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean value1ESet;

    /**
     * The default value of the '{@link #getValue2() <em>Value2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue2()
     * @generated
     * @ordered
     */
    protected static final Float VALUE2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue2() <em>Value2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue2()
     * @generated
     * @ordered
     */
    protected Float value2 = VALUE2_EDEFAULT;

    /**
     * This is true if the Value2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean value2ESet;

    /**
     * The cached value of the '{@link #getIntervalSchedule() <em>Interval Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntervalSchedule()
     * @generated
     * @ordered
     */
    protected IrregularIntervalSchedule intervalSchedule;

    /**
     * This is true if the Interval Schedule reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean intervalScheduleESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IrregularTimePointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getIrregularTimePoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTime() {
        return time;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTime( Float newTime ) {
        Float oldTime = time;
        time = newTime;
        boolean oldTimeESet = timeESet;
        timeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.IRREGULAR_TIME_POINT__TIME, oldTime, time, !oldTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTime() {
        Float oldTime = time;
        boolean oldTimeESet = timeESet;
        time = TIME_EDEFAULT;
        timeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.IRREGULAR_TIME_POINT__TIME, oldTime, TIME_EDEFAULT, oldTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTime() {
        return timeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getValue1() {
        return value1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue1( Float newValue1 ) {
        Float oldValue1 = value1;
        value1 = newValue1;
        boolean oldValue1ESet = value1ESet;
        value1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.IRREGULAR_TIME_POINT__VALUE1, oldValue1, value1, !oldValue1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValue1() {
        Float oldValue1 = value1;
        boolean oldValue1ESet = value1ESet;
        value1 = VALUE1_EDEFAULT;
        value1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.IRREGULAR_TIME_POINT__VALUE1, oldValue1, VALUE1_EDEFAULT, oldValue1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValue1() {
        return value1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getValue2() {
        return value2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue2( Float newValue2 ) {
        Float oldValue2 = value2;
        value2 = newValue2;
        boolean oldValue2ESet = value2ESet;
        value2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.IRREGULAR_TIME_POINT__VALUE2, oldValue2, value2, !oldValue2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValue2() {
        Float oldValue2 = value2;
        boolean oldValue2ESet = value2ESet;
        value2 = VALUE2_EDEFAULT;
        value2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.IRREGULAR_TIME_POINT__VALUE2, oldValue2, VALUE2_EDEFAULT, oldValue2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValue2() {
        return value2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IrregularIntervalSchedule getIntervalSchedule() {
        return intervalSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIntervalSchedule( IrregularIntervalSchedule newIntervalSchedule,
            NotificationChain msgs ) {
        IrregularIntervalSchedule oldIntervalSchedule = intervalSchedule;
        intervalSchedule = newIntervalSchedule;
        boolean oldIntervalScheduleESet = intervalScheduleESet;
        intervalScheduleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE, oldIntervalSchedule, newIntervalSchedule,
                    !oldIntervalScheduleESet );
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
    public void setIntervalSchedule( IrregularIntervalSchedule newIntervalSchedule ) {
        if( newIntervalSchedule != intervalSchedule ) {
            NotificationChain msgs = null;
            if( intervalSchedule != null ) msgs = ( ( InternalEObject ) intervalSchedule ).eInverseRemove( this,
                    CimPackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS, IrregularIntervalSchedule.class, msgs );
            if( newIntervalSchedule != null ) msgs = ( ( InternalEObject ) newIntervalSchedule ).eInverseAdd( this,
                    CimPackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS, IrregularIntervalSchedule.class, msgs );
            msgs = basicSetIntervalSchedule( newIntervalSchedule, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIntervalScheduleESet = intervalScheduleESet;
            intervalScheduleESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE,
                            newIntervalSchedule, newIntervalSchedule, !oldIntervalScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIntervalSchedule( NotificationChain msgs ) {
        IrregularIntervalSchedule oldIntervalSchedule = intervalSchedule;
        intervalSchedule = null;
        boolean oldIntervalScheduleESet = intervalScheduleESet;
        intervalScheduleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE, oldIntervalSchedule, null,
                    oldIntervalScheduleESet );
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
    public void unsetIntervalSchedule() {
        if( intervalSchedule != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) intervalSchedule ).eInverseRemove( this,
                    CimPackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS, IrregularIntervalSchedule.class, msgs );
            msgs = basicUnsetIntervalSchedule( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIntervalScheduleESet = intervalScheduleESet;
            intervalScheduleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE, null, null, oldIntervalScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIntervalSchedule() {
        return intervalScheduleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
            if( intervalSchedule != null ) msgs = ( ( InternalEObject ) intervalSchedule ).eInverseRemove( this,
                    CimPackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS, IrregularIntervalSchedule.class, msgs );
            return basicSetIntervalSchedule( ( IrregularIntervalSchedule ) otherEnd, msgs );
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
        case CimPackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
            return basicUnsetIntervalSchedule( msgs );
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
        case CimPackage.IRREGULAR_TIME_POINT__TIME:
            return getTime();
        case CimPackage.IRREGULAR_TIME_POINT__VALUE1:
            return getValue1();
        case CimPackage.IRREGULAR_TIME_POINT__VALUE2:
            return getValue2();
        case CimPackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
            return getIntervalSchedule();
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
        case CimPackage.IRREGULAR_TIME_POINT__TIME:
            setTime( ( Float ) newValue );
            return;
        case CimPackage.IRREGULAR_TIME_POINT__VALUE1:
            setValue1( ( Float ) newValue );
            return;
        case CimPackage.IRREGULAR_TIME_POINT__VALUE2:
            setValue2( ( Float ) newValue );
            return;
        case CimPackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
            setIntervalSchedule( ( IrregularIntervalSchedule ) newValue );
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
        case CimPackage.IRREGULAR_TIME_POINT__TIME:
            unsetTime();
            return;
        case CimPackage.IRREGULAR_TIME_POINT__VALUE1:
            unsetValue1();
            return;
        case CimPackage.IRREGULAR_TIME_POINT__VALUE2:
            unsetValue2();
            return;
        case CimPackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
            unsetIntervalSchedule();
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
        case CimPackage.IRREGULAR_TIME_POINT__TIME:
            return isSetTime();
        case CimPackage.IRREGULAR_TIME_POINT__VALUE1:
            return isSetValue1();
        case CimPackage.IRREGULAR_TIME_POINT__VALUE2:
            return isSetValue2();
        case CimPackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
            return isSetIntervalSchedule();
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
        result.append( " (time: " );
        if( timeESet )
            result.append( time );
        else
            result.append( "<unset>" );
        result.append( ", value1: " );
        if( value1ESet )
            result.append( value1 );
        else
            result.append( "<unset>" );
        result.append( ", value2: " );
        if( value2ESet )
            result.append( value2 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //IrregularTimePointImpl
