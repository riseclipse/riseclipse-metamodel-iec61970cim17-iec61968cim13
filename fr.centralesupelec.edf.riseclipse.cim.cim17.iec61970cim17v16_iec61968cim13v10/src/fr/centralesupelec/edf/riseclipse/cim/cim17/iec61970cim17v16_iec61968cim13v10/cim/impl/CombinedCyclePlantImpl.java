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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombinedCyclePlant;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit;

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
 * An implementation of the model object '<em><b>Combined Cycle Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CombinedCyclePlantImpl#getCombCyclePlantRating <em>Comb Cycle Plant Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CombinedCyclePlantImpl#getThermalGeneratingUnits <em>Thermal Generating Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedCyclePlantImpl extends PowerSystemResourceImpl implements CombinedCyclePlant {
    /**
     * The default value of the '{@link #getCombCyclePlantRating() <em>Comb Cycle Plant Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCombCyclePlantRating()
     * @generated
     * @ordered
     */
    protected static final Float COMB_CYCLE_PLANT_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCombCyclePlantRating() <em>Comb Cycle Plant Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCombCyclePlantRating()
     * @generated
     * @ordered
     */
    protected Float combCyclePlantRating = COMB_CYCLE_PLANT_RATING_EDEFAULT;

    /**
     * This is true if the Comb Cycle Plant Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean combCyclePlantRatingESet;

    /**
     * The cached value of the '{@link #getThermalGeneratingUnits() <em>Thermal Generating Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThermalGeneratingUnits()
     * @generated
     * @ordered
     */
    protected EList< ThermalGeneratingUnit > thermalGeneratingUnits;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CombinedCyclePlantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCombinedCyclePlant();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCombCyclePlantRating() {
        return combCyclePlantRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCombCyclePlantRating( Float newCombCyclePlantRating ) {
        Float oldCombCyclePlantRating = combCyclePlantRating;
        combCyclePlantRating = newCombCyclePlantRating;
        boolean oldCombCyclePlantRatingESet = combCyclePlantRatingESet;
        combCyclePlantRatingESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING,
                        oldCombCyclePlantRating, combCyclePlantRating, !oldCombCyclePlantRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCombCyclePlantRating() {
        Float oldCombCyclePlantRating = combCyclePlantRating;
        boolean oldCombCyclePlantRatingESet = combCyclePlantRatingESet;
        combCyclePlantRating = COMB_CYCLE_PLANT_RATING_EDEFAULT;
        combCyclePlantRatingESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING, oldCombCyclePlantRating,
                COMB_CYCLE_PLANT_RATING_EDEFAULT, oldCombCyclePlantRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCombCyclePlantRating() {
        return combCyclePlantRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ThermalGeneratingUnit > getThermalGeneratingUnits() {
        if( thermalGeneratingUnits == null ) {
            thermalGeneratingUnits = new EObjectWithInverseResolvingEList.Unsettable< ThermalGeneratingUnit >(
                    ThermalGeneratingUnit.class, this, CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS,
                    CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT );
        }
        return thermalGeneratingUnits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThermalGeneratingUnits() {
        if( thermalGeneratingUnits != null ) ( ( InternalEList.Unsettable< ? > ) thermalGeneratingUnits ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalGeneratingUnits() {
        return thermalGeneratingUnits != null && ( ( InternalEList.Unsettable< ? > ) thermalGeneratingUnits ).isSet();
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
        case CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getThermalGeneratingUnits() )
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
        case CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
            return ( ( InternalEList< ? > ) getThermalGeneratingUnits() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING:
            return getCombCyclePlantRating();
        case CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
            return getThermalGeneratingUnits();
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
        case CimPackage.COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING:
            setCombCyclePlantRating( ( Float ) newValue );
            return;
        case CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
            getThermalGeneratingUnits().clear();
            getThermalGeneratingUnits().addAll( ( Collection< ? extends ThermalGeneratingUnit > ) newValue );
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
        case CimPackage.COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING:
            unsetCombCyclePlantRating();
            return;
        case CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
            unsetThermalGeneratingUnits();
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
        case CimPackage.COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING:
            return isSetCombCyclePlantRating();
        case CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
            return isSetThermalGeneratingUnits();
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
        result.append( " (combCyclePlantRating: " );
        if( combCyclePlantRatingESet )
            result.append( combCyclePlantRating );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CombinedCyclePlantImpl
