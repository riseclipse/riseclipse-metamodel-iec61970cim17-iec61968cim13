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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConsumptionTariffInterval;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeTariffInterval;

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
 * An implementation of the model object '<em><b>Consumption Tariff Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConsumptionTariffIntervalImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConsumptionTariffIntervalImpl#getStartValue <em>Start Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConsumptionTariffIntervalImpl#getTariffProfiles <em>Tariff Profiles</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConsumptionTariffIntervalImpl#getCharges <em>Charges</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConsumptionTariffIntervalImpl#getTouTariffIntervals <em>Tou Tariff Intervals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConsumptionTariffIntervalImpl#getReadingType <em>Reading Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsumptionTariffIntervalImpl extends CimObjectWithIDImpl implements ConsumptionTariffInterval {
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
     * The default value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartValue()
     * @generated
     * @ordered
     */
    protected static final Float START_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartValue()
     * @generated
     * @ordered
     */
    protected Float startValue = START_VALUE_EDEFAULT;

    /**
     * This is true if the Start Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startValueESet;

    /**
     * The cached value of the '{@link #getTariffProfiles() <em>Tariff Profiles</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTariffProfiles()
     * @generated
     * @ordered
     */
    protected EList< TariffProfile > tariffProfiles;

    /**
     * The cached value of the '{@link #getCharges() <em>Charges</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharges()
     * @generated
     * @ordered
     */
    protected EList< Charge > charges;

    /**
     * The cached value of the '{@link #getTouTariffIntervals() <em>Tou Tariff Intervals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTouTariffIntervals()
     * @generated
     * @ordered
     */
    protected EList< TimeTariffInterval > touTariffIntervals;

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
    protected ConsumptionTariffIntervalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getConsumptionTariffInterval();
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.CONSUMPTION_TARIFF_INTERVAL__SEQUENCE_NUMBER,
                        oldSequenceNumber, sequenceNumber, !oldSequenceNumberESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONSUMPTION_TARIFF_INTERVAL__SEQUENCE_NUMBER, oldSequenceNumber, SEQUENCE_NUMBER_EDEFAULT,
                oldSequenceNumberESet ) );
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
    public Float getStartValue() {
        return startValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartValue( Float newStartValue ) {
        Float oldStartValue = startValue;
        startValue = newStartValue;
        boolean oldStartValueESet = startValueESet;
        startValueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONSUMPTION_TARIFF_INTERVAL__START_VALUE, oldStartValue, startValue, !oldStartValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStartValue() {
        Float oldStartValue = startValue;
        boolean oldStartValueESet = startValueESet;
        startValue = START_VALUE_EDEFAULT;
        startValueESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.CONSUMPTION_TARIFF_INTERVAL__START_VALUE,
                        oldStartValue, START_VALUE_EDEFAULT, oldStartValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartValue() {
        return startValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TariffProfile > getTariffProfiles() {
        if( tariffProfiles == null ) {
            tariffProfiles = new EObjectWithInverseEList.Unsettable.ManyInverse< TariffProfile >( TariffProfile.class,
                    this, CimPackage.CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES,
                    CimPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS );
        }
        return tariffProfiles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTariffProfiles() {
        if( tariffProfiles != null ) ( ( InternalEList.Unsettable< ? > ) tariffProfiles ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTariffProfiles() {
        return tariffProfiles != null && ( ( InternalEList.Unsettable< ? > ) tariffProfiles ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Charge > getCharges() {
        if( charges == null ) {
            charges = new EObjectWithInverseEList.Unsettable.ManyInverse< Charge >( Charge.class, this,
                    CimPackage.CONSUMPTION_TARIFF_INTERVAL__CHARGES, CimPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS );
        }
        return charges;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCharges() {
        if( charges != null ) ( ( InternalEList.Unsettable< ? > ) charges ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCharges() {
        return charges != null && ( ( InternalEList.Unsettable< ? > ) charges ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TimeTariffInterval > getTouTariffIntervals() {
        if( touTariffIntervals == null ) {
            touTariffIntervals = new EObjectWithInverseEList.Unsettable.ManyInverse< TimeTariffInterval >(
                    TimeTariffInterval.class, this, CimPackage.CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS,
                    CimPackage.TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS );
        }
        return touTariffIntervals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTouTariffIntervals() {
        if( touTariffIntervals != null ) ( ( InternalEList.Unsettable< ? > ) touTariffIntervals ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTouTariffIntervals() {
        return touTariffIntervals != null && ( ( InternalEList.Unsettable< ? > ) touTariffIntervals ).isSet();
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
                    CimPackage.CONSUMPTION_TARIFF_INTERVAL__READING_TYPE, oldReadingType, newReadingType,
                    !oldReadingTypeESet );
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
                    CimPackage.READING_TYPE__CONSUMPTION_TARIFF_INTERVALS, ReadingType.class, msgs );
            if( newReadingType != null ) msgs = ( ( InternalEObject ) newReadingType ).eInverseAdd( this,
                    CimPackage.READING_TYPE__CONSUMPTION_TARIFF_INTERVALS, ReadingType.class, msgs );
            msgs = basicSetReadingType( newReadingType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReadingTypeESet = readingTypeESet;
            readingTypeESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.CONSUMPTION_TARIFF_INTERVAL__READING_TYPE,
                            newReadingType, newReadingType, !oldReadingTypeESet ) );
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
                    CimPackage.CONSUMPTION_TARIFF_INTERVAL__READING_TYPE, oldReadingType, null, oldReadingTypeESet );
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
            msgs = ( ( InternalEObject ) readingType ).eInverseRemove( this,
                    CimPackage.READING_TYPE__CONSUMPTION_TARIFF_INTERVALS, ReadingType.class, msgs );
            msgs = basicUnsetReadingType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReadingTypeESet = readingTypeESet;
            readingTypeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONSUMPTION_TARIFF_INTERVAL__READING_TYPE, null, null, oldReadingTypeESet ) );
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
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTariffProfiles() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__CHARGES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCharges() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTouTariffIntervals() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__READING_TYPE:
            if( readingType != null ) msgs = ( ( InternalEObject ) readingType ).eInverseRemove( this,
                    CimPackage.READING_TYPE__CONSUMPTION_TARIFF_INTERVALS, ReadingType.class, msgs );
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
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES:
            return ( ( InternalEList< ? > ) getTariffProfiles() ).basicRemove( otherEnd, msgs );
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__CHARGES:
            return ( ( InternalEList< ? > ) getCharges() ).basicRemove( otherEnd, msgs );
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS:
            return ( ( InternalEList< ? > ) getTouTariffIntervals() ).basicRemove( otherEnd, msgs );
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__READING_TYPE:
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
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__SEQUENCE_NUMBER:
            return getSequenceNumber();
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__START_VALUE:
            return getStartValue();
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES:
            return getTariffProfiles();
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__CHARGES:
            return getCharges();
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS:
            return getTouTariffIntervals();
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__READING_TYPE:
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
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__SEQUENCE_NUMBER:
            setSequenceNumber( ( Integer ) newValue );
            return;
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__START_VALUE:
            setStartValue( ( Float ) newValue );
            return;
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES:
            getTariffProfiles().clear();
            getTariffProfiles().addAll( ( Collection< ? extends TariffProfile > ) newValue );
            return;
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__CHARGES:
            getCharges().clear();
            getCharges().addAll( ( Collection< ? extends Charge > ) newValue );
            return;
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS:
            getTouTariffIntervals().clear();
            getTouTariffIntervals().addAll( ( Collection< ? extends TimeTariffInterval > ) newValue );
            return;
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__READING_TYPE:
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
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__SEQUENCE_NUMBER:
            unsetSequenceNumber();
            return;
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__START_VALUE:
            unsetStartValue();
            return;
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES:
            unsetTariffProfiles();
            return;
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__CHARGES:
            unsetCharges();
            return;
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS:
            unsetTouTariffIntervals();
            return;
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__READING_TYPE:
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
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__SEQUENCE_NUMBER:
            return isSetSequenceNumber();
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__START_VALUE:
            return isSetStartValue();
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES:
            return isSetTariffProfiles();
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__CHARGES:
            return isSetCharges();
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS:
            return isSetTouTariffIntervals();
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__READING_TYPE:
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
        result.append( " (sequenceNumber: " );
        if( sequenceNumberESet )
            result.append( sequenceNumber );
        else
            result.append( "<unset>" );
        result.append( ", startValue: " );
        if( startValueESet )
            result.append( startValue );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ConsumptionTariffIntervalImpl
