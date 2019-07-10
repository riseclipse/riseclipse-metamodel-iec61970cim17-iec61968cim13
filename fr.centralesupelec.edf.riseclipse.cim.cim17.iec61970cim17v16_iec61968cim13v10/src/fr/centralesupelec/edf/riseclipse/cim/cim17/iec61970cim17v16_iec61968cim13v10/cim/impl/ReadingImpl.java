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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterReading;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reading;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingReasonKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingImpl#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingImpl#getReadingType <em>Reading Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadingImpl extends BaseReadingImpl implements Reading {
    /**
     * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReason()
     * @generated
     * @ordered
     */
    protected static final ReadingReasonKind REASON_EDEFAULT = ReadingReasonKind.INSTALLATION;

    /**
     * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReason()
     * @generated
     * @ordered
     */
    protected ReadingReasonKind reason = REASON_EDEFAULT;

    /**
     * This is true if the Reason attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reasonESet;

    /**
     * The cached value of the '{@link #getMeterReadings() <em>Meter Readings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeterReadings()
     * @generated
     * @ordered
     */
    protected EList< MeterReading > meterReadings;

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
    protected ReadingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getReading();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReadingReasonKind getReason() {
        return reason;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReason( ReadingReasonKind newReason ) {
        ReadingReasonKind oldReason = reason;
        reason = newReason == null ? REASON_EDEFAULT : newReason;
        boolean oldReasonESet = reasonESet;
        reasonESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING__REASON, oldReason, reason, !oldReasonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReason() {
        ReadingReasonKind oldReason = reason;
        boolean oldReasonESet = reasonESet;
        reason = REASON_EDEFAULT;
        reasonESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING__REASON, oldReason, REASON_EDEFAULT, oldReasonESet ) );
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
    public EList< MeterReading > getMeterReadings() {
        if( meterReadings == null ) {
            meterReadings = new EObjectWithInverseEList.Unsettable.ManyInverse< MeterReading >( MeterReading.class,
                    this, CimPackage.READING__METER_READINGS, CimPackage.METER_READING__READINGS );
        }
        return meterReadings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeterReadings() {
        if( meterReadings != null ) ( ( InternalEList.Unsettable< ? > ) meterReadings ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeterReadings() {
        return meterReadings != null && ( ( InternalEList.Unsettable< ? > ) meterReadings ).isSet();
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
                    CimPackage.READING__READING_TYPE, oldReadingType, newReadingType, !oldReadingTypeESet );
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
                    CimPackage.READING_TYPE__READINGS, ReadingType.class, msgs );
            if( newReadingType != null ) msgs = ( ( InternalEObject ) newReadingType ).eInverseAdd( this,
                    CimPackage.READING_TYPE__READINGS, ReadingType.class, msgs );
            msgs = basicSetReadingType( newReadingType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReadingTypeESet = readingTypeESet;
            readingTypeESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.READING__READING_TYPE, newReadingType, newReadingType, !oldReadingTypeESet ) );
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
                    CimPackage.READING__READING_TYPE, oldReadingType, null, oldReadingTypeESet );
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
            msgs = ( ( InternalEObject ) readingType ).eInverseRemove( this, CimPackage.READING_TYPE__READINGS,
                    ReadingType.class, msgs );
            msgs = basicUnsetReadingType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReadingTypeESet = readingTypeESet;
            readingTypeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.READING__READING_TYPE, null, null, oldReadingTypeESet ) );
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
        case CimPackage.READING__METER_READINGS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeterReadings() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.READING__READING_TYPE:
            if( readingType != null ) msgs = ( ( InternalEObject ) readingType ).eInverseRemove( this,
                    CimPackage.READING_TYPE__READINGS, ReadingType.class, msgs );
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
        case CimPackage.READING__METER_READINGS:
            return ( ( InternalEList< ? > ) getMeterReadings() ).basicRemove( otherEnd, msgs );
        case CimPackage.READING__READING_TYPE:
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
        case CimPackage.READING__REASON:
            return getReason();
        case CimPackage.READING__METER_READINGS:
            return getMeterReadings();
        case CimPackage.READING__READING_TYPE:
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
        case CimPackage.READING__REASON:
            setReason( ( ReadingReasonKind ) newValue );
            return;
        case CimPackage.READING__METER_READINGS:
            getMeterReadings().clear();
            getMeterReadings().addAll( ( Collection< ? extends MeterReading > ) newValue );
            return;
        case CimPackage.READING__READING_TYPE:
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
        case CimPackage.READING__REASON:
            unsetReason();
            return;
        case CimPackage.READING__METER_READINGS:
            unsetMeterReadings();
            return;
        case CimPackage.READING__READING_TYPE:
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
        case CimPackage.READING__REASON:
            return isSetReason();
        case CimPackage.READING__METER_READINGS:
            return isSetMeterReadings();
        case CimPackage.READING__READING_TYPE:
            return isSetReadingType();
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
        result.append( " (reason: " );
        if( reasonESet )
            result.append( reason );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ReadingImpl
