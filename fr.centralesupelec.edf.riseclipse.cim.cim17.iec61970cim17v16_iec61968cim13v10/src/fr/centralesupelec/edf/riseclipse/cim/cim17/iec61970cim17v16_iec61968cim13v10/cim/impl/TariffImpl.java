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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Tariff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TariffImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TariffImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TariffImpl#getTariffProfiles <em>Tariff Profiles</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TariffImpl#getPricingStructures <em>Pricing Structures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TariffImpl extends DocumentImpl implements Tariff {
    /**
     * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDate()
     * @generated
     * @ordered
     */
    protected static final Date END_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDate()
     * @generated
     * @ordered
     */
    protected Date endDate = END_DATE_EDEFAULT;

    /**
     * This is true if the End Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endDateESet;

    /**
     * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDate()
     * @generated
     * @ordered
     */
    protected static final Date START_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDate()
     * @generated
     * @ordered
     */
    protected Date startDate = START_DATE_EDEFAULT;

    /**
     * This is true if the Start Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startDateESet;

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
     * The cached value of the '{@link #getPricingStructures() <em>Pricing Structures</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPricingStructures()
     * @generated
     * @ordered
     */
    protected EList< PricingStructure > pricingStructures;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TariffImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTariff();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getEndDate() {
        return endDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEndDate( Date newEndDate ) {
        Date oldEndDate = endDate;
        endDate = newEndDate;
        boolean oldEndDateESet = endDateESet;
        endDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TARIFF__END_DATE, oldEndDate, endDate, !oldEndDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDate() {
        Date oldEndDate = endDate;
        boolean oldEndDateESet = endDateESet;
        endDate = END_DATE_EDEFAULT;
        endDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TARIFF__END_DATE, oldEndDate, END_DATE_EDEFAULT, oldEndDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDate() {
        return endDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getStartDate() {
        return startDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartDate( Date newStartDate ) {
        Date oldStartDate = startDate;
        startDate = newStartDate;
        boolean oldStartDateESet = startDateESet;
        startDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TARIFF__START_DATE, oldStartDate, startDate, !oldStartDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStartDate() {
        Date oldStartDate = startDate;
        boolean oldStartDateESet = startDateESet;
        startDate = START_DATE_EDEFAULT;
        startDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TARIFF__START_DATE, oldStartDate, START_DATE_EDEFAULT, oldStartDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartDate() {
        return startDateESet;
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
                    this, CimPackage.TARIFF__TARIFF_PROFILES, CimPackage.TARIFF_PROFILE__TARIFFS );
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
    public EList< PricingStructure > getPricingStructures() {
        if( pricingStructures == null ) {
            pricingStructures = new EObjectWithInverseEList.Unsettable.ManyInverse< PricingStructure >(
                    PricingStructure.class, this, CimPackage.TARIFF__PRICING_STRUCTURES,
                    CimPackage.PRICING_STRUCTURE__TARIFFS );
        }
        return pricingStructures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPricingStructures() {
        if( pricingStructures != null ) ( ( InternalEList.Unsettable< ? > ) pricingStructures ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPricingStructures() {
        return pricingStructures != null && ( ( InternalEList.Unsettable< ? > ) pricingStructures ).isSet();
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
        case CimPackage.TARIFF__TARIFF_PROFILES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTariffProfiles() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TARIFF__PRICING_STRUCTURES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPricingStructures() )
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
        case CimPackage.TARIFF__TARIFF_PROFILES:
            return ( ( InternalEList< ? > ) getTariffProfiles() ).basicRemove( otherEnd, msgs );
        case CimPackage.TARIFF__PRICING_STRUCTURES:
            return ( ( InternalEList< ? > ) getPricingStructures() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.TARIFF__END_DATE:
            return getEndDate();
        case CimPackage.TARIFF__START_DATE:
            return getStartDate();
        case CimPackage.TARIFF__TARIFF_PROFILES:
            return getTariffProfiles();
        case CimPackage.TARIFF__PRICING_STRUCTURES:
            return getPricingStructures();
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
        case CimPackage.TARIFF__END_DATE:
            setEndDate( ( Date ) newValue );
            return;
        case CimPackage.TARIFF__START_DATE:
            setStartDate( ( Date ) newValue );
            return;
        case CimPackage.TARIFF__TARIFF_PROFILES:
            getTariffProfiles().clear();
            getTariffProfiles().addAll( ( Collection< ? extends TariffProfile > ) newValue );
            return;
        case CimPackage.TARIFF__PRICING_STRUCTURES:
            getPricingStructures().clear();
            getPricingStructures().addAll( ( Collection< ? extends PricingStructure > ) newValue );
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
        case CimPackage.TARIFF__END_DATE:
            unsetEndDate();
            return;
        case CimPackage.TARIFF__START_DATE:
            unsetStartDate();
            return;
        case CimPackage.TARIFF__TARIFF_PROFILES:
            unsetTariffProfiles();
            return;
        case CimPackage.TARIFF__PRICING_STRUCTURES:
            unsetPricingStructures();
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
        case CimPackage.TARIFF__END_DATE:
            return isSetEndDate();
        case CimPackage.TARIFF__START_DATE:
            return isSetStartDate();
        case CimPackage.TARIFF__TARIFF_PROFILES:
            return isSetTariffProfiles();
        case CimPackage.TARIFF__PRICING_STRUCTURES:
            return isSetPricingStructures();
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
        result.append( " (endDate: " );
        if( endDateESet )
            result.append( endDate );
        else
            result.append( "<unset>" );
        result.append( ", startDate: " );
        if( startDateESet )
            result.append( startDate );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TariffImpl
