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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSupply;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine;

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
 * An implementation of the model object '<em><b>Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamSupplyImpl#getSteamSupplyRating <em>Steam Supply Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamSupplyImpl#getSteamTurbines <em>Steam Turbines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SteamSupplyImpl extends PowerSystemResourceImpl implements SteamSupply {
    /**
     * The default value of the '{@link #getSteamSupplyRating() <em>Steam Supply Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSteamSupplyRating()
     * @generated
     * @ordered
     */
    protected static final Float STEAM_SUPPLY_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSteamSupplyRating() <em>Steam Supply Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSteamSupplyRating()
     * @generated
     * @ordered
     */
    protected Float steamSupplyRating = STEAM_SUPPLY_RATING_EDEFAULT;

    /**
     * This is true if the Steam Supply Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean steamSupplyRatingESet;

    /**
     * The cached value of the '{@link #getSteamTurbines() <em>Steam Turbines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSteamTurbines()
     * @generated
     * @ordered
     */
    protected EList< SteamTurbine > steamTurbines;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SteamSupplyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSteamSupply();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSteamSupplyRating() {
        return steamSupplyRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSteamSupplyRating( Float newSteamSupplyRating ) {
        Float oldSteamSupplyRating = steamSupplyRating;
        steamSupplyRating = newSteamSupplyRating;
        boolean oldSteamSupplyRatingESet = steamSupplyRatingESet;
        steamSupplyRatingESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STEAM_SUPPLY__STEAM_SUPPLY_RATING,
                    oldSteamSupplyRating, steamSupplyRating, !oldSteamSupplyRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSteamSupplyRating() {
        Float oldSteamSupplyRating = steamSupplyRating;
        boolean oldSteamSupplyRatingESet = steamSupplyRatingESet;
        steamSupplyRating = STEAM_SUPPLY_RATING_EDEFAULT;
        steamSupplyRatingESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STEAM_SUPPLY__STEAM_SUPPLY_RATING,
                    oldSteamSupplyRating, STEAM_SUPPLY_RATING_EDEFAULT, oldSteamSupplyRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSteamSupplyRating() {
        return steamSupplyRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SteamTurbine > getSteamTurbines() {
        if( steamTurbines == null ) {
            steamTurbines = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< SteamTurbine >(
                    SteamTurbine.class, this, CimPackage.STEAM_SUPPLY__STEAM_TURBINES,
                    CimPackage.STEAM_TURBINE__STEAM_SUPPLYS );
        }
        return steamTurbines;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSteamTurbines() {
        if( steamTurbines != null ) ( ( InternalEList.Unsettable< ? > ) steamTurbines ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSteamTurbines() {
        return steamTurbines != null && ( ( InternalEList.Unsettable< ? > ) steamTurbines ).isSet();
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
        case CimPackage.STEAM_SUPPLY__STEAM_TURBINES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSteamTurbines() )
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
        case CimPackage.STEAM_SUPPLY__STEAM_TURBINES:
            return ( ( InternalEList< ? > ) getSteamTurbines() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.STEAM_SUPPLY__STEAM_SUPPLY_RATING:
            return getSteamSupplyRating();
        case CimPackage.STEAM_SUPPLY__STEAM_TURBINES:
            return getSteamTurbines();
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
        case CimPackage.STEAM_SUPPLY__STEAM_SUPPLY_RATING:
            setSteamSupplyRating( ( Float ) newValue );
            return;
        case CimPackage.STEAM_SUPPLY__STEAM_TURBINES:
            getSteamTurbines().clear();
            getSteamTurbines().addAll( ( Collection< ? extends SteamTurbine > ) newValue );
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
        case CimPackage.STEAM_SUPPLY__STEAM_SUPPLY_RATING:
            unsetSteamSupplyRating();
            return;
        case CimPackage.STEAM_SUPPLY__STEAM_TURBINES:
            unsetSteamTurbines();
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
        case CimPackage.STEAM_SUPPLY__STEAM_SUPPLY_RATING:
            return isSetSteamSupplyRating();
        case CimPackage.STEAM_SUPPLY__STEAM_TURBINES:
            return isSetSteamTurbines();
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
        result.append( " (steamSupplyRating: " );
        if( steamSupplyRatingESet )
            result.append( steamSupplyRating );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SteamSupplyImpl
