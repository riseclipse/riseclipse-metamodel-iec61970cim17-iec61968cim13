/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValue;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValueQuality;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValueSource;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteSource;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Measurement Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementValueImpl#getSensorAccuracy <em>Sensor Accuracy</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementValueImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementValueImpl#getCalculationMethodHierarchy <em>Calculation Method Hierarchy</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementValueImpl#getMeasurementValueSource <em>Measurement Value Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementValueImpl#getProcedureDataSet <em>Procedure Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementValueImpl#getRemoteSource <em>Remote Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementValueImpl#getMeasurementValueQuality <em>Measurement Value Quality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementValueImpl extends IOPointImpl implements MeasurementValue {
    /**
     * The default value of the '{@link #getSensorAccuracy() <em>Sensor Accuracy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSensorAccuracy()
     * @generated
     * @ordered
     */
    protected static final Float SENSOR_ACCURACY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSensorAccuracy() <em>Sensor Accuracy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSensorAccuracy()
     * @generated
     * @ordered
     */
    protected Float sensorAccuracy = SENSOR_ACCURACY_EDEFAULT;

    /**
     * This is true if the Sensor Accuracy attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sensorAccuracyESet;

    /**
     * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStamp()
     * @generated
     * @ordered
     */
    protected static final Date TIME_STAMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStamp()
     * @generated
     * @ordered
     */
    protected Date timeStamp = TIME_STAMP_EDEFAULT;

    /**
     * This is true if the Time Stamp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeStampESet;

    /**
     * The cached value of the '{@link #getCalculationMethodHierarchy() <em>Calculation Method Hierarchy</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculationMethodHierarchy()
     * @generated
     * @ordered
     */
    protected CalculationMethodHierarchy calculationMethodHierarchy;

    /**
     * This is true if the Calculation Method Hierarchy reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean calculationMethodHierarchyESet;

    /**
     * The cached value of the '{@link #getMeasurementValueSource() <em>Measurement Value Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementValueSource()
     * @generated
     * @ordered
     */
    protected MeasurementValueSource measurementValueSource;

    /**
     * This is true if the Measurement Value Source reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean measurementValueSourceESet;

    /**
     * The cached value of the '{@link #getProcedureDataSet() <em>Procedure Data Set</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcedureDataSet()
     * @generated
     * @ordered
     */
    protected EList< ProcedureDataSet > procedureDataSet;

    /**
     * The cached value of the '{@link #getRemoteSource() <em>Remote Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteSource()
     * @generated
     * @ordered
     */
    protected RemoteSource remoteSource;

    /**
     * This is true if the Remote Source reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean remoteSourceESet;

    /**
     * The cached value of the '{@link #getMeasurementValueQuality() <em>Measurement Value Quality</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementValueQuality()
     * @generated
     * @ordered
     */
    protected MeasurementValueQuality measurementValueQuality;

    /**
     * This is true if the Measurement Value Quality reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean measurementValueQualityESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasurementValueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMeasurementValue();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSensorAccuracy() {
        return sensorAccuracy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSensorAccuracy( Float newSensorAccuracy ) {
        Float oldSensorAccuracy = sensorAccuracy;
        sensorAccuracy = newSensorAccuracy;
        boolean oldSensorAccuracyESet = sensorAccuracyESet;
        sensorAccuracyESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY,
                    oldSensorAccuracy, sensorAccuracy, !oldSensorAccuracyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSensorAccuracy() {
        Float oldSensorAccuracy = sensorAccuracy;
        boolean oldSensorAccuracyESet = sensorAccuracyESet;
        sensorAccuracy = SENSOR_ACCURACY_EDEFAULT;
        sensorAccuracyESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY,
                    oldSensorAccuracy, SENSOR_ACCURACY_EDEFAULT, oldSensorAccuracyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSensorAccuracy() {
        return sensorAccuracyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getTimeStamp() {
        return timeStamp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTimeStamp( Date newTimeStamp ) {
        Date oldTimeStamp = timeStamp;
        timeStamp = newTimeStamp;
        boolean oldTimeStampESet = timeStampESet;
        timeStampESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MEASUREMENT_VALUE__TIME_STAMP, oldTimeStamp, timeStamp, !oldTimeStampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeStamp() {
        Date oldTimeStamp = timeStamp;
        boolean oldTimeStampESet = timeStampESet;
        timeStamp = TIME_STAMP_EDEFAULT;
        timeStampESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MEASUREMENT_VALUE__TIME_STAMP, oldTimeStamp, TIME_STAMP_EDEFAULT, oldTimeStampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeStamp() {
        return timeStampESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CalculationMethodHierarchy getCalculationMethodHierarchy() {
        return calculationMethodHierarchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCalculationMethodHierarchy(
            CalculationMethodHierarchy newCalculationMethodHierarchy, NotificationChain msgs ) {
        CalculationMethodHierarchy oldCalculationMethodHierarchy = calculationMethodHierarchy;
        calculationMethodHierarchy = newCalculationMethodHierarchy;
        boolean oldCalculationMethodHierarchyESet = calculationMethodHierarchyESet;
        calculationMethodHierarchyESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT_VALUE__CALCULATION_METHOD_HIERARCHY, oldCalculationMethodHierarchy,
                    newCalculationMethodHierarchy, !oldCalculationMethodHierarchyESet );
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
    public void setCalculationMethodHierarchy( CalculationMethodHierarchy newCalculationMethodHierarchy ) {
        if( newCalculationMethodHierarchy != calculationMethodHierarchy ) {
            NotificationChain msgs = null;
            if( calculationMethodHierarchy != null )
                msgs = ( ( InternalEObject ) calculationMethodHierarchy ).eInverseRemove( this,
                        CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT_VALUE, CalculationMethodHierarchy.class,
                        msgs );
            if( newCalculationMethodHierarchy != null )
                msgs = ( ( InternalEObject ) newCalculationMethodHierarchy ).eInverseAdd( this,
                        CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT_VALUE, CalculationMethodHierarchy.class,
                        msgs );
            msgs = basicSetCalculationMethodHierarchy( newCalculationMethodHierarchy, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCalculationMethodHierarchyESet = calculationMethodHierarchyESet;
            calculationMethodHierarchyESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT_VALUE__CALCULATION_METHOD_HIERARCHY, newCalculationMethodHierarchy,
                    newCalculationMethodHierarchy, !oldCalculationMethodHierarchyESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCalculationMethodHierarchy( NotificationChain msgs ) {
        CalculationMethodHierarchy oldCalculationMethodHierarchy = calculationMethodHierarchy;
        calculationMethodHierarchy = null;
        boolean oldCalculationMethodHierarchyESet = calculationMethodHierarchyESet;
        calculationMethodHierarchyESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT_VALUE__CALCULATION_METHOD_HIERARCHY, oldCalculationMethodHierarchy, null,
                    oldCalculationMethodHierarchyESet );
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
    public void unsetCalculationMethodHierarchy() {
        if( calculationMethodHierarchy != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) calculationMethodHierarchy ).eInverseRemove( this,
                    CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT_VALUE, CalculationMethodHierarchy.class,
                    msgs );
            msgs = basicUnsetCalculationMethodHierarchy( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCalculationMethodHierarchyESet = calculationMethodHierarchyESet;
            calculationMethodHierarchyESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT_VALUE__CALCULATION_METHOD_HIERARCHY, null, null,
                    oldCalculationMethodHierarchyESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCalculationMethodHierarchy() {
        return calculationMethodHierarchyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasurementValueSource getMeasurementValueSource() {
        return measurementValueSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMeasurementValueSource( MeasurementValueSource newMeasurementValueSource,
            NotificationChain msgs ) {
        MeasurementValueSource oldMeasurementValueSource = measurementValueSource;
        measurementValueSource = newMeasurementValueSource;
        boolean oldMeasurementValueSourceESet = measurementValueSourceESet;
        measurementValueSourceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE, oldMeasurementValueSource,
                    newMeasurementValueSource, !oldMeasurementValueSourceESet );
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
    public void setMeasurementValueSource( MeasurementValueSource newMeasurementValueSource ) {
        if( newMeasurementValueSource != measurementValueSource ) {
            NotificationChain msgs = null;
            if( measurementValueSource != null )
                msgs = ( ( InternalEObject ) measurementValueSource ).eInverseRemove( this,
                        CimPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs );
            if( newMeasurementValueSource != null )
                msgs = ( ( InternalEObject ) newMeasurementValueSource ).eInverseAdd( this,
                        CimPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs );
            msgs = basicSetMeasurementValueSource( newMeasurementValueSource, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeasurementValueSourceESet = measurementValueSourceESet;
            measurementValueSourceESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE, newMeasurementValueSource,
                    newMeasurementValueSource, !oldMeasurementValueSourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMeasurementValueSource( NotificationChain msgs ) {
        MeasurementValueSource oldMeasurementValueSource = measurementValueSource;
        measurementValueSource = null;
        boolean oldMeasurementValueSourceESet = measurementValueSourceESet;
        measurementValueSourceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE, oldMeasurementValueSource, null,
                    oldMeasurementValueSourceESet );
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
    public void unsetMeasurementValueSource() {
        if( measurementValueSource != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) measurementValueSource ).eInverseRemove( this,
                    CimPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs );
            msgs = basicUnsetMeasurementValueSource( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeasurementValueSourceESet = measurementValueSourceESet;
            measurementValueSourceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE, null, null,
                    oldMeasurementValueSourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurementValueSource() {
        return measurementValueSourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ProcedureDataSet > getProcedureDataSet() {
        if( procedureDataSet == null ) {
            procedureDataSet = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< ProcedureDataSet >(
                    ProcedureDataSet.class, this, CimPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SET,
                    CimPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUE );
        }
        return procedureDataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProcedureDataSet() {
        if( procedureDataSet != null ) ( ( InternalEList.Unsettable< ? > ) procedureDataSet ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProcedureDataSet() {
        return procedureDataSet != null && ( ( InternalEList.Unsettable< ? > ) procedureDataSet ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemoteSource getRemoteSource() {
        return remoteSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRemoteSource( RemoteSource newRemoteSource, NotificationChain msgs ) {
        RemoteSource oldRemoteSource = remoteSource;
        remoteSource = newRemoteSource;
        boolean oldRemoteSourceESet = remoteSourceESet;
        remoteSourceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, oldRemoteSource, newRemoteSource,
                    !oldRemoteSourceESet );
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
    public void setRemoteSource( RemoteSource newRemoteSource ) {
        if( newRemoteSource != remoteSource ) {
            NotificationChain msgs = null;
            if( remoteSource != null ) msgs = ( ( InternalEObject ) remoteSource ).eInverseRemove( this,
                    CimPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, RemoteSource.class, msgs );
            if( newRemoteSource != null ) msgs = ( ( InternalEObject ) newRemoteSource ).eInverseAdd( this,
                    CimPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, RemoteSource.class, msgs );
            msgs = basicSetRemoteSource( newRemoteSource, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRemoteSourceESet = remoteSourceESet;
            remoteSourceESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MEASUREMENT_VALUE__REMOTE_SOURCE,
                        newRemoteSource, newRemoteSource, !oldRemoteSourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRemoteSource( NotificationChain msgs ) {
        RemoteSource oldRemoteSource = remoteSource;
        remoteSource = null;
        boolean oldRemoteSourceESet = remoteSourceESet;
        remoteSourceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, oldRemoteSource, null, oldRemoteSourceESet );
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
    public void unsetRemoteSource() {
        if( remoteSource != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) remoteSource ).eInverseRemove( this,
                    CimPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, RemoteSource.class, msgs );
            msgs = basicUnsetRemoteSource( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRemoteSourceESet = remoteSourceESet;
            remoteSourceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, null, null, oldRemoteSourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemoteSource() {
        return remoteSourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasurementValueQuality getMeasurementValueQuality() {
        return measurementValueQuality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMeasurementValueQuality( MeasurementValueQuality newMeasurementValueQuality,
            NotificationChain msgs ) {
        MeasurementValueQuality oldMeasurementValueQuality = measurementValueQuality;
        measurementValueQuality = newMeasurementValueQuality;
        boolean oldMeasurementValueQualityESet = measurementValueQualityESet;
        measurementValueQualityESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, oldMeasurementValueQuality,
                    newMeasurementValueQuality, !oldMeasurementValueQualityESet );
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
    public void setMeasurementValueQuality( MeasurementValueQuality newMeasurementValueQuality ) {
        if( newMeasurementValueQuality != measurementValueQuality ) {
            NotificationChain msgs = null;
            if( measurementValueQuality != null )
                msgs = ( ( InternalEObject ) measurementValueQuality ).eInverseRemove( this,
                        CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, MeasurementValueQuality.class, msgs );
            if( newMeasurementValueQuality != null )
                msgs = ( ( InternalEObject ) newMeasurementValueQuality ).eInverseAdd( this,
                        CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, MeasurementValueQuality.class, msgs );
            msgs = basicSetMeasurementValueQuality( newMeasurementValueQuality, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeasurementValueQualityESet = measurementValueQualityESet;
            measurementValueQualityESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, newMeasurementValueQuality,
                    newMeasurementValueQuality, !oldMeasurementValueQualityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMeasurementValueQuality( NotificationChain msgs ) {
        MeasurementValueQuality oldMeasurementValueQuality = measurementValueQuality;
        measurementValueQuality = null;
        boolean oldMeasurementValueQualityESet = measurementValueQualityESet;
        measurementValueQualityESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, oldMeasurementValueQuality, null,
                    oldMeasurementValueQualityESet );
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
    public void unsetMeasurementValueQuality() {
        if( measurementValueQuality != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) measurementValueQuality ).eInverseRemove( this,
                    CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, MeasurementValueQuality.class, msgs );
            msgs = basicUnsetMeasurementValueQuality( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeasurementValueQualityESet = measurementValueQualityESet;
            measurementValueQualityESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, null, null,
                    oldMeasurementValueQualityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurementValueQuality() {
        return measurementValueQualityESet;
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
        case CimPackage.MEASUREMENT_VALUE__CALCULATION_METHOD_HIERARCHY:
            if( calculationMethodHierarchy != null )
                msgs = ( ( InternalEObject ) calculationMethodHierarchy ).eInverseRemove( this,
                        CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT_VALUE, CalculationMethodHierarchy.class,
                        msgs );
            return basicSetCalculationMethodHierarchy( ( CalculationMethodHierarchy ) otherEnd, msgs );
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
            if( measurementValueSource != null )
                msgs = ( ( InternalEObject ) measurementValueSource ).eInverseRemove( this,
                        CimPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs );
            return basicSetMeasurementValueSource( ( MeasurementValueSource ) otherEnd, msgs );
        case CimPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SET:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProcedureDataSet() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
            if( remoteSource != null ) msgs = ( ( InternalEObject ) remoteSource ).eInverseRemove( this,
                    CimPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, RemoteSource.class, msgs );
            return basicSetRemoteSource( ( RemoteSource ) otherEnd, msgs );
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
            if( measurementValueQuality != null )
                msgs = ( ( InternalEObject ) measurementValueQuality ).eInverseRemove( this,
                        CimPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, MeasurementValueQuality.class, msgs );
            return basicSetMeasurementValueQuality( ( MeasurementValueQuality ) otherEnd, msgs );
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
        case CimPackage.MEASUREMENT_VALUE__CALCULATION_METHOD_HIERARCHY:
            return basicUnsetCalculationMethodHierarchy( msgs );
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
            return basicUnsetMeasurementValueSource( msgs );
        case CimPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SET:
            return ( ( InternalEList< ? > ) getProcedureDataSet() ).basicRemove( otherEnd, msgs );
        case CimPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
            return basicUnsetRemoteSource( msgs );
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
            return basicUnsetMeasurementValueQuality( msgs );
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
        case CimPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
            return getSensorAccuracy();
        case CimPackage.MEASUREMENT_VALUE__TIME_STAMP:
            return getTimeStamp();
        case CimPackage.MEASUREMENT_VALUE__CALCULATION_METHOD_HIERARCHY:
            return getCalculationMethodHierarchy();
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
            return getMeasurementValueSource();
        case CimPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SET:
            return getProcedureDataSet();
        case CimPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
            return getRemoteSource();
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
            return getMeasurementValueQuality();
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
        case CimPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
            setSensorAccuracy( ( Float ) newValue );
            return;
        case CimPackage.MEASUREMENT_VALUE__TIME_STAMP:
            setTimeStamp( ( Date ) newValue );
            return;
        case CimPackage.MEASUREMENT_VALUE__CALCULATION_METHOD_HIERARCHY:
            setCalculationMethodHierarchy( ( CalculationMethodHierarchy ) newValue );
            return;
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
            setMeasurementValueSource( ( MeasurementValueSource ) newValue );
            return;
        case CimPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SET:
            getProcedureDataSet().clear();
            getProcedureDataSet().addAll( ( Collection< ? extends ProcedureDataSet > ) newValue );
            return;
        case CimPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
            setRemoteSource( ( RemoteSource ) newValue );
            return;
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
            setMeasurementValueQuality( ( MeasurementValueQuality ) newValue );
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
        case CimPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
            unsetSensorAccuracy();
            return;
        case CimPackage.MEASUREMENT_VALUE__TIME_STAMP:
            unsetTimeStamp();
            return;
        case CimPackage.MEASUREMENT_VALUE__CALCULATION_METHOD_HIERARCHY:
            unsetCalculationMethodHierarchy();
            return;
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
            unsetMeasurementValueSource();
            return;
        case CimPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SET:
            unsetProcedureDataSet();
            return;
        case CimPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
            unsetRemoteSource();
            return;
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
            unsetMeasurementValueQuality();
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
        case CimPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
            return isSetSensorAccuracy();
        case CimPackage.MEASUREMENT_VALUE__TIME_STAMP:
            return isSetTimeStamp();
        case CimPackage.MEASUREMENT_VALUE__CALCULATION_METHOD_HIERARCHY:
            return isSetCalculationMethodHierarchy();
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
            return isSetMeasurementValueSource();
        case CimPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SET:
            return isSetProcedureDataSet();
        case CimPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
            return isSetRemoteSource();
        case CimPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
            return isSetMeasurementValueQuality();
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
        result.append( " (sensorAccuracy: " );
        if( sensorAccuracyESet )
            result.append( sensorAccuracy );
        else
            result.append( "<unset>" );
        result.append( ", timeStamp: " );
        if( timeStampESet )
            result.append( timeStamp );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //MeasurementValueImpl
