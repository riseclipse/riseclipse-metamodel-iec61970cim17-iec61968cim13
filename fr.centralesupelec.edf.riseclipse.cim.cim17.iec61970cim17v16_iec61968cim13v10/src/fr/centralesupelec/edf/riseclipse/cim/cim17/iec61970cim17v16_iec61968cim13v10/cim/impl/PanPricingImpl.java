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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricing;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail;

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
 * An implementation of the model object '<em><b>Pan Pricing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingImpl#getProviderID <em>Provider ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingImpl#getPanPricingDetails <em>Pan Pricing Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PanPricingImpl extends EndDeviceActionImpl implements PanPricing {
    /**
     * The default value of the '{@link #getProviderID() <em>Provider ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProviderID()
     * @generated
     * @ordered
     */
    protected static final Integer PROVIDER_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProviderID() <em>Provider ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProviderID()
     * @generated
     * @ordered
     */
    protected Integer providerID = PROVIDER_ID_EDEFAULT;

    /**
     * This is true if the Provider ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean providerIDESet;

    /**
     * The cached value of the '{@link #getPanPricingDetails() <em>Pan Pricing Details</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPanPricingDetails()
     * @generated
     * @ordered
     */
    protected EList< PanPricingDetail > panPricingDetails;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PanPricingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPanPricing();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getProviderID() {
        return providerID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setProviderID( Integer newProviderID ) {
        Integer oldProviderID = providerID;
        providerID = newProviderID;
        boolean oldProviderIDESet = providerIDESet;
        providerIDESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PAN_PRICING__PROVIDER_ID, oldProviderID, providerID, !oldProviderIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProviderID() {
        Integer oldProviderID = providerID;
        boolean oldProviderIDESet = providerIDESet;
        providerID = PROVIDER_ID_EDEFAULT;
        providerIDESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PAN_PRICING__PROVIDER_ID, oldProviderID, PROVIDER_ID_EDEFAULT, oldProviderIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProviderID() {
        return providerIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PanPricingDetail > getPanPricingDetails() {
        if( panPricingDetails == null ) {
            panPricingDetails = new EObjectWithInverseResolvingEList.Unsettable< PanPricingDetail >(
                    PanPricingDetail.class, this, CimPackage.PAN_PRICING__PAN_PRICING_DETAILS,
                    CimPackage.PAN_PRICING_DETAIL__PAN_PRICING );
        }
        return panPricingDetails;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPanPricingDetails() {
        if( panPricingDetails != null ) ( ( InternalEList.Unsettable< ? > ) panPricingDetails ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPanPricingDetails() {
        return panPricingDetails != null && ( ( InternalEList.Unsettable< ? > ) panPricingDetails ).isSet();
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
        case CimPackage.PAN_PRICING__PAN_PRICING_DETAILS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPanPricingDetails() )
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
        case CimPackage.PAN_PRICING__PAN_PRICING_DETAILS:
            return ( ( InternalEList< ? > ) getPanPricingDetails() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.PAN_PRICING__PROVIDER_ID:
            return getProviderID();
        case CimPackage.PAN_PRICING__PAN_PRICING_DETAILS:
            return getPanPricingDetails();
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
        case CimPackage.PAN_PRICING__PROVIDER_ID:
            setProviderID( ( Integer ) newValue );
            return;
        case CimPackage.PAN_PRICING__PAN_PRICING_DETAILS:
            getPanPricingDetails().clear();
            getPanPricingDetails().addAll( ( Collection< ? extends PanPricingDetail > ) newValue );
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
        case CimPackage.PAN_PRICING__PROVIDER_ID:
            unsetProviderID();
            return;
        case CimPackage.PAN_PRICING__PAN_PRICING_DETAILS:
            unsetPanPricingDetails();
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
        case CimPackage.PAN_PRICING__PROVIDER_ID:
            return isSetProviderID();
        case CimPackage.PAN_PRICING__PAN_PRICING_DETAILS:
            return isSetPanPricingDetails();
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
        result.append( " (providerID: " );
        if( providerIDESet )
            result.append( providerID );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PanPricingImpl
