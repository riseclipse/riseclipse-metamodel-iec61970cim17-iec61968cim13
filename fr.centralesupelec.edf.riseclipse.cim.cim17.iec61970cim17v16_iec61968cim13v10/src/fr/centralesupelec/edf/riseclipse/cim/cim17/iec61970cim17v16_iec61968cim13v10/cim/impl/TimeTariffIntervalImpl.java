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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConsumptionTariffInterval;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeTariffInterval;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Time Tariff Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimeTariffIntervalImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimeTariffIntervalImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimeTariffIntervalImpl#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimeTariffIntervalImpl#getCharges <em>Charges</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TimeTariffIntervalImpl#getTariffProfiles <em>Tariff Profiles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeTariffIntervalImpl extends CimObjectWithIDImpl implements TimeTariffInterval {
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
     * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartTime()
     * @generated
     * @ordered
     */
    protected static final Date START_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartTime()
     * @generated
     * @ordered
     */
    protected Date startTime = START_TIME_EDEFAULT;

    /**
     * This is true if the Start Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startTimeESet;

    /**
     * The cached value of the '{@link #getConsumptionTariffIntervals() <em>Consumption Tariff Intervals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConsumptionTariffIntervals()
     * @generated
     * @ordered
     */
    protected EList< ConsumptionTariffInterval > consumptionTariffIntervals;

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
     * The cached value of the '{@link #getTariffProfiles() <em>Tariff Profiles</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTariffProfiles()
     * @generated
     * @ordered
     */
    protected EList< TariffProfile > tariffProfiles;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimeTariffIntervalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTimeTariffInterval();
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER,
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER,
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
    public Date getStartTime() {
        return startTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartTime( Date newStartTime ) {
        Date oldStartTime = startTime;
        startTime = newStartTime;
        boolean oldStartTimeESet = startTimeESet;
        startTimeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TIME_TARIFF_INTERVAL__START_TIME, oldStartTime, startTime, !oldStartTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStartTime() {
        Date oldStartTime = startTime;
        boolean oldStartTimeESet = startTimeESet;
        startTime = START_TIME_EDEFAULT;
        startTimeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TIME_TARIFF_INTERVAL__START_TIME, oldStartTime, START_TIME_EDEFAULT, oldStartTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartTime() {
        return startTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConsumptionTariffInterval > getConsumptionTariffIntervals() {
        if( consumptionTariffIntervals == null ) {
            consumptionTariffIntervals = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< ConsumptionTariffInterval >(
                    ConsumptionTariffInterval.class, this,
                    CimPackage.TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS,
                    CimPackage.CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS );
        }
        return consumptionTariffIntervals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConsumptionTariffIntervals() {
        if( consumptionTariffIntervals != null )
            ( ( InternalEList.Unsettable< ? > ) consumptionTariffIntervals ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConsumptionTariffIntervals() {
        return consumptionTariffIntervals != null
                && ( ( InternalEList.Unsettable< ? > ) consumptionTariffIntervals ).isSet();
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
                    CimPackage.TIME_TARIFF_INTERVAL__CHARGES, CimPackage.CHARGE__TIME_TARIFF_INTERVALS );
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
    public EList< TariffProfile > getTariffProfiles() {
        if( tariffProfiles == null ) {
            tariffProfiles = new EObjectWithInverseEList.Unsettable.ManyInverse< TariffProfile >( TariffProfile.class,
                    this, CimPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES,
                    CimPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConsumptionTariffIntervals() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TIME_TARIFF_INTERVAL__CHARGES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCharges() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTariffProfiles() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS:
            return ( ( InternalEList< ? > ) getConsumptionTariffIntervals() ).basicRemove( otherEnd, msgs );
        case CimPackage.TIME_TARIFF_INTERVAL__CHARGES:
            return ( ( InternalEList< ? > ) getCharges() ).basicRemove( otherEnd, msgs );
        case CimPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
            return ( ( InternalEList< ? > ) getTariffProfiles() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER:
            return getSequenceNumber();
        case CimPackage.TIME_TARIFF_INTERVAL__START_TIME:
            return getStartTime();
        case CimPackage.TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS:
            return getConsumptionTariffIntervals();
        case CimPackage.TIME_TARIFF_INTERVAL__CHARGES:
            return getCharges();
        case CimPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
            return getTariffProfiles();
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
        case CimPackage.TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER:
            setSequenceNumber( ( Integer ) newValue );
            return;
        case CimPackage.TIME_TARIFF_INTERVAL__START_TIME:
            setStartTime( ( Date ) newValue );
            return;
        case CimPackage.TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS:
            getConsumptionTariffIntervals().clear();
            getConsumptionTariffIntervals().addAll( ( Collection< ? extends ConsumptionTariffInterval > ) newValue );
            return;
        case CimPackage.TIME_TARIFF_INTERVAL__CHARGES:
            getCharges().clear();
            getCharges().addAll( ( Collection< ? extends Charge > ) newValue );
            return;
        case CimPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
            getTariffProfiles().clear();
            getTariffProfiles().addAll( ( Collection< ? extends TariffProfile > ) newValue );
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
        case CimPackage.TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER:
            unsetSequenceNumber();
            return;
        case CimPackage.TIME_TARIFF_INTERVAL__START_TIME:
            unsetStartTime();
            return;
        case CimPackage.TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS:
            unsetConsumptionTariffIntervals();
            return;
        case CimPackage.TIME_TARIFF_INTERVAL__CHARGES:
            unsetCharges();
            return;
        case CimPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
            unsetTariffProfiles();
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
        case CimPackage.TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER:
            return isSetSequenceNumber();
        case CimPackage.TIME_TARIFF_INTERVAL__START_TIME:
            return isSetStartTime();
        case CimPackage.TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS:
            return isSetConsumptionTariffIntervals();
        case CimPackage.TIME_TARIFF_INTERVAL__CHARGES:
            return isSetCharges();
        case CimPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
            return isSetTariffProfiles();
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
        result.append( " (sequenceNumber: " );
        if( sequenceNumberESet )
            result.append( sequenceNumber );
        else
            result.append( "<unset>" );
        result.append( ", startTime: " );
        if( startTimeESet )
            result.append( startTime );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TimeTariffIntervalImpl
