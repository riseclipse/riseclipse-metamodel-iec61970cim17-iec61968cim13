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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalReading;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterReading;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingType;

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
 * An implementation of the model object '<em><b>Interval Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IntervalBlockImpl#getMeterReading <em>Meter Reading</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IntervalBlockImpl#getPendingCalculation <em>Pending Calculation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IntervalBlockImpl#getIntervalReadings <em>Interval Readings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IntervalBlockImpl#getReadingType <em>Reading Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervalBlockImpl extends CimObjectWithIDImpl implements IntervalBlock {
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
     * The cached value of the '{@link #getPendingCalculation() <em>Pending Calculation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPendingCalculation()
     * @generated
     * @ordered
     */
    protected PendingCalculation pendingCalculation;

    /**
     * This is true if the Pending Calculation reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pendingCalculationESet;

    /**
     * The cached value of the '{@link #getIntervalReadings() <em>Interval Readings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntervalReadings()
     * @generated
     * @ordered
     */
    protected EList< IntervalReading > intervalReadings;

    /**
     * The cached value of the '{@link #getReadingType() <em>Reading Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadingType()
     * @generated
     * @ordered
     */
    protected ReadingType readingType;

    /**
     * This is true if the Reading Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean readingTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntervalBlockImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getIntervalBlock();
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
                    CimPackage.INTERVAL_BLOCK__METER_READING, oldMeterReading, newMeterReading, !oldMeterReadingESet );
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
                    CimPackage.METER_READING__INTERVAL_BLOCKS, MeterReading.class, msgs );
            if( newMeterReading != null ) msgs = ( ( InternalEObject ) newMeterReading ).eInverseAdd( this,
                    CimPackage.METER_READING__INTERVAL_BLOCKS, MeterReading.class, msgs );
            msgs = basicSetMeterReading( newMeterReading, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeterReadingESet = meterReadingESet;
            meterReadingESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.INTERVAL_BLOCK__METER_READING,
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
                    CimPackage.INTERVAL_BLOCK__METER_READING, oldMeterReading, null, oldMeterReadingESet );
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
            msgs = ( ( InternalEObject ) meterReading ).eInverseRemove( this, CimPackage.METER_READING__INTERVAL_BLOCKS,
                    MeterReading.class, msgs );
            msgs = basicUnsetMeterReading( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeterReadingESet = meterReadingESet;
            meterReadingESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INTERVAL_BLOCK__METER_READING, null, null, oldMeterReadingESet ) );
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
    public PendingCalculation getPendingCalculation() {
        return pendingCalculation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPendingCalculation( PendingCalculation newPendingCalculation,
            NotificationChain msgs ) {
        PendingCalculation oldPendingCalculation = pendingCalculation;
        pendingCalculation = newPendingCalculation;
        boolean oldPendingCalculationESet = pendingCalculationESet;
        pendingCalculationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.INTERVAL_BLOCK__PENDING_CALCULATION, oldPendingCalculation, newPendingCalculation,
                    !oldPendingCalculationESet );
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
    public void setPendingCalculation( PendingCalculation newPendingCalculation ) {
        if( newPendingCalculation != pendingCalculation ) {
            NotificationChain msgs = null;
            if( pendingCalculation != null ) msgs = ( ( InternalEObject ) pendingCalculation ).eInverseRemove( this,
                    CimPackage.PENDING_CALCULATION__INTERVAL_BLOCKS, PendingCalculation.class, msgs );
            if( newPendingCalculation != null ) msgs = ( ( InternalEObject ) newPendingCalculation ).eInverseAdd( this,
                    CimPackage.PENDING_CALCULATION__INTERVAL_BLOCKS, PendingCalculation.class, msgs );
            msgs = basicSetPendingCalculation( newPendingCalculation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPendingCalculationESet = pendingCalculationESet;
            pendingCalculationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.INTERVAL_BLOCK__PENDING_CALCULATION,
                        newPendingCalculation, newPendingCalculation, !oldPendingCalculationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPendingCalculation( NotificationChain msgs ) {
        PendingCalculation oldPendingCalculation = pendingCalculation;
        pendingCalculation = null;
        boolean oldPendingCalculationESet = pendingCalculationESet;
        pendingCalculationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INTERVAL_BLOCK__PENDING_CALCULATION, oldPendingCalculation, null,
                    oldPendingCalculationESet );
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
    public void unsetPendingCalculation() {
        if( pendingCalculation != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) pendingCalculation ).eInverseRemove( this,
                    CimPackage.PENDING_CALCULATION__INTERVAL_BLOCKS, PendingCalculation.class, msgs );
            msgs = basicUnsetPendingCalculation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPendingCalculationESet = pendingCalculationESet;
            pendingCalculationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INTERVAL_BLOCK__PENDING_CALCULATION, null, null, oldPendingCalculationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPendingCalculation() {
        return pendingCalculationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< IntervalReading > getIntervalReadings() {
        if( intervalReadings == null ) {
            intervalReadings = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< IntervalReading >(
                    IntervalReading.class, this, CimPackage.INTERVAL_BLOCK__INTERVAL_READINGS,
                    CimPackage.INTERVAL_READING__INTERVAL_BLOCKS );
        }
        return intervalReadings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIntervalReadings() {
        if( intervalReadings != null ) ( ( InternalEList.Unsettable< ? > ) intervalReadings ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIntervalReadings() {
        return intervalReadings != null && ( ( InternalEList.Unsettable< ? > ) intervalReadings ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReadingType getReadingType() {
        return readingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReadingType( ReadingType newReadingType, NotificationChain msgs ) {
        ReadingType oldReadingType = readingType;
        readingType = newReadingType;
        boolean oldReadingTypeESet = readingTypeESet;
        readingTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.INTERVAL_BLOCK__READING_TYPE, oldReadingType, newReadingType, !oldReadingTypeESet );
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
    public void setReadingType( ReadingType newReadingType ) {
        if( newReadingType != readingType ) {
            NotificationChain msgs = null;
            if( readingType != null ) msgs = ( ( InternalEObject ) readingType ).eInverseRemove( this,
                    CimPackage.READING_TYPE__INTERVAL_BLOCKS, ReadingType.class, msgs );
            if( newReadingType != null ) msgs = ( ( InternalEObject ) newReadingType ).eInverseAdd( this,
                    CimPackage.READING_TYPE__INTERVAL_BLOCKS, ReadingType.class, msgs );
            msgs = basicSetReadingType( newReadingType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReadingTypeESet = readingTypeESet;
            readingTypeESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.INTERVAL_BLOCK__READING_TYPE, newReadingType, newReadingType, !oldReadingTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReadingType( NotificationChain msgs ) {
        ReadingType oldReadingType = readingType;
        readingType = null;
        boolean oldReadingTypeESet = readingTypeESet;
        readingTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INTERVAL_BLOCK__READING_TYPE, oldReadingType, null, oldReadingTypeESet );
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
    public void unsetReadingType() {
        if( readingType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) readingType ).eInverseRemove( this, CimPackage.READING_TYPE__INTERVAL_BLOCKS,
                    ReadingType.class, msgs );
            msgs = basicUnsetReadingType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReadingTypeESet = readingTypeESet;
            readingTypeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INTERVAL_BLOCK__READING_TYPE, null, null, oldReadingTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReadingType() {
        return readingTypeESet;
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
        case CimPackage.INTERVAL_BLOCK__METER_READING:
            if( meterReading != null ) msgs = ( ( InternalEObject ) meterReading ).eInverseRemove( this,
                    CimPackage.METER_READING__INTERVAL_BLOCKS, MeterReading.class, msgs );
            return basicSetMeterReading( ( MeterReading ) otherEnd, msgs );
        case CimPackage.INTERVAL_BLOCK__PENDING_CALCULATION:
            if( pendingCalculation != null ) msgs = ( ( InternalEObject ) pendingCalculation ).eInverseRemove( this,
                    CimPackage.PENDING_CALCULATION__INTERVAL_BLOCKS, PendingCalculation.class, msgs );
            return basicSetPendingCalculation( ( PendingCalculation ) otherEnd, msgs );
        case CimPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getIntervalReadings() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.INTERVAL_BLOCK__READING_TYPE:
            if( readingType != null ) msgs = ( ( InternalEObject ) readingType ).eInverseRemove( this,
                    CimPackage.READING_TYPE__INTERVAL_BLOCKS, ReadingType.class, msgs );
            return basicSetReadingType( ( ReadingType ) otherEnd, msgs );
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
        case CimPackage.INTERVAL_BLOCK__METER_READING:
            return basicUnsetMeterReading( msgs );
        case CimPackage.INTERVAL_BLOCK__PENDING_CALCULATION:
            return basicUnsetPendingCalculation( msgs );
        case CimPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
            return ( ( InternalEList< ? > ) getIntervalReadings() ).basicRemove( otherEnd, msgs );
        case CimPackage.INTERVAL_BLOCK__READING_TYPE:
            return basicUnsetReadingType( msgs );
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
        case CimPackage.INTERVAL_BLOCK__METER_READING:
            return getMeterReading();
        case CimPackage.INTERVAL_BLOCK__PENDING_CALCULATION:
            return getPendingCalculation();
        case CimPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
            return getIntervalReadings();
        case CimPackage.INTERVAL_BLOCK__READING_TYPE:
            return getReadingType();
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
        case CimPackage.INTERVAL_BLOCK__METER_READING:
            setMeterReading( ( MeterReading ) newValue );
            return;
        case CimPackage.INTERVAL_BLOCK__PENDING_CALCULATION:
            setPendingCalculation( ( PendingCalculation ) newValue );
            return;
        case CimPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
            getIntervalReadings().clear();
            getIntervalReadings().addAll( ( Collection< ? extends IntervalReading > ) newValue );
            return;
        case CimPackage.INTERVAL_BLOCK__READING_TYPE:
            setReadingType( ( ReadingType ) newValue );
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
        case CimPackage.INTERVAL_BLOCK__METER_READING:
            unsetMeterReading();
            return;
        case CimPackage.INTERVAL_BLOCK__PENDING_CALCULATION:
            unsetPendingCalculation();
            return;
        case CimPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
            unsetIntervalReadings();
            return;
        case CimPackage.INTERVAL_BLOCK__READING_TYPE:
            unsetReadingType();
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
        case CimPackage.INTERVAL_BLOCK__METER_READING:
            return isSetMeterReading();
        case CimPackage.INTERVAL_BLOCK__PENDING_CALCULATION:
            return isSetPendingCalculation();
        case CimPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
            return isSetIntervalReadings();
        case CimPackage.INTERVAL_BLOCK__READING_TYPE:
            return isSetReadingType();
        }
        return super.eIsSet( featureID );
    }

} //IntervalBlockImpl
