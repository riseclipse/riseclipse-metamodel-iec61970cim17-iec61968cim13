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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InflowForecast;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LevelVsVolumeCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule;

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
 * An implementation of the model object '<em><b>Reservoir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getActiveStorageCapacity <em>Active Storage Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getEnergyStorageRating <em>Energy Storage Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getFullSupplyLevel <em>Full Supply Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getGrossCapacity <em>Gross Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getNormalMinOperateLevel <em>Normal Min Operate Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getRiverOutletWorks <em>River Outlet Works</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getSpillTravelDelay <em>Spill Travel Delay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getSpillwayCapacity <em>Spillway Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getSpillwayCrestLength <em>Spillway Crest Length</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getSpillwayCrestLevel <em>Spillway Crest Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getSpillWayGateType <em>Spill Way Gate Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getSpillsFromReservoir <em>Spills From Reservoir</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getUpstreamFromHydroPowerPlants <em>Upstream From Hydro Power Plants</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getLevelVsVolumeCurves <em>Level Vs Volume Curves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getInflowForecasts <em>Inflow Forecasts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getTargetLevelSchedule <em>Target Level Schedule</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getHydroPowerPlants <em>Hydro Power Plants</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReservoirImpl#getSpillsIntoReservoirs <em>Spills Into Reservoirs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservoirImpl extends PowerSystemResourceImpl implements Reservoir {
    /**
     * The default value of the '{@link #getActiveStorageCapacity() <em>Active Storage Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActiveStorageCapacity()
     * @generated
     * @ordered
     */
    protected static final Float ACTIVE_STORAGE_CAPACITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getActiveStorageCapacity() <em>Active Storage Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActiveStorageCapacity()
     * @generated
     * @ordered
     */
    protected Float activeStorageCapacity = ACTIVE_STORAGE_CAPACITY_EDEFAULT;

    /**
     * This is true if the Active Storage Capacity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean activeStorageCapacityESet;

    /**
     * The default value of the '{@link #getEnergyStorageRating() <em>Energy Storage Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyStorageRating()
     * @generated
     * @ordered
     */
    protected static final Float ENERGY_STORAGE_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnergyStorageRating() <em>Energy Storage Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyStorageRating()
     * @generated
     * @ordered
     */
    protected Float energyStorageRating = ENERGY_STORAGE_RATING_EDEFAULT;

    /**
     * This is true if the Energy Storage Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energyStorageRatingESet;

    /**
     * The default value of the '{@link #getFullSupplyLevel() <em>Full Supply Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFullSupplyLevel()
     * @generated
     * @ordered
     */
    protected static final Float FULL_SUPPLY_LEVEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFullSupplyLevel() <em>Full Supply Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFullSupplyLevel()
     * @generated
     * @ordered
     */
    protected Float fullSupplyLevel = FULL_SUPPLY_LEVEL_EDEFAULT;

    /**
     * This is true if the Full Supply Level attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fullSupplyLevelESet;

    /**
     * The default value of the '{@link #getGrossCapacity() <em>Gross Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrossCapacity()
     * @generated
     * @ordered
     */
    protected static final Float GROSS_CAPACITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGrossCapacity() <em>Gross Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrossCapacity()
     * @generated
     * @ordered
     */
    protected Float grossCapacity = GROSS_CAPACITY_EDEFAULT;

    /**
     * This is true if the Gross Capacity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean grossCapacityESet;

    /**
     * The default value of the '{@link #getNormalMinOperateLevel() <em>Normal Min Operate Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalMinOperateLevel()
     * @generated
     * @ordered
     */
    protected static final Float NORMAL_MIN_OPERATE_LEVEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNormalMinOperateLevel() <em>Normal Min Operate Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalMinOperateLevel()
     * @generated
     * @ordered
     */
    protected Float normalMinOperateLevel = NORMAL_MIN_OPERATE_LEVEL_EDEFAULT;

    /**
     * This is true if the Normal Min Operate Level attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean normalMinOperateLevelESet;

    /**
     * The default value of the '{@link #getRiverOutletWorks() <em>River Outlet Works</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRiverOutletWorks()
     * @generated
     * @ordered
     */
    protected static final String RIVER_OUTLET_WORKS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRiverOutletWorks() <em>River Outlet Works</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRiverOutletWorks()
     * @generated
     * @ordered
     */
    protected String riverOutletWorks = RIVER_OUTLET_WORKS_EDEFAULT;

    /**
     * This is true if the River Outlet Works attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean riverOutletWorksESet;

    /**
     * The default value of the '{@link #getSpillTravelDelay() <em>Spill Travel Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpillTravelDelay()
     * @generated
     * @ordered
     */
    protected static final Float SPILL_TRAVEL_DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpillTravelDelay() <em>Spill Travel Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpillTravelDelay()
     * @generated
     * @ordered
     */
    protected Float spillTravelDelay = SPILL_TRAVEL_DELAY_EDEFAULT;

    /**
     * This is true if the Spill Travel Delay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean spillTravelDelayESet;

    /**
     * The default value of the '{@link #getSpillwayCapacity() <em>Spillway Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpillwayCapacity()
     * @generated
     * @ordered
     */
    protected static final Float SPILLWAY_CAPACITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpillwayCapacity() <em>Spillway Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpillwayCapacity()
     * @generated
     * @ordered
     */
    protected Float spillwayCapacity = SPILLWAY_CAPACITY_EDEFAULT;

    /**
     * This is true if the Spillway Capacity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean spillwayCapacityESet;

    /**
     * The default value of the '{@link #getSpillwayCrestLength() <em>Spillway Crest Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpillwayCrestLength()
     * @generated
     * @ordered
     */
    protected static final Float SPILLWAY_CREST_LENGTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpillwayCrestLength() <em>Spillway Crest Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpillwayCrestLength()
     * @generated
     * @ordered
     */
    protected Float spillwayCrestLength = SPILLWAY_CREST_LENGTH_EDEFAULT;

    /**
     * This is true if the Spillway Crest Length attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean spillwayCrestLengthESet;

    /**
     * The default value of the '{@link #getSpillwayCrestLevel() <em>Spillway Crest Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpillwayCrestLevel()
     * @generated
     * @ordered
     */
    protected static final Float SPILLWAY_CREST_LEVEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpillwayCrestLevel() <em>Spillway Crest Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpillwayCrestLevel()
     * @generated
     * @ordered
     */
    protected Float spillwayCrestLevel = SPILLWAY_CREST_LEVEL_EDEFAULT;

    /**
     * This is true if the Spillway Crest Level attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean spillwayCrestLevelESet;

    /**
     * The default value of the '{@link #getSpillWayGateType() <em>Spill Way Gate Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpillWayGateType()
     * @generated
     * @ordered
     */
    protected static final String SPILL_WAY_GATE_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpillWayGateType() <em>Spill Way Gate Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpillWayGateType()
     * @generated
     * @ordered
     */
    protected String spillWayGateType = SPILL_WAY_GATE_TYPE_EDEFAULT;

    /**
     * This is true if the Spill Way Gate Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean spillWayGateTypeESet;

    /**
     * The cached value of the '{@link #getSpillsFromReservoir() <em>Spills From Reservoir</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpillsFromReservoir()
     * @generated
     * @ordered
     */
    protected Reservoir spillsFromReservoir;

    /**
     * This is true if the Spills From Reservoir reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean spillsFromReservoirESet;

    /**
     * The cached value of the '{@link #getUpstreamFromHydroPowerPlants() <em>Upstream From Hydro Power Plants</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpstreamFromHydroPowerPlants()
     * @generated
     * @ordered
     */
    protected EList< HydroPowerPlant > upstreamFromHydroPowerPlants;

    /**
     * The cached value of the '{@link #getLevelVsVolumeCurves() <em>Level Vs Volume Curves</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLevelVsVolumeCurves()
     * @generated
     * @ordered
     */
    protected EList< LevelVsVolumeCurve > levelVsVolumeCurves;

    /**
     * The cached value of the '{@link #getInflowForecasts() <em>Inflow Forecasts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInflowForecasts()
     * @generated
     * @ordered
     */
    protected EList< InflowForecast > inflowForecasts;

    /**
     * The cached value of the '{@link #getTargetLevelSchedule() <em>Target Level Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetLevelSchedule()
     * @generated
     * @ordered
     */
    protected TargetLevelSchedule targetLevelSchedule;

    /**
     * This is true if the Target Level Schedule reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetLevelScheduleESet;

    /**
     * The cached value of the '{@link #getHydroPowerPlants() <em>Hydro Power Plants</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroPowerPlants()
     * @generated
     * @ordered
     */
    protected EList< HydroPowerPlant > hydroPowerPlants;

    /**
     * The cached value of the '{@link #getSpillsIntoReservoirs() <em>Spills Into Reservoirs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpillsIntoReservoirs()
     * @generated
     * @ordered
     */
    protected EList< Reservoir > spillsIntoReservoirs;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReservoirImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getReservoir();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getActiveStorageCapacity() {
        return activeStorageCapacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setActiveStorageCapacity( Float newActiveStorageCapacity ) {
        Float oldActiveStorageCapacity = activeStorageCapacity;
        activeStorageCapacity = newActiveStorageCapacity;
        boolean oldActiveStorageCapacityESet = activeStorageCapacityESet;
        activeStorageCapacityESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY,
                    oldActiveStorageCapacity, activeStorageCapacity, !oldActiveStorageCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetActiveStorageCapacity() {
        Float oldActiveStorageCapacity = activeStorageCapacity;
        boolean oldActiveStorageCapacityESet = activeStorageCapacityESet;
        activeStorageCapacity = ACTIVE_STORAGE_CAPACITY_EDEFAULT;
        activeStorageCapacityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY,
                    oldActiveStorageCapacity, ACTIVE_STORAGE_CAPACITY_EDEFAULT, oldActiveStorageCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActiveStorageCapacity() {
        return activeStorageCapacityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEnergyStorageRating() {
        return energyStorageRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnergyStorageRating( Float newEnergyStorageRating ) {
        Float oldEnergyStorageRating = energyStorageRating;
        energyStorageRating = newEnergyStorageRating;
        boolean oldEnergyStorageRatingESet = energyStorageRatingESet;
        energyStorageRatingESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.RESERVOIR__ENERGY_STORAGE_RATING,
                    oldEnergyStorageRating, energyStorageRating, !oldEnergyStorageRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergyStorageRating() {
        Float oldEnergyStorageRating = energyStorageRating;
        boolean oldEnergyStorageRatingESet = energyStorageRatingESet;
        energyStorageRating = ENERGY_STORAGE_RATING_EDEFAULT;
        energyStorageRatingESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.RESERVOIR__ENERGY_STORAGE_RATING,
                    oldEnergyStorageRating, ENERGY_STORAGE_RATING_EDEFAULT, oldEnergyStorageRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergyStorageRating() {
        return energyStorageRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFullSupplyLevel() {
        return fullSupplyLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFullSupplyLevel( Float newFullSupplyLevel ) {
        Float oldFullSupplyLevel = fullSupplyLevel;
        fullSupplyLevel = newFullSupplyLevel;
        boolean oldFullSupplyLevelESet = fullSupplyLevelESet;
        fullSupplyLevelESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.RESERVOIR__FULL_SUPPLY_LEVEL,
                    oldFullSupplyLevel, fullSupplyLevel, !oldFullSupplyLevelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFullSupplyLevel() {
        Float oldFullSupplyLevel = fullSupplyLevel;
        boolean oldFullSupplyLevelESet = fullSupplyLevelESet;
        fullSupplyLevel = FULL_SUPPLY_LEVEL_EDEFAULT;
        fullSupplyLevelESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.RESERVOIR__FULL_SUPPLY_LEVEL,
                    oldFullSupplyLevel, FULL_SUPPLY_LEVEL_EDEFAULT, oldFullSupplyLevelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFullSupplyLevel() {
        return fullSupplyLevelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGrossCapacity() {
        return grossCapacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGrossCapacity( Float newGrossCapacity ) {
        Float oldGrossCapacity = grossCapacity;
        grossCapacity = newGrossCapacity;
        boolean oldGrossCapacityESet = grossCapacityESet;
        grossCapacityESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.RESERVOIR__GROSS_CAPACITY, oldGrossCapacity, grossCapacity, !oldGrossCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGrossCapacity() {
        Float oldGrossCapacity = grossCapacity;
        boolean oldGrossCapacityESet = grossCapacityESet;
        grossCapacity = GROSS_CAPACITY_EDEFAULT;
        grossCapacityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.RESERVOIR__GROSS_CAPACITY,
                    oldGrossCapacity, GROSS_CAPACITY_EDEFAULT, oldGrossCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGrossCapacity() {
        return grossCapacityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNormalMinOperateLevel() {
        return normalMinOperateLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNormalMinOperateLevel( Float newNormalMinOperateLevel ) {
        Float oldNormalMinOperateLevel = normalMinOperateLevel;
        normalMinOperateLevel = newNormalMinOperateLevel;
        boolean oldNormalMinOperateLevelESet = normalMinOperateLevelESet;
        normalMinOperateLevelESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL,
                    oldNormalMinOperateLevel, normalMinOperateLevel, !oldNormalMinOperateLevelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNormalMinOperateLevel() {
        Float oldNormalMinOperateLevel = normalMinOperateLevel;
        boolean oldNormalMinOperateLevelESet = normalMinOperateLevelESet;
        normalMinOperateLevel = NORMAL_MIN_OPERATE_LEVEL_EDEFAULT;
        normalMinOperateLevelESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL,
                    oldNormalMinOperateLevel, NORMAL_MIN_OPERATE_LEVEL_EDEFAULT, oldNormalMinOperateLevelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNormalMinOperateLevel() {
        return normalMinOperateLevelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRiverOutletWorks() {
        return riverOutletWorks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRiverOutletWorks( String newRiverOutletWorks ) {
        String oldRiverOutletWorks = riverOutletWorks;
        riverOutletWorks = newRiverOutletWorks;
        boolean oldRiverOutletWorksESet = riverOutletWorksESet;
        riverOutletWorksESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.RESERVOIR__RIVER_OUTLET_WORKS,
                    oldRiverOutletWorks, riverOutletWorks, !oldRiverOutletWorksESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRiverOutletWorks() {
        String oldRiverOutletWorks = riverOutletWorks;
        boolean oldRiverOutletWorksESet = riverOutletWorksESet;
        riverOutletWorks = RIVER_OUTLET_WORKS_EDEFAULT;
        riverOutletWorksESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.RESERVOIR__RIVER_OUTLET_WORKS,
                    oldRiverOutletWorks, RIVER_OUTLET_WORKS_EDEFAULT, oldRiverOutletWorksESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRiverOutletWorks() {
        return riverOutletWorksESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSpillTravelDelay() {
        return spillTravelDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpillTravelDelay( Float newSpillTravelDelay ) {
        Float oldSpillTravelDelay = spillTravelDelay;
        spillTravelDelay = newSpillTravelDelay;
        boolean oldSpillTravelDelayESet = spillTravelDelayESet;
        spillTravelDelayESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.RESERVOIR__SPILL_TRAVEL_DELAY,
                    oldSpillTravelDelay, spillTravelDelay, !oldSpillTravelDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpillTravelDelay() {
        Float oldSpillTravelDelay = spillTravelDelay;
        boolean oldSpillTravelDelayESet = spillTravelDelayESet;
        spillTravelDelay = SPILL_TRAVEL_DELAY_EDEFAULT;
        spillTravelDelayESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.RESERVOIR__SPILL_TRAVEL_DELAY,
                    oldSpillTravelDelay, SPILL_TRAVEL_DELAY_EDEFAULT, oldSpillTravelDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpillTravelDelay() {
        return spillTravelDelayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSpillwayCapacity() {
        return spillwayCapacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpillwayCapacity( Float newSpillwayCapacity ) {
        Float oldSpillwayCapacity = spillwayCapacity;
        spillwayCapacity = newSpillwayCapacity;
        boolean oldSpillwayCapacityESet = spillwayCapacityESet;
        spillwayCapacityESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.RESERVOIR__SPILLWAY_CAPACITY,
                    oldSpillwayCapacity, spillwayCapacity, !oldSpillwayCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpillwayCapacity() {
        Float oldSpillwayCapacity = spillwayCapacity;
        boolean oldSpillwayCapacityESet = spillwayCapacityESet;
        spillwayCapacity = SPILLWAY_CAPACITY_EDEFAULT;
        spillwayCapacityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.RESERVOIR__SPILLWAY_CAPACITY,
                    oldSpillwayCapacity, SPILLWAY_CAPACITY_EDEFAULT, oldSpillwayCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpillwayCapacity() {
        return spillwayCapacityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSpillwayCrestLength() {
        return spillwayCrestLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpillwayCrestLength( Float newSpillwayCrestLength ) {
        Float oldSpillwayCrestLength = spillwayCrestLength;
        spillwayCrestLength = newSpillwayCrestLength;
        boolean oldSpillwayCrestLengthESet = spillwayCrestLengthESet;
        spillwayCrestLengthESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.RESERVOIR__SPILLWAY_CREST_LENGTH,
                    oldSpillwayCrestLength, spillwayCrestLength, !oldSpillwayCrestLengthESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpillwayCrestLength() {
        Float oldSpillwayCrestLength = spillwayCrestLength;
        boolean oldSpillwayCrestLengthESet = spillwayCrestLengthESet;
        spillwayCrestLength = SPILLWAY_CREST_LENGTH_EDEFAULT;
        spillwayCrestLengthESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.RESERVOIR__SPILLWAY_CREST_LENGTH,
                    oldSpillwayCrestLength, SPILLWAY_CREST_LENGTH_EDEFAULT, oldSpillwayCrestLengthESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpillwayCrestLength() {
        return spillwayCrestLengthESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSpillwayCrestLevel() {
        return spillwayCrestLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpillwayCrestLevel( Float newSpillwayCrestLevel ) {
        Float oldSpillwayCrestLevel = spillwayCrestLevel;
        spillwayCrestLevel = newSpillwayCrestLevel;
        boolean oldSpillwayCrestLevelESet = spillwayCrestLevelESet;
        spillwayCrestLevelESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.RESERVOIR__SPILLWAY_CREST_LEVEL,
                    oldSpillwayCrestLevel, spillwayCrestLevel, !oldSpillwayCrestLevelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpillwayCrestLevel() {
        Float oldSpillwayCrestLevel = spillwayCrestLevel;
        boolean oldSpillwayCrestLevelESet = spillwayCrestLevelESet;
        spillwayCrestLevel = SPILLWAY_CREST_LEVEL_EDEFAULT;
        spillwayCrestLevelESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.RESERVOIR__SPILLWAY_CREST_LEVEL,
                    oldSpillwayCrestLevel, SPILLWAY_CREST_LEVEL_EDEFAULT, oldSpillwayCrestLevelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpillwayCrestLevel() {
        return spillwayCrestLevelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSpillWayGateType() {
        return spillWayGateType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpillWayGateType( String newSpillWayGateType ) {
        String oldSpillWayGateType = spillWayGateType;
        spillWayGateType = newSpillWayGateType;
        boolean oldSpillWayGateTypeESet = spillWayGateTypeESet;
        spillWayGateTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.RESERVOIR__SPILL_WAY_GATE_TYPE,
                    oldSpillWayGateType, spillWayGateType, !oldSpillWayGateTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpillWayGateType() {
        String oldSpillWayGateType = spillWayGateType;
        boolean oldSpillWayGateTypeESet = spillWayGateTypeESet;
        spillWayGateType = SPILL_WAY_GATE_TYPE_EDEFAULT;
        spillWayGateTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.RESERVOIR__SPILL_WAY_GATE_TYPE,
                    oldSpillWayGateType, SPILL_WAY_GATE_TYPE_EDEFAULT, oldSpillWayGateTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpillWayGateType() {
        return spillWayGateTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Reservoir getSpillsFromReservoir() {
        return spillsFromReservoir;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSpillsFromReservoir( Reservoir newSpillsFromReservoir, NotificationChain msgs ) {
        Reservoir oldSpillsFromReservoir = spillsFromReservoir;
        spillsFromReservoir = newSpillsFromReservoir;
        boolean oldSpillsFromReservoirESet = spillsFromReservoirESet;
        spillsFromReservoirESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.RESERVOIR__SPILLS_FROM_RESERVOIR, oldSpillsFromReservoir, newSpillsFromReservoir,
                    !oldSpillsFromReservoirESet );
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
    public void setSpillsFromReservoir( Reservoir newSpillsFromReservoir ) {
        if( newSpillsFromReservoir != spillsFromReservoir ) {
            NotificationChain msgs = null;
            if( spillsFromReservoir != null ) msgs = ( ( InternalEObject ) spillsFromReservoir ).eInverseRemove( this,
                    CimPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS, Reservoir.class, msgs );
            if( newSpillsFromReservoir != null ) msgs = ( ( InternalEObject ) newSpillsFromReservoir )
                    .eInverseAdd( this, CimPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS, Reservoir.class, msgs );
            msgs = basicSetSpillsFromReservoir( newSpillsFromReservoir, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSpillsFromReservoirESet = spillsFromReservoirESet;
            spillsFromReservoirESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.RESERVOIR__SPILLS_FROM_RESERVOIR,
                        newSpillsFromReservoir, newSpillsFromReservoir, !oldSpillsFromReservoirESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSpillsFromReservoir( NotificationChain msgs ) {
        Reservoir oldSpillsFromReservoir = spillsFromReservoir;
        spillsFromReservoir = null;
        boolean oldSpillsFromReservoirESet = spillsFromReservoirESet;
        spillsFromReservoirESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RESERVOIR__SPILLS_FROM_RESERVOIR, oldSpillsFromReservoir, null,
                    oldSpillsFromReservoirESet );
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
    public void unsetSpillsFromReservoir() {
        if( spillsFromReservoir != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) spillsFromReservoir ).eInverseRemove( this,
                    CimPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS, Reservoir.class, msgs );
            msgs = basicUnsetSpillsFromReservoir( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSpillsFromReservoirESet = spillsFromReservoirESet;
            spillsFromReservoirESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RESERVOIR__SPILLS_FROM_RESERVOIR, null, null, oldSpillsFromReservoirESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpillsFromReservoir() {
        return spillsFromReservoirESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< HydroPowerPlant > getUpstreamFromHydroPowerPlants() {
        if( upstreamFromHydroPowerPlants == null ) {
            upstreamFromHydroPowerPlants = new EObjectWithInverseResolvingEList.Unsettable< HydroPowerPlant >(
                    HydroPowerPlant.class, this, CimPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS,
                    CimPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR );
        }
        return upstreamFromHydroPowerPlants;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUpstreamFromHydroPowerPlants() {
        if( upstreamFromHydroPowerPlants != null )
            ( ( InternalEList.Unsettable< ? > ) upstreamFromHydroPowerPlants ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUpstreamFromHydroPowerPlants() {
        return upstreamFromHydroPowerPlants != null
                && ( ( InternalEList.Unsettable< ? > ) upstreamFromHydroPowerPlants ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LevelVsVolumeCurve > getLevelVsVolumeCurves() {
        if( levelVsVolumeCurves == null ) {
            levelVsVolumeCurves = new EObjectWithInverseResolvingEList.Unsettable< LevelVsVolumeCurve >(
                    LevelVsVolumeCurve.class, this, CimPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES,
                    CimPackage.LEVEL_VS_VOLUME_CURVE__RESERVOIR );
        }
        return levelVsVolumeCurves;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLevelVsVolumeCurves() {
        if( levelVsVolumeCurves != null ) ( ( InternalEList.Unsettable< ? > ) levelVsVolumeCurves ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLevelVsVolumeCurves() {
        return levelVsVolumeCurves != null && ( ( InternalEList.Unsettable< ? > ) levelVsVolumeCurves ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< InflowForecast > getInflowForecasts() {
        if( inflowForecasts == null ) {
            inflowForecasts = new EObjectWithInverseResolvingEList.Unsettable< InflowForecast >( InflowForecast.class,
                    this, CimPackage.RESERVOIR__INFLOW_FORECASTS, CimPackage.INFLOW_FORECAST__RESERVOIR );
        }
        return inflowForecasts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInflowForecasts() {
        if( inflowForecasts != null ) ( ( InternalEList.Unsettable< ? > ) inflowForecasts ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInflowForecasts() {
        return inflowForecasts != null && ( ( InternalEList.Unsettable< ? > ) inflowForecasts ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TargetLevelSchedule getTargetLevelSchedule() {
        if( targetLevelSchedule != null && targetLevelSchedule.eIsProxy() ) {
            InternalEObject oldTargetLevelSchedule = ( InternalEObject ) targetLevelSchedule;
            targetLevelSchedule = ( TargetLevelSchedule ) eResolveProxy( oldTargetLevelSchedule );
            if( targetLevelSchedule != oldTargetLevelSchedule ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, oldTargetLevelSchedule, targetLevelSchedule ) );
            }
        }
        return targetLevelSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TargetLevelSchedule basicGetTargetLevelSchedule() {
        return targetLevelSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTargetLevelSchedule( TargetLevelSchedule newTargetLevelSchedule,
            NotificationChain msgs ) {
        TargetLevelSchedule oldTargetLevelSchedule = targetLevelSchedule;
        targetLevelSchedule = newTargetLevelSchedule;
        boolean oldTargetLevelScheduleESet = targetLevelScheduleESet;
        targetLevelScheduleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, oldTargetLevelSchedule, newTargetLevelSchedule,
                    !oldTargetLevelScheduleESet );
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
    public void setTargetLevelSchedule( TargetLevelSchedule newTargetLevelSchedule ) {
        if( newTargetLevelSchedule != targetLevelSchedule ) {
            NotificationChain msgs = null;
            if( targetLevelSchedule != null ) msgs = ( ( InternalEObject ) targetLevelSchedule ).eInverseRemove( this,
                    CimPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, TargetLevelSchedule.class, msgs );
            if( newTargetLevelSchedule != null ) msgs = ( ( InternalEObject ) newTargetLevelSchedule )
                    .eInverseAdd( this, CimPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, TargetLevelSchedule.class, msgs );
            msgs = basicSetTargetLevelSchedule( newTargetLevelSchedule, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTargetLevelScheduleESet = targetLevelScheduleESet;
            targetLevelScheduleESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE,
                        newTargetLevelSchedule, newTargetLevelSchedule, !oldTargetLevelScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTargetLevelSchedule( NotificationChain msgs ) {
        TargetLevelSchedule oldTargetLevelSchedule = targetLevelSchedule;
        targetLevelSchedule = null;
        boolean oldTargetLevelScheduleESet = targetLevelScheduleESet;
        targetLevelScheduleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, oldTargetLevelSchedule, null,
                    oldTargetLevelScheduleESet );
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
    public void unsetTargetLevelSchedule() {
        if( targetLevelSchedule != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) targetLevelSchedule ).eInverseRemove( this,
                    CimPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, TargetLevelSchedule.class, msgs );
            msgs = basicUnsetTargetLevelSchedule( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTargetLevelScheduleESet = targetLevelScheduleESet;
            targetLevelScheduleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, null, null, oldTargetLevelScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetLevelSchedule() {
        return targetLevelScheduleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< HydroPowerPlant > getHydroPowerPlants() {
        if( hydroPowerPlants == null ) {
            hydroPowerPlants = new EObjectWithInverseResolvingEList.Unsettable< HydroPowerPlant >(
                    HydroPowerPlant.class, this, CimPackage.RESERVOIR__HYDRO_POWER_PLANTS,
                    CimPackage.HYDRO_POWER_PLANT__RESERVOIR );
        }
        return hydroPowerPlants;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHydroPowerPlants() {
        if( hydroPowerPlants != null ) ( ( InternalEList.Unsettable< ? > ) hydroPowerPlants ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroPowerPlants() {
        return hydroPowerPlants != null && ( ( InternalEList.Unsettable< ? > ) hydroPowerPlants ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Reservoir > getSpillsIntoReservoirs() {
        if( spillsIntoReservoirs == null ) {
            spillsIntoReservoirs = new EObjectWithInverseResolvingEList.Unsettable< Reservoir >( Reservoir.class, this,
                    CimPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS, CimPackage.RESERVOIR__SPILLS_FROM_RESERVOIR );
        }
        return spillsIntoReservoirs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpillsIntoReservoirs() {
        if( spillsIntoReservoirs != null ) ( ( InternalEList.Unsettable< ? > ) spillsIntoReservoirs ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpillsIntoReservoirs() {
        return spillsIntoReservoirs != null && ( ( InternalEList.Unsettable< ? > ) spillsIntoReservoirs ).isSet();
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
        case CimPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
            if( spillsFromReservoir != null ) msgs = ( ( InternalEObject ) spillsFromReservoir ).eInverseRemove( this,
                    CimPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS, Reservoir.class, msgs );
            return basicSetSpillsFromReservoir( ( Reservoir ) otherEnd, msgs );
        case CimPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUpstreamFromHydroPowerPlants() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLevelVsVolumeCurves() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.RESERVOIR__INFLOW_FORECASTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getInflowForecasts() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
            if( targetLevelSchedule != null ) msgs = ( ( InternalEObject ) targetLevelSchedule ).eInverseRemove( this,
                    CimPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, TargetLevelSchedule.class, msgs );
            return basicSetTargetLevelSchedule( ( TargetLevelSchedule ) otherEnd, msgs );
        case CimPackage.RESERVOIR__HYDRO_POWER_PLANTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getHydroPowerPlants() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSpillsIntoReservoirs() )
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
        case CimPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
            return basicUnsetSpillsFromReservoir( msgs );
        case CimPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
            return ( ( InternalEList< ? > ) getUpstreamFromHydroPowerPlants() ).basicRemove( otherEnd, msgs );
        case CimPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
            return ( ( InternalEList< ? > ) getLevelVsVolumeCurves() ).basicRemove( otherEnd, msgs );
        case CimPackage.RESERVOIR__INFLOW_FORECASTS:
            return ( ( InternalEList< ? > ) getInflowForecasts() ).basicRemove( otherEnd, msgs );
        case CimPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
            return basicUnsetTargetLevelSchedule( msgs );
        case CimPackage.RESERVOIR__HYDRO_POWER_PLANTS:
            return ( ( InternalEList< ? > ) getHydroPowerPlants() ).basicRemove( otherEnd, msgs );
        case CimPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
            return ( ( InternalEList< ? > ) getSpillsIntoReservoirs() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY:
            return getActiveStorageCapacity();
        case CimPackage.RESERVOIR__ENERGY_STORAGE_RATING:
            return getEnergyStorageRating();
        case CimPackage.RESERVOIR__FULL_SUPPLY_LEVEL:
            return getFullSupplyLevel();
        case CimPackage.RESERVOIR__GROSS_CAPACITY:
            return getGrossCapacity();
        case CimPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL:
            return getNormalMinOperateLevel();
        case CimPackage.RESERVOIR__RIVER_OUTLET_WORKS:
            return getRiverOutletWorks();
        case CimPackage.RESERVOIR__SPILL_TRAVEL_DELAY:
            return getSpillTravelDelay();
        case CimPackage.RESERVOIR__SPILLWAY_CAPACITY:
            return getSpillwayCapacity();
        case CimPackage.RESERVOIR__SPILLWAY_CREST_LENGTH:
            return getSpillwayCrestLength();
        case CimPackage.RESERVOIR__SPILLWAY_CREST_LEVEL:
            return getSpillwayCrestLevel();
        case CimPackage.RESERVOIR__SPILL_WAY_GATE_TYPE:
            return getSpillWayGateType();
        case CimPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
            return getSpillsFromReservoir();
        case CimPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
            return getUpstreamFromHydroPowerPlants();
        case CimPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
            return getLevelVsVolumeCurves();
        case CimPackage.RESERVOIR__INFLOW_FORECASTS:
            return getInflowForecasts();
        case CimPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
            if( resolve ) return getTargetLevelSchedule();
            return basicGetTargetLevelSchedule();
        case CimPackage.RESERVOIR__HYDRO_POWER_PLANTS:
            return getHydroPowerPlants();
        case CimPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
            return getSpillsIntoReservoirs();
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
        case CimPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY:
            setActiveStorageCapacity( ( Float ) newValue );
            return;
        case CimPackage.RESERVOIR__ENERGY_STORAGE_RATING:
            setEnergyStorageRating( ( Float ) newValue );
            return;
        case CimPackage.RESERVOIR__FULL_SUPPLY_LEVEL:
            setFullSupplyLevel( ( Float ) newValue );
            return;
        case CimPackage.RESERVOIR__GROSS_CAPACITY:
            setGrossCapacity( ( Float ) newValue );
            return;
        case CimPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL:
            setNormalMinOperateLevel( ( Float ) newValue );
            return;
        case CimPackage.RESERVOIR__RIVER_OUTLET_WORKS:
            setRiverOutletWorks( ( String ) newValue );
            return;
        case CimPackage.RESERVOIR__SPILL_TRAVEL_DELAY:
            setSpillTravelDelay( ( Float ) newValue );
            return;
        case CimPackage.RESERVOIR__SPILLWAY_CAPACITY:
            setSpillwayCapacity( ( Float ) newValue );
            return;
        case CimPackage.RESERVOIR__SPILLWAY_CREST_LENGTH:
            setSpillwayCrestLength( ( Float ) newValue );
            return;
        case CimPackage.RESERVOIR__SPILLWAY_CREST_LEVEL:
            setSpillwayCrestLevel( ( Float ) newValue );
            return;
        case CimPackage.RESERVOIR__SPILL_WAY_GATE_TYPE:
            setSpillWayGateType( ( String ) newValue );
            return;
        case CimPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
            setSpillsFromReservoir( ( Reservoir ) newValue );
            return;
        case CimPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
            getUpstreamFromHydroPowerPlants().clear();
            getUpstreamFromHydroPowerPlants().addAll( ( Collection< ? extends HydroPowerPlant > ) newValue );
            return;
        case CimPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
            getLevelVsVolumeCurves().clear();
            getLevelVsVolumeCurves().addAll( ( Collection< ? extends LevelVsVolumeCurve > ) newValue );
            return;
        case CimPackage.RESERVOIR__INFLOW_FORECASTS:
            getInflowForecasts().clear();
            getInflowForecasts().addAll( ( Collection< ? extends InflowForecast > ) newValue );
            return;
        case CimPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
            setTargetLevelSchedule( ( TargetLevelSchedule ) newValue );
            return;
        case CimPackage.RESERVOIR__HYDRO_POWER_PLANTS:
            getHydroPowerPlants().clear();
            getHydroPowerPlants().addAll( ( Collection< ? extends HydroPowerPlant > ) newValue );
            return;
        case CimPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
            getSpillsIntoReservoirs().clear();
            getSpillsIntoReservoirs().addAll( ( Collection< ? extends Reservoir > ) newValue );
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
        case CimPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY:
            unsetActiveStorageCapacity();
            return;
        case CimPackage.RESERVOIR__ENERGY_STORAGE_RATING:
            unsetEnergyStorageRating();
            return;
        case CimPackage.RESERVOIR__FULL_SUPPLY_LEVEL:
            unsetFullSupplyLevel();
            return;
        case CimPackage.RESERVOIR__GROSS_CAPACITY:
            unsetGrossCapacity();
            return;
        case CimPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL:
            unsetNormalMinOperateLevel();
            return;
        case CimPackage.RESERVOIR__RIVER_OUTLET_WORKS:
            unsetRiverOutletWorks();
            return;
        case CimPackage.RESERVOIR__SPILL_TRAVEL_DELAY:
            unsetSpillTravelDelay();
            return;
        case CimPackage.RESERVOIR__SPILLWAY_CAPACITY:
            unsetSpillwayCapacity();
            return;
        case CimPackage.RESERVOIR__SPILLWAY_CREST_LENGTH:
            unsetSpillwayCrestLength();
            return;
        case CimPackage.RESERVOIR__SPILLWAY_CREST_LEVEL:
            unsetSpillwayCrestLevel();
            return;
        case CimPackage.RESERVOIR__SPILL_WAY_GATE_TYPE:
            unsetSpillWayGateType();
            return;
        case CimPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
            unsetSpillsFromReservoir();
            return;
        case CimPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
            unsetUpstreamFromHydroPowerPlants();
            return;
        case CimPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
            unsetLevelVsVolumeCurves();
            return;
        case CimPackage.RESERVOIR__INFLOW_FORECASTS:
            unsetInflowForecasts();
            return;
        case CimPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
            unsetTargetLevelSchedule();
            return;
        case CimPackage.RESERVOIR__HYDRO_POWER_PLANTS:
            unsetHydroPowerPlants();
            return;
        case CimPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
            unsetSpillsIntoReservoirs();
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
        case CimPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY:
            return isSetActiveStorageCapacity();
        case CimPackage.RESERVOIR__ENERGY_STORAGE_RATING:
            return isSetEnergyStorageRating();
        case CimPackage.RESERVOIR__FULL_SUPPLY_LEVEL:
            return isSetFullSupplyLevel();
        case CimPackage.RESERVOIR__GROSS_CAPACITY:
            return isSetGrossCapacity();
        case CimPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL:
            return isSetNormalMinOperateLevel();
        case CimPackage.RESERVOIR__RIVER_OUTLET_WORKS:
            return isSetRiverOutletWorks();
        case CimPackage.RESERVOIR__SPILL_TRAVEL_DELAY:
            return isSetSpillTravelDelay();
        case CimPackage.RESERVOIR__SPILLWAY_CAPACITY:
            return isSetSpillwayCapacity();
        case CimPackage.RESERVOIR__SPILLWAY_CREST_LENGTH:
            return isSetSpillwayCrestLength();
        case CimPackage.RESERVOIR__SPILLWAY_CREST_LEVEL:
            return isSetSpillwayCrestLevel();
        case CimPackage.RESERVOIR__SPILL_WAY_GATE_TYPE:
            return isSetSpillWayGateType();
        case CimPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
            return isSetSpillsFromReservoir();
        case CimPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
            return isSetUpstreamFromHydroPowerPlants();
        case CimPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
            return isSetLevelVsVolumeCurves();
        case CimPackage.RESERVOIR__INFLOW_FORECASTS:
            return isSetInflowForecasts();
        case CimPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
            return isSetTargetLevelSchedule();
        case CimPackage.RESERVOIR__HYDRO_POWER_PLANTS:
            return isSetHydroPowerPlants();
        case CimPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
            return isSetSpillsIntoReservoirs();
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
        result.append( " (activeStorageCapacity: " );
        if( activeStorageCapacityESet )
            result.append( activeStorageCapacity );
        else
            result.append( "<unset>" );
        result.append( ", energyStorageRating: " );
        if( energyStorageRatingESet )
            result.append( energyStorageRating );
        else
            result.append( "<unset>" );
        result.append( ", fullSupplyLevel: " );
        if( fullSupplyLevelESet )
            result.append( fullSupplyLevel );
        else
            result.append( "<unset>" );
        result.append( ", grossCapacity: " );
        if( grossCapacityESet )
            result.append( grossCapacity );
        else
            result.append( "<unset>" );
        result.append( ", normalMinOperateLevel: " );
        if( normalMinOperateLevelESet )
            result.append( normalMinOperateLevel );
        else
            result.append( "<unset>" );
        result.append( ", riverOutletWorks: " );
        if( riverOutletWorksESet )
            result.append( riverOutletWorks );
        else
            result.append( "<unset>" );
        result.append( ", spillTravelDelay: " );
        if( spillTravelDelayESet )
            result.append( spillTravelDelay );
        else
            result.append( "<unset>" );
        result.append( ", spillwayCapacity: " );
        if( spillwayCapacityESet )
            result.append( spillwayCapacity );
        else
            result.append( "<unset>" );
        result.append( ", spillwayCrestLength: " );
        if( spillwayCrestLengthESet )
            result.append( spillwayCrestLength );
        else
            result.append( "<unset>" );
        result.append( ", spillwayCrestLevel: " );
        if( spillwayCrestLevelESet )
            result.append( spillwayCrestLevel );
        else
            result.append( "<unset>" );
        result.append( ", spillWayGateType: " );
        if( spillWayGateTypeESet )
            result.append( spillWayGateType );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ReservoirImpl
