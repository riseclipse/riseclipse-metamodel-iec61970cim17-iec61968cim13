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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroEnergyConversionKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingEfficiencyCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PenstockLossCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TailbayLossCurve;

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
 * An implementation of the model object '<em><b>Hydro Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroGeneratingUnitImpl#getEnergyConversionCapability <em>Energy Conversion Capability</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroGeneratingUnitImpl#getHydroUnitWaterCost <em>Hydro Unit Water Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroGeneratingUnitImpl#getHydroPowerPlant <em>Hydro Power Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroGeneratingUnitImpl#getPenstockLossCurve <em>Penstock Loss Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroGeneratingUnitImpl#getHydroGeneratingEfficiencyCurves <em>Hydro Generating Efficiency Curves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroGeneratingUnitImpl#getTailbayLossCurve <em>Tailbay Loss Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydroGeneratingUnitImpl extends GeneratingUnitImpl implements HydroGeneratingUnit {
    /**
     * The default value of the '{@link #getEnergyConversionCapability() <em>Energy Conversion Capability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyConversionCapability()
     * @generated
     * @ordered
     */
    protected static final HydroEnergyConversionKind ENERGY_CONVERSION_CAPABILITY_EDEFAULT = HydroEnergyConversionKind.GENERATOR;

    /**
     * The cached value of the '{@link #getEnergyConversionCapability() <em>Energy Conversion Capability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyConversionCapability()
     * @generated
     * @ordered
     */
    protected HydroEnergyConversionKind energyConversionCapability = ENERGY_CONVERSION_CAPABILITY_EDEFAULT;

    /**
     * This is true if the Energy Conversion Capability attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energyConversionCapabilityESet;

    /**
     * The default value of the '{@link #getHydroUnitWaterCost() <em>Hydro Unit Water Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroUnitWaterCost()
     * @generated
     * @ordered
     */
    protected static final Float HYDRO_UNIT_WATER_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHydroUnitWaterCost() <em>Hydro Unit Water Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroUnitWaterCost()
     * @generated
     * @ordered
     */
    protected Float hydroUnitWaterCost = HYDRO_UNIT_WATER_COST_EDEFAULT;

    /**
     * This is true if the Hydro Unit Water Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hydroUnitWaterCostESet;

    /**
     * The cached value of the '{@link #getHydroPowerPlant() <em>Hydro Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroPowerPlant()
     * @generated
     * @ordered
     */
    protected HydroPowerPlant hydroPowerPlant;

    /**
     * This is true if the Hydro Power Plant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hydroPowerPlantESet;

    /**
     * The cached value of the '{@link #getPenstockLossCurve() <em>Penstock Loss Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPenstockLossCurve()
     * @generated
     * @ordered
     */
    protected PenstockLossCurve penstockLossCurve;

    /**
     * This is true if the Penstock Loss Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean penstockLossCurveESet;

    /**
     * The cached value of the '{@link #getHydroGeneratingEfficiencyCurves() <em>Hydro Generating Efficiency Curves</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroGeneratingEfficiencyCurves()
     * @generated
     * @ordered
     */
    protected EList< HydroGeneratingEfficiencyCurve > hydroGeneratingEfficiencyCurves;

    /**
     * The cached value of the '{@link #getTailbayLossCurve() <em>Tailbay Loss Curve</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTailbayLossCurve()
     * @generated
     * @ordered
     */
    protected EList< TailbayLossCurve > tailbayLossCurve;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HydroGeneratingUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getHydroGeneratingUnit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroEnergyConversionKind getEnergyConversionCapability() {
        return energyConversionCapability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnergyConversionCapability( HydroEnergyConversionKind newEnergyConversionCapability ) {
        HydroEnergyConversionKind oldEnergyConversionCapability = energyConversionCapability;
        energyConversionCapability = newEnergyConversionCapability == null ? ENERGY_CONVERSION_CAPABILITY_EDEFAULT
                : newEnergyConversionCapability;
        boolean oldEnergyConversionCapabilityESet = energyConversionCapabilityESet;
        energyConversionCapabilityESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY, oldEnergyConversionCapability,
                energyConversionCapability, !oldEnergyConversionCapabilityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergyConversionCapability() {
        HydroEnergyConversionKind oldEnergyConversionCapability = energyConversionCapability;
        boolean oldEnergyConversionCapabilityESet = energyConversionCapabilityESet;
        energyConversionCapability = ENERGY_CONVERSION_CAPABILITY_EDEFAULT;
        energyConversionCapabilityESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY, oldEnergyConversionCapability,
                ENERGY_CONVERSION_CAPABILITY_EDEFAULT, oldEnergyConversionCapabilityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergyConversionCapability() {
        return energyConversionCapabilityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHydroUnitWaterCost() {
        return hydroUnitWaterCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHydroUnitWaterCost( Float newHydroUnitWaterCost ) {
        Float oldHydroUnitWaterCost = hydroUnitWaterCost;
        hydroUnitWaterCost = newHydroUnitWaterCost;
        boolean oldHydroUnitWaterCostESet = hydroUnitWaterCostESet;
        hydroUnitWaterCostESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST,
                        oldHydroUnitWaterCost, hydroUnitWaterCost, !oldHydroUnitWaterCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHydroUnitWaterCost() {
        Float oldHydroUnitWaterCost = hydroUnitWaterCost;
        boolean oldHydroUnitWaterCostESet = hydroUnitWaterCostESet;
        hydroUnitWaterCost = HYDRO_UNIT_WATER_COST_EDEFAULT;
        hydroUnitWaterCostESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST, oldHydroUnitWaterCost,
                HYDRO_UNIT_WATER_COST_EDEFAULT, oldHydroUnitWaterCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroUnitWaterCost() {
        return hydroUnitWaterCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroPowerPlant getHydroPowerPlant() {
        return hydroPowerPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHydroPowerPlant( HydroPowerPlant newHydroPowerPlant, NotificationChain msgs ) {
        HydroPowerPlant oldHydroPowerPlant = hydroPowerPlant;
        hydroPowerPlant = newHydroPowerPlant;
        boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
        hydroPowerPlantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT, oldHydroPowerPlant, newHydroPowerPlant,
                    !oldHydroPowerPlantESet );
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
    public void setHydroPowerPlant( HydroPowerPlant newHydroPowerPlant ) {
        if( newHydroPowerPlant != hydroPowerPlant ) {
            NotificationChain msgs = null;
            if( hydroPowerPlant != null ) msgs = ( ( InternalEObject ) hydroPowerPlant ).eInverseRemove( this,
                    CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS, HydroPowerPlant.class, msgs );
            if( newHydroPowerPlant != null ) msgs = ( ( InternalEObject ) newHydroPowerPlant ).eInverseAdd( this,
                    CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS, HydroPowerPlant.class, msgs );
            msgs = basicSetHydroPowerPlant( newHydroPowerPlant, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
            hydroPowerPlantESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT,
                            newHydroPowerPlant, newHydroPowerPlant, !oldHydroPowerPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetHydroPowerPlant( NotificationChain msgs ) {
        HydroPowerPlant oldHydroPowerPlant = hydroPowerPlant;
        hydroPowerPlant = null;
        boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
        hydroPowerPlantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT, oldHydroPowerPlant, null,
                    oldHydroPowerPlantESet );
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
    public void unsetHydroPowerPlant() {
        if( hydroPowerPlant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) hydroPowerPlant ).eInverseRemove( this,
                    CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS, HydroPowerPlant.class, msgs );
            msgs = basicUnsetHydroPowerPlant( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
            hydroPowerPlantESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT, null, null, oldHydroPowerPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroPowerPlant() {
        return hydroPowerPlantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PenstockLossCurve getPenstockLossCurve() {
        return penstockLossCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPenstockLossCurve( PenstockLossCurve newPenstockLossCurve,
            NotificationChain msgs ) {
        PenstockLossCurve oldPenstockLossCurve = penstockLossCurve;
        penstockLossCurve = newPenstockLossCurve;
        boolean oldPenstockLossCurveESet = penstockLossCurveESet;
        penstockLossCurveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE, oldPenstockLossCurve, newPenstockLossCurve,
                    !oldPenstockLossCurveESet );
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
    public void setPenstockLossCurve( PenstockLossCurve newPenstockLossCurve ) {
        if( newPenstockLossCurve != penstockLossCurve ) {
            NotificationChain msgs = null;
            if( penstockLossCurve != null ) msgs = ( ( InternalEObject ) penstockLossCurve ).eInverseRemove( this,
                    CimPackage.PENSTOCK_LOSS_CURVE__HYDRO_GENERATING_UNIT, PenstockLossCurve.class, msgs );
            if( newPenstockLossCurve != null ) msgs = ( ( InternalEObject ) newPenstockLossCurve ).eInverseAdd( this,
                    CimPackage.PENSTOCK_LOSS_CURVE__HYDRO_GENERATING_UNIT, PenstockLossCurve.class, msgs );
            msgs = basicSetPenstockLossCurve( newPenstockLossCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPenstockLossCurveESet = penstockLossCurveESet;
            penstockLossCurveESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE, newPenstockLossCurve, newPenstockLossCurve,
                    !oldPenstockLossCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPenstockLossCurve( NotificationChain msgs ) {
        PenstockLossCurve oldPenstockLossCurve = penstockLossCurve;
        penstockLossCurve = null;
        boolean oldPenstockLossCurveESet = penstockLossCurveESet;
        penstockLossCurveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE, oldPenstockLossCurve, null,
                    oldPenstockLossCurveESet );
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
    public void unsetPenstockLossCurve() {
        if( penstockLossCurve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) penstockLossCurve ).eInverseRemove( this,
                    CimPackage.PENSTOCK_LOSS_CURVE__HYDRO_GENERATING_UNIT, PenstockLossCurve.class, msgs );
            msgs = basicUnsetPenstockLossCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPenstockLossCurveESet = penstockLossCurveESet;
            penstockLossCurveESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE, null, null, oldPenstockLossCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPenstockLossCurve() {
        return penstockLossCurveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< HydroGeneratingEfficiencyCurve > getHydroGeneratingEfficiencyCurves() {
        if( hydroGeneratingEfficiencyCurves == null ) {
            hydroGeneratingEfficiencyCurves = new EObjectWithInverseResolvingEList.Unsettable< HydroGeneratingEfficiencyCurve >(
                    HydroGeneratingEfficiencyCurve.class, this,
                    CimPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES,
                    CimPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT );
        }
        return hydroGeneratingEfficiencyCurves;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHydroGeneratingEfficiencyCurves() {
        if( hydroGeneratingEfficiencyCurves != null )
            ( ( InternalEList.Unsettable< ? > ) hydroGeneratingEfficiencyCurves ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroGeneratingEfficiencyCurves() {
        return hydroGeneratingEfficiencyCurves != null
                && ( ( InternalEList.Unsettable< ? > ) hydroGeneratingEfficiencyCurves ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TailbayLossCurve > getTailbayLossCurve() {
        if( tailbayLossCurve == null ) {
            tailbayLossCurve = new EObjectWithInverseResolvingEList.Unsettable< TailbayLossCurve >(
                    TailbayLossCurve.class, this, CimPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE,
                    CimPackage.TAILBAY_LOSS_CURVE__HYDRO_GENERATING_UNIT );
        }
        return tailbayLossCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTailbayLossCurve() {
        if( tailbayLossCurve != null ) ( ( InternalEList.Unsettable< ? > ) tailbayLossCurve ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTailbayLossCurve() {
        return tailbayLossCurve != null && ( ( InternalEList.Unsettable< ? > ) tailbayLossCurve ).isSet();
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
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
            if( hydroPowerPlant != null ) msgs = ( ( InternalEObject ) hydroPowerPlant ).eInverseRemove( this,
                    CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS, HydroPowerPlant.class, msgs );
            return basicSetHydroPowerPlant( ( HydroPowerPlant ) otherEnd, msgs );
        case CimPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
            if( penstockLossCurve != null ) msgs = ( ( InternalEObject ) penstockLossCurve ).eInverseRemove( this,
                    CimPackage.PENSTOCK_LOSS_CURVE__HYDRO_GENERATING_UNIT, PenstockLossCurve.class, msgs );
            return basicSetPenstockLossCurve( ( PenstockLossCurve ) otherEnd, msgs );
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getHydroGeneratingEfficiencyCurves() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTailbayLossCurve() )
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
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
            return basicUnsetHydroPowerPlant( msgs );
        case CimPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
            return basicUnsetPenstockLossCurve( msgs );
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
            return ( ( InternalEList< ? > ) getHydroGeneratingEfficiencyCurves() ).basicRemove( otherEnd, msgs );
        case CimPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
            return ( ( InternalEList< ? > ) getTailbayLossCurve() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
            return getEnergyConversionCapability();
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST:
            return getHydroUnitWaterCost();
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
            return getHydroPowerPlant();
        case CimPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
            return getPenstockLossCurve();
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
            return getHydroGeneratingEfficiencyCurves();
        case CimPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
            return getTailbayLossCurve();
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
        case CimPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
            setEnergyConversionCapability( ( HydroEnergyConversionKind ) newValue );
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST:
            setHydroUnitWaterCost( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
            setHydroPowerPlant( ( HydroPowerPlant ) newValue );
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
            setPenstockLossCurve( ( PenstockLossCurve ) newValue );
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
            getHydroGeneratingEfficiencyCurves().clear();
            getHydroGeneratingEfficiencyCurves()
                    .addAll( ( Collection< ? extends HydroGeneratingEfficiencyCurve > ) newValue );
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
            getTailbayLossCurve().clear();
            getTailbayLossCurve().addAll( ( Collection< ? extends TailbayLossCurve > ) newValue );
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
        case CimPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
            unsetEnergyConversionCapability();
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST:
            unsetHydroUnitWaterCost();
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
            unsetHydroPowerPlant();
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
            unsetPenstockLossCurve();
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
            unsetHydroGeneratingEfficiencyCurves();
            return;
        case CimPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
            unsetTailbayLossCurve();
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
        case CimPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
            return isSetEnergyConversionCapability();
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST:
            return isSetHydroUnitWaterCost();
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
            return isSetHydroPowerPlant();
        case CimPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
            return isSetPenstockLossCurve();
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
            return isSetHydroGeneratingEfficiencyCurves();
        case CimPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
            return isSetTailbayLossCurve();
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
        result.append( " (energyConversionCapability: " );
        if( energyConversionCapabilityESet )
            result.append( energyConversionCapability );
        else
            result.append( "<unset>" );
        result.append( ", hydroUnitWaterCost: " );
        if( hydroUnitWaterCostESet )
            result.append( hydroUnitWaterCost );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //HydroGeneratingUnitImpl
