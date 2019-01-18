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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValue;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteSourceImpl#getDeadband <em>Deadband</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteSourceImpl#getScanInterval <em>Scan Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteSourceImpl#getSensorMaximum <em>Sensor Maximum</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteSourceImpl#getSensorMinimum <em>Sensor Minimum</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteSourceImpl#getMeasurementValue <em>Measurement Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoteSourceImpl extends RemotePointImpl implements RemoteSource {
    /**
     * The default value of the '{@link #getDeadband() <em>Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeadband()
     * @generated
     * @ordered
     */
    protected static final Float DEADBAND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDeadband() <em>Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeadband()
     * @generated
     * @ordered
     */
    protected Float deadband = DEADBAND_EDEFAULT;

    /**
     * This is true if the Deadband attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean deadbandESet;

    /**
     * The default value of the '{@link #getScanInterval() <em>Scan Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScanInterval()
     * @generated
     * @ordered
     */
    protected static final Float SCAN_INTERVAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScanInterval() <em>Scan Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScanInterval()
     * @generated
     * @ordered
     */
    protected Float scanInterval = SCAN_INTERVAL_EDEFAULT;

    /**
     * This is true if the Scan Interval attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean scanIntervalESet;

    /**
     * The default value of the '{@link #getSensorMaximum() <em>Sensor Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSensorMaximum()
     * @generated
     * @ordered
     */
    protected static final Float SENSOR_MAXIMUM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSensorMaximum() <em>Sensor Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSensorMaximum()
     * @generated
     * @ordered
     */
    protected Float sensorMaximum = SENSOR_MAXIMUM_EDEFAULT;

    /**
     * This is true if the Sensor Maximum attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sensorMaximumESet;

    /**
     * The default value of the '{@link #getSensorMinimum() <em>Sensor Minimum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSensorMinimum()
     * @generated
     * @ordered
     */
    protected static final Float SENSOR_MINIMUM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSensorMinimum() <em>Sensor Minimum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSensorMinimum()
     * @generated
     * @ordered
     */
    protected Float sensorMinimum = SENSOR_MINIMUM_EDEFAULT;

    /**
     * This is true if the Sensor Minimum attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sensorMinimumESet;

    /**
     * The cached value of the '{@link #getMeasurementValue() <em>Measurement Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementValue()
     * @generated
     * @ordered
     */
    protected MeasurementValue measurementValue;

    /**
     * This is true if the Measurement Value reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean measurementValueESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RemoteSourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRemoteSource();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDeadband() {
        return deadband;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDeadband( Float newDeadband ) {
        Float oldDeadband = deadband;
        deadband = newDeadband;
        boolean oldDeadbandESet = deadbandESet;
        deadbandESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REMOTE_SOURCE__DEADBAND, oldDeadband, deadband, !oldDeadbandESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDeadband() {
        Float oldDeadband = deadband;
        boolean oldDeadbandESet = deadbandESet;
        deadband = DEADBAND_EDEFAULT;
        deadbandESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REMOTE_SOURCE__DEADBAND, oldDeadband, DEADBAND_EDEFAULT, oldDeadbandESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDeadband() {
        return deadbandESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getScanInterval() {
        return scanInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setScanInterval( Float newScanInterval ) {
        Float oldScanInterval = scanInterval;
        scanInterval = newScanInterval;
        boolean oldScanIntervalESet = scanIntervalESet;
        scanIntervalESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REMOTE_SOURCE__SCAN_INTERVAL, oldScanInterval, scanInterval, !oldScanIntervalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetScanInterval() {
        Float oldScanInterval = scanInterval;
        boolean oldScanIntervalESet = scanIntervalESet;
        scanInterval = SCAN_INTERVAL_EDEFAULT;
        scanIntervalESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REMOTE_SOURCE__SCAN_INTERVAL,
                    oldScanInterval, SCAN_INTERVAL_EDEFAULT, oldScanIntervalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetScanInterval() {
        return scanIntervalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSensorMaximum() {
        return sensorMaximum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSensorMaximum( Float newSensorMaximum ) {
        Float oldSensorMaximum = sensorMaximum;
        sensorMaximum = newSensorMaximum;
        boolean oldSensorMaximumESet = sensorMaximumESet;
        sensorMaximumESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REMOTE_SOURCE__SENSOR_MAXIMUM, oldSensorMaximum, sensorMaximum, !oldSensorMaximumESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSensorMaximum() {
        Float oldSensorMaximum = sensorMaximum;
        boolean oldSensorMaximumESet = sensorMaximumESet;
        sensorMaximum = SENSOR_MAXIMUM_EDEFAULT;
        sensorMaximumESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REMOTE_SOURCE__SENSOR_MAXIMUM,
                    oldSensorMaximum, SENSOR_MAXIMUM_EDEFAULT, oldSensorMaximumESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSensorMaximum() {
        return sensorMaximumESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSensorMinimum() {
        return sensorMinimum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSensorMinimum( Float newSensorMinimum ) {
        Float oldSensorMinimum = sensorMinimum;
        sensorMinimum = newSensorMinimum;
        boolean oldSensorMinimumESet = sensorMinimumESet;
        sensorMinimumESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REMOTE_SOURCE__SENSOR_MINIMUM, oldSensorMinimum, sensorMinimum, !oldSensorMinimumESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSensorMinimum() {
        Float oldSensorMinimum = sensorMinimum;
        boolean oldSensorMinimumESet = sensorMinimumESet;
        sensorMinimum = SENSOR_MINIMUM_EDEFAULT;
        sensorMinimumESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REMOTE_SOURCE__SENSOR_MINIMUM,
                    oldSensorMinimum, SENSOR_MINIMUM_EDEFAULT, oldSensorMinimumESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSensorMinimum() {
        return sensorMinimumESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasurementValue getMeasurementValue() {
        if( measurementValue != null && measurementValue.eIsProxy() ) {
            InternalEObject oldMeasurementValue = ( InternalEObject ) measurementValue;
            measurementValue = ( MeasurementValue ) eResolveProxy( oldMeasurementValue );
            if( measurementValue != oldMeasurementValue ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, oldMeasurementValue, measurementValue ) );
            }
        }
        return measurementValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasurementValue basicGetMeasurementValue() {
        return measurementValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMeasurementValue( MeasurementValue newMeasurementValue, NotificationChain msgs ) {
        MeasurementValue oldMeasurementValue = measurementValue;
        measurementValue = newMeasurementValue;
        boolean oldMeasurementValueESet = measurementValueESet;
        measurementValueESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, oldMeasurementValue, newMeasurementValue,
                    !oldMeasurementValueESet );
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
    public void setMeasurementValue( MeasurementValue newMeasurementValue ) {
        if( newMeasurementValue != measurementValue ) {
            NotificationChain msgs = null;
            if( measurementValue != null ) msgs = ( ( InternalEObject ) measurementValue ).eInverseRemove( this,
                    CimPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, MeasurementValue.class, msgs );
            if( newMeasurementValue != null ) msgs = ( ( InternalEObject ) newMeasurementValue ).eInverseAdd( this,
                    CimPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, MeasurementValue.class, msgs );
            msgs = basicSetMeasurementValue( newMeasurementValue, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeasurementValueESet = measurementValueESet;
            measurementValueESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REMOTE_SOURCE__MEASUREMENT_VALUE,
                        newMeasurementValue, newMeasurementValue, !oldMeasurementValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMeasurementValue( NotificationChain msgs ) {
        MeasurementValue oldMeasurementValue = measurementValue;
        measurementValue = null;
        boolean oldMeasurementValueESet = measurementValueESet;
        measurementValueESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, oldMeasurementValue, null, oldMeasurementValueESet );
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
    public void unsetMeasurementValue() {
        if( measurementValue != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) measurementValue ).eInverseRemove( this,
                    CimPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, MeasurementValue.class, msgs );
            msgs = basicUnsetMeasurementValue( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeasurementValueESet = measurementValueESet;
            measurementValueESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, null, null, oldMeasurementValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurementValue() {
        return measurementValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
            if( measurementValue != null ) msgs = ( ( InternalEObject ) measurementValue ).eInverseRemove( this,
                    CimPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, MeasurementValue.class, msgs );
            return basicSetMeasurementValue( ( MeasurementValue ) otherEnd, msgs );
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
        case CimPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
            return basicUnsetMeasurementValue( msgs );
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
        case CimPackage.REMOTE_SOURCE__DEADBAND:
            return getDeadband();
        case CimPackage.REMOTE_SOURCE__SCAN_INTERVAL:
            return getScanInterval();
        case CimPackage.REMOTE_SOURCE__SENSOR_MAXIMUM:
            return getSensorMaximum();
        case CimPackage.REMOTE_SOURCE__SENSOR_MINIMUM:
            return getSensorMinimum();
        case CimPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
            if( resolve ) return getMeasurementValue();
            return basicGetMeasurementValue();
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
        case CimPackage.REMOTE_SOURCE__DEADBAND:
            setDeadband( ( Float ) newValue );
            return;
        case CimPackage.REMOTE_SOURCE__SCAN_INTERVAL:
            setScanInterval( ( Float ) newValue );
            return;
        case CimPackage.REMOTE_SOURCE__SENSOR_MAXIMUM:
            setSensorMaximum( ( Float ) newValue );
            return;
        case CimPackage.REMOTE_SOURCE__SENSOR_MINIMUM:
            setSensorMinimum( ( Float ) newValue );
            return;
        case CimPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
            setMeasurementValue( ( MeasurementValue ) newValue );
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
        case CimPackage.REMOTE_SOURCE__DEADBAND:
            unsetDeadband();
            return;
        case CimPackage.REMOTE_SOURCE__SCAN_INTERVAL:
            unsetScanInterval();
            return;
        case CimPackage.REMOTE_SOURCE__SENSOR_MAXIMUM:
            unsetSensorMaximum();
            return;
        case CimPackage.REMOTE_SOURCE__SENSOR_MINIMUM:
            unsetSensorMinimum();
            return;
        case CimPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
            unsetMeasurementValue();
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
        case CimPackage.REMOTE_SOURCE__DEADBAND:
            return isSetDeadband();
        case CimPackage.REMOTE_SOURCE__SCAN_INTERVAL:
            return isSetScanInterval();
        case CimPackage.REMOTE_SOURCE__SENSOR_MAXIMUM:
            return isSetSensorMaximum();
        case CimPackage.REMOTE_SOURCE__SENSOR_MINIMUM:
            return isSetSensorMinimum();
        case CimPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
            return isSetMeasurementValue();
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
        result.append( " (deadband: " );
        if( deadbandESet )
            result.append( deadband );
        else
            result.append( "<unset>" );
        result.append( ", scanInterval: " );
        if( scanIntervalESet )
            result.append( scanInterval );
        else
            result.append( "<unset>" );
        result.append( ", sensorMaximum: " );
        if( sensorMaximumESet )
            result.append( sensorMaximum );
        else
            result.append( "<unset>" );
        result.append( ", sensorMinimum: " );
        if( sensorMinimumESet )
            result.append( sensorMinimum );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //RemoteSourceImpl
