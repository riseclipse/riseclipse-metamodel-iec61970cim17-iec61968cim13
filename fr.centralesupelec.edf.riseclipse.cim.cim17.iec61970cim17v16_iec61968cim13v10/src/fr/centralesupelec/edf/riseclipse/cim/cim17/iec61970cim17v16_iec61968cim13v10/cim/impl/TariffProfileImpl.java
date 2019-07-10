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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConsumptionTariffInterval;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeTariffInterval;

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
 * An implementation of the model object '<em><b>Tariff Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TariffProfileImpl#getTariffCycle <em>Tariff Cycle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TariffProfileImpl#getTariffs <em>Tariffs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TariffProfileImpl#getTimeTariffIntervals <em>Time Tariff Intervals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TariffProfileImpl#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TariffProfileImpl extends DocumentImpl implements TariffProfile {
    /**
     * The default value of the '{@link #getTariffCycle() <em>Tariff Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTariffCycle()
     * @generated
     * @ordered
     */
    protected static final String TARIFF_CYCLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTariffCycle() <em>Tariff Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTariffCycle()
     * @generated
     * @ordered
     */
    protected String tariffCycle = TARIFF_CYCLE_EDEFAULT;

    /**
     * This is true if the Tariff Cycle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tariffCycleESet;

    /**
     * The cached value of the '{@link #getTariffs() <em>Tariffs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTariffs()
     * @generated
     * @ordered
     */
    protected EList< Tariff > tariffs;

    /**
     * The cached value of the '{@link #getTimeTariffIntervals() <em>Time Tariff Intervals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeTariffIntervals()
     * @generated
     * @ordered
     */
    protected EList< TimeTariffInterval > timeTariffIntervals;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TariffProfileImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTariffProfile();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTariffCycle() {
        return tariffCycle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTariffCycle( String newTariffCycle ) {
        String oldTariffCycle = tariffCycle;
        tariffCycle = newTariffCycle;
        boolean oldTariffCycleESet = tariffCycleESet;
        tariffCycleESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TARIFF_PROFILE__TARIFF_CYCLE, oldTariffCycle, tariffCycle, !oldTariffCycleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTariffCycle() {
        String oldTariffCycle = tariffCycle;
        boolean oldTariffCycleESet = tariffCycleESet;
        tariffCycle = TARIFF_CYCLE_EDEFAULT;
        tariffCycleESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TARIFF_PROFILE__TARIFF_CYCLE, oldTariffCycle, TARIFF_CYCLE_EDEFAULT, oldTariffCycleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTariffCycle() {
        return tariffCycleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Tariff > getTariffs() {
        if( tariffs == null ) {
            tariffs = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Tariff >( Tariff.class, this,
                    CimPackage.TARIFF_PROFILE__TARIFFS, CimPackage.TARIFF__TARIFF_PROFILES );
        }
        return tariffs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTariffs() {
        if( tariffs != null ) ( ( InternalEList.Unsettable< ? > ) tariffs ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTariffs() {
        return tariffs != null && ( ( InternalEList.Unsettable< ? > ) tariffs ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TimeTariffInterval > getTimeTariffIntervals() {
        if( timeTariffIntervals == null ) {
            timeTariffIntervals = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< TimeTariffInterval >(
                    TimeTariffInterval.class, this, CimPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS,
                    CimPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES );
        }
        return timeTariffIntervals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeTariffIntervals() {
        if( timeTariffIntervals != null ) ( ( InternalEList.Unsettable< ? > ) timeTariffIntervals ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeTariffIntervals() {
        return timeTariffIntervals != null && ( ( InternalEList.Unsettable< ? > ) timeTariffIntervals ).isSet();
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
                    ConsumptionTariffInterval.class, this, CimPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS,
                    CimPackage.CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TARIFF_PROFILE__TARIFFS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTariffs() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTimeTariffIntervals() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConsumptionTariffIntervals() )
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
        case CimPackage.TARIFF_PROFILE__TARIFFS:
            return ( ( InternalEList< ? > ) getTariffs() ).basicRemove( otherEnd, msgs );
        case CimPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
            return ( ( InternalEList< ? > ) getTimeTariffIntervals() ).basicRemove( otherEnd, msgs );
        case CimPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
            return ( ( InternalEList< ? > ) getConsumptionTariffIntervals() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.TARIFF_PROFILE__TARIFF_CYCLE:
            return getTariffCycle();
        case CimPackage.TARIFF_PROFILE__TARIFFS:
            return getTariffs();
        case CimPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
            return getTimeTariffIntervals();
        case CimPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
            return getConsumptionTariffIntervals();
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
        case CimPackage.TARIFF_PROFILE__TARIFF_CYCLE:
            setTariffCycle( ( String ) newValue );
            return;
        case CimPackage.TARIFF_PROFILE__TARIFFS:
            getTariffs().clear();
            getTariffs().addAll( ( Collection< ? extends Tariff > ) newValue );
            return;
        case CimPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
            getTimeTariffIntervals().clear();
            getTimeTariffIntervals().addAll( ( Collection< ? extends TimeTariffInterval > ) newValue );
            return;
        case CimPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
            getConsumptionTariffIntervals().clear();
            getConsumptionTariffIntervals().addAll( ( Collection< ? extends ConsumptionTariffInterval > ) newValue );
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
        case CimPackage.TARIFF_PROFILE__TARIFF_CYCLE:
            unsetTariffCycle();
            return;
        case CimPackage.TARIFF_PROFILE__TARIFFS:
            unsetTariffs();
            return;
        case CimPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
            unsetTimeTariffIntervals();
            return;
        case CimPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
            unsetConsumptionTariffIntervals();
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
        case CimPackage.TARIFF_PROFILE__TARIFF_CYCLE:
            return isSetTariffCycle();
        case CimPackage.TARIFF_PROFILE__TARIFFS:
            return isSetTariffs();
        case CimPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
            return isSetTimeTariffIntervals();
        case CimPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
            return isSetConsumptionTariffIntervals();
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
        result.append( " (tariffCycle: " );
        if( tariffCycleESet )
            result.append( tariffCycle );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TariffProfileImpl
