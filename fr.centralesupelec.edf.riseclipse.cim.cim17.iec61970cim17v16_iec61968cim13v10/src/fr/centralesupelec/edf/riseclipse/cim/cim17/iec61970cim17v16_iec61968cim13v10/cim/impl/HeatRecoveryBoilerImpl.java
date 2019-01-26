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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatRecoveryBoiler;

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
 * An implementation of the model object '<em><b>Heat Recovery Boiler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HeatRecoveryBoilerImpl#getSteamSupplyRating2 <em>Steam Supply Rating2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HeatRecoveryBoilerImpl#getCombustionTurbines <em>Combustion Turbines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeatRecoveryBoilerImpl extends FossilSteamSupplyImpl implements HeatRecoveryBoiler {
    /**
     * The default value of the '{@link #getSteamSupplyRating2() <em>Steam Supply Rating2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSteamSupplyRating2()
     * @generated
     * @ordered
     */
    protected static final Float STEAM_SUPPLY_RATING2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSteamSupplyRating2() <em>Steam Supply Rating2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSteamSupplyRating2()
     * @generated
     * @ordered
     */
    protected Float steamSupplyRating2 = STEAM_SUPPLY_RATING2_EDEFAULT;

    /**
     * This is true if the Steam Supply Rating2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean steamSupplyRating2ESet;

    /**
     * The cached value of the '{@link #getCombustionTurbines() <em>Combustion Turbines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCombustionTurbines()
     * @generated
     * @ordered
     */
    protected EList< CombustionTurbine > combustionTurbines;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HeatRecoveryBoilerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getHeatRecoveryBoiler();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSteamSupplyRating2() {
        return steamSupplyRating2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSteamSupplyRating2( Float newSteamSupplyRating2 ) {
        Float oldSteamSupplyRating2 = steamSupplyRating2;
        steamSupplyRating2 = newSteamSupplyRating2;
        boolean oldSteamSupplyRating2ESet = steamSupplyRating2ESet;
        steamSupplyRating2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2,
                        oldSteamSupplyRating2, steamSupplyRating2, !oldSteamSupplyRating2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSteamSupplyRating2() {
        Float oldSteamSupplyRating2 = steamSupplyRating2;
        boolean oldSteamSupplyRating2ESet = steamSupplyRating2ESet;
        steamSupplyRating2 = STEAM_SUPPLY_RATING2_EDEFAULT;
        steamSupplyRating2ESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2,
                        oldSteamSupplyRating2, STEAM_SUPPLY_RATING2_EDEFAULT, oldSteamSupplyRating2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSteamSupplyRating2() {
        return steamSupplyRating2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CombustionTurbine > getCombustionTurbines() {
        if( combustionTurbines == null ) {
            combustionTurbines = new EObjectWithInverseResolvingEList.Unsettable< CombustionTurbine >(
                    CombustionTurbine.class, this, CimPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES,
                    CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER );
        }
        return combustionTurbines;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCombustionTurbines() {
        if( combustionTurbines != null ) ( ( InternalEList.Unsettable< ? > ) combustionTurbines ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCombustionTurbines() {
        return combustionTurbines != null && ( ( InternalEList.Unsettable< ? > ) combustionTurbines ).isSet();
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
        case CimPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCombustionTurbines() )
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
        case CimPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
            return ( ( InternalEList< ? > ) getCombustionTurbines() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2:
            return getSteamSupplyRating2();
        case CimPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
            return getCombustionTurbines();
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
        case CimPackage.HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2:
            setSteamSupplyRating2( ( Float ) newValue );
            return;
        case CimPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
            getCombustionTurbines().clear();
            getCombustionTurbines().addAll( ( Collection< ? extends CombustionTurbine > ) newValue );
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
        case CimPackage.HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2:
            unsetSteamSupplyRating2();
            return;
        case CimPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
            unsetCombustionTurbines();
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
        case CimPackage.HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2:
            return isSetSteamSupplyRating2();
        case CimPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
            return isSetCombustionTurbines();
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
        result.append( " (steamSupplyRating2: " );
        if( steamSupplyRating2ESet )
            result.append( steamSupplyRating2 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //HeatRecoveryBoilerImpl
